package com.information.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Info {
//	private static final long serialVersionUID = -558553967080513790L;

	@Id
	@GeneratedValue
	@Column(name="info_id")
	private Integer infoId;

	@Column(name="user_id")
	private String userId;

	@Column(name="type_id")
	private Integer typeId;

	@Column(name="title")
	private String title;

	@Column(name="description")
	private String description;

	@Column(name="url")
	private String url;

	@Column(name="created_at")
	private Date createdAt;


	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="type_id", referencedColumnName="type_id", insertable = false, updatable = false)
	private Type type;
}
