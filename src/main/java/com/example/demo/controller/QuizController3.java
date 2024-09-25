package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.CarDTO;
import com.example.demo.dto.StudentDTO;


@Controller
@RequestMapping("/return")
public class QuizController3 {

		@GetMapping("/q1")
		public void q1(Model model) {
			
		}
		
		@GetMapping("/q2")
		public String q2(Model model) {
			model.addAttribute("quiz","두번째퀴즈입니다.");
			return "return/test";
		}
		
		@ResponseBody
		@GetMapping("/q3")
		public StudentDTO q3() {
			StudentDTO studentDTO = new StudentDTO(1,"둘리", 3);
						
			return studentDTO;
			
		}
		
		@ResponseBody
		@GetMapping("/q4")
		public List<CarDTO> q4() {
			List<CarDTO> list = new ArrayList<>();
			list.add(new CarDTO("현대", "코나", "블랙"));
			
			return list;
			
		}
		
		@ResponseBody
		@GetMapping("/q5")
		public List<StudentDTO> q5() {
			List<StudentDTO> list = new ArrayList<>();
			list.add(new StudentDTO(1, "둘리", 3));
			list.add(new StudentDTO(2, "또치", 1));
			list.add(new StudentDTO(3, "도우너", 2));			
			return list;
			
		} 
		
		@GetMapping("/q6")
		public ResponseEntity q6() {
			
			return new ResponseEntity("response fail..",HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
		
		@GetMapping("/q7")
		public ResponseEntity<CarDTO> q7() {
			CarDTO carDTO = CarDTO.builder()
																.company("현대")
																.model("코나")
																.color("블랙")
																.build();
			
			return new ResponseEntity<>(carDTO,HttpStatus.OK);
		}
	
}
