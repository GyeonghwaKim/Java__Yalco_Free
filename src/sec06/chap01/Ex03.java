package sec06.chap01;

public class Ex03 {
    public static void main(String[] args) {
        String str = "바깥쪽";
        {
            //재선언 불가,,
            //String str = "안쪽"; // ⚠️ 불가
        }

        while (true) {
            //String str = "안쪽"; // ⚠️ 불가
        }
    }
}
