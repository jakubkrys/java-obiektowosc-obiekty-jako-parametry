public class Company {

    char[] name;
    long vatNumber;
    Address address;

    Company (char[] name, long vatNumber, Address address){
        this.name = name;
        this.vatNumber = vatNumber;
        this.address = address;
    }

    void display(){
        System.out.print("Company name: ");
        for (char c : name){
            System.out.print(c);
        }
        System.out.println();
        System.out.println("VAT number: "+vatNumber);
        address.display();
    }
}
