package carbonFootPrint;

import java.util.Date;

public class Building extends CarbonFootPrintObject {

    public Building(String name, String description, Date date) {
        super(name, description, date);
    }

    @Override
    public double getCarbonFootPrint() {
        return 0;
    }
}
