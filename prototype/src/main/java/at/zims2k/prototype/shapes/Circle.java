package at.zims2k.prototype.shapes;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Circle extends Shape<Circle> {

    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        // System.out.printf("Drawing a circle with color %s and radius %d%n", getColor(), radius);
    }
}
