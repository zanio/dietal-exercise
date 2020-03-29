package invoice;

import employee.Payable;

public class Invoice implements Payable {

    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription,int quantity,double pricePerItem){
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantityValidation(quantity);
        this.pricePerItemValidation(pricePerItem);
        this.pricePerItem = pricePerItem;
        this.quantity = quantity;
    }

    private void quantityValidation(int quantity){
        if(quantity < 0)
            throw new IllegalArgumentException("quantity can only be positive value starting from one");
    }

    private void pricePerItemValidation(double pricePerItem){
        if(pricePerItem < 0.0)
            throw new IllegalArgumentException("pricePerItem can only be positive values from 0.0 and above");
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItemValidation(pricePerItem);
        this.pricePerItem = pricePerItem;
    }

    public void setQuantity(int quantity) {
        this.pricePerItemValidation(quantity);
        this.quantity = quantity;
    }

    @Override
    public double getPaymentAmount() {
        return getQuantity() * getPricePerItem();
    }

    @Override
    public String toString() {
        return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f","invoice", "part number",getPartNumber(),
                getPartDescription(),"quantity",getQuantity(),"price per item",getPricePerItem());
    }
}
