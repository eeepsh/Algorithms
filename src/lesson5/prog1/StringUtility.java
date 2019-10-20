package lesson5.prog1;

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
import javax.swing.border.EmptyBorder;
import javax.xml.stream.events.Characters;

import lesson5.prog1.AddressForm.MyButtonListener;

public class StringUtility extends JFrame {

	private JPanel contentPane;
	private JPanel buttonPanel;
	private JPanel rightPanel;
	private JPanel textPanelInput;
	private JPanel textPanelOutput;
	private JButton buttonCountLetters;
	private JButton buttonReverseLetters;
	private JButton buttonRemoveDuplicates;
	private JLabel labelInput;
	private JTextField textInput;
	private JLabel labelOutput;
	private JTextField textOutput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StringUtility frame = new StringUtility();
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
	public StringUtility() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel mainPanel = new JPanel();
		getContentPane().add(mainPanel);
		initializeWindow();
		defineButtonPanel();
		defineRightPanel();
		mainPanel.setLayout(new FlowLayout());
		mainPanel.add(buttonPanel);
		mainPanel.add(rightPanel);

	}

	private void defineButtonPanel() {
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new BorderLayout());

		buttonCountLetters = new JButton("Count Letters");
		buttonCountLetters.addActionListener(new ButtonCountListener());
		buttonPanel.add(buttonCountLetters, BorderLayout.NORTH);

		buttonReverseLetters = new JButton("Reverse Letters");
		buttonReverseLetters.addActionListener(new ButtonReverseListener());
		buttonPanel.add(buttonReverseLetters, BorderLayout.CENTER);

		buttonRemoveDuplicates = new JButton("Remove Duplicates");
		buttonRemoveDuplicates.addActionListener(new ButtonRemoveDuplicatesListener());
		buttonPanel.add(buttonRemoveDuplicates, BorderLayout.SOUTH);
	}

	private void defineRightPanel() {
		// TODO Auto-generated method stub
		rightPanel = new JPanel();
		rightPanel.setLayout(new BorderLayout());

		defineTextPanelInput();

		rightPanel.add(textPanelInput, BorderLayout.NORTH);

		defineTextPanelOutput();

		rightPanel.add(textPanelOutput, BorderLayout.SOUTH);

	}

	private void defineTextPanelInput() {
		// TODO Auto-generated method stub

		labelInput = new JLabel("Input");
		labelInput.setFont(makeSmallFont(labelInput.getFont()));

		textInput = new JTextField(10);
		textPanelInput = new JPanel();
		textPanelInput.setLayout(new BorderLayout());
		textPanelInput.add(textInput, BorderLayout.SOUTH);
		textPanelInput.add(labelInput, BorderLayout.NORTH);
	}

	private Font makeSmallFont(Font f) {
		// TODO Auto-generated method stub

		return new Font(f.getName(), f.getStyle(), (f.getSize() - 2));

	}

	private void defineTextPanelOutput() {
		// TODO Auto-generated method stub
		labelOutput = new JLabel("Output");
		labelOutput.setFont(makeSmallFont(labelOutput.getFont()));

		textOutput = new JTextField(10);
		textPanelOutput = new JPanel();
		textPanelOutput.setLayout(new BorderLayout());
		textPanelOutput.add(textOutput, BorderLayout.SOUTH);
		textPanelOutput.add(labelOutput, BorderLayout.NORTH);

	}

	private void initializeWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("String Utility");

		setSize(500, 250);
		setResizable(false);
	}

	class ButtonCountListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			String input = textInput.getText();
			Integer count = new Integer(input.length());
			textOutput.setText(count.toString());

		}
	}

	class ButtonReverseListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			String input = textInput.getText();
			StringBuilder s = new StringBuilder(input);
			s.reverse();
			textOutput.setText(s.toString());

		}
	}

	class ButtonRemoveDuplicatesListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			String input = textInput.getText();
			textOutput.setText(duplicate(input));
		}

		private String duplicate(String input) {
			String result = "";
			for (int i = 0; i < input.length(); i++) {
				if (!result.contains(String.valueOf(input.charAt(i)))) {
					result += String.valueOf(input.charAt(i));
				}
			}
			return result;
		}


	}

	public static void centerFrameOnDesktop(Component f) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		int height = toolkit.getScreenSize().height;
		int width = toolkit.getScreenSize().width;
		int frameHeight = f.getSize().height;
		int frameWidth = f.getSize().width;
		f.setLocation(((width - frameWidth) / 2), (height - frameHeight) / 3);
	}
}