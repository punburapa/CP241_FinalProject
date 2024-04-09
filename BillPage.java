import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BillPage extends JFrame {

    private JPanel mainPanel;
    private JPanel Header;
    private JTextArea textArea1;
    private JButton homeButton;
    JFrame frame = new JFrame();
    ListADT bill = Pos.bill;

    BillPage() throws Exception {
        frame.setContentPane(this.mainPanel);
        frame.setTitle("POS Project");
        frame.setSize(600, 760);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        start();
        fillBill();

        homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                HomePage homePage = new HomePage();
            }
        });
    }

    private void fillBill() throws Exception {
        bill.findFirst();
        for(int i=0; i<bill.getSize(); i++){
            String name = ((Bill) bill.retrieve()).getCustomerName();
            Order[] orders = ((Bill) bill.retrieve()).getOrder();
            double total = ((Bill) bill.retrieve()).getTotal();
            int size = orders.length;
            textArea1.setText(
                    textArea1.getText() + "\n" +
                    "Customer Name : " + name + "\n" +
                            "Order" + "\t\t\t" + "Quantity"
            );
            for(int j=0; j<size; j++) {
                String orderName = orders[j].getName();
                int orderQuan = orders[j].getQuantity();
                if (orderQuan != 0) {
                    if (name.length() <= 6) {
                        textArea1.setText(
                                textArea1.getText() + "\n"  +
                                         orderName + "\t\t\t" +
                                         orderQuan
                        );
                    }
                    else if (name.length() <= 12) {
                        textArea1.setText(
                                textArea1.getText() + "\n"  +
                                        orderName + "\t\t" +
                                        orderQuan
                        );
                    }
                    else {
                        textArea1.setText(
                                textArea1.getText() + "\n"  +
                                        orderName + "\t" +
                                        orderQuan
                        );
                    }

                }
            }
            textArea1.setText(
                    textArea1.getText() + "\n" +
                            "----------------------------------------------\n"
            );
            bill.findNext();
        }

    }

    public void start() {
        textArea1.setText(
                """
                        *****************************
                        -------------Bill------------
                        *****************************
                                              """

        );
    }
}
