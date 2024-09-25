package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.BookDTO;

// @ResponseBody + @Controller 가 포함되어있음
@RestController
//@ResponseBody
//@Controller
@RequestMapping("/param4")
public class ParamController4 {

//		@ResponseBody
		@GetMapping("/ex1")
		public String ex1(@RequestBody BookDTO dto) {
			
			System.out.println("메세지 바디 : " + dto);
			
			return "ok";
		}
		
		
//		@ResponseBody
		@GetMapping("/ex2")
		public String ex2(@RequestBody ArrayList<BookDTO> list) {
			System.out.println("메세지 바디에 담긴 리스트 수집 : " + list);
			return "ok";
		}
	
}

//	JSON 방식
//	배열 또는 리스트 -> []
//	객체 -> {}
//	객체 타입의 리스트 -> [{}, {}, {}]


