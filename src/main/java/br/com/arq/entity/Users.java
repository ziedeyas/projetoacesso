package br.com.arq.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="users")
public class Users implements Serializable{
	private static final long serialVersionUID=1l;
	@Id
	private String id;
	private String name;
	private String token;
	private String status;
	@Indexed(unique=true)
	private String email;
	private String password;
	
	
	public String getId()
	
	
	
	{
		return id;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", token=" + token + ", status=" + status + ", email=" + email
				+ ", password=" + password + "]";
	}

	public Users() {
	
	}
	public Users(String id, String name, String token, String status, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.token = token;
		this.status = status;
		this.email = email;
		this.password = password;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
}
