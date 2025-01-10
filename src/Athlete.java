import java.util.Objects;

public class Athlete {
    private String name;
    private int age;
    private Sport sport;

    public Athlete(String name, int age, Sport sport) {
        this.name = name;
        this.age = age;
        this.sport = sport;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Sport getSport() {
        return sport;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Athlete)) return false;
        Athlete athlete = (Athlete) obj;
        return age == athlete.age && name.equals(athlete.name) && sport.equals(athlete.sport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sport);
    }

    @Override
    public String toString() {
        return "Athlete: " + name + ", Age: " + age + ", Sport: " + sport.getName();
    }
}

