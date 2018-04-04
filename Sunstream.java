import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JRadioButton;

public class Sunstream extends JFrame {

	private JPanel contentPane;
	private final JLabel lblNewLabel_1 = new JLabel(""); 
	calculateFoodPrice c = new calculateFoodPrice();
	static ArrayList<Food> listOfOrders= new ArrayList<>();;
	Drinks d;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sunstream frame = new Sunstream("");
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
	
//	public Sunstream(ArrayList<Food> listOfOrders) {
//		this.listOfOrders = listOfOrders;
//	}
	public Sunstream(String s1) {
		setTitle("Smart Campus Cafe- Menu");
		
		//listOfOrders = new ArrayList<>();
		
		System.out.println("From the sunstream class ");
		for(int i = 0 ; i< listOfOrders.size();i++) {
			System.out.println(listOfOrders.get(i).name);
			System.out.println(listOfOrders.get(i).size);
			System.out.println(listOfOrders.get(i).quantity);
			System.out.println(listOfOrders.get(i).price);
		}
		if(s1.equals("Sunstream")) {
			lblNewLabel_1.setText("Sunstream");
		}
		else if(s1.equals("Mission Bakery")) {
			lblNewLabel_1.setText("Mission Bakkery");
		}
		else if(s1.equals("Cadence")) {
			lblNewLabel_1.setText("Cadence");
		}
		else if(s1.equals("Cafe 404")) {
			lblNewLabel_1.setText("Cafe 404");
		}
		else {
		}
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 712, 670);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("Coffee, Espersso & Hot drinks");
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 60, 247, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Fresh brewed coffee - $2.05");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton.setBackground(Color.CYAN);
				btnNewButton.setForeground(Color.BLACK);
				btnNewButton.setFont(new Font("Calibri", Font.BOLD, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setBackground(Color.LIGHT_GRAY);
				btnNewButton.setForeground(Color.GRAY);
				btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 12));
			}
		});
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//create object for Drinks
				listOfOrders.add(new Food("Fresh Brewed Coffee"));
				c.test("Freshbrewedcoffee");
				Drinks d1 =new Drinks(c,listOfOrders);
				d1.setVisible(true);
			}
		});
		btnNewButton.setBounds(10, 96, 198, 37);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Latte - $3.35");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton_1.setBackground(Color.CYAN);
				btnNewButton_1.setForeground(Color.BLACK);
				btnNewButton_1.setFont(new Font("Calibri", Font.BOLD, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_1.setBackground(Color.LIGHT_GRAY);
				btnNewButton_1.setForeground(Color.GRAY);
				btnNewButton_1.setFont(new Font("Calibri", Font.PLAIN, 12));
			}
		});
		btnNewButton_1.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnNewButton_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//create object for Drinks
				listOfOrders.add(new Food("Latte"));
				c.test("Latte");
				Drinks d2 =new Drinks(c,listOfOrders);
				d2.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(10, 160, 198, 37);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Mocha - $4.35");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton_2.setBackground(Color.CYAN);
				btnNewButton_2.setForeground(Color.BLACK);
				btnNewButton_2.setFont(new Font("Calibri", Font.BOLD, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_2.setBackground(Color.LIGHT_GRAY);
				btnNewButton_2.setForeground(Color.GRAY);
				btnNewButton_2.setFont(new Font("Calibri", Font.PLAIN, 12));
			}
		});
		btnNewButton_2.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnNewButton_2.setForeground(Color.DARK_GRAY);
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//create object for Drinks
				listOfOrders.add(new Food("mocha"));
				c.test("mocha");
				Drinks d3 =new Drinks(c,listOfOrders);
				d3.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(218, 96, 199, 37);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("White Mocha - $4.05");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton_3.setBackground(Color.CYAN);
				btnNewButton_3.setForeground(Color.BLACK);
				btnNewButton_3.setFont(new Font("Calibri", Font.BOLD, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_3.setBackground(Color.LIGHT_GRAY);
				btnNewButton_3.setForeground(Color.GRAY);
				btnNewButton_3.setFont(new Font("Calibri", Font.PLAIN, 12));
			}
		});
		btnNewButton_3.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnNewButton_3.setForeground(Color.DARK_GRAY);
		btnNewButton_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//create object for Drinks
				listOfOrders.add(new Food("White Mocha"));
				c.test("WhiteMocha");
				Drinks d4 =new Drinks(c,listOfOrders);
				d4.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(218, 160, 199, 37);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_2 = new JLabel("Iced drinks");
		lblNewLabel_2.setForeground(Color.ORANGE);
		lblNewLabel_2.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 227, 150, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_4 = new JButton("Iced Coffee - $2.55");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton_4.setBackground(Color.CYAN);
				btnNewButton_4.setForeground(Color.BLACK);
				btnNewButton_4.setFont(new Font("Calibri", Font.BOLD, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_4.setBackground(Color.LIGHT_GRAY);
				btnNewButton_4.setForeground(Color.GRAY);
				btnNewButton_4.setFont(new Font("Calibri", Font.PLAIN, 12));
			}
		});
		btnNewButton_4.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnNewButton_4.setForeground(Color.DARK_GRAY);
		btnNewButton_4.setBackground(Color.LIGHT_GRAY);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//create object for Drinks
				listOfOrders.add(new Food("Ice Coffee"));
				c.test("IcedCoffee");
				Drinks d5 =new Drinks(c,listOfOrders);
				d5.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(10, 265, 198, 37);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Lemonade - $2.05");
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton_5.setBackground(Color.CYAN);
				btnNewButton_5.setForeground(Color.BLACK);
				btnNewButton_5.setFont(new Font("Calibri", Font.BOLD, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_5.setBackground(Color.LIGHT_GRAY);
				btnNewButton_5.setForeground(Color.GRAY);
				btnNewButton_5.setFont(new Font("Calibri", Font.PLAIN, 12));
			}
		});
		btnNewButton_5.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnNewButton_5.setForeground(Color.DARK_GRAY);
		btnNewButton_5.setBackground(Color.LIGHT_GRAY);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				listOfOrders.add(new Food("Lemonade"));
				c.test("lemonade");
				//create object for Drinks
				Drinks d6 =new Drinks(c,listOfOrders);
				d6.setVisible(true);
			}
		});
		btnNewButton_5.setBounds(10, 335, 198, 37);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Mocha - $4.35");
		btnNewButton_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton_6.setBackground(Color.CYAN);
				btnNewButton_6.setForeground(Color.BLACK);
				btnNewButton_6.setFont(new Font("Calibri", Font.BOLD, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_6.setBackground(Color.LIGHT_GRAY);
				btnNewButton_6.setForeground(Color.GRAY);
				btnNewButton_6.setFont(new Font("Calibri", Font.PLAIN, 12));
			}
		});
		btnNewButton_6.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//create object for Drinks
				listOfOrders.add(new Food("Ice Mocha"));
				c.test("IcedMocha");
				Drinks d7 =new Drinks(c,listOfOrders);
				d7.setVisible(true);
			}
		});
		btnNewButton_6.setForeground(Color.DARK_GRAY);
		btnNewButton_6.setBackground(Color.LIGHT_GRAY);
		btnNewButton_6.setBounds(218, 265, 199, 37);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("White Mocha - $4.05");
		btnNewButton_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton_7.setBackground(Color.CYAN);
				btnNewButton_7.setForeground(Color.BLACK);
				btnNewButton_7.setFont(new Font("Calibri", Font.BOLD, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_7.setBackground(Color.LIGHT_GRAY);
				btnNewButton_7.setForeground(Color.GRAY);
				btnNewButton_7.setFont(new Font("Calibri", Font.PLAIN, 12));
			}
		});
		btnNewButton_7.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnNewButton_7.setForeground(Color.DARK_GRAY);
		btnNewButton_7.setBackground(Color.LIGHT_GRAY);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//create object for Drinks
				listOfOrders.add(new Food("Ice White Mocha"));
				c.test("IcedWhiteMocha");
				Drinks d8 =new Drinks(c,listOfOrders);
				d8.setVisible(true);
			}
		});
		btnNewButton_7.setBounds(218, 335, 199, 37);
		contentPane.add(btnNewButton_7);
		
		JButton btnBack = new JButton("Back");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnBack.setBackground(Color.CYAN);
				btnBack.setForeground(Color.BLACK);
				btnBack.setFont(new Font("Calibri", Font.BOLD, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnBack.setBackground(Color.LIGHT_GRAY);
				btnBack.setForeground(Color.GRAY);
				btnBack.setFont(new Font("Calibri", Font.PLAIN, 12));
			}
		});
		btnBack.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnBack.setBackground(Color.LIGHT_GRAY);
		btnBack.setForeground(Color.DARK_GRAY);
		btnBack.setBounds(427, 577, 180, 43);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//create object for mainmenu
				//mainmenu mm1 =new mainmenu();
				//mm1.setVisible(true);
			}
		});
		contentPane.add(btnBack);
		
		JLabel lblBakedItems = new JLabel("Baked Items");
		lblBakedItems.setForeground(Color.ORANGE);
		lblBakedItems.setFont(new Font("Calibri", Font.BOLD, 14));
		lblBakedItems.setBounds(10, 403, 89, 14);
		contentPane.add(lblBakedItems);
		
		JButton btnBagel = new JButton("Bagel - $1.59");
		btnBagel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				listOfOrders.add(new Food("Bagel"));
				listOfOrders.get(listOfOrders.size()-1).price =1.59;
				listOfOrders.get(listOfOrders.size()-1).quantity =1;
				Checkout obj = new Checkout(listOfOrders);
				obj.setVisible(true);
