package com.information.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="operation")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Operation {

	@Id
	@GeneratedValue
	@Column(name="operation_id")
	private Integer operationId;

	@Column(name="name")
	private String name;
}
