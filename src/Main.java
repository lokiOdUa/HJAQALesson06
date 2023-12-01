public class Main {
    public static void main(String[] args) {
        var animal = new Animal() {
            @Override
            public void sound() {
                System.out.println("Bebebe");
            }
        };
        animal.sound();

        var shepard = new Shepard();
        shepard.serve("Cmd1");
        shepard.serve2("Cmd2");
    }
}
