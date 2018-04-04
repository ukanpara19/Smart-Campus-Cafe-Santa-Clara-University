import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;
import java.awt.Choice;
import javax.swing.JComboBox;

public class Drinks extends JFrame {

	private JPanel contentPane;
	calculateFoodPrice c;
	JFrame frame;
	Checkout obj;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculateFoodPrice c=new calculateFoodPrice();
					Drinks frame = new Drinks(c,null);
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
	public Drinks(calculateFoodPrice c, ArrayList<Food> listOfOrders) {
		setTitle("Smart Campus Cafe -Menu");
		this.c = c;
		System.out.println("From the drinks class "+ c.total);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 712, 670);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GRAY);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Size");
		lblNewLabel_1.setForeground(Color.ORANGE);
		lblNewLabel_1.setFont(new Font("Corbel", Font.BOLD, 13));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 47, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Tall");
		rdbtnNewRadioButton.setActionCommand("0");
		rdbtnNewRadioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				rdbtnNewRadioButton.setForeground(Color.CYAN);
				rdbtnNewRadioButton.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				rdbtnNewRadioButton.setForeground(Color.WHITE);
				rdbtnNewRadioButton.setFont(new Font("Corbel", Font.BOLD, 13));
			}
		});
		rdbtnNewRadioButton.setForeground(Color.WHITE);
		rdbtnNewRadioButton.setFont(new Font("Corbel", Font.BOLD, 13));
		rdbtnNewRadioButton.setBackground(Color.WHITE);
		rdbtnNewRadioButton.setBounds(10, 80, 119, 23);
		rdbtnNewRadioButton.setOpaque(false);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Grande + $0.50");
		rdbtnNewRadioButton_1.setActionCommand("0.5");
		rdbtnNewRadioButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				rdbtnNewRadioButton_1.setForeground(Color.CYAN);
				rdbtnNewRadioButton_1.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				rdbtnNewRadioButton_1.setForeground(Color.WHITE);
				rdbtnNewRadioButton_1.setFont(new Font("Corbel", Font.BOLD, 13));
			}
		});
		rdbtnNewRadioButton_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_1.setFont(new Font("Corbel", Font.BOLD, 13));
		rdbtnNewRadioButton_1.setBackground(Color.WHITE);
		rdbtnNewRadioButton_1.setBounds(193, 80, 150, 23);
		rdbtnNewRadioButton_1.setOpaque(false);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Venti + $0.79");
		rdbtnNewRadioButton_2.setActionCommand("0.79");
		rdbtnNewRadioButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				rdbtnNewRadioButton_2.setForeground(Color.CYAN);
				rdbtnNewRadioButton_2.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				rdbtnNewRadioButton_2.setForeground(Color.WHITE);
				rdbtnNewRadioButton_2.setFont(new Font("Corbel", Font.BOLD, 13));
			}
		});
		rdbtnNewRadioButton_2.setForeground(Color.WHITE);
		rdbtnNewRadioButton_2.setFont(new Font("Corbel", Font.BOLD, 13));
		rdbtnNewRadioButton_2.setBackground(Color.WHITE);
		rdbtnNewRadioButton_2.setBounds(410, 80, 140, 23);
		rdbtnNewRadioButton_2.setOpaque(false);
		contentPane.add(rdbtnNewRadioButton_2);
		
		ButtonGroup group= new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("Add Flavor Shot? + $0.59");
		lblNewLabel_2.setFont(new Font("Corbel", Font.BOLD, 13));
		lblNewLabel_2.setForeground(Color.ORANGE);
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setBounds(10, 127, 182, 14);
		contentPane.add(lblNewLabel_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Vanilla");
		chckbxNewCheckBox.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				chckbxNewCheckBox.setForeground(Color.CYAN);
				chckbxNewCheckBox.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				chckbxNewCheckBox.setForeground(Color.WHITE);
				chckbxNewCheckBox.setFont(new Font("Corbel", Font.BOLD, 13));
			}
		});
		chckbxNewCheckBox.setForeground(Color.WHITE);
		chckbxNewCheckBox.setFont(new Font("Corbel", Font.BOLD, 13));
		chckbxNewCheckBox.setBackground(Color.WHITE);
		chckbxNewCheckBox.setBounds(10, 167, 97, 23);
		chckbxNewCheckBox.setOpaque(false);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Caramel");
		chckbxNewCheckBox_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				chckbxNewCheckBox_1.setForeground(Color.CYAN);
				chckbxNewCheckBox_1.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				chckbxNewCheckBox_1.setForeground(Color.WHITE);
				chckbxNewCheckBox_1.setFont(new Font("Corbel", Font.BOLD, 13));
			}
		});
		chckbxNewCheckBox_1.setForeground(Color.WHITE);
		chckbxNewCheckBox_1.setFont(new Font("Corbel", Font.BOLD, 13));
		chckbxNewCheckBox_1.setBackground(Color.WHITE);
		chckbxNewCheckBox_1.setBounds(205, 167, 97, 23);
		chckbxNewCheckBox_1.setOpaque(false);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Hazelnut");
		chckbxNewCheckBox_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				chckbxNewCheckBox_2.setForeground(Color.CYAN);
				chckbxNewCheckBox_2.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				chckbxNewCheckBox_2.setForeground(Color.WHITE);
				chckbxNewCheckBox_2.setFont(new Font("Corbel", Font.BOLD, 13));
			}
		});
		chckbxNewCheckBox_2.setForeground(Color.WHITE);
		chckbxNewCheckBox_2.setFont(new Font("Corbel", Font.BOLD, 13));
		chckbxNewCheckBox_2.setBackground(Color.WHITE);
		chckbxNewCheckBox_2.setBounds(416, 214, 97, 23);
		chckbxNewCheckBox_2.setOpaque(false);
		contentPane.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Peppermint");
		chckbxNewCheckBox_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				chckbxNewCheckBox_3.setForeground(Color.CYAN);
				chckbxNewCheckBox_3.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				chckbxNewCheckBox_3.setForeground(Color.WHITE);
				chckbxNewCheckBox_3.setFont(new Font("Corbel", Font.BOLD, 13));
			}
		});
		chckbxNewCheckBox_3.setForeground(Color.WHITE);
		chckbxNewCheckBox_3.setFont(new Font("Corbel", Font.BOLD, 13));
		chckbxNewCheckBox_3.setBackground(Color.WHITE);
		chckbxNewCheckBox_3.setBounds(10, 214, 132, 23);
		chckbxNewCheckBox_3.setOpaque(false);
		contentPane.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Almond");
		chckbxNewCheckBox_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				chckbxNewCheckBox_4.setForeground(Color.CYAN);
				chckbxNewCheckBox_4.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				chckbxNewCheckBox_4.setForeground(Color.WHITE);
				chckbxNewCheckBox_4.setFont(new Font("Corbel", Font.BOLD, 13));
			}
		});
		chckbxNewCheckBox_4.setForeground(Color.WHITE);
		chckbxNewCheckBox_4.setFont(new Font("Corbel", Font.BOLD, 13));
		chckbxNewCheckBox_4.setBackground(Color.WHITE);
		chckbxNewCheckBox_4.setBounds(205, 214, 97, 23);
		chckbxNewCheckBox_4.setOpaque(false);
		contentPane.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Sugar Cane");
		chckbxNewCheckBox_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				chckbxNewCheckBox_5.setForeground(Color.CYAN);
				chckbxNewCheckBox_5.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				chckbxNewCheckBox_5.setForeground(Color.WHITE);
				chckbxNewCheckBox_5.setFont(new Font("Corbel", Font.BOLD, 13));
			}
		});
		chckbxNewCheckBox_5.setForeground(Color.WHITE);
		chckbxNewCheckBox_5.setFont(new Font("Corbel", Font.BOLD, 13));
		chckbxNewCheckBox_5.setBackground(Color.WHITE);
		chckbxNewCheckBox_5.setBounds(416, 167, 140, 23);
		chckbxNewCheckBox_5.setOpaque(false);
		contentPane.add(chckbxNewCheckBox_5);
		
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton.setBackground(Color.CYAN);
				btnNewButton.setForeground(Color.BLACK);
				btnNewButton.setFont(new Font("Calibri", Font.BOLD, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setBackground(Color.WHITE);
				btnNewButton.setForeground(Color.GRAY);
				btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 12));
			}
		});
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(137, 579, 165, 41);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//create object for Sunstream
//				Sunstream ss2 =new Sunstream();
//				ss2.setVisible(true);
			}
		});
		contentPane.add(btnNewButton);
		
		
		
		JLabel lblNewLabel_3 = new JLabel("Milk");
		lblNewLabel_3.setFont(new Font("Corbel", Font.BOLD, 13));
		lblNewLabel_3.setForeground(Color.ORANGE);
		lblNewLabel_3.setBounds(10, 274, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Add Espesso Shot? + $0.99");
		lblNewLabel_4.setFont(new Font("Corbel", Font.BOLD, 13));
		lblNewLabel_4.setForeground(Color.ORANGE);
		lblNewLabel_4.setBounds(10, 400, 182, 14);
		contentPane.add(lblNewLabel_4);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Yes");
		rdbtnNewRadioButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				rdbtnNewRadioButton_3.setForeground(Color.CYAN);
				rdbtnNewRadioButton_3.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				rdbtnNewRadioButton_3.setForeground(Color.WHITE);
				rdbtnNewRadioButton_3.setFont(new Font("Corbel", Font.BOLD, 13));
			}
		});
		rdbtnNewRadioButton_3.setFont(new Font("Corbel", Font.BOLD, 13));
		rdbtnNewRadioButton_3.setForeground(Color.WHITE);
		rdbtnNewRadioButton_3.setBackground(Color.WHITE);
		rdbtnNewRadioButton_3.setBounds(10, 433, 109, 23);
		rdbtnNewRadioButton_3.setOpaque(false);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("No");
		rdbtnNewRadioButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				rdbtnNewRadioButton_4.setForeground(Color.CYAN);
				rdbtnNewRadioButton_4.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				rdbtnNewRadioButton_4.setForeground(Color.WHITE);
				rdbtnNewRadioButton_4.setFont(new Font("Corbel", Font.BOLD, 13));
			}
		});
		rdbtnNewRadioButton_4.setFont(new Font("Corbel", Font.BOLD, 13));
		rdbtnNewRadioButton_4.setForeground(Color.WHITE);
		rdbtnNewRadioButton_4.setBackground(Color.WHITE);
		rdbtnNewRadioButton_4.setBounds(152, 433, 109, 23);
		rdbtnNewRadioButton_4.setOpaque(false);
		contentPane.add(rdbtnNewRadioButton_4);
		
		ButtonGroup group1= new ButtonGroup();
		group1.add(rdbtnNewRadioButton_3);
		group1.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("2% Milk");
		rdbtnNewRadioButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				rdbtnNewRadioButton_5.setForeground(Color.CYAN);
				rdbtnNewRadioButton_5.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				rdbtnNewRadioButton_5.setForeground(Color.WHITE);
				rdbtnNewRadioButton_5.setFont(new Font("Corbel", Font.BOLD, 13));
			}
		});
		rdbtnNewRadioButton_5.setForeground(Color.WHITE);
		rdbtnNewRadioButton_5.setBackground(Color.WHITE);
		rdbtnNewRadioButton_5.setFont(new Font("Corbel", Font.BOLD, 13));
		rdbtnNewRadioButton_5.setBounds(10, 310, 109, 23);
		rdbtnNewRadioButton_5.setOpaque(false);
		contentPane.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Coconut Milk + $0.59");
		rdbtnNewRadioButton_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				rdbtnNewRadioButton_6.setForeground(Color.CYAN);
				rdbtnNewRadioButton_6.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				rdbtnNewRadioButton_6.setForeground(Color.WHITE);
				rdbtnNewRadioButton_6.setFont(new Font("Corbel", Font.BOLD, 13));
			}
		});
		rdbtnNewRadioButton_6.setForeground(Color.WHITE);
		rdbtnNewRadioButton_6.setBackground(Color.WHITE);
		rdbtnNewRadioButton_6.setFont(new Font("Corbel", Font.BOLD, 13));
		rdbtnNewRadioButton_6.setBounds(10, 352, 182, 23);
		rdbtnNewRadioButton_6.setOpaque(false);
		contentPane.add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Whole Milk");
		rdbtnNewRadioButton_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				rdbtnNewRadioButton_7.setForeground(Color.CYAN);
				rdbtnNewRadioButton_7.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				rdbtnNewRadioButton_7.setForeground(Color.WHITE);
				rdbtnNewRadioButton_7.setFont(new Font("Corbel", Font.BOLD, 13));
			}
		});
		rdbtnNewRadioButton_7.setForeground(Color.WHITE);
		rdbtnNewRadioButton_7.setBackground(Color.WHITE);
		rdbtnNewRadioButton_7.setFont(new Font("Corbel", Font.BOLD, 13));
		rdbtnNewRadioButton_7.setBounds(217, 310, 109, 23);
		rdbtnNewRadioButton_7.setOpaque(false);
		contentPane.add(rdbtnNewRadioButton_7);
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("Soy Milk + $0.59");
		rdbtnNewRadioButton_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				rdbtnNewRadioButton_8.setForeground(Color.CYAN);
				rdbtnNewRadioButton_8.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				rdbtnNewRadioButton_8.setForeground(Color.WHITE);
				rdbtnNewRadioButton_8.setFont(new Font("Corbel", Font.BOLD, 13));
			}
		});
		rdbtnNewRadioButton_8.setForeground(Color.WHITE);
		rdbtnNewRadioButton_8.setBackground(Color.WHITE);
		rdbtnNewRadioButton_8.setFont(new Font("Corbel", Font.BOLD, 13));
		rdbtnNewRadioButton_8.setBounds(217, 352, 150, 23);
		rdbtnNewRadioButton_8.setOpaque(false);
		contentPane.add(rdbtnNewRadioButton_8);
		
		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("Almond Milk + $0.59");
		rdbtnNewRadioButton_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				rdbtnNewRadioButton_9.setForeground(Color.CYAN);
				rdbtnNewRadioButton_9.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				rdbtnNewRadioButton_9.setForeground(Color.WHITE);
				rdbtnNewRadioButton_9.setFont(new Font("Corbel", Font.BOLD, 13));
			}
		});
		rdbtnNewRadioButton_9.setForeground(Color.WHITE);
		rdbtnNewRadioButton_9.setBackground(Color.WHITE);
		rdbtnNewRadioButton_9.setFont(new Font("Corbel", Font.BOLD, 13));
		rdbtnNewRadioButton_9.setBounds(416, 352, 182, 23);
		rdbtnNewRadioButton_9.setOpaque(false);
		contentPane.add(rdbtnNewRadioButton_9);
		
		JRadioButton rdbtnNewRadioButton_10 = new JRadioButton("Non Fat Milk");
		rdbtnNewRadioButton_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				rdbtnNewRadioButton_10.setForeground(Color.CYAN);
				rdbtnNewRadioButton_10.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				rdbtnNewRadioButton_10.setForeground(Color.WHITE);
				rdbtnNewRadioButton_10.setFont(new Font("Corbel", Font.BOLD, 13));
			}
		});
		rdbtnNewRadioButton_10.setForeground(Color.WHITE);
		rdbtnNewRadioButton_10.setBackground(Color.WHITE);
		rdbtnNewRadioButton_10.setFont(new Font("Corbel", Font.BOLD, 13));
		rdbtnNewRadioButton_10.setBounds(417, 310, 150, 23);
		rdbtnNewRadioButton_10.setOpaque(false);
		contentPane.add(rdbtnNewRadioButton_10);
		
		ButtonGroup group3= new ButtonGroup();
		group3.add(rdbtnNewRadioButton_5);
		group3.add(rdbtnNewRadioButton_6);
		group3.add(rdbtnNewRadioButton_7);
		group3.add(rdbtnNewRadioButton_8);
		group3.add(rdbtnNewRadioButton_9);
		group3.add(rdbtnNewRadioButton_10);
		
		JLabel lblNewLabel_5 = new JLabel("Quantity");
		lblNewLabel_5.setForeground(Color.ORANGE);
		lblNewLabel_5.setBounds(10, 482, 62, 14);
		contentPane.add(lblNewLabel_5);
		
		JComboBox<Integer> comboBox = new JComboBox<>();
		comboBox.addItem(1);
		comboBox.addItem(2);
		comboBox.addItem(3);
		comboBox.addItem(4);
		comboBox.setBounds(10, 519, 73, 23);
		contentPane.add(comboBox);
		
		
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//int quantity = combo
				if(rdbtnNewRadioButton.isSelected())
				listOfOrders.get(listOfOrders.size()-1).size ="Tall";
				else if(rdbtnNewRadioButton_1.isSelected())
				listOfOrders.get(listOfOrders.size()-1).size ="Grande";
				else if(rdbtnNewRadioButton_2.isSelected())
				listOfOrders.get(listOfOrders.size()-1).size ="Venti";
				else {
					//error handling
					//error handling
					//error handling if the size is not selected
					//error handling
					//error handling
					//error handling
					//error handling
					//error handling
					//error handling
					//error handling
					//error handling
					//error handling
					JOptionPane.showMessageDialog(frame, "Please Select the size");
				}
				double d = Double.parseDouble(group.getSelection().getActionCommand());
				
				//about adding extra shot of espresso
				if(rdbtnNewRadioButton_3.isSelected()) {
					listOfOrders.get(listOfOrders.size()-1).comments =listOfOrders.get(listOfOrders.size()-1).comments.concat("Extra Shot"+"\n");
					d+=0.99;
				}
				
				// about the cost and preferences of milk
				if(rdbtnNewRadioButton_5.isSelected()) {
				//2% Milk
					listOfOrders.get(listOfOrders.size()-1).comments =listOfOrders.get(listOfOrders.size()-1).comments.concat("Low Fat"+"\n"); 
				}
     			else if(rdbtnNewRadioButton_6.isSelected()) {
				//coconut milk
					listOfOrders.get(listOfOrders.size()-1).comments =listOfOrders.get(listOfOrders.size()-1).comments.concat("Coconut milk"+"\n"); 
					d+=0.59;
     			}
				else if(rdbtnNewRadioButton_7.isSelected()) {
				//whole milk
					listOfOrders.get(listOfOrders.size()-1).comments =listOfOrders.get(listOfOrders.size()-1).comments.concat("Whole milk"+"\n");
				}
				else if(rdbtnNewRadioButton_8.isSelected()) {
				//Soy milk
					listOfOrders.get(listOfOrders.size()-1).comments =listOfOrders.get(listOfOrders.size()-1).comments.concat("Soy milk"+"\n");
					d+=0.59;
				}
				else if(rdbtnNewRadioButton_9.isSelected()) {
				//almond milk
					listOfOrders.get(listOfOrders.size()-1).comments =listOfOrders.get(listOfOrders.size()-1).comments.concat("Almond milk"+"\n");
					d+=0.59;
				}
				else if(rdbtnNewRadioButton_10.isSelected()) {
				//non fat
					listOfOrders.get(listOfOrders.size()-1).comments =listOfOrders.get(listOfOrders.size()-1).comments.concat("Non Fat"+"\n");
				}
				else {
				 
				}
					
				
				
				// about the cost and preferences of syrups
				int noOfSyrups=0;
				if(chckbxNewCheckBox.isSelected()){
					//vanilla
					listOfOrders.get(listOfOrders.size()-1).comments =listOfOrders.get(listOfOrders.size()-1).comments.concat("Vanilla"+"\n"); 
					noOfSyrups++;
				}
				if(chckbxNewCheckBox_1.isSelected()) {
					//caramel
					listOfOrders.get(listOfOrders.size()-1).comments =listOfOrders.get(listOfOrders.size()-1).comments.concat("Caramel"+"\n"); 
					noOfSyrups++;
				}
					
				if(chckbxNewCheckBox_2.isSelected()) {
					//hazelnut
					listOfOrders.get(listOfOrders.size()-1).comments =listOfOrders.get(listOfOrders.size()-1).comments.concat("Hazelnut"+"\n"); 
					noOfSyrups++;
				}
				if(chckbxNewCheckBox_3.isSelected()) {
					//peppermint
					listOfOrders.get(listOfOrders.size()-1).comments =listOfOrders.get(listOfOrders.size()-1).comments.concat("Peppermint"+"\n"); 
					noOfSyrups++;
				}
				if(chckbxNewCheckBox_4.isSelected()) {
					//almond
					listOfOrders.get(listOfOrders.size()-1).comments =listOfOrders.get(listOfOrders.size()-1).comments.concat("Almond"+"\n"); 
					noOfSyrups++;
				}
				if(chckbxNewCheckBox_5.isSelected()) {
					//sugarcane
					listOfOrders.get(listOfOrders.size()-1).comments =listOfOrders.get(listOfOrders.size()-1).comments.concat("Sugarcane"+"\n"); 
					noOfSyrups++;
				}
