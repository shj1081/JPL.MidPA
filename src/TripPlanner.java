import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class TripPlanner {

	ArrayList<PublicTransport> transportList = new ArrayList<PublicTransport>(); // for listing objects of transport
	int count; // for storing the number of objects in the arraylist
	int inputState; // for storing the state of input process to determine the next step
	String transportState; // for storing the state of transport to distinguish the type of transport

	// for building elements of GUI
	private JFrame frmTripPlanner;
	private JLabel PlannerLogo;
	private JLabel titleLabel;
	private JTextArea textDisiplay;

	private JPanel TransportPanel;
	private JButton trainButton;
	private JButton busButton;
	private JButton taxiButton;

	private JPanel yesNoPanel;
	private JButton yesButton;
	private JButton noButton;

	private JPanel inputControlPanel;
	private JButton cancelButton;
	private JButton clearButton;
	private JButton enterButton;

	private JPanel keypadPannel;
	private JButton keypad1;
	private JButton keypad2;
	private JButton keypad3;
	private JButton keypad4;
	private JButton keypad5;
	private JButton keypad6;
	private JButton keypad7;
	private JButton keypad8;
	private JButton keypad9;
	private JButton keypad0;
	private JPanel keypadPadding;

	// using WindowBuilder to build the GUI
	// main function : lunch the application
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TripPlanner window = new TripPlanner();
					window.frmTripPlanner.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// constructor : create the application
	public TripPlanner() {
		initialize();
	}

	// initialize the contents of the frame
	private void initialize() {
		// window frame
		frmTripPlanner = new JFrame();
		frmTripPlanner.setTitle("Trip Planner");
		frmTripPlanner.setBounds(100, 100, 571, 658);
		frmTripPlanner.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTripPlanner.getContentPane().setLayout(null);

		// logo
		PlannerLogo = new JLabel("");
		PlannerLogo.setIcon(new ImageIcon(TripPlanner.class.getResource("/assets/planner_logo.png")));
		PlannerLogo.setBounds(90, 29, 398, 62);
		frmTripPlanner.getContentPane().add(PlannerLogo);

		// title
		titleLabel = new JLabel("TRIP PLANNER");
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		titleLabel.setBounds(246, 103, 78, 16);
		frmTripPlanner.getContentPane().add(titleLabel);

		// area that display the output text
		textDisiplay = new JTextArea();
		textDisiplay.setFont(new Font("Lucida Grande", Font.PLAIN,9));	
		textDisiplay.setEditable(false);
		textDisiplay.setBounds(157, 131, 246, 182);
		textDisiplay.setText("Choose transport (from left menu): "); // initial text
		frmTripPlanner.getContentPane().add(textDisiplay);

		// Train, Bus, Taxi buttons
		TransportPanel = new JPanel();
		TransportPanel.setBounds(40, 131, 113, 87);
		frmTripPlanner.getContentPane().add(TransportPanel);
		TransportPanel.setLayout(new GridLayout(3, 1, 0, 0));

		trainButton = new JButton("TRAIN");
		trainButton.setIcon(new ImageIcon(TripPlanner.class.getResource("/assets/train.png")));
		TransportPanel.add(trainButton);

		busButton = new JButton("BUS");
		busButton.setIcon(new ImageIcon(TripPlanner.class.getResource("/assets/bus.png")));
		TransportPanel.add(busButton);

		taxiButton = new JButton("TAXI");
		taxiButton.setIcon(new ImageIcon(TripPlanner.class.getResource("/assets/taxi.png")));
		TransportPanel.add(taxiButton);

		yesNoPanel = new JPanel();
		yesNoPanel.setBounds(403, 131, 120, 87);
		frmTripPlanner.getContentPane().add(yesNoPanel);
		yesNoPanel.setLayout(new GridLayout(2, 1, 0, 0));

		yesButton = new JButton("YES");
		yesButton.setIcon(new ImageIcon(TripPlanner.class.getResource("/assets/enterSmall.png")));
		yesNoPanel.add(yesButton);

		noButton = new JButton("NO");
		noButton.setIcon(new ImageIcon(TripPlanner.class.getResource("/assets/cancelSmall.png")));
		yesNoPanel.add(noButton);


		// Cancel, Clear, Enter buttons
		inputControlPanel = new JPanel();
		inputControlPanel.setBounds(403, 314, 120, 251);
		frmTripPlanner.getContentPane().add(inputControlPanel);
		inputControlPanel.setLayout(new GridLayout(4, 1, 0, 0));

		cancelButton = new JButton("CANCEL");
		cancelButton.setIcon(new ImageIcon(TripPlanner.class.getResource("/assets/cancel.png")));
		cancelButton.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		inputControlPanel.add(cancelButton);

		clearButton = new JButton("CLEAR");
		clearButton.setIcon(new ImageIcon(TripPlanner.class.getResource("/assets/clear.png")));
		clearButton.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisiplay.setText("");
			}
		});
		inputControlPanel.add(clearButton);

		enterButton = new JButton("ENTER");
		enterButton.setIcon(new ImageIcon(TripPlanner.class.getResource("/assets/enter.png")));
		enterButton.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		inputControlPanel.add(enterButton);

		// keypad
		keypadPannel = new JPanel();
		keypadPannel.setBounds(157, 314, 246, 251);
		frmTripPlanner.getContentPane().add(keypadPannel);
		keypadPannel.setLayout(new GridLayout(4, 3, 0, 0));

		keypad1 = new JButton("");
		keypad1.setIcon(new ImageIcon(TripPlanner.class.getResource("/assets/1.png")));
		keypad1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisiplay.append("1");
			}
		});
		keypadPannel.add(keypad1);

		keypad2 = new JButton("");
		keypad2.setIcon(new ImageIcon(TripPlanner.class.getResource("/assets/2.png")));
		keypad2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisiplay.append("2");
			}
		});
		keypadPannel.add(keypad2);

		keypad3 = new JButton("");
		keypad3.setIcon(new ImageIcon(TripPlanner.class.getResource("/assets/3.png")));
		keypad3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisiplay.append("3");
			}
		});
		keypadPannel.add(keypad3);

		keypad4 = new JButton("");
		keypad4.setIcon(new ImageIcon(TripPlanner.class.getResource("/assets/4.png")));
		keypad4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisiplay.append("4");
			}
		});
		keypadPannel.add(keypad4);

		keypad5 = new JButton("");
		keypad5.setIcon(new ImageIcon(TripPlanner.class.getResource("/assets/5.png")));
		keypad5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisiplay.append("5");
			}
		});
		keypadPannel.add(keypad5);

		keypad6 = new JButton("");
		keypad6.setIcon(new ImageIcon(TripPlanner.class.getResource("/assets/6.png")));
		keypad6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisiplay.append("6");
			}
		});
		keypadPannel.add(keypad6);

		keypad7 = new JButton("");
		keypad7.setIcon(new ImageIcon(TripPlanner.class.getResource("/assets/7.png")));
		keypad7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisiplay.append("7");
			}
		});
		keypadPannel.add(keypad7);

		keypad8 = new JButton("");
		keypad8.setIcon(new ImageIcon(TripPlanner.class.getResource("/assets/8.png")));
		keypad8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisiplay.append("8");
			}
		});
		keypadPannel.add(keypad8);

		keypad9 = new JButton("");
		keypad9.setIcon(new ImageIcon(TripPlanner.class.getResource("/assets/9.png")));
		keypad9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisiplay.append("9");
			}
		});
		keypadPannel.add(keypad9);

		keypadPadding = new JPanel(); // for alligning the keypad
		keypadPannel.add(keypadPadding);

		keypad0 = new JButton("");
		keypad0.setIcon(new ImageIcon(TripPlanner.class.getResource("/assets/0.png")));
		keypad0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisiplay.append("0");
			}
		});
		keypadPannel.add(keypad0);

	}
}
