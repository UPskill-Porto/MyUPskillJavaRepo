package upskill.upskilljava;

public class CursoIntroBasesDeDados extends curso{
    private String nomecurso;
    private static String nomeDefault = "Barbara Bandeira";

    public CursoIntroBasesDeDados(String n, int num, String nomecurso) {
        super(nomeDefault, num);
        this.nomecurso = nomecurso;
    }
}
