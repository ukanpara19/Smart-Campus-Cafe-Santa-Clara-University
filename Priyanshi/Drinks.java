package menu;


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
import javax.swing.ImageIcon;

public class Drinks extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Drinks frame = new Drinks();
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
	public Drinks() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 712, 670);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GRAY);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fresh Brewed Coffee");
		lblNewLabel.setForeground(new Color(0, 139, 139));
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 18));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(10, 22, 182, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Size");
		lblNewLabel_1.setForeground(new Color(72, 209, 204));
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 68, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Tall");
		rdbtnNewRadioButton.setForeground(Color.WHITE);
		rdbtnNewRadioButton.setFont(new Font("Calibri", Font.PLAIN, 12));
		rdbtnNewRadioButton.setBackground(Color.WHITE);
		rdbtnNewRadioButton.setBounds(10, 89, 109, 23);
		rdbtnNewRadioButton.setOpaque(false);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Grande");
		rdbtnNewRadioButton_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_1.setFont(new Font("Calibri", Font.PLAIN, 12));
		rdbtnNewRadioButton_1.setBackground(Color.WHITE);
		rdbtnNewRadioButton_1.setBounds(152, 89, 109, 23);
		rdbtnNewRadioButton_1.setOpaque(false);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Venti");
		rdbtnNewRadioButton_2.setForeground(Color.WHITE);
		rdbtnNewRadioButton_2.setFont(new Font("Calibri", Font.PLAIN, 12));
		rdbtnNewRadioButton_2.setBackground(Color.WHITE);
		rdbtnNewRadioButton_2.setBounds(304, 89, 109, 23);
		rdbtnNewRadioButton_2.setOpaque(false);
		contentPane.add(rdbtnNewRadioButton_2);
		
		ButtonGroup group= new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("Add Flavor Shot?");
		lblNewLabel_2.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_2.setForeground(new Color(72, 209, 204));
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setBounds(10, 157, 119, 14);
		contentPane.add(lblNewLabel_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Vanilla");
		chckbxNewCheckBox.setForeground(Color.WHITE);
		chckbxNewCheckBox.setFont(new Font("Calibri", Font.PLAIN, 12));
		chckbxNewCheckBox.setBackground(Color.WHITE);
		chckbxNewCheckBox.setBounds(10, 204, 97, 23);
		chckbxNewCheckBox.setOpaque(false);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Caramel");
		chckbxNewCheckBox_1.setForeground(Color.WHITE);
		chckbxNewCheckBox_1.setFont(new Font("Calibri", Font.PLAIN, 12));
		chckbxNewCheckBox_1.setBackground(Color.WHITE);
		chckbxNewCheckBox_1.setBounds(151, 204, 97, 23);
		chckbxNewCheckBox_1.setOpaque(false);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Hazelnut");
		chckbxNewCheckBox_2.setForeground(Color.WHITE);
		chckbxNewCheckBox_2.setFont(new Font("Calibri", Font.PLAIN, 12));
		chckbxNewCheckBox_2.setBackground(Color.WHITE);
		chckbxNewCheckBox_2.setBounds(282, 248, 97, 23);
		chckbxNewCheckBox_2.setOpaque(false);
		contentPane.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Peppermint");
		chckbxNewCheckBox_3.setForeground(Color.WHITE);
		chckbxNewCheckBox_3.setFont(new Font("Calibri", Font.PLAIN, 12));
		chckbxNewCheckBox_3.setBackground(Color.WHITE);
		chckbxNewCheckBox_3.setBounds(10, 248, 97, 23);
		chckbxNewCheckBox_3.setOpaque(false);
		contentPane.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Almond");
		chckbxNewCheckBox_4.setForeground(Color.WHITE);
		chckbxNewCheckBox_4.setFont(new Font("Calibri", Font.PLAIN, 12));
		chckbxNewCheckBox_4.setBackground(Color.WHITE);
		chckbxNewCheckBox_4.setBounds(151, 248, 97, 23);
		chckbxNewCheckBox_4.setOpaque(false);
		contentPane.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Sugar Cane");
		chckbxNewCheckBox_5.setForeground(Color.WHITE);
		chckbxNewCheckBox_5.setFont(new Font("Calibri", Font.PLAIN, 12));
		chckbxNewCheckBox_5.setBackground(Color.WHITE);
		chckbxNewCheckBox_5.setBounds(282, 204, 97, 23);
		chckbxNewCheckBox_5.setOpaque(false);
		contentPane.add(chckbxNewCheckBox_5);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(498, 597, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//create object for Sunstream
				Sunstream ss2 =new Sunstream();
				ss2.setVisible(true);
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBackground(Color.WHITE);
		btnNext.setBounds(597, 597, 89, 23);
		contentPane.add(btnNext);
		
		JLabel lblNewLabel_3 = new JLabel("Milk");
		lblNewLabel_3.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_3.setForeground(new Color(72, 209, 204));
		lblNewLabel_3.setBounds(10, 302, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Add Espesso Shot?");
		lblNewLabel_4.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_4.setForeground(new Color(72, 209, 204));
		lblNewLabel_4.setBounds(10, 458, 140, 14);
		contentPane.add(lblNewLabel_4);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Yes");
		rdbtnNewRadioButton_3.setForeground(Color.WHITE);
		rdbtnNewRadioButton_3.setBackground(Color.WHITE);
		rdbtnNewRadioButton_3.setBounds(10, 496, 109, 23);
		rdbtnNewRadioButton_3.setOpaque(false);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("No");
		rdbtnNewRadioButton_4.setForeground(Color.WHITE);
		rdbtnNewRadioButton_4.setBackground(Color.WHITE);
		rdbtnNewRadioButton_4.setBounds(152, 496, 109, 23);
		rdbtnNewRadioButton_4.setOpaque(false);
		contentPane.add(rdbtnNewRadioButton_4);
		
		ButtonGroup group1= new ButtonGroup();
		group1.add(rdbtnNewRadioButton_3);
		group1.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("2% Milk");
		rdbtnNewRadioButton_5.setForeground(Color.WHITE);
		rdbtnNewRadioButton_5.setBackground(Color.WHITE);
		rdbtnNewRadioButton_5.setFont(new Font("Calibri", Font.PLAIN, 12));
		rdbtnNewRadioButton_5.setBounds(10, 350, 109, 23);
		rdbtnNewRadioButton_5.setOpaque(false);
		contentPane.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Coconut Milk");
		rdbtnNewRadioButton_6.setForeground(Color.WHITE);
		rdbtnNewRadioButton_6.setBackground(Color.WHITE);
		rdbtnNewRadioButton_6.setFont(new Font("Calibri", Font.PLAIN, 12));
		rdbtnNewRadioButton_6.setBounds(10, 404, 109, 23);
		rdbtnNewRadioButton_6.setOpaque(false);
		contentPane.add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Whole Milk");
		rdbtnNewRadioButton_7.setForeground(Color.WHITE);
		rdbtnNewRadioButton_7.setBackground(Color.WHITE);
		rdbtnNewRadioButton_7.setFont(new Font("Calibri", Font.PLAIN, 12));
		rdbtnNewRadioButton_7.setBounds(152, 350, 109, 23);
		rdbtnNewRadioButton_7.setOpaque(false);
		contentPane.add(rdbtnNewRadioButton_7);
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("Non Fat Milk");
		rdbtnNewRadioButton_8.setForeground(Color.WHITE);
		rdbtnNewRadioButton_8.setBackground(Color.WHITE);
		rdbtnNewRadioButton_8.setFont(new Font("Calibri", Font.PLAIN, 12));
		rdbtnNewRadioButton_8.setBounds(152, 404, 109, 23);
		rdbtnNewRadioButton_8.setOpaque(false);
		contentPane.add(rdbtnNewRadioButton_8);
		
		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("Almond Milk");
		rdbtnNewRadioButton_9.setForeground(Color.WHITE);
		rdbtnNewRadioButton_9.setBackground(Color.WHITE);
		rdbtnNewRadioButton_9.setFont(new Font("Calibri", Font.PLAIN, 12));
		rdbtnNewRadioButton_9.setBounds(292, 350, 109, 23);
		rdbtnNewRadioButton_9.setOpaque(false);
		contentPane.add(rdbtnNewRadioButton_9);
		
		JRadioButton rdbtnNewRadioButton_10 = new JRadioButton("Non Fat Milk");
		rdbtnNewRadioButton_10.setForeground(Color.WHITE);
		rdbtnNewRadioButton_10.setBackground(Color.WHITE);
		rdbtnNewRadioButton_10.setFont(new Font("Calibri", Font.PLAIN, 12));
		rdbtnNewRadioButton_10.setBounds(292, 404, 109, 23);
		rdbtnNewRadioButton_10.setOpaque(false);
		contentPane.add(rdbtnNewRadioButton_10);
		
		ButtonGroup group3= new ButtonGroup();
		group3.add(rdbtnNewRadioButton_5);
		group3.add(rdbtnNewRadioButton_6);
		group3.add(rdbtnNewRadioButton_7);
		group3.add(rdbtnNewRadioButton_8);
		group3.add(rdbtnNewRadioButton_9);
		group3.add(rdbtnNewRadioButton_10);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Drinks.class.getResource("/images/maxresdefault.jpg")));
		label.setBounds(0, 0, 696, 631);
		contentPane.add(label);
	}
}
