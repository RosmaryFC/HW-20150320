package nyc.c4q.RosmaryFC;

/**
 * Created by c4q-rosmary on 3/19/15.
 * A pretty Title
 * Write a program that calls a method printTitle that prints a phrase as a title by,

 converting it to title capitalization
 underlining each word, i.e. underlying all characters except spaces
 For example,

 printTitle("a tale of two cities", '*')
 produces

 A Tale of Two Cities
 * **** ** *** ******
 */
public class APrettyTitle {
    public static void main(String[] args) {

        System.out.println(printTitle("a tale of two cities", '*'));

    }

    public static String printTitle(String text, char underline) {
        String newText = "";

        //allows code  to check through string as individual characters
        for(int i = 0; i < text.length(); i++) {
            if( i == 0) {//first character is always capital
                newText += Character.toUpperCase(text.charAt(i));
            } else
            {
                if (text.charAt(i -1) == ' ') { //if character is after a space it will be capital
                    newText += Character.toUpperCase(text.charAt(i));
                } else {// if character is not after a space it will be lowercase
                    newText += text.charAt(i);
                }
            }
        }

        System.out.println(newText);// prints parameter String text

        String printTitle = underline(text,underline); //calling underline method

        return printTitle;
    }


    //Start of code that prints out underline
    public static String underline(String text,char letter ){ // creates the underline effect under text.
        //System.out.println(text);

        String underline = repeat(text,letter,text.length()); // calling repeat method

        return underline;
    }
    public static String repeat(String text, char letter , int num) { // allows the stars to repeat for a certain length, and print space if the character above it is a space
        String repeatInfo = "";

        for(int i = 0; i < num; i++){
            if(text.charAt(i) != ' ') {
                repeatInfo += letter;
            } else {
                repeatInfo += ' ';
            }
        }

        return repeatInfo;
    }
    //End of code that prints out underline
}
