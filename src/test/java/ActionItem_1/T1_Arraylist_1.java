package ActionItem_1;

import java.util.ArrayList;

public class T1_Arraylist_1 {
    public static void main(String[] args) {
        //Create Arraylist of countries
        ArrayList<String> countries = new ArrayList<>();
        countries.add("ITALY");//index 0
        countries.add("CANADA");//index 1
        countries.add("MEXICO");//index 2
        countries.add("CHINA");//index 3
        countries.add("BRAZIL");//index 4
        //Create Arraylist of country codes
        ArrayList<Integer> countryCode = new ArrayList<>();
        countryCode.add (39) ;//index 0
        countryCode.add (1) ;//index 1
        countryCode.add (52) ;//index 2
        countryCode.add (86) ;//index 3
        countryCode.add (55) ;//index 4
        //Create forloop
        for (int i = 0; i < countryCode.size(); i++)   {
            System.out.println ("MY COUNTRY IS " + countryCode.get (i) + " and my country code is " + countryCode.get (i));
        }//end of loop



    }//end of main
}//end of class
