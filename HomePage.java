import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Objects;

public class HomePage extends JFrame {
    private int count=0;
    private int menu1_counter = 0;
    private int menu2_counter = 0;
    private int menu3_counter = 0;
    private int menu4_counter = 0;
    private double total=0.0;

    private JPanel Bottom;
    private JPanel Title_;
    private JLabel Title;
    JPanel mainPanel;
    private JButton payButton;
    private JButton resetButton;
    private JTextField Customer_Name;
    private JLabel CustomerLabel;
    private JPanel MenuPanel;
    private JPanel menu1;
    private JSpinner spinner1;
    private JCheckBox checkBox1;
    private JPanel menu2;
    private JPanel menu3;
    private JPanel menu4;
    private JSpinner spinner2;
    private JSpinner spinner3;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JCheckBox checkBox4;
    private JButton inventoryButton;
    private JButton billButton;
    private JTextArea textArea1;
    private JPanel Header;
    private JPanel Customer;
    private JPanel Bottom_ButtonPanel;
    private JPanel textAreaPanel;
    private JButton exitButton;
    private JSpinner spinner4;
    private JLabel changeLabel;
    private JLabel totalLabel;
    private JLabel cashLabel;
    private JTextField cashInput;
    JFrame frame = new JFrame();

    HomePage() {
        frame.setContentPane(this.mainPanel);
        frame.setTitle("POS Project");
        frame.setSize(800, 760);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cashInput.setText("0.0");


        checkBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int qty = Integer.parseInt(spinner1.getValue().toString());
                if(qtyIsZero(qty) && checkBox1.isSelected()) {
                    count++;
                    if(count==1){
                        start();
                    }
                    double price = qty*45;
                    menu1_counter++;
                    total += price;
                    totalLabel.setText("Total : " + total);
                    textArea1.setText(
                            textArea1.getText() + count +
                                    ". " +
                                    "Kai Jeaw" +
                                    "\t\t" + qty +
                                    "\t" + "45"+
                                    "\t" + price + "\n"
                    );

                }
                else {
                    checkBox1.setSelected(false);
                }
            }
        });
        checkBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int qty = Integer.parseInt(spinner2.getValue().toString());
                if(qtyIsZero(qty) && checkBox2.isSelected()) {
                    count++;
                    if(count==1){
                        start();
                    }
                    double price = qty*50;
                    menu2_counter++;
                    total += price;
                    totalLabel.setText("Total : " + total);
                    textArea1.setText(
                            textArea1.getText() + count +
                                    ". " +
                                    "Pork Krapao" +
                                    "\t\t" + qty +
                                    "\t" + "50"+
                                    "\t" + price + "\n"
                    );
                }
                else {
                    checkBox2.setSelected(false);
                }
            }
        });checkBox3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int qty = Integer.parseInt(spinner3.getValue().toString());
                if(qtyIsZero(qty) && checkBox3.isSelected()) {
                    count++;
                    if(count==1){
                        start();
                    }
                    double price = qty*65;
                    menu3_counter++;
                    total += price;
                    totalLabel.setText("Total : " + total);
                    textArea1.setText(
                            textArea1.getText() + count +
                                    ". " +
                                    "Beef Krapao" +
                                    "\t\t" + qty +
                                    "\t" + "65"+
                                    "\t" + price + "\n"
                    );
                }
                else {
                    checkBox3.setSelected(false);
                }
            }
        });checkBox4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int qty = Integer.parseInt(spinner4.getValue().toString());
                if(qtyIsZero(qty) && checkBox4.isSelected()) {
                    count++;
                    if(count==1){
                        start();
                    }
                    menu4_counter++;
                    double price = qty*60;
                    total += price;
                    totalLabel.setText("Total : " + total);
                    textArea1.setText(
                            textArea1.getText() + count +
                                    ". " +
                                    "Crab Fried Rice" +
                                    "\t" + qty +
                                    "\t" + "60"+
                                    "\t" + price + "\n"
                    );
                }
                else {
                    checkBox4.setSelected(false);
                }
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reset();
            }
        });
        payButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double cash = Double.parseDouble(cashInput.getText());
                if(total == 0)
                    JOptionPane.showMessageDialog(null, "Please Choose Item before Pay");
                else if(cash == 0)
                    JOptionPane.showMessageDialog(null, "Please Enter cash before Pay");
                else {
                    double change = cash - total;
                    if (change < 0)
                        JOptionPane.showMessageDialog(null, "Please Enter enough Cash!");
                    else {
                        changeLabel.setText("Change : " + change);
                        Order order1 = new Order("Kai Jeaw", menu1_counter);
                        Order order2 = new Order("Pork Krapao", menu2_counter);
                        Order order3 = new Order("Meat Krapao", menu3_counter);
                        Order order4 = new Order("Crab Fried Rice", menu4_counter);
                        Order[] orders = new Order[4];
                        orders[0] = order1;
                        orders[1] = order2;
                        orders[2] = order3;
                        orders[3] = order4;
                        Bill bill;
                        if(Objects.equals(Customer_Name.getText(), "")) {
                             bill = new Bill(orders, total);
                        }
                        else {
                             bill = new Bill(Customer_Name.getText(), orders, total);
                        }
                        try {
                            Pos.bill.add(bill);
                            System.out.println("add!");
                        } catch (Exception ex) {
                            throw new RuntimeException(ex);
                        }

                        JOptionPane.showMessageDialog(null, "Pay Successfully Transaction Recorded");
                    }
                }

            }
        });
        inventoryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    frame.dispose();
                    InventoryPage inventoryPage = new InventoryPage();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        billButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    frame.dispose();
                    BillPage billPage = new BillPage();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }

    public void start() {
        textArea1.setText(
                """
                        **********************************************
                        -------------------WELCOME--------------------
                        **********************************************
                        Item\t\t\tQTY\tPrice\tTotal
                        """

        );
    }

    public void reset() {
        count=0;
        menu1_counter=0;
        menu2_counter=0;
        menu3_counter=0;
        menu4_counter=0;
        total=0;
        checkBox1.setSelected(false);
        checkBox2.setSelected(false);
        checkBox3.setSelected(false);
        checkBox4.setSelected(false);
        textArea1.setText("");
        spinner1.setValue(0);
        spinner2.setValue(0);
        spinner3.setValue(0);
        spinner4.setValue(0);
        Customer_Name.setText("");
        cashInput.setText("0.0");
        totalLabel.setText("Total : ");
        changeLabel.setText("Change : ");
    }

    public boolean qtyIsZero(int qty) {
        if(qty==0) {
            JOptionPane.showMessageDialog(null, "Please increase the item quantity");
            return false;
        }
        return true;
    }
}
