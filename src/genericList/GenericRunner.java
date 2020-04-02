package genericList;

public class GenericRunner {

        public static void main(String[] args) {
            MyCustomList list = new MyCustomList();
            list.addElement("Element-1");
            list.addElement("Element-2");
            list.addElement("Element-3");

            MyCustomListType<String> list1 = new MyCustomListType<>();
            list1.add("Element-1");
            list1.add("Element-2");
            System.out.println(list1);

            MyCustomListType<Integer> list2 = new MyCustomListType<>();
            list2.add(Integer.valueOf(5));
            list2.add(Integer.valueOf(9));
            System.out.println(list2);        }

}
