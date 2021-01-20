public class CompanyRepo {
    Company[] companies;
    int iterator = 0;

    CompanyRepo (int size){
        companies = new Company[size];
    }

    void add(Company company){
        companies[iterator] = company;
        iterator++;
    }

    void displayAll(){
        for (int i = 0; i < companies.length && companies[i] != null; i++) {
            companies[i].display();
            System.out.println();
        }
    }
}
