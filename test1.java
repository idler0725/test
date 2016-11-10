package study;

/**
 * @author idler0725
 *
 */

//CalculationClass
class Calculation{
	int[] sequence;		
	//Constructor
	Calculation(int[] vals){
		int i = 0;		
		sequence = new int[vals.length];
		for(int val: vals){
			sequence[i++] = val;
		}
	}
}
//SumClass
class Sum extends Calculation{
	int sum = 0;		
	//Constructor
	Sum(int...vals){
		super(vals);
	}
	//Disp Sum
	public void viewSum(){
		for(int val: sequence){
			System.out.print(val + "+");
			sum += val;
		}
		System.out.println("\b=" + sum);
	}
}
//ReminderClass
class Reminder extends Calculation{
	int reminder;		
	//Constructor
	Reminder(int...vals){
		super(vals);
		reminder = vals[0] * 2;
	}
	//Disp Reminder
	public void viewReminder(){
		for(int val: sequence){
			System.out.print(val + "-");
			reminder -= val;
		}
		System.out.println("\b=" + reminder);
	}
}
//MainClass
public class test1 {
	public static void main(String[] args) {
		//Init
		Sum sum = new Sum(1, 4, 6, 12);
		Reminder reminder = new Reminder(5, 2, 9);
		//Disp Sum
		sum.viewSum();
		//Disp Reminder
		reminder.viewReminder();
	}
}

//Add Exception Handling
/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
