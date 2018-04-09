import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JList;

public class AdminUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField_searchItem;
	private JTextField textField_addUser;
	private JTextField textField_removeUser;
	private JPasswordField passwordField;
	String searchitem = new String();
	String addUser = new String();
	String removeUser = new String();
	String password = new String();
	String Items = new String();
	DefaultListModel model = new DefaultListModel();
	//Food f;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminUI frame = new AdminUI();
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
	public AdminUI() throws FileNotFoundException {
		
		//f= new Food();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 710, 743);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdminWindow = new JLabel("ADMIN WINDOW");
		lblAdminWindow.setForeground(Color.BLACK);
		lblAdminWindow.setBounds(253, 18, 118, 25);
		contentPane.add(lblAdminWindow);
		
		JLabel lblWelcome = new JLabel("Welcome,");
		lblWelcome.setFont(new Font(".SF NS Text", Font.PLAIN, 17));
		lblWelcome.setBounds(28, 54, 116, 27);
		contentPane.add(lblWelcome);
		
		JLabel lblSearch = new JLabel("Search : ");
		lblSearch.setBounds(64, 95, 61, 16);
		contentPane.add(lblSearch);
		
		textField_searchItem = new JTextField();
		textField_searchItem.setBounds(138, 86, 352, 35);
		contentPane.add(textField_searchItem);
		textField_searchItem.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				searchitem = textField_searchItem.getText();
				System.out.print(searchitem);
	
			}
		});
		btnSearch.setBounds(502, 87, 117, 35);
		contentPane.add(btnSearch);
		
		JLabel lblItems = new JLabel("Items:");
		lblItems.setBounds(64, 142, 61, 16);
		contentPane.add(lblItems);
		
//		JScrollPane scrollPane = new JScrollPane();
//		scrollPane.setBounds(148, 133, 320, 244);
//		contentPane.add(scrollPane);
//		
//		JTextArea txtarea_items = new JTextArea();
//		txtarea_items.setText("\n");
//		scrollPane.setViewportView(txtarea_items);
		
		JButton btnAddItems = new JButton("ADD Items");
		btnAddItems.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Items = txtarea_items.getText();
				System.out.print(Items);
				
			}
		});
		btnAddItems.setBounds(501, 145, 118, 40);
		contentPane.add(btnAddItems);
		
		JButton btnDeleteItems = new JButton("DELETE Items");
		btnDeleteItems.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnDeleteItems.setBounds(501, 197, 118, 40);
		contentPane.add(btnDeleteItems);
		
		JLabel lblStausOfCafes = new JLabel("Staus of Cafe's :");
		lblStausOfCafes.setBounds(24, 433, 101, 16);
		contentPane.add(lblStausOfCafes);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(147, 429, 246, 27);
		contentPane.add(comboBox);
		
		JRadioButton rdbtnOpen = new JRadioButton("Open");
		rdbtnOpen.setSelected(true);
		rdbtnOpen.setBounds(411, 423, 92, 35);
		contentPane.add(rdbtnOpen);
		
		JRadioButton rdbtnClose = new JRadioButton("Close");
		rdbtnClose.setBounds(494, 423, 121, 35);
		contentPane.add(rdbtnClose);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnOpen);
		group.add(rdbtnClose);
		
		JLabel lblAddUser = new JLabel("Add User :");
		lblAddUser.setBounds(28, 544, 80, 25);
		contentPane.add(lblAddUser);
		
		JLabel lblManageUsers = new JLabel("User Management: Here you can manage different users");
		lblManageUsers.setBounds(130, 495, 423, 35);
		contentPane.add(lblManageUsers);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(28, 482, 638, 12);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(28, 41, 638, 12);
		contentPane.add(separator_1);
		
		textField_addUser = new JTextField();
		textField_addUser.setBounds(173, 539, 291, 35);
		contentPane.add(textField_addUser);
		textField_addUser.setColumns(10);
		
		JButton btnAddUser = new JButton("ADD User");
		btnAddUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addUser = textField_addUser.getText();
				System.out.print(addUser);
			}
		});
		btnAddUser.setBounds(494, 540, 121, 35);
		contentPane.add(btnAddUser);
		
		JLabel lblDeleteUser = new JLabel("Delete User :");
		lblDeleteUser.setBounds(28, 591, 80, 25);
		contentPane.add(lblDeleteUser);
		
		textField_removeUser = new JTextField();
		textField_removeUser.setBounds(173, 586, 293, 35);
		contentPane.add(textField_removeUser);
		textField_removeUser.setColumns(10);
		
		JButton btnDeleteUser = new JButton("Delete User");
		btnDeleteUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeUser = textField_removeUser.getText();
				System.out.print(removeUser);
			}
		});
		btnDeleteUser.setBounds(494, 587, 121, 35);
		contentPane.add(btnDeleteUser);
		
		JLabel lblAdminsPassword = new JLabel("Admin's Password:");
		lblAdminsPassword.setBounds(28, 651, 132, 16);
		contentPane.add(lblAdminsPassword);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				password = passwordField.getText();
				System.out.print(password);
			}
		});
		btnSubmit.setBounds(495, 636, 120, 34);
		contentPane.add(btnSubmit);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(173, 637, 293, 35);
		contentPane.add(passwordField);
		
		DefaultListModel dlm = new DefaultListModel();
		//add data to dlm
		ArrayList<String[]> temp = new ArrayList<>();
		//temp=Food.getAllFood();
//		for(int i = 0 ; i< temp.size(); i++)
//			dlm.addElement( Arrays.toString(temp.get(i) ));
		
		for(int i=0;i<1000;i++) {
			dlm.addElement(i);
		}
		
		JList list = new JList(dlm);
		list.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.GRAY, null, Color.LIGHT_GRAY, null));
		list.setBackground(Color.white);
		list.setBounds(148, 139, 326, 245);
		contentPane.add(list);
		
	}
}
