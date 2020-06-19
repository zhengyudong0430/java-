public class Test1 {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        int k=5;

        int s=(k++)+(++k)+(k--)+(--k);
        System.out.println(s);


        if((++i>0)||(++j>0))
        {
            System.out.println(i);
            System.out.println(j);
        }

    }
}
