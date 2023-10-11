package br.senai.sp.jandira.model;

import java.util.*;

public class Sorvete {

    private double preco;
    private String sabor, cor, tipo;


    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    List <Sorvete> listaSorvetes = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    public void comprarSorvete(){

        System.out.println("•·•·•·•·•·•·•·•·•·••·•·•·•·•·•·•·•");
        System.out.println("         Comprar Sorvete ");
        System.out.println("•·•·•·•·•·•·•·•·•·••·•·•·•·•·•·•·•");
        System.out.println("Escolha o sabor do sorvete");
        setSabor(scanner.nextLine());
        System.out.println("Escolha a cor do sorvete");
        setCor(scanner.nextLine());
        System.out.println("•·•·•·•·•·•·•·•·•·••·•·•·•·•·•·•·•");

    }

    public void carrinho(Sorvete sorvete){
        listaSorvetes.add(sorvete);
    }

}
