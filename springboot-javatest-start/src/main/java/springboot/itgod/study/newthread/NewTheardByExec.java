package springboot.itgod.study.newthread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewTheardByExec {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(30);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("哈哈哈哈");
            }
        };
        threadPool.execute(runnable);
    }

}
