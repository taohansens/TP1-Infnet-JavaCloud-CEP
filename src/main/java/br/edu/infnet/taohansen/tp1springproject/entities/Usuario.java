package br.edu.infnet.taohansen.tp1springproject.entities;

import java.util.Objects;

public class Usuario {
    private long id;
    private String name;
    private String email;
    private String phone;
    private String cep;
    private String address;

    public Usuario() {
    }

    public Usuario(long id, String name, String email, String phone, String cep, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.cep = cep;
        this.address = address;
    }

    public Usuario(UsuarioDTO usuarioDTO) {
        id = usuarioDTO.getId();
        name = usuarioDTO.getNameForm();
        email = usuarioDTO.getEmailForm();
        phone = usuarioDTO.getPhoneForm();
        cep = usuarioDTO.getCepForm();
        address = usuarioDTO.getAddressForm();
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return id == usuario.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
