package _00_Intro_To_ArrayLists;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class _02_GuestBook implements ActionListener {
    /*
     * Create a GUI with two buttons. One button reads "Add Name" and the other
     * button reads "View Names". When the add name button is clicked, display
     * an input dialog that asks the user to enter a name. Add that name to an
     * ArrayList. When the "View Names" button is clicked, display a message
     * dialog that displays all the names added to the list. Format the list as
     * follows:
     * Guest #1: Bob Banders
     * Guest #2: Sandy Summers
     * Guest #3: Greg Ganders
     * Guest #4: Donny Doners
     */

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton viewNames = new JButton();
    JButton addName = new JButton();
    ArrayList<String> names = new ArrayList<String>();

    void CreateUI(){
        frame.add(panel); panel.add(viewNames); panel.add(addName);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); frame.setVisible(true);
        viewNames.setText("View Names"); addName.setText("Add Name");
        viewNames.addActionListener(this); addName.addActionListener(this);
        frame.pack();
    }

    public static void main(String[] args) {
        _02_GuestBook guestBook = new _02_GuestBook();
        guestBook.CreateUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==viewNames) {
            String message = "";
            int i = 0;
            for (String name:names) {
                i++;
                message += "Guest #" + i + ": " + name +System.lineSeparator();
            }
            JOptionPane.showMessageDialog(null, message);
        } else if(e.getSource()==addName) {
            String addThisName = JOptionPane.showInputDialog("What name would you like to add? (Firstname Lastname)");
            names.add(addThisName);
        }
    }
}
