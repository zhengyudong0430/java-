/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-23
 * Time: 14:03
 */
public class Client{
    public static void main(String[] args) {
        /*测试数据*/
        /* 机内总数  账户余额    取款金额   密码
         * 1000 500     200     123
         * 1000 300     500     123
         * 0    500     200     123
         * */
        try {
            test(1000, 500, 200, "6300");
            System.out.println("------------------------------------------------------------");
            test(1000, 300, 1500, "6300");
            System.out.println("------------------------------------------------------------");
            test(-1500, 500, 200, "6300");
        } catch (Exception e) {
            System.out.println("账户余额小于-1000，账户状态为红色透支状态，请存钱后再取");
            //System.out.println("机器故障，维修请求已经发送至维修方");
        }
    }

    private static void test(int totalAmount, int balance, int amount, String pwd)throws Exception{
        //创建ATM
        ATM atm;
        atm = new ATM(totalAmount, balance, amount, pwd);
        //输出初始状态
        System.out.println(atm.toString());
        System.out.println(atm.SKT());
        atm.insertCard();
        atm.submitPwd();
        atm.getCash();
        //输出结束状态
        System.out.println(atm.toString());
    }
}
