package kurokawa;

public class sosuu {
	public static void main(String[] args) {
		int isSosuu =Integer.valueOf(args[0]);
		for(int i= 2;i<isSosuu;i++) {
			if(isSosuu%i==0) {
				System.out.println(isSosuu+"は素数です");
			}
		}

	}
}
