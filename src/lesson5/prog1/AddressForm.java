package lesson5.prog1;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;


public class AddressForm extends JFrame {

	private JPanel topPanel;
	private JPanel middlePanel;
	private JPanel buttonPanel;
	private JPanel textPanel;
	private JLabel labelName;
	private JTextField textName;
	private JLabel labelStreet;
	private JTextField textStreet;
	private JLabel labelCity;
	private JTextField textCity;
	private JLabel labelState;
	private JTextField textState;
	private JLabel labelZip;
	private JTextField textZip;
	private JButton button;

	

	public AddressForm() {
		// setBorder(Color.BLUE);
		setForeground(Color.WHITE);
		setBackground(Color.WHITE);
		
		initializeWindow();
		JPanel mainPanel = new JPanel();
		defineTopPanel();
		defineMiddlePanel();
		defineButtonPanel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(topPanel, BorderLayout.NORTH);
		mainPanel.add(middlePanel, BorderLayout.CENTER);
		mainPanel.add(buttonPanel, BorderLayout.SOUTH);
		getContentPane().add(mainPanel);
	}

	private void defineTopPanel() {
		topPanel = new JPanel();

		defineTextPanel();
		topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		topPanel.add(textPanel);

		defineTextPanel2();
		topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		topPanel.add(textPanel);

		defineTextPanel3();
		topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		topPanel.add(textPanel);

	}

	private void defineMiddlePanel() {
		middlePanel = new JPanel();

		defineTextPanelState();
		middlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		middlePanel.add(textPanel);

		defineTextPanelZip();
		middlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		middlePanel.add(textPanel);

	}

	private void defineButtonPanel() {
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		button = new JButton("Button");
		button.addActionListener(new MyButtonListener());
		buttonPanel.add(button);
	}

	private void defineTextPanel() {

		labelName = new JLabel("Name");
		labelName.setFont(makeSmallFont(labelName.getFont()));
		textName = new JTextField(10);

		textPanel = new JPanel();
		textPanel.setLayout(new BorderLayout());
		textPanel.add(textName, BorderLayout.SOUTH);
		textPanel.add(labelName, BorderLayout.NORTH);

	}

	private void defineTextPanel2() {
		labelStreet = new JLabel("Street");
		labelStreet.setFont(makeSmallFont(labelStreet.getFont()));
		textStreet = new JTextField(10);

		textPanel = new JPanel();
		textPanel.setLayout(new BorderLayout());
		textPanel.add(textStreet, BorderLayout.SOUTH);
		textPanel.add(labelStreet, BorderLayout.NORTH);
	}
	private void defineTextPanel3() {
		labelCity = new JLabel("City");
		labelCity.setFont(makeSmallFont(labelCity.getFont()));
		textCity = new JTextField(10);

		textPanel = new JPanel();
		textPanel.setLayout(new BorderLayout());
		textPanel.add(textCity, BorderLayout.SOUTH);
		textPanel.add(labelCity, BorderLayout.NORTH);
	}

	private void defineTextPanelState() {
		labelState = new JLabel("State");
		labelState.setFont(makeSmallFont(labelState.getFont()));
		textState = new JTextField(10);

		textPanel = new JPanel();
		textPanel.setLayout(new BorderLayout());
		textPanel.add(textState, BorderLayout.SOUTH);
		textPanel.add(labelState, BorderLayout.NORTH);
	}
	
	private void defineTextPanelZip() {
		labelZip = new JLabel("Zip");
		labelZip.setFont(makeSmallFont(labelZip.getFont()));
		textZip = new JTextField(10);

		textPanel = new JPanel();
		textPanel.setLayout(new BorderLayout());
		textPanel.add(textZip, BorderLayout.SOUTH);
		textPanel.add(labelZip, BorderLayout.NORTH);
	}
	

	

	private void initializeWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Address Form");
		// setTitle(Color.BLUE);
		centerFrameOnDesktop(this);
		setSize(400, 150);
		setResizable(false);
	}

	public static Font makeSmallFont(Font f) {
		return new Font(f.getName(), f.getStyle(), (f.getSize() - 2));
	}

	public static void centerFrameOnDesktop(Component f) {
		final int SHIFT_AMOUNT = 0;
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		int height = toolkit.getScreenSize().height;
		int width = toolkit.getScreenSize().width;
		int frameHeight = f.getSize().height;
		int frameWidth = f.getSize().width;
		f.setLocation(((width - frameWidth) / 2) - SHIFT_AMOUNT, (height - frameHeight) / 3);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				AddressForm mf = new AddressForm();
				mf.setVisible(true);
			}
		});
	}

	class MyButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			String textValName = textName.getText();
			String textValStreet = textStreet.getText();
			String textValCity = textCity.getText();
			String textValState = textState.getText();
			String textValZip= textZip.getText();
		
			if (textValName.equals("") || textValStreet.equals("") || textValCity.equals("")||
					textValState.equals("") || textValZip.equals("")) {
				System.out.println("Please enter all value");
			} else {
				System.out.println(textValName);
				System.out.println(textValStreet);
				System.out.println(textValCity + ", " + textValState + " " + textValZip);
//				System.out.println(youWrote + "\"" + textValState+ "\".");
//				System.out.println(youWrote + "\"" + textValZip + "\".");
			}
		}
	}

	private static final long serialVersionUID = 3618976789175941431L;
}
