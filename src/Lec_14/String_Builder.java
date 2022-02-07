package Lec_14;

public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("momi momo");
        System.out.println(sb);
        //get character
        System.out.println(sb.charAt(0));
        //last character
        System.out.println(sb.charAt(sb.length()-1));
        //Substring
        System.out.println(sb.substring(0,3));
        System.out.println(sb.lastIndexOf("i"));
        System.out.println(sb.indexOf("mo"));
        sb.append("POP");
        System.out.println(sb);
        sb.insert(1,"LL");
        sb.setCharAt(0, '`');
        System.out.println(sb);
        System.out.println(sb.delete(0,2));

        String ans = sb.toString();
        System.out.println(ans);
    }
}
