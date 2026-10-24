package com.java_Basics;
public class Main{
    public static void main(String[] args){
      /*  Create two int variables, a = 10 and b = 20. Print their sum.*/
        int a =10;
        int b = 20;
        System.out.println(a+b);
        /*Create two variables, price = 100 and quantity = 5. Calculate the total price.*/
        int price =100;
        int quantity = 5;
       int Total_Price = price * quantity;
        System.out.println(Total_Price);
        /*Create a double variable salary = 25000.50 and print it.*/
        double salary = 25000.50;
        System.out.println(salary);
        /*Create a boolean variable called isStudent and assign true. Print it.*/
        boolean isStudent = true;
        System.out.println(isStudent);
        /*Create a String variable called city and assign "Bengaluru". Print this sentence: I live in Bengaluru.*/
        String city = "Bengaluru";
        System.out.println("I live in " + city);
        /*Create three variables for your name, age, and city. Print all three in separate lines.*/
        String name = "Sanika";
        int age = 24;
        String City = "Kolhapur";
        System.out.println(name);
        System.out.println(age);
        System.out.println(City);
        /*Create two integer variables with values 50 and 15. Print their addition, subtraction, multiplication, and division*/
        int x = 50;
        int y = 15;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        /*Declare an integer variable p = 10. Change its value to 25 and print the updated value.*/
        int P;
        P = 10;
        P=25;
        System.out.println(P);

       /*Var Keyword*/
        var z = 5;  // x is an int
        System.out.println(z);

        var myNum = 5;         // int
        var myDouble = 9.98;   // double
        var myChar = 'D';      // char
        var myBoolean = true;  // boolean
        var myString = "Hello"; // String


        /*Inside main(), complete the following steps:
        Declare an int named studentID and assign it a value
        Declare a double named score and assign it a value (use a decimal)
        Declare a char named grade and assign it a single character (in single quotes)
        Print all three values*/


        // Write studentID here
        int studentID = 101;
        // Write score here
        double score = 91.23;
        // Write grade here
        char grade = 'A';
        // Print studentID
        System.out.println(studentID);
        // Print score
        System.out.println(score);
        // Print grade
        System.out.println(grade);

        /* Create two int variables, c = 10 and d = 20. Print their sum.*/
        int c =10;
        int d = 20;
        System.out.println(c+d);

        /* Calculate product price
         Create value = 500 and shipping = 50. Calculate and print the total price.*/
        int value =500;
        int shipping = 50;
        System.out.println(value + shipping);

        /*Create e = 17 and f = 5. Print the remainder using %.*/
        int e =17;
        int f = 5;
        System.out.println(e % f);


        /*Create three integer variables with values 70, 80 and 90. Calculate and print their average as a decimal value.*/

        int g = 70;
        int h = 80;
        int i = 90;

        double avg= (g+h+i)/3.0;
        System.out.println(avg);


        /* Create count = 0. Increase it by 1 three times using +=. Print the final count.*/
        int count = 0;
        count+=1;
        count+=1;
        count+=1;
        System.out.println(count);

        /*Create stock = 100. Subtract 15 using -= and print the remaining stock.*/
        int stock = 100;
        stock-=15;
        System.out.println(stock);

        /*Create testCases = 5. Multiply it by 4 using *= and print the result.*/
        int testCases =5;
        testCases*=4;
        System.out.println(testCases);

        /*Create total = 100. Divide it by 4 using /= and print the result.*/
        int total = 100;
        total/=4;
        System.out.println(total);

        /*Q9. Compare expected and actual values
        Create expected = 100 and actual = 100. Print whether both values are equal.*/
        int expected = 100;
        int actual = 100;
        System.out.println(expected==actual);


        /*Q10. Check HTTP status

        Create statusCode = 200. Print whether the status code equals 200.*/
        int statusCode = 200;
        System.out.println(statusCode==200);

        /*Q11. Check minimum age

        Create myage = 20. Print whether the age is greater than or equal to 18.*/
        int myage = 20;
        System.out.println(myage>=18);


        /*Q12. Check test score
        Create marks = 32. Print whether the marks are less than 35.*/
        int marks = 32;
        System.out.println(marks<35);

       /* Q13. Login validation

        Create usernameValid = true and passwordValid = true. Print whether both are valid using &&.*/
        Boolean usernameValid = true;
        Boolean passwordValid = true;
        System.out.println(usernameValid && passwordValid);

        /*Q14. Alternative login methods

        Create otpValid = false and passwordValid = true. Print whether at least one is valid using ||.*/
        Boolean otpValid = false;
        Boolean password = true;
        System.out.println(otpValid || passwordValid);

        /*Q15. Test failure check

        Create testFailed = false. Use ! to print whether the test has not failed.*/
        Boolean testFailed = false;
        System.out.println(!testFailed);

        /*Q16. Validate a test result

        A test passes only if statusCode == 200 and responseValid == true. Write the condition and print the result.*/
        int code = 200;
        Boolean responseValid = true;
        System.out.println(statusCode == 200 && responseValid == true);




    }
}
