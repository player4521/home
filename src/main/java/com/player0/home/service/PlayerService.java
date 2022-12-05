package com.player0.home.service;

import com.player0.home.domain.SignInDto;
import com.player0.home.model.PlayerVo;

public interface PlayerService {

	// 로그인 처리
	public PlayerVo signIn(SignInDto signInDto) throws Exception;

	// 회원 가입 처리
	void signUp(PlayerVo playerVo) throws Exception;

}
