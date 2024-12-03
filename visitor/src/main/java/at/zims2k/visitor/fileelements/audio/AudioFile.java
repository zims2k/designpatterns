package at.zims2k.visitor.fileelements.audio;

import at.zims2k.visitor.interfaces.FileElement;
import at.zims2k.visitor.interfaces.FileVisitor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class AudioFile implements FileElement {

    private final String name;
    private final AudioUnit[] audioUnits;

    @Override
    public void accept(FileVisitor fileVisitor) {
        fileVisitor.visit(this);
    }
}
