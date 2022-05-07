package com.korea.main;

import com.korea.controller.FrontController;
import com.korea.domain.MusicDAO;
import com.korea.dto.MusicDTO;
import com.korea.view.Viewer;


public class Main {

	public static void main(String[] args) {
		
		
		//BookDAO-BookDTO 테스트
//		MusicDTO dto = new MusicDTO("5551","가을안부","1253","3일","가을","1234","music");
//		MusicDAO dao = new MusicDAO();
//		
//		dao.Insert(dto); //성공여부 확인
//		FrontController controller = new FrontController();
//		MusicDTO dto = new MusicDTO("ㅂㅂㅂㅂ","ㅁㅁㅁㅁ","21","19일","겨울","7888","ㅡㅑㅏㅓ");
//		controller.SubControllerEX("Music", 2, dto); //서비스명,작업번호,전달단위
//		controller.SubControllerEX("Music", 1, dto);
		
		Viewer view1 = new Viewer();
		view1.MusicMenu();
		
		
		


	}

}
