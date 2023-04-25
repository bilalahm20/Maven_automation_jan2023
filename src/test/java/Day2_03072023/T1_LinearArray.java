package Day2_03072023;

public class T1_LinearArray {
    public static void main(String[] args) {
        //declare a string array variable
        String [] zipCode;
        //store zipcode values in the string array
        zipCode= new String[]{"11231", "11230","12562","11034","11010"};
        //print the first zipCode from the zipCode array
        //Array always start from index 0
        System.out.println("My first Zipcode is" + zipCode [0] );
        //print the second value from the zipcode array
        System.out.println ("My second Zipcode is"+ zipCode[1]);
        //alternative way to declare and define a linear array
        String[] zipCode2= new String[]{"11231","11230" , "12562" , "11010"};
        //print out the fifth zipcode from the zipcode2 array
        System.out.println("My fifth zipCode is "+ zipCode2[3]);
        int[] studentGrades = new int[]{90,99,55};
        System.out.println("My second street number is " + studentGrades[1]);

    }
}
