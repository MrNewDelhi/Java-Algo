package Lec_13;

public class StringImmutable {
    public static void main(String[] args) {

        // it doesnt take constant time instead it takes more than 1 as the
        // new string created and then added in this
        // everytime new string is created and copy the contents and then new is added
        // n + n(n+1)/2  complexity is n2
        // that's why we use stringBuilder
        String str = "";
        long start = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            str = str + i;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
