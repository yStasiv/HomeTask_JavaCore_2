package Money;


public class Worker1 implements Salary {
	private String name;
	private int money;
	private double experience;
	private SalaryConst worker;

	public Worker1(String name, double experience, SalaryConst workerByMounth) {
		super();
		this.name = name;
		this.experience = experience;
		this.worker = workerByMounth;
	}

	@Override
	public void earnSalary1() {
		if (worker == SalaryConst.MOUNTH) {
			if (experience < 0.5) {
				money = 300;
				System.out.println(name + " earn " + money + "$ by " + worker);	} 
			else if (experience < 1) {
				money = 400;
				System.out.println(name + " earn " + money + "$ by " + worker);	} 
			else if (experience < 3) {
				money = 1000;
				System.out.println(name + " earn " + money + "$ by " + worker); }
			else if (experience < 5) {
				money = 2000;
				System.out.println(name + " earn " + money + "$ by " + worker);	}
			else if (experience >= 5) {
				money = 5000;
				System.out.println(name + " earn " + money + "$ by " + worker);	}
		} else if (worker == SalaryConst.HOUR) {
			if (experience < 0.5) {
				money = 2;
				System.out.println(name + " earn " + money + "$ by " + worker);
			} else if (experience < 1) {
				money = 4;
				System.out.println(name + " earn " + money + "$ by " + worker);
			} else if (experience < 3) {
				money = 8;
				System.out.println(name + " earn " + money + "$ by " + worker);
			} else if (experience < 5) {
				money = 10;
				System.out.println(name + " earn " + money + "$ by " + worker);
			} else if (experience >= 5) {
				money = 15;
				System.out.println(name + " earn " + money + "$ by " + worker);
			}

		}

	}

//	@Override
//	public void earnSalary2() {
//
//		if (experience < 0.5) {
//			money = 2;
//			System.out.println(name + " earn " + money + "$ by hour");
//		} else if (experience < 1) {
//			money = 4;
//			System.out.println(name + " earn " + money + "$ by hour");
//		} else if (experience < 3) {
//			money = 8;
//			System.out.println(name + " earn " + money + "$ by hour");
//		} else if (experience < 5) {
//			money = 10;
//			System.out.println(name + " earn " + money + "$ by hour");
//		} else if (experience > 5) {
//			money = 15;
//			System.out.println(name + " earn " + money + "$ by hour");
//		}
//	}

}
