abstract class MenuItem {
    abstract void prepare();
    abstract void serve();
}

class Appetizer extends MenuItem {
    @Override
    void prepare() {
        System.out.println("Appetizer is being prepared.");
    }

    @Override
    void serve() {
        System.out.println("Serving the appetizer.");
    }
}

class MainCourse extends MenuItem {
    @Override
    void prepare() {
        System.out.println("Main course is cooking.");
    }

    @Override
    void serve() {
        System.out.println("Main course is ready to serve.");
    }
}

class Beverage extends MenuItem {
    @Override
    void prepare() {
        System.out.println("Mixing the beverage.");
    }

    @Override
    void serve() {
        System.out.println("Serving the beverage.");
    }
}