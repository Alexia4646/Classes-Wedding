// Alexia-Ana-Maria Popescu
// Hadassah Ofosu-Amoani
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

// I am declaring the Swing components
public class WeddingGUI extends JFrame implements ActionListener {
    JLabel brideLabel = new JLabel("Bride's Information");
    JTextField brideFnField = new JTextField(20);
    JTextField brideLnField = new JTextField(20);
    JLabel maidofHonorLabel = new JLabel("Maid of Honor's Name");
    JTextField maidofHonorField = new JTextField(20);
    JLabel groomLabel = new JLabel("Groom's Information");
    JTextField groomFnField = new JTextField(20);
    JTextField groomLnField = new JTextField(20);
    JLabel bestManLabel = new JLabel("Best Man's Name");
    JTextField bestManField = new JTextField(20);
    JLabel dateLabel = new JLabel("Wedding Date (YYYY-MM-DD)");
    JTextField dateField = new JTextField(20);
    JLabel locationLabel = new JLabel("Location");
    JTextField locationField = new JTextField(20);
    JButton inviteButton = new JButton("Generate Invitation");

    public WeddingGUI() {
        super("Wedding Invitation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 500);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        contentPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    // I am setting the colors for Swing Components
        brideLabel.setForeground(Color.BLUE);
        groomLabel.setForeground(Color.BLUE);
        dateLabel.setForeground(Color.BLUE);
        locationLabel.setForeground(Color.BLUE);

        JPanel bridePanel = new JPanel(new GridLayout(3, 2, 10, 5));
        bridePanel.setBorder(BorderFactory.createTitledBorder("Bride's Information"));
       // I am adding components to the bride's panel
        bridePanel.add(new JLabel("First Name:"));
        bridePanel.add(brideFnField);
        bridePanel.add(new JLabel("Last Name:"));
        bridePanel.add(brideLnField);
        bridePanel.add(maidofHonorLabel);
        bridePanel.add(maidofHonorField);
        contentPanel.add(bridePanel);

        JPanel groomPanel = new JPanel(new GridLayout(3, 2, 10, 5));
        groomPanel.setBorder(BorderFactory.createTitledBorder("Groom's Information"));
       // I am adding components to the groom's panel
        groomPanel.add(new JLabel("First Name:"));
        groomPanel.add(groomFnField);
        groomPanel.add(new JLabel("Last Name:"));
        groomPanel.add(groomLnField);
        groomPanel.add(bestManLabel);
        groomPanel.add(bestManField);
        contentPanel.add(groomPanel);

        // adding the panel for the date and location
        JPanel datePanel = new JPanel(new GridLayout(2, 2, 10, 5));
        datePanel.setBorder(BorderFactory.createTitledBorder("Date and Location"));
        datePanel.add(dateLabel);
        datePanel.add(dateField);
        datePanel.add(locationLabel);
        datePanel.add(locationField);
        contentPanel.add(datePanel);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        inviteButton.setBackground(Color.BLUE);
        inviteButton.setForeground(Color.BLACK);
        buttonPanel.add(inviteButton);
        contentPanel.add(buttonPanel);

        add(contentPanel, BorderLayout.CENTER);

        inviteButton.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // I am retrieving text from input fields
        String brideFn = brideFnField.getText();
        String brideLn = brideLnField.getText();
        String maidofHonor = maidofHonorField.getText();
        String groomFn = groomFnField.getText();
        String groomLn = groomLnField.getText();
        String bestMan = bestManField.getText();
        String weddingDate = dateField.getText();
        String location = locationField.getText();

        try {
            LocalDate date = LocalDate.parse(weddingDate);
            String invitationText = "You are invited to the wedding between:\n\n" +
                    "Bride: " + brideFn + " " + brideLn + "\n" + "Maid of Honor:" + maidofHonor + "\n" +
                    "Groom: " + groomFn + " " + groomLn + "\n" + "Best Man:" + bestMan + "\n" +
                    "Wedding Date: " + date + "\n" +
                    "Location: " + location;
            JOptionPane.showMessageDialog(this, invitationText, "Invitation", JOptionPane.INFORMATION_MESSAGE);
        } catch (DateTimeParseException ex) {
            // show an error message if the date format is wrong
            JOptionPane.showMessageDialog(this, "Invalid date format. Please use YYYY-MM-DD.", "Date Format Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void main(String[]args){
        WeddingGUI weddingGUI = new WeddingGUI();
        weddingGUI.setVisible(true);
    }
}
