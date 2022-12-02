Scanner class:
import java.util.Sacnner;

In the main method, create a scanner obj that reads keyboard input.
Scanner scan = new Scanner(System.in);
"System.in" is the standard input stream.

Scanner method is used to read in something input from the keyboard.
Ensure that it is stored. 

int x = scan.nextInt();

.nextInt is a scanner method that brings up the cursor and wait for an integer to be typed in. 
Upon the user pressing the Enter key, the input will be grabbed.

Other scanner methods:

double x = scan.nextDouble(); is for decimals
String x = scan.next(); single streams
String x2 = scan.nextLine(); is for strings with spaces (from one line)

To make scanner programs more intuitive add a prompt before using Scanner methods. This
e.g. "What is your name" so that the user knows what to type in
