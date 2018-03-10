package SmartCampusCafe;

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

public class loginGui extends JFrame {
	private JTextField Username_textField;
    final JPasswordField password_field;
    JFrame frame;
	String username = new String();
	String password = new String();
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
		
//      	a= new User();
		setResizable(false);
		
		setTitle("Smart Campus Cafe -  Login");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 633, 634);
		JLabel Title = new JLabel("Smart Campus Cafe");
		Title.setBounds(171, 81, 278, 30);
		Title.setForeground(new Color(0, 51, 102));
		Title.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 24));
//		 frame = new JFrame();
		 
	
		
		JLabel lblSantaClaraUniversity = new JLabel("Santa Clara University");
		lblSantaClaraUniversity.setBounds(161, 28, 302, 30);
		lblSantaClaraUniversity.setForeground(new Color(0, 51, 102));
		lblSantaClaraUniversity.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 24));
		
		JLabel lblLoginDetails = new JLabel("Login Details :");
		lblLoginDetails.setBounds(33, 139, 169, 30);
		lblLoginDetails.setForeground(new Color(0, 51, 102));
		lblLoginDetails.setBackground(new Color(255, 255, 255));
		lblLoginDetails.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 22));
		
		JLabel lblUsername = new JLabel("User ID :");
		lblUsername.setBounds(49, 196, 85, 28);
		lblUsername.setForeground(new Color(0, 51, 102));
		lblUsername.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setBounds(49, 266, 99, 34);
		lblPassword.setBackground(SystemColor.menu);
		lblPassword.setForeground(new Color(0, 51, 102));
		lblPassword.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		
		Username_textField = new JTextField();
		Username_textField.setBounds(178, 188, 285, 36);
		Username_textField.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 15));
		Username_textField.setBackground(new Color(255, 255, 255));
		Username_textField.setForeground(new Color(0, 0, 0));
		Username_textField.setColumns(15);
		
		password_field = new JPasswordField(15);
		password_field.setBounds(178, 279, 285, 36);
		
		JButton btn_login = new JButton("Login");
		btn_login.setBounds(245, 352, 116, 42);
		btn_login.addActionListener(new ActionListener() {
			
			@SuppressWarnings("deprecation")
			
			public void actionPerformed(ActionEvent e) {
				username = Username_textField.getText();
				password = password_field.getText();
//			System

				if(username.equals("name") && password.equals("password")) {
					
					Admin s = new Admin ();
					s.setVisible(true);
					close();

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
		lblNewLabel.setBounds(0, 0, 638, 606);
		lblNewLabel.setBackground(SystemColor.controlHighlight);
		lblNewLabel.setIcon(new ImageIcon("/Users/utsavkanpara/Desktop/welcome.jpg"));
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