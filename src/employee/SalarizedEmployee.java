package employee;

public class SalarizedEmployee extends Employee {
    private double weeklySalary;
    public SalarizedEmployee(String firstName, String lastName, String socialSecurityNumber,double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        if(weeklySalary < 0.0)
            throw new IllegalArgumentException("Weekly salary must be greater than 0.0");
        this.weeklySalary = weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if(weeklySalary < 0.0)
            throw new IllegalArgumentException("Weekly salary must be greater than 0.0");
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    @Override
    public double earnings() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return String
                .format("Salaried Employee: %s%n%s: $%,.2f",super.toString(),"Weekly salary",getWeeklySalary());
    }
}
