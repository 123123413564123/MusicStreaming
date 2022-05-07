package com.korea.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.korea.dto.DTO;
import com.korea.dto.MusicDTO;


public class MusicDAO extends DTO{
	
	//연결관련 정보 저장용 변수
			String id="root";
			String pw="1234";
			String url="jdbc:mysql://localhost:3306/musicstreamingdb";
			
			//DB연결관련 객체를 위한 참조 변수
			Connection conn=null; 				// DB 연결객체
			PreparedStatement pstmt = null;		// SQL 쿼리 전송 객체
			ResultSet rs = null;				// 쿼리결과 수신용 객체
			
			public MusicDAO(){
			//연결
			try {
				//DB Drive로드
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver Loading Success!");
				//DB연결객체 설정
				conn=DriverManager.getConnection(url, id, pw);
				System.out.println("DB Connected..");											
			}catch(Exception e) {
				e.printStackTrace();
			}
			
	}//생성자 끝
			
	//도서 정보 조회(num:1)
	public void Select() {
		try {
		pstmt=conn.prepareStatement("select * from music_tbl");
		
		//SQL 실행
		rs = pstmt.executeQuery();
		
		while(rs.next())
		{
			System.out.println(
			rs.getString("Music_Code")+" "+ rs.getString("Music_title")+" "
			+rs.getString("Music_Genre")+" "+ rs.getString("Music_Release")+" "
			+rs.getString("Music_Keyword")+" "+ rs.getString("Music_Decade")+" "
			+rs.getString("Music_Musiccol"));
			
		}
		
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		try{conn.close();}catch(Exception e1) {e1.printStackTrace();}
		
		}
	}
	
	
	
			
	//도서 정보 추가(num:2)
	public boolean Insert(MusicDTO dto) {
		
		try {
			
			pstmt = conn.prepareStatement("insert into Music_tbl values(?,?,?,?,?,?,?)");
			pstmt.setString(1, dto.getMusic_Code());
			pstmt.setString(2, dto.getMusic_Title());
			pstmt.setString(3, dto.getMusic_Genre());
			pstmt.setString(4, dto.getMusic_Release());
			pstmt.setString(5, dto.getMusic_Keyword());
			pstmt.setString(6, dto.getMusic_Decade());
			pstmt.setString(7, dto.getMusic_Musiccol());
			
			
			int result = pstmt.executeUpdate();
			
			if(result!=0) {
				return true;	//INSERT 성공!
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {pstmt.close();}catch(Exception e) {e.printStackTrace();}
		}
		
		return false;
	}
	//도서 정보 수정(num:3)
	public void Update() {
		
		
	}
			
	//도서 정보 삭제(num:4)
	public void Delete() {}
	
}
