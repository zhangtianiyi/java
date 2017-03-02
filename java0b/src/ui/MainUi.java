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
		System.out.println("\t 0  �˳�");
		System.out.println("\t 1  ����Ա��¼");
		System.out.println("\t 2  ����Ա��¼");
		System.out.println("************************");
		while(true){
			String s = InputService.inputString();
			String reg = "[0-2]";
			if(s.matches(reg)){
				int i = Integer.parseInt(s);
				switch(i){
					case 0:
						System.out.println("�����˳�ϵͳ");
						System.exit(1);
						break;
					case 1:
						//����Ա��¼
						AdminUi.adminLogin();
						break;
					case 2:
						CashierUi.cashierLogin();
						//����Ա��¼
						break;
					default:
						break;
				}
			}
			System.out.println("����������������������");
		}
	}
}
