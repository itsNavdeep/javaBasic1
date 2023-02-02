public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Tony");
        System.out.println(sb);
//        set char
        sb.setCharAt(0,'P');
        System.out.println(sb);
//        Insert
        sb.insert(0,'S');
        System.out.println(sb);
//        Delete part of string
        sb.delete(0,1);
        System.out.println(sb);

//      Append
        sb.append("Stark");
        System.out.println(sb);

    }
}
