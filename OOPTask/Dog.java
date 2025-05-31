package Lesson5Task.OOPTask;

class Dog {
    String nickname;
    String category;

    Dog(String nick, String breedType) {
        nickname = nick;
        category = breedType;
    }

    void updateNickname(String newNick) {
        nickname = newNick;
    }

    void updateCategory(String newCategory) {
        category = newCategory;
    }

    String getNickname() {
        return nickname;
    }

    String getCategory() {
        return category;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Max", "Bulldog");
        Dog dog2 = new Dog("Oscar", "Beagle");

        dog1.updateNickname("Shadow");
        dog1.updateCategory("Dalmatian");

        dog2.updateNickname("Rocky");
        dog2.updateCategory("Cocker Spaniel");

        System.out.println(dog1.getNickname());
        System.out.println(dog1.getCategory());

        System.out.println(dog2.getNickname());
        System.out.println(dog2.getCategory());
    }
}
