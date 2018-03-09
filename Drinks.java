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
import javax.swing.JButton;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fresh Brewed Coffee");
		lblNewLabel.setBounds(10, 11, 139, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Size");
		lblNewLabel_1.setBounds(10, 68, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Tall");
		rdbtnNewRadioButton.setBounds(10, 89, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Grande");
		rdbtnNewRadioButton_1.setBounds(152, 89, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Venti");
		rdbtnNewRadioButton_2.setBounds(304, 89, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("Add Flavor Shot?");
		lblNewLabel_2.setBounds(10, 132, 119, 14);
		contentPane.add(lblNewLabel_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Vanilla");
		chckbxNewCheckBox.setBounds(10, 153, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Caramel");
		chckbxNewCheckBox_1.setBounds(115, 153, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Hazelnut");
		chckbxNewCheckBox_2.setBounds(233, 153, 97, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Peppermint");
		chckbxNewCheckBox_3.setBounds(10, 179, 97, 23);
		contentPane.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Almond");
		chckbxNewCheckBox_4.setBounds(115, 179, 97, 23);
		contentPane.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Sugar Cane");
		chckbxNewCheckBox_5.setBounds(233, 179, 97, 23);
		contentPane.add(chckbxNewCheckBox_5);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBounds(233, 327, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//create object for Sunstream
				Sunstream ss2 =new Sunstream();
				ss2.setVisible(true);
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(332, 327, 89, 23);
		contentPane.add(btnNext);
	}
}
