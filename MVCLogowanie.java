import java.io.FileNotFoundException;

public class MVCLogowanie
{

	public static void main(String[] args) throws FileNotFoundException
	{
		LogowanieModel theModel=new LogowanieModel();
		LogowanieView theView=new LogowanieView();
		LogowanieController theController=new LogowanieController(theModel, theView);
		
		theView.frmSystemElektronicznegoGosowania.setVisible(true);
	}

}
