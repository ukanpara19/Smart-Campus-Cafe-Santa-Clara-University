//import java.awt.BorderLayout;
//import java.awt.EventQueue;
//
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.JScrollPane;
//import javax.swing.border.EmptyBorder;
//import javax.swing.JLabel;
//import java.awt.Font;
//import java.util.ArrayList;
//
//import javax.swing.JList;
//import javax.swing.DefaultListModel;
//import javax.swing.JButton;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//import javax.swing.JTable;
//import javax.swing.border.LineBorder;
//import javax.swing.table.TableCellRenderer;
//import javax.swing.table.TableColumn;
//
//import java.awt.Color;
//import java.awt.Component;
//
//import javax.swing.UIManager;
//import javax.swing.border.BevelBorder;
//
//public class Checkout extends JFrame {
//
//	private JPanel contentPane;
//	private JTable table;
//	double total = 0;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Checkout frame = new Checkout(null);
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the frame.
//	 */
////	public Checkout(ArrayList<Food> listOfOrders) {
////		System.out.println(listOfOrders.get(0).name);
////		System.out.println(listOfOrders.get(0).size);
////		System.out.println(listOfOrders.get(0).comments);
////		System.out.println(listOfOrders.get(0).price);
////		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////		setBounds(100, 100, 690, 568);
////		contentPane = new JPanel();
////		contentPane.setBorder(UIManager.getBorder("EditorPane.border"));
////		setContentPane(contentPane);
////		contentPane.setLayout(null);
////		DefaultListModel dm = new DefaultListModel();
////		
////		JLabel lblCheckoutPage = new JLabel("Checkout details:");
////		lblCheckoutPage.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
////		lblCheckoutPage.setBounds(25, 21, 156, 51);
////		contentPane.add(lblCheckoutPage);
////		ArrayList<String[]> items = new ArrayList<>();
////		ArrayList<String[]> quantiy = new ArrayList<>();
////		ArrayList<String[]> price= new ArrayList<>();
////		ArrayList<String[]> amount = new ArrayList<>();
////		
////		JButton btnBack = new JButton("Add More Items");
////		btnBack.addActionListener(new ActionListener() {
////			public void actionPerformed(ActionEvent e) {
////				/////
////				try {
////					Sunstream frame = new Sunstream("Mission ");
////					frame.setVisible(true);
////				} catch (Exception e1) {
////					e1.printStackTrace();
////				}
////			}
////		});
////		btnBack.setBounds(161, 384, 156, 44);
////		contentPane.add(btnBack);
////		
////		JButton btnSubmit = new JButton("Total");
////		btnSubmit.addActionListener(new ActionListener() {
////			public void actionPerformed(ActionEvent e) {
////				
////				for(int i = 0; i < table.getRowCount(); i++){
////			        System.out.println("The value at the cell: " + i +" , 4 is "+ table.getValueAt(i, 4).toString());
////			        double Amount =  Double.parseDouble(table.getValueAt(i, 4).toString()) ;
////			        total += Amount;
////			        System.out.println(total);
////			    }
////				
////				//int Amount = Integer.parseInt(table.getValueAt(i, 5)+"");
////				
////				
////			}
////		});
////		btnSubmit.setBounds(348, 384, 156, 44);
////		contentPane.add(btnSubmit);
////		
//////	
//////		String data[][]={ {"101","Amit","670000"},    
//////                {"102","Jai","780000"},    
//////                {"101","Sachin","700000"}};    
//////String column[]={"ID","NAME","SALARY"};         
////
//////JFrame f;    
//////f=new JFrame();    
////String data[][]={{"Latte ","2", " Tall , SoyMilk"," 5.99 "},{"Latte ","2", " Tall , SoyMilk"," 5.99 "},{"Latte ","2", " Tall , SoyMilk"," 5.99 "}};    
////String column[]={"Item","Size","Quantity","Comments","Amount"};         
//////JTable jt=new JTable(data,column);    
//////jt.setBounds(30,40,200,300);          
//////JScrollPane sp=new JScrollPane(jt);    
//////f.add(sp);          
//////f.setSize(300,400);    
//////f.setVisible(true);   
//////JTable jt=new JTable(data,column);    
//////jt.setBounds(60,100,200,250);          
//////JScrollPane sp=new JScrollPane(jt);    
//////contentPane.add(jt);          
////
////		
////		
////		table = new JTable(10,5);
////		table.setForeground(Color.DARK_GRAY);
////		
////		for(int i=0;i< listOfOrders.size();i++) {
////			table.setValueAt(listOfOrders.get(i).name, i, 0);
////			table.setValueAt(listOfOrders.get(i).size, i, 1);
////			table.setValueAt(listOfOrders.get(i).quantity,i, 2);
////			table.setValueAt(listOfOrders.get(i).comments, i, 3);
////			table.setValueAt(listOfOrders.get(i).price, i, 4);
////	}
////		
////		table.setColumnSelectionAllowed(true);
////		table.getColumnModel().getColumn(3).setPreferredWidth(36);
////		table.setCellSelectionEnabled(true);
////		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
////		table.setBounds(60,100,494,250);
////		
////		
////		
////		
////		
////		
////
////		table.setAutoResizeMode( JTable.AUTO_RESIZE_OFF );
////		 
////		for (int i = 0; i < table.getColumnCount(); i++)
////		{
////		    TableColumn tableColumn = table.getColumnModel().getColumn(i);
////		    int preferredWidth = tableColumn.getMinWidth();
////		    int maxWidth = tableColumn.getMaxWidth();
////		    for (int row = 0; row < table.getRowCount(); row++)
////		    {
////		        TableCellRenderer cellRenderer = table.getCellRenderer(row, i);
////		        Component c = table.prepareRenderer(cellRenderer, row, i);
////		        int width = c.getPreferredSize().width + table.getIntercellSpacing().width;
////		        preferredWidth = Math.max(preferredWidth, width);
////		        //  We've exceeded the maximum width, no need to check other rows
////		        if (preferredWidth >= maxWidth)
////		        {
////		            preferredWidth = maxWidth;
////		            break;
////		        }
////		    }
////		 
////		    tableColumn.setPreferredWidth( preferredWidth );
//
//
//	
//	public Checkout(ArrayList<Food> listOfOrders) {
//		System.out.println(listOfOrders.get(0).name);
//		System.out.println(listOfOrders.get(0).size);
//		System.out.println(listOfOrders.get(0).comments);
//		System.out.println(listOfOrders.get(0).price);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 690, 568);
//		contentPane = new JPanel();
//		contentPane.setBorder(UIManager.getBorder("EditorPane.border"));
//		setContentPane(contentPane);
//		contentPane.setLayout(null);
//		DefaultListModel dm = new DefaultListModel();
//		
//		JLabel lblCheckoutPage = new JLabel("Checkout details:");
//		lblCheckoutPage.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
//		lblCheckoutPage.setBounds(25, 21, 156, 51);
//		contentPane.add(lblCheckoutPage);
//		ArrayList<String[]> items = new ArrayList<>();
//		ArrayList<String[]> quantiy = new ArrayList<>();
//		ArrayList<String[]> price= new ArrayList<>();
//		ArrayList<String[]> amount = new ArrayList<>();
//		
//		JButton btnBack = new JButton("Add More Items");
//		btnBack.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				/////
//				try {
//					Sunstream frame = new Sunstream("");
//					frame.setVisible(true);
//				} catch (Exception e1) {
//					e1.printStackTrace();
//				}
//			}
//		});
//		btnBack.setBounds(161, 384, 156, 44);
//		contentPane.add(btnBack);
//		
//		JButton btnSubmit = new JButton("Total");
//		btnSubmit.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//				for(int i = 0; i < table.getRowCount(); i++){
//			        System.out.println("The value at the cell: " + i +" , 4 is "+ table.getValueAt(i, 4).toString());
//			        double Amount =  Double.parseDouble(table.getValueAt(i, 4).toString()) ;
//			        total += Amount;
//			        System.out.println(total);
//			    }
//				
//				//int Amount = Integer.parseInt(table.getValueAt(i, 5)+"");
//				
//				
//			}
//		});
//		btnSubmit.setBounds(348, 384, 156, 44);
//		contentPane.add(btnSubmit);
//		
////	
////		String data[][]={ {"101","Amit","670000"},    
////                {"102","Jai","780000"},    
////                {"101","Sachin","700000"}};    
////String column[]={"ID","NAME","SALARY"};         
//
////JFrame f;    
////f=new JFrame();    
//String data[][]={{"Latte ","2", " Tall , SoyMilk"," 5.99 "},{"Latte ","2", " Tall , SoyMilk"," 5.99 "},{"Latte ","2", " Tall , SoyMilk"," 5.99 "}};    
//String column[]={"Item","Size","Quantity","Comments","Amount"};         
////JTable jt=new JTable(data,column);    
////jt.setBounds(30,40,200,300);          
////JScrollPane sp=new JScrollPane(jt);    
////f.add(sp);          
////f.setSize(300,400);    
////f.setVisible(true);   
////JTable jt=new JTable(data,column);    
////jt.setBounds(60,100,200,250);          
////JScrollPane sp=new JScrollPane(jt);    
////contentPane.add(jt);          
//
//		
//		
//		table = new JTable(10,5);
//		table.setForeground(Color.DARK_GRAY);
//		
//		for(int i=0;i< listOfOrders.size();i++) {
//			table.setValueAt( listOfOrders.get(i).name, i, 0);
//			table.setValueAt( listOfOrders.get(i).size, i, 1);
//			table.setValueAt( listOfOrders.get(i).quantity,i, 2);
//			table.setValueAt( listOfOrders.get(i).comments, i, 3);
//			table.setValueAt(listOfOrders.get(i).price, i, 4);
//	}
//		
//		table.setColumnSelectionAllowed(true);
//		table.getColumnModel().getColumn(3).setPreferredWidth(36);
//		table.setCellSelectionEnabled(true);
//		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
//		table.setBounds(60,100,494,250);
//		
//		
//		
//		
//		
//		
//
//		table.setAutoResizeMode( JTable.AUTO_RESIZE_OFF );
//		 
//		for (int i = 0; i < table.getColumnCount(); i++)
//		{
//		    TableColumn tableColumn = table.getColumnModel().getColumn(i);
//		    int preferredWidth = tableColumn.getMinWidth();
//		    int maxWidth = tableColumn.getMaxWidth();
//		 
//		    for (int row = 0; row < table.getRowCount(); row++)
//		    {
//		        TableCellRenderer cellRenderer = table.getCellRenderer(row, i);
//		        Component c = table.prepareRenderer(cellRenderer, row, i);
//		        int width = c.getPreferredSize().width + table.getIntercellSpacing().width;
//		        preferredWidth = Math.max(preferredWidth, width);
//		 
//		        //  We've exceeded the maximum width, no need to check other rows
//		 
//		        if (preferredWidth >= maxWidth)
//		        {
//		            preferredWidth = maxWidth;
//		            break;
//		        }
//		    }
//		 
//		    tableColumn.setPreferredWidth( preferredWidth );
//		}
//	
//	
//	
//		//table.setGridColor(Color.DARK_GRAY);
//		contentPane.add(table);
//		
//		contentPane.setSize(300,400);    
//		
//		
//		contentPane.setVisible(true);    
//		
//}
//}


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

