package employee;

public class HourlyEmployee extends Employee {
    private double hourlyWage;
    private double hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hourlyWage,
                          double hoursWorked) {
        super(firstName, lastName, socialSecurityNumber);
        this.hourlyWageValidation(hourlyWage);
        this.hoursWorkedValidation(hoursWorked);

        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    private void hourlyWageValidation(double hourlyWage) {
        if (hourlyWage < 0.0)
            throw new IllegalArgumentException("Hourly wage figure must be greater than 0.0");
    }

    private void hoursWorkedValidation(double hoursWorked) {
        if (hoursWorked < 0.0)
            throw new IllegalArgumentException("Hoursworked value must be greater than 0.0");
    }

    public void setHourlyWage(double hourlyWage) {
    this.hourlyWageValidation(hourlyWage);
        this.hourlyWage = hourlyWage;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorkedValidation(hoursWorked);
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public double earnings() {
        double earnedValue = 0.0;
        if (hoursWorked <= 40.0)
            return earnedValue = hoursWorked * hourlyWage;
        if (hoursWorked > 40.0)
            return earnedValue = (hourlyWage * 40.0) + ((hoursWorked - 40.0) * hourlyWage);
        return earnedValue;
    }

    @Override
    public String toString() {
        return String
                .format("Salaried Employee: %s%n%s: $%,.2f%n%s: $%,.2f",
                        super.toString(), "Hourly Wage", getHourlyWage(), "Hours Worked", getHoursWorked());
    }

    @Override
    public double getPaymentAmount() {
        return this.earnings();
    }
}
