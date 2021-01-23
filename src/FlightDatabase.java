public class FlightDatabase {

    Flight[] flights;

    FlightDatabase (int size){
        flights = new Flight[size];
    }

    int n = 0;
    void add(Flight flight){
        flights[n] = flight;
        n++;
    }

    void displayALL(){
        for (int i = 0; i < flights.length && flights[i] != null; i++){
            System.out.println("----------");
            flights[i].display();
            System.out.println("----------");
        }
    }
}
