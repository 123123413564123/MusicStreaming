package com.korea.view;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import com.korea.controller.FrontController;
import com.korea.dto.MusicDTO;




public class Viewer {
	int num;
	Scanner sc = new Scanner(System.in);
	
	//컨트롤러 객체를 추가
	FrontController controller = new FrontController();
	
	//메인메뉴
	public void MainMenu() {
		while(true)
		{
		System.out.println("-------------Menu--------------");
		System.out.println("1 도서메뉴");
		System.out.println("2 직원메뉴");
		System.out.println("3 회원메뉴");
		System.out.println("4 종료");
		System.out.println("-------------Menu--------------");
		System.out.println("번호 : ");
		num=sc.nextInt();
		switch(num)
		{
			case 1: //도서메뉴
				MusicMenu();
				break;
			case 2: //직원메뉴
				break;
			case 3: //회원메뉴
				break;
			case 4:
				System.out.println("프로그램을 종료합니다");
				System.exit(-1);
				break;
			default : 
		}//switch 끝
		}//while 끝
	}
	//도서메뉴
	public void MusicMenu() {
		while(true)
		{
			System.out.println("---------------BOOK-------------");
			System.out.println("1 Select");
			System.out.println("2 Insert");
			System.out.println("3 Update");
			System.out.println("4 Delete");
			System.out.println("5 Prev");
			System.out.println("---------------BOOK-------------");
			num = sc.nextInt();
			switch(num)
			{
			case 1: //조회
				
				controller.SubcontrollerEX("Music", 1,);
				
				
				break;
			case 2: //삽입
				System.out.println("코드|타이틀|장르|릴리즈|키워드|디케이드|뮤지컬 > ");
				String Code = sc.next();
				String Title = sc.next();
				String Genre = sc.next();
				String Release = sc.next();
				String Keyword = sc.next();
				String Decade = sc.next();
				String Musiccol = sc.next();
				MusicDTO dto = new MusicDTO(Code,Title,Genre,Release,Keyword,Decade,Musiccol);
				boolean result=controller.SubControllerEX("Music", 2, dto);
				if(result) {
					System.out.println("INSERT성공");
				}
				else {
					System.out.println("INSERT실패");
				}
				
						
				break;
			case 3: //수정
				System.out.println("책수정요청!");
				break;
			case 4: //삭제
				System.out.println("책수정삭제!");
				break;
			case 5: //이전으로
				return; //MainMenu로 리턴
			default: //잘못누름
				System.out.println("번호 다시 입력하세요....");
			}
		}
		
	}
}
