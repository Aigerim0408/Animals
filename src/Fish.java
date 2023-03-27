public class Fish {
    private String breed;
    private int weight;
    public Fish() {

    }

    public Fish(String breed, int weight) {
        this.breed = breed;
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fish: " +"\n"+
                "breed: " + breed + "\n" +
                "weight: " + weight + " kg";
    }
}
