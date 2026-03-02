package main.session8;

public class Main {
    public static void main(String[] args){
        NumberList<Integer> n1 = new NumberList<>();
        n1.x = 20;
        NumberList<Float> n2= new NumberList<>();
        n2.x = 20.0f;
        NumberList<String> n3 = new NumberList<>();
        n3.x = "Hello";

        n3.info(5.9,"A");
    }
}
