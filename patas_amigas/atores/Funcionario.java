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
            String telefone, String genero, boolean ativa, boolean isFuncionario, boolean isAdotante, boolean isTutor,
            int idFunc, String dataContratacao, String cargo, double salario, String departamento) {
        super(nome, cpf, dataNascimento, email, senha, endereco, telefone, genero, ativa, isFuncionario, isAdotante,
                isTutor);
        this.idFunc = idStatic++;
        this.dataContratacao = dataContratacao;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
    }

    public Funcionario(Pessoa pessoa, String dataContratacao, String cargo, double salario, String departamento) {
        super(pessoa.getId() ,pessoa.getNome(), pessoa.getCpf(), pessoa.getDataNascimento(), pessoa.getEmail(), pessoa.getSenha(), 
        pessoa.getEndereco(), pessoa.getTelefone(), pessoa.getGenero(), pessoa.isAtiva(), 
        pessoa.isFuncionario(), pessoa.isAdotante(),pessoa.isTutor());
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
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + idFunc;
        result = prime * result + ((dataContratacao == null) ? 0 : dataContratacao.hashCode());
        result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
        long temp;
        temp = Double.doubleToLongBits(salario);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((departamento == null) ? 0 : departamento.hashCode());
        return result;
    }


    @Override
    public String toString() {
        return "\nFuncionario " + idFunc + "\nnome: "+ getNome() +"\ndataContratacao: " + dataContratacao + "\ncargo: " + cargo
                + "\nsalario: " + salario + "\ndepartamento: " + departamento;
    }

    

    

}
