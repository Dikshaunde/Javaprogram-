import java.util.Scanner;
class vowel
{
    public static void main(String[] args) {
       String s=new String();
       Scanner sc = new Scanner (System.in);
       System.out.println("Enter string");
       s=sc.nextLine();
       int v=0;
       char c;
       s=s.toLowerCase();
       for(int i=0;i<s.length();i++)
       {
           c=s.charAt(i);
           if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
           {
               v++;
           }
          // System.out.println("No of vowels:"+v);
       }
       System.out.println("no of vowels:"+v);
       
    }
}
