package bracketbalancing;
import java.util.Scanner;
public class BracketBalancing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b;
        boolean flag = true; 
        b = sc.nextLine();
        int l = b.length();
        MyStack s = new MyStack(l);
        int i=0;
        while(i<l)
        {
            if( b.charAt(i) == '(' || b.charAt(i) == '[' || b.charAt(i) == '{' )
                s.push(b.charAt(i));
            else
            {
                if( s.peek() == '(' && b.charAt(i)== ')' )
                    s.pop();
                else if( s.peek() == '[' && b.charAt(i)== ']' )
                    s.pop();
                else if( s.peek() == '{' && b.charAt(i)== '}' )
                    s.pop();
                else if(s.isEmpty())
                {
                    flag=false;
                    break;
                }
                else
                {
                    flag=false;
                    break;
                }
            } 
            i++;
        }
        if(flag && s.isEmpty())
            System.out.println("BALANCED");
        else 
            System.out.println("NOT BALANCED");
    }
}
