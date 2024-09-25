package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*	
 * 중복되는 URL은 클래스 레벨로 이동
 * */

@RequestMapping("/board")
@Controller
public class MappingController1_2 {
	

		@ResponseBody
		@GetMapping
		public String list () {
			System.out.println("게시물 조회");
			return "ok";
		}
		
		@ResponseBody
		@PostMapping
		public String save() {
			System.out.println("게시물 등록");
			return "ok";
		}
		
		@ResponseBody
		@PutMapping
		public String modify() {
			System.out.println("게시물 수정");
			return "ok";
		}

		@ResponseBody
		@DeleteMapping
		public String remove() {
			System.out.println("게시물 삭제");
			return "ok";
		}
		
}
