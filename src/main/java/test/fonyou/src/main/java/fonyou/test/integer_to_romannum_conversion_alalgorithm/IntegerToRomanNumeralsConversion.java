package fonyou.test.integer_to_romannum_conversion_alalgorithm;

import java.util.Scanner;
public class IntegerToRomanNumeralsConversion {

    public static void main(String[] args)  {

        Scanner inputfromKeyboard = new Scanner(System.in);

        System.out.println("ENTER THE INTEGER VALUE YOU WANT TO CONVERT TO ROMAN NUMERALS :: ");
        int numberToConvert = inputfromKeyboard.nextInt();

        String convertedFigures = convertIntegerToRomanNumerals(numberToConvert);

        System.out.println("ROMAN NUMERAL REPRESENTATION OF " + numberToConvert +" IS :: "+convertedFigures);
    }

    public static String convertIntegerToRomanNumerals(int numberToConvert)
    {
        //DECLARING DEFAULT INTEGER VALUES THAT ARE REPRESENTED AS ROMAN NUMERALS AS AN INTEGER ARRAY
        //we will initialize and Store Letters used in Roman numerals and the corresponding numerical values in an array
        String[] romanNumeralsNotations  = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        //The corresponding numeriacl values with represent the letters declared above in the same order as the letters above
        int[] integerValues = {1000,900,500,400,100,90,50,40,10,9,5,4,1};


//        Initialize a string builder
        StringBuilder romanNumeralOutput = new StringBuilder();

        //Iteratetart checking if input number is >= highest roman numeral
        // add it to the string builder and reduce its corresponding value from the input number
        // if input number is < highest roman numeral
        // check with next highest roman numeral and repeat the process above till inputed number becomes 0
        for(int i=0; i < integerValues.length; i++) {

            //AS LONG AS THE NUMBER WE ARE CONVERTING TO ROMAN NUMERAL IS GREATER THAN EACH ELEMENT OF THE INTEGER VALUE'S ARRAY, SUBTRACT
            while(numberToConvert >= integerValues[i]) {
                numberToConvert -= integerValues[i];
                romanNumeralOutput.append(romanNumeralsNotations[i]);
            }
        }

        return romanNumeralOutput.toString();
    }
}
