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
@Table(name="type")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Type {

	@Id
	@GeneratedValue
	@Column(name="type_id")
	private Integer typeId;

	@Column(name="name")
	private String name;
}
