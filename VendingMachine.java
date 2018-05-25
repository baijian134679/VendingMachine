
public class VendingMachine {
	int price = 80;
	int balance;
	int total = f();
	
	VendingMachine() //构造函数
	{
		balance = 0;
	}
	
	VendingMachine(int price) //重载overload
	{
		this();//this的调用没有参数的构造函数，只能使用一次且只能在第一句
		this.price = price;
	}
	
	int f()
	{
		return 10;
	}
	void setPrice(int price)
	{
		this.price = price;
	}
	
	void showPrompt()
	{
		System.out.println("Welcome");
	}

	void insertMomey(int amount)
	{
		balance = balance + amount;
		showBalance();
	}
	
	void showBalance()
	{
		System.out.println(balance);
	}
	
	void showPrice()
	{
		System.out.println(price);
	}
	
	void getFood()
	{
		if( balance >= price )
		{
			System.out.println("Here you are.");
			balance = balance - price;
			total = total + price;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VendingMachine vm = new VendingMachine();
		vm.showPrompt();
		vm.showBalance();
		vm.insertMomey(100);
		vm.getFood();
		vm.showBalance();
		VendingMachine vm1 = new VendingMachine(100);
		vm1.showPrice();
		vm1.showBalance();
	}

}
