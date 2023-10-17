// This cryptographer supports only lowercase letters of English alphabet! Every other symbol will remain unchanged!

import java.util.Scanner;

public class Cryptographer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        System.out.print("Enter your message (replace spaces with _): ");
        //char[] message = input.next().toCharArray();
        String message = input.next();
        System.out.print("Enter the cipher key: ");
        int key = input.nextInt();

        // Encode message (assigning is necessary for String)
        message = encoder(alphabet, message, key);
        System.out.println(message);
        // Decode message (assigning is necessary for String)
        message = decoder(alphabet, message, key);
        System.out.println(message);
    }

    public static char[] encoder(char[] alphabet, char[] message, int key) {
        for (int i = 0; i < message.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                // Checking every letter in alphabet if it matches the letter in the message
                if (message[i] == alphabet[j]) {
                    // Leaving only the number in range of the length of the alphabet that gives us position of the letter that replaces the one in message
                    message[i] = alphabet[(j + alphabet.length + key) % alphabet.length];
                    // Returning to parent loop to prevent double encoding of a single letter
                    break;
                }
            }
        }

        return message;
    }
    public static String encoder(char[] alphabet, String message, int key) {
        // Turning message into array of chars
        char[] messageLetters = message.toCharArray();

        // Calculating the cipher and turning the array back into a message
        return new String(encoder(alphabet, messageLetters, key));
    }

    public static char[] decoder(char[] alphabet, char[] message, int key) {
        return encoder(alphabet, message, -key);
    }
    public static String decoder(char[] alphabet, String message, int key) {
        return encoder(alphabet, message, -key);
    }
}