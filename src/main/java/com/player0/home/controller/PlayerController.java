package com.player0.home.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.player0.home.model.PlayerVo;
import com.player0.home.service.PlayerService;

@Controller
@RequestMapping("/player/*")
public class PlayerController {

	private static final Logger logger = LoggerFactory.getLogger(PlayerController.class);

	@Autowired
	private PlayerService playerService;

//	// Inject:자바에서 지원, Autowired:스프링에서 지원
//	@Inject
//	public PlayerController(PlayerService playerService) {
//		this.playerService = playerService;
//	}

	// 로그인 페이지 이동
	@RequestMapping(value = "signIn", method = RequestMethod.GET)
	public void signInGet() throws Exception {
		logger.info("로그인 페이지 이동");
	}

	// 회원가입 페이지 이동
	@RequestMapping(value = "signUp", method = RequestMethod.GET)
	public void signUpGet() throws Exception {
		logger.info("회원가입 페이지 이동");
	}

	// 회원가입
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String signUpPost(PlayerVo playerVo) throws Exception{
		logger.info("회원가입 실행");
		
		/* 회원가입 쿼리 실행 */
		playerService.signUp(playerVo);
	
		return "redirect:/main";
	}

}
