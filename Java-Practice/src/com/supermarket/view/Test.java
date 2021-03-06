package com.supermarket.view;

public class Test {
	enum Emenu{
		登陆,
		退出,
		抽奖,
		主菜单,
		欢迎,
		管理商品,
		浏览商品,
		错误, 
		添加商品, 
		查询商品,
		
	}
	static Emenu infoNumber;
	static boolean isQuit = true;
	public static void main(String[] args) {
		LoginMenu firstpage = new LoginMenu();
		infoNumber = firstpage.print();
		
		while(isNotQuit()) {
			Menu m = createChildMenu();
			infoNumber = m.print();	
		}
	}
	
	static boolean isNotQuit() {
		return isQuit;
	}
	
	static Menu createChildMenu(){
		switch  (infoNumber) {
		case 主菜单:
			Menu mainMenu = (Menu) new MainMenu();
			return mainMenu;
		case 欢迎:
			Menu welcomeMenu = (Menu) new WelcomeMenu();
			return welcomeMenu;
		case 登陆:
			Menu loginMenu = (Menu) new LoginMenu();
			return loginMenu;
		case 退出:
			Menu quitMenu = (Menu) new QuitMenu();
			return quitMenu;
		case 抽奖:
			Menu awardMenu = (Menu) new AwardMenu();
			return awardMenu;
		case 管理商品:
			Menu managerMenu = (Menu) new ManagerMenu();
			return managerMenu;
		case 添加商品:
			Menu addGoodsMenu = (Menu) new AddGoodsMenu();
			return addGoodsMenu;
		case 浏览商品:
			Menu lookMenu = (Menu) new lookMenu();
			return lookMenu;
		case 查询商品:
			Menu selectMenu = (Menu) new SelectMenu();
			return selectMenu;
		case 错误:
			Menu ErrorMenu = (Menu) new ErrorMenu();
			return ErrorMenu;
		default:
			Menu defaultMenu = (Menu) new MainMenu();
			return defaultMenu;
		
		}
	}
}
