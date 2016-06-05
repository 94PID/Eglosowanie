import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LogowanieModel
{
	File bazaDanych;
	public LogowanieModel() throws FileNotFoundException
	{
		bazaDanych=new File("src/BazaDanych/loginAndPassword.txt");
	}
	public boolean checkLoginAndPassword(String login,String haslo) throws FileNotFoundException
	{
		Scanner sk=new Scanner(bazaDanych);
		while(sk.hasNext())
		{
			String loginDB=sk.next();
			String hasloDB=sk.next();
			if(login.equals(loginDB) && haslo.equals(hasloDB) )
			{
				sk.close();
				return true;
			}
		}
		sk.close();
		return false;
	}
}
