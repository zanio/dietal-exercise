package carbonFootPrint;

import java.util.Date;

public abstract class CarbonFootPrintObject implements CarbonFootPrint{
    private final String name;
    private final String description;
    private final Date date;

    public CarbonFootPrintObject(String name, String description, Date date){
        this.name = name;
        this.description = description;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }


}
