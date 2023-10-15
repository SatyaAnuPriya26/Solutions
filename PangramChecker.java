import java.lang.*;
import java.util.*;
public class PangramChecker {
public static boolean isPangram(String str) {
str = str.toLowerCase(); // Convert the string to lowercase to make it case-insensitive
boolean[] alphabet = new boolean[26];
for (int i = 0; i < str.length(); i++) {
char c = str.charAt(i);
if (Character.isLetter(c)) {
int index = c - 'a';
alphabet[index] = true;
}
}
for (boolean letterPresent : alphabet) {
if (!letterPresent) {
return false;
}
}
return true;
}
public static void main(String[] args) {
String testString;
Scanner sc=new Scanner(System.in);
testString = sc.nextLine();  
boolean isPangram = isPangram(testString);
if (isPangram) {
System.out.println("The string is a pangram.");
} else {
System.out.println("The string is not a pangram.");
}
}
}