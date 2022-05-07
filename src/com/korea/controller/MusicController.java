package com.korea.controller;

import com.korea.dto.DTO;
import com.korea.dto.MusicDTO;
import com.korea.service.MusicService;

public class MusicController implements SubController{
	MusicService service = new MusicService();
	
	@Override
	public boolean execute(int num, DTO dto) {
		MusicDTO bdto = (MusicDTO)dto;
			//조회 1 ,삽입 2,수정 3, 삭제 4
		
			if(num==1) {
				service.Select(bdto);
				
			}else if(num==2) {
				return service.Insert(bdto);
				
			}else if(num==3) {
				
			}else if(num==4) {
				
			}		
		
		return false;
	}

}
