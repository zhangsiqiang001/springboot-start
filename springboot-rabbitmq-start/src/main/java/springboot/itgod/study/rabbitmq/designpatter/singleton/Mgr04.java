package springboot.itgod.study.rabbitmq.designpatter.singleton;

public class Mgr04 {
    private static Mgr04 INSTANCE;

    private Mgr04() {

    }

    public static Mgr04 getInstance() {
        if (INSTANCE == null) {
            synchronized (Mgr04.class) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new Mgr04();
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                System.out.println(Mgr04.getInstance().hashCode());
            }).start();
        }
    }
}
