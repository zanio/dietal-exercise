package carbonFootPrint;

import java.util.Date;

public class Car extends CarbonFootPrintObject {
    public Car(String name, String description, Date date) {
        super(name, description, date);
    }

    @Override
    public double getCarbonFootPrint() {
        return 0;
    }
}