import java.awt.Color;
import java.awt.Component;

import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class Checkout extends JFrame {

	private JPanel contentPane;
	private JTable table;
	static double total = 0;
	private JTextField textField;
	Sunstream frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Checkout frame = new Checkout(null);
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
	public Checkout(ArrayList<Food> listOfOrders) {
		setTitle("Smart Campus Cafe- Checkout page");
		System.out.println(listOfOrders.get(0).name);
		System.out.println(listOfOrders.get(0).size);
		System.out.println(listOfOrders.get(0).comments);
		System.out.println(listOfOrders.get(0).price);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 568);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(UIManager.getBorder("EditorPane.border"));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		DefaultListModel dm = new DefaultListModel();
		
		JLabel lblCheckoutPage = new JLabel("Checkout details:");
		lblCheckoutPage.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblCheckoutPage.setBounds(0, 103, 156, 34);
		contentPane.add(lblCheckoutPage);
		ArrayList<String[]> items = new ArrayList<>();
		ArrayList<String[]> quantiy = new ArrayList<>();
		ArrayList<String[]> price= new ArrayList<>();
		ArrayList<String[]> amount = new ArrayList<>();
		
		JButton btnBack = new JButton("Add More Items");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/////
				try {
					 frame = new Sunstream("");
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnBack.setBounds(162, 429, 156, 44);
		contentPane.add(btnBack);
		
		JButton btnSubmit = new JButton("Total");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for(int  i=0; i<listOfOrders.size(); i++)
					total+=listOfOrders.get(i).price;
				textField.setText(" Thank you for shopping. Your total is "+total+" Have a nice day :) ");
				
			}
		});
		btnSubmit.setBounds(350, 429, 156, 44);
		contentPane.add(btnSubmit);
	
		
		table = new JTable(10,5);
		table.setShowHorizontalLines(false);
		table.setShowVerticalLines(false);
		table.setForeground(Color.DARK_GRAY);
		
		for(int i=0;i< listOfOrders.size();i++) {
			table.setValueAt(listOfOrders.get(i).name, i, 0);
			table.setValueAt( listOfOrders.get(i).size, i, 1);
			table.setValueAt( listOfOrders.get(i).quantity,i, 2);
			table.setValueAt( listOfOrders.get(i).comments, i, 3);
			table.setValueAt(listOfOrders.get(i).price, i, 4);
	}
		
		
		table.setColumnSelectionAllowed(true);
		table.getColumnModel().getColumn(3).setPreferredWidth(36);
		table.setCellSelectionEnabled(true);
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setBounds(60,179,494,250);
		
		table.setAutoResizeMode( JTable.AUTO_RESIZE_OFF );
		 
		for (int i = 0; i < table.getColumnCount(); i++)
		{
		    TableColumn tableColumn = table.getColumnModel().getColumn(i);
		    int preferredWidth = tableColumn.getMinWidth();
		    int maxWidth = tableColumn.getMaxWidth();
		 
		    for (int row = 0; row < table.getRowCount(); row++)
		    {
		        TableCellRenderer cellRenderer = table.getCellRenderer(row, i);
		        Component c = table.prepareRenderer(cellRenderer, row, i);
		        int width = c.getPreferredSize().width + table.getIntercellSpacing().width;
		        preferredWidth = Math.max(preferredWidth, width);
		 
		        //  We've exceeded the maximum width, no need to check other rows
		 
		        if (preferredWidth >= maxWidth)
		        {
		            preferredWidth = maxWidth;
		            break;
		        }
		    }
		    tableColumn.setPreferredWidth( preferredWidth );
		}
		contentPane.add(table);
		contentPane.setSize(300,400);    
		
		
		
		JLabel lblItem = new JLabel("Item");
		lblItem.setBounds(77, 139, 51, 16);
		contentPane.add(lblItem);
		
		JLabel lblSize = new JLabel("Size");
		lblSize.setBounds(158, 139, 61, 16);
		contentPane.add(lblSize);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setBounds(231, 139, 61, 16);
		contentPane.add(lblQuantity);
		
		JLabel lblComments = new JLabel("Comments");
		lblComments.setBounds(331, 139, 75, 16);
		contentPane.add(lblComments);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(473, 139, 61, 16);
		contentPane.add(lblPrice);
		
		JLabel label = new JLabel("");
		label.setOpaque(true);
		label.setBackground(new Color(0, 102, 102));
		label.setIcon(new ImageIcon("/Users/nirajmotiani/Desktop/Image/rsz_horizontalred.png"));
		label.setBounds(0, 0, 690, 99);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(60, 485, 570, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		contentPane.setVisible(true);    
}
}
