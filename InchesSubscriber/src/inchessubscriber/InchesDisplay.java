package inchessubscriber;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import inchesconverter.InchesCalculator;
import inchesconverter.InchesConverter;

@SuppressWarnings("serial")
public class InchesDisplay extends JFrame{
	
	private InchesConverter converter;
	
	private JPanel panel;
	private JLabel label;
	
	@SuppressWarnings("rawtypes")
	private JComboBox box;
	private JTextField in, out;
	private JButton convertBtn;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				InchesDisplay display = new InchesDisplay();
				display.setVisible(true);
			}
		});
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public InchesDisplay() throws HeadlessException {
		
		converter = new InchesCalculator();
		setResizable(false);
		setTitle("Length Converter");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(180, 150, 650, 500);
		
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setBackground(Color.lightGray); 
		panel.setLayout(null);
		panel.setVisible(true);
		
		label = new JLabel("Inches Converter");
		label.setFont(new Font("Algerian", Font.BOLD, 30));
		label.setBounds(180, 25, 350, 50);
		label.setForeground(Color.darkGray);
		panel.add(label);
		
		box = new JComboBox();
		box.setFont(new Font("Arial Nova", Font.PLAIN, 15));
		box.setBackground(Color.WHITE);
		box.setBounds(250, 100, 180, 40);
		
		box.addItem("Inches to Centimeters");
		box.addItem("Inches to Meters");
		box.addItem("Inches to Feet");
		box.addItem("Inches to Miles");
		
		panel.add(box);
		
		in = new JTextField();
		in.setHorizontalAlignment(SwingConstants.CENTER);
		in.setFont(new Font("Arial Nova", Font.PLAIN, 15));
		in.setBounds(250, 180, 180, 40);
		panel.add(in);
		
		convertBtn = new JButton("Convert ");
		convertBtn.setFont(new Font("Arial Nova", Font.PLAIN, 20));
		convertBtn.setBounds(150, 250, 150, 50);
		convertBtn.setBackground(Color.green);
		convertBtn.setBorder(new LineBorder(Color.darkGray, 2));
		panel.add(convertBtn);
		
		out = new JTextField();
		out.setHorizontalAlignment(SwingConstants.CENTER);
		out.setFont(new Font("Arial Nova", Font.PLAIN, 15));
		out.setBounds(250, 350, 180, 50);
		out.setEditable(isDisplayable());
		out.setBackground(Color.white);
		panel.add(out);
				
		JLabel type = new JLabel("Select Convert Type :");
		type.setFont(new Font("Arial Narrow", Font.PLAIN, 20));
		type.setBounds(90, 95, 400, 50);
		type.setForeground(Color.black);
		panel.add(type);
		
		JLabel inL = new JLabel("Enter Your Value :");
		inL.setFont(new Font("Arial Narrow", Font.PLAIN, 20));
		inL.setBounds(90, 175, 400, 50);
		inL.setForeground(Color.black);
		panel.add(inL);
		
		convertBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String input = in.getText();
				float val = Float.parseFloat(input);
				String output = "";
				
				String unitType = String.valueOf(box.getSelectedItem());
				
				if(input.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Input Field is Empty", "Empty Field Alert", JOptionPane.OK_OPTION);
					 
				}else {
					if(unitType == "Inches to Centimeters") {
						output = String.valueOf(converter.InchToCenti(val));
						
					}else if (unitType == "Inches to Meters") {
						output = String.valueOf(converter.InchToMeter(val));
						
					}else if (unitType == "Inches to Feet") {
						output = String.valueOf(converter.InchToFeet(val));
						
					}else {
						output = String.valueOf(converter.InchToMiles(val));
						
					}
				}
				
				out.setText(output);
			} 
		});	
		
		JButton clearBtn = new JButton("Clear");
		clearBtn.setFont(new Font("Arial Nova", Font.PLAIN, 20));
		clearBtn.setBounds(360, 250, 150, 50);
		clearBtn.setBackground(Color.orange);
		clearBtn.setBorder(new LineBorder(Color.darkGray, 2));
		panel.add(clearBtn);
		
		clearBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				in.setText("");
				out.setText("");
			}
		});
	}	

}
