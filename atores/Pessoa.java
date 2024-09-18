package atores;

class Pessoa{

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

    public Pessoa(int id, String nome, String cpf, String dataNascimento, String email, String senha, String endereco,
            String telefone, String genero) {
        this.id = idStatic++;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
        this.telefone = telefone;
        this.genero = genero;
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

    @Override
    public String toString() {
        return "Pessoa [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento
                + ", email=" + email + ", senha=" + senha + ", endereco=" + endereco + ", telefone=" + telefone
                + ", genero=" + genero + "]";
    }

}

    
    
