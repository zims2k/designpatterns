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
        textFile.setContent(new StringBuilder(textFile.getContent()).reverse().toString());
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
