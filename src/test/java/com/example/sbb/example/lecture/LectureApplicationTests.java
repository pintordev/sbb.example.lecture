package com.example.sbb.example.lecture;

import com.example.sbb.example.lecture.answer.Answer;
import com.example.sbb.example.lecture.answer.AnswerRepository;
import com.example.sbb.example.lecture.question.Question;
import com.example.sbb.example.lecture.question.QuestionRepository;
import com.example.sbb.example.lecture.question.QuestionService;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class LectureApplicationTests {

	@Autowired
	private QuestionService questionService;

	@Test
	void testJpa() {
		// 300개 테스트 질문 데이터 생성
		// subject = "테스트 데이터입니다:[###]"
		// content = "내용무"
//		for (int i = 1; i <= 300; i++) {
//			String subject = String.format("테스트 데이터입니다.:[%03d]", i);
//			String content = "내용무";
//			this.questionService.create(subject, content);
//		}
	}

}
