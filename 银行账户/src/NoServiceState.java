/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-23
 * Time: 14:01
 */
public class NoServiceState implements ATMState{
    private ATM atm;//保留状态持有者的引用，以便对其进行操作

    public NoServiceState(ATM atm){
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("读卡失败");
    }

    @Override
    public void submitPwd() {
        System.out.println("密码提交失败");
    }

    @Override
    public void getCash() {
        System.out.println("取款失败");
    }

    @Override
    public void queryBalance() {
        System.out.println("余额查询失败");
    }

    @Override
    public void ejectCard() {
        System.out.println("取卡失败");
    }
}
