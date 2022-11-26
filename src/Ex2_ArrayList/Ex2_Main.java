package Ex2_ArrayList;

public class Ex2_Main {

    public static void main(String[] args) {

        DentistList dentistList = new DentistList();
        dentistList.addToDentalList();
        dentistList.addToDentalList();
        dentistList.addToDentalList();

        dentistList.printDentalListByIndex(0);

        dentistList.printDentalList();


//        List<String> dentalClientList = new ArrayList<>();
//        dentalClientList.add("Jan Brzechwa");
//        dentalClientList.add("Barbara Nawalna");
//        dentalClientList.add("Jan Kocim");
//
//        System.out.println(dentalClientList.get(0));


    }
}
