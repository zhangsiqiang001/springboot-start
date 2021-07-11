package springboot.itgod.study.javatest.newthread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class NewTheardByImCall implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("new Thread By implements  Callable<Integer>");
        return null;
    }
    public static void main(String[] args) {
        NewTheardByImCall integerNewTheardByImCall = new NewTheardByImCall();
        FutureTask<Integer> integerFutureTask = new FutureTask<>(integerNewTheardByImCall);
        new Thread(integerFutureTask).start();
    }
}
