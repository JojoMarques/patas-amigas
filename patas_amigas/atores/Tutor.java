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
            String telefone, String genero, boolean ativa, boolean isFuncionario, boolean isAdotante, boolean isTutor,
            int idTutor, int numAnimais_custodia, ArrayList<Object> historicoAdocoes_tutor) {
        super(nome, cpf, dataNascimento, email, senha, endereco, telefone, genero, ativa, isFuncionario, isAdotante,
                isTutor);
        this.idTutor = idTutor;
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
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + idTutor;
        result = prime * result + numAnimais_custodia;
        result = prime * result + ((historicoAdocoes_tutor == null) ? 0 : historicoAdocoes_tutor.hashCode());
        return result;
    }


    @Override
    public String toString() {
        return "Tutor " + idTutor + "\ngetNome(): " + getNome() + "\nnumAnimais_custodia: " + numAnimais_custodia
                + "\nhistoricoAdocoes_tutor: " + historicoAdocoes_tutor ;
    }

    

    
    
}
