    class Animal {}
    class Dog extends Animal {}
    class Cat extends Animal {}
    class Bird extends Animal {}
    class Fish extends Animal {}

    public class classcast {
        public static void main(String[] args) {
            Animal animal = new Dog();

            if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                System.out.println("Casting to Dog successful.");
            } else {
                System.out.println("Invalid casting, prevented!");
            }
        }




}
