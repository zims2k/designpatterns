package at.zims2k.visitor.interfaces;

public interface FileElement {
    void accept(FileVisitor fileVisitor);
}
