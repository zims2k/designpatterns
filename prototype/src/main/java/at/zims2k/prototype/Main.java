package at.zims2k.prototype;

import at.zims2k.prototype.shapes.Circle;
import at.zims2k.prototype.shapes.Rectangle;
import at.zims2k.prototype.shapes.Shape;

/**
 * Demonstrates copying from a prototype against instantiating an object. For simplicity and test purpose,
 * instantiation time is artificially set to 1ms-3ms. See {@link Shape} constructor.
 */
public class Main {

    private static final int TEST_ITERATIONS = 10000;

    public static void main(String[] args) {
        int testIterations = TEST_ITERATIONS;

        if (args.length > 0) {
            try {
                testIterations = Integer.parseInt(args[0]);
            } catch (NumberFormatException ignored) {
            }
        }

        Rectangle rectangle = new Rectangle("red", 100, 200);
        Circle circle = new Circle("blue", 50);

        long t1 = System.currentTimeMillis();
        for (int i = 0; i < testIterations; i++) {
            Rectangle rectangleClone = rectangle.clone();
            rectangleClone.setColor("newColor%d".formatted(i));
            rectangleClone.setWidth(50 + i);
            rectangleClone.setHeight(100 + i);
            rectangleClone.draw();

            Circle circleClone = circle.clone();
            circleClone.setColor("newColor%d".formatted(i));
            circleClone.setRadius(25 + i);
            circleClone.draw();
        }
        long t2 = System.currentTimeMillis();

        for (int i = 0; i < testIterations; i++) {
            Rectangle rectangleInstance = new Rectangle("newColor%d".formatted(i), 50 + i, 100 + i);
            rectangleInstance.draw();

            Circle circleInstance = new Circle("newColor%d".formatted(i), 25 + i);
            circleInstance.draw();
        }
        long t3 = System.currentTimeMillis();

        long cloneTime = t2 - t1;
        long instTime = t3 - t2;
        System.out.printf("Time for clone operations (means in a simplification: implementing the Prototype pattern):%n" +
                "  %d ms%n" +
                "  %dms per test iteration with a total of %d iterations", cloneTime, cloneTime / testIterations, testIterations);
        System.out.println();
        System.out.println();
        System.out.printf("Time for instantiation operations:%n" +
                "  %d ms%n" +
                "  %dms per test iteration with a total of %d iterations", instTime, instTime / testIterations, testIterations);
    }
}
