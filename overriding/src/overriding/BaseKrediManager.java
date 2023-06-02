package overriding;

public class BaseKrediManager {
	
	public double hesapla(double tutar) {
		return tutar*1.18;
	}
	
//	public final double hesapla(double tutar) {//final ile override engellemiş oluruz
//		return tutar*1.18;
//	}

}
