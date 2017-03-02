package ui;

import service.InputService;

public class AdminUi {
	public static void adminLogin(){
		System.out.println("*****************");
		System.out.println("\t 0 返回");
		System.out.println("\t 1 商品管理");
		System.out.println("\t 2 收银员管理");
		System.out.println("\t 3 销售管理");
		System.out.println("*****************");
		while(true){
			String s = InputService.inputString();
		}
	}
}
