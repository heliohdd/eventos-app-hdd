package com.eventosapp.models;

public class Evento {

	public String nome;
	public String local;
	public String data;
	public String horario;

	public Evento(String nome, String local, String data, String horario) {
		this.nome = nome;
		this.local = local;
		this.data = data;
		this.horario = horario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

}