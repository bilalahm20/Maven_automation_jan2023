package Day3_03142023;

public class T1_Split {
    public static void main(String[] args) {

        //create a single string variable
        String message = "my name is John";
        //extract/take out the word John from the string and print is out
        //declare and define a new array string to the split concpet
        String[] arrayMessage = message.split(" ");
        System.out.printf("Value is " + arrayMessage[3]);
    }//end of main
}//end of class
