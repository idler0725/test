package study;

/**
 * @author idler0725
 *
 */

//�v�Z�N���X
class Calculation{
	int[] sequence;		//���ƂȂ鐔��
	//�R���X�g���N�^
	Calculation(int[] vals){
		int i = 0;		//���[�v�p�ϐ�
		sequence = new int[vals.length];
		for(int val: vals){
			sequence[i++] = val;
		}
	}
}
//���Z�N���X
class Sum extends Calculation{
	int sum = 0;		//�a
	//�R���X�g���N�^
	Sum(int...vals){
		super(vals);
	}
	//�a��\��
	public void viewSum(){
		for(int val: sequence){
			System.out.print(val + "+");
			sum += val;
		}
		System.out.println("\b=" + sum);
	}
}
//���Z�N���X
class Reminder extends Calculation{
	int reminder;		//��
	//�R���X�g���N�^
	Reminder(int...vals){
		super(vals);
		reminder = vals[0] * 2;
	}
	//����\��
	public void viewReminder(){
		for(int val: sequence){
			System.out.print(val + "-");
			reminder -= val;
		}
		System.out.println("\b=" + reminder);
	}
}
//���C���N���X
public class test1 {
	public static void main(String[] args) {
		//������
		Sum sum = new Sum(1, 4, 6, 12);
		Reminder reminder = new Reminder(5, 2, 9);
		//�a��\��
		sum.viewSum();
		//����\��
		reminder.viewReminder();
	}
}
