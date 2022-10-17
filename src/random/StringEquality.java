package random;

public class StringEquality {
    public static void main(String[] args) {

        String s1 = "JAVA";
        String s2 = "JAVA";
        StringBuilder sb = new StringBuilder();
        sb.append("JA").append("VA");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == sb.toString());
        System.out.println(s1.equals(sb.toString()));
    }
}
