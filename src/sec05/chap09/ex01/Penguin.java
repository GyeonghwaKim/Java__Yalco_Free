package sec05.chap09.ex01;

import static java.lang.System.*;

//직접구현,,
public class Penguin extends Bird implements Swimmer,Hunter{

    @Override
    public void reproduce() {
        out.println("펭귄이 알을 낳았다");
    }

    @Override
    public void hunt() {
        out.println("펭귄이 사냥을 성공했다");

    }

    @Override
    public void swim() {
        out.println("펭귄이 수영을 하고 있다");

    }
}
