package kurokawa;

import java.math.BigDecimal;

public class Heihoukon {
	public static void main(String[] args) {
		BigDecimal yobidasi = new BigDecimal(args[0]);
		System.out.println(yobidasi);
		for(BigDecimal i =new BigDecimal(0);yobidasi.compareTo(i)>=0;i=i.add(BigDecimal.valueOf(0.1))) {
			if(yobidasi.compareTo(i.multiply(i))==0) {
				System.out.println(yobidasi + "の平方根は" + i);
				break;
			}else if(yobidasi.compareTo(i.multiply(i))<=0) {
				System.out.println(yobidasi + "の平方根は" + i.subtract(BigDecimal.valueOf(0.1)));
				break;
			}
		}

	}

}
