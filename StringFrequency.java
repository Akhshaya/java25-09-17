import java.util.Scanner;
class StringFrequency
{
 public static void main(String args[])
{
 int ci, i, j, k, l=0;
 String str, str1;
 char c, ch;
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter a String : ");
 str=sc.nextLine();
 i=str.length();
 for(c='A'; c<='z'; c++)
 {
  k=0;
  for(j=0; j<i; j++)          
 {
  ch = str.charAt(j);
  if(ch == c)
 {
  k++;
  }
  }
  if(k>0)
 {
 System.out.println("The character " + c + " has occurred for " + k + " times");
 }
 }
 }
