package Exercicio3;

public class Cliente {
    public String cpf;
    public String nome;
    public int id;

    public int getId() {
        return id;
    }

    public String getCpf()  {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) throws DadoInvalidoException {
        if(cpf.length() != 11){
            throw new DadoInvalidoException();
        }
        this.cpf = cpf;
    }

    public void setId(int id) throws DadoInvalidoException {
        if(id < 0){
            throw new DadoInvalidoException();
        }
        this.id = id;
    }

    public void setNome(String nome) throws DadoInvalidoException {
        if(nome.length() == 0 || nome.equals(" ")){
            throw new DadoInvalidoException();
        }
        this.nome = nome;
    }

}
