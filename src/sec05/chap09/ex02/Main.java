package sec05.chap09.ex02;

public class Main
{
    public static void main(String[] args) {
        FoodSafety.announcement();
        //안됨,,
        //store1.announcement();

        YalcoChicken store1 = new YalcoChicken();
//default라서 store1이 사용 가능,,,
        store1.regularInspection();
        store1.cleanKitchen();

    }
}
