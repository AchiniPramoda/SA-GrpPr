package mainconverter;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import designsubscriber.Design_Menu;
import lengthconverter.LengthConverter;
import lengthconverter.LengthConverterImp;

@SuppressWarnings("serial")
public class ConverterDisplay extends JFrame{
	
	private JPanel panel;
	private JLabel lable;
	private JButton weight, length;
	
	private static boolean weightBtn = false;
	private static boolean lengthBtn = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				ConverterDisplay display = new ConverterDisplay();
				display.setVisible(true);
			}
		});		
	}

	public ConverterDisplay() throws HeadlessException {
		setResizable(false);
		setTitle("Converter");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(100, 150, 500, 500);
		
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(panel);
		panel.setBackground(Color.darkGray);
		panel.setLayout(null);
		
		/*Image icon = new ImageIcon(this.getClass().getResource("/b3.png")).getImage();
		JLabel pic = new JLabel("");	
		pic.setIcon(new ImageIcon(icon));
		pic.setBounds(10, 10, 100, 100);
		panel.add(pic);
		panel.setVisible(true);*/
		
		lable = new JLabel("..Converter..");
		lable.setFont(new Font("Algerian", Font.BOLD, 36));
		lable.setBounds(110, 25, 350, 50);
		lable.setForeground(Color.white);
		panel.add(lable);
		
		weight = new JButton("Weight Converter");
		weight.setFont(new Font("Algerian", Font.PLAIN, 30));
		weight.setFocusable(false);
		weight.setBounds(70, 120, 350, 95);
		weight.setBackground(Color.pink);
		weight.setBorder(new LineBorder(Color.black, 2));
		weight.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				weightBtn = Activator.weightClicker();
				
				if(weightBtn == true) {
					Design_Menu design_Menu = new Design_Menu();
					design_Menu.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Weight Converter Service is not Started", "Error !", JOptionPane.OK_OPTION);
				}
			}
		});
		panel.add(weight);
		
		length = new JButton("Length Converter");
		length.setFont(new Font("Algerian", Font.PLAIN, 30));
		length.setFocusable(false);
		length.setBounds(70, 250, 350, 95);
		length.setBackground(Color.pink);
		length.setBorder(new LineBorder(Color.black, 2));
		length.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lengthBtn = Activator.lengthClicker();
				
				if(lengthBtn == true) {					
					LengthConverter lengthConverter = new LengthConverterImp();
					lengthConverter.Start();
					
				}else {
					JOptionPane.showMessageDialog(null, "Weight Converter Service is not Started", "Error !", JOptionPane.OK_OPTION);
				}
			}
		});
		panel.add(length);
	}

}
