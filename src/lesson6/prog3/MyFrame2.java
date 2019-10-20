package lesson6.prog3;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame2 extends JFrame {


	private JPanel p1, p2,p3,p4,p5;
	private JPanel westPanel,eastPanel,mainPanel;
	
	private JTextField text1,text2;
	private JLabel label1,label2;
	private JButton button1,button2,button3;

	public MyFrame2() {
		initializeWindow();
		defineTextPanel();
				
	}

	

	private void defineTextPanel() {
		
		
		label1 = new JLabel("Input");
		text1 = new JTextField(10);
		
		label2 = new JLabel("Output");
		text2 = new JTextField(10);
		
		button1 = new JButton("Count Letters");
		button2 = new JButton("Reverse Letters");
		button3 = new JButton("Remove Duplicate");
		
		//button1.addActionListener(new MyButtonListener1());
		button1.addActionListener(new MyButtonListener1(){
			public void actionPerformed(ActionEvent evt) {
				String textVal =text1.getText();
				Integer a = new Integer(textVal.length());
				text2.setText(a.toString());
			
			}
		});
		button1.addActionListener(evt -> {
				String textVal =text1.getText();
				Integer a = new Integer(textVal.length());
				text2.setText(a.toString());
			
			}
		);
		
		//button2.addActionListener(new MyButtonListener2());
		button2.addActionListener(new MyButtonListener2() {
			public void actionPerformed(ActionEvent evt) {
				String textVal =text1.getText();
				StringBuilder s= new StringBuilder(textVal);
				s.reverse();
				text2.setText(s.toString());
			}
		});
		button2.addActionListener( evt-> {
				String textVal =text1.getText();
				StringBuilder s= new StringBuilder(textVal);
				s.reverse();
				text2.setText(s.toString());
			
		});
		
		
		//button3.addActionListener(new MyButtonListener3());
		button3.addActionListener(new MyButtonListener3() {
			public void actionPerformed(ActionEvent evt) {
				String textVal =text1.getText();
				char[] chars = textVal.toCharArray();
				Set<Character> charSet = new LinkedHashSet<Character>();
				for (char c : chars) {
				    charSet.add(c);
				}

				StringBuilder sb = new StringBuilder();
				for (Character character : charSet) {
				    sb.append(character);
				}
		        text2.setText(sb.toString());
			}
		});
		button3.addActionListener( evt-> {
				String textVal =text1.getText();
				char[] chars = textVal.toCharArray();
				Set<Character> charSet = new LinkedHashSet<Character>();
				for (char c : chars) {
				    charSet.add(c);
				}

				StringBuilder sb = new StringBuilder();
				for (Character character : charSet) {
				    sb.append(character);
				}
		        text2.setText(sb.toString());
			
		});
		
		p1 = new JPanel();
		p1.setLayout(new BorderLayout());
		p1.add(button1, BorderLayout.NORTH);
		p1.add(button2, BorderLayout.CENTER);
		p1.add(button3, BorderLayout.SOUTH);
		
		
		p2 = new JPanel();
		p2.setLayout(new BorderLayout());
		p2.add(label1, BorderLayout.NORTH);
		p2.add(text1, BorderLayout.SOUTH);
		
		p3 = new JPanel();
		p3.setLayout(new BorderLayout());
		p3.add(label2, BorderLayout.NORTH);
		p3.add(text2, BorderLayout.SOUTH);
		
		p4 = new JPanel();
		p4.setLayout(new BorderLayout());
		p4.add(p2, BorderLayout.CENTER);
		p4.add(p3, BorderLayout.SOUTH);
		
	
		
		westPanel=new JPanel();
		westPanel.setLayout(new FlowLayout());
		westPanel.add(p1);
		
		eastPanel=new JPanel();
		eastPanel.setLayout(new FlowLayout());
		eastPanel.add(p4);
		
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new FlowLayout());
		mainPanel.add(westPanel);
		mainPanel.add(eastPanel);
				
		getContentPane().add(mainPanel);
	}

	private void initializeWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("String Utility");
		setSize(500, 200);
		centerFrameOnDesktop(this);
		setResizable(false);

	}
	public static Font makeSmallFont(Font f) {
		return new Font(f.getName(), f.getStyle(), (f.getSize() - 2));
	}

	public static void centerFrameOnDesktop(Component f) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		int height = toolkit.getScreenSize().height;
		int width = toolkit.getScreenSize().width;
		int frameHeight = f.getSize().height;
		int frameWidth = f.getSize().width;
		f.setLocation(((width - frameWidth) / 2), (height - frameHeight) / 3);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				MyFrame2 mf = new MyFrame2();
				mf.setVisible(true);
			}
		});
	}

	class MyButtonListener1 implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			String textVal =text1.getText();
			Integer a = new Integer(textVal.length());
			text2.setText(a.toString());
		
		}
	}
	class MyButtonListener2 implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			String textVal =text1.getText();
			StringBuilder s= new StringBuilder(textVal);
			s.reverse();
			text2.setText(s.toString());
		}
	}
	class MyButtonListener3 implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			String textVal =text1.getText();
			char[] chars = textVal.toCharArray();
			Set<Character> charSet = new LinkedHashSet<Character>();
			for (char c : chars) {
			    charSet.add(c);
			}

			StringBuilder sb = new StringBuilder();
			for (Character character : charSet) {
			    sb.append(character);
			}
	        text2.setText(sb.toString());
		}
	}



}


