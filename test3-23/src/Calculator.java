 class Calculator {
    //编写一个类Calculator,有两个属性num1,num2,这两个数据的值，
    // 不能在定义的同时初始化，最后实现加减乘除四种运算
    private int num1;
    private int num2;
    public int add(int num1 , int num2 ){
        this.num1 = num1;
        this.num2 = num2;
        return this.num1 + this.num2;
    }
    public int sub(int num1 , int num2){
        this.num1 = num1;
        this.num2 = num2;
        return this.num1 - this.num2;
    }
    public int mol(int num1 , int num2){
        this.num1 = num1;
        this.num2 = num2;
        return this.num1 * this.num2;
    }
    public double div(int num1 , int num2){
        this.num1 = num1;
        this.num2 = num2;
        return (double)this.num1 / this.num2;
    }

}
