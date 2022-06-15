import java.util.StringTokenizer;

public class Cau2 {
    public static void main(String[] args) {
        System.out.println("Bài 2: ");
        String str = "You only live once, but if you do it right, once is enough";
        System.out.println(str);

//        Cách 1:
        String[] arr = str.split(" ");
        System.out.println("Số từ trong chuỗi: " + arr.length);

//        Cách 2:
        StringTokenizer temp = new StringTokenizer(str);
        System.out.println(temp.countTokens());

//        Cách 3:
        System.out.println("Số từ trong chuỗi: " + countWordString(str));

        int count = 0;
        char c = 'o';
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c) {
                System.out.println("Ký tự " + c + " xuất hiện ở: " + i);
                count++;
            }
        }
        System.out.println("Số lần ký tự xuất hiện: " + count);

        System.out.println();
    }

    public static int countWordString(String str) {
        int count = 0;
        boolean check = true;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' ' && str.charAt(i) != '\t' && str.charAt(i) != '\n' ) {
                if(check) {
                    count++;
                    check =false;
                }
            } else {
                check = true;
            }
        }
        return count;
    }
}
