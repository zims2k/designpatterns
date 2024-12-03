package at.zims2k.visitor.visitors;

import at.zims2k.visitor.fileelements.audio.AudioFile;
import at.zims2k.visitor.fileelements.image.ImageFile;
import at.zims2k.visitor.fileelements.text.TextFile;
import at.zims2k.visitor.interfaces.FileVisitor;

/**
 * Prints the file names of all visited {@link at.zims2k.visitor.interfaces.FileElement}s.
 */
public class ReverseTextFileContentVisitor implements FileVisitor {

    @Override
    public void visit(TextFile textFile) {
        String originalContent = textFile.getContent();

        StringBuilder sb = new StringBuilder();
        for (int i = originalContent.length() - 1; i >= 0; i--) {
            sb.append(originalContent.charAt(i));
        }

        String modifiedContent = sb.toString();

        textFile.setContent(modifiedContent);
    }

    @Override
    public void visit(ImageFile imageFile) {
        System.out.printf("Behavior / operation unsupported for image files (\"%s\")%n", imageFile.getName());
    }

    @Override
    public void visit(AudioFile audioFile) {
        System.out.printf("Behavior / operation unsupported for audio files (\"%s\")%n", audioFile.getName());
    }
}
