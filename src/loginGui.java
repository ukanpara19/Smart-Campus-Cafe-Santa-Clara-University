import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.*;
import java.awt.*;


import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class loginGui extends JFrame {
	private JTextField Username_textField;
    final JPasswordField password_field;
    JFrame frame;
	String username = new String();
	String password = new String();
	Maps s;
	AdminUI ad;
//	User a;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginGui frame = new loginGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	
	
	
	/**
	 * Create the frame.
	 * @throws FileNotFoundException 
	 */
	public loginGui() throws FileNotFoundException {
		
		setResizable(false);
		
		setTitle("Smart Campus Cafe -  Login");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 625, 634);
		JLabel Title = new JLabel("Smart Campus Cafe");
		Title.setOpaque(true);
		Title.setBounds(190, 71, 234, 30);
		Title.setForeground(new Color(0, 0, 0));
		Title.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 24));
//		 frame = new JFrame();
		 
	
		
		JLabel lblSantaClaraUniversity = new JLabel("Santa Clara University");
		lblSantaClaraUniversity.setOpaque(true);
		
		lblSantaClaraUniversity.setBounds(165, 29, 279, 30);
		lblSantaClaraUniversity.setForeground(new Color(0, 0, 0));
		lblSantaClaraUniversity.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 26));
		
		JLabel lblLoginDetails = new JLabel("Login Details :");
		
		lblLoginDetails.setBounds(70, 169, 169, 30);
		lblLoginDetails.setForeground(new Color(255, 255, 255));
		lblLoginDetails.setBackground(new Color(255, 255, 255));
		lblLoginDetails.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 22));
		
		JLabel lblUsername = new JLabel("User ID :");
		lblUsername.setBounds(84, 225, 85, 28);
		lblUsername.setForeground(new Color(255, 255, 255));
		lblUsername.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 19));
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setBounds(70, 279, 99, 34);
		lblPassword.setBackground(SystemColor.menu);
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		
		Username_textField = new JTextField();
		Username_textField.setBounds(190, 222, 285, 36);
		Username_textField.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 15));
		Username_textField.setBackground(new Color(255, 255, 255));
		Username_textField.setForeground(new Color(0, 0, 0));
		Username_textField.setColumns(15);
		
		password_field = new JPasswordField(15);
		password_field.setBounds(190, 279, 285, 36);
		
		JButton btn_login = new JButton("Login");
		btn_login.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		btn_login.setBounds(246, 343, 116, 42);
		btn_login.addActionListener(new ActionListener() {
			
			@SuppressWarnings("deprecation")
			
			public void actionPerformed(ActionEvent e) {
				username = Username_textField.getText();
				password = password_field.getText();
				// System
				
				if (JsonSimpleReadExample.user(username, password).equals("User")) {
					
					s= new Maps();
					s.setVisible(true);
					close();
				}
				else if (JsonSimpleReadExample.user(username, password).equals("Admin")) {
					
					System.out.println("1");
					try {
						ad = new AdminUI();
						ad.setVisible(true);
						close();

					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else {
					JOptionPane.showMessageDialog(frame, "Invalid Password");
				}
			}

		});
		getContentPane().setLayout(null);
		getContentPane().add(lblLoginDetails);
		getContentPane().add(lblSantaClaraUniversity);
		getContentPane().add(lblPassword);
		getContentPane().add(lblUsername);
		getContentPane().add(password_field);
		getContentPane().add(Username_textField);
		getContentPane().add(btn_login);
		getContentPane().add(Title);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 627, 606);
		lblNewLabel.setBackground(SystemColor.controlHighlight);
		lblNewLabel.setIcon(new ImageIcon("/Users/nirajmotiani/Desktop/Image/welcome.jpg"));
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(99, 364, -5, -30);
		getContentPane().add(lblNewLabel_1);
	}



	protected void close() {
		// TODO Auto-generated method stub
		WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
		
	}
}


