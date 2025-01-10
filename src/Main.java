public class Main {
    public static void main(String[] args) {
        Sport football = new Sport("Football", new String[]{"Ball", "Goalposts"});
        Sport basketball = new Sport("Basketball", new String[]{"Ball", "Hoop"});

        Athlete athlete1 = new Athlete("John Doe", 20, football);
        Athlete athlete2 = new Athlete("Jane Smith", 22, basketball);
        Athlete athlete3 = new Athlete("Alice Brown", 19, football);

        SportsClub club = new SportsClub("Elite Sports Club");
        club.addAthlete(athlete1);
        club.addAthlete(athlete2);
        club.addAthlete(athlete3);

        System.out.println("\nAll Athletes:");
        System.out.println(club);

        System.out.println("\nFiltered Athletes (Football):");
        System.out.println(club.filterAthletesBySport("Football"));

        System.out.println("\nSorting Athletes by Age:");
        club.sortAthletesByAge();
        System.out.println(club);
    }
}

