public class Sport {
    private String name;
    private String[] equipmentNeeded;

    public Sport(String name, String[] equipmentNeeded) {
        this.name = name;
        this.equipmentNeeded = equipmentNeeded;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getEquipmentNeeded() {
        return equipmentNeeded;
    }

    public void setEquipmentNeeded(String[] equipmentNeeded) {
        this.equipmentNeeded = equipmentNeeded;
    }

    @Override
    public String toString() {
        return "Sport: " + name + ", Equipment: " + String.join(", ", equipmentNeeded);
    }
}
