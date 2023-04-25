package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="IPL_Table")
public class IPLModel {

	@Id
	private int playerId;
	private String playerName;
	private String playerCountry;
	private int player_age;
	private int Jersey_no;
	private String team_name;
	private String player_role;
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPlayerCountry() {
		return playerCountry;
	}
	public void setPlayerCountry(String playerCountry) {
		this.playerCountry = playerCountry;
	}
	public int getPlayer_age() {
		return player_age;
	}
	public void setPlayer_age(int player_age) {
		this.player_age = player_age;
	}
	public int getJersey_no() {
		return Jersey_no;
	}
	public void setJersey_no(int jersey_no) {
		Jersey_no = jersey_no;
	}
	public String getTeam_name() {
		return team_name;
	}
	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
	public String getPlayer_role() {
		return player_role;
	}
	public void setPlayer_role(String player_role) {
		this.player_role = player_role;
	}
	
	
}