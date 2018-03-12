package menu;

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

public class Sunstream extends JFrame {

	private JPanel contentPane;
	private final JLabel lblNewLabel_1 = new JLabel("Sunstream");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sunstream frame = new Sunstream();
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
	public Sunstream() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 712, 670);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Coffee, Espersso & Hot drinks");
		lblNewLabel.setForeground(new Color(72, 209, 204));
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 43, 207, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Fresh brewed coffee");
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnNewButton.setForeground(Color.GRAY);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//create object for Drinks
				Drinks d1 =new Drinks();
				d1.setVisible(true);
			}
		});
		btnNewButton.setBounds(10, 85, 165, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Latte");
		btnNewButton_1.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnNewButton_1.setForeground(Color.GRAY);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(10, 134, 165, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Mocha");
		btnNewButton_2.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnNewButton_2.setForeground(Color.GRAY);
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(185, 85, 165, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("White Mocha");
		btnNewButton_3.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnNewButton_3.setForeground(Color.GRAY);
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setBounds(185, 134, 165, 23);
		contentPane.add(btnNewButton_3);
		lblNewLabel_1.setForeground(new Color(0, 139, 139));
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(286, 0, 122, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Iced drinks");
		lblNewLabel_2.setForeground(new Color(72, 209, 204));
		lblNewLabel_2.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 182, 150, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_4 = new JButton("Iced Coffee");
		btnNewButton_4.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnNewButton_4.setForeground(Color.GRAY);
		btnNewButton_4.setBackground(Color.WHITE);
		btnNewButton_4.setBounds(10, 224, 165, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Lemonade");
		btnNewButton_5.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnNewButton_5.setForeground(Color.GRAY);
		btnNewButton_5.setBackground(Color.WHITE);
		btnNewButton_5.setBounds(10, 274, 165, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Mocha");
		btnNewButton_6.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_6.setForeground(Color.GRAY);
		btnNewButton_6.setBackground(Color.WHITE);
		btnNewButton_6.setBounds(185, 224, 165, 23);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("White Mocha");
		btnNewButton_7.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnNewButton_7.setForeground(Color.GRAY);
		btnNewButton_7.setBackground(Color.WHITE);
		btnNewButton_7.setBounds(185, 274, 165, 23);
		contentPane.add(btnNewButton_7);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnBack.setBackground(Color.WHITE);
		btnBack.setForeground(Color.GRAY);
		btnBack.setBounds(599, 597, 73, 23);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//create object for mainmenu
				mainmenu mm1 =new mainmenu();
				mm1.setVisible(true);
			}
		});
		contentPane.add(btnBack);
		
		JLabel lblBakedItems = new JLabel("Baked Items");
		lblBakedItems.setForeground(new Color(72, 209, 204));
		lblBakedItems.setFont(new Font("Calibri", Font.BOLD, 14));
		lblBakedItems.setBounds(10, 329, 89, 14);
		contentPane.add(lblBakedItems);
		
		JButton btnBagel = new JButton("Bagel");
		btnBagel.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnBagel.setBackground(Color.WHITE);
		btnBagel.setForeground(Color.GRAY);
		btnBagel.setBounds(10, 364, 165, 23);
		contentPane.add(btnBagel);
		
		JButton btnMuffin = new JButton("Muffin");
		btnMuffin.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnMuffin.setBackground(Color.WHITE);
		btnMuffin.setForeground(Color.GRAY);
		btnMuffin.setBounds(185, 364, 165, 23);
		contentPane.add(btnMuffin);
		
		JButton btnScone = new JButton("Scone");
		btnScone.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnScone.setBackground(Color.WHITE);
		btnScone.setForeground(Color.GRAY);
		btnScone.setBounds(10, 411, 165, 23);
		contentPane.add(btnScone);
		
		JButton btnDonut = new JButton("Donut");
		btnDonut.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnDonut.setBackground(Color.WHITE);
		btnDonut.setForeground(Color.GRAY);
		btnDonut.setBounds(185, 411, 165, 23);
		contentPane.add(btnDonut);
		
		JLabel label = new JLabel("");
		label.setFont(new Font("Calibri", Font.PLAIN, 12));
		label.setBackground(Color.WHITE);
		label.setIcon(new ImageIcon(Sunstream.class.getResource("/images/maxresdefault.jpg")));
		label.setBounds(0, 0, 695, 631);
		contentPane.add(label);
	}
}
