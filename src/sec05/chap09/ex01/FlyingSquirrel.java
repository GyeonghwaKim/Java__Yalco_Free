package sec05.chap09.ex01;
//직접 구현 ,,
public class FlyingSquirrel extends Mamal implements Flyer,Hunter{
    public FlyingSquirrel() {
        super(false);
        System.out.println("귀여운 "+aka);
    }


    @Override
    public void fly() {

    }

    @Override
    public void hunt() {
        System.out.println("날다람쥐의 공격!!");

    }
}
