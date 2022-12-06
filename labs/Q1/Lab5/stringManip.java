package labs.Q1.Lab5;

public class stringManip {
//This program will manipulate strings by utilizing functions pertaining to the String class.
    public static void main(String[] args) {
    String phrase = "lmfao lmfao lmao floats";
    //charAt(int indexnum) method returns a character at indexnum (indexnum starts counting from 0).
    System.out.println(phrase.charAt(6));
    //length() method returns an integer specified to the length of a string.  
    System.out.println(phrase.length());
    phrase += " is the only floats";
    System.out.println(phrase);
    phrase = "In example floats, "+phrase;
    System.out.println(phrase);
    //two-parameter substring(int start, int end) method returns a string defined by the start and end parameters that represent index positions.
    System.out.println(phrase.substring(3, 17));
    //one-parameter substring(int start) method returns a string defined by only a start parameter; the end parameter is the last number on the index.
    System.out.println(phrase.substring(55));
    //indexOf(string seachword) method returns an integer that represents the first index of where the string is located.
    System.out.println(phrase.indexOf("floats"));
    System.out.println(phrase.indexOf("floats"));
    //replace(char old, char new) method replaces all instances of a character with another character.
    phrase=phrase.replace('o', 'x');
    //toUpperCase() capitalizes every character found within a specified stinrg.
    phrase=phrase.toUpperCase();
    System.out.println(phrase);
    System.out.println(phrase.length());
    }
}