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

        //System.out.println(printTitle("a tale of two cities", '*'));
        //System.out.println(repeat("Hello, World!",'x', 5));
        //System.out.println(underline("Hello, World!", '*'));

        //underline("Hello, World!", '*');

        printTitle("A tale of two cities", '*');
    }

    public static String printTitle(String text, char underline) {
        String text = "";

        System.out.println(text);

        underline(text, underline); //calling underline method

        return "";
    }

    //Start of code that prints out underline
    public static void underline(String text,char letter ){
        System.out.println(text);


        System.out.println(repeat(text,letter,text.length()));
        //return "";
    }
    public static String repeat(String text, char letter , int num) {
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
