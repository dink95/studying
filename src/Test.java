import java.util.ArrayList;
import java.util.Collections;

public class Test {

    public static void main(String[] args) {

        String num1 = "123";
        String num2 = "888";
        String slove = new Test().slove(num1, num2);
        System.out.println(slove);
    }

    public String slove(String num1, String num2){
        int carry = 0;

        StringBuilder sb = new StringBuilder();
        int num1Len = num1.length()-1;
        int num2Len =num2.length()-1;

        while (num1Len>=0||num2Len>=0){
            int n1= 0, n2= 0;
            if(num1Len>=0)
                n1 = num1.charAt(num1Len) -'0';
            if(num2Len>=0)
                n2 = num2.charAt(num2Len)-'0';

            int sum = n1+n2+carry;
            carry = sum/10;
            sb.append(sum%10);
            num1Len--;
            num2Len--;
        }
        if(carry!=0)sb.append(carry);

        return sb.reverse().toString();


    }


}
