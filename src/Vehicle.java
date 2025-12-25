public abstract class Vehicle {
    private int id;
    private  static int idGen;
    private String model;
    private int year ;
    private double basePrice ;
    //Constructor
    public Vehicle(String model, int year, double  basePrice){
        this.id = idGen++;
        setModel(model);
        setYear(year);
        setBasePrice(basePrice);

    }
    // Methods
    public int  getAge(int currentYear){
        return currentYear - year ;
    }

    public abstract double calculateInsuranceFee();

    //GETTERS
    public int getId() {
        return id;
    }
    public int getYear() {
        return year;
    }
    public double getBasePrice() {
        return basePrice;
    }
    public String getModel() {
        return model;
    }

    //SETTERS

    public void setModel(String model){
        if (model != null && !model.isEmpty())
            this.model = model;
        else
            System.out.println("Invalid model");
    }
    public void setYear(int year){
        if(year < 1900 || year > 2026){
            System.out.println("Invalid year");
        }
        else{
            this.year = year;
        }
    }
    public void setBasePrice(double price){
        if(price > 0){
            this.basePrice = price;
        }
        else {
            System.out.println("Invalid price");
        }
    }

    @Override
    public String toString() {
        return "id= " + getId() + "Model= " + getModel() + "Year= " + getYear() + "BasePrice= " + getBasePrice();
    }

}
