public class Car extends Vehicle implements Servicable {
    private int numberOfDoors;
    public Car(String model, int year, double price, int numberOfDoors) {
        super(model,year,price);
        this.numberOfDoors = numberOfDoors;
    }
    @Override
    public double calculateInsuranceFee() {
        int age = getAge(2026);
        return getBasePrice() * 0.05 + age * 1000;
    }
    @Override
    public String toString()
    {
        return super.toString() + "numberOfDoors=" + numberOfDoors + "\n" + "********";
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void performService() {
        System.out.println("Engine is changed , turbo is connected, nitro is added");
    }

    public int getServiceIntervalKm() {
        return getAge(2026) * 15000;
    }
}
