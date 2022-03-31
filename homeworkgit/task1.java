package homeworkgit;

public class task1 {
    public static void main(String[] args) {
        //    Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15. Please use while loop
        //
        //  if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section
        //
        //  if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section
        //
        //   if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section

        // Step 1 : int value and create strings.
        int i = 1;
        String divisibleBy15 = "";
        String divisibleBy3 = "";
        String divisibleBy5 = "";

        // Step 2 Condiditons
        while (i <= 100) {

            if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0) {
                divisibleBy15 += " , " + i;

            } else if (i % 3 == 0 && i % 15 !=0) {
                divisibleBy3 += " , " + i;

            } else if (i % 5 == 0 && i % 15 !=0) {
                divisibleBy5 += " , " + i;

            } else {

            }
            i++;
            //Step 3 // print out
        }
        System.out.println("divisibleBy15 = " + divisibleBy15);
        System.out.println("divisibleBy3 = " + divisibleBy3);
        System.out.println("divisibleBy5 = " + divisibleBy5);
    }

}

