package employee;

public class CommissionEmployee extends Employee {

    private double commissionRate;
    private double grossSale;


    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate,
                              double grossSale) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSaleValidation(grossSale);
        this.commissionRateValidation(commissionRate);

        this.commissionRate = commissionRate;
        this.grossSale = grossSale;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    private void commissionRateValidation(double commissionRate) {
        if (commissionRate < 0.0)
            throw new IllegalArgumentException("Commission rate can only be a value greater than 0.0");
    }

    private void grossSaleValidation(double grossSale) {
        if (grossSale < 0.0)
            throw new IllegalArgumentException("Gross sale can only be a value greater than 0");
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRateValidation(commissionRate);
        this.commissionRate = commissionRate;
    }

    public void setGrossSale(double grossSale) {
        this.grossSaleValidation(grossSale);
        this.grossSale = grossSale;
    }

    @Override
    public double earnings() {
        return commissionRate * grossSale;
    }

    @Override
    public String toString() {
        return String
                .format("Salaried Employee: %s%n%s: %,.2f %n%s: $%,.2f",
                        super.toString(), "commission rate", getCommissionRate(), "Gross sale", getGrossSale());
    }

    @Override
    public double getPaymentAmount() {
        return this.earnings();
    }
}
