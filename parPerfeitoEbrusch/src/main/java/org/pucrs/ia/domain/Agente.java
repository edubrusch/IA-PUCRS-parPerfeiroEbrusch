package org.pucrs.ia.domain;

import java.awt.Point;
import java.util.ArrayList;

import org.pucrs.ia.enums.Direcao;
import org.pucrs.ia.enums.estadoCivil;

public class Agente {

	private Direcao direcaoAtual;
	private String sexo;
	private estadoCivil estado;
	ArrayList<Point> cartoriosConhecidos;

	public void iniciar() {

	}

	private void caminhar() {

	}

	private void observarAmbiente() {

	}

	private void estadoCivil() {

	}

	public Direcao getDirecaoAtual() {
		return direcaoAtual;
	}

	public void setDirecaoAtual(Direcao direcaoAtual) {
		this.direcaoAtual = direcaoAtual;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public ArrayList<Point> getCartoriosConhecidos() {
		return cartoriosConhecidos;
	}

	public void setCartoriosConhecidos(ArrayList<Point> cartoriosConhecidos) {
		this.cartoriosConhecidos = cartoriosConhecidos;
	}

	public estadoCivil getEstado() {
		return estado;
	}

	public void setEstado(estadoCivil estado) {
		this.estado = estado;
	}
	
	private int caularDistancia(Point p, Point q) {
		
		final double powd = 2.0;
		double p1 = p.getX();
		double p2 = p.getY();
		double q1 = q.getX();
		double q2 = q.getY();
		
		return (int) Math.sqrt(Math.pow( (p1 - q1), powd) + Math.pow((p2-q2), powd));		
		
	}
	
	private ArrayList<Direcao> pathTo(Point a, Point b) {
		
		ArrayList<Point> avaliadosA = new ArrayList<Point>();
		ArrayList<Point> avaliadosN = new ArrayList<Point>();
		
		Point venhode = null;
		
		return null;
		
	}

}
