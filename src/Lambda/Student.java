package Lambda;

public class Student {
	int sid;
	String sname;
	Long phone;
	
	public Student(int sid, String sname, Long phone) {
		this.sid = sid;
		this.sname = sname;
		this.phone = phone;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", phone=" + phone + "]";
	}
	
	

}
