public class Airplane {

    int index;
    char[] manufacturer;

    Airplane (char[] manufacturer, int index){
        this.manufacturer = manufacturer;
        this.index = index;
    }

    void display(){
        System.out.print("Airplane: ");
        for (char m : manufacturer) {
            System.out.print(m);
        }
        System.out.print(" "+index);
    }
}
