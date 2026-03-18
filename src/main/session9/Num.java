package main.session9;

public class Num {
    int x =0;
    int y= 0;
    int a = 0;
    int b = 0;

    public synchronized void show(){
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    public synchronized void add(){
        a++;
        b++;
    }

    public synchronized void print(){
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
    public synchronized void increment(){
        x++;
        y++;
    }
}
