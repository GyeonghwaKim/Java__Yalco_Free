package sec06.chap03.ex01;

public class Main {
    public static void main(String[] args) {
        //내부 클래스의 선언 법 ,,,(정적 내부 클래스)
        //  ⭐️ 클래스가 클래스 필드인 것 - 아래의 변수는 인스턴스
        Outer.InnerSttcMember staticMember = new Outer.InnerSttcMember();
        staticMember.func();

        System.out.println("\n- - - - -\n");

        Outer outer = new Outer();
        outer.innerFuncs();

        System.out.println("\n- - - - -\n");

//내부 클래스의 선언 법 ,,,(멤버 인스턴스)
        //  ⚠️  아래와 같은 사용은 불가
        //  Outer.InnerInstMember innerInstMember = new outer.InnerInstMember();

        //  💡 인스턴스 내부 클래스는 이렇게 얻을 수 있음
        Outer.InnerInstMember innerInstMember = outer.getInnerInstMember();
        innerInstMember.func();

        System.out.println("\n- - - - -\n");

        outer.memberFunc();
    }
}
