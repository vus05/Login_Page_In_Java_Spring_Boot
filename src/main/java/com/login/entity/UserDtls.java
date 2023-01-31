package com.login.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_DTLS")
public class UserDtls {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String A_fname;
	private String B_lname;
	private String C_phone;
	private String D_email;
	private String E1_gender;
	private String E_password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getA_fname() {
		return A_fname;
	}

	public void setA_fname(String a_fname) {
		A_fname = a_fname;
	}

	public String getB_lname() {
		return B_lname;
	}

	public void setB_lname(String b_lname) {
		B_lname = b_lname;
	}

	public String getC_phone() {
		return C_phone;
	}

	public void setC_phone(String c_phone) {
		C_phone = c_phone;
	}

	public String getD_email() {
		return D_email;
	}

	public void setD_email(String d_email) {
		D_email = d_email;
	}

	public String getE1_gender() {
		return E1_gender;
	}

	public void setE1_gender(String e1_gender) {
		E1_gender = e1_gender;
	}

	public String getE_password() {
		return E_password;
	}

	public void setE_password(String e_password) {
		E_password = e_password;
	}

}
