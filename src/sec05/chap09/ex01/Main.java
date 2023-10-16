package sec05.chap09.ex01;

public class Main {
    public static void main(String[] args) {
        //  ⭐ 다형성
        PolarBear polarBear = new PolarBear();
        Mamal mamal = polarBear;
        Swimmer swimmer = polarBear;


        GlidingLizard glidingLizard = new GlidingLizard();
        Eagle eagle = new Eagle();

        Hunter[] hunters = {
                polarBear, glidingLizard, eagle
        };

        //  💡 인터페이스 역시 다형성에 의해 자료형으로 작용 가능
        for (Hunter hunter : hunters) {
            hunter.hunt();
        }

        FlyingSquirrel flyingSquirrel=new FlyingSquirrel();
        Turtle turtle=new Turtle();
        Penguin penguin=new Penguin();

        Hunter[] newHunters={
                flyingSquirrel,turtle,penguin
        };

        for (Hunter hunter:newHunters){
            hunter.hunt();
        }

    }
}
