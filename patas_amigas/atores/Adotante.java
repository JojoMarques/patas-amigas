package patas_amigas.atores;

import java.util.ArrayList;

public class Adotante extends Pessoa {
    
    private static int idStatic = 1;
    private int id;
    private String preferenciaAnimal;
    private ArrayList<String> historicoAdocoes_adotante = new ArrayList<>();

    public Adotante(){

    }
    
    public Adotante(String nome, String cpf, String dataNascimento, String email, String senha, String endereco,String telefone, String genero, boolean ativa, String preferenciaAnimal,ArrayList<String> historicoAdocoes_adotante) {
        super(nome, cpf, dataNascimento, email, senha, endereco, telefone, genero, ativa);
        this.id = idStatic++;
        this.preferenciaAnimal = preferenciaAnimal;
        this.historicoAdocoes_adotante = historicoAdocoes_adotante;
    }

    public static int getIdStatic() {
        return idStatic;
    }

    public static void setIdStatic(int idStatic) {
        Adotante.idStatic = idStatic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPreferenciaAnimal() {
        return preferenciaAnimal;
    }

    public void setPreferenciaAnimal(String preferenciaAnimal) {
        this.preferenciaAnimal = preferenciaAnimal;
    }

    public ArrayList<String> getHistoricoAdocoes_adotante() {
        return historicoAdocoes_adotante;
    }

    public void setHistoricoAdocoes_adotante(ArrayList<String> historicoAdocoes_adotante) {
        this.historicoAdocoes_adotante = historicoAdocoes_adotante;
    }

    @Override
    public String toString() {
        return "Adotante [id=" + id + ", preferenciaAnimal=" + preferenciaAnimal + ", historicoAdocoes_adotante="
                + historicoAdocoes_adotante + ", getId()=" + getId() + ", getNome()=" + getNome()
                + ", getPreferenciaAnimal()=" + getPreferenciaAnimal() + ", getCpf()=" + getCpf()
                + ", getDataNascimento()=" + getDataNascimento() + ", getHistoricoAdocoes_adotante()="
                + getHistoricoAdocoes_adotante() + ", getEmail()=" + getEmail() + ", getSenha()=" + getSenha()
                + ", getEndereco()=" + getEndereco() + ", getTelefone()=" + getTelefone() + ", getGenero()="
                + getGenero() + ", isAtiva()=" + isAtiva() + "]";
    }

    

    
}
