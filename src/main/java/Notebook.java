public class Notebook {
    String weight;
    int price;
    int year

    public Notebook(String weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;

        public void checkPrice () {
            if (this.price < 600) {
                System.out.println("This notebook is cheap.");
            } else if {
                (this.price > 600 && this.price < 1000)
                System.out.println("This price is good.");
            } else if {
                (this.price > 1000)
                System.out.println("This notebook is expensive");
            }
        }

        public void checkWeight () {
            if (this.weight < 600) {
                System.out.println("This notebook is light");
            } else if {
                (this.weight < 1100)
                System.out.println("This notebook is not very heavy");
            } else if {
                (this.weight > 1100)
                System.out.println("This notebook is heavy");
            }

            public void checkPriceAndYear () {
                if (this.price < 1000 && this.year < 2010) {
                    System.out.println("This computer is cheep and old");
                } else if {
                    (this price > 1000 && this.year > 2010)
                    System.out.println("This computer is  expensive and quite new")
                }
            }
        }
    }
}
