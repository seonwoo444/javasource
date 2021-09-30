package com.samsung.project;

public class Account {

	private String ano;
	private String owner;
	private int balance;
	public Account(String ano, String owner, int balance) {
		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	public String getAno() {
		return ano;
	}
	public int getBalance() {
		return balance;
	}
	public String getOwner() {
		return owner;
	}
	
	public void setAno(String ano) {
		this.ano = ano;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
}
