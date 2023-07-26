public class TestProgrammers {
    public static void main(String[] args) {

        // Creazione degli oggetti Programmer e definizione dello stato
        Programmer programmer1 = new Programmer();
        //senza getter e set perchè sono public
        programmer1.name = "John";
        programmer1.age = 30;
        programmer1.wearsGlasses = true;

        Programmer programmer2 = new Programmer();
        //senza getter e set perchè sono public
        programmer2.name = "Alice";
        programmer2.age = 25;
        programmer2.wearsGlasses = false;

        // Chiamata dei metodi per il primo oggetto Programmer
        programmer1.drinkCoffee();
        programmer1.printDetails();

        // Chiamata dei metodi per il secondo oggetto Programmer
        programmer2.printDetails();
        programmer2.hasGlasses();
    }
}