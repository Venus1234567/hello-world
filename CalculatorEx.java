import java.util.Scanner;

import org.w3c.dom.html.HTMLDivElement;

public class CalculatorEx {
	 static boolean flag ;//�ݺ��� ó���� ����
	 int sign;//�������� ������ ��ȣ1) ����...
	 int [] number;//������ ���� ����� �迭
	 int numberCount;//�Է��� ���� ����
	public static void main(String[] args) {
		//���������� ��� ���α׷� �����ϴ� �κ�
	 CalculatorEx cal =	new CalculatorEx();
	 System.out.println(cal + "��������");
	 //�ݺ��� ���� �� 1,2,3�̸� �� 4�̸� ����
	 flag = true;
	 while(flag) {
     int menuNumber = cal.MenuScreen();
	 //System.out.println(menuNumber + //"�޸� ��ȣ �ӽ� ����ϴ� ��");
	 //menuNumber�� 1�̸� numberInput() ȣ�� 2�̸� oper()ȣ�� 3�̸� cal()ȣ�� 4�̸� exit()ȣ��
	 if(menuNumber == 1) {
		 cal.numberInput();
	 }else if(menuNumber == 2) {
		 cal.operationInput();
	 }else if(menuNumber == 3) {
		 cal.calcuResult();
	 }else if (menuNumber == 4) {
		 cal.exit();
	 }else {
		 System.out.println("��ȣ�� Ʋ�Ƚ��ϴ�.");
	 }//end if
	}//end while
  }//end main
	//ù��° ȭ�� ������ �޼ҵ�
	public int MenuScreen() {
		System.out.println("======���� ������Ʈ=======");
		System.out.println("������ : Venus");
		System.out.println("������ : 2022.04.01");
		System.out.println("���α׷��� : Cal.Ver.1.0");
		System.out.println("=======================");
		System.out.println("1. ����� ������ ����");
		System.out.println("2. ������ ����");
		System.out.println("1)���� 2)���� 3)���� 4)������");
		System.out.println("3. ���� ��");
		System.out.println("4. ���α׷� �����ϱ�");
		System.out.println("=======================");
		System.out.print("��ȣ�� ������?");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		System.out.println("-------------------------");
		return choice;
	}
	//1���� ������ ������ ȭ�� ����� ���ڸ� �Է��ϼ���
	public void numberInput() {
		System.out.println("����� ������ ������ �Է��ϼ���?--->");
		Scanner scanner = new Scanner(System.in);//Ű����� �Է¹޴� Ŭ����
	    numberCount = scanner.nextInt();
		int i = 0;
		 number = new int[5];//�迭
		while(i < numberCount) { //0 < 3 �� 1<3 �� 2<3 
  			//���̸� �̰��� �����Ѵ�.
			System.out.println("���ڴ�? ");
			number[i] = scanner.nextInt(); //10
			i=i+1; //1
			}
			/*while(���ǹ�){
				���̸� �����ϴ� �κ�
			/}�����̸� �ݺ����� �ʰ� �ݺ����� �ڷ� �� */
	}
	//2���� ������ ������ ȭ�� ���������� ���� ȭ��
	public void operationInput() {
		System.out.println("---- ������ ������ ������ ----");
		System.out.println("1)���� 2)���� 3)���� 4)������");
		System.out.println("������ ������ ---->");
		Scanner scanner = new Scanner(System.in);
		 sign = scanner.nextInt();
		 //���� sign �������� �ڷ�� ���� �Լ��ӿ����� �־�� �ұ�?
		 //�ƴϸ� �ٸ� �Լ������� ����ұ�?
		 //1)���������� ����Ѵ�. 2)�Լ����� ���� �ְ� �޴´�.
		 
	}
	//3���� ������ ������ ȭ�� ���� ����� ������ ȭ��
	public void calcuResult() {
		//10 20 30 1 
		System.out.println("----���� ���----");
		//�ݺ��� �ȿ� + - * / �Ǵ�
		//�ݺ����� ������ numberCounter �����ȿ� ����ִ� ���ڿ� ����.
		int result = 0;//����� ���� ���� ����
		double divresult = 0.0;//�������� ����� ���� ����
		
		for(int i = 0; i < numberCount; i++) {
			 //1 <3 2<3 3<3 ����
			//���̸� ������ 
			if(sign == 1) {
				System.out.print(number[i] + " "); // 10 + 20 + 30
				if(i+1 != numberCount) { //0+! != 3 1+1 !=3 2+1 !=3
					// 0+1 != 3
					System.out.println("+");
				}
				result = result + number[i];// 0+10+20+30
						
			}else if(sign ==2){
				if(i==0) {
					result = number[i];//10
				}else {
					result = result - number[i];
				}
				System.out.println(number[i] + " ");//10 - 20 = -10
				if(i+1 !=numberCount) {
					System.out.println(" - ");
				}
			  result = result - number[i]; //0-10-20 = -30
			}else if(sign == 3) { 
				if(i==0) {
					result = number[i];
				}else {result = result * number[i];
				
				}
				System.out.println(number[i] + " ");
				if(i + 1 != numberCount) {
					System.out.println(" * ");
				}
			}else if(sign == 4) {
				if(i==0) {
				 divresult = number[i];
				}else { divresult = divresult / number[i];
		
				}
				System.out.println(number[i] + " ");
				if(i + 1 != numberCount) {
					System.out.println(" / ");
				}
	         }//end for
		}
		
		
		//for �ݺ��� ����
		/* for(�ʱⰪ ; ���ǽ� ; ������) {
		 *    ���ǽ��� ���̸� ������ ����
		 *    }
		 *    ó������ �ʱⰪ ���� -> ���ǽ� ������ ���̸� ���๮�� ���� --> ������
		 *    					-> 
		 *    
		 */
		if( sign == 4) {
			System.out.printf("%s %.2f" , "=", divresult);
		}else {
			System.out.println(" = " + result);
		}
		
	}
	public  void exit() {
		System.out.println("���� ���α׷��� �����մϴ�");
		System.out.println("�����մϴ�");
	 flag = false;
		
	}
}
