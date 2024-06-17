package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//어노테이션 컨트롤러
@Controller
public class ExampleController {
	
	/*
	 * @GetMapping 을 쓰면 기본으로 return할 때 html 파일을 바라보겠다
	 * 설정이 들어 있음
	 * classpatt : src/main/resources
	 * 기본경로 앞에 붙여진 /templates/ 폴더가 html을 담는 공간
	 * 파일명 마지막에는 항상 .html
	 */
	
	@GetMapping("example")  
	public String 이그잼플메서드() {
		return "example";
	}
}
