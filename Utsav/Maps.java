package SmartCampusCafe;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JList;

public class Maps extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Maps frame = new Maps();
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
	public Maps() {
		setTitle("Smart Campus Cafe - Cafe Map");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 853, 855);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 153, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnMissionBakery = new JButton("Mission Bakery");
		btnMissionBakery.setBackground(new Color(0, 51, 102));
		btnMissionBakery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// create object of that class
//				name.setvisible(true);
				close();
				
			}
		});
		btnMissionBakery.setBounds(730, 270, 117, 48);
		contentPane.add(btnMissionBakery);
		
		JButton btnSunstream = new JButton("Sunstream");
		btnSunstream.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// create object of that class
//				name.setvisible(true);
				close();
			}
		});
		btnSunstream.setBounds(730, 330, 117, 48);
		contentPane.add(btnSunstream);
		
		JButton btnCafe = new JButton("Cafe 004");
		btnCafe.setBackground(new Color(0, 51, 102));
		btnCafe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// create object of that class
//				name.setvisible(true);
				close();
			}
		});
		btnCafe.setBounds(730, 390, 117, 48);
		contentPane.add(btnCafe);
		
		JButton btnBistro = new JButton("Bistro");
		btnBistro.setBounds(730, 210, 117, 48);
		contentPane.add(btnBistro);
		
		JLabel lblWelcomeToSmart = new JLabel("Hello, Welcome to Smart Capus Cafe ");
		lblWelcomeToSmart.setForeground(new Color(240, 248, 255));
		lblWelcomeToSmart.setOpaque(true);
		lblWelcomeToSmart.setBackground(new Color(0, 51, 102));
		lblWelcomeToSmart.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblWelcomeToSmart.setBounds(6, 4, 874, 76);
		contentPane.add(lblWelcomeToSmart);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/utsavkanpara/Desktop/Campus_Map.png"));
		lblNewLabel.setBounds(6, 76, 725, 724);
		contentPane.add(lblNewLabel);
	}
		
	protected void close() {
		// TODO Auto-generated method stub
		WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
		
}
}
