package com.player0.home.dao;

import com.player0.home.domain.SignInDto;
import com.player0.home.model.PlayerVo;

public interface PlayerDao {

	// 회원 가입 처리
	void signUp(PlayerVo playerVo) throws Exception;

	// 로그인 처리
	PlayerVo signIn(SignInDto signInDto) throws Exception;

}
