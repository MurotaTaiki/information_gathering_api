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
@Table(name="history")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class History {

	@Id
	@GeneratedValue
	@Column(name="history_id")
	private Integer historyId;

	@Column(name="user_id")
	private String userId;

	@Column(name="type_id")
	private Integer typeId;

	@Column(name="operation_id")
	private Integer operationId;

	@Column(name="title")
	private String title;

	@Column(name="created_at")
	private Date createdAt;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="type_id", referencedColumnName="type_id", insertable = false, updatable = false)
	private Type type;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="operation_id", referencedColumnName="operation_id", insertable = false, updatable = false)
	private Operation operation;
}
