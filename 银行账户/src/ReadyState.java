/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-23
 * Time: 14:02
 */
public class ReadyState implements ATMState{
    private ATM atm;//保留状态持有者的引用，以便对其进行操作
    public ReadyState(ATM atm){
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("插卡完成");
    }
    @Override
    public void submitPwd() {
        System.out.println("密码提交成功");
        //验证密码并做相应处理
        if("6300".equals(atm.getPwd())){
            System.out.println("密码验证通过");
        }
        else{
            System.out.println("密码验证失败");
            //弹出卡片
            ejectCard();
        }
    }

    @Override
    public void getCash() {
        //atm.getTotalAmount() >= atm.getAmount() && atm.getBalance() >= atm.getAmount()
        if(atm.getTotalAmount() != 9999){
            //更新账户余额
            atm.setBalance(atm.getBalance() - atm.getAmount());
            //更新机内现钞总数
            atm.setTotalAmount(atm.getTotalAmount() - atm.getAmount());
            System.out.println("吐出￥" + atm.getAmount());
            System.out.println("取款完成");
            //弹出卡片
            ejectCard();
            //检查机内余钞
            if(atm.getTotalAmount() == 0){//若无钞，切换到NoService状态
                atm.setCurrState(atm.getNoCashState());
                System.out.println("无钞信息已经发送至银行");
            }
        }
        else{
            System.out.println("取款失败，余额不足");
            //弹出卡片
            ejectCard();
        }
    }

    @Override
    public void queryBalance() {
        System.out.println("余额￥" + atm.getBalance());
        System.out.println("余额查询完成");
    }

    @Override
    public void ejectCard() {
        System.out.println("取卡完成");
    }
}
