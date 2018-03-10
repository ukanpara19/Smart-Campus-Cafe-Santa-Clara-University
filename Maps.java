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
		setBounds(100, 100, 615, 566);
		contentPane = new JPanel();
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
		btnMissionBakery.setBounds(84, 87, 117, 36);
		contentPane.add(btnMissionBakery);
		
		JButton btnSunstream = new JButton("Sunstream");
		btnSunstream.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// create object of that class
//				name.setvisible(true);
				close();
			}
		});
		btnSunstream.setBounds(73, 348, 117, 36);
		contentPane.add(btnSunstream);
		
		JButton btnCafe = new JButton("Cafe 004");
		btnCafe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// create object of that class
//				name.setvisible(true);
				close();
			}
		});
		btnCafe.setBounds(419, 87, 117, 36);
		contentPane.add(btnCafe);
		
		JButton btnBistro = new JButton("Bistro");
		btnBistro.setBounds(419, 333, 117, 36);
		contentPane.add(btnBistro);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/utsavkanpara/Desktop/map.png"));
		lblNewLabel.setBounds(6, -21, 658, 574);
		contentPane.add(lblNewLabel);
		
		JButton button = new JButton("New button");
		button.setBounds(226, 219, 117, 29);
		contentPane.add(button);
	}
		
	protected void close() {
		// TODO Auto-generated method stub
		WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
		
}
}
