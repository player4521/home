package com.player0.home.model;

import java.sql.Date;

public class PlayerVo {

	private Integer playerNo;
	private String playerPw;
	private String playerName;
	private String playerId;
	private int playerPhoneNo;
	private int playerBirth;
	private int playerGender;
	private String playerMail;
	private String playerAddress1;
	private String playerAddress2;
	private String playerAddress3;
	private int playerGrade;
	private int playerCoin;
	private int playerPoint;
	private int deleteFlg;
	private Date regdate;
	private Date editdate;

	public Integer getPlayerNo() {
		return playerNo;
	}

	public void setPlayerNo(Integer playerNo) {
		this.playerNo = playerNo;
	}

	public String getPlayerPw() {
		return playerPw;
	}

	public void setPlayerPw(String playerPw) {
		this.playerPw = playerPw;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public int getPlayerPhoneNo() {
		return playerPhoneNo;
	}

	public void setPlayerPhoneNo(int playerPhoneNo) {
		this.playerPhoneNo = playerPhoneNo;
	}

	public int getPlayerBirth() {
		return playerBirth;
	}

	public void setPlayerBirth(int playerBirth) {
		this.playerBirth = playerBirth;
	}

	public int getPlayerGender() {
		return playerGender;
	}

	public void setPlayerGender(int playerGender) {
		this.playerGender = playerGender;
	}

	public String getPlayerMail() {
		return playerMail;
	}

	public void setPlayerMail(String playerMail) {
		this.playerMail = playerMail;
	}

	public String getPlayerAddress1() {
		return playerAddress1;
	}

	public void setPlayerAddress1(String playerAddress1) {
		this.playerAddress1 = playerAddress1;
	}

	public String getPlayerAddress2() {
		return playerAddress2;
	}

	public void setPlayerAddress2(String playerAddress2) {
		this.playerAddress2 = playerAddress2;
	}

	public String getPlayerAddress3() {
		return playerAddress3;
	}

	public void setPlayerAddress3(String playerAddress3) {
		this.playerAddress3 = playerAddress3;
	}

	public int getPlayerGrade() {
		return playerGrade;
	}

	public void setPlayerGrade(int playerGrade) {
		this.playerGrade = playerGrade;
	}

	public int getPlayerCoin() {
		return playerCoin;
	}

	public void setPlayerCoin(int playerCoin) {
		this.playerCoin = playerCoin;
	}

	public int getPlayerPoint() {
		return playerPoint;
	}

	public void setPlayerPoint(int playerPoint) {
		this.playerPoint = playerPoint;
	}

	public int getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(int deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public Date getEditdate() {
		return editdate;
	}

	public void setEditdate(Date editdate) {
		this.editdate = editdate;
	}

	@Override
	public String toString() {
		return "PlayerVO [playerNo=" + playerNo + ", playerPw=" + playerPw + ", playerName=" + playerName + ", playerId=" + playerId + ", playerPhoneNo=" + playerPhoneNo + ", playerBirth=" + playerBirth + ", playerGender=" + playerGender + ", playerMail=" + playerMail + ", playerAddress1=" + playerAddress1 + ", playerAddress2=" + playerAddress2 + ", playerAddress3=" + playerAddress3 + ", playerGrade=" + playerGrade + ", playerCoin=" + playerCoin + ", playerPoint="
				+ playerPoint + ", deleteFlg=" + deleteFlg + ", regdate=" + regdate + ", editdate=" + editdate + ", getPlayerNo()=" + getPlayerNo() + ", getPlayerPw()=" + getPlayerPw() + ", getPlayerName()=" + getPlayerName() + ", getPlayerId()=" + getPlayerId() + ", getPlayerPhoneNo()=" + getPlayerPhoneNo() + ", getPlayerBirth()=" + getPlayerBirth() + ", getPlayerGender()=" + getPlayerGender() + ", getPlayerMail()=" + getPlayerMail() + ", getPlayerAddress1()="
				+ getPlayerAddress1() + ", getPlayerAddress2()=" + getPlayerAddress2() + ", getPlayerAddress3()=" + getPlayerAddress3() + ", getPlayerGrade()=" + getPlayerGrade() + ", getPlayerCoin()=" + getPlayerCoin() + ", getPlayerPoint()=" + getPlayerPoint() + ", getDeleteFlg()=" + getDeleteFlg() + ", getRegdate()=" + getRegdate() + ", getEditdate()=" + getEditdate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
