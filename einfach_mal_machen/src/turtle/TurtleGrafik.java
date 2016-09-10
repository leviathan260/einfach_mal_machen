package turtle;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TurtleGrafik extends JFrame {

	private JPanel contentPane;
	private Turtle t;

	public TurtleGrafik() {
		super("Turtle-Grafik");
		createGUI();
	}

	private void createGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 905, 698);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnAufg1 = new JButton("Aufg1");
		btnAufg1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aufg1();
			}
		});
		btnAufg1.setBounds(12, 12, 67, 25);
		contentPane.add(btnAufg1);

		JButton btnAufg2 = new JButton("Aufg2");
		btnAufg2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aufg2();
			}
		});
		btnAufg2.setBounds(91, 12, 67, 25);
		contentPane.add(btnAufg2);

		JButton btnAufg3 = new JButton("Aufg3");
		btnAufg3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aufg3();
			}
		});
		btnAufg3.setBounds(170, 12, 67, 25);
		contentPane.add(btnAufg3);

		JButton btnAufg4 = new JButton("Aufg4");
		btnAufg4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aufg4();
			}
		});
		btnAufg4.setBounds(249, 12, 67, 25);
		contentPane.add(btnAufg4);

		JButton btnAufg5 = new JButton("Aufg5");
		btnAufg5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aufg5();
			}
		});
		btnAufg5.setBounds(328, 12, 67, 25);
		contentPane.add(btnAufg5);

		JButton btnAufg6 = new JButton("Aufg6");
		btnAufg6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aufg6();
			}
		});
		btnAufg6.setBounds(407, 12, 67, 25);
		contentPane.add(btnAufg6);

		JButton btnAufg7 = new JButton("Aufg7");
		btnAufg7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aufg7();
			}
		});
		btnAufg7.setBounds(486, 12, 67, 25);
		contentPane.add(btnAufg7);

		JButton btnAufg8 = new JButton("Aufg8");
		btnAufg8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aufg8();
			}
		});
		btnAufg8.setBounds(565, 12, 67, 25);
		contentPane.add(btnAufg8);

		JButton btnAufg9 = new JButton("Aufg9");
		btnAufg9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aufg9();
			}
		});
		btnAufg9.setBounds(644, 12, 67, 25);
		contentPane.add(btnAufg9);

		JButton btnAufg10 = new JButton("Aufg10");
		btnAufg10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aufg10();
			}
		});
		btnAufg10.setBounds(723, 12, 74, 25);
		contentPane.add(btnAufg10);

		JButton btnAufg11 = new JButton("Aufg11");
		btnAufg11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aufg11();
			}
		});
		btnAufg11.setBounds(809, 12, 74, 25);
		contentPane.add(btnAufg11);

		t = new Turtle(350, 300);
		t.setBounds(12, 48, 769, 609);
		contentPane.add(t);

		JButton btnLoeschen = new JButton("löschen");
		btnLoeschen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.loeschen();
				t.neuStart(350, 300);
			}
		});
		btnLoeschen.setBounds(793, 49, 98, 609);
		contentPane.add(btnLoeschen);
	}

	private void aufg1() {
		// Aufgabe 1
		t.vor(50); // 50 Pixel vorwärts gehen
		t.drehen(-120); // um 90 Grad im Uhrzeigersinn drehen
		t.vor(100);
		t.drehen(-120);
		t.vor(50);
	}

	private void drehen(int i) {
		// TODO Auto-generated method stub

	}

	private void aufg2() {
		// Aufgabe 2
		int i = 0;
		while (i < 4) {
			t.vor(200);
			t.drehen(90);
			i = i + 1;
		}

	}

	private void aufg3() {
		// Aufgabe 3
		int i = 0;
		while (i < 6) {
			t.vor(100);
			t.drehen(60);
			i = i + 1;
		}
	}

	private void aufg4() {
		// Aufgabe 4
		int i = 0;
		while (i < 8) {
			t.vor(100);
			t.drehen(45);
			i = i + 1;
		}
	}

	private void aufg5() {
		// Aufgabe 5
		int i = 0;
		while (i < 15) {
			t.vor(10);
			t.drehen(-90);
			t.vor(10);
			t.drehen(90);
			i = i + 1;
		}
		t.drehen(-90);
		int k = 0;
		while (k < 15) {
			t.vor(10);
			t.drehen(-90);
			t.vor(10);
			t.drehen(90);
			k = k + 1;
		}
	}

	private void aufg6() {
		// Aufgabe 6
		double laenge = 15;
		for (int i = 0; i < 64; i++) {
			t.vor(laenge);
			t.drehen(-90);
			laenge = laenge + laenge / 15;
		}
	}

	private void quadrat(double seitenlaenge){
		t.vor(seitenlaenge);
		t.drehen(90);
		t.vor(seitenlaenge);
		t.drehen(90);
		t.vor(seitenlaenge);
		t.drehen(90);
		t.vor(seitenlaenge);
		t.drehen(90);
	}
	
	private void aufg7() {
		// Aufgabe 7
		double seite = 4.0; 
		for (int i = 0; i < 22; i++)  {
			quadrat(seite);
			seite = seite + seite/4;
			
		}
	}
	private void sechseck(double seitenlaenge) {
		for (int i = 0; i < 6; i++) {
			t.vor(seitenlaenge);
			t.drehen(360/6);
		}
	
	}
	private void aufg8() {
		// Aufgabe 8
		double seite = 100;
		for (int i= 0; i < 18; i++){
			sechseck(seite);
			t.drehen(360/18);
		}
	
	}

	private void dreieck(){
		for (int i = 0; i < 3; i++) {
			t.vor(100);
			t.drehen(360/3);
		}
	}
	private void aufg9() {
		// Aufgabe 9
		for (int i = 0; i < 6; i++) {
			dreieck();
			t.drehen(360/6);
		}
	}
	private void drei(){
		for (int i = 0; i < 3; i++) {
			t.vor(100);
			t.drehen(360/3);
		
		}
		}
	private void aufg10() {
		// Aufgabe 10
		t.drehen(60);
		for (int i = 0; i < 4; i++){
		drei();
		t.drehen(360/4);
		}
	}
	private void flei(){
		for (int i = 0; i < 3; i++) {
            t.vor(100);
			t.drehen(-360/3);
			
		}
	}
	private void aufg11() {
		// Aufgabe 11
		double seite = 100;
		sechseck(seite);
		for (int i = 0; i < 6; i++) {
			t.drehen(-60);
			t.vor(100);
			t.drehen(-240);
			t.vor(100);
	    }
	}
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TurtleGrafik frame = new TurtleGrafik();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
