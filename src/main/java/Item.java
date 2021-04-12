public class Item {
    private final String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
    //get name
    public String getName() {
        return name;
    }
    public int getPrice(){ return price;}
    @Override
    public String toString(){
        return  name + ":"
                + price
                + "\n"
                ;
    }
}
