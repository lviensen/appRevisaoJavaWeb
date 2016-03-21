package br.csi.model;



public class Usuario{
	private long id;
	private String login;
	private String senha;
	
	public long getId() {
		return id;
	}
	public String getLogin() {
		return login;
	}
	public String getSenha() {
		return senha;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
}

