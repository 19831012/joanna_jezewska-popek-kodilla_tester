import java.sql.SQLOutput;//TODO Review: remove import

public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook("600g", 1000, 2019);
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();

        Notebook heavyNotebook = new Notebook("2000g", 1500, 2015);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();

        Notebook oldNotebook = new Notebook("1200g", 500, 2005);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();

        if (notebook.price < 900) {
            System.out.println("This notebook is cheep");
        } else {
            System.out.println("This notebook is quite expensive");

        }

    }
}

