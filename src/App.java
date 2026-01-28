import java.util.Scanner;

/**
 * Instructions:
 * - Complete the WeeklyData.java class first.
 * - Use this App class to collect user input and test your WeeklyData methods.
 * - Follow all TODOs carefully.
 * - Do NOT hard-code values — use loops and method calls.
 */
public class App {

    public static void main(String[] args) {

        // -------------------------------------------------------------
        // TODO 1: Create a Scanner for user input
        // -------------------------------------------------------------
        Scanner scanner = new Scanner(System.in);

        // -------------------------------------------------------------
        // TODO 2: Give information about your program
        //         Ask the user about their goals (if applicable)
        // -------------------------------------------------------------
        System.out.println("Welcome to the Weekly Reading Data Analyzer! ");
        System.out.println("This program will help you track and analyze your reading habits over the week. ");
        System.out.println("What is your goal for minutes read per week? ");
        int goal = scanner.nextInt();
        System.out.println("Great! Your goal is to read " + goal + " minutes this week.");
        

        // -------------------------------------------------------------
        // TODO 3: Create an array to hold 7 days of data
        //         Use an appropriate data type (int or double)
        //         Name the array weekData
        // -------------------------------------------------------------
        int[] weekData = new int[7];


        // -------------------------------------------------------------
        // TODO 4: Use a for loop to collect data for each day of the week
        //         Prompt example:
        //         "Enter <data type> for day X: "
        //
        //         Include input validation:
        //         - Use a while loop to prevent negative values
        //         - Re-prompt if the value is invalid
        // -------------------------------------------------------------

        for( int i =0; i <weekData.length; i++) {
            System.out.println("Enter the number of minutes you read for day " + (i+1) + ":");
            double minutes = scanner.nextDouble();
            while (minutes < 0) {
                System.out.println("Invalid input. Please enter a non-negative number for day " + (i+1)  + ":" );
                minutes = scanner.nextDouble();
            }
            weekData[i] = minutes;
        }

        // -------------------------------------------------------------
        // TODO 5: Create a WeeklyData object
        //         Pass the weekData array into the constructor
        // -------------------------------------------------------------
        WeeklyData readingData = new WeeklyData(weekData);

        

        // -------------------------------------------------------------
        // TODO 6: Display the results of the analysis
        //         Call methods from WeeklyData to display:
        //         - Total
        //         - Average
        //         - Minimum
        //         - Maximum
        //       Example output:
        System.out.println("Weekly Reading Summary: ");
        System.out.println("Total minutes read: " + readingData.getTotal());
        System.out.println("Average minutes read per day: " + readingData.getAverage());
        System.out.println("Minimum minutes read in a day:" + readingData.getMin());
        System.out.println("Maximum minutes read in a day: " + readingData.getMax());
        
        //         Use clear labels and formatted output if needed
        // -------------------------------------------------------------


        // -------------------------------------------------------------
        // TODO 7: Display the full week of data
        //         Use the toString() method from WeeklyData
        // -------------------------------------------------------------
        System.out.println("Here is your reading data for the week: ");
        System.out.println(readingData.toString());
        

        // -------------------------------------------------------------
        // TODO 8: Give the user insights about their week
        //         --> "You need to drink more water next week!"
        //         --> "You were very hydrated this week!"
        //         --> etc.
        // -------------------------------------------------------------
        if (readingData.getTotal()>= goal) {
            System.out.println("Congratulations! You met your reading goal for the week!");
        } else {
            System.out.println("You didn't meet your reading goal this week. Keep trying!");
            double difference = goal - readingData.getTotal();
            System.out.println("You needed to read " + difference + " more minutes to reach your goal.");

        }
        
        }

    }

