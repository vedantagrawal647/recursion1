import java.util.Scanner;

/*
 write a recursive function to convert a given string into the number it represents.
 That is input will be a numeric string that contains only numbers, you need to convert the string
 into a corresponding integer and return the answer.
Sample Input:
“2029”
Sample Output:
2029 
 */
public class Conversion {

    String s;
    int c;
    Conversion(String s)
    {
        this.s=s;
        c=s.length();
    }
    public int m2(int l)
    {
        if(l==0)
        {
            return Integer.parseInt(s.substring(0,1));
        }

        return m2(l-1)*10+Integer.parseInt(s.substring(l,l+1));



    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.next();
        Conversion obj=new Conversion(s1);
        System.out.println(obj.m2(s1.length()-1));


    }
}
