import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Pizza extends JFrame {

	private JPanel contentPane;
	calculateFoodPrice c;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pizza frame = new Pizza(null);
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
	public Pizza(ArrayList<Food> listOfOrders) {
		setTitle("Smart Campus Cafe- Menu");
		//this.c=c;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 711, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cheese");
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(10, 50, 109, 24);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("American");
		rdbtnNewRadioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				rdbtnNewRadioButton.setForeground(Color.CYAN);
				rdbtnNewRadioButton.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 18));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				rdbtnNewRadioButton.setForeground(Color.WHITE);
				rdbtnNewRadioButton.setFont(new Font("Corbel", Font.BOLD, 18));
			}
		});
		rdbtnNewRadioButton.setForeground(Color.WHITE);
		rdbtnNewRadioButton.setFont(new Font("Corbel", Font.BOLD, 18));
		rdbtnNewRadioButton.setBackground(Color.WHITE);
		rdbtnNewRadioButton.setOpaque(false);
		rdbtnNewRadioButton.setBounds(10, 81, 121, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Cheddar");
		rdbtnNewRadioButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				rdbtnNewRadioButton_1.setForeground(Color.CYAN);
				rdbtnNewRadioButton_1.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 18));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				rdbtnNewRadioButton_1.setForeground(Color.WHITE);
				rdbtnNewRadioButton_1.setFont(new Font("Corbel", Font.BOLD, 18));
			}
		});
		rdbtnNewRadioButton_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_1.setFont(new Font("Corbel", Font.BOLD, 18));
		rdbtnNewRadioButton_1.setBackground(Color.WHITE);
		rdbtnNewRadioButton_1.setOpaque(false);
		rdbtnNewRadioButton_1.setBounds(165, 81, 121, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Provolone");
		rdbtnNewRadioButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				rdbtnNewRadioButton_2.setForeground(Color.CYAN);
				rdbtnNewRadioButton_2.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 18));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				rdbtnNewRadioButton_2.setForeground(Color.WHITE);
				rdbtnNewRadioButton_2.setFont(new Font("Corbel", Font.BOLD, 18));
			}
		});
		rdbtnNewRadioButton_2.setForeground(Color.WHITE);
		rdbtnNewRadioButton_2.setFont(new Font("Corbel", Font.BOLD, 18));
		rdbtnNewRadioButton_2.setBackground(Color.WHITE);
		rdbtnNewRadioButton_2.setOpaque(false);
		rdbtnNewRadioButton_2.setBounds(10, 131, 143, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("PepperJack");
		rdbtnNewRadioButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				rdbtnNewRadioButton_3.setForeground(Color.CYAN);
				rdbtnNewRadioButton_3.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 18));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				rdbtnNewRadioButton_3.setForeground(Color.WHITE);
				rdbtnNewRadioButton_3.setFont(new Font("Corbel", Font.BOLD, 18));
			}
		});
		rdbtnNewRadioButton_3.setForeground(Color.WHITE);
		rdbtnNewRadioButton_3.setFont(new Font("Corbel", Font.BOLD, 18));
		rdbtnNewRadioButton_3.setBackground(Color.WHITE);
		rdbtnNewRadioButton_3.setOpaque(false);
		rdbtnNewRadioButton_3.setBounds(165, 131, 154, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("Patty");
		lblNewLabel_1.setForeground(Color.ORANGE);
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 192, 46, 25);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Beef");
		rdbtnNewRadioButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				rdbtnNewRadioButton_4.setForeground(Color.CYAN);
				rdbtnNewRadioButton_4.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 18));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				rdbtnNewRadioButton_4.setForeground(Color.WHITE);
				rdbtnNewRadioButton_4.setFont(new Font("Corbel", Font.BOLD, 18));
			}
		});
		rdbtnNewRadioButton_4.setForeground(Color.WHITE);
		rdbtnNewRadioButton_4.setFont(new Font("Corbel", Font.BOLD, 18));
		rdbtnNewRadioButton_4.setBackground(Color.WHITE);
		rdbtnNewRadioButton_4.setOpaque(false);
		rdbtnNewRadioButton_4.setBounds(10, 224, 109, 23);
		contentPane.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Chicken");
		rdbtnNewRadioButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				rdbtnNewRadioButton_5.setForeground(Color.CYAN);
				rdbtnNewRadioButton_5.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 18));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				rdbtnNewRadioButton_5.setForeground(Color.WHITE);
				rdbtnNewRadioButton_5.setFont(new Font("Corbel", Font.BOLD, 18));
			}
		});
		rdbtnNewRadioButton_5.setForeground(Color.WHITE);
		rdbtnNewRadioButton_5.setFont(new Font("Corbel", Font.BOLD, 18));
		rdbtnNewRadioButton_5.setBackground(Color.WHITE);
		rdbtnNewRadioButton_5.setOpaque(false);
		rdbtnNewRadioButton_5.setBounds(165, 270, 109, 23);
		contentPane.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Garden");
		rdbtnNewRadioButton_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				rdbtnNewRadioButton_6.setForeground(Color.CYAN);
				rdbtnNewRadioButton_6.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 18));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				rdbtnNewRadioButton_6.setForeground(Color.WHITE);
				rdbtnNewRadioButton_6.setFont(new Font("Corbel", Font.BOLD, 18));
			}
		});
		rdbtnNewRadioButton_6.setForeground(Color.WHITE);
		rdbtnNewRadioButton_6.setFont(new Font("Corbel", Font.BOLD, 18));
		rdbtnNewRadioButton_6.setBackground(Color.WHITE);
		rdbtnNewRadioButton_6.setOpaque(false);
		rdbtnNewRadioButton_6.setBounds(10, 270, 109, 23);
		contentPane.add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Turkey");
		rdbtnNewRadioButton_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				rdbtnNewRadioButton_7.setForeground(Color.CYAN);
				rdbtnNewRadioButton_7.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 18));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				rdbtnNewRadioButton_7.setForeground(Color.WHITE);
				rdbtnNewRadioButton_7.setFont(new Font("Corbel", Font.BOLD, 18));
			}
		});
		rdbtnNewRadioButton_7.setForeground(Color.WHITE);
		rdbtnNewRadioButton_7.setFont(new Font("Corbel", Font.BOLD, 18));
		rdbtnNewRadioButton_7.setBackground(Color.WHITE);
		rdbtnNewRadioButton_7.setOpaque(false);
		rdbtnNewRadioButton_7.setBounds(165, 224, 109, 23);
		contentPane.add(rdbtnNewRadioButton_7);
		
		JLabel lblNewLabel_2 = new JLabel("Sides");
		lblNewLabel_2.setForeground(Color.ORANGE);
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setBounds(10, 325, 57, 24);
		contentPane.add(lblNewLabel_2);
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("Curly Fries");
		rdbtnNewRadioButton_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				rdbtnNewRadioButton_8.setForeground(Color.CYAN);
				rdbtnNewRadioButton_8.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 18));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				rdbtnNewRadioButton_8.setForeground(Color.WHITE);
				rdbtnNewRadioButton_8.setFont(new Font("Corbel", Font.BOLD, 18));
			}
		});
		rdbtnNewRadioButton_8.setForeground(Color.WHITE);
		rdbtnNewRadioButton_8.setFont(new Font("Corbel", Font.BOLD, 18));
		rdbtnNewRadioButton_8.setBackground(Color.WHITE);
		rdbtnNewRadioButton_8.setOpaque(false);
		rdbtnNewRadioButton_8.setBounds(10, 370, 139, 23);
		contentPane.add(rdbtnNewRadioButton_8);
		
		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("French Fries");
		rdbtnNewRadioButton_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				rdbtnNewRadioButton_9.setForeground(Color.CYAN);
				rdbtnNewRadioButton_9.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 18));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				rdbtnNewRadioButton_9.setForeground(Color.WHITE);
				rdbtnNewRadioButton_9.setFont(new Font("Corbel", Font.BOLD, 18));
			}
		});
		rdbtnNewRadioButton_9.setForeground(Color.WHITE);
		rdbtnNewRadioButton_9.setFont(new Font("Corbel", Font.BOLD, 18));
		rdbtnNewRadioButton_9.setBackground(Color.WHITE);
		rdbtnNewRadioButton_9.setOpaque(false);
		rdbtnNewRadioButton_9.setBounds(199, 370, 163, 23);
		contentPane.add(rdbtnNewRadioButton_9);
		
		JRadioButton rdbtnNewRadioButton_10 = new JRadioButton("Garden Salad");
		rdbtnNewRadioButton_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				rdbtnNewRadioButton_10.setForeground(Color.CYAN);
				rdbtnNewRadioButton_10.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 18));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				rdbtnNewRadioButton_10.setForeground(Color.WHITE);
				rdbtnNewRadioButton_10.setFont(new Font("Corbel", Font.BOLD, 18));
			}
		});
		rdbtnNewRadioButton_10.setForeground(Color.WHITE);
		rdbtnNewRadioButton_10.setFont(new Font("Corbel", Font.BOLD, 18));
		rdbtnNewRadioButton_10.setBackground(Color.WHITE);
		rdbtnNewRadioButton_10.setOpaque(false);
		rdbtnNewRadioButton_10.setBounds(94, 431, 169, 23);
		contentPane.add(rdbtnNewRadioButton_10);
		
		JButton btnNewButton = new JButton("Back");
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
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Corbel", Font.BOLD, 18));
		btnNewButton.setBounds(40, 507, 109, 43);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Next");
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
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1.setFont(new Font("Corbel", Font.BOLD, 18));
		btnNewButton_1.setBounds(210, 507, 109, 43);
		contentPane.add(btnNewButton_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("/Users/nirajmotiani/Desktop/Image/burger_712x600.jpg"));
		label.setBounds(0, 50, 695, 511);
		contentPane.add(label);
		
		JLabel lblBurger = new JLabel();
		if(listOfOrders.get(listOfOrders.size()-1).name.equals("Burger"))
			lblBurger.setText("Burger");
		else if(listOfOrders.get(listOfOrders.size()-1).name.equals("Burger"))
			lblBurger.setText("Sandwich");
		else 
			lblBurger.setText("");
		lblBurger.setIcon(new ImageIcon("/Users/nirajmotiani/Desktop/Image/59bf11805ef75743c3c4dc30514a9564_30x30.png"));
		lblBurger.setForeground(new Color(255, 51, 0));
		lblBurger.setFont(new Font("Century Gothic", Font.BOLD, 22));
		lblBurger.setBackground(Color.WHITE);
		lblBurger.setBounds(0, 0, 115, 50);
		contentPane.add(lblBurger);
	}

}
