package Day2_03072023;

import java.util.ArrayList;

public class T2_ArrayList {
    public static void main(String[] args) {
        //declare and define an arrayList of countries
        ArrayList<String> countries = new ArrayList<>();
        //add some values for countires
        countries.add("USA");//index 0
        countries.add("UK");//index 1
        countries.add("INDIA");//index 2
        countries.add("BANGLADESH");//index 3
        countries.add("PAKISTAN");//index 4
        //print out usa from the array list
        System.out.println("My first country is "+ countries.get(0));
        //get the total size of the array list
        System.out.println("Size of the countries arraylist is "+ countries.size());
        //add an additional country (Canada)
        countries.add("CANADA");
        System.out.println("Size of the countries arraylist is " + countries.size());
        //print out the size of the array list again
        ArrayList<Integer> studentGrades = new ArrayList<>();
        //add some students to the array list
        studentGrades.add(90);
        studentGrades.add(80);
        studentGrades.add(70);
        System.out.println("First student grade is " + studentGrades.get(0));
        //to add another integer to an array list
        System.out.println("First student grade is " + studentGrades.get(0) +" and the second student grade is " + studentGrades.get(2));

    }//end of main
}//end of class
