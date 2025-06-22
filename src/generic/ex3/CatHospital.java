package generic.ex3;


import generic.animal.Cat;

public class CatHospital {

    private Cat animal;

    public void set(Cat anmimal) {

        this.animal= anmimal;
    }

    public void checkup() {
        System.out.println("동물 이름: " +animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    public Cat bigger(Cat target) {

        return animal.getSize() > target.getSize() ? animal : target;
    }
}
