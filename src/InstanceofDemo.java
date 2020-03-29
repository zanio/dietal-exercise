import java.util.Scanner;

class InstanceofDemo {
    public static void main(String[] args) {

        Parent obj1 = new Parent();
        Parent obj2 = new Child();
        Scanner obj3 = new Scanner(System.in);

        System.out.println("obj1 instanceof Parent: "
            + (obj1 instanceof Parent));
        System.out.println("obj1 instanceof Child: "
            + (obj1 instanceof Child));
        System.out.println("obj1 instanceof MyInterface: "
            + (obj1 instanceof MyInterface));
        System.out.println("obj2 instanceof Parent: "
            + (obj2 instanceof Parent));
        System.out.println("obj2 instanceof Child: "
            + (obj2 instanceof Child));
        System.out.println("obj2 instanceof MyInterface: "
            + (obj2 instanceof MyInterface));
        System.out.println("obj3 instanceof Scanner: "
            + (obj3 instanceof Scanner));

            obj3.close();
    }
}

class Parent {
    
}
class Child extends Parent implements MyInterface {

}
interface MyInterface {}