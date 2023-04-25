package Day3_03132023;

import java.util.ArrayList;

public class T1_WhileLoop {
    public static void main(String[] args) {
        //create an array list of cities
        ArrayList<String>cities = new ArrayList<>();
        cities.add("Brooklyn");
        cities.add("Queens");
        cities.add("Manhattan");
        cities.add("Staten Island");
        cities.add("Bronx");
        //set the initial point
        int i=0;
        while(i < cities.size()){
            System.out.println("Cities: " + cities.get(i));
            i = i+1; //incrementation
        }//end of loop
    }//end of main
}//end of class
