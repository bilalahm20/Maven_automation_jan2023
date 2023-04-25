package ActionItem_1;

public class T2_LinearArray {
    public static void main(String[] args) {
        //Declare new string variable
        String[] Regions;
        Regions = new String[]{"Brazil", "EGYPT", "TAIWAN", "INDONESIA"};
        //Store area code values
        int[] areaCode = new int[]{55, 20, 886, 62};
        //Create a loop using both data sets
        for (int i = 0; i < areaCode.length; i++) {
            //Print out out the regins and areacodes
            System.out.println(" My region is " + Regions[i] + " And my areaCode is " + areaCode[i]);

        }//end of loop


    }// end of main
}// end of class