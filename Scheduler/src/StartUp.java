import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.Border;
public class StartUp extends JFrame implements ActionListener{	
/**
 * This software is created to be used as a simple version of weekly Jobs/Calls schedule generator.
 * Created by Helvijs.
	 * 
	 */
	private static final long serialVersionUID = 01;
	
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
	JFrame Panel = new JFrame();
	JPanel cardPanel = new JPanel();
	Font labelFont = (new Font("arial",5,25));
	Font ButtonFont = (new Font("arial", 15, 35));
	Border border = BorderFactory.createLineBorder(Color.MAGENTA.darker(),5);
	JButton btn1, btn2, btn3,exit;
	static JLabel lbl1, lbl2, lbl3;
	JPanel card1 = new JPanel();
	JPanel card2 = new JPanel();
	
public static void main(String [] args) {
	
	new StartUp();
}

public StartUp() {

	Panel.setSize(900, 600);
	Panel.setLocationRelativeTo(null);
	Panel.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	Panel.setTitle("Scheduler");
	Panel.setLayout(null);
	//Panel.getContentPane().setBackground( Color.gray.brighter() );


	lbl1 = new JLabel("Not connected");
	lbl1.setFont(labelFont);
	lbl1.setSize(300,30);
	lbl1.setLocation(5,530);
	Panel.add(lbl1);
	
	lbl2 = new JLabel("");
	lbl2.setFont(labelFont);
	lbl2.setSize(400,30);
	lbl2.setLocation(300,530);
	Panel.add(lbl2);
	
	btn1 = new JButton("Create Schedule");
	btn1.setEnabled(true);
	btn1.setSize(150,50);
	btn1.setLocation(10,30);
	btn1.setContentAreaFilled(false);
	btn1.addActionListener(this);
	btn1.setOpaque(false);
	btn1.setBorder(border);
	Panel.add(btn1);
	
	btn2 = new JButton("History");
	btn2.setSize(150,50);
	btn2.setLocation(10,100);
	btn2.setEnabled(true);
	btn2.setContentAreaFilled(false);
	btn2.setOpaque(false);
	btn2.addActionListener(this);
	btn2.setBorder(border);
	Panel.add(btn2);
	
	btn3 = new JButton("Options");
	btn3.setSize(150,50);
	btn3.setLocation(10,170);
	btn3.setEnabled(true);
	btn3.setContentAreaFilled(false);
	btn3.setOpaque(false);
	btn3.addActionListener(this);
	btn3.setBorder(border);
	Panel.add(btn3);
	
	exit = new JButton("EXIT");
	exit.setSize(150,50);
	exit.setLocation(10,480);
	exit.setEnabled(true);
	exit.setContentAreaFilled(false);
	exit.addActionListener(this);
	exit.setOpaque(false);
	exit.setBorder(border);
	Panel.add(exit);
	
	
	cardPanel = new JPanel();
	cardPanel.setSize(650,500);
	cardPanel.setLocation(200,30);
	cardPanel.setBackground(Color.cyan.brighter());
	cardPanel.setLayout(new CardLayout());
	Panel.add(cardPanel);
	cardPanel.add(card1, "loginPanel");
	cardPanel.add(card2, "card2");
	
	
	Panel.setVisible(true);
}

@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==exit) {
		System.exit(0);
	}
	if(e.getSource()==btn1) {
		try {
			new DBConnection();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
	}
	if(e.getSource()==btn2) {
	//	cardPanel.show(card1,"");
		System.out.println("btn2");
	}
	if(e.getSource()==btn3) {
		System.out.println("btn3");
	}

}

}
