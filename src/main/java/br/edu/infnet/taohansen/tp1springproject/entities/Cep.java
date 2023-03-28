package br.edu.infnet.taohansen.tp1springproject.entities;

public class Cep {

    private String cep;
    private String estado;

    private String cidade;
    private String bairro;

    private String rua;

    public Cep(){
    }

    public Cep(CepDTO dto) {
        this.cep = dto.cep;
        this.estado = dto.estado;
        this.cidade = dto.cidade;
        this.bairro = dto.bairro;
        this.rua = dto.rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
}
