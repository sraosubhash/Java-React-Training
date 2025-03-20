package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "Vendor")
@Data
@NoArgsConstructor
public class Vendor {
	@Id
	@Column(name = "VEN_ID")
	private int venId;
	@Column(name ="VEN_NAME")
	private String venName;
	@Column(name = "VEN_PHN_NO")
	private String venPhnNo;
	@Column(name = "VEN_USERNAME")
	private String venUserName;
	@Column(name = "VEN_PASSWORD")
	private String venPassword;
	@Column(name = "VEN_EMAIL")
	private String venEmail;

}
