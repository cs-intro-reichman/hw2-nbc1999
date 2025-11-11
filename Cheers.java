//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
     String word = args[0];
    int repeatCount = Integer.parseInt(args[1]);
    word = word.toUpperCase();
    String specialLetters = "AEFHILMNORSX";

    for (int i = 0; i < word.length(); i++) {
        char letter = word.charAt(i);

        if (specialLetters.indexOf(letter) != -1) {
            System.out.println("Give me an " + letter + ": " + letter + "!");
        } else {
            System.out.println("Give me a  " + letter + ": " + letter + "!");
        }
    }

    System.out.println("What does that spell?");

    for (int i = 0; i < repeatCount; i++) {
        System.out.println(word + "!!!");
    }
}
}
	   

