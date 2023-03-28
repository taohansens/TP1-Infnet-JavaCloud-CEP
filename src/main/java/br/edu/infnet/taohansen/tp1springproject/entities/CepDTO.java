package br.edu.infnet.taohansen.tp1springproject.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CepDTO {
    @JsonProperty("cep")
    public String cep;
    @JsonProperty("uf")
    public String estado;
    @JsonProperty("localidade")
    public String cidade;
    @JsonProperty("bairro")
    public String bairro;
    @JsonProperty("logradouro")
    public String rua;
    @JsonProperty("service")
    public String service;
}
