package com.player0.home.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.player0.home.dao.PlayerDao;
import com.player0.home.domain.SignInDto;
import com.player0.home.model.PlayerVo;

@Service
public class PlayerServiceImpl implements PlayerService{

	private final PlayerDao playerDao;
	
	@Inject
	public PlayerServiceImpl(PlayerDao playerDao) {
		this.playerDao = playerDao;
	}
	
    // 로그인 처리
	@Override
	public PlayerVo signIn(SignInDto signDto) throws Exception {
		
		return playerDao.signIn(signDto);
	}
	
	// 회원 가입 처리
	@Override
	public void signUp(PlayerVo playerVo) throws Exception{
		playerDao.signUp(playerVo);
	}

}
