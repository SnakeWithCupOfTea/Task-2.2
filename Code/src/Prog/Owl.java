package Prog;

public class Owl {
    private String name;
    private int age;
    private String breed;

    public Owl(){
    }
    public void hunt() {
        System.out.println("Owl is hunting...");
    }

    public void eat() {
        System.out.println("Owl is eating...");
    }

    public void sleep() {
        System.out.println("Owl is sleeping...");
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

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }



    @Override
    public String toString() {
        return "Owl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }
}
