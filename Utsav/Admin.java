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
import java.awt.Toolkit;
import javax.swing.JSeparator;
import java.awt.Color;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("/Users/utsavkanpara/Desktop/grey.jpg"));
		setTitle("Smart Student Cafe - Admin");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 677, 671);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
	JFrame Admin_frame;
		
	
   	     Admin_frame = new JFrame();
	 
		
	    
		JLabel lblAdminWindow = new JLabel("Admin Window");
		lblAdminWindow.setBounds(291, 6, 146, 30);
		lblAdminWindow.setFont(new Font("Apple Symbols", Font.PLAIN, 18));
		
		JLabel lblSearch = new JLabel("Search Items :");
		lblSearch.setBounds(26, 84, 88, 16);
		
		textField_searchItem = new JTextField();
		textField_searchItem.setBounds(149, 75, 330, 34);
		textField_searchItem.setColumns(10);
		
		JLabel lblItems = new JLabel("Items :");
		lblItems.setBounds(39, 138, 51, 16);
		
		JLabel lblNewLabel = new JLabel("Status of Cafe : ");
		lblNewLabel.setBounds(29, 411, 100, 16);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(158, 407, 154, 27);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Mission Bakery", "Sunstream Cafe", "Candence ", "La-parilla", "Broncos", "Bistro"}));
		
		JLabel lblAddUser = new JLabel("Add User:");
		lblAddUser.setBounds(29, 471, 61, 16);
		
		txt_EnterUserId = new JTextField();
		txt_EnterUserId.setBounds(149, 462, 306, 35);
		
		txt_EnterUserId.setColumns(10);
		
		JLabel lblRemoveUser = new JLabel("Remove User:");
		lblRemoveUser.setBounds(29, 518, 85, 16);
		
		txtfield_removeUser = new JTextField();
		txtfield_removeUser.setBounds(149, 509, 306, 34);

		txtfield_removeUser.setColumns(10);
		
		JLabel lblAdminPassword = new JLabel("Admin Password:");
		lblAdminPassword.setBounds(29, 564, 108, 16);
		
		txt_EnterAdminsPassword = new JPasswordField();
		txt_EnterAdminsPassword.setBounds(149, 555, 306, 34);
		
		txt_EnterAdminsPassword.setColumns(10);
		
		JLabel lblWelcome = new JLabel("Welcome,");
		lblWelcome.setBounds(40, 47, 60, 16);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(149, 136, 294, 233);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(501, 68, 112, 33);
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				search = textField_searchItem.getText();
				System.out.print(search);
			}
		});
		
		JButton btn_AddItem = new JButton("Add Item");
		btn_AddItem.setBounds(478, 140, 116, 50);
		btn_AddItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
               Items = textField_searchItem.getText();
			  System.out.print(Items);
			
			}
		});
		
		JButton btn_DeleteItem = new JButton("Delete Item");
		btn_DeleteItem.setBounds(478, 206, 116, 49);
		
		JRadioButton rdbtnOpen = new JRadioButton("Open");
		rdbtnOpen.setBounds(328, 407, 65, 23);
		
		JRadioButton rdbtnClose = new JRadioButton("Close");
		rdbtnClose.setBounds(412, 407, 67, 23);
		
		JButton btnAdd_1 = new JButton("Add User");
		btnAdd_1.setBounds(478, 464, 142, 33);
		btnAdd_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddUser = txt_EnterUserId.getText();
				System.out.print(AddUser);
			}
		});
		
		JButton btn_RemoveUser = new JButton("Remove User");
		btn_RemoveUser.setBounds(478, 510, 142, 34);
		btn_RemoveUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteUser = txtfield_removeUser.getText();
				System.out.print(DeleteUser);
			}
		});
		
		JButton btn_password = new JButton("Submit");
		btn_password.setBounds(272, 605, 183, 38);
		btn_password.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				password = txt_EnterAdminsPassword.getText();
				System.out.print(password);
			}
		});
		
		JTextArea txtrPizza = new JTextArea();
		txtrPizza.setText("Espresso\nPizza\nBurger\nLatte\n");
		scrollPane.setColumnHeaderView(txtrPizza);
		contentPane.setLayout(null);
		contentPane.add(lblSearch);
		contentPane.add(lblAddUser);
		contentPane.add(lblRemoveUser);
		contentPane.add(lblAdminPassword);
		contentPane.add(lblItems);
		contentPane.add(lblNewLabel);
		contentPane.add(txt_EnterUserId);
		contentPane.add(txtfield_removeUser);
		contentPane.add(txt_EnterAdminsPassword);
		contentPane.add(btn_RemoveUser);
		contentPane.add(btnAdd_1);
		contentPane.add(comboBox);
		contentPane.add(rdbtnOpen);
		contentPane.add(rdbtnClose);
		contentPane.add(textField_searchItem);
		contentPane.add(scrollPane);
		contentPane.add(btnSearch);
		contentPane.add(btn_AddItem);
		contentPane.add(btn_DeleteItem);
		contentPane.add(lblAdminWindow);
		contentPane.add(lblWelcome);
		contentPane.add(btn_password);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.DARK_GRAY);
		separator.setBounds(27, 27, 633, 16);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.DARK_GRAY);
		separator_1.setBounds(25, 387, 635, 12);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(17, 184, 73, 50);
		contentPane.add(lblNewLabel_1);
	}
}
