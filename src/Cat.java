public class Cat extends Animal implements Serviceable {
    @Override
    public void sound() {
        System.out.println("Meow...");
    }

    @Override
    public void serve(String command) {

    }
}
