package main;

import java.sql.SQLException;
import console.NoticeConsole;
import dao.MemberDao;


public class mainClass {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		NoticeConsole console = new NoticeConsole();
		
		EXIT:
		while(true) {
			int menu = console.inputNoticeMenu(); // 입력창 
			switch (menu) {
			case 1: //회원가입
				console.insertMenu();
				break;
			case 2: // 로그인
				console.inputLoginMenu();
				break;
			case 3: // 종료
				System.out.println("종료되었습니다. 안녕히가십시오.");
				break EXIT;
			default :
				System.out.println("<< 메뉴는 1~3사이 숫자만 입력 가능합니다.");
				break;
			}
		}

	}

}
