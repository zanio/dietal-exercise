package BookArrayList;

import jdk.jfr.Percentage;

import java.util.Date;

public class BooksArrayList extends StringClass {

    private String name;
    private String title;
    private Date date;

    public BooksArrayList(String name, String title, Date date) {
        if(name.length() > 1)
            this.name = name;
            this.title = title;
            this.date = date;
        assert this.name != null;
        System.out.println(super.Palindrome(this.name));
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public boolean Palindrome(String Word){
        System.out.println("This method has been succesfully overiden"+Word);
        return true;
    }

}
