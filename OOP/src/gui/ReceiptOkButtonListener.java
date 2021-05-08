package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import model.User;

//button to go to admin rental menu 
public class ReceiptOkButtonListener implements ActionListener{

	private JFrame frame;
    private User user;
    
    public ReceiptOkButtonListener (JFrame frame,User user)
    {
        this.frame=frame;
        this.user = user;
    }

	public void actionPerformed(ActionEvent arg0) 
    {
        ViewAdminRentalMenu menu = new ViewAdminRentalMenu(user);
        menu.setVisible(true);
		frame.dispose();
	}

}
