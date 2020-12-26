public class Main {
    public static void main(String[] args) {
        //threads are useful to run multiple pieces of code at the same time
        
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<5; i++){
                    System.out.println("Printing " + i+ " in a worker thread");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();

        for(int i=0; i<5; i++){
            System.out.println("Printing " + i+ " in a main thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        int a =2;
        int b = 0;
        try{
            System.out.println(a/b);
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("B was zero");
        }
    }
}
