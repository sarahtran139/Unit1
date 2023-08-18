public class Mars {
    public static void main(String[] args) throws InterruptedException {
        String colonyName = "SpaceX";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;
        meals = meals - (shipPopulation * 0.75);
        meals = meals - (shipPopulation * 0.75);
        System.out.println(meals);
        meals = meals + (meals * .5);
        shipPopulation = shipPopulation + 5;
        String landingLocation = "The Hill";
        if (landingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzzz landing on The Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on The Plain");
        }
        landing = landingCheck(100);
    }