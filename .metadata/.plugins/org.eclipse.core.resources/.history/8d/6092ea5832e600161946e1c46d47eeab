package vo;
//--제약조건--
//1. 팁은 반드시 퍼센트 단위로 입력받아야 한다. 0.15가 아닌 15로 입력받기
//2. 센트단위로 반올림해야 한다.





//--TipCalculator pseudo code--

//TipCalculator
//	Initialize billAmount to 0
//	Initialize tip to 0
//	Initialize tipRate to 0
//	Initialize total to 0
//	
//	Prompt for billAmount with "What is the bill amount?"
//	Prompt for tipRate with "What is the tip rate?"
//	
//	convert billAmount to a number
//	convert tipRate to a number
//	
//	tip = billAount * (tipRate /100)
//	round tip up to nearest cent
//	total = billAmount + tip
//	
//	Display "Tip: $" + tip
//	Display "Total: $" + total
//End

public class TipcalculatorVo {	
	private double billAmount;
	private int tipRate;
	private double convertedTipRate;
	private double tipAmount;
	
	public TipcalculatorVo(){}
	
	public TipcalculatorVo(double billAmount, int tipRate) {
		this.billAmount = billAmount;
		this.tipRate = tipRate;
	}

	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

	public int getTipRate() {
		return tipRate;
	}

	public void setTipRate(int tipRate) {
		this.tipRate = tipRate;
	}
	
	public void setConvertedTipRate(int tipRate){
		this.convertedTipRate = ((double)tipRate)/100;
	}
	
	public double getConvertedTipRate(){
		return convertedTipRate;
	}
	
}
