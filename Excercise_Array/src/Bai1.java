public class Bai1 {
    public static String standardize(String s) {
        String rs = new String();
        //Loại bỏ khoảng trắng ở đầu và cuối chuỗi
        s = s.trim();

        //Cắt chuỗi
        String[] temp = s.split("\\s+");

        //Viết in hoa ký tự đầu và viết thường chữ sau
        for (int i = 0; i < temp.length; i++) {
            String firstCharacter = String.valueOf(temp[i].charAt(0)).toUpperCase();
            rs += firstCharacter + temp[i].substring(1).toLowerCase() + " ";
        }
        return rs.trim();
    }
}
