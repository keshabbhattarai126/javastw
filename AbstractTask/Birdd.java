abstract class Bird {
    abstract void fly();
}

class Eagle extends Bird {
    public void fly() {
        System.out.println("Eagle");
    }
}

class Penguin extends Bird {
    public void fly() {
        System.out.println("Penguin");
    }
}

public class Birdd {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird penguin = new Penguin();
        eagle.fly();
        penguin.fly();
    }
}
