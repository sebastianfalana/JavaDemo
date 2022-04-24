package ch14_oop_car;

public class Company {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Wojtek", "Kowalski", 30);

        Employee emp2 = new Employee("Zbyszek", "Jabłoński", 32);

        Employee emp3 = new Employee("Natalia", "Zyzyńska", 32);

        System.out.println("Dane pierwszego pracownika ");
        emp1.printInfo();
        System.out.println("\r\nDane drugiego pracownika ");
        emp2.printInfo();
        System.out.println("\r\nDane trzeciego pracownika ");
        emp3.printInfo();
    }
}
