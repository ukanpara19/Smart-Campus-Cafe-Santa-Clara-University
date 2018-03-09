package SmartCampusCafe;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import java.awt.event.ActionEvent;

public class adminGui extends JFrame {

	private JPanel contentPane;
	private JTextField adduser_textField;
	private JTextField deleteuser_textField;
//	private JTextField textField_4;
	final JPasswordField adminPassword_field;
	String addUser = new String();
	String deleteUser = new String();
	String password = new String();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminGui frame = new adminGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public adminGui() {
		setTitle("Samrt Campus Cafe - Admin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(new JLabel(new ImageIcon("/Users/utsavkanpara/Desktop/Smart Campus Cafe/Images/blue.jpg")));
		setContentPane(contentPane);
		
		JLabel lblAdmin = new JLabel("ADMIN  WINDOW");
		JLabel lblWelcome = new JLabel("Welcome,");

		JButton btn_AddItem = new JButton("Add");
		JButton btn_DeleteItem = new JButton("Delete");
		
		JLabel lblWhatItemWould = new JLabel("What Item would you like to Add?");
		
		JLabel lblStatusOfCafes = new JLabel("Status of Cafe's :");
		
		@SuppressWarnings("rawtypes")
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Mission Bakery", "Sunstrem Cafe", "Bistro", "Cadence", "La Parilla"}));
		
		JRadioButton rdbtnOn = new JRadioButton("Open");
		
		JRadioButton rdbtnClosed = new JRadioButton("Close");
		
		JLabel lblAddUser = new JLabel("Add User :");
		
		JLabel lblDeleteUser = new JLabel("Delete User :");
		
		adduser_textField = new JTextField();
		adduser_textField.setColumns(15);
		
		deleteuser_textField = new JTextField();
		deleteuser_textField.setColumns(15);
		
		adminPassword_field = new JPasswordField(15);
		
		JLabel lblAdminPassword = new JLabel("Admin Password:");
		
		JButton btn_AddUser = new JButton("Add");
		btn_AddUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addUser = adduser_textField.getText();
				System.out.print(addUser);
				
			}
		});
		
		JButton btn_DeleteUser = new JButton("Delete");
		btn_DeleteUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deleteUser = deleteuser_textField.getText();
				System.out.print(deleteUser);
			}
		});
		JButton btn_Submit = new JButton("Submit");
		btn_Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				password = adminPassword_field.getText() ;
				System.out.print(password);
				
			}
		});
		
		textField = new JTextField();
		textField.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblWelcome)
								.addComponent(lblWhatItemWould)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblStatusOfCafes)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(rdbtnOn)
									.addGap(6)
									.addComponent(rdbtnClosed)))
							.addContainerGap(271, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
									.addGap(150)
									.addComponent(btn_AddItem, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblAdminPassword)
									.addGap(349)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(192)
									.addComponent(btn_Submit))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btn_DeleteItem, GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)))
							.addContainerGap())))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(160)
							.addComponent(lblAdmin))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(33)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblDeleteUser, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblAddUser)
									.addGap(62)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(adduser_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btn_AddUser, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(deleteuser_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btn_DeleteUser)))))))
					.addContainerGap(259, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(149)
					.addComponent(adminPassword_field, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(320, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(35)
							.addComponent(lblWelcome))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblAdmin, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addComponent(lblWhatItemWould)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn_AddItem)
						.addComponent(btn_DeleteItem))
					.addGap(67)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblStatusOfCafes)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnOn)
						.addComponent(rdbtnClosed))
					.addGap(39)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblAddUser)
							.addComponent(adduser_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(btn_AddUser))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(deleteuser_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn_DeleteUser))
					.addGap(121)
					.addComponent(lblDeleteUser)
					.addGap(8)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(adminPassword_field, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn_Submit)
						.addComponent(lblAdminPassword))
					.addContainerGap(26, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		

	}
}
