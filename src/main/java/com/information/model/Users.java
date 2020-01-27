package com.information.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {

	@Id
	@Column(name="user_id")
	private String userId;

	@Column(name="password")
	private String password;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="user_id", referencedColumnName="user_id")
	private List<Info> info;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="user_id", referencedColumnName="user_id")
	private List<History> history;
}
