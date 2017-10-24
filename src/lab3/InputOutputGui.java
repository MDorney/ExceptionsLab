package lab3;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {
    private NameService nameService;

    public InputOutputGui() {
        nameService = new NameService();
    }

    public void startConversation() {
        
        String fullName = JOptionPane.showInputDialog("Enter full name: (Format: First Last)");
        String lastName = "";
        String msg = "";
        try {
            lastName = nameService.extractLastName(fullName);
            msg = "Based on your input, Your last name should be: " + lastName;
        } catch (IllegalArgumentException iae) {
            msg = iae.getMessage() + " please try again";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
     
}
