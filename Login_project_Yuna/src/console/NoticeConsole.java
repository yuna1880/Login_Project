package console;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import dao.MemberDao;
import vo.MemberVo;

public class NoticeConsole {

	private MemberDao dao;
	
	public NoticeConsole() {
		dao = new MemberDao();
	}
	
	public int inputNoticeMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.print(" 1.회원가입 / 2.로그인 / 3. 종료 >> ");
		int menu = sc.nextInt();
		return menu;
	}
	
	public void insertMenu() throws ClassNotFoundException, SQLException{
		Scanner sc = new Scanner(System.in);
		System.out.println("회원가입을 위해 필요한 정보를 입력하세요.");
		System.out.print("id = ");
		String id = sc.nextLine();
		System.out.print("name = ");
		String name = sc.nextLine();
		System.out.print("password = ");
		String password = sc.nextLine();
		System.out.print("email = ");
		String email = sc.nextLine();
		
		//입력받은 데이터 member에 저장.
		MemberVo member = new MemberVo(id,name,password,email);
		
		dao.insert(member);
		
	}
	
	public void inputLoginMenu() throws ClassNotFoundException, SQLException {
			Scanner sc = new Scanner(System.in);
			
			boolean b = true;
			while(b) {
			System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯ 회원 로그인 ⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
			System.out.println(" 로그인을 위한 회원정보를 입력하세요 >> ");
			System.out.print(" id = ");
			String id = sc.nextLine();
			System.out.print(" password = ");
			String password = sc.nextLine();
			
			MemberVo vo = dao.loginData(id,password);
			
			if(vo == null) {
				System.out.println("아이디나 비밀번호가 다릅니다. 다시 입력해주세요.");
				continue;
			}else {
				System.out.println("로그인 성공! 환영합니다.");
				System.out.println(vo);	
				b = false;
			}	
		}
	}
}
