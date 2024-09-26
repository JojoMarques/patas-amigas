package patas_amigas.atores;
import java.util.ArrayList;

public class Tutor extends Pessoa{
    
    private static int idStatic = 1;
    private int idTutor;
    private int numAnimais_custodia;
    private ArrayList<Object> historicoAdocoes_tutor = new ArrayList<>();

    public Tutor() {
    }

    public Tutor(String nome, String cpf, String dataNascimento, String email, String senha, String endereco,
            String telefone, String genero, boolean ativa, int numAnimais_custodia,
            ArrayList<Object> historicoAdocoes_tutor) {
        super(nome, cpf, dataNascimento, email, senha, endereco, telefone, genero, ativa);
        this.idTutor = idStatic++;
        this.numAnimais_custodia = numAnimais_custodia;
        this.historicoAdocoes_tutor = historicoAdocoes_tutor;
    }


    public static int getIdStatic() {
        return idStatic;
    }


    public static void setIdStatic(int idStatic) {
        Tutor.idStatic = idStatic;
    }


    public int getIdTutor() {
        return idTutor;
    }

    public void setIdTutor(int idTutor) {
        this.idTutor = idTutor;
    }


    public int getNumAnimais_custodia() {
        return numAnimais_custodia;
    }


    public void setNumAnimais_custodia(int numAnimais_custodia) {
        this.numAnimais_custodia = numAnimais_custodia;
    }


    public ArrayList <Object> getHistoricoAdocoes() {
        return historicoAdocoes_tutor;
    }

    public void setHistoricoAdocoes(ArrayList <Object> historicoAdocoes) {
        this.historicoAdocoes_tutor = historicoAdocoes;
    }

    @Override
    public String toString() {
        return "Tutor [idTutor=" + idTutor + ", numAnimais_custodia=" + numAnimais_custodia
                + ", historicoAdocoes_tutor=" + historicoAdocoes_tutor + ", getId()=" + getId() + ", getIdTutor()="
                + getIdTutor() + ", getNome()=" + getNome() + ", getNumAnimais_custodia()=" + getNumAnimais_custodia()
                + ", getCpf()=" + getCpf() + ", getDataNascimento()=" + getDataNascimento() + ", getHistoricoAdocoes()="
                + getHistoricoAdocoes() + ", getEmail()=" + getEmail() + ", getSenha()=" + getSenha()
                + ", getEndereco()=" + getEndereco() + ", getTelefone()=" + getTelefone() + ", getGenero()="
                + getGenero() + ", isAtiva()=" + isAtiva() + "]";
    }

    
    
}
