class UsingRunnableInterface {
    static class MyThread1 implements Runnable {
        public void run() {
            for(int i=0; i<5; i++) {
                System.out.println("hey");
                try {
                    Thread.sleep(1000);
                } catch(Exception e) {}
            }
        }
    }
    static class MyThread2 implements Runnable {
        public void run() {
            for(int i=0; i<5; i++) {
                System.out.println("hello");
                try {
                    Thread.sleep(1000);
                } catch(Exception e) {}
            }
        }
    }
    public static void main(String[] args) {
        MyThread1 obj1 = new MyThread1();
        MyThread2 obj2 = new MyThread2();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        try {
            Thread.sleep(500);
        } catch(Exception e) {}
        t2.start();
    }
}