abstract class TransformableShape {
    abstract void resize(double factor);
    abstract void rotate(int degrees);
}

class Circle extends TransformableShape {
    @Override
    void resize(double factor) {
        System.out.println("Resizing circle by factor of " + factor);
    }

    @Override
    void rotate(int degrees) {
        System.out.println("Rotating circle by " + degrees + " degrees.");
    }
}

class Square extends TransformableShape {
    @Override
    void resize(double factor) {
        System.out.println("Resizing square by factor of " + factor);
    }

    @Override
    void rotate(int degrees) {
        System.out.println("Rotating square by " + degrees + " degrees.");
    }
}

class Triangle extends TransformableShape {
    @Override
    void resize(double factor) {
        System.out.println("Resizing triangle by factor of " + factor);
    }

    @Override
    void rotate(int degrees) {
        System.out.println("Rotating triangle by " + degrees + " degrees.");
    }
}