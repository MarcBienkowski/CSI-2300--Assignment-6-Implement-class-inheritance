class Animal{
    public int age;
    public String gender;

    public void isMammal() {
        System.out.println("This animal is a mammal");
    }
    public void mate() {
        System.out.println("This animal is mating");
    }


    public static void main(String[] args) throws Exception {
        Animal Animal = new Animal();
        Fish Fish = new Fish();
        Zebra Zebra = new Zebra();

        Animal.isMammal();
        Animal.mate();
        Zebra.isMammal();
        Zebra.mate();
        Zebra.run();


    }
}

class Fish extends Animal{
    private int sizeInFeet;
    private void canEat() {
        System.out.println("This is a private method canEat() from class Zebra");
    }

}
class Zebra extends Animal{
    public boolean is_wild;
    public void run() {
        System.out.println("Zebra's can run");
    }
}

    
