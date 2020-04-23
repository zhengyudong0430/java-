/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-23
 * Time: 14:01
 */
public interface ATMState {
    public abstract void insertCard();
    public abstract void submitPwd();
    public abstract void getCash();
    public abstract void queryBalance();
    public abstract void ejectCard();
}
