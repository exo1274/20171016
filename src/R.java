public class R {
    public static void main(String[] args) {
        //顯示訊息
        java.util.Scanner sc = new java.util.Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println(Integer.toHexString(ch));
    }
}
