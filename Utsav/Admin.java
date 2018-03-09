package SmartCampusCafe;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.ScrollPane;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Admin extends JFrame {

	private JPanel contentPane;
	private JTextField textField_searchItem;
	private JTextField txt_EnterUserId;
	private JTextField txtfield_removeUser;
	private JPasswordField txt_EnterAdminsPassword;
	private JLabel background;


	String search = new String ();
	String AddUser = new String();
	String DeleteUser = new String();
	String password = new String();
	String Items = new String();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
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
	public Admin() {
		setTitle("Smart Student Cafe - Admin");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 723, 671);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
	JFrame Admin_frame;
//		Image image = GenerateImage.toImage(true);
	
   	     Admin_frame = new JFrame();
	 
		ImageIcon imgThisImg = new ImageIcon("https://www.walldevil.com/plain-blue-background-wallpaper-157381/");
//	
//		Admin_frame.setImage(imgThisImg);
//		lbl_back.setIcon(imgThisImg);
//	    
		
		JLabel lblAdminWindow = new JLabel("Admin Window");
		lblAdminWindow.setFont(new Font("Apple Symbols", Font.PLAIN, 18));
		
		JLabel lblSearch = new JLabel("Search Items :");
		
		textField_searchItem = new JTextField();
		textField_searchItem.setColumns(10);
		
		JLabel lblItems = new JLabel("Items :");
		
		JLabel lblNewLabel = new JLabel("Status of Cafe : ");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Mission Bakery", "Sunstream Cafe", "Candence ", "La-parilla", "Broncos", "Bistro"}));
		
		JLabel lblAddUser = new JLabel("Add User:");
		
		txt_EnterUserId = new JTextField();
		
		txt_EnterUserId.setColumns(10);
		
		JLabel lblRemoveUser = new JLabel("Remove User:");
		
		txtfield_removeUser = new JTextField();

		txtfield_removeUser.setColumns(10);
		
		JLabel lblAdminPassword = new JLabel("Admin Password:");
		
		txt_EnterAdminsPassword = new JPasswordField();
		
		txt_EnterAdminsPassword.setColumns(10);
		
		JLabel lblWelcome = new JLabel("Welcome,");
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				search = textField_searchItem.getText();
				System.out.print(search);
			}
		});
		
		JButton btn_AddItem = new JButton("Add Item");
		btn_AddItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Items = scrollPane.getName();
//				System.out.print(Item);
//				
			}
		});
		
		JButton btn_DeleteItem = new JButton("Delete Item");
		
		JRadioButton rdbtnOpen = new JRadioButton("Open");
		
		JRadioButton rdbtnClose = new JRadioButton("Close");
		
		JButton btnAdd_1 = new JButton("Add User");
		btnAdd_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddUser = txt_EnterUserId.getText();
				System.out.print(AddUser);
			}
		});
		
		JButton btn_RemoveUser = new JButton("Remove User");
		btn_RemoveUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteUser = txtfield_removeUser.getText();
				System.out.print(DeleteUser);
			}
		});
		
		JButton btn_password = new JButton("Submit");
		btn_password.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				password = txt_EnterAdminsPassword.getText();
				System.out.print(password);
			}
		});
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(24)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblItems, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblSearch)
										.addComponent(lblAddUser)
										.addComponent(lblRemoveUser)
										.addComponent(lblAdminPassword))
									.addGap(12))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel)
									.addGap(18)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(txt_EnterUserId, Alignment.LEADING)
										.addComponent(txtfield_removeUser, Alignment.LEADING)
										.addComponent(txt_EnterAdminsPassword, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE))
									.addGap(23)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(btn_RemoveUser, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnAdd_1, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(9)
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(rdbtnOpen)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(rdbtnClose))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_searchItem, 330, 330, 330)
										.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 294, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(btnSearch, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
											.addComponent(btn_AddItem, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(btn_DeleteItem, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
//							.addComponent(lbl_back, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
							.addGap(112)
							.addComponent(lblAdminWindow, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(43)
							.addComponent(lblWelcome))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(254)
							.addComponent(btn_password, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)))
					.addGap(98))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblAdminWindow, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addGap(34))
						.addGroup(gl_contentPane.createSequentialGroup()
//							.addComponent(lbl_back)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblWelcome)
							.addGap(18)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSearch)
						.addComponent(textField_searchItem, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSearch, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblItems)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btn_AddItem, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btn_DeleteItem, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(116))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(26)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)))
					.addGap(32)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnOpen)
						.addComponent(lblNewLabel)
						.addComponent(rdbtnClose))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(lblAddUser))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(12)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(txt_EnterUserId, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnAdd_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btn_RemoveUser, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(txtfield_removeUser, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
									.addComponent(lblRemoveUser)))))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAdminPassword)
						.addComponent(txt_EnterAdminsPassword, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btn_password, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(19, Short.MAX_VALUE))
		);
		
		JTextArea txtrPizza = new JTextArea();
		txtrPizza.setText("Espresso\nPizza\nBurger\nLatte\n");
		scrollPane.setViewportView(txtrPizza);
		contentPane.setLayout(gl_contentPane);
	}
}
