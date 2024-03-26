package HW05;



import java.util.Scanner;



public class HW05 {



	public static void main(String[] args) {

		var card1=new StoreValueCard("ntunhs001",500,0);

		int loop = 0;

		while(loop==0) {

		loop=0;

		System.out.print("�п�J�H�U���O�G1. �x�� 2. ���� 3.�I�����Q 4. �d�ݩ��� 0. ���}�t��:");

		var scanner =new Scanner(System.in);

		var menu=scanner.nextInt();

		if(menu==0) {

			System.out.println(" ���}�t��");

			loop=1;

		}

		else if(menu==1) {

			

			System.out.print("�п�J�x�Ȫ��B:");

			int money=scanner.nextInt();

			card1.addValue(money);

			card1.printDetails();

			

		}

		else if(menu==2) {

			

			System.out.print("�п�J���ڪ��B:");

			int money=scanner.nextInt();

			card1.charge(money);

			card1.printDetails();

			

		}

		else if(menu==3) {

			

			System.out.print("�п�J�I�����Q:");

			int money=scanner.nextInt();

			card1.exchangeBonus(money);

			card1.printDetails();

			

		}

		else if(menu==4) {

			

			

			card1.printDetails();

		}

		else{

			System.out.print("���~���O");

		}

		

		

		

		

		

		

		



		

		

		

	}



}



	}

class StoreValueCard {

	static int totalCardNum=0;

	

	public int meun;

	

	private String cardld;

	private int balance;

	private int bonus;

	StoreValueCard(String cardld ,int balance,int bonus){

			this.cardld=cardld;

			this.balance=balance;

			this.bonus=bonus;

			totalCardNum++;

		

	}

	  void addValue(int money) {

		if(money>0) {

			this.balance +=money;

			if(money>=1000) {

				this.bonus++;

				

			}

		}

		else {

			System.out.println("�нT�{�x�Ȫ��B���ର�t��");

		}

		

	}

	void charge(int money) {

		if(money >0) {

			if(money <this.balance) {

				this.balance -=money;

				

			}

			else {

				System.out.println("�l�B�����а���");

			}

			

		}

		else {

			System.out.println("�нT�{�x�Ȫ��B���ର�t��");

		}

	}

	void exchangeBonus (int bonus) {

		if(bonus>0) {

			if(bonus <this.bonus) {

				this.bonus-=bonus;

			}

			else {

				System.out.println("���Q�����L�k�I��");

			}

		}

		else {

			System.out.println("�нT�{���Q���ର�t��");

		}

	}

	void printDetails() {

		System.out.printf("(%s, %d, %d)%n",this.cardld, this.balance, this.bonus);

	}

	int getBalance(){

		return balance;

	}

	int getBonus(){

		return bonus;

	}

	String getNumber(){

		return cardld;

	}

}

