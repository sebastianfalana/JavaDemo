package Ex2_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DentistList {

    private List<Client> clients;

    public DentistList() {
        clients = new ArrayList<>();
    }


    public void addToDentalList() {

        System.out.println("Podaj imię pacjenta: ");
        String firstNamePatient = new Scanner(System.in).next();
        System.out.println("Podaj nazwisko pacjenta: ");
        String lastNamePatient = new Scanner(System.in).next();
        clients.add(clients.size(), new Client(firstNamePatient, lastNamePatient));

    }

    public void printDentalListByIndex(int index) {
        System.out.println("\nPacjent pierwszy w kolejce to: ");
        System.out.println(clients.get(index).getFirstName() + " " + clients.get(index).getFirstName());

    }

    public void printDentalList() {
        System.out.println("\nLista pacjentów: ");
        for (Client client :
                clients) {
            System.out.println(client.getFirstName() + " " + client.getLastName());
        }
    }
}
