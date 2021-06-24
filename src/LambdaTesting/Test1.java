package LambdaTesting;

public class Test1 {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hi in Traditional Anonymous Class Implementation");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();


        Runnable runnable1 =
                () -> System.out.println("In Lambda Function ");

        Thread thread1 = new Thread(runnable1);
        thread1.start();

        Thread thread2 = new Thread(() -> System.out.println("In modern way of " +
                "implementing functional interface using lambda expression"));
        thread2.start();
    }

}
