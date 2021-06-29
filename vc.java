import java.util.Scanner;
class Vowel
{
 public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);
System.out.println("Enter a character : ");
char ch = scanner.next().charAt(0);
scanner.close();
switch (ch)
{
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
System.out.println(ch + " is vowel");
break;
default:
System.out.println(ch + " is consonant");
        }
    }
}