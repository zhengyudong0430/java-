/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-23
 * Time: 13:56
 */
public class ATM {
    /*所有状态*/
    private ATMState readyState;
    private ATMState noCashState;
    private ATMState noServiceState;

    private ATMState currState;//当前状态
    private int totalAmount;//账户现钞总数

    /*测试用的临时变量*/
    private String pwd;//密码
    private int balance;//余额
    private int amount;//取款金额

    public ATM(int totalAmount, int balance, int amount, String pwd) throws Exception{
        //初始化所有状态
        readyState = new ReadyState(this);
        noCashState = new NoCashState(this);
        noServiceState = new NoServiceState(this);

        if(totalAmount > 0){
            currState = readyState;
        }
        else if(totalAmount == 0){
            currState = noCashState;
        }
        else{
            throw new Exception();
        }

        //初始化测试数据
        this.totalAmount = totalAmount;
        this.balance = balance;
        this.amount = amount;
        this.pwd = pwd;
    }

    /*把具体行为委托给状态对象*/
    /**
     * 插卡
     */
    public void insertCard(){
        currState.insertCard();
    }

    /**
     * 提交密码
     */
    public void submitPwd(){
        currState.submitPwd();
    }

    /**
     * 取款
     */
    public void getCash(){
        currState.getCash();
    }

    /**
     * 查询余额
     */
    public void queryBalance(){
        currState.queryBalance();
    }

    /**
     * 取卡
     */
    public void ejectCard(){
        currState.ejectCard();
    }
    public String toString(){
        return "账户总额￥" + totalAmount;
    }
    public String SKT() {
        if(totalAmount >= 0) {
            return  "账户状态为绿色正常状态，既可以存，也可以取款";
        }
        if(totalAmount >= -1000 && totalAmount < 0) {
            return "账户状态为黄色欠费状态，既可以存，也可以取款";
        }
        if(totalAmount < -1000) {
            return "账户状态为红色透支状态，只能存款";
        }
        return "";
    }
    public String getPwd(){
        return pwd;
    }
    public int getBalance() {
        return balance;
    }
    public int getTotalAmount() {
        return totalAmount;
    }
    public int getAmount() {
        return amount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public ATMState getNoCashState() {
        return noCashState;
    }

    public void setCurrState(ATMState currState) {
        this.currState = currState;
    }
}
