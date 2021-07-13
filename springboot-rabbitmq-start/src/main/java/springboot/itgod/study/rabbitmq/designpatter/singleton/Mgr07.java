package springboot.itgod.study.rabbitmq.designpatter.singleton;

//枚举类，即能防止多线程安全问题，又能防止反序列化
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
