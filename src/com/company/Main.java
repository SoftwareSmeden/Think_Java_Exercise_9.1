package com.company;

public class Main {

    public static void main(String[] args) {
	// Think Java - Exercise 9.1

        // Point 1:
        String str = "hej, ";
        char chr = 'T';
        int intNum = 5;
        double doubleNum = 2;
        boolean trueOrFalse = true;
        boolean falseOrTrue = false;


        // Point 2:
        // Boolean + Boolean
        //System.out.println(trueOrFalse + falseOrTrue);
        // Boolean + Char
        //System.out.println(trueOrFalse + chr);
        // Boolean + Int
        //System.out.println(trueOrFalse + intNum);
        // Boolean + Double
        //System.out.println(trueOrFalse + doubleNum);
        // Boolean + String
        System.out.println(trueOrFalse + str);

        // Char + Char
        System.out.println(chr + chr);
        // Char + Int
        System.out.println(chr + intNum);
        // Char + Double
        System.out.println(chr + doubleNum);
        // Char + String
        System.out.println(chr + str);

        // Int + Boolean
        //System.out.println(intNum + trueOrFalse);
        // Int + Char
        System.out.println(intNum + chr);
        // Int + Int
        System.out.println(intNum + intNum);
        // Int + Double
        System.out.println(intNum + doubleNum);
        // Int + String
        System.out.println(intNum + str);

        // Double + Boolean
        //System.out.println(doubleNum + trueOrFalse);
        // Double + Char
        System.out.println(doubleNum + chr);
        // Double + Int
        System.out.println(doubleNum + intNum);
        // Double + Double
        System.out.println(doubleNum + doubleNum);
        // Double + String
        System.out.println(doubleNum + str);

        // String + Boolean
        System.out.println(str + falseOrTrue);
        // String + Char
        System.out.println(str + chr);
        // String + Int
        System.out.println(str + intNum);
        // String + Double
        System.out.println(str + doubleNum);
        // String + String
        System.out.println(str + str);


        /*
                boolean	  char   int    double	 String          conca = concatenation // add = addition // err = error
        boolean:  err     err    err    err      conca
        char:     err     add    add    add      conca
        int:      err     add    add    add      conca
        double:   err     add    add    add      conca
        String:   conca   conca  conca  conca    conca
         */

        // Point 3:
        /*
        Boolean seems to be the most problematic one?
         */


        // Point 4:
        char x = 'x';

        // Legal
        System.out.println(x); // Prints the character 'x'.
        System.out.println(x++); // This print adds "++" to 'x' but still shows the character 'x' when printed.
        System.out.println(x); // Printing 'x' again but in the previous print we added "++" to 'x' and now it prints the next character in the alphabet 'y'.



        // Error message: java: incompatible types: possible lossy conversion from int to char
        // The problem with this expression must be that it's trying to store an int (4 bytes) inside a char (2 bytes).
        //System.out.println(x = x + 1);


        // Point 5:
        // Empty string
        String emptyStr = "";

        System.out.println(emptyStr + intNum);
        System.out.println(emptyStr + chr);
        System.out.println(emptyStr + 12);
        System.out.println(emptyStr + trueOrFalse);
        System.out.println(emptyStr + str);

        // Since the string (emptyStr) is empty the "sout" will ignore/skip it.


    }
}
