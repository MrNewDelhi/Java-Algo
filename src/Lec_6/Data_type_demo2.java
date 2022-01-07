package Lec_6;

public class Data_type_demo2 {
    public static void main(String[] args) {
        if(1>2){
            System.out.println("chalega ?");
        }
        if(2>1){
            System.out.println("chalega ?");
        }

        boolean bb = false;
        if(bb){
            System.out.println("nacho");
        }
        bb = true;
        if(bb){
            System.out.println("nacho");
        }
        if(1 > 2 || bb){
            System.out.println("disfasdisfa");
        }
        System.out.println("===================");
        System.out.println("Hello" + 10 + 20);
        System.out.println(10 + 20 + "hello" + 10 + 20);
        System.out.println(10 + 20 + "hello");
    }
}
