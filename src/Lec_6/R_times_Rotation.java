package Lec_6;

public class R_times_Rotation {
    public static void main(String[] args) {
        int n = 123456;
        int temp = n;
        int nod = 0;
        while(n > 0){
            n /= 10;
            nod++;
        }
        int rot = 7;
        rot %= nod;
//        while(rot > 0){
//            int digit = temp % 10;
//            temp/=10;
//            temp = (digit * (int)Math.pow(10, nod-1)) + temp;
//            System.out.println(temp);
//            rot--;
//        }
        temp = ((temp % (int)Math.pow(10,rot)) * (int)Math.pow(10, nod-rot)) + (temp / (int)Math.pow(10,rot));
        System.out.println(temp);
    }
}
