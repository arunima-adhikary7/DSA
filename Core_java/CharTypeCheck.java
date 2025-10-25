package Core_java;

public class CharTypeCheck {

    public static void main(String[] args) {
        char ch='#';
        if(Character.isLetter(ch))
          System.out.println(ch+"is an alphabet");
        else if (Character.isDigit(ch))
            System.out.println(ch+" is a digit");
         else
            System.out.println(ch+" is a special character");
    }
    
}
