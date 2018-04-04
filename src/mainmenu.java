import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class mainmenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainmenu frame = new mainmenu();
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
	public mainmenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCafes = new JLabel("Cafes");
		lblCafes.setForeground(new Color(102, 0, 0));
		lblCafes.setFont(new Font("Segoe UI Emoji", Font.BOLD, 18));
		lblCafes.setBounds(10, 238, 61, 27);
		contentPane.add(lblCafes);
		
		JButton btnNewButton = new JButton("Sunstream");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(204, 102, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//create object for Sunstream
				Sunstream ss1 =new Sunstream("Sunstream");
				ss1.setVisible(true);
			}
		});
		btnNewButton.setBounds(10, 272, 132, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cadence");
		btnNewButton_1.setBackground(new Color(204, 102, 0));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBounds(10, 306, 132, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Campus Smart Cafe");
		lblNewLabel.setForeground(new Color(102, 51, 0));
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(157, 11, 220, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("E:\\PROJECT\\Eclipse\\Workspace\\cafe-backgrounds-11.jpg"));
		lblNewLabel_1.setBounds(10, 49, 514, 168);
		contentPane.add(lblNewLabel_1);
	}
}
