public class HwLesson1 {
    public static void main(String[] args) {
        int a = 15;
        int b = 3;

        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(b + " - " + a + " = " + (b - a));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(b + " / " + a + " = " + (b / a));

        //So sánh giữa i++ và ++i
//        ++i     tăng i lên rồi mới lấy i sử dụng
//        i++     lấy i sử dụng trước rồi tăng i lên

//        trong vòng lặp --i và ++i sẽ thực hiện nhanh hơn i-- và i++
//        --i và ++i thì -- được thực hiện trước
//        i++ thực hiện nhanh hơn i = i +1 hoặc  i+=1     vì    i++ là 1 lệnh
    }
}
