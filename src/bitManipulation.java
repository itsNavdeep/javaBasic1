public class bitManipulation {
    public static void main(String[] args) {
//        Get bit (bit operation)
//        1st step make bit mask and then perform and operation
        int n = 5;
        int pos = 2;
        int bitmask = 1 << pos;
        if ((bitmask & n) == 0) {
            System.out.println("Bit was zero");
        } else {
            System.out.println("Bit was One");
        }
//        SET
        int new_num = bitmask | n;
        System.out.println(new_num);
//        CLEAR
        int notBitmask=~bitmask;
        int new_n=notBitmask&n;
        System.out.println(new_n);
//        UPDATE THE 2 ND BIT (POSITION=1) OF A NUMBER N TO 1

    }
}
