package Lec_6;

public class Func_demo {
    public static void main(String[] args) {
        faltu();
        tu_faltu(5,10,20);
        int lol = add(12,15);
        System.out.println(lol);
    }

    public static void faltu() {
        System.out.println("Kuch nhi krta!!");
    }
    public static void tu_faltu(int a, int b, int c) {
        System.out.println(a+b+c);
        System.out.println("Kuch nhi krta!! bas bolta h "+ a);
    }
    public static int add(int a, int b){
        int c = a=b;
        return c;
    }
}
