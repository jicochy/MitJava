public class FibboSeries {
    public static void main(String[] args) {
        int a=0,b=1;
        for(int i=0;i<=99;i++)
        {
            int j=a+b;
            System.out.println(j);
            a=b;
            b=j;
        }
    }


}
