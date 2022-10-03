
public class P56 {

	public void sam() {

		int y[] = {4, 2, 8};

		for (int x=2; x<1+3*2-4; x++){

		System.out.print(x+" ");// x=2..

		for (int j:y) {

		j=j*x-4;// here we put ... y = j = 4,2,8  ..

		System.out.print(j+" ");//  j = 4 0 12

		}

		}

		}

		public static void main(String[] args) {

		P56 r = new P56();

		r.sam();

		
		}
}
