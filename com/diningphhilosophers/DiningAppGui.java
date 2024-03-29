package com.diningphhilosophers;

import com.diningphhilosophers.Deadlock.DiningDeadlock;
import com.diningphhilosophers.Deadlock.PhilosopherDeadlock;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class DiningAppGui extends JFrame {


	private static final long serialVersionUID = -9102921349267475005L;
	private JPanel contentPane;
	private ArrayList<JLabel> forkLabelList = new ArrayList<>();
	private ArrayList<JLabel> philosopherLabelList = new ArrayList<>();

	private ArrayList<JLabel> forkList = new ArrayList<>();
	private ArrayList<JProgressBar> progressBars = new ArrayList<>();
	private ArrayList<JLabel> zzzList = new ArrayList<>();
	private ArrayList<JLabel> finishedList = new ArrayList<>();
	private DiningApp diningApp;

	private DiningDeadlock diningDeadlock;
	boolean isReset = false;
	Timer timer = new Timer();
	int itemSelected = 0;

	List<String> options = Arrays.asList("People with odd numbers eat first",
			"People with even numbers  eat first",
			"People have right pork",
			"People have left pork");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiningAppGui frame = new DiningAppGui();
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
	public void genrateUI(){
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		JLabel lblPhilosopher_1 = new JLabel("Philosopher 1");
		lblPhilosopher_1.setOpaque(true);
		lblPhilosopher_1.setForeground(Color.WHITE);
		lblPhilosopher_1.setBackground(Color.BLACK);
		lblPhilosopher_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhilosopher_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPhilosopher_1.setBounds(590, 206, 115, 70);
		philosopherLabelList.add(lblPhilosopher_1);
		contentPane.add(lblPhilosopher_1);

		JLabel lblPhilosopher_2 = new JLabel("Philosopher 2");
		lblPhilosopher_2.setOpaque(true);
		lblPhilosopher_2.setForeground(Color.WHITE);
		lblPhilosopher_2.setBackground(Color.BLACK);
		lblPhilosopher_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhilosopher_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPhilosopher_2.setBounds(590, 402, 115, 70);
		philosopherLabelList.add(lblPhilosopher_2);
		contentPane.add(lblPhilosopher_2);

		JLabel lblPhilosopher_3 = new JLabel("Philosopher 3");
		lblPhilosopher_3.setOpaque(true);
		lblPhilosopher_3.setForeground(Color.WHITE);
		lblPhilosopher_3.setBackground(Color.BLACK);
		lblPhilosopher_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhilosopher_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPhilosopher_3.setBounds(410, 501, 115, 71);
		philosopherLabelList.add(lblPhilosopher_3);
		contentPane.add(lblPhilosopher_3);

		JLabel lblPhilosopher_4 = new JLabel("Philosopher 4");
		lblPhilosopher_4.setOpaque(true);
		lblPhilosopher_4.setForeground(Color.WHITE);
		lblPhilosopher_4.setBackground(Color.BLACK);
		lblPhilosopher_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhilosopher_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPhilosopher_4.setBounds(213, 402, 115, 70);
		philosopherLabelList.add(lblPhilosopher_4);
		contentPane.add(lblPhilosopher_4);

		JLabel lblPhilosopher = new JLabel("Philosopher 5");
		lblPhilosopher.setOpaque(true);
		lblPhilosopher.setBackground(Color.BLACK);
		lblPhilosopher.setForeground(Color.WHITE);
		lblPhilosopher.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhilosopher.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPhilosopher.setBounds(217, 206, 115, 70);
		philosopherLabelList.add(lblPhilosopher);
		contentPane.add(lblPhilosopher);
		JLabel lblPhilosopher_6 = new JLabel("Philosopher 6");
		lblPhilosopher_6.setOpaque(true);
		lblPhilosopher_6.setBackground(Color.BLACK);
		lblPhilosopher_6.setForeground(Color.WHITE);
		lblPhilosopher_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhilosopher_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPhilosopher_6.setBounds(420, 130, 115, 70);
		philosopherLabelList.add(lblPhilosopher_6);
		contentPane.add(lblPhilosopher_6);

		JLabel lblFork_1 = new JLabel("fork 1");
		lblFork_1.setBackground(new Color(205, 92, 92));
		lblFork_1.setOpaque(true);
		lblFork_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFork_1.setBounds(571, 310, 66, 27);
		forkLabelList.add(lblFork_1);
		contentPane.add(lblFork_1);

		JLabel lblFork_2 = new JLabel("fork 2");
		lblFork_2.setBackground(new Color(205, 92, 92));
		lblFork_2.setOpaque(true);
		lblFork_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblFork_2.setBounds(504, 463, 66, 27);
		forkLabelList.add(lblFork_2);
		contentPane.add(lblFork_2);

		JLabel lblFork_3 = new JLabel("fork 3");
		lblFork_3.setBackground(new Color(205, 92, 92));
		lblFork_3.setOpaque(true);
		lblFork_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblFork_3.setBounds(346, 463, 66, 27);
		forkLabelList.add(lblFork_3);
		contentPane.add(lblFork_3);

		JLabel lblFork_4 = new JLabel("fork 4");
		lblFork_4.setBackground(new Color(205, 92, 92));
		lblFork_4.setOpaque(true);
		lblFork_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblFork_4.setBounds(306, 316, 66, 27);
		forkLabelList.add(lblFork_4);
		contentPane.add(lblFork_4);

		JLabel lblFork_5 = new JLabel("fork 5");
		lblFork_5.setBackground(new Color(205, 92, 92));
		lblFork_5.setOpaque(true);
		lblFork_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblFork_5.setBounds(380, 228, 66, 27);
		forkLabelList.add(lblFork_5);
		contentPane.add(lblFork_5);
		JLabel lblFork_6 = new JLabel("fork 6");
		lblFork_6.setBackground(new Color(205, 92, 92));
		lblFork_6.setOpaque(true);
		lblFork_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblFork_6.setBounds(500, 228, 66, 27);
		forkLabelList.add(lblFork_6);
		contentPane.add(lblFork_6);

		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setMaximum(50);
		progressBar_1.setBounds(630, 173, 146, 22);
		progressBars.add(progressBar_1);
		contentPane.add(progressBar_1);

		JProgressBar progressBar_2 = new JProgressBar();
		progressBar_2.setMaximum(50);
		progressBar_2.setBounds(630, 369, 146, 22);
		progressBars.add(progressBar_2);
		contentPane.add(progressBar_2);

		JProgressBar progressBar_3 = new JProgressBar();
		progressBar_3.setMaximum(50);
		progressBar_3.setBounds(397, 583, 146, 27);
		progressBars.add(progressBar_3);
		contentPane.add(progressBar_3);

		JProgressBar progressBar_4 = new JProgressBar();
		progressBar_4.setMaximum(50);
		progressBar_4.setBounds(102, 369, 146, 22);
		progressBars.add(progressBar_4);
		contentPane.add(progressBar_4);

		JProgressBar progressBar_5 = new JProgressBar();
		progressBar_5.setMaximum(50);
		progressBar_5.setBounds(102, 173, 146, 22);
		progressBars.add(progressBar_5);
		contentPane.add(progressBar_5);
		JProgressBar progressBar_6 = new JProgressBar();
		progressBar_6.setMaximum(50);
		progressBar_6.setBounds(400, 100, 146, 22);
		progressBars.add(progressBar_6);
		contentPane.add(progressBar_6);

//		JTextArea txtrObserveTheDining = new JTextArea();
//		txtrObserveTheDining.setEditable(false);
//		txtrObserveTheDining.setFont(new Font("Yu Gothic", Font.BOLD, 13));
//		txtrObserveTheDining.setLineWrap(true);
//		txtrObserveTheDining.setText("- 5 philosophers sit at a table\r\n- There are only 5 forks on the table \r\n- They are all hungry & want to eat\r\n- They can only eat when the fork to the left & right of them are both available\r\n- After eating for a period, they then take a quick snooze before trying to eat again :)\r\n- Watch as they take turns to use the forks (using the sychronized key word to check if a\tFork is available or not)");
//		txtrObserveTheDining.setBounds(40, 11, 843, 141);
//		contentPane.add(txtrObserveTheDining);
		//drop list
		final DefaultComboBoxModel optionName = new DefaultComboBoxModel();
		optionName.addAll(options);
//		optionName.addElement("Mango");

		final JComboBox optionCombo = new JComboBox(optionName);
		optionCombo.setBounds(400,40,300,40);
		optionCombo.setSelectedIndex(0);
		contentPane.add(optionCombo);




		JLabel lblZzz1 = new JLabel("zzz...");
		lblZzz1.setVisible(false);
		lblZzz1.setBounds(720, 206, 46, 14);
		zzzList.add(lblZzz1);
		contentPane.add(lblZzz1);

		JLabel lblZzz2 = new JLabel("zzz...");
		lblZzz2.setVisible(false);
		lblZzz2.setBounds(715, 402, 46, 14);
		zzzList.add(lblZzz2);
		contentPane.add(lblZzz2);

		JLabel lblZzz3 = new JLabel("zzz...");
		lblZzz3.setVisible(false);
		lblZzz3.setBounds(535, 501, 46, 14);
		zzzList.add(lblZzz3);
		contentPane.add(lblZzz3);

		JLabel lblZzz4 = new JLabel("zzz...");
		lblZzz4.setVisible(false);
		lblZzz4.setBounds(337, 402, 46, 14);
		zzzList.add(lblZzz4);
		contentPane.add(lblZzz4);

		JLabel lblZzz5 = new JLabel("zzz...");
		lblZzz5.setVisible(false);
		lblZzz5.setBounds(382, 206, 46, 14);
		zzzList.add(lblZzz5);
		contentPane.add(lblZzz5);
		JLabel lblZzz6 = new JLabel("zzz...");
		lblZzz6.setVisible(false);
		lblZzz6.setBounds(540, 130, 46, 14);
		zzzList.add(lblZzz6);
		contentPane.add(lblZzz6);

		JLabel lblFinishedEating1 = new JLabel("Finished eating");
		lblFinishedEating1.setOpaque(true);
		lblFinishedEating1.setVisible(false);
		lblFinishedEating1.setBackground(new Color(255, 20, 147));
		lblFinishedEating1.setBounds(720, 235, 108, 20);
		finishedList.add(lblFinishedEating1);
		contentPane.add(lblFinishedEating1);

		JLabel lblFinishedEating2 = new JLabel("Finished eating");
		lblFinishedEating2.setOpaque(true);
		lblFinishedEating2.setVisible(false);
		lblFinishedEating2.setBackground(new Color(255, 20, 147));
		lblFinishedEating2.setBounds(712, 431, 108, 20);
		finishedList.add(lblFinishedEating2);
		contentPane.add(lblFinishedEating2);

		JLabel lblFinishedEating3 = new JLabel("Finished eating");
		lblFinishedEating3.setOpaque(true);
		lblFinishedEating3.setVisible(false);
		lblFinishedEating3.setBackground(new Color(255, 20, 147));
		lblFinishedEating3.setBounds(529, 530, 108, 20);
		finishedList.add(lblFinishedEating3);
		contentPane.add(lblFinishedEating3);

		JLabel lblFinishedEating4 = new JLabel("Finished eating");
		lblFinishedEating4.setOpaque(true);
		lblFinishedEating4.setVisible(false);
		lblFinishedEating4.setBackground(new Color(255, 20, 147));
		lblFinishedEating4.setBounds(102, 431, 108, 20);
		finishedList.add(lblFinishedEating4);
		contentPane.add(lblFinishedEating4);

		JLabel lblFinishedEating5 = new JLabel("Finished eating");
		lblFinishedEating5.setOpaque(true);
		lblFinishedEating5.setVisible(false);
		lblFinishedEating5.setBackground(new Color(255, 20, 147));
		lblFinishedEating5.setBounds(100, 235, 108, 20);
		finishedList.add(lblFinishedEating5);
		contentPane.add(lblFinishedEating5);
		JLabel lblFinishedEating6 = new JLabel("Finished eating");
		lblFinishedEating6.setOpaque(true);
		lblFinishedEating6.setVisible(false);
		lblFinishedEating6.setBackground(new Color(255, 20, 147));
		lblFinishedEating6.setBounds(650, 150, 108, 20);
		finishedList.add(lblFinishedEating6);
		contentPane.add(lblFinishedEating6);

		//Button Start

		JButton startButton = new JButton("Start"){
			@Override
			protected void paintComponent(Graphics g) {
				Graphics2D g2d = (Graphics2D) g.create();

				// Vẽ nền với các góc bo tròn
				g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
				g2d.setColor(getBackground());

				int width = getWidth();
				int height = getHeight();
				int cornerRadius = 20; // Điều chỉnh độ cong ở đây

				g2d.fill(new RoundRectangle2D.Float(0, 0, width - 1, height - 1, cornerRadius, cornerRadius));

				super.paintComponent(g2d);
				g2d.dispose();
			}
		};
		// Customize the button's appearance
		startButton.setFont(new Font("Arial", Font.BOLD, 14));
		startButton.setFocusPainted(false);
		startButton.setForeground(Color.WHITE);
		startButton.setBackground(Color.GREEN);
		startButton.setBounds(40,40,100,40);
		startButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				itemSelected = optionCombo.getSelectedIndex();
				isReset = false;
				if(optionCombo.getSelectedIndex() == 0){
					startDiningDeadlock();
				}else{
					startDining();
				}
				startButton.setBackground(new Color(0,204,0));
				optionCombo.setEnabled(false);

//				startDining();

			}
		});
		contentPane.add(startButton);
		//button Stop
		JButton stopButton = new JButton("Stop");
		// Customize the button's appearance
		stopButton.setFont(new Font("Arial", Font.BOLD, 14));
		stopButton.setFocusPainted(false);
		stopButton.setForeground(Color.WHITE);
		stopButton.setBackground(Color.RED);
		stopButton.setBounds(160,40,100,40);
		stopButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				startButton.setBackground(Color.GREEN);
				startButton.setText("Continue");


			}
		});
		contentPane.add(stopButton);
