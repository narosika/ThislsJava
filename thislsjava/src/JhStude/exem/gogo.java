package JhStude.exem;

public class gogo {

	public static void main(String[] args) {
		//김정호 구구단
		int result = 0;
		
		for(int i=2 ; i<10 ; i++)
		{
			System.out.println("----"+i+"단 -----");
			for(int j=1 ; j<10 ; j++)
			{
				result = i*j;
				System.out.println(i+"*"+j+" = "+result);
			}
		}
	}
}
