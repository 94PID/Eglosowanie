import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.JOptionPane;

public class LogowanieController
{
	
	LogowanieModel theModel;
	LogowanieView theView;
	public LogowanieController(LogowanieModel theModel,LogowanieView theView)
	{
		this.theModel=theModel;
		this.theView=theView;
		
		this.theView.addZalogujListener(new ZalogujListener());
	}
	
	class ZalogujListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			String login,haslo;
			login=theView.getPesel();
			haslo=theView.getHaslo();
			
			try
			{
				if(theModel.checkLoginAndPassword(login, haslo))
				{
					JOptionPane.showMessageDialog(null, "Zalogowano pomyœlnie!");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "B³¹d logowania. Sprawdz czy podany PESEL i has³o siê zgadzaj¹","B³¹d logowania!",JOptionPane.ERROR_MESSAGE);;
				}
			} catch (HeadlessException e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (FileNotFoundException e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}
}

