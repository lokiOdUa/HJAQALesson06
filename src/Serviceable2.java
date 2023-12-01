public interface Serviceable2 {
    boolean loud = true;
    double weight = 0;

    void serve(String command);
    default void serve2(String command) {
        System.out.println("Serve22: " + command);
    };
}
