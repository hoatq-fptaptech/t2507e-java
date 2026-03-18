package main.session9;

public class Demo {
    public static void main(String[] args){
        Num n = new Num();
        Runnable r = ()->{
            for(int j=0;j<200;j++){
//                synchronized (n){
                    n.increment();
                    n.print();
//                }

                try {
                    Thread.sleep(100);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        };
        Thread t = new Thread(r);
        t.start();

        Runnable r1 = ()->{
            for(int j=0;j<200;j++){
//                synchronized (n){
                n.add();
                n.show();
//                }

                try {
                    Thread.sleep(100);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();

        for(int i=0;i<200;i++){
//           synchronized (n){
               n.increment();
               n.print();
//           }
            try {
                Thread.sleep(100);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }



    }
}
