public class BetweenRange {
    public static void main(String[] args) {
    /*
    Write a program that declares 1 integer variable x, and then assigns 15 to it. Write an if-else-if statement that
    prints out “Less than 10” if x is less than 10; “Between 10 and 20” if x is greater than 10 but less than 20, and
    “Greater than or equal to 20” if x is greater than or equal to 20. Change x to 50 and notice the result.
     */
        int x = 15; //returns "Between 10 and 20" enters the if and returns in else
        x = 50; // overrides x value 15 and returns "Greater than or equal to 20"


   if(x<10) {
        System.out.println("Less than 10");
    }
    if( x >= 20){
        System.out.println("Greater than or equal to 20");
    }

    else{

        System.out.println("Between 10 and 20");
    }


    }
}
