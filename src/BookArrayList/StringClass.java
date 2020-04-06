package BookArrayList;

import Account.Account;

import java.util.ArrayList;
import java.util.Iterator;

public class StringClass {
    private String name = "Aniefiok Akpan";

//    This method check if a word is Palindrome..

    public boolean Palindrome(String Word) {
        StringBuilder Words = new StringBuilder(Word);
        char[] reverseWord = new char[Words.length() + 1];
        for (int i = 1; i < Words.length() + 1; i++) {
            reverseWord[i] = Words.charAt(Words.length() - i);
        }

        StringBuilder convertCharToString = new StringBuilder();
        for (char c : reverseWord) {
            convertCharToString.append(c);
        }
        return convertCharToString.toString().equals(Words.toString());
    }

    public static void main(String[] args) {
        StringClass ob1 = new StringClass();
        System.out.println(ob1.Palindrome("obo"));
        ArrayList<String> myString = new ArrayList<String>();
        myString.add("tomato");
        myString.add("egg");
        myString.add("fish");
        myString.add("oil");
        myString.add("pepper");
        System.out.println(myString);

        Iterator itr = myString.iterator();

        itr.forEachRemaining( a->{
            System.out.println(a);
        });

        while(itr.hasNext()){
            System.out.print(itr.next());
        }

        for(String index:myString){
            System.out.print(index);
        }

        Account acc1 = new Account("Aniefiok akpan",120);
        Account acc2= new Account("Aniefiok akian",120);
        Account acc3= new Account("Aniefiok akpam",120);

        ArrayList<Account> myAccount = new ArrayList<Account>();

        myAccount.add(acc1);
        myAccount.add(acc2);
        myAccount.add(acc3);

        Iterator ite = myAccount.iterator();

        while(ite.hasNext()){
            System.out.println(ite.next());
        }
    }

}
