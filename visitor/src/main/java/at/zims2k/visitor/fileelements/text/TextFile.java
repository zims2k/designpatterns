package at.zims2k.visitor.fileelements.text;

import at.zims2k.visitor.interfaces.FileElement;
import at.zims2k.visitor.interfaces.FileVisitor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class TextFile implements FileElement {

    private String name;
    private String content;

    @Override
    public void accept(FileVisitor fileVisitor) {
        fileVisitor.visit(this);
    }
}
