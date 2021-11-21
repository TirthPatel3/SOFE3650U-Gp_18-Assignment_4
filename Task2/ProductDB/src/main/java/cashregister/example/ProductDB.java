package cashregister.example;

import javax.swing.*;

public class ProductDB extends JFrame {
    String[] product1 = {"21445", "BMW", "54000.00"};
    String[] product2 = {"21446", "Audi", "129000.00"};
    String[] product3 = {"21447", "Mercedes", "148140.00"};

    Observer info = null;
    public Observer GetProductInfo(int barcode){
        int UPC = Integer.parseInt(product1[0]);
        String name = product1[1];
        float price = Float.parseFloat(product1[2]);
        if (UPC == barcode) {
            info = new Observer (name ,price,UPC);
        }
        else
            JOptionPane.showMessageDialog(null,"Product Not Found. Incorrect Barcode!!");
        return info;
    }
}
