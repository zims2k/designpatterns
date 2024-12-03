package at.zims2k.visitor.fileelements.image;

import at.zims2k.visitor.interfaces.FileElement;
import at.zims2k.visitor.interfaces.FileVisitor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class ImageFile implements FileElement {

    private final String name;
    private final ImageUnit[] imageUnits;

    @Override
    public void accept(FileVisitor fileVisitor) {
        fileVisitor.visit(this);
    }
}
