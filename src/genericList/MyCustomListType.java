package genericList;

import java.util.ArrayList;

public class MyCustomListType<T> {
    ArrayList<T> list = new ArrayList<>();

    public void  add(T element){
        list.add(element);
    }
    public void remove(T element){
        list.remove(element);
    }
    @Override
    public String toString() {
        return list.toString();
    }
    public MyCustomListType<String> getAll(int index){
        return (MyCustomListType<String>) list.get(index);
    }
}
