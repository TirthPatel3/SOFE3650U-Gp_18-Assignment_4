package cashregister.example;

public class Observer {
    private String _name;
    private float _price;
    private int UPC;

    public Observer(String name, float price, int barcode){
        _name = name;
        _price = price;
        UPC = barcode;
    }
    public String toString() {
        return "Name=" + _name + " | Price= $" + _price + " | Barcode=" + UPC +" |";
    }
}
