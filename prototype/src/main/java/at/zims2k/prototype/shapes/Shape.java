package at.zims2k.prototype.shapes;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Shape<T extends Shape<T>> implements Cloneable {
    private String color;

    public Shape(String color) {
        try {
            // Pretending a creation time of 1 millisecond (yields to about 3ms in practice)
            Thread.sleep(1);
        } catch (InterruptedException ignored) {
        }

        this.color = color;
    }

    public abstract void draw();

    @SuppressWarnings("unchecked")
    @Override
    public T clone() {
        try {
            return (T) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
