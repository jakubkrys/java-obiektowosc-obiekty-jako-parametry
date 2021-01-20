public class CompanyRepoMAIN {

    public static void main(String[] args) {

        int n = 3;
        CompanyRepo companyRepo = new CompanyRepo (n);

        char[] lufthansa = {'L','u','f','t','h','a','n','s','a'};
        char[] ryanair = {'R','y','a','n','a','i','r'};
        char[] wizzair = {'W','i','z','z','a','i','r'};
        char[] szara = {'S','z','a','r','a'};
        char[] polna = {'P','o','l','n','a'};
        char[] szybka = {'S','z','y','b','k','a'};

        Address l_Address = new Address(szara,22,15);
        Company c1 = new Company(lufthansa,5260003819L,l_Address);

        Address r_Address = new Address(polna,2,435);
        Company c2 = new Company(ryanair,5213788049L,r_Address);

        Address w_Address = new Address(szybka,56,3);
        Company c3 = new Company(wizzair,1070000388,w_Address);

        companyRepo.add(c1);
        companyRepo.add(c2);
        companyRepo.add(c3);

        // companyRepo.displayAll();

        Company company = companyRepo.search(5213788049L);
        company.display();
    }
}
