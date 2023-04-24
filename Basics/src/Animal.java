public class Animal {
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void Sound() {
        System.out.println("All animals have different sound");
    }
}

class Dog extends Animal {
    String sound;

    public Dog() {
        sound = "bow wow bow";
    }
    @Override
    public void Sound() {
        super.Sound();
        System.out.println("Dog says ..." + sound);
    }
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.Sound();
        a1.setName("Bulldog");
        System.out.println(a1.getName());
        Dog bulldog = new Dog();
        bulldog.Sound();

    }
}

