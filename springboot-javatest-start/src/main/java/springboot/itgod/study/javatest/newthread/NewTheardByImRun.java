package springboot.itgod.study.javatest.newthread;

public class NewTheardByImRun implements Runnable {
    @Override
    public void run() {
        System.out.println("new Thread by implements Runnable");
    }

    public static void main(String[] args) {
        NewTheardByImRun newTheardByImRun = new NewTheardByImRun();
        new Thread(newTheardByImRun).start();
    }
}
