package patas_amigas.atores;

public class Funcionario extends Pessoa {
    
    private static int idStatic = 1;
    private int idFunc;
    private String dataContratacao;
    private String cargo;
    private double salario;
    private String departamento;

    public Funcionario(){
        
    }
  
    public Funcionario(String nome, String cpf, String dataNascimento, String email, String senha, String endereco,
            String telefone, String genero, boolean ativa, String dataContratacao, String cargo,
            double salario, String departamento) {
        super(nome, cpf, dataNascimento, email, senha, endereco, telefone, genero, ativa);
        this.idFunc = idStatic++;
        this.dataContratacao = dataContratacao;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
    }

    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public String getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Funcionario [idFunc=" + idFunc + ", dataContratacao=" + dataContratacao + ", cargo=" + cargo
                + ", salario=" + salario + ", departamento=" + departamento + ", getIdFunc()=" + getIdFunc()
                + ", getId()=" + getId() + ", getDataContratacao()=" + getDataContratacao() + ", getNome()=" + getNome()
                + ", getCpf()=" + getCpf() + ", getCargo()=" + getCargo() + ", getDataNascimento()="
                + getDataNascimento() + ", getSalario()=" + getSalario() + ", getEmail()=" + getEmail()
                + ", getDepartamento()=" + getDepartamento() + ", getSenha()=" + getSenha() + ", getEndereco()="
                + getEndereco() + ", getTelefone()=" + getTelefone() + ", getGenero()=" + getGenero() + ", isAtiva()="
                + isAtiva() + "]";
    }

    

}
