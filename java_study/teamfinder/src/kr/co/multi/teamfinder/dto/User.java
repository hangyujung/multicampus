package kr.co.multi.teamfinder.dto;




public class User {
	private String user_Index;
	private String user_Pwd;
	private String region;
	private String user_Image;
	private String user_Stack;
	private String user_Email;
	private String user_Id;
	
	public String getUser_Index() {
		return user_Index;
	}
	public void setUser_Index(String user_Index) {
		this.user_Index = user_Index;
	}
	public String getUser_Pwd() {
		return user_Pwd;
	}
	public void setUser_Pwd(String user_Pwd) {
		this.user_Pwd = user_Pwd;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getUser_Image() {
		return user_Image;
	}
	public void setUser_Image(String user_Image) {
		this.user_Image = user_Image;
	}
	public String getUser_Stack() {
		return user_Stack;
	}
	public void setUser_Stack(String user_Stack) {
		this.user_Stack = user_Stack;
	}
	public String getUser_Email() {
		return user_Email;
	}
	public void setUser_Email(String user_Email) {
		this.user_Email = user_Email;
	}
	public String getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(String user_Id) {
		this.user_Id = user_Id;
	}
	@Override
	public String toString() {
		return "User [user_Index=" + user_Index + ", user_Pwd=" + user_Pwd + ", region=" + region + ", user_Image="
				+ user_Image + ", user_Stack=" + user_Stack + ", user_Email=" + user_Email + ", user_Id=" + user_Id
				+ "]";
	}
	
}