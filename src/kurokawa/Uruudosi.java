package kurokawa;

public class Uruudosi {
	public static void main(String[] args) {
		String yobidasi = args[0];
		int tosi = Integer.valueOf(yobidasi);
		printUruu(tosi);

		int tosi2 = Integer.valueOf(args[1]);
		printUruu(tosi2);

		printUruu(Integer.valueOf(args[2]));
	}

	static void printUruu(int toshi) {
		if((toshi%4 == 0)&&(toshi%100!=0 || toshi%400==0)){
			System.out.println(toshi +"年はうるう年です");
		}else {
			System.out.println(toshi+"年はうるう年ではない");
		}
	}
}