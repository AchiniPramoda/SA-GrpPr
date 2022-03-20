package lengthconverter;

import centimetersubscriber.CentimeterConvertDisplay;
import feetsubscriber.FeetDisplay;
import inchessubscriber.InchesDisplay;
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

import meterssubscriber.MeterConvertDisplay;
import milessubscriber.MilesDisplay;

@SuppressWarnings("serial")
public class LengthConvertDisplay extends JFrame{
	
	private JPanel panel;
	private JLabel lable;
	private JButton cm, m, inches, feet, miles;
	
	private boolean cmBtn = false;
	private boolean mBtn = false;
	private boolean inchBtn = false;
	private boolean feetBtn = false;
	private boolean milesBtn = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				LengthConverter lengthConverter = new LengthConverterImp();
				lengthConverter.Start();
			}
		});
	}

	public LengthConvertDisplay() throws HeadlessException {
		setResizable(false);
		setTitle("Length Converter");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(100, 150, 700, 500);
		
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(panel);
		panel.setLayout(null);
		panel.setBackground(Color.lightGray);
		panel.setVisible(true);
		
		lable = new JLabel("Length Converter");
		lable.setFont(new Font("Algerian", Font.BOLD, 30));
		lable.setBounds(200, 25, 350, 50);
		lable.setForeground(Color.black);
		panel.add(lable);
		
		cm = new JButton("Centimeters Converter");
		cm.setFont(new Font("Algerian", Font.PLAIN, 23));
		cm.setFocusable(false);
		cm.setBounds(30, 120, 300, 60);
		cm.setBackground(Color.pink);
		cm.setBorder(new LineBorder(Color.black, 2));
		cm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cmBtn = Activator.cmClicker();
				
				if (cmBtn == true) {
					CentimeterConvertDisplay centimeterConvertDisplay = new CentimeterConvertDisplay();
					centimeterConvertDisplay.setVisible(true);
					
				} else {
					JOptionPane.showMessageDialog(null, "Centimeters Converter Service is not Started", "Error !", JOptionPane.OK_OPTION);
					
				}
			}
		});
		panel.add(cm);
		
		m = new JButton("Meters Converter");
		m.setFont(new Font("Algerian", Font.PLAIN, 23));
		m.setFocusable(false);
		m.setBounds(360, 120, 300, 60);
		m.setBackground(Color.pink);
		m.setBorder(new LineBorder(Color.black, 2));
		m.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mBtn = Activator.meterClicker();
				
				if (mBtn == true) {
					MeterConvertDisplay meterConvertDisplay = new MeterConvertDisplay();
					meterConvertDisplay.setVisible(true);
					
				} else {
					JOptionPane.showMessageDialog(null, "Meters Converter Service is not Started", "Error !", JOptionPane.OK_OPTION);
					
				}
			}
		});
		panel.add(m);
		
		inches = new JButton("Inches Converter");
		inches.setFont(new Font("Algerian", Font.PLAIN, 23));
		inches.setFocusable(false);
		inches.setBounds(30, 210, 300, 60);
		inches.setBackground(Color.pink);
		inches.setBorder(new LineBorder(Color.black, 2));
		inches.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				inchBtn = Activator.cmClicker();
				
				if (inchBtn == true) {
					InchesDisplay inchesDisplay = new InchesDisplay() ;
					inchesDisplay.setVisible(true);
					
				} else {
					JOptionPane.showMessageDialog(null, "Inches Converter Service is not Started", "Error !", JOptionPane.OK_OPTION);
					
				}
			}
		});
		panel.add(inches);
		
		feet = new JButton("Feet Converter");
		feet.setFont(new Font("Algerian", Font.PLAIN, 23));
		feet.setFocusable(false);
		feet.setBounds(360, 210, 300, 60);
		feet.setBackground(Color.pink);
		feet.setBorder(new LineBorder(Color.black, 2));
		feet.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				feetBtn = Activator.feetClicker();
				
				if(feetBtn == true) {
					FeetDisplay feetDisplay = new FeetDisplay();
					feetDisplay.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Feet Converter Service is not Started", "Error !", JOptionPane.OK_OPTION);
					
				}
			}
		});
		panel.add(feet);
		
		miles = new JButton("Miles Converter");
		miles.setFont(new Font("Algerian", Font.PLAIN, 23));
		miles.setFocusable(false);
		miles.setBounds(180, 300, 300, 60);
		miles.setBackground(Color.pink);
		miles.setBorder(new LineBorder(Color.black, 2));
		miles.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				milesBtn = Activator.milesClicker();
				
				if(milesBtn == true) {
					MilesDisplay milesDisplay = new MilesDisplay();
					milesDisplay.setVisible(true);
					
				}else {
					JOptionPane.showMessageDialog(null, "Miles Converter Service is not Started", "Error !", JOptionPane.OK_OPTION);
					
				}
			}
		});
		panel.add(miles);
	}
	
}
