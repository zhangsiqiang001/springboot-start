package springboot.itgod.study.rabbitmq.javatest.second;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;

/**
 *
 *和第一个相比 多了一个ack确认机制
 * 这个称为工作队列（异步消费）
 */

public class TaskRecvMq {
    private final static String QUEUE_NAME = "hello";

    public static void main(String[] args) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("139.196.197.153");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        DeliverCallback deliverCallback = ((consumerTag, message) -> {
            String messages = new String(message.getBody(), "utf-8");
            System.out.println(" [x]收到'" + message + "'");
            try {
                doWork(messages);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("[x] Done");
            }

        });
        boolean autoAck = true;
        channel.basicConsume(QUEUE_NAME, autoAck, deliverCallback, CancelCallback -> {
        });
    }

    private static void doWork(String messages) throws InterruptedException {

        if (messages.equals("hello world")) Thread.sleep(10000L);

    }
}