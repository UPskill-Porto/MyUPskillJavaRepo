/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upskill.upskilljava;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author prp
 */
public class curso {
    private String nome;
    private int numeroFormandos;

    public curso(String n, int num){
        this.nome=DefNome(n);
        this.numeroFormandos=DefNumFormandos(num);
    }

    private String DefNome(String nome)
    {
        return nome.trim();
    }

    private int DefNumFormandos(int num){
<<<<<<< HEAD
        if (num < 0)
=======
        if (num<0) 
>>>>>>> b47d9ac04cc0b08c17bf2cdbe020351f3eef606a
            return 0;
        else
            return num;
    }
}