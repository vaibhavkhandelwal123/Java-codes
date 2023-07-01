import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class ConvertCurrency extends JFrame {
    private static final String[] CURRENCIES = {"USD", "EUR", "GBP", "JPY", "CAD", "AUD", "CHF"};
    private static final double[] RATES = {0.014, 0.012, 0.010, 1.54, 0.019, 0.021, 0.013};
    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#.##");

    private JLabel inrLabel, outputLabel;
    private JTextField inrField;
    private JComboBox<String> currencyBox;
    private JButton convertButton;

    public ConvertCurrency() {
        super("Currency Converter");

       
        inrLabel = new JLabel("INR:");
        inrField = new JTextField(10);
        currencyBox = new JComboBox<>(CURRENCIES);
        outputLabel = new JLabel();
        convertButton = new JButton("Convert");

       
        setLayout(new FlowLayout());
        add(inrLabel);
        add(inrField);
        add(currencyBox);
        add(convertButton);
        add(outputLabel);

        
        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    
                    double inr = Double.parseDouble(inrField.getText());

                    
                    String currency = (String) currencyBox.getSelectedItem();
                    int index = currencyBox.getSelectedIndex();
                    double rate = RATES[index];

                    
                    double converted = inr * rate;
                    outputLabel.setText(inr + " INR = " + DECIMAL_FORMAT.format(converted) + " " + currency);
                } catch (NumberFormatException ex) {
                    
                    JOptionPane.showMessageDialog(ConvertCurrency.this, "Invalid input. Please enter a valid amount.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ConvertCurrency();
    }
}
