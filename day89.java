package isc;
import java.util.*;

public class day89{
    public static void main(String[] args) {
        Scanner zee = new Scanner(System.in);
        System.out.print("Masukkan kalimat:");
        String oke = zee.nextLine();
        String sip = convertToTitleCase(oke);
        System.out.print("Output:");
        System.out.println(sip);
        zee.close();
    }
    public static String convertToTitleCase(String input) {
        String[] words = input.split(" "); 
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                result.append(capitalizedWord).append(" ");
            }
        }
        return result.toString().trim();
    }
}
