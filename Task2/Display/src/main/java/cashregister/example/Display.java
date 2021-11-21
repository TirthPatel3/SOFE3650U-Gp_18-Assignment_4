package cashregister.example;


import javax.swing.*;
import java.awt.*;

public class Display extends JFrame {


    public static void main(String[] args){
      String appName = "Cash Register Application";
        JFrame f= new JFrame(appName);
        JLabel l1,l2,l3;
        l1=new JLabel("Welcome to Cash Register Application");
        l1.setBounds(0,0, 500,30);
        l1.setHorizontalAlignment(JLabel.CENTER);

        int UPC;
        Observer product;
        ProductDB productDB = new ProductDB();
        String input = JOptionPane.showInputDialog(null,"Enter UPC: ");
        UPC = Integer.parseInt(input);
        product = productDB.GetProductInfo(UPC);
        l2=new JLabel("Product Information:");
        l2.setBounds(0,25, 500,30);
        l2.setHorizontalAlignment(JLabel.LEFT);

        l3=new JLabel(""+ product);
        l3.setBounds(0,45, 500,30);
        l3.setHorizontalAlignment(JLabel.LEFT);

        f.add(l1); f.add(l2); f.add(l3);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
