package calculator;

import vo.TipcalculatorVo;
//
public class Calculator {
	private double tipAmount;
	private	double totalAmount;
	
	public double getTipForCustomer(double billAmount, int tipRate){
		TipcalculatorVo cal =  new TipcalculatorVo(billAmount, tipRate);
		cal.setBillAmount(billAmount);
		cal.setTipRate(tipRate); 
		tipAmount= cal.getBillAmount()*cal.getConvertedTipRate();
		
		return tipAmount;
	}
	
	public double getTotalAmount(double billAmount, int tipAmount){
		
		totalAmount = billAmount + tipAmount/100;
		return totalAmount;
	}
}
