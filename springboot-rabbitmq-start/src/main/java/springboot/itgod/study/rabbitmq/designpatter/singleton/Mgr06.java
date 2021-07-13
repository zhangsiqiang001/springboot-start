package springboot.itgod.study.rabbitmq.designpatter.singleton;

public class Mgr06 {

    private Mgr06() {

    }

    private static class Mgr06Holder {
        private final static Mgr06 INSTANCE = new Mgr06();
    }

    public static Mgr06 getInstance() {
        return Mgr06Holder.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                System.out.println(Mgr06.getInstance().hashCode());
            }).start();
        }
    }
}
