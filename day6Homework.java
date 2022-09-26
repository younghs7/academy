package addtionalStudy.eclipse;

public class day6Homework {

	public static void main(String[] args) {
		
		
		int theNumerOfStar = 0;
		int theNumerOfVacuum = 0;
		
		for(int i=0; i<10; i++)
		{	
		theNumerOfStar = theNumerOfStar + 1;
		theNumerOfVacuum = 10 - theNumerOfStar;
			
			for(int j=0; j < theNumerOfVacuum; j++)
			{
			System.out.print(" ");
			}
		
		
			for(int k = 0; k < theNumerOfStar; k++)
			{
			System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
