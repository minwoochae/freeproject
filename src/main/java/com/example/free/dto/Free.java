package com.example.free.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Free {
	private int num;
	private	String name; //사용자 이름
	private String pwd; //비밀번호
	private String subject; //제목
	private String email;
	private String content; //내용
	private String ipAddr; //게시물 등록시의 ip주소
	private String created; //게시물 생성날짜
	private int hitCount; //조회수
	private String img;

}
