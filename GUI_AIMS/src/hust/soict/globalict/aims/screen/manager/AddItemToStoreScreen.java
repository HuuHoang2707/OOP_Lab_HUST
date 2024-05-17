package hust.soict.globalict.aims.screen.manager;

import hust.soict.globalict.aims.store.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddItemToStoreScreen extends JFrame{
    private store Store;
    public JTextField TfTitle, TfCost, TfID, TfCate;

    public AddItemToStoreScreen(store Store) {
        this.Store = Store;

        // Container cp = getContentPane();
        // cp.setLayout(new GridLayout(4, 2, 5, 5));
        // TfTitle = new JTextField("Enter the Title: ");
        
        // TfID = new JTextField("Enter the ID");

        // TfCost = new JTextField("Enter the cost");

        // TfCate = new JTextField("Enter the Category");
    }
}