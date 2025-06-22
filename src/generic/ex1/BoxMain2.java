package generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);

//        Object object = objectBox.get();
//        Integer integer = (Integer) object;

        Integer integer = (Integer) integerBox.get(); //와 같음 //Object -> Integer 다운캐스팅
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get(); //Object -> String 다운캐스팅
        System.out.println("str = " + str);

    }
}
