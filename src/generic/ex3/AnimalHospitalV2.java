package generic.ex3;


import generic.animal.Animal;

public class AnimalHospitalV2<T> {

    private T animal;

    public void set(T animal) {

        this.animal = animal;
    }

    public void checkup() {

        //T의 타입을 메서드를 정의하는 시점에는 알수 없다. Object의 기능만 사용
//        System.out.println("동물 이름: " + animal.getName());
//        System.out.println("동물 크기: " + animal.getSize()); //T 에 어떤것이 올지 모르니까  Animal의 메소드는 제네릭에서 사용못함
//        animal.sound();
    }
//    public T bigger(Animal target) {
//        return animal.getSize() > target.getSize() ? animal : target;
//    }

}
