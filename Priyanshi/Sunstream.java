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
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Coffee, Espersso & Hot drinks");
		lblNewLabel.setForeground(new Color(102, 0, 0));
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 43, 207, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Fresh brewed coffee");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(204, 102, 0));
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
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(204, 102, 0));
		btnNewButton_1.setBounds(10, 134, 165, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Mocha");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(new Color(204, 102, 0));
		btnNewButton_2.setBounds(185, 85, 165, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("White Mocha");
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setBackground(new Color(204, 102, 0));
		btnNewButton_3.setBounds(185, 134, 165, 23);
		contentPane.add(btnNewButton_3);
		lblNewLabel_1.setForeground(new Color(153, 51, 0));
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(206, 0, 122, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Iced drinks");
		lblNewLabel_2.setForeground(new Color(102, 0, 0));
		lblNewLabel_2.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 182, 150, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_4 = new JButton("Iced Coffee");
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.setBackground(new Color(204, 102, 0));
		btnNewButton_4.setBounds(10, 224, 165, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Lemonade");
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setBackground(new Color(204, 102, 0));
		btnNewButton_5.setBounds(10, 274, 165, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Mocha");
		btnNewButton_6.setForeground(Color.WHITE);
		btnNewButton_6.setBackground(new Color(204, 102, 0));
		btnNewButton_6.setBounds(185, 224, 165, 23);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("White Mocha");
		btnNewButton_7.setForeground(Color.WHITE);
		btnNewButton_7.setBackground(new Color(204, 102, 0));
		btnNewButton_7.setBounds(185, 274, 165, 23);
		contentPane.add(btnNewButton_7);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(204, 102, 0));
		btnBack.setForeground(Color.WHITE);
		btnBack.setBounds(451, 327, 73, 23);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//create object for mainmenu
				mainmenu mm1 =new mainmenu();
				mm1.setVisible(true);
			}
		});
		contentPane.add(btnBack);
	}

}
