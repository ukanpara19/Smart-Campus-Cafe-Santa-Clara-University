import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.event.EventListenerList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;

public class WelcomeScreen extends JFrame {
	private JPanel contentPane;
	loginGui g;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeScreen frame = new WelcomeScreen();
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
	public WelcomeScreen() {
		setTitle("Smart Campus Cafe - Welcome Screen");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 625, 639);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton(" Get Started ");
		btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 16));
		
		btnNewButton.addActionListener(new ActionListener() {
			
			public void keyPressed(KeyEvent e) {
				
			    if (e.getKeyCode()==KeyEvent.VK_ENTER){
			    	SwingUtilities.getRootPane(btnNewButton).setDefaultButton(btnNewButton);
			    	loginGui g = null;
					try {
						g = new loginGui();
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					g.setVisible(true);
					close();
			    }

			}
			public void actionPerformed(ActionEvent e) {
				loginGui g = null;
				try {
					g = new loginGui();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				g.setVisible(true);
				close();
							
		}
		});

		btnNewButton.setBounds(237, 391, 160, 57);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/nirajmotiani/Desktop/Image/welcome.jpg"));
		lblNewLabel.setBounds(0, -11, 623, 630);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(133, 159, 373, 223);
		contentPane.add(lblNewLabel_1);
	}
	protected void close() {
		// TODO Auto-generated method stub
		WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
		
	}
}
