import java.util.*;
public class decodeString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String str = s.nextLine();
        int i=0;
        int n = str.length();
        int count=0;
        while(i<n)
        {
            char ch = str.charAt(i);
            i++;
            count=0;
            while(i<n && Character.isDigit(str.charAt(i)))
            {
                count=count*10+(str.charAt(i)-'0');
                i++;
            }
            //System.out.println(count);
            sb.append(String.valueOf(ch).repeat(count));
        }
        System.out.println(sb.toString());
    }
}
