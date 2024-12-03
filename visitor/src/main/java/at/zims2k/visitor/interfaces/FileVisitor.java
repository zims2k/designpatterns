package at.zims2k.visitor.interfaces;

import at.zims2k.visitor.fileelements.audio.AudioFile;
import at.zims2k.visitor.fileelements.image.ImageFile;
import at.zims2k.visitor.fileelements.text.TextFile;

public interface FileVisitor {
    void visit(TextFile textFile);

    void visit(ImageFile imageFile);

    void visit(AudioFile audioFile);
}