//		contentPane.add(stopButton);
		//button Reset
		JButton resetButton = new JButton("Reset");
		// Customize the button's appearance
		resetButton.setFont(new Font("Arial", Font.BOLD, 14));
		resetButton.setFocusPainted(false);
		resetButton.setForeground(Color.WHITE);
		resetButton.setBackground(Color.BLUE);
		resetButton.setBounds(280,40,100,40);
		resetButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				optionCombo.setEnabled(true);
				startButton.setBackground(Color.GREEN);
				startButton.setText("Start");
				isReset = true;
//				diningApp.reset();
				lblFinishedEating1.setVisible(false);
				lblFinishedEating2.setVisible(false);
				lblFinishedEating3.setVisible(false);
				lblFinishedEating4.setVisible(false);
				lblFinishedEating5.setVisible(false);
				lblFinishedEating6.setVisible(false);
				lblZzz1.setVisible(false);
				lblZzz2.setVisible(false);
				lblZzz3.setVisible(false);
				lblZzz4.setVisible(false);
				lblZzz5.setVisible(false);
				lblZzz6.setVisible(false);
				progressBar_1.setValue(0);
				progressBar_2.setValue(0);
				progressBar_3.setValue(0);
				progressBar_4.setValue(0);
				progressBar_5.setValue(0);
				progressBar_6.setValue(0);
				lblPhilosopher_1.setBackground(Color.BLACK);
				lblPhilosopher_2.setBackground(Color.BLACK);
				lblPhilosopher_3.setBackground(Color.BLACK);
				lblPhilosopher_4.setBackground(Color.BLACK);
				lblPhilosopher.setBackground(Color.BLACK);
				lblPhilosopher_6.setBackground(Color.BLACK);
			}
		});
		contentPane.add(resetButton);
	}
	public DiningAppGui() {
		setTitle("DINING PHILOSOPHERS");
		diningApp = new DiningApp();
		diningDeadlock = new DiningDeadlock();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 969, 660);
		genrateUI();

		setContentPane(contentPane);


