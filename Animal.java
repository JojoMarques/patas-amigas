import java.util.ArrayList;

public class Animal {

    private static int idStatic = 1;
    private int idAnimal;
    private String nome;
    private String especie;
    private String raca;
    private int idade;
    private String sexo;
    private ArrayList<String> historicoMedico_animal = new ArrayList<>();
    private String dataResgate;
    //private ?? foto;
    private String status;

    public Animal(int idAnimal, String nome, String especie, String raca, int idade, String sexo,
            ArrayList<String> historicoMedico_animal, String dataResgate, String status) {
        this.idAnimal = idAnimal;
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.sexo = sexo;
        this.historicoMedico_animal = historicoMedico_animal;
        this.dataResgate = dataResgate;
        this.status = status;
    }

    public static int getIdStatic() {
        return idStatic;
    }

    public static void setIdStatic(int idStatic) {
        Animal.idStatic = idStatic;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public ArrayList<String> getHistoricoMedico_animal() {
        return historicoMedico_animal;
    }

    public void setHistoricoMedico_animal(ArrayList<String> historicoMedico_animal) {
        this.historicoMedico_animal = historicoMedico_animal;
    }

    public String getDataResgate() {
        return dataResgate;
    }

    public void setDataResgate(String dataResgate) {
        this.dataResgate = dataResgate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Animal [idAnimal=" + idAnimal + ", nome=" + nome + ", especie=" + especie + ", raca=" + raca
                + ", idade=" + idade + ", sexo=" + sexo + ", historicoMedico_animal=" + historicoMedico_animal
                + ", dataResgate=" + dataResgate + ", status=" + status + "]";
    }

    
}
