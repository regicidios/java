A Java class is a blueprint for an object. 
An object is also called "an instance of a class". 
Each object has attributes/instance variables
A Java class describes what an object can do - the behavior/methods.

Constructors: Special methods used to initialize objects.

Example: 
```
public class Main {
  int x;

  public Main(int y) { //Constructor for the Main class
    x = y;
  }

  public static void main(String[] args) {
    Main myObj = new Main(5);
    System.out.println(myObj.x);
  }
}
```
Outputs 5

CONSTRUCTOR NAMES MUST BE THE SAME AS THE CLASS NAME