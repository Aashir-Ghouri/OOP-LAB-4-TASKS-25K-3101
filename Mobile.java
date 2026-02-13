public class Mobile {
    String brand;
    String model;
    double price;

    Mobile(String Pbrand, String Pmodel, double Pprice){
        this.brand = Pbrand;
        this.model = Pmodel;
        this.price = Pprice;
    }

    Mobile(){
        this("Unknown", "Unknown", 0.0);
    }

    Mobile(String Pbrand, String Pmodel){
        this(Pbrand,Pmodel,0.0);
    }



    public void DisplayInformation(){
        System.out.println("Brand : " + this.brand);
        System.out.println("Model : " + this.model);
        System.out.println("Price : " + this.price);
    }

    public static void main(String[] args){
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile("Samsung", "A32");
        Mobile m3 = new Mobile("Apple", "Iphone 17 Pro", 300000.0);

        System.out.println("Default constructor called.");
        m1.DisplayInformation();
        System.out.println("---------------");

        System.out.println("Constructor with default price called.");
        m2.DisplayInformation();
        System.out.println("---------------");

        System.out.println("Parameterized constructor called.");
        m3.DisplayInformation();
        System.out.println("---------------");
    }
}
