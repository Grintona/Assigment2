public class Main{
    public static void main(String[] args) {
        //First task checking
        Vehicle car = new Car("Lada Nadezhda", 1998, 20000, 4);
        Vehicle bus = new Bus("Gaz-3302", 1994, 50000, 12);
        System.out.println(car);
        System.out.println(bus);
        int currentYear = 2026;
        System.out.println("Car insurance: " + car.calculateInsuranceFee());
        System.out.println("Bus insurance: " + bus.calculateInsuranceFee());
        //Second task checking
        Servicable s = new  Car("Toyota mark 2", 1984, 50000, 2);
        Servicable b = new Bus("Mercedes-Benz _citaro",2019 , 10000000, 85);
        s.performService();
        b.performService();
        System.out.println(s.getServiceIntervalKm());
        System.out.println(b.getServiceIntervalKm());

    }
}