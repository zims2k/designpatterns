package at.zims2k.visitor.visitors;

import at.zims2k.visitor.fileelements.audio.AudioFile;
import at.zims2k.visitor.fileelements.audio.AudioUnit;
import at.zims2k.visitor.fileelements.image.ImageFile;
import at.zims2k.visitor.fileelements.image.ImageUnit;
import at.zims2k.visitor.fileelements.text.TextFile;
import at.zims2k.visitor.interfaces.FileVisitor;
import lombok.Getter;

/**
 * Sums up the total size of all visited {@link at.zims2k.visitor.interfaces.FileElement}s.
 */
@Getter
public class SizeCalculatorVisitor implements FileVisitor {

    private int totalSize;

    @Override
    public void visit(TextFile textFile) {
        totalSize += textFile.getContent().length();
    }

    @Override
    public void visit(ImageFile imageFile) {
        for (ImageUnit ignored : imageFile.getImageUnits()) {
            int numIntegerValuesPerUnit = 3;

            totalSize += Integer.BYTES * numIntegerValuesPerUnit;
        }
    }

    @Override
    public void visit(AudioFile audioFile) {
        for (AudioUnit audioUnit : audioFile.getAudioUnits()) {
            totalSize += audioUnit.getBytes().length;
        }
    }
}
