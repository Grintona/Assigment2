public class Bus extends Vehicle implements Servicable {
    private int passengerCapacity;

    public Bus(String model, int year, double price,int passengerCapacity) {
        super(model,year,price);
        this.passengerCapacity = passengerCapacity;
    }
    @Override
    public double calculateInsuranceFee() {
        int age = getAge(2026);
        return getBasePrice() * 0.1 + age * 2000;
    }
    @Override
    public String toString()
    {
        return super.toString()+" BusCapacity="+passengerCapacity;
    }

    public void performService() {
        System.out.println("Engine is checked, chairs is changed, shift gear is fixed");
    }

    public int getServiceIntervalKm() {
        return getAge(2026) * 35000;
    }
}
