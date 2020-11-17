package upskill.upskilljava;

public class CursoUML extends curso{

    private String nomeCurso;
    private static String DEFAULT_NOME = "Diana Ferreira Matos";

    public CursoUML(String n, int num, String nome) {
        super(DEFAULT_NOME, num);
        this.nomeCurso = "UML";
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public static String getDefaultNome() {
        return DEFAULT_NOME;
    }


}