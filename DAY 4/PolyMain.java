class Animal {
    String name;
    String sound;

    Animal() {
        this("", "");
    }

    Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    void getInfo() {
        System.out.println("Name = " + name);
        System.out.println("sound = " + sound);
    }

    void getInfo(String name, String sound, int legs) {
        System.out.println("Name = " + name);
        System.out.println("sound = " + sound);
        System.out.println("No. of Legs = " + legs);
    }
}

public class PolyMain {
    public static void main(String[] args) {
        Animal an1 = new Animal("Horse", "Hinggg");
        an1.getInfo();
        an1.getInfo("Cat", "Meow", 4);
    }
}
