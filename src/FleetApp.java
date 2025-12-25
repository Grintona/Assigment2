import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FleetApp {
    private List<Vehicle> V = new ArrayList<>();
    private Scanner s = new Scanner(System.in);

    public void run() {
        int choice = 10;
        while (choice != 7) {
            printMenu();
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    printAllVehicles();
                    break;
                case 2:
                    addNewCar();
                    break;
                case 3:
                    addNewBus();
                    break;
                case 4:
                    showTotalYearlyInsuranceFees();
                    break;
                case 5:
                    showVehiclesOlderThanNYears();
                    break;
                case 6:
                    performServiceForAllVehicles();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Write again");
            }
        }
    }

    private void printMenu() {
        System.out.println("**********************************************");
        System.out.println("Fleet Management System");
        System.out.println("1. Print all vehicles");
        System.out.println("2. Add new car");
        System.out.println("3. Add new bus");
        System.out.println("4. Show total yearly insurance fees");
        System.out.println("5. Show vehicles older than N years");
        System.out.println("6. Perform service for all vehicles");
        System.out.println("7. Quit");
        System.out.println("**********************************************");
    }

    private void printAllVehicles() {
        if (V.isEmpty()) {
            System.out.println("No vehicles in the fleet");
        } else {
            for (Vehicle v : V) {
                System.out.println(v);
            }
        }
    }

    private void addNewCar() {
        s.nextLine();
        System.out.println("Enter model name");
        String model = s.nextLine();
        System.out.println("Enter year");
        int year = s.nextInt();
        System.out.println("Enter price");
        double price = s.nextDouble();
        System.out.println("Enter number of doors");
        int doors = s.nextInt();
        Vehicle car = new Car(model, year,  price, doors);
        V.add(car);
    }

    private void addNewBus() {
        s.nextLine();
        System.out.println("Enter model name");
        String model = s.nextLine();
        System.out.println("Enter year");
        int year = s.nextInt();
        System.out.println("Enter price");
        double price = s.nextDouble();
        System.out.println("Enter passenger capability");
        int passenger = s.nextInt();
        Vehicle bus = new Bus(model, year, price, passenger);
        V.add(bus);
    }
    private void showTotalYearlyInsuranceFees(){
        double totalFee = 0;
        for (Vehicle v : V) {
            double fee = v.calculateInsuranceFee();
            totalFee += fee;
        }
        System.out.println("Total insurance fees: " + totalFee);
    }

    private void showVehiclesOlderThanNYears() {
        s.nextLine();
        System.out.println("Enter current year:");
        int currentYear = s.nextInt();
        System.out.println("Enter N");
        int N = s.nextInt();
        boolean found = false;
        for (Vehicle v : V) {
            if (N < v.getAge(currentYear)) {
                System.out.println(v);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No vehicles older than N years");
        }
    }

    private void performServiceForAllVehicles(){
        for (Vehicle v : V) {
            if(v instanceof Servicable){
                Servicable s = (Servicable) v;
                s.performService();
            }
        }
    }
}
