package sec05.chap09.ex01;
//직접 구현,,
public class Turtle extends Reptile implements Swimmer,Hunter{


    public Turtle() {
        System.out.println("거북이는 파충류다");
    }

    @Override
    public boolean isColdBlooded() {
        return super.isColdBlooded();
    }


    @Override
    public void hunt() {
        System.out.println("거북이한테 공격당하면 아파요");

    }

    @Override
    public void swim() {

    }
}
