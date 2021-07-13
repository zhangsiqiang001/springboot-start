package springboot.itgod.study.rabbitmq.designpatter.singleton;

public enum Mgr07 {

    INSTANCE;

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                System.out.println(Mgr07.INSTANCE.hashCode());
            }).start();
        }
    }
}
