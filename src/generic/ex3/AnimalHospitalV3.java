package generic.ex3;


import generic.animal.Animal;

public class AnimalHospitalV3<T extends Animal> {  //Animal 상속하는 자식들까지 가능

    private T animal;

    public void set(T animal) {

        this.animal = animal;
    }

    public void checkup() {

        //T의 타입을 메서드를 정의하는 시점에는 알수 없다. Object의 기능만 사용
       System.out.println("동물 이름: " + animal.getName());
       System.out.println("동물 크기: " + animal.getSize()); // Animal 의 자식들은 Animal의 기능을 사용가능
       animal.sound();
    }
    public T bigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }

}
