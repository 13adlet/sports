public class Main {
    public static void main(String[] args) {
        // Create sports
        Sport football = new Sport("Football", new String[]{"Ball", "Goalposts"});
        Sport basketball = new Sport("Basketball", new String[]{"Ball", "Hoop"});

        // Create athletes
        Athlete athlete1 = new Athlete("John Doe", 20, football);
        Athlete athlete2 = new Athlete("Jane Smith", 22, basketball);

        // Create sports club
        SportsClub club = new SportsClub("Elite Sports Club");
        club.addAthlete(athlete1);
        club.addAthlete(athlete2);

        // Output to console
        System.out.println(club);

        // Compare athletes
        if (athlete1.getAge() > athlete2.getAge()) {
            System.out.println(athlete1.getName() + " is older than " + athlete2.getName());
        } else {
            System.out.println(athlete2.getName() + " is older than " + athlete1.getName());
        }
    }
}

