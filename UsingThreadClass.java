class UsingThreadClass {
    static class MyThread1 extends Thread {
        public void run() {
            for(int i=0; i<5; i++) {
                System.out.println("hey");
                try {
                    Thread.sleep(1000);
                } catch(Exception e) {}
            }
        }
    }
    static class MyThread2 extends Thread {
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
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        try {
            Thread.sleep(500);
        } catch(Exception e) {}
        t2.start();
    }
}