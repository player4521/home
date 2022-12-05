package com.player0.home.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.player0.home.domain.SignInDto;
import com.player0.home.model.PlayerVo;

@Repository
public class PlayerDaoImpl implements PlayerDao{

	private static final String NAMESPACE = "com.player0.home.mappers.PlayerMapper";
	private final SqlSession sqlSession;

	@Inject 
	public PlayerDaoImpl(SqlSession sqlSession) { 
		this.sqlSession = sqlSession; 
		}

    // 로그인 처리
    @Override
    public PlayerVo signIn(SignInDto signInDto) throws Exception {
        return sqlSession.selectOne(NAMESPACE + ".signIn", signInDto);
    }

	// 회원 가입 처리
	@Override
	public void signUp(PlayerVo playerVo) throws Exception {
		sqlSession.insert(NAMESPACE + ".signUp", playerVo);
	}

}
