package patas_amigas.atores;

import java.util.ArrayList;

public class Adotante extends Pessoa {
    
    private static int idStatic = 1;
    private int id;
    private String preferenciaAnimal;
    private ArrayList<String> historicoAdocoes_adotante = new ArrayList<>();

    public Adotante(){

    }
    
    public Adotante(String nome, String cpf, String dataNascimento, String email, String senha, String endereco,
            String telefone, String genero, boolean ativa, boolean isFuncionario, boolean isAdotante, boolean isTutor,
            int id, String preferenciaAnimal, ArrayList<String> historicoAdocoes_adotante) {
        super(nome, cpf, dataNascimento, email, senha, endereco, telefone, genero, ativa, isFuncionario, isAdotante,
                isTutor);
        this.id = id;
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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((preferenciaAnimal == null) ? 0 : preferenciaAnimal.hashCode());
        result = prime * result + ((historicoAdocoes_adotante == null) ? 0 : historicoAdocoes_adotante.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Adotante " + "\ngetNome(): " + getNome() + id + "\npreferenciaAnimal: " + preferenciaAnimal 
            + "\nhistoricoAdocoes_adotante: " + historicoAdocoes_adotante;
    }

    
    //tem que criar campo hash para senha 
    //histórico da adoção --> na tabela 
    //busca e navegação --> filtragem pelo menos por dois requisitos  

    
}
