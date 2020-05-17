public class Notebook {
    String weight;//TODO Review: change to int
    int price;
    int year//TODO Review: missing semicolon

    public Notebook(String weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
        //TODO Review: missing } to close constructor
        public void checkPrice(){
            if (this.price < 600) {
                System.out.println("This notebook is cheap.");
            } else if {//TODO Review: remove {
                (this.price > 600 && this.price < 1000)//TODO Review:  { should be here
                System.out.println("This price is good.");
            } else if {//TODO Review: remove {
                (this.price > 1000)
                System.out.println("This notebook is expensive");
            }
        }

        public void checkWeight () {
            if (this.weight < 600) {
                System.out.println("This notebook is light");
            } else if {//TODO Review: remove {
                (this.weight < 1100)
                System.out.println("This notebook is not very heavy");
            } else if {//TODO Review: remove {
                (this.weight > 1100)
                System.out.println("This notebook is heavy");
            }

            public void checkPriceAndYear () {
                if (this.price < 1000 && this.year < 2010) {
                    System.out.println("This computer is cheep and old");
                } else if {//TODO Review: remove {
                    (this price > 1000 && this.year > 2010)
                    System.out.println("This computer is  expensive and quite new")//TODO Review: missing semicolon
                }
            }
        }
    }
}
