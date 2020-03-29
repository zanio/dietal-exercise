package employee;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                      double commissionRate, double grossSale, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, commissionRate, grossSale);
        this.baseSalaryValidation(baseSalary);
        this.baseSalary = baseSalary;
    }

    private void baseSalaryValidation(double baseSalary) {
        if (baseSalary < 0.0)
            throw new IllegalArgumentException("baseSalary can not be less than 1");
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalaryValidation(baseSalary);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double earnings() {
        return super.earnings() + baseSalary;
    }

    @Override
    public String toString() {
        return String
                .format("Salaried Employee: %s%n%s: $%,.2f%n",
                        super.toString(), "Base Salary", getBaseSalary());
    }
}
