package study;

/**
 * @author idler0725
 *
 */

//CalculationClass
class Calculation{
	int[] sequence;		//元となる数列
	//コンストラクタ
	Calculation(int[] vals){
		int i = 0;		//ループ用変数
		sequence = new int[vals.length];
		for(int val: vals){
			sequence[i++] = val;
		}
	}
}
//SumClass
class Sum extends Calculation{
	int sum = 0;		//和
	//コンストラクタ
	Sum(int...vals){
		super(vals);
	}
	//和を表示
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
	int reminder;		//差
	//コンストラクタ
	Reminder(int...vals){
		super(vals);
		reminder = vals[0] * 2;
	}
	//差を表示
	public void viewReminder(){
		for(int val: sequence){
			System.out.print(val + "-");
			reminder -= val;
		}
		System.out.println("\b=" + reminder);
	}
}
//メインクラス
public class test1 {
	public static void main(String[] args) {
		//初期化
		Sum sum = new Sum(1, 4, 6, 12);
		Reminder reminder = new Reminder(5, 2, 9);
		//和を表示
		sum.viewSum();
		//差を表示
		reminder.viewReminder();
	}
}
