import java.util.ArrayList;
import java.util.List;

public class SportsClub {
    private String name;
    private List<Athlete> athletes;

    public SportsClub(String name) {
        this.name = name;
        this.athletes = new ArrayList<>();
    }

    // Add an athlete
    public void addAthlete(Athlete athlete) {
        athletes.add(athlete);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Athlete> getAthletes() {
        return athletes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Sports Club: " + name + "\nAthletes:\n");
        for (Athlete athlete : athletes) {
            sb.append(athlete.toString()).append("\n");
        }
        return sb.toString();
    }
}
