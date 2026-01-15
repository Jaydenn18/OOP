public class Main{
    public static void main(String[] args) {
    //     Laptop obj1 = new Laptop();
    //     obj1.brand = "Asus";
    //     obj1.storage = 512;
    //     obj1.memory = 12;
    //     obj1.dimension = 16;
    //     obj1.model = "TUF Gaming 16";
    //     obj1.price = 42000;

    //     Laptop obj2 = new Laptop();
    //     obj2.brand = "Dell";
    //     obj2.storage = 512;
    //     obj2.memory = 8;
    //     obj2.dimension = 16;
    //     obj2.model = "Latitude 7390";
    //     obj2.price = 42000;

    //     obj1.printDetails();

        Society obj1 = new Society();
        obj1.name = "Valor";
        obj1.title = "The Great King";
        obj1.ruler = "Vardy Salor";
        obj1.politicalIdeology = "Absolute Monarchy";
        obj1.religion = "Kingship";
        obj1.population = 8734;

        Society obj2 = new Society();
        obj2.name = "Lumen";
        obj2.title = "The Majestic Queen";
        obj2.ruler = "Lindy Cindy";
        obj2.politicalIdeology = "Democratic";
        obj2.religion = "Mixed";
        obj2.population = 29715;

        obj1.printValue();
        obj2.printValue();
    }
}