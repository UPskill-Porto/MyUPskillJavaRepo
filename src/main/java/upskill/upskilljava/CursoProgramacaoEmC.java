/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upskill.upskilljava;

/**
 *
 * @author andre
 */
public class CursoProgramacaoEmC extends curso{
    private String nome;
    private int numeroFormandos;

    public CursoProgramacaoEmC(String n, int num){
        super(n, num);
    }

    private String DefNome(String nome)
    {
        return nome.trim();
    }

    private int DefNumFormandos(int num){
        if (num<0) 
            return 0;
        else
            return num;
    }
    
}
