package at.zims2k.visitor;

import at.zims2k.visitor.fileelements.text.TextFile;
import at.zims2k.visitor.interfaces.FileElement;
import at.zims2k.visitor.interfaces.FileVisitor;
import at.zims2k.visitor.visitors.ReportVisitor;
import at.zims2k.visitor.visitors.ReverseTextFileContentVisitor;
import at.zims2k.visitor.visitors.SizeCalculatorVisitor;

import java.util.List;

/**
 * <p>
 * Demonstrates the visitor pattern by letting different visitors visit various {@link FileElement}s,
 * which are created in a utility class, in order to keep code clean here.
 * </p>
 * <p>
 * If another behavior is wanted to be introduced for {@link FileElement}s, it is not necessary to modify the
 * concrete {@link FileElement} classes. Instead, a new concrete visitor implementation (in this case:
 * {@link FileVisitor} implementor) is implemented, which introduces the new behavior (because all
 * {@link FileElement}s can accept any {@link FileVisitor}).
 * </p>
 * <p>
 * As a starting point, try to implement a visitor that performs ROT-13 on the text file contents. Take
 * {@link ReverseTextFileContentVisitor} as a starting point. For ROT-13, see:
 * <a href="https://de.wikipedia.org/wiki/ROT13">ROT13</a>
 * </p>
 */
public class Main {
    public static void main(String[] args) {
        List<FileElement> fileElements = Util.getFileElements();

        SizeCalculatorVisitor sizeCalculatorVisitorSum = new SizeCalculatorVisitor();
        SizeCalculatorVisitor sizeCalculatorVisitorForTextFiles = new SizeCalculatorVisitor();

        ReportVisitor reportVisitor = new ReportVisitor();
        ReportVisitor reportVisitorForTextFiles = new ReportVisitor();

        System.out.println();
        System.out.println("============================================================");
        System.out.println("Visiting ALL files:");
        System.out.println("============================================================");
        System.out.println();

        visitElements(fileElements, sizeCalculatorVisitorSum);
        visitElements(fileElements, reportVisitor);

        System.out.printf("Total size of all files: %d bytes%n", sizeCalculatorVisitorSum.getTotalSize());

        System.out.println();
        System.out.println("============================================================");
        System.out.println("Visiting only text files:");
        System.out.println("============================================================");
        System.out.println();

        visitTextFilesOnly(fileElements, sizeCalculatorVisitorForTextFiles);
        visitTextFilesOnly(fileElements, reportVisitorForTextFiles);

        System.out.printf("Total size of all text files: %d bytes%n", sizeCalculatorVisitorForTextFiles.getTotalSize());

        System.out.println();
        System.out.println("============================================================");
        System.out.println("Visiting ALL files with the ReverseTextFileContentVisitor:");
        System.out.println("============================================================");
        System.out.println();

        ReverseTextFileContentVisitor reverseTextFileContentVisitor = new ReverseTextFileContentVisitor();

        System.out.println("Contents before:");
        Util.printTextFileContents(fileElements);

        visitElements(fileElements, reverseTextFileContentVisitor);

        System.out.println("Contents after:");
        Util.printTextFileContents(fileElements);

    }

    private static void visitElements(List<FileElement> fileElements, FileVisitor visitor) {
        fileElements.forEach(fileElement -> fileElement.accept(visitor));
    }

    private static void visitTextFilesOnly(List<FileElement> fileElements, FileVisitor visitor) {
        fileElements.forEach(fileElement -> {
            if (fileElement instanceof TextFile) {
                fileElement.accept(visitor);
            }
        });
    }
}
