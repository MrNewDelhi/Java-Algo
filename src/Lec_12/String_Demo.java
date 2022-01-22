package Lec_12;

public class String_Demo {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(str);
        System.out.println(" LOLOLO ");

        //Size
        int len = str.length();

        //ith character
        char ch = str.charAt(0);
        System.out.println(ch);
        System.out.println(str.charAt(0));

        System.out.println();
        System.out.println("------------");

        //substring
        for(int s = 0; s < str.length(); s++){
            for(int e = s+1; e <= str.length(); e++){
                System.out.println(str.substring(s,e));
            }
        }
        System.out.println(str.substring(2));

        System.out.println(str.indexOf('c'));
        System.out.println(str.indexOf("bc"));

        System.out.println(str.lastIndexOf('c'));
        System.out.println(str.lastIndexOf("cd"));

        System.out.println(str.endsWith("bc"));
        System.out.println(str.startsWith("ab"));

        //Immutability
        String str1 = "hello";
        String str2 = str1 + "1";
        System.out.println(str1==str2);

        String str12 = "hello";
        String str13 = "hello";
        String str14 = "hello";
        String str15 = "hello";
        String str16 = "hello";
        System.out.println(str1 == str16);

        str1 = str1.concat("i");
        System.out.println("------------------");
        System.out.println(str1 == str12);

        String str3 = new String("hello");
        System.out.println(str3 == str1);
    }
}
