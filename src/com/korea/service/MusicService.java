package com.korea.service;

import com.korea.domain.MusicDAO;
import com.korea.dto.MusicDTO;

public class MusicService {
	//멤버
	MusicDAO dao = new MusicDAO();
	
	//조회
	public void Select(MusicDTO dto) {
		dao.Select();
	}
	//추가
	public boolean Insert(MusicDTO dto) {
		return dao.Insert(dto); //전달받은 dto를 dao로 넘김
								//그리고 반환되는값을 Controller로 전달(true/false)
	}
	//수정
	
	//삭제

}
