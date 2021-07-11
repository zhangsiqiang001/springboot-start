package springboot.itgod.study.javatest.newthread;

public class NewTheardByExtend extends Thread{

    @Override
    public void run() {
        System.out.println("new thread by extend Theard");
    }

    public static void main(String[] args) {
        NewTheardByExtend newTheardByExtend = new NewTheardByExtend();
        newTheardByExtend.start();
    }
}
