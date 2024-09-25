package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.CarDTO;
import com.example.demo.dto.StudentDTO;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/param")
@ResponseBody //모든 메소드가 JSON 형식으로 응답을 반환함
public class QuizController2 {
	
	@GetMapping("/q1")
	public String q1(HttpServletRequest request) {
		
		String data = request.getParameter("data");
		
		System.out.println("String 타입 파라미터 수집 : " + data);
		
		return "ok";
	}
	
	@GetMapping("/q2")
	public String q2(HttpServletRequest request) {
		
		float f = Float.parseFloat(request.getParameter("f"));
		boolean b =  request.getParameter("f") != null;
		
		System.out.println("float 타입 파라미터 수집 : " + f + ", boolean 타입 파라미터 수집 : " + b);
		
		return "ok";
	}
	
	@GetMapping("/q3")
	public String q3(@RequestParam(name="arr") char [] arr) {
		
		System.out.println("char 형 배열 수집 : " + Arrays.toString(arr));
		
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);			
		}
		
		System.out.println("배열의 개수 : " +arr.length);
		
		return "ok";
	}
	
	
	// 4,5,6 번 : 복잡한 파라미터는 메세지 바디에 데이터를 담을 것
	// @RequestBody 사용하여 JSON형식의 문자열을 클래스로 변환
	@GetMapping("/q4")
	public String q4(@RequestBody StudentDTO dto) {
		
		System.out.println("객체 수집 : " + dto);
		
		return "ok";
		
	}
	
	@GetMapping("/q5")
	public String q5(@RequestBody ArrayList<StudentDTO> dto) {
		
		System.out.println("객체타입 리스트 수집 : " + dto);
		
		for (int i =0; i < dto.size() ; i++) {
			System.out.println(dto.get(i));			
		}
		
		System.out.println("리스트의 개수 : "+dto.size());
		
		return "ok";
	}

	@GetMapping("/q6")
	public String q6(@RequestBody ArrayList<CarDTO> dto) {
		
		System.out.println("객체타입 리스트 수집 : " + dto);
		
		for (int i = 0; i < dto.size(); i++) {
			System.out.println(dto.get(i));
		}
		
		System.out.println("리스트 마지막 요소 : " + dto.get(dto.size() - 1) );
		
		return "ok";
	}
	
	

}
