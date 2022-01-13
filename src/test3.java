public class test3 {

    public static void main(String[] args) {

        String str[] = {"test","teacher","te"};

        System.out.println(solve(str));
    }

    private static String solve(String[] str) {
        if(str.length==0)
            return "";

        String firstStr = str[0];

        for(int i=1;i<str.length;i++){
            while (str[i].indexOf(firstStr)!=0){
                System.out.println(str[i].indexOf(firstStr));
                firstStr = firstStr.substring(0,firstStr.length()-1);
            }
        }
        System.out.println(firstStr +" !!");
        return firstStr;
    }
}
