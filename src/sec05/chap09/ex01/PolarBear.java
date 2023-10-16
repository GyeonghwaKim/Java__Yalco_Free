package sec05.chap09.ex01;


public class PolarBear extends Mamal implements Hunter, Swimmer {
    public PolarBear() {
        super(false);
    }
//반드시 필요 ... implements 헀으니까
    @Override
    public void hunt() {
        System.out.println(position + ": 물범 사냥");
    }

    @Override
    public void swim() {
        System.out.println("앞발로 수영");
    }
}