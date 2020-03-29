package employee;

import java.util.ArrayList;

public class PayrollSystemTest {
    public static void main(String[] args) {
        SalariedEmployee salaryEmployee =
                new SalariedEmployee("Aniefiok", "Akpan", "112-332-445", 1000);

        HourlyEmployee hourlyEmployee = new HourlyEmployee("John", "Kelvin",
                "232-332-121", 10, 32);
        CommissionEmployee commissionEmployee =
                new CommissionEmployee("Faith", "Imoh", "123-453-123", 8, 30);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Timothy", "Umoh", "230-111-321",
                12, 30, 300);


        System.out.println("\nEmployee processed individually:");

        System.out.printf("%n%s%n%s:  $%,.2f%n%n",salaryEmployee,"Earned",salaryEmployee.earnings());
        System.out.printf("%n%s%n%s:  $%,.2f%n%n",hourlyEmployee,"Earned",hourlyEmployee.earnings());
        System.out.printf("%n%s%n%s:  $%,.2f%n%n",commissionEmployee,"Earned",commissionEmployee.earnings());
        System.out.printf("%n%s%n%s:  $%,.2f%n%n",basePlusCommissionEmployee,"Earned",basePlusCommissionEmployee.earnings());

        System.out.println("\nEmployee Processed polymorphically\n");

        ArrayList<Employee> employees = new ArrayList<Employee>();

        employees.add(salaryEmployee);
        employees.add(hourlyEmployee);
        employees.add(commissionEmployee);
        employees.add(basePlusCommissionEmployee);

//        Use the instanceof during polymorphism to work with specifics values

        for (Employee currentEmployee : employees) {
            if(currentEmployee instanceof BasePlusCommissionEmployee){
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf("New base salary with 10%% increase: $%,.2f%n", employee.getBaseSalary());
            }
            System.out.printf("%s $%,.2f%n","Earned",currentEmployee.earnings());

        }

//        Determine the type of relationship that exist for classes in ArrayList of employee
        for(int typeCounter =0; typeCounter < employees.size();typeCounter++){
            System.out.printf("Employee %d is a %s%n", typeCounter, employees.get(typeCounter).getClass().getName());
        }




    }
}
