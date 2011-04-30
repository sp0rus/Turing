/*
 * Name:          lltest.java
 * Date:          September 25, 2006
 * Programmer:    James Church
 *
 * Description:
 *     This is a program to test the library of a LinkedList by performing a series of insertions and removals.
 *     Each value printed to the screen has the value returned followed by the value of what it should be (in parentheses).
 *
 *
 */

import java.util.Scanner;

class lltest {

    int correct;
    int total_test;

    void check(String header, int rightValue, int thisValue) {
        System.out.print(header+": "+thisValue+" ("+rightValue+")");
        if (rightValue != thisValue)
            System.out.println(" ERROR");
        else {
            System.out.println("");
            correct++;
        }
        total_test++;
    }

    public static void main(String[] args) {
        new lltest();
    } // End main

    public lltest() {

        correct = 0;
        total_test = 0;
        LinkedList l = new LinkedList();

        // Inserting Even numbers from 0 to 18 into the LL in sequential order.
        for (int i = 0; i < 10; i++)
            l.insert(i, i*2);

        // Inserting Odd numbers from 1 to 19 so that list l is 0 to 19 in order
        for (int i = 0; i < 10; i++)
            l.insert(i*2+1, i*2+1);

        check("List size", 20, l.size());

        for (int j = 0; j < l.size(); j++) {
            check("  "+j, j, l.get(j));
        }

        // Removing Every Third Element in the list, starting at 0.
        int i = 0;
        int k = 0;
        while (i < l.size()) {
            check("Removing", k, l.remove(i));
            i += 2;
            k += 3;
        } // End While

        // List should now be a listing of the number from 1 to 19, but without numbers visible by 3
        check("List size", 13, l.size());
        i = 1;
        for (int j = 0; j < l.size(); j++) {
            check("  "+j,i,l.get(j));
            i++;
            if (i % 3 == 0) i++;
        } // End For

        // Put the number 42 as the last element in the list
        l.set(l.size()-1, 42);
        check("The last element in the list has been changed to ",42,l.get(l.size()-1));

        // Remove all items from the list
        while (!l.isEmpty())
            l.remove(0);

        check("Removed all items from list. List size", 0, l.size());

        System.out.println("Now testing removeEach.");
        i = 0;
        for (int j = 0; j < 4; j++) {
            System.out.println("List("+i+"):"+j*2); l.insert(i++, j*2);
            System.out.println("List("+i+"):"+j*2); l.insert(i++, j*2);
            System.out.println("List("+i+"):"+j*2); l.insert(i++, j*2);
        }

        l.removeEach(4);
        check("Removed all occurances of the number 4. List size is now ",9,l.size());

        l.unique();
        System.out.println("List is now unique.");
        check("Element 0:",0,l.get(0));
        check("Element 1:",2,l.get(1));
        check("Element 2:",6,l.get(2));

        check("List size is now ",3,l.size());

        System.out.println("\nProgram complete! "+correct+" out of "+total_test+" correct.");
        if (correct != total_test) {
            System.out.println("The library has errors.");
        }
        else {
            System.out.println("Looks good. Turn it in.");
        }
    } // End main

}