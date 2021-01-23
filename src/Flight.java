public class Flight {

    int departure;
    int arrival;
    Airplane airplane;

    Flight (int departure, int arrival, Airplane airplane){
        this.departure = departure;
        this.arrival = arrival;
        this.airplane = airplane;
    }

    void display(){
        System.out.println("Departure time: "+departure);
        System.out.println("Arrival time: "+arrival);
        airplane.display();
        System.out.println();
    }
}
