package currency_conversion;
import java.util.*;
public class currency_conversion {

	public static void main(String[] args) {
		
		double inr,usd;
		double euro,yen;
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter dollars to convert into Rupees:");
		usd=in.nextInt();
		inr=usd*67;
		System.out.println(usd+" dollar is equal to "+inr+" INR");
		
		System.out.println("Enter Rupee to convert into Dollars:");
		inr=in.nextInt();
		usd=inr/67;
		System.out.println(inr+" INR is equal to "+usd+" USD");
		
		System.out.println("Enter euro to convert into Rupees:");
		euro=in.nextInt();
		inr=euro*79.50;
		System.out.println(euro+" EURO is equal to "+inr+" INR");
		
		System.out.println("Enter Rupees to convert into Euro:");
		inr=in.nextInt();
		euro=(inr/79.50);
		System.out.println(inr +" INR is equal to Euro="+euro+" EURO");
		
		System.out.println("Enter yen to convert into Rupees:");
		yen=in.nextInt();
		inr=yen*0.61;
		System.out.println(yen +" YEN is equal to "+inr+" INR");
		
		System.out.println("Enter Rupees to convert into Yen:");
		inr=in.nextInt();
		yen=(inr/0.61);
		System.out.println(inr +" INR is equal to "+yen+" YEN");

	}

}