//				Drinks d8 =new Drinks(c,listOfOrders);
//				d8.setVisible(true);
			}
		});
		btnBagel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnBagel.setBackground(Color.CYAN);
				btnBagel.setForeground(Color.BLACK);
				btnBagel.setFont(new Font("Calibri", Font.BOLD, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnBagel.setBackground(Color.LIGHT_GRAY);
				btnBagel.setForeground(Color.GRAY);
				btnBagel.setFont(new Font("Calibri", Font.PLAIN, 12));
			}
		});
		btnBagel.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnBagel.setBackground(Color.LIGHT_GRAY);
		btnBagel.setForeground(Color.DARK_GRAY);
		btnBagel.setBounds(10, 441, 165, 37);
		contentPane.add(btnBagel);
		
		JButton btnMuffin = new JButton("Muffin - $2.99");
		btnMuffin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listOfOrders.add(new Food("Muffin"));
				listOfOrders.get(listOfOrders.size()-1).price =2.99;
				listOfOrders.get(listOfOrders.size()-1).quantity =1;
				c.test("Muffin");
				Checkout obj = new Checkout(listOfOrders);
				obj.setVisible(true);
//				Drinks d8 =new Drinks(c,listOfOrders);
//				d8.setVisible(true);
			}
		});
		btnMuffin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnMuffin.setBackground(Color.CYAN);
				btnMuffin.setForeground(Color.BLACK);
				btnMuffin.setFont(new Font("Calibri", Font.BOLD, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnMuffin.setBackground(Color.LIGHT_GRAY);
				btnMuffin.setForeground(Color.GRAY);
				btnMuffin.setFont(new Font("Calibri", Font.PLAIN, 12));
			}
		});
		btnMuffin.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnMuffin.setBackground(Color.LIGHT_GRAY);
		btnMuffin.setForeground(Color.DARK_GRAY);
		btnMuffin.setBounds(218, 441, 165, 37);
		contentPane.add(btnMuffin);
		
		JButton btnScone = new JButton("Scone - $3.09");
		btnScone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listOfOrders.add(new Food("Scone"));
				listOfOrders.get(listOfOrders.size()-1).price =3.09;
				listOfOrders.get(listOfOrders.size()-1).quantity =1;
				c.test("Scone");
				System.out.println(c.total);
				Checkout obj = new Checkout(listOfOrders);
				obj.setVisible(true);
