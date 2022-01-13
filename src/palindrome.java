public class palindrome {


    public static void main(String[] args) {
        String str = "bbbba";
        System.out.println( new palindrome().slove(str));
    }

    int start, end;
    private String slove(String str) {
        int len = str.length();
        if(len<2) return str;

        for(int i=0;i<len;i++){
            findSubString(str,i,i);
            findSubString(str,i,i+1);
        }

    return str.substring(start,end+start);
    }

    private void findSubString(String str, int left, int right) {
        while (0<=left&&right<str.length()&&str.charAt(left)==str.charAt(right)){
            left--;
            right++;
        }
        if(end<right-left-1){
            end = right-left-1;
            start=left+1;
        }
        System.out.println(start+":"+end);

    }
}
