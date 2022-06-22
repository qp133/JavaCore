public interface ITeacher {

    void abstractMethod();

    int method(int a, int b);

    default void myMethod() {       //Có thể tạo phương thức trong Interface bằng từ khóa default

    }

}
