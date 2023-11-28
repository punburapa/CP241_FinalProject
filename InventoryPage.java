import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InventoryPage extends JFrame {


    private JPanel mainPanel;
    private JPanel Bottom;
    private JTextArea textArea1;
    private JButton homeButton;

    ListADT stock = Pos.stock;
    int stockSize = stock.getSize();
    JFrame frame = new JFrame();
    InventoryPage() throws Exception {
        frame.setContentPane(this.mainPanel);
        frame.setTitle("POS Project");
        frame.setSize(600, 760);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        start();
        fillInventory();
        homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                HomePage homePage = new HomePage();
            }
        });
    }

    private void fillInventory() throws Exception {
        stock.findFirst();
        for(int i=0; i<stockSize; i++){
            String name = ((Stock) stock.retrieve()).getName();
            double quantity = (((Stock) stock.retrieve()).getQuantity());
            if (name.length() <= 6) {
                textArea1.setText(
                        textArea1.getText() + "\n"  +
                        name + "\t\t\t" + quantity
                );
            }
            else if (name.length() <= 12) {
                textArea1.setText(
                        textArea1.getText() + "\n"  +
                                name + "\t\t" + quantity
                );
            }
            else {
                textArea1.setText(
                        textArea1.getText() + "\n"  +
                                name + "\t" + quantity
                );
            }


            stock.findNext();
        }

    }

    public void start() {
        textArea1.setText(
                """
                        ******************************
                        -----------Inventory----------
                        ******************************
                        Item\t\t\tQTY
                        """

        );
    }
}
