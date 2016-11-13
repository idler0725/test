package study;

//CalculationClass
class Calculation{
	int base, action;	
	//Constructor(No Argument)
	Calculation(){
		base = 0;
		action = 0;
	}
	//Constructor(Have Argument)
	Calculation(int input1, int input2){
		base = input1;
		action = input2;
	}
}
//AdditionClass
class Addition extends Calculation{
	//Constructor(No Argument)
	Addition(){
		super();
	}
	//Constructor(Have Argument)
	Addition(int input1, int input2){
		super(input1, input2);
	}
	//Display Sum
	public void displaySum(){
			System.out.println(base + "+" + action + "=" + (base + action));
	}
}
//SubtractionClass
class Subtraction extends Calculation{
	//Constructor(No Argument)
	Subtraction(){
		super();
	}
	//Constructor(Have Argument)
	Subtraction(int input1, int input2){
		super(input1, input2);
	}
	//Display Sum
	public void displayDifference(){
			System.out.println(base + "-" + action + "=" + (base - action));
	}
}
//DivisionClass
class Division extends Calculation{
	int quotient = 0;
	//Constructor(No Argument)
	Division(){
		super();
	}
	//Constructor(Have Argument)
	Division(int input1, int input2){
		super(input1, input2);
	}
	//Display Quotient
	public void displayQuotient(){
		//Exception Handle
		try{
			quotient = base / action;
		}catch(ArithmeticException e){
			//e.printStackTrace();
			System.err.println(e.getMessage());
		}finally{
			System.out.println(base + "/" + action + "=" + quotient);
		}
	}
}
//MainClass
public class test1 {
	public static void main(String[] args) {		
		//Addition
		Addition addition = new Addition(1, 4);
		addition.displaySum();
		
		//Subtraction
		Subtraction subtraction = new Subtraction(5, 2);
		subtraction.displayDifference();
		
		//Division
		Division division = new Division(4, 0);
		division.displayQuotient();
	}
}
