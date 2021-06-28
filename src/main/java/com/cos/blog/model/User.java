package com.cos.blog.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data //Getter + Setter
@NoArgsConstructor //빈 생성자
@AllArgsConstructor
@Builder  
//ORM -> Java(다른언어)Object -> 테이블로 매핑해주는 기술
@Entity //User클래스가 MySQL에 테이블이 생성이 된다.
public class User {
   
	@Id //Primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //프로젝트에서 연결된 DB의 넘버링 전략을 따라간다.
	private int id; // 시퀀스, auto_increment
	
	@Column(nullable = false, length=30, unique = true) //데이터가 null값이 안되게 하려고 사용한다.
	private String username; //아이디
	
	@Column(nullable = false, length=100) //123456 -> 해쉬(비밀번호 암호화)
	private String password; 
	
	@Column(nullable = false, length=50)
	private String email;

	//DB는 RoleType이라는게 없다.
	@Enumerated(EnumType.STRING)
	private RoleType role; //Enum을 쓰는게 좋다. (어떠한 데이터의 도메인을 만들 수 있다) // ex) 기본적으로 Admin, User, Manager 
	
	@CreationTimestamp //시간이 자동입력
	private Timestamp createDate;
	
	
}
