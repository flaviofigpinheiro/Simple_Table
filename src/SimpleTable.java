import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SimpleTable extends JPanel {

    private static boolean DEBUG = true;

    public static void main(String[] args) {
        // write your code here
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }

        });

    }


    public SimpleTable() {

        super(new GridLayout(1, 0));

        String[] columnNames = {"Real Name", "Super Hero Name", "Speed", "Power", "Tier"};
        Object[][] data = {
                {"Katy", "Smith", "SnowB", 5, false},
                {"John", "Doe", "Rowing", 3, true}


        };

        final JTable table = new JTable(data, columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(500, 70));
        table.setFillsViewportHeight(true);

        JScrollPane scrollPane = new JScrollPane((table));

        add(scrollPane);


    }


    private static void createAndShowGUI() {
        if (DEBUG) {
            if (DEBUG) {
                System.out.println("Hello world SimpleTable");
            }
            JFrame frame = new JFrame("SimpleDemo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


            SimpleTable newContentPane = new SimpleTable();
            newContentPane.setOpaque(true);
            frame.setContentPane(newContentPane);


            frame.pack();
            frame.setVisible(true);


        }
    }
}
