package at.zims2k.prototype.shapes;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rectangle extends Shape<Rectangle> {

    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        // System.out.printf("Drawing a rectangle with color %s, width %d and height %d%n", getColor(), width, height);
    }
}
