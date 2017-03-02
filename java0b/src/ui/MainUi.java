package ui;

import service.InputService;

public class MainUi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mainUi();
	}
	
	public static void mainUi(){
		System.out.println("************************");
		System.out.println("\t 0  退出");
		System.out.println("\t 1  管理员登录");
		System.out.println("\t 2  收银员登录");
		System.out.println("************************");
		while(true){
			String s = InputService.inputString();
			String reg = "[0-2]";
			if(s.matches(reg)){
				int i = Integer.parseInt(s);
				switch(i){
					case 0:
						System.out.println("您已退出系统");
						System.exit(1);
						break;
					case 1:
						//管理员登录
						AdminUi.adminLogin();
						break;
					case 2:
						CashierUi.cashierLogin();
						//收银员登录
						break;
					default:
						break;
				}
			}
			System.out.println("您的输入有误，请重新输入");
		}
	}
}
