public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Bark!!!");
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }
}
