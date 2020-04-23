package com.tyss.servletassignment.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="users_list")
@Entity
public class UserBean implements Serializable {
	@Id
	private int id;
	@Column
	private String name;
	@Column
	private String password;
	@Column
	private String email;
	@Column
	private String sex;
	@Column
	private String country;
}
