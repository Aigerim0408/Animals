public class Bird {
    private String name;
    private int age;
    private String colour;
    public Bird(){

    }

    public Bird(String name, int age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Bird: " + "\n" +
                "name: " + name + "\n" +
                "age: " + age +"\n"+
                "colour: " + colour;
    }
}
