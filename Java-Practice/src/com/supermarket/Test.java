package com.supermarket;


public class Test {
	enum Emenu{
		��½,
		�˳�,
		�齱,
		���˵�,
		��ӭ,
		������Ʒ,
		�����Ʒ,
		����, 
		������Ʒ, 
		��ѯ��Ʒ,
		
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
		case ���˵�:
			Menu mainMenu = (Menu) new MainMenu();
			return mainMenu;
		case ��ӭ:
			Menu welcomeMenu = (Menu) new WelcomeMenu();
			return welcomeMenu;
		case ��½:
			Menu loginMenu = (Menu) new LoginMenu();
			return loginMenu;
		case �˳�:
			Menu quitMenu = (Menu) new QuitMenu();
			return quitMenu;
		case �齱:
			Menu awardMenu = (Menu) new AwardMenu();
			return awardMenu;
		case ������Ʒ:
			Menu managerMenu = (Menu) new ManagerMenu();
			return managerMenu;
		case ������Ʒ:
			Menu addGoodsMenu = (Menu) new AddGoodsMenu();
			return addGoodsMenu;
		case �����Ʒ:
			Menu lookMenu = (Menu) new lookMenu();
			return lookMenu;
		case ��ѯ��Ʒ:
			Menu selectMenu = (Menu) new SelectMenu();
			return selectMenu;
		case ����:
			Menu ErrorMenu = (Menu) new ErrorMenu();
			return ErrorMenu;
		default:
			Menu defaultMenu = (Menu) new MainMenu();
			return defaultMenu;
		
		}
	}
}