public class CompanyRepo {
    Company[] companies;
    int iterator = 0;
    long vatSearch;

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

    Company search(long vatNumber){
        Company findedCompany = null;
        for (int i = 0; i < companies.length && companies[i] != null; i++){
            if(companies[i].vatNumber == vatNumber){
                findedCompany = companies[i];
            }
        }
        return findedCompany;
    }
}