//				if( rdbtnNewRadioButton_3)
//					d+= ;
//				if( )
//					d+= ;
				d+=0.59*noOfSyrups;
				
				c.addSizePrice(d);
				System.out.println(c.total);
				
				
				listOfOrders.get(listOfOrders.size()-1).price=c.total * (int)comboBox.getSelectedItem() ;
				listOfOrders.get(listOfOrders.size()-1).quantity=(int)comboBox.getSelectedItem();
				
				System.out.println("From the drinks class ");
				for(int i = 0 ; i< listOfOrders.size();i++) {
					System.out.println(listOfOrders.get(i).name);
					System.out.println(listOfOrders.get(i).size);
					System.out.println(listOfOrders.get(i).quantity);
					System.out.println(listOfOrders.get(i).price);
				}
				
				
				 obj = new Checkout(listOfOrders);

				obj.setVisible(true);
				
			}
			
		});
		btnNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNext.setBackground(Color.CYAN);
				btnNext.setForeground(Color.BLACK);
				btnNext.setFont(new Font("Calibri", Font.BOLD, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNext.setBackground(Color.WHITE);
				btnNext.setForeground(Color.GRAY);
				btnNext.setFont(new Font("Calibri", Font.PLAIN, 12));
			}
		});
		btnNext.setForeground(Color.DARK_GRAY);
		btnNext.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnNext.setBackground(Color.WHITE);
		btnNext.setBounds(385, 579, 165, 41);
		contentPane.add(btnNext);
		
		JLabel label_background = new JLabel("");
		label_background.setIcon(new ImageIcon("/Users/nirajmotiani/Desktop/Image/maxresdefault.jpg"));
		label_background.setBounds(6, 47, 700, 639);
		contentPane.add(label_background);

	}
	
}
