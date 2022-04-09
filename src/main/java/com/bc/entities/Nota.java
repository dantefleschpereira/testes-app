package com.bc.entities;

public class Nota {
    public double nota1;
    public double nota2;
    public double nota3;

    public Nota(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public Nota() {
    }    
    

    public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double calculaMedia(){
        return  (nota1*2+nota2*3+nota3*5)/10;
    }
    
}
