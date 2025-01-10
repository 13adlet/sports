import java.util.*;

public class SportsClub {
    private String name;
    private List<Athlete> athletes;

    public SportsClub(String name) {
        this.name = name;
        this.athletes = new ArrayList<>();
    }

    public void addAthlete(Athlete athlete) {
        athletes.add(athlete);
    }

    public List<Athlete> searchAthleteByName(String name) {
        List<Athlete> result = new ArrayList<>();
        for (Athlete athlete : athletes) {
            if (athlete.getName().equalsIgnoreCase(name)) {
                result.add(athlete);
            }
        }
        return result;
    }

    public List<Athlete> filterAthletesBySport(String sportName) {
        List<Athlete> result = new ArrayList<>();
        for (Athlete athlete : athletes) {
            if (athlete.getSport().getName().equalsIgnoreCase(sportName)) {
                result.add(athlete);
            }
        }
        return result;
    }

    public void sortAthletesByAge() {
        athletes.sort(Comparator.comparingInt(Athlete::getAge));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof SportsClub)) return false;
        SportsClub club = (SportsClub) obj;
        return name.equals(club.name) && athletes.equals(club.athletes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, athletes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Sports Club: " + name + "\nAthletes:\n");
        for (Athlete athlete : athletes) {
            sb.append(athlete).append("\n");
        }
        return sb.toString();
    }
}

