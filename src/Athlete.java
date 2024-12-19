public class Athlete {
    private String name;
    private int age;
    private Sport sport;

    public Athlete(String name, int age, Sport sport) {
        this.name = name;
        this.age = age;
        this.sport = sport;
    }

    // Getters and Setters
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

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    @Override
    public String toString() {
        return "Athlete: " + name + ", Age: " + age + ", Sport: " + sport.getName();
    }
}
