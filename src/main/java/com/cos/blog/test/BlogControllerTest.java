package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 스프링이 com.cos.blog 패키지 이하를 스캔해서 모든 파일을 메모리에 new 하는 것은 아니며
// 특정 어노테이션이 붙어있는 클래스 파일들을 new해서(IoC) 스프링 컨테이너에 관리해줍니다.

//@Controller
//@RequestBody : HTTP 요청 본문에 담긴 값들을 자바 객체로 반환 시켜, 객체에 저장
//@ResponseBdoy : 자바 객체를 HTTP 응답 본문의 객체로 변환하여 클라이언트로 전송


@RestController // @Controller + @ResponseBody, Json 형태로 객체 데이터를 반환
public class BlogControllerTest {

	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hell spring boot<h1>";
	}
	
}
