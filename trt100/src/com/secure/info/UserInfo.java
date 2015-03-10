package com.secure.info;

public class UserInfo {
	int id = 0;
	String description = "";
	String url = "";
	String username = "";
	String password = "";
	String note = "";
	
	public UserInfo() {
		// TODO Auto-generated constructor stub
	}
	
	UserInfo(int id,String description,String url,String username,String password,String note){
		this.id=id;
		this.description=description;
		this.url=url;
		this.username=username;
		this.password=password;
		this.note=note;
	}
	
}
