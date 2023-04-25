package Day3_03132023;

public class T2_IfElse_Statements {
    public static void main(String[] args) {
        //declare two integer variables
        int a = 1;
        int b = 4;
        int c = 6;

        //print out the conditions when a+b either greater, equal or less than c
        //you can end multiple conditions with an else if of with an else
        if (a + b > c) {
            System.out.println("a & b is greater than c");
        } else if (a + b == c) {  // double  equal sign is used to compare two different variables
            System.out.println("a & b is equal to c");
        } else {
            System.out.println("a & b is less than c");

        }//end of conditions
    }//end of main
}//end of class
