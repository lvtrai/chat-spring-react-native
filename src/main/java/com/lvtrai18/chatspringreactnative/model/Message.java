package com.lvtrai18.chatspringreactnative.model;

import java.io.Serializable;
import java.sql.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "messages")
public class Message implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name="user_name")
    private String username;
    
    @Column(name="encrytedpassword")
    private String encrytedpassword;
    
    @Column(name="status")
    private Integer status;
    
    @Column(name="message")
    private String message;
    
    @Column(name="created_on", insertable=false)
    private Date created_on;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	
	public String getEncrytedpassword() {
		return encrytedpassword;
	}

	public void setEncrytedpassword(String encrytedpassword) {
		this.encrytedpassword = encrytedpassword;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCreated_on() {
		return created_on;
	}

	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