//		startDining();
	}
	private void startDiningDeadlock(){
		diningDeadlock.start();
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				for(PhilosopherDeadlock philosopher : diningDeadlock.getPhilosophers()){
					if(!philosopher.isFinished()){
						if(philosopher.getName().contains("1")){
							forkLabelList.get(0).setText("fork 1 (p1)");
							forkLabelList.get(5).setText("fork 6 (p1)");
						} else if (philosopher.getName().contains("2")) {
							forkLabelList.get(0).setText("fork 1 (p2)");
							forkLabelList.get(1).setText("fork 2 (p2)");
						} else{
							int idx =philosopher.getName().charAt(philosopher.getName().length() - 1) -'0';
							int preIdx = idx - 1;
							if(philosopher.hasLeftFork()){
								forkLabelList.get((idx-2)%5).setText("fork " +preIdx+ " (p" +idx+")");
							}
							if(philosopher.hasRightFork()){
								forkLabelList.get((idx-1)%5).setText("fork " +idx+ " (p"+idx+")");
							}

						}
						updateGui();
					}
					else {
						timeForBed(philosopher);
					}
				}
			}
		}, 2000, 1000);
	}
	private void startDining() {
		diningApp.start();

		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				for(Philosopher philosopher : diningApp.getPhilosophers()){
					if(!philosopher.isFinished()){
						if(philosopher.getName().contains("1")){
							forkLabelList.get(0).setText("fork 1 (p1)");
							forkLabelList.get(5).setText("fork 6 (p1)");
						}
						else{
							int idx =philosopher.getName().charAt(philosopher.getName().length() - 1) -'0';
							int preIdx = idx - 1;
							if(philosopher.hasLeftFork()){
								forkLabelList.get((idx-2)%5).setText("fork " +preIdx+ " (p" +idx+")");
							}
							if(philosopher.hasRightFork()){
								forkLabelList.get((idx-1)%5).setText("fork " +idx+ " (p"+idx+")");
							}

						}
//						int idx =philosopher.getName().charAt(philosopher.getName().length() - 1) -'0';
//						int preIdx = idx - 1;
//						forkLabelList.get(0).setText("fork 1 (p2)");
//						forkLabelList.get(1).setText("fork 2 (p2)");

						updateGui();
					}
					else {
						timeForBed(philosopher);
					}
				}
			}
		}, 2000, 1000);
	}

	protected void timeForBed(Philosopher philosopher) {

		if(!isReset){
			switch (philosopher.getName()) {
				case "Philosopher: 1":
					finishedList.get(0).setVisible(true);
					break;
				case "Philosopher: 2":
					finishedList.get(1).setVisible(true);
					break;
				case "Philosopher: 3":
					finishedList.get(2).setVisible(true);
					break;
				case "Philosopher: 4":
					finishedList.get(3).setVisible(true);
					break;
				case "Philosopher: 5":
					finishedList.get(4).setVisible(true);
					break;
				case "Philosopher: 6":
					finishedList.get(5).setVisible(true);
					break;
				default:
					break;
			}
		}

	}
	protected void timeForBed(PhilosopherDeadlock philosopher) {
		if(!isReset){
			switch (philosopher.getName()) {
				case "Philosopher: 1":
					finishedList.get(0).setVisible(true);
					break;
				case "Philosopher: 2":
					finishedList.get(1).setVisible(true);
					break;
				case "Philosopher: 3":
					finishedList.get(2).setVisible(true);
					break;
				case "Philosopher: 4":
					finishedList.get(3).setVisible(true);
					break;
				case "Philosopher: 5":
					finishedList.get(4).setVisible(true);
					break;
				case "Philosopher: 6":
					finishedList.get(5).setVisible(true);
					break;
				default:
					break;
			}
		}

	}

	private void updateGui() {
		int philosopherCounter = 0;
		if(itemSelected == 0){
			for(PhilosopherDeadlock philosopher : diningDeadlock.getPhilosophers()){
				progressBars.get(philosopherCounter).setValue(philosopher.getAmountEaten());
				++philosopherCounter;
			}
		}
		else{
			for(Philosopher philosopher : diningApp.getPhilosophers()){
				progressBars.get(philosopherCounter).setValue(philosopher.getAmountEaten());
				++philosopherCounter;

			}
		}

		setPhilosopherColour();
		checkIfSnoozing();
	}

	private void checkIfSnoozing() {
		if(itemSelected ==0){
			for(PhilosopherDeadlock philosopher : diningDeadlock.getPhilosophers()){
				if(philosopher.isSnoozing()){
					putToSleep(philosopher);
				}else {
					wakeUp(philosopher);
				}
			}
		}else{
			for(Philosopher philosopher : diningApp.getPhilosophers()){
				if(philosopher.isSnoozing()){
					putToSleep(philosopher);
				}else {
					wakeUp(philosopher);
				}
			}
		}


	}

	private void wakeUp(Philosopher philosopher) {
		switch (philosopher.getName()) {
		case "Philosopher: 1":
			zzzList.get(0).setVisible(false);
			break;
		case "Philosopher: 2":
			zzzList.get(1).setVisible(false);
			break;
		case "Philosopher: 3":
			zzzList.get(2).setVisible(false);
			break;
		case "Philosopher: 4":
			zzzList.get(3).setVisible(false);
			break;
		case "Philosopher: 5":
			zzzList.get(4).setVisible(false);
			break;
		case "Philosopher: 6":
			zzzList.get(5).setVisible(false);
			break;
		default:
			break;
		}
	}
	private void wakeUp(PhilosopherDeadlock philosopher) {
		switch (philosopher.getName()) {
			case "Philosopher: 1":
				zzzList.get(0).setVisible(false);
				break;
			case "Philosopher: 2":
				zzzList.get(1).setVisible(false);
				break;
			case "Philosopher: 3":
				zzzList.get(2).setVisible(false);
				break;
			case "Philosopher: 4":
				zzzList.get(3).setVisible(false);
				break;
			case "Philosopher: 5":
				zzzList.get(4).setVisible(false);
				break;
			case "Philosopher: 6":
				zzzList.get(5).setVisible(false);
				break;
			default:
				break;
		}
	}

	private void putToSleep(Philosopher philosopher) {
		switch (philosopher.getName()) {
		case "Philosopher: 1":
			zzzList.get(0).setVisible(true);
			break;
		case "Philosopher: 2":
			zzzList.get(1).setVisible(true);
			break;
		case "Philosopher: 3":
			zzzList.get(2).setVisible(true);
			break;
		case "Philosopher: 4":
			zzzList.get(3).setVisible(true);
			break;
		case "Philosopher: 5":
			zzzList.get(4).setVisible(true);
			break;
		case "Philosopher: 6":
			zzzList.get(5).setVisible(true);
			break;

		default:
			break;
		}
	}
	private void putToSleep(PhilosopherDeadlock philosopher) {
		switch (philosopher.getName()) {
			case "Philosopher: 1":
				zzzList.get(0).setVisible(true);
				break;
			case "Philosopher: 2":
				zzzList.get(1).setVisible(true);
				break;
			case "Philosopher: 3":
				zzzList.get(2).setVisible(true);
				break;
			case "Philosopher: 4":
				zzzList.get(3).setVisible(true);
				break;
			case "Philosopher: 5":
				zzzList.get(4).setVisible(true);
				break;
			case "Philosopher: 6":
				zzzList.get(5).setVisible(true);
				break;

			default:
				break;
		}
	}

	private void setPhilosopherColour() {
		if(itemSelected == 0){
			for(PhilosopherDeadlock philosopher : diningDeadlock.getPhilosophers()){
				if(philosopher.isEating()){
					changeColourToGreen(philosopher);
				}else {
					changeColourToBlack(philosopher);
				}
			}
		}else{
			for(Philosopher philosopher : diningApp.getPhilosophers()){
				if(philosopher.isEating()){
					changeColourToGreen(philosopher);
				}else {
					changeColourToBlack(philosopher);
				}
			}
		}

	}

	private void changeColourToBlack(Philosopher philosopher) {
		switch (philosopher.getName()) {
		case "Philosopher: 1":
			philosopherLabelList.get(0).setBackground(Color.BLACK);
			break;
		case "Philosopher: 2":
			philosopherLabelList.get(1).setBackground(Color.BLACK);
			break;
		case "Philosopher: 3":
			philosopherLabelList.get(2).setBackground(Color.BLACK);
			break;
		case "Philosopher: 4":
			philosopherLabelList.get(3).setBackground(Color.BLACK);
			break;
		case "Philosopher: 5":
			philosopherLabelList.get(4).setBackground(Color.BLACK);
			break;
		case "Philosopher: 6":
			philosopherLabelList.get(5).setBackground(Color.BLACK);
			break;
		default:
			break;
		}
	}

	private void changeColourToGreen(Philosopher philosopher) {
		switch (philosopher.getName()) {
			case "Philosopher: 1":
				philosopherLabelList.get(0).setBackground(Color.GREEN);
				forkLabelList.get(0).setText("fork 1 (p1)");
				forkLabelList.get(5).setText("fork 6 (p1)");
				break;
			case "Philosopher: 2":
				philosopherLabelList.get(1).setBackground(Color.GREEN);
				forkLabelList.get(0).setText("fork 1 (p2)");
				forkLabelList.get(1).setText("fork 2 (p2)");
				break;
			case "Philosopher: 3":
				philosopherLabelList.get(2).setBackground(Color.GREEN);
				forkLabelList.get(1).setText("fork 2 (p3)");
				forkLabelList.get(2).setText("fork 3 (p3)");
				break;
			case "Philosopher: 4":
				philosopherLabelList.get(3).setBackground(Color.GREEN);
				forkLabelList.get(2).setText("fork 3 (p4)");
				forkLabelList.get(3).setText("fork 4 (p4)");
				break;
			case "Philosopher: 5":
				philosopherLabelList.get(4).setBackground(Color.GREEN);
				forkLabelList.get(3).setText("fork 4 (p5)");
				forkLabelList.get(4).setText("fork 5 (p5)");
				break;
			case "Philosopher: 6":
				philosopherLabelList.get(5).setBackground(Color.GREEN);
				forkLabelList.get(4).setText("fork 5 (p6)");
				forkLabelList.get(5).setText("fork 6 (p6)");
				break;
			default:
				break;
		}
	}
	private void changeColourToBlack(PhilosopherDeadlock philosopher) {
		switch (philosopher.getName()) {
			case "Philosopher: 1":
				philosopherLabelList.get(0).setBackground(Color.BLACK);
				break;
			case "Philosopher: 2":
				philosopherLabelList.get(1).setBackground(Color.BLACK);
				break;
			case "Philosopher: 3":
				philosopherLabelList.get(2).setBackground(Color.BLACK);
				break;
			case "Philosopher: 4":
				philosopherLabelList.get(3).setBackground(Color.BLACK);
				break;
			case "Philosopher: 5":
				philosopherLabelList.get(4).setBackground(Color.BLACK);
				break;
			case "Philosopher: 6":
				philosopherLabelList.get(5).setBackground(Color.BLACK);
				break;
			default:
				break;
		}
	}

	private void changeColourToGreen(PhilosopherDeadlock philosopher) {
		switch (philosopher.getName()) {
			case "Philosopher: 1":
				philosopherLabelList.get(0).setBackground(Color.GREEN);
//				forkLabelList.get(0).setText("fork 1 (p1)");
//				forkLabelList.get(5).setText("fork 6 (p1)");
				break;
			case "Philosopher: 2":
				philosopherLabelList.get(1).setBackground(Color.GREEN);
//				forkLabelList.get(0).setText("fork 1 (p2)");
//				forkLabelList.get(1).setText("fork 1 (p2)");
				break;
			case "Philosopher: 3":
				philosopherLabelList.get(2).setBackground(Color.GREEN);
//				forkLabelList.get(1).setText("fork 1 (p3)");
//				forkLabelList.get(2).setText("fork 1 (p3)");
				break;
			case "Philosopher: 4":
				philosopherLabelList.get(3).setBackground(Color.GREEN);
//				forkLabelList.get(2).setText("fork 1 (p4)");
//				forkLabelList.get(3).setText("fork 1 (p4)");
				break;
			case "Philosopher: 5":
				philosopherLabelList.get(4).setBackground(Color.GREEN);
//				forkLabelList.get(3).setText("fork 1 (p5)");
//				forkLabelList.get(4).setText("fork 1 (p5)");
				break;
			case "Philosopher: 6":
				philosopherLabelList.get(5).setBackground(Color.GREEN);
//				forkLabelList.get(4).setText("fork 1 (p6)");
//				forkLabelList.get(5).setText("fork 1 (p6)");
				break;
			default:
				break;
		}
	}
}
