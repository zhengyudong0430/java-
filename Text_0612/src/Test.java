

public class Test{
    public int add(int a,int b){
        try {
            return a+b;
        }
        catch (Exception e) {
            System.out.println("catch语句块");
        }
        finally{
            System.out.println("finally语句块");
        }
        return 0;
    }
    public static void main(String argv[]){
        byte b1=1,b2=2,b3,b6;
        final byte b4=4,b5=6;
        b6=b4+b5;
        b3= (byte) (b1+b2);
        System.out.println(b3+b6);
        Test test =new Test();
        System.out.println("和是："+test.add(9, 34));
    }
}