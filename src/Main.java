public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.setBreed("Dolphin");
        fish.setWeight(50);
        System.out.println(fish);
        System.out.println();
        Cat cat = new Cat();
        cat.setName("Tom");
        cat.setAge(2);
        cat.setWeight(5);
        System.out.println(cat);
        System.out.println();
        Dog dog = new Dog();
        dog.setName("Meny");
        dog.setAge(3);
        dog.setWeight(4);
        System.out.println(dog);
        System.out.println();
        Bird bird = new Bird();
        bird.setName("Rita");
        bird.setAge(1);
        bird.setColour("blue");
        System.out.println(bird);

    }
}