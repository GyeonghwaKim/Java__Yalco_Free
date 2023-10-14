package sec05.chap02.ex01;


public class Slime {
    //생성자가 꼭 필요한 것아님 ..
    //모든 슬라임의 기본 스탯은 동일하기에 생성자 필요없음
    double hp = 50;
    int attack = 8;
    double defense = 0.2;

    void attack (Slime enemy) { // 💡 다른 슬라임의 인스턴스를 인자로 받음
        enemy.hp -= attack * (1 - enemy.defense);
    }
}
