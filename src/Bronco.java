import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.border.EtchedBorder;

public class Bronco extends JFrame {
	
	static public ArrayList<Food> listOfOrders = new ArrayList<>();
	private JPanel contentPane;
	Pizza p;
	Bronco_Burger b;
	calculateFoodPrice c;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bronco frame = new Bronco();
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
	public Bronco() {
		setTitle("Smart Campus Cafe- Menu");
		c=new calculateFoodPrice();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 712, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.ORANGE, Color.ORANGE));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Bronco");
		lblNewLabel_2.setIcon(new ImageIcon("/Users/nirajmotiani/Desktop/Image/Santa_Clara_Broncos_athletics_logo-53155e7854e31_30x30.gif"));
		lblNewLabel_2.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel_2.setForeground(new Color(46, 139, 87));
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setBounds(293, 0, 134, 50);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Burger");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listOfOrders.add(new Food("Burger"));
				c.test("Burger");
				Pizza d1 =new Pizza(listOfOrders);
				d1.setVisible(true);

			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton.setBackground(Color.CYAN);
				btnNewButton.setForeground(Color.BLACK);
				btnNewButton.setFont(new Font("Calibri", Font.BOLD, 16));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setBackground(Color.WHITE);
				btnNewButton.setForeground(Color.DARK_GRAY);
				btnNewButton.setFont(new Font("Corbel", Font.BOLD, 16));
			}
		});
		btnNewButton.setFont(new Font("Corbel", Font.BOLD, 18));
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(98, 97, 184, 66);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Pizza");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listOfOrders.add(new Food("Pizza"));
				c.test("Pizza");
				//Pizza d1 =new Pizza(listOfOrders);
				//d1.setVisible(true);
			}
		});
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton_1.setBackground(Color.CYAN);
				btnNewButton_1.setForeground(Color.BLACK);
				btnNewButton_1.setFont(new Font("Calibri", Font.BOLD, 16));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_1.setBackground(Color.WHITE);
				btnNewButton_1.setForeground(Color.DARK_GRAY);
				btnNewButton_1.setFont(new Font("Corbel", Font.BOLD, 16));
			}
		});
		btnNewButton_1.setFont(new Font("Corbel", Font.BOLD, 18));
		btnNewButton_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(98, 246, 184, 66);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Sandwiches");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listOfOrders.add(new Food("Sandwiches"));
				c.test("Sandwiches");
				Pizza d1 =new Pizza(listOfOrders);
				d1.setVisible(true);
			}
		});
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton_2.setBackground(Color.CYAN);
				btnNewButton_2.setForeground(Color.BLACK);
				btnNewButton_2.setFont(new Font("Calibri", Font.BOLD, 16));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_2.setBackground(Color.WHITE);
				btnNewButton_2.setForeground(Color.DARK_GRAY);
				btnNewButton_2.setFont(new Font("Corbel", Font.BOLD, 16));
			}
		});
		btnNewButton_2.setFont(new Font("Corbel", Font.BOLD, 18));
		btnNewButton_2.setForeground(Color.DARK_GRAY);
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(98, 385, 184, 60);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Back");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton_3.setBackground(Color.CYAN);
				btnNewButton_3.setForeground(Color.BLACK);
				btnNewButton_3.setFont(new Font("Calibri", Font.BOLD, 16));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_3.setBackground(Color.WHITE);
				btnNewButton_3.setForeground(Color.DARK_GRAY);
				btnNewButton_3.setFont(new Font("Corbel", Font.BOLD, 16));
			}
		});
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setForeground(Color.DARK_GRAY);
		btnNewButton_3.setFont(new Font("Corbel", Font.BOLD, 18));
		btnNewButton_3.setBounds(27, 500, 134, 50);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Next");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton_4.setBackground(Color.CYAN);
				btnNewButton_4.setForeground(Color.BLACK);
				btnNewButton_4.setFont(new Font("Calibri", Font.BOLD, 16));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_4.setBackground(Color.WHITE);
				btnNewButton_4.setForeground(Color.DARK_GRAY);
				btnNewButton_4.setFont(new Font("Corbel", Font.BOLD, 16));
			}
		});
		btnNewButton_4.setBackground(Color.WHITE);
		btnNewButton_4.setForeground(Color.DARK_GRAY);
		btnNewButton_4.setFont(new Font("Corbel", Font.BOLD, 18));
		btnNewButton_4.setBounds(222, 500, 146, 50);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Corbel", Font.BOLD, 18));
		lblNewLabel.setIcon(new ImageIcon("/Users/nirajmotiani/Desktop/Image/485056788_712x600.jpg"));
		lblNewLabel.setBounds(0, 50, 696, 511);
		contentPane.add(lblNewLabel);
	}
}
