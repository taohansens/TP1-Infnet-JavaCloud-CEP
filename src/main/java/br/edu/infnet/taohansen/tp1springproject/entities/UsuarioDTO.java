package br.edu.infnet.taohansen.tp1springproject.entities;

public class UsuarioDTO {

    private long id;
    private String nameForm;
    private String emailForm;
    private String phoneForm;
    private String cepForm;
    private String addressForm;

    public UsuarioDTO() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameForm() {
        return nameForm;
    }

    public void setNameForm(String nameForm) {
        this.nameForm = nameForm;
    }

    public String getEmailForm() {
        return emailForm;
    }

    public void setEmailForm(String emailForm) {
        this.emailForm = emailForm;
    }

    public String getPhoneForm() {
        return phoneForm;
    }

    public void setPhoneForm(String phoneForm) {
        this.phoneForm = phoneForm;
    }

    public String getCepForm() {
        return cepForm;
    }

    public void setCepForm(String cepForm) {
        this.cepForm = cepForm;
    }

    public String getAddressForm() {
        return addressForm;
    }

    public void setAddressForm(String addressForm) {
        this.addressForm = addressForm;
    }
}
