abstract class Instrument {
    abstract void playSound();
}

class Piano extends Instrument {
    @Override
    void playSound() {
        System.out.println("Piano plays melodious tunes.");
    }
}

class Guitar extends Instrument {
    @Override
    void playSound() {
        System.out.println("Guitar strums a rhythmic chord.");
    }
}

class Violin extends Instrument {
    @Override
    void playSound() {
        System.out.println("Violin produces a soft melody.");
    }
}