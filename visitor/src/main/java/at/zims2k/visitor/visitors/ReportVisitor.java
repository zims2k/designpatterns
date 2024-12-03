package at.zims2k.visitor.visitors;

import at.zims2k.visitor.fileelements.audio.AudioFile;
import at.zims2k.visitor.fileelements.image.ImageFile;
import at.zims2k.visitor.fileelements.text.TextFile;
import at.zims2k.visitor.interfaces.FileVisitor;

/**
 * Prints the file names of all visited {@link at.zims2k.visitor.interfaces.FileElement}s.
 */
public class ReportVisitor implements FileVisitor {

    @Override
    public void visit(TextFile textFile) {
        System.out.printf("Text file name:  %s%n", textFile.getName());
    }

    @Override
    public void visit(ImageFile imageFile) {
        System.out.printf("Image file name: %s%n", imageFile.getName());
    }

    @Override
    public void visit(AudioFile audioFile) {
        System.out.printf("Audio file name: %s%n", audioFile.getName());
    }
}
