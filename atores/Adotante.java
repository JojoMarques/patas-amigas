package atores;

import java.util.ArrayList;

public class Adotante extends Pessoa {
    
    private static int idStatic = 1;
    private int id;
    private String preferenciaAnimal;
    private ArrayList<String> historicoAdocoes_adotante = new ArrayList<>();

    public Adotante(int id, String nome, String cpf, String dataNascimento, String email, String senha, String endereco,
            String telefone, String genero, int id2, String preferenciaAnimal,
            ArrayList<String> historicoAdocoes_adotante) {
        super(id, nome, cpf, dataNascimento, email, senha, endereco, telefone, genero);
        id = id2;
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
                + historicoAdocoes_adotante + "]";
    }

    
}
