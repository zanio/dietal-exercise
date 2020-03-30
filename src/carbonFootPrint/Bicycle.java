package carbonFootPrint;


import java.util.Date;

public class Bicycle extends CarbonFootPrintObject {

    private int productionNumber;
    private String color;

    public Bicycle(String name, String description, Date date,int productionNumber, String color) {
        super(name, description, date);
        this.validateProductionNumber(productionNumber);
        this.productionNumber = productionNumber;
        this.color = color;

    }

    private void validateProductionNumber(int productionNumber){
        if(productionNumber < 0)
            throw new IllegalArgumentException("productionNumber cannot be less than 0");
    }

    public int getProductionNumber() {
        return productionNumber;
    }

    public void setProductionNumber(int productionNumber) {
        this.validateProductionNumber(productionNumber);
        this.productionNumber = productionNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getCarbonFootPrint() {
        return 0;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "productionNumber=" + getProductionNumber() +
                ", color='" + getColor() + '\'' +
                "} " + super.toString();
    }
}
