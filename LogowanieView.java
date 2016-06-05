import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;

public class LogowanieView
{

	public JFrame frmSystemElektronicznegoGosowania;
	private JTextField tPodajPesel;
	private JPasswordField passfHaslo;
	private JButton btnZaloguj;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					LogowanieView window = new LogowanieView();
					window.frmSystemElektronicznegoGosowania.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LogowanieView()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frmSystemElektronicznegoGosowania = new JFrame();
		frmSystemElektronicznegoGosowania.setBounds(100, 100, 450, 300);
		frmSystemElektronicznegoGosowania.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSystemElektronicznegoGosowania.getContentPane().setLayout(null);
		frmSystemElektronicznegoGosowania.setTitle("System elektronicznego g³osowania");
		
		JLabel lblPodajPesel = new JLabel("Podaj PESEL");
		lblPodajPesel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPodajPesel.setBounds(165, 85, 112, 30);
		frmSystemElektronicznegoGosowania.getContentPane().add(lblPodajPesel);
		
		tPodajPesel = new JTextField();
		tPodajPesel.setToolTipText("PESEL musi si\u0119 sk\u0142ada\u0107 z 11 cyfr");
		tPodajPesel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tPodajPesel.setBounds(283, 85, 141, 30);
		frmSystemElektronicznegoGosowania.getContentPane().add(tPodajPesel);
		tPodajPesel.setColumns(10);
		
		JLabel lblPodajHaso = new JLabel("Podaj has\u0142o");
		lblPodajHaso.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPodajHaso.setBounds(165, 126, 112, 30);
		frmSystemElektronicznegoGosowania.getContentPane().add(lblPodajHaso);
		
		passfHaslo = new JPasswordField();
		passfHaslo.setToolTipText("Je\u017Celi logujesz si\u0119 po raz pierwszy to has\u0142o zosta\u0142o wygenerowane automatycznie przez system i urz\u0105d Gminy powinien dostarczy\u0107 Ci je pod Tw\u00F3j adres. Je\u017Celi nie uzyska\u0142e\u015B swojego has\u0142a skontaktuj si\u0119 ze swoim urz\u0119dem Gminy.");
		passfHaslo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passfHaslo.setBounds(283, 126, 141, 30);
		frmSystemElektronicznegoGosowania.getContentPane().add(passfHaslo);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(LogowanieView.class.getResource("/zdj\u0119cia/e-wybory-ico300px.jpg")));
		lblLogo.setBounds(10, 51, 140, 140);
		frmSystemElektronicznegoGosowania.getContentPane().add(lblLogo);
		
		btnZaloguj = new JButton("Zaloguj");
		btnZaloguj.setBounds(216, 183, 131, 41);
		frmSystemElektronicznegoGosowania.getContentPane().add(btnZaloguj);
	}
	
	public String getHaslo()
	{
		return String.valueOf(passfHaslo.getPassword());
	}
	public String getPesel()
	{

		return tPodajPesel.getText();
	}
	
	void addZalogujListener(ActionListener listenForZalogujButton)
	{
		btnZaloguj.addActionListener(listenForZalogujButton);
	}
}
