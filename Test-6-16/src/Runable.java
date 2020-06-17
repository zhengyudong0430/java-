
class MyRunnable implements Runnable          {
    public void run()             {
        //some code here
        new Thread(new MyRunnable()).start();
    }
}