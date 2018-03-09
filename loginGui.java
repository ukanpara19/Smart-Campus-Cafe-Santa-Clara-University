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
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.awt.event.ActionEvent;

public class loginGui extends JFrame {
	private JTextField Username_textField;
    final JPasswordField password_field;
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
		
//		a= new User();
		setResizable(false);
		
		setTitle("Smart Campus Cafe -  Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 311);
		JLabel Title = new JLabel("Smart Campus Cafe");
		Title.setForeground(Color.BLACK);
		Title.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		
		setContentPane(new JLabel(new ImageIcon("www.genenacity.com/smugglers-cafe/ayuda-el-cafe-a-quemar-grasa-al-practicar-deporte1/")));
		
		
		JLabel lblSantaClaraUniversity = new JLabel("Santa Clara University");
		lblSantaClaraUniversity.setForeground(Color.BLACK);
		lblSantaClaraUniversity.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 22));
		
		JLabel lblLoginDetails = new JLabel("Login Details :");
		lblLoginDetails.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblUsername = new JLabel("User ID :");
		lblUsername.setFont(new Font("Arial", Font.BOLD, 16));
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Arial", Font.BOLD, 16));
		
		Username_textField = new JTextField();
		Username_textField.setColumns(15);
		
		password_field = new JPasswordField(15);
		
		
       
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				username = Username_textField.getText();
				password = password_field.getText();
//				System.out.println(a.checkPassword(username, password) );
//				System.out.print(username);
//				System.out.print(password);
				
			}
		});
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(22)
					.addComponent(lblLoginDetails)
					.addContainerGap(328, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(111, Short.MAX_VALUE)
					.addComponent(lblSantaClaraUniversity, GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE)
					.addGap(54))
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(82)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblPassword, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblUsername, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(password_field, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(Username_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(134)
							.addComponent(Title, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(102, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(16)
					.addComponent(lblSantaClaraUniversity, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(Title, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblLoginDetails)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							
						.addComponent(lblUsername)
						.addComponent(Username_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(password_field, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					

					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnNewButton)
					.addContainerGap(32, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
	}
}