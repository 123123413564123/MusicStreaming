package com.korea.dto;

import java.util.Date;

public class MusicDTO extends DTO{
	
	public String Music_Code;
	public String Music_Title;
	public String Music_Genre;
	public String Music_Release;
	public String Music_Keyword;
	public String Music_Decade;
	public String Music_Musiccol;
	public MusicDTO(String music_Code, String music_Title, String music_Genre, String music_Release, String music_Keyword,
			String music_Decade, String music_Musiccol) {
		super();
		Music_Code = music_Code;
		Music_Title = music_Title;
		Music_Genre = music_Genre;
		Music_Release = music_Release;
		Music_Keyword = music_Keyword;
		Music_Decade = music_Decade;
		Music_Musiccol = music_Musiccol;
	}
	
	public String getMusic_Code() {
		return Music_Code;
	}

	public void setMusic_Code(String music_Code) {
		Music_Code = music_Code;
	}

	public String getMusic_Title() {
		return Music_Title;
	}

	public void setMusic_Title(String music_Title) {
		Music_Title = music_Title;
	}

	public String getMusic_Genre() {
		return Music_Genre;
	}

	public void setMusic_Genre(String music_Genre) {
		Music_Genre = music_Genre;
	}

	public String getMusic_Release() {
		return Music_Release;
	}

	public void setMusic_Release(String music_Release) {
		Music_Release = music_Release;
	}

	public String getMusic_Keyword() {
		return Music_Keyword;
	}

	public void setMusic_Keyword(String music_Keyword) {
		Music_Keyword = music_Keyword;
	}

	public String getMusic_Decade() {
		return Music_Decade;
	}

	public void setMusic_Decade(String music_Decade) {
		Music_Decade = music_Decade;
	}

	public String getMusic_Musiccol() {
		return Music_Musiccol;
	}

	public void setMusic_Musiccol(String music_Musiccol) {
		Music_Musiccol = music_Musiccol;
	}

	@Override
	public String toString() {
		return "MusicDTO [Music_Code=" + Music_Code + ", Music_Title=" + Music_Title + ", Music_Genre=" + Music_Genre
				+ ", Music_Release=" + Music_Release + ", Music_Keyword=" + Music_Keyword + ", Music_Decade="
				+ Music_Decade + ", Music_Musiccol=" + Music_Musiccol + "]";
	}
	
	

	
	}
	
	


