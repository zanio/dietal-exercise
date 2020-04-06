package employee;

import java.util.ArrayList;

import invoice.Invoice;

public class PayrollSystemTest {


    public static void main(String[] args) {

//        This section applies the concept of interface and abstract
        Invoice invoice1 = new Invoice("4", "Five gallon of fish and meat",
                4, 10.9);
        Invoice invoice2 = new Invoice("2", "Five litre of groundnut oil",
                2, 10.7);

        CommissionEmployee commissionEmployee1 = new CommissionEmployee("dorcas", "debby", "223-552-111",
                12, 200);
        CommissionEmployee commissionEmployee2 = new BasePlusCommissionEmployee("ajoke", "felicia", "223-552-111",
                11, 300, 50);


        System.out.println(commissionEmployee2.getClass().getSimpleName());


        processPolymorphically(invoice1, invoice2, commissionEmployee1, commissionEmployee2);

//        This section applies the concept of abstraction alone.
        SalariedEmployee salaryEmployee =
                new SalariedEmployee("Aniefiok", "Akpan", "112-332-445", 1000);

        HourlyEmployee hourlyEmployee = new HourlyEmployee("John", "Kelvin",
                "232-332-121", 10, 32);
        CommissionEmployee commissionEmployee =
                new CommissionEmployee("Faith", "Imoh", "123-453-123", 8, 30);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Timothy", "Umoh", "230-111-321",
                12, 30, 300);


        ArrayList<Employee> employees = getEmployeesAndProcessPolymorphic(salaryEmployee, hourlyEmployee, commissionEmployee, basePlusCommissionEmployee);

//        Determine the type of relationship that exist for classes in ArrayList of employee
        for (int typeCounter = 0; typeCounter < employees.size(); typeCounter++) {
            System.out.printf("Employee %d is a %s%n", typeCounter, employees.get(typeCounter).getClass().getName());
        }


    }

    private static ArrayList<Employee> getEmployeesAndProcessPolymorphic(SalariedEmployee salaryEmployee, HourlyEmployee hourlyEmployee, CommissionEmployee commissionEmployee, BasePlusCommissionEmployee basePlusCommissionEmployee) {
        System.out.println("\nEmployee processed individually:");

        System.out.printf("%n%s%n%s:  $%,.2f%n%n", salaryEmployee, "Earned", salaryEmployee.earnings());
        System.out.printf("%n%s%n%s:  $%,.2f%n%n", hourlyEmployee, "Earned", hourlyEmployee.earnings());
        System.out.printf("%n%s%n%s:  $%,.2f%n%n", commissionEmployee, "Earned", commissionEmployee.earnings());
        System.out.printf("%n%s%n%s:  $%,.2f%n%n", basePlusCommissionEmployee, "Earned", basePlusCommissionEmployee.earnings());

        System.out.println("\nEmployee Processed polymorphically\n");

        ArrayList<Employee> employees = new ArrayList<Employee>();

        employees.add(salaryEmployee);
        employees.add(hourlyEmployee);
        employees.add(commissionEmployee);
        employees.add(basePlusCommissionEmployee);

//        Use the instanceof during polymorphism to work with specifics values

        for (Employee currentEmployee : employees) {
            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf("New base salary with 10%% increase: $%,.2f%n", employee.getBaseSalary());
            }
            System.out.printf("%s $%,.2f%n", "Earned", currentEmployee.earnings());

        }
        return employees;
    }

    private static void processPolymorphically(Invoice invoice1, Invoice invoice2, CommissionEmployee commissionEmployee1, CommissionEmployee commissionEmployee2) {
        Payable[] payableObject = new Payable[4];
        payableObject[0] = invoice1;
        payableObject[1] = invoice2;
        payableObject[2] = commissionEmployee1;
        payableObject[3] = commissionEmployee2;

        System.out.println("\n\nProcess Invoice and Employee polymorphically");

        for (Payable currentPayable : payableObject) {
            System.out.printf("%n%s %n%s: $%,.2f%n", currentPayable.toString(),
                    "Payment due", currentPayable.getPaymentAmount());
            if (currentPayable instanceof Invoice) {
                Invoice invoice = (Invoice) currentPayable;
                System.out.printf("%n%n%s:%n%s  $%,.2f%n%s:%s", "Invoice", "Amount Payable", invoice.getPaymentAmount(),
                        "class name", invoice.getClass().getName());
            }
        }
    }
}
