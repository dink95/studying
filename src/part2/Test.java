package part2;

public class Test {
    public static void main(String[] args) {

        int []price = {8,2,6,5,1,7,5};
        System.out.println(maxProfit(price));
    }

    private static int maxProfit(int[] price) {


        if(price.length==0)return 0;
        int max=0;
        int sofaMin = price[0];

        for(int i=0;i<price.length;i++){
            if(sofaMin>price[i]){
                sofaMin=price[i];
            }else{
                //Math.max는 큰 값을 리턴
                max= Math.max(max,price[i]-sofaMin);//가장 작은 값에서 사서 큰값에 판다.
            }
        }
        return max;
    }

}
