class Item {
    int id;
    String name;
    double price;
    Character c;


    //TODO add variable.


    //TODO constructor

    public Item(int id, String name, double price, Character c) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.c = c;
    }


    //TODO setters and getters


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Character getC() {
        return c;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setC(Character c) {
        this.c = c;
    }

    double taxReturn () {
        //TODO
        double a = 0;
        if (c == 'A'){
            a = (price * 0.18 ) * 0.15;
        }
        else if(c == 'B'){
            a = (price * 0.5 ) * 0.15;
        }
        else{
            a = (price * 0 ) * 0.15;
        }
        return  a;
    }
}