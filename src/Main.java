import java.util.Scanner;
//scanner is a function that allows user to input

public class Main {
    //this is the main method and the entry point of any java program
    public static void main(String[] args) {

        //add the string "What is the best football team" into the string

        // create new object for the scanner class
        Scanner sc = new Scanner(System.in);
        //Prints out the string literal the brackets
        System.out.println(" what is your name? ");
        //prints out the name entered by the user
        String name = sc.nextLine();
        //prints out "Hello" and whatever is stored in the variable name
        System.out.println("Hello " + name);

        // create new object for the 2nd scanner class
        Scanner sc1 = new Scanner(System.in);
        //asks user how is the weather today
        System.out.println(" How's the weather today? ");
        //allows user to enter the answer for the question above
        String weather = sc1.nextLine();


        //try and add a new variable and as " WHAT IS THE BEST FOOTBALL TEAM" and add the two strings together
        String ask = " what is the best football team?";
        System.out.println(ask);
        String ans = sc.nextLine();
        //conditions after the user has entered the answer
        int score = 0;
        {
            if (ans.equals("man united"))  {
                System.out.print("You are right!! ");
                score++;

            } else {
                System.out.print("You are wrong!! ");
                score--;
                }




            System.out.print("Your score is : " + score);

        }
    }
}
