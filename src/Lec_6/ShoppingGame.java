package Lec_6;

public class ShoppingGame {
    public static void main(String[] args) {
        int A = 100;
        int B = 200;
        int phones = 1;
        while(true){
            if(A >= phones){
                A-=phones;
                phones++;
            }
            else{
                System.out.println("A loses");
                break;
            }
            if(B >= phones){
                B-=phones;
                phones++;
            }
            else{
                System.out.println("B loses");
                break;
            }
        }
    }
}
