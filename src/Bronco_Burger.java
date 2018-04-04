import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Bronco_Burger extends JFrame {

	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bronco_Burger frame = new Bronco_Burger();
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
	public Bronco_Burger() {
		setTitle("Smart Campus Cafe - Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 712, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		btnNewButton.setBounds(290, 500, 134, 50);
		contentPane.add(btnNewButton);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Ham");
		chckbxNewCheckBox_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				chckbxNewCheckBox_2.setForeground(Color.CYAN);
				chckbxNewCheckBox_2.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 18));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				chckbxNewCheckBox_2.setForeground(Color.WHITE);
				chckbxNewCheckBox_2.setFont(new Font("Corbel", Font.BOLD, 18));
			}
		});
		chckbxNewCheckBox_2.setForeground(Color.WHITE);
		chckbxNewCheckBox_2.setFont(new Font("Corbel", Font.BOLD, 18));
		chckbxNewCheckBox_2.setBackground(Color.WHITE);
		chckbxNewCheckBox_2.setOpaque(false);
		chckbxNewCheckBox_2.setBounds(599, 399, 97, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Tomato");
		chckbxNewCheckBox_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				chckbxNewCheckBox_3.setForeground(Color.CYAN);
				chckbxNewCheckBox_3.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 18));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				chckbxNewCheckBox_3.setForeground(Color.WHITE);
				chckbxNewCheckBox_3.setFont(new Font("Corbel", Font.BOLD, 18));
			}
		});
		chckbxNewCheckBox_3.setForeground(Color.WHITE);
		chckbxNewCheckBox_3.setFont(new Font("Corbel", Font.BOLD, 18));
		chckbxNewCheckBox_3.setBackground(Color.WHITE);
		chckbxNewCheckBox_3.setOpaque(false);
		chckbxNewCheckBox_3.setBounds(593, 336, 119, 23);
		contentPane.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Green Onions");
		chckbxNewCheckBox_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				chckbxNewCheckBox_4.setForeground(Color.CYAN);
				chckbxNewCheckBox_4.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 18));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				chckbxNewCheckBox_4.setForeground(Color.WHITE);
				chckbxNewCheckBox_4.setFont(new Font("Corbel", Font.BOLD, 18));
			}
		});
		chckbxNewCheckBox_4.setForeground(Color.WHITE);
		chckbxNewCheckBox_4.setFont(new Font("Corbel", Font.BOLD, 18));
		chckbxNewCheckBox_4.setBackground(Color.WHITE);
		chckbxNewCheckBox_4.setOpaque(false);
		chckbxNewCheckBox_4.setBounds(422, 336, 165, 23);
		contentPane.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Red Onions");
		chckbxNewCheckBox_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				chckbxNewCheckBox_5.setForeground(Color.CYAN);
				chckbxNewCheckBox_5.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 18));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				chckbxNewCheckBox_5.setForeground(Color.WHITE);
				chckbxNewCheckBox_5.setFont(new Font("Corbel", Font.BOLD, 18));
			}
		});
		chckbxNewCheckBox_5.setForeground(Color.WHITE);
		chckbxNewCheckBox_5.setFont(new Font("Corbel", Font.BOLD, 18));
		chckbxNewCheckBox_5.setBackground(Color.WHITE);
		chckbxNewCheckBox_5.setOpaque(false);
		chckbxNewCheckBox_5.setBounds(536, 259, 143, 23);
		contentPane.add(chckbxNewCheckBox_5);
		
		JButton btnNewButton_3 = new JButton("Next");
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
		btnNewButton_3.setBounds(484, 500, 134, 50);
		contentPane.add(btnNewButton_3);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Chicken");
		chckbxNewCheckBox_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				chckbxNewCheckBox_1.setForeground(Color.CYAN);
				chckbxNewCheckBox_1.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 18));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				chckbxNewCheckBox_1.setForeground(Color.WHITE);
				chckbxNewCheckBox_1.setFont(new Font("Corbel", Font.BOLD, 18));
			}
		});
		chckbxNewCheckBox_1.setForeground(Color.WHITE);
		chckbxNewCheckBox_1.setFont(new Font("Corbel", Font.BOLD, 18));
		chckbxNewCheckBox_1.setBackground(Color.WHITE);
		chckbxNewCheckBox_1.setOpaque(false);
		chckbxNewCheckBox_1.setBounds(452, 196, 119, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("Bell Peppers");
		chckbxNewCheckBox_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				chckbxNewCheckBox_6.setForeground(Color.CYAN);
				chckbxNewCheckBox_6.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 18));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				chckbxNewCheckBox_6.setForeground(Color.WHITE);
				chckbxNewCheckBox_6.setFont(new Font("Corbel", Font.BOLD, 18));
			}
		});
		chckbxNewCheckBox_6.setForeground(Color.WHITE);
		chckbxNewCheckBox_6.setFont(new Font("Corbel", Font.BOLD, 18));
		chckbxNewCheckBox_6.setBackground(Color.WHITE);
		chckbxNewCheckBox_6.setOpaque(false);
		chckbxNewCheckBox_6.setBounds(443, 399, 149, 23);
		contentPane.add(chckbxNewCheckBox_6);
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("Bacon");
		chckbxNewCheckBox_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				chckbxNewCheckBox_7.setForeground(Color.CYAN);
				chckbxNewCheckBox_7.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 18));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				chckbxNewCheckBox_7.setForeground(Color.WHITE);
				chckbxNewCheckBox_7.setFont(new Font("Corbel", Font.BOLD, 18));
			}
		});
		chckbxNewCheckBox_7.setForeground(Color.WHITE);
		chckbxNewCheckBox_7.setFont(new Font("Corbel", Font.BOLD, 18));
		chckbxNewCheckBox_7.setBackground(Color.WHITE);
		chckbxNewCheckBox_7.setOpaque(false);
		chckbxNewCheckBox_7.setBounds(412, 259, 97, 23);
		contentPane.add(chckbxNewCheckBox_7);
		
		JCheckBox chckbxNewCheckBox_9 = new JCheckBox("Jalapeno");
		chckbxNewCheckBox_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				chckbxNewCheckBox_9.setForeground(Color.CYAN);
				chckbxNewCheckBox_9.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 18));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				chckbxNewCheckBox_9.setForeground(Color.WHITE);
				chckbxNewCheckBox_9.setFont(new Font("Corbel", Font.BOLD, 18));
			}
		});
		chckbxNewCheckBox_9.setForeground(Color.WHITE);
		chckbxNewCheckBox_9.setFont(new Font("Corbel", Font.BOLD, 18));
		chckbxNewCheckBox_9.setBackground(Color.WHITE);
		chckbxNewCheckBox_9.setOpaque(false);
		chckbxNewCheckBox_9.setBounds(548, 470, 131, 23);
		contentPane.add(chckbxNewCheckBox_9);
		
		JCheckBox chckbxNewCheckBox_8 = new JCheckBox("Pineapple");
		chckbxNewCheckBox_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				chckbxNewCheckBox_8.setForeground(Color.CYAN);
				chckbxNewCheckBox_8.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 18));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				chckbxNewCheckBox_8.setForeground(Color.WHITE);
				chckbxNewCheckBox_8.setFont(new Font("Corbel", Font.BOLD, 18));
			}
		});
		chckbxNewCheckBox_8.setForeground(Color.WHITE);
		chckbxNewCheckBox_8.setFont(new Font("Corbel", Font.BOLD, 18));
		chckbxNewCheckBox_8.setBackground(Color.WHITE);
		chckbxNewCheckBox_8.setOpaque(false);
		chckbxNewCheckBox_8.setBounds(412, 470, 137, 23);
		contentPane.add(chckbxNewCheckBox_8);
		
		JLabel lblNewLabel = new JLabel("Sauce");
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 22));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(155, 52, 127, 27);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Tomato");
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
		rdbtnNewRadioButton.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		rdbtnNewRadioButton.setBackground(Color.WHITE);
		rdbtnNewRadioButton.setOpaque(false);
		rdbtnNewRadioButton.setBounds(215, 100, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Cheese Garlic");
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
		rdbtnNewRadioButton_1.setBounds(375, 100, 174, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		ButtonGroup group= new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Toppings ($2 each)");
		lblNewLabel_1.setForeground(Color.ORANGE);
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 22));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(262, 149, 247, 23);
		contentPane.add(lblNewLabel_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Pepperoni");
		chckbxNewCheckBox.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				chckbxNewCheckBox.setForeground(Color.CYAN);
				chckbxNewCheckBox.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 18));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				chckbxNewCheckBox.setForeground(Color.WHITE);
				chckbxNewCheckBox.setFont(new Font("Corbel", Font.BOLD, 18));
			}
		});
		chckbxNewCheckBox.setForeground(Color.WHITE);
		chckbxNewCheckBox.setFont(new Font("Corbel", Font.BOLD, 18));
		chckbxNewCheckBox.setBackground(Color.WHITE);
		chckbxNewCheckBox.setOpaque(false);
		chckbxNewCheckBox.setBounds(302, 196, 138, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("/Users/nirajmotiani/Desktop/Image/9059b141b038fc6_712x600.jpg"));
		label.setBounds(0, 52, 696, 509);
		contentPane.add(label);
		
		JLabel lblPizza = new JLabel("Pizza");
		lblPizza.setIcon(new ImageIcon("/Users/nirajmotiani/Desktop/Image/Pizza_slice_icon_30x30.png"));
		lblPizza.setForeground(new Color(255, 51, 0));
		lblPizza.setFont(new Font("Century Gothic", Font.BOLD, 22));
		lblPizza.setBackground(Color.WHITE);
		lblPizza.setBounds(10, 11, 107, 39);
		contentPane.add(lblPizza);
		
		JLabel label_1 = new JLabel("");
		label_1.setBackground(Color.WHITE);
		label_1.setBounds(0, 0, 696, 50);
		contentPane.add(label_1);
	}
}
