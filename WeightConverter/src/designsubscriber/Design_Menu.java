package designsubscriber;

import gramssubscriber.GramsDisplay;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import kilossubscriber.KilogramsDisplay;
import ouncesubscriber.OunceDisplay;
import poundsubscriber.PoundSubscriber;
import stonessubscriber.StonesDisplay;


@SuppressWarnings("serial")
public class Design_Menu extends JFrame{
	private JPanel panel;
	private JLabel lable;
	private JButton pound, stones, kilos, grams, ounce;
	
	private static boolean poundBtn = false;
	private static boolean stonesBtn = false;
	private static boolean kilosBtn = false;
	private static boolean gramsBtn = false;
	private static boolean ounceBtn = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Design_Menu menu = new Design_Menu();
				menu.setVisible(true);
								
			}
		});
	}

	public Design_Menu() throws HeadlessException {
		setResizable(false);
		setTitle("Weight Converter");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(100, 150, 700, 500);
		
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(panel);
		panel.setLayout(null);
		panel.setBackground(Color.lightGray);
		panel.setVisible(true);
		
		lable = new JLabel("Weight Converter");
		lable.setFont(new Font("Algerian", Font.BOLD, 36));
		lable.setBounds(160, 25, 400, 50);
		lable.setForeground(Color.black);
		panel.add(lable);
		
		pound = new JButton("Pound Converter");
		pound.setFont(new Font("Algerian", Font.PLAIN, 23));
		pound.setFocusable(false);
		pound.setBounds(30, 120, 300, 60);
		pound.setBackground(Color.pink);
		pound.setBorder(new LineBorder(Color.black, 2));
		pound.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				poundBtn = Activator.poundClicker();
				
				if(poundBtn == true) { 
					PoundSubscriber subscriber = new PoundSubscriber();
					subscriber.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Pound Converter Service is not Started", "Error !", JOptionPane.OK_OPTION);
				}
				
			}  
		}); 
		panel.add(pound);
		
		stones = new JButton("Stones Converter");
		stones.setFont(new Font("Algerian", Font.PLAIN, 23));
		stones.setFocusable(false);
		stones.setBounds(360, 120, 300, 60);
		stones.setBackground(Color.pink);
		stones.setBorder(new LineBorder(Color.black, 2));
		stones.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				stonesBtn = Activator.stonesClicker();
				
				if(stonesBtn == true) {
					StonesDisplay stonesDisplay = new StonesDisplay();
					stonesDisplay.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Stones Converter Service is not Started", "Error !", JOptionPane.OK_OPTION);
				}
			}
		});
		panel.add(stones);
		
		kilos = new JButton("Kilograms Converter");
		kilos.setFont(new Font("Algerian", Font.PLAIN, 23));
		kilos.setFocusable(false);
		kilos.setBounds(30, 210, 300, 60);
		kilos.setBackground(Color.pink);
		kilos.setBorder(new LineBorder(Color.black, 2));
		kilos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				kilosBtn = Activator.kilosClicker();
				
				if (kilosBtn == true) {
					KilogramsDisplay kilogramsDisplay = new KilogramsDisplay();
					kilogramsDisplay.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "Kilograms Converter Service is not Started", "Error !", JOptionPane.OK_OPTION);
				}
			}
		});
		panel.add(kilos);
		
		grams = new JButton("Grams Converter");
		grams.setFont(new Font("Algerian", Font.PLAIN, 23));
		grams.setFocusable(false);
		grams.setBounds(360, 210, 300, 60);
		grams.setBackground(Color.pink);
		grams.setBorder(new LineBorder(Color.black, 2));
		grams.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				gramsBtn = Activator.gramsClicker();
				
				if (gramsBtn == true) {
					GramsDisplay gramsDisplay = new GramsDisplay();
					gramsDisplay.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Grams Converter Service is not Started", "Error !", JOptionPane.OK_OPTION);
				}
			} 
		});
		panel.add(grams);
		
		ounce = new JButton("Ounce Converter");
		ounce.setFont(new Font("Algerian", Font.PLAIN, 23));
		ounce.setFocusable(false);
		ounce.setBounds(180, 300, 300, 60);
		ounce.setBackground(Color.pink);
		ounce.setBorder(new LineBorder(Color.black, 2));
		ounce.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ounceBtn = Activator.ounceClicker();
				
				if (ounceBtn == true) {
					OunceDisplay ounceDisplay = new OunceDisplay();
					ounceDisplay.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "Ounce Converter Service is not Started", "Error !", JOptionPane.OK_OPTION);
				}
			}
		});
		panel.add(ounce);
	}
		
}
