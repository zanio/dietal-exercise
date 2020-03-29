package employee;

public class CommissionEmployee extends Employee {

    private double commissionRate;
    private double grossSale;


    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate,
                              double grossSale) {
        super(firstName, lastName, socialSecurityNumber);
        if (commissionRate < 0.0)
            throw new IllegalArgumentException("Commission rate can only be a value greater than 0.0");
        if (grossSale < 0.0)
            throw new IllegalArgumentException("Gross sale can only be a value greater than 0");
        this.commissionRate = commissionRate;
        this.grossSale = grossSale;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate < 0.0)
            throw new IllegalArgumentException("Commission rate can only be a value greater than 0.0");
        this.commissionRate = commissionRate;
    }

    public void setGrossSale(double grossSale) {
        if (grossSale < 0.0)
            throw new IllegalArgumentException("Gross sale value can only be a value greater or equal to one");
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
                        super.toString(),"commission rate",getCommissionRate(),"Gross sale",getGrossSale());
    }
}
