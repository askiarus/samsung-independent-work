import java.util.Scanner;

public class Cryptographer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] message = input.next().toCharArray();
        int key = input.nextInt();

        encoder(alphabet, message, key);

        System.out.println(message);
    }

    public static void encoder(char[] alphabet, char[] message, int key) {
        for (int i = 0; i < message.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                // Checking every letter in alphabet if it matches the letter in the message
                if (message[i] == alphabet[j]) {
                    // Leaving only the number in range of the length of the alphabet that gives us position of the letter that replaces the one in message
                    message[i] = alphabet[(j + key) % alphabet.length];
                    // Returning to parent loop to prevent double encoding of a single letter
                    break;
                }
            }
        }
    }
    public static void encoder(char[] alphabet, String message, int key) {
        // Turning message into array of chars
        char[] messageLetters = message.toCharArray();

        for (int i = 0; i < messageLetters.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                // Checking every letter in alphabet if it matches the letter in the message
                if (messageLetters[i] == alphabet[j]) {
                    // Leaving only the number in range of the length of the alphabet that gives us position of the letter that replaces the one in message
                    messageLetters[i] = alphabet[(j + key) % alphabet.length];
                    // Returning to parent loop to prevent double encoding of a single letter
                    break;
                }
            }
        }

        // Turning the array back into a message
        message = messageLetters.toString();
    }
}