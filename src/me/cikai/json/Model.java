package me.cikai.json;

public class Model {

	/**
	 * transient : Java关键字
	 * 用transient关键字标记的成员变量不参与序列化过程
	 */

	private int id;
	private String name;
	private transient String gender;
	private String addr;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

}
