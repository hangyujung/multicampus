package vo;

public class UserVO {
	String id ;//varchar2(10) constraint users_id_pk primary key,
	String pw ;//varchar2(10) constraint password_not_null not null,
	String name;// varchar2(20),
	String role;// va
	
	
	
	public UserVO() {	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UserVO [id=" + id + ", pw=" + pw + ", name=" + name + ", role=" + role + "]";
	}
	
	
}
