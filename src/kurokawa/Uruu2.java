package kurokawa;

public class Uruu2 {
	public static void main(String[] args) {
		printUruu(Integer.valueOf(args[0]));
		printUruu(Integer.valueOf(args[1]));
		printUruu(Integer.valueOf(args[2]));
	}
	static void printUruu(int toshi) {
		if((toshi%4==0)&&(toshi%100!=0||toshi%400==0)) {
			System.out.println(toshi+"年はうるう年です");
		}else {
			System.out.println(toshi+"年はうるう年では");
		}
	}
}