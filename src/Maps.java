
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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.JList;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;

public class Maps extends JFrame {

	private JPanel contentPane;
	Sunstream frame;
	Bronco f;
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
		setBounds(100, 100, 1002, 822);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(UIManager.getBorder("Button.border"));
		setContentPane(contentPane);
		contentPane.setLayout(null);		
		JLabel lblBistro = new JLabel("");
		JLabel lblCafe = new JLabel("");
		JLabel lblSunstream = new JLabel("");
		lblBistro.setToolTipText("Bistro cafe is the alrges cafe in SCU");
		JLabel lblMissionBakery = new JLabel("");
		
		
//**********************MIssion Bakery *********************************************
		JButton btnMissionBakery = new JButton("Mission Bakery");
		btnMissionBakery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					frame = new Sunstream("Mission Bakery");
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnMissionBakery.setBackground(Color.WHITE);
		btnMissionBakery.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) { //*****************************Mouse Enter ****************************
				btnMissionBakery.setBackground(Color.CYAN);
//				btnBistro.setForeground(Color.BLACK);
				btnMissionBakery.setFont(new Font("Calibri", Font.BOLD, 13));
				lblMissionBakery.setIcon(new ImageIcon("/Users/nirajmotiani/Desktop/Image/pointer.png"));
				lblMissionBakery.setLabelFor(lblMissionBakery);
			}
			@Override
			public void mouseExited(MouseEvent e) {//*******************************Mouse exit******************************
				btnMissionBakery.setBackground(Color.BLACK);
//				btnBistro.setForeground(Color.GRAY);
				btnMissionBakery.setFont(new Font("Calibri", Font.PLAIN, 12));
				lblMissionBakery.setIcon(new ImageIcon(""));

			}
		});
		btnMissionBakery.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnMissionBakery.setBackground(Color.BLACK);
		btnMissionBakery.setBounds(758, 282, 188, 48);
		contentPane.add(btnMissionBakery);
		
//**************************Sunstream************************************************		
		JButton btnSunstream = new JButton("Sunstream");
		btnSunstream.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					frame = new Sunstream("Sunstream");
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				// create object of that class
//				name.setvisible(true);
				close();
			}
		});
		btnSunstream.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {//*****************************Mouse Enter ****************************
				btnSunstream.setBackground(Color.CYAN);
				btnSunstream.setFont(new Font("Calibri", Font.BOLD, 13));
				lblSunstream.setIcon(new ImageIcon("/Users/nirajmotiani/Desktop/Image/pointer.png"));
			}
			@Override
			public void mouseExited(MouseEvent e) { //*******************************Mouse exit******************************
				btnSunstream.setBackground(Color.BLACK);
				btnSunstream.setFont(new Font("Calibri", Font.PLAIN, 12));
				lblSunstream.setIcon(new ImageIcon(""));
			}
		});
		btnSunstream.setFont(new Font("Dialog", Font.PLAIN, 17));
		btnSunstream.setBackground(Color.BLACK);
		btnSunstream.setBounds(758, 342, 188, 48);
		contentPane.add(btnSunstream);
		
//***********************Cafe 004*********************************************		
		JButton btnCafe = new JButton("Cafe 404");
		btnCafe.setBackground(new Color(0, 51, 102));
		btnCafe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				    frame = new Sunstream("Cafe 404");
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				// create object of that class
//				name.setvisible(true);
				close();
			}
		});
		btnCafe.addMouseListener(new MouseAdapter() {	//*****************************Mouse Enter ****************************
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnCafe.setBackground(Color.CYAN);
				btnCafe.setFont(new Font("Calibri", Font.BOLD, 13));
				lblCafe.setIcon(new ImageIcon("/Users/nirajmotiani/Desktop/Image/pointer.png"));
			}
			@Override
			public void mouseExited(MouseEvent e) {	//*****************************Mouse Exit ****************************
				btnCafe.setBackground(Color.BLACK);
				btnCafe.setFont(new Font("Calibri", Font.PLAIN, 12));
				lblCafe.setIcon(new ImageIcon(""));
			}
		});
		btnCafe.setFont(new Font("Dialog", Font.PLAIN, 17));
		btnCafe.setBackground(Color.BLACK);
		btnCafe.setBounds(758, 410, 188, 48);
		contentPane.add(btnCafe);
		
		JButton btnBistro = new JButton("Bistro");
		btnBistro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnBistro.setBackground(Color.CYAN);
				btnBistro.setFont(new Font("Calibri", Font.BOLD, 13));
				lblBistro.setIcon(new ImageIcon("/Users/nirajmotiani/Desktop/Image/pointer.png"));

			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnBistro.setBackground(Color.BLACK);
				btnBistro.setFont(new Font("Calibri", Font.PLAIN, 12));
				lblBistro.setIcon(new ImageIcon(""));
			}
		});
		btnBistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					f = new Bronco();
					f.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnBistro.setToolTipText("BISTRO is Located near Benson hall");
		btnBistro.setFont(new Font("Dialog", Font.PLAIN, 17));
		btnBistro.setBackground(Color.BLACK);
		btnBistro.setBounds(758, 470, 188, 48);
		contentPane.add(btnBistro);
	
		
		
		
		JLabel lblWelcomeToSmart = new JLabel("");
		lblWelcomeToSmart.setOpaque(true);
		lblWelcomeToSmart.setIcon(new ImageIcon("/Users/nirajmotiani/Desktop/Image/rsz_horizontalred.png"));
		lblWelcomeToSmart.setForeground(new Color(240, 248, 255));
		lblWelcomeToSmart.setBackground(new Color(0, 128, 128));
		lblWelcomeToSmart.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblWelcomeToSmart.setBounds(6, 0, 711, 103);
		contentPane.add(lblWelcomeToSmart);
		lblMissionBakery.setBackground(Color.WHITE);
		lblMissionBakery.setBounds(166, 580, 129, 56);
		contentPane.add(lblMissionBakery);
		
		
		lblBistro.setBackground(Color.WHITE);
		lblBistro.setBounds(172, 605, 123, 76);
		contentPane.add(lblBistro);
		
		lblCafe.setBackground(Color.WHITE);
		lblCafe.setBounds(309, 299, 88, 76);
		contentPane.add(lblCafe);
		lblSunstream.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 15));
		lblSunstream.setForeground(Color.BLACK);
		
		lblSunstream.setBackground(Color.WHITE);
		lblSunstream.setBounds(322, 580, 88, 73);
		contentPane.add(lblSunstream);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setToolTipText("");
		lblNewLabel.setIcon(new ImageIcon("/Users/nirajmotiani/Desktop/Image/Campus_Map.v1.png"));
		lblNewLabel.setBounds(6, 103, 711, 866);
		contentPane.add(lblNewLabel);
		
		JLabel lblCafesInSanta = new JLabel("Cafes in Santa Clara University :");
		lblCafesInSanta.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 15));
		lblCafesInSanta.setBounds(729, 124, 257, 39);
		contentPane.add(lblCafesInSanta);
	
		
		ImageIcon icon = new ImageIcon("/Users/nirajmotiani/Desktop/Image/Coffee_final.gif");
		JLabel FoodIcon = new JLabel(icon);
 
//		FoodIcon.setIcon(new ImageIcon("/Users/utsavkanpara/Desktop/Image/rsz_1food-dome-512.png"));
		FoodIcon.setBounds(712, -16, 284, 115);
		contentPane.add(FoodIcon);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(224, 271, 128, 23);
		contentPane.add(chckbxNewCheckBox);
	}
		
	protected void close() {
		// TODO Auto-generated method stub
		WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}
}

