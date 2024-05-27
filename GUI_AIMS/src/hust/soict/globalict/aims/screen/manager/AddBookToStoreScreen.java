package hust.soict.globalict.aims.screen.manager;
import hust.soict.globalict.aims.store.*;
import hust.soict.globalict.aims.media.*; 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.zone.ZoneOffsetTransitionRule.TimeDefinition;

public class AddBookToStoreScreen extends JFrame{
    private store Store;
    private JButton btnSubmit;
    public JTextField TfTitle, TfCost, TfID, TfCate;

    JMenuBar createMenubar() {
        JMenu menu = new JMenu("Options");
        
        JMenuItem viewStore = new JMenuItem("View Store");
        viewStore.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        menu.add(viewStore);

        JMenu smUpdateStore  = new JMenu("Update Store");

        JMenuItem addBook = new JMenuItem ("Add Book");
        smUpdateStore.add(addBook);
        addBook.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                new AddBookToStoreScreen(Store);
            }
        });

        JMenuItem addCD = new JMenuItem ("Add CD");
        smUpdateStore.add(addCD);
        addCD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                new AddCDToStoreScreen(Store);
            }
        });

        JMenuItem addDVD = new JMenuItem ("Add DVD");
        smUpdateStore.add(addDVD);
        addDVD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                new AddDVDToStoreScreen(Store);
            }
        });
        menu.add(smUpdateStore);
        
        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);
        return menuBar;
    }

    JPanel createNorth() {
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenubar());
        return north;
    }

    JPanel createSouth () {

        JPanel south = new JPanel();
        south.setLayout(new BoxLayout(south, BoxLayout.X_AXIS));
        btnSubmit = new JButton("Submit");
        btnSubmit.setAlignmentX(CENTER_ALIGNMENT);
        south.add(btnSubmit);
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
			    int numberIn = Integer.parseInt(TfID.getText());
                float c = Float.parseFloat(TfCost.getText());
                Book tmp = new Book(numberIn, TfTitle.getText(), TfCost.getText() ,c);
                Store.addMedia(tmp);
                new StoreManagerScreen(Store);
            }
        });
        return south;
    }

    JPanel createCenter() {
        
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(4, 2, 5, 5));
        center.add(new JLabel("Enter the Title"));

        TfTitle = new JTextField();
        center.add(TfTitle);
        
        center.add(new JLabel("Enter the ID"));

        TfID = new JTextField();
        center.add(TfID);

        center.add(new JLabel("Enter the Cost"));

        TfCost = new JTextField();
        center.add(TfCost);

        center.add(new JLabel("Enter the Category"));

        TfCate = new JTextField();
        center.add(TfCate);
        return center;   
    }

    public AddBookToStoreScreen (store Store) {
        this.Store = Store;
        
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());        
        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);
        cp.add(createSouth(), BorderLayout.SOUTH);
        
        setTitle("Store");
        setSize(1024, 768);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
