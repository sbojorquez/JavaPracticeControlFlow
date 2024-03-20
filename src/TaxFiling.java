/*
Create a program that lets the users input their filing status and income. Display how much tax the user would have to
pay according to status and income.
 */
import java.util.*;
public class TaxFiling {
    public static void main(String[] args) {
        double tax=0.0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the letter corresponding to your filing status:\n a) Single \n b) Married Filing Jointly or Qualifying Widow(er) \n c) Married Filing Separately \n d) Head of Household");

        String filingStatus = scan.nextLine(); //give user options, user selects letter minimizing formatting issues to enter the if statement

        System.out.println("Enter your annual income to the nearest dollar:");

        int income = scan.nextInt();

       String formattedFiling = filingStatus.toLowerCase();


    /*user has inputted filing status and income, enter if statement based on status then nested if statements will
    determine percentage of tax based of of income range
     */
       if (formattedFiling.compareTo("a") == 0){
           if(income>372951){
              tax = income*.35;
           }
           if(income<= 8350){
               tax = income*.1;
           }
           if(income>=8351 && income<= 33950){
               tax = income*.15;
           }
           if(income>=33951 && income<=82250){
               tax = income*.25;
           }
           if(income>=82251 && income<=171550){
               tax = income*.28;
           }
           if(income>=171551 && income<=372950){
               tax = income*.33;
           }
           System.out.printf("You must pay $%.2f in taxes.", tax);
       }

        if (formattedFiling.compareTo("b") == 0){
            if(income>=372951){
                tax = income*.35;
            }
            if(income<= 16700){
                tax = income*.1;
            }
               if(income>=16701 && income<= 67900){
               tax = income*.15;
           }
           if(income>=67901 && income<=137050){
               tax = income*.25;
           }
           if(income>=137051 && income<=208850){
               tax = income*.28;
           }
           if(income>=208851 && income<=372950){
               tax = income*.33;
           }
            System.out.printf("You must pay $%.2f in taxes.", tax);
        }

        if (formattedFiling.compareTo("c")== 0){
            if(income>=186476){
                tax = income*.35;
            }
            if(income<= 8350){
                tax = income*.1;
            }
               if(income>=8351 && income<= 33950){
               tax = income*.15;
           }
           if(income>=33951 && income<=68525){
               tax = income*.25;
           }
           if(income>=68526 && income<=104425){
               tax = income*.28;
           }
           if(income>=104426 && income<=186475){
               tax = income*.33;
           }
            System.out.printf("You must pay $%.2f in taxes.", tax);
        }

        if (formattedFiling.compareTo("d")==0){
            if(income>=372951){
                tax = income*.35;
            }
            if(income<= 11950){
                tax = income*.1;
            }
               if(income>=11951 && income<= 45500){
               tax = income*.15;
           }
           if(income>=45501 && income<=117450){
               tax = income*.25;
           }
           if(income>=117451 && income<=190200){
               tax = income*.28;
           }
           if(income>=190201 && income<=372950){
               tax = income*.33;
           }
            System.out.printf("You must pay $%.2f in taxes.",tax);
        }

    }
}
