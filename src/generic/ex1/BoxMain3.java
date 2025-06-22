package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {

        GenericBox<Integer> integerBox = new GenericBox<Integer>(); // 생성시점에 T의 타입 결정
        integerBox.set(10);
//        integerBox.set("문자100"); //Integer 타입만 허용, 컴파일 오류
        Integer integer = integerBox.get(); //Integer 타입 변환 (캐스팅 x)
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.set("문자");
        String str = stringBox.get();
        System.out.println("str = " + str);
        
        //원하는 모든 타입 사용가능
        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(10.0);
        System.out.println("doubleBox.get() = " + doubleBox.get());

        //타입 추론 : 생성하는 제네릭 타입 생략가능
        GenericBox<Integer> integerBox2 = new GenericBox<>();
    }
}
