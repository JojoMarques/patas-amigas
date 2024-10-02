package patas_amigas.atores;

public class Pessoa{

    private static int idStatic = 1;
    private int id;
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String email;
    private String senha;
    private String endereco;
    private String telefone;
    private String genero;
    private boolean ativa;

    private boolean isFuncionario;
    private boolean isTutor;
    private boolean isAdotante;

  
    public Pessoa(String nome, String cpf, String dataNascimento, String email, String senha, String endereco,
            String telefone, String genero, boolean ativa, boolean isFuncionario, boolean isAdotante, boolean isTutor) {
        this.id = idStatic++;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
        this.telefone = telefone;
        this.genero = genero;
        this.ativa = ativa;
        this.isFuncionario = isFuncionario;
        this.isAdotante = isAdotante;
        this.isTutor = isTutor;
    }

    public Pessoa() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public boolean isFuncionario() {
        return isFuncionario;
    }

    public void setFuncionario(boolean isFuncionario) {
        this.isFuncionario = isFuncionario;
    }

    public boolean isTutor() {
        return isTutor;
    }

    public void setTutor(boolean isTutor) {
        this.isTutor = isTutor;
    }

    public boolean isAdotante() {
        return isAdotante;
    }

    public void setAdotante(boolean isAdotante) {
        this.isAdotante = isAdotante;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
        result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((senha == null) ? 0 : senha.hashCode());
        result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
        result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + (ativa ? 1231 : 1237);
        result = prime * result + (isFuncionario ? 1231 : 1237);
        result = prime * result + (isTutor ? 1231 : 1237);
        result = prime * result + (isAdotante ? 1231 : 1237);
        return result;
    }


    @Override
    public String toString() {
        return "Pessoa " + id + "\nnome:" + nome + "\ncpf:" + cpf + "\ndataNascimento:" + dataNascimento
                + "\nemail:" + email + "\nsenha:" + senha + "\nendereco:" + endereco + "\ntelefone:" + telefone
                + "\ngenero:" + genero + "\nativa:" + ativa + "\nisFuncionario:" + isFuncionario + "\nisTutor:"
                + isTutor + "\nisAdotante:" + isAdotante;
    }

   
    

 

}

    
    
