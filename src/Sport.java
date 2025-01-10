import java.util.*;

public class Sport {
    private String name;
    private List<String> equipmentNeeded;

    public Sport(String name, String[] equipmentNeeded) {
        this.name = name;
        this.equipmentNeeded = Arrays.asList(equipmentNeeded);
    }

    public String getName() {
        return name;
    }

    public List<String> getEquipmentNeeded() {
        return equipmentNeeded;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Sport)) return false;
        Sport sport = (Sport) obj;
        return name.equals(sport.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Sport: " + name + ", Equipment: " + String.join(", ", equipmentNeeded);
    }
}