//				Drinks d8 =new Drinks(c,listOfOrders);
//				d8.setVisible(true);
			}
		});
		btnScone.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnScone.setBackground(Color.CYAN);
				btnScone.setForeground(Color.BLACK);
				btnScone.setFont(new Font("Calibri", Font.BOLD, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnScone.setBackground(Color.LIGHT_GRAY);
				btnScone.setForeground(Color.GRAY);
				btnScone.setFont(new Font("Calibri", Font.PLAIN, 12));
			}
		});
		btnScone.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnScone.setBackground(Color.LIGHT_GRAY);
		btnScone.setForeground(Color.DARK_GRAY);
		btnScone.setBounds(10, 505, 165, 37);
		contentPane.add(btnScone);
		
		JButton btnDonut = new JButton("Donut - $2.56");
		btnDonut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listOfOrders.add(new Food("Donut"));
				c.test("Donut");
				listOfOrders.get(listOfOrders.size()-1).price =2.56;
				listOfOrders.get(listOfOrders.size()-1).quantity =1;
				Checkout obj = new Checkout(listOfOrders);
				obj.setVisible(true);
//				Drinks d8 =new Drinks(c,listOfOrders);
//				d8.setVisible(true);
			}
		});
		btnDonut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnDonut.setBackground(Color.CYAN);
				btnDonut.setForeground(Color.BLACK);
				btnDonut.setFont(new Font("Calibri", Font.BOLD, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnDonut.setBackground(Color.LIGHT_GRAY);
				btnDonut.setForeground(Color.GRAY);
				btnDonut.setFont(new Font("Calibri", Font.PLAIN, 12));
			}
		});
		btnDonut.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnDonut.setBackground(Color.LIGHT_GRAY);
		btnDonut.setForeground(Color.DARK_GRAY);
		btnDonut.setBounds(218, 505, 165, 37);
		contentPane.add(btnDonut);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 695, 43);
		contentPane.add(panel);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(new Color(0, 139, 139));
		lblNewLabel_1.setFont(new Font("Castellar", Font.BOLD, 23));
		
		JButton btnNewButton_8 = new JButton("Apple Cider - $2.49");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listOfOrders.add(new Food("Apple Cider"));
				c.test("AppleCider");
				Drinks d8 =new Drinks(c,listOfOrders);
				d8.setVisible(true);
			}
		});
		btnNewButton_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton_8.setBackground(Color.CYAN);
				btnNewButton_8.setForeground(Color.BLACK);
				btnNewButton_8.setFont(new Font("Calibri", Font.BOLD, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_8.setBackground(Color.LIGHT_GRAY);
				btnNewButton_8.setForeground(Color.GRAY);
				btnNewButton_8.setFont(new Font("Calibri", Font.PLAIN, 12));
			}
		});
		btnNewButton_8.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnNewButton_8.setBackground(Color.LIGHT_GRAY);
		btnNewButton_8.setForeground(Color.DARK_GRAY);
		btnNewButton_8.setBounds(427, 96, 180, 37);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("Hot Chocolate - $2.30");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listOfOrders.add(new Food("Hot Chocolate"));
				c.test("HotChocolate");
				Drinks d8 =new Drinks(c,listOfOrders);
				d8.setVisible(true);
			}
		});
		btnNewButton_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton_9.setBackground(Color.CYAN);
				btnNewButton_9.setForeground(Color.BLACK);
				btnNewButton_9.setFont(new Font("Calibri", Font.BOLD, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_9.setBackground(Color.LIGHT_GRAY);
				btnNewButton_9.setForeground(Color.GRAY);
				btnNewButton_9.setFont(new Font("Calibri", Font.PLAIN, 12));
			}
		});
		btnNewButton_9.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnNewButton_9.setBackground(Color.LIGHT_GRAY);
		btnNewButton_9.setForeground(Color.DARK_GRAY);
		btnNewButton_9.setBounds(427, 160, 180, 37);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("Iced Tea - $1.95");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listOfOrders.add(new Food("Ice Tea"));
				c.test("IcedTea");
				Drinks d8 =new Drinks(c,listOfOrders);
				d8.setVisible(true);
			}
		});
		btnNewButton_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton_10.setBackground(Color.CYAN);
				btnNewButton_10.setForeground(Color.BLACK);
				btnNewButton_10.setFont(new Font("Calibri", Font.BOLD, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_10.setBackground(Color.LIGHT_GRAY);
				btnNewButton_10.setForeground(Color.GRAY);
				btnNewButton_10.setFont(new Font("Calibri", Font.PLAIN, 12));
			}
		});
		btnNewButton_10.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnNewButton_10.setBackground(Color.LIGHT_GRAY);
		btnNewButton_10.setForeground(Color.DARK_GRAY);
		btnNewButton_10.setBounds(427, 334, 180, 37);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("Bear Claw - $3.29");
		btnNewButton_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton_11.setBackground(Color.CYAN);
				btnNewButton_11.setForeground(Color.BLACK);
				btnNewButton_11.setFont(new Font("Calibri", Font.BOLD, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_11.setBackground(Color.LIGHT_GRAY);
				btnNewButton_11.setForeground(Color.GRAY);
				btnNewButton_11.setFont(new Font("Calibri", Font.PLAIN, 12));
			}
		});
		btnNewButton_11.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnNewButton_11.setBackground(Color.LIGHT_GRAY);
		btnNewButton_11.setForeground(Color.DARK_GRAY);
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listOfOrders.add(new Food("Bear Claw"));
				listOfOrders.get(listOfOrders.size()-1).price =3.29;
				listOfOrders.get(listOfOrders.size()-1).quantity =1;
				Checkout obj = new Checkout(listOfOrders);
				obj.setVisible(true);
			}
		});
		btnNewButton_11.setBounds(427, 440, 165, 37);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("Italian Soda - $2.45");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listOfOrders.add(new Food("Itilian Soda"));
				c.test("ItalianSoda");
				Drinks d8 =new Drinks(c,listOfOrders);
				d8.setVisible(true);
			}
		});
		btnNewButton_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton_12.setBackground(Color.CYAN);
				btnNewButton_12.setForeground(Color.BLACK);
				btnNewButton_12.setFont(new Font("Calibri", Font.BOLD, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_12.setBackground(Color.LIGHT_GRAY);
				btnNewButton_12.setForeground(Color.GRAY);
				btnNewButton_12.setFont(new Font("Calibri", Font.PLAIN, 12));
			}
		});
		btnNewButton_12.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnNewButton_12.setBackground(Color.LIGHT_GRAY);
		btnNewButton_12.setForeground(Color.DARK_GRAY);
		btnNewButton_12.setBounds(427, 265, 180, 37);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("Apple Fritter - $3.05");
		btnNewButton_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton_13.setBackground(Color.CYAN);
				btnNewButton_13.setForeground(Color.BLACK);
				btnNewButton_13.setFont(new Font("Calibri", Font.BOLD, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_13.setBackground(Color.LIGHT_GRAY);
				btnNewButton_13.setForeground(Color.GRAY);
				btnNewButton_13.setFont(new Font("Calibri", Font.PLAIN, 12));
			}
		});
		btnNewButton_13.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnNewButton_13.setBackground(Color.LIGHT_GRAY);
		btnNewButton_13.setForeground(Color.DARK_GRAY);
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listOfOrders.add(new Food("Apple Fritter"));
				listOfOrders.get(listOfOrders.size()-1).price =3.05;
				listOfOrders.get(listOfOrders.size()-1).quantity =1;
				Checkout obj = new Checkout(listOfOrders);
				obj.setVisible(true);
			}
		});
		btnNewButton_13.setBounds(427, 504, 165, 37);
		contentPane.add(btnNewButton_13);
		
		JLabel label = new JLabel("");
		label.setFont(new Font("Calibri", Font.PLAIN, 12));
		label.setBackground(Color.WHITE);
		
		label.setIcon(new ImageIcon("/Users/nirajmotiani/Desktop/Image/maxresdefault.jpg"));
		label.setBounds(0, 43, 695, 588);
		contentPane.add(label);
		
		
		
	}
}
