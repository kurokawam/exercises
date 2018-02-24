package kurokawa;

public class Kurokawa03 {
	public static void main(String[] args) {
		String a = args[0] ;
		int b = Integer.parseInt(a);
		boolean isSosuu = true;

		for (int i = 2; i < b; i++) {

			if (b % i == 0) {
				isSosuu = false;
				break;
			}
		}
		

		if (isSosuu == true) {
			System.out.println(b+"は素数である");
		}else{
			System.out.println(b +"は素数ではない");
		}
	}
}
