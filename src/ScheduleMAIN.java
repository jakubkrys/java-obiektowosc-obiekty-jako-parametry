public class ScheduleMAIN {

    public static void main(String[] args) {

        FlightDatabase flightDatabase = new FlightDatabase(500);

        char[] boeing = {'B','o','e','i','n','g'};
        char[] airbus = {'A','i','r','b','u','s'};

        Airplane a1 = new Airplane(airbus,380);
        Airplane a2 = new Airplane(boeing,787);
        Airplane a3 = new Airplane(boeing,767);
        Airplane a4 = new Airplane(airbus,320);
        Flight f1 = new Flight(12,18,a1);
        Flight f2 = new Flight(20,3,a2);
        Flight f3 = new Flight(22,10,a3);
        Flight f4 = new Flight(15,23,a4);

        flightDatabase.add(f1);
        flightDatabase.add(f2);
        flightDatabase.add(f3);
        flightDatabase.add(f4);

        flightDatabase.displayALL();


    }
}
