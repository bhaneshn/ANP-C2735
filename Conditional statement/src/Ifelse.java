
public class Ifelse  {
		void checkCondition(int num1,int num2, int num3) {
			if(num1>num2) {
				if(num1>num3)
					System.out.println("num1 is the greatest");
			}	
			else {
				if(num2>num3)
					System.out.println("num2 is the greatest");
				else
					System.out.println("num3 is the greatest");			
			}		
		}
		public static void main(String[] args) {
			Ifelse csdObj=new Ifelse();
			csdObj.checkCondition(1, 5, 3);
		}

	}

