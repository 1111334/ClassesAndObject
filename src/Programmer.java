public class Programmer {

    //Variabili di istanza
    String name;
    int age;
    Boolean wearsGlasses;


    //Metodi
    public void drinkCoffee() {
        System.out.println("Espresso is the secret!");
    }

    public void printDetails() {
        System.out.println(name + " is a " + age + " -yo programmer");
    }

    public void hasGlasses() {
        System.out.println("Is " + name + " wearing glasses? " + wearsGlasses);
    }
}

