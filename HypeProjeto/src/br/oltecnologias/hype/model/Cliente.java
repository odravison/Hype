package br.oltecnologias.hype.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

@Entity
public class Cliente extends Pessoa {
    
    @Id
    private String cpf;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar ultimaMedicao;
    
    @OneToOne
    private Endereco endereco;
    
    @OneToOne
    private Medidas medidas;
    private String rg;
    
    @Column(nullable = true)
    private String telefone;
    
    private String celular;
    
    @OneToMany
    private List<Locacao> locacoes;

    public Cliente() {
    }

    public Cliente(String cpf, String nome, Endereco endereco, Medidas medidas, String rg, String telefone, String celular) {
        super(nome);
        this.cpf = cpf;
        this.endereco = endereco;
        this.medidas = medidas;
        this.rg = rg;
        this.celular = celular;
        this.telefone = telefone;
        this.locacoes = new ArrayList<Locacao>();
        this.ultimaMedicao = Calendar.getInstance();
    }

    @Override
    public String getDescricao() {
        return "Cliente: " + super.getNome() + "\n"
                + "Endereço: " + this.endereco + "\n"
                + "CPF: " + this.cpf + "\n"
                + "RG: " + this.rg + "\n"
                + "telefone: " + this.telefone + "\n"
                + "celular: " + this.celular + "\n"
                + "Medidas: " + this.medidas.toString();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Calendar getUltimaMedicao() {
        return ultimaMedicao;
    }

    public void setUltimaMedicao(Calendar ultimaMedicao) {
        this.ultimaMedicao = ultimaMedicao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Medidas getMedidas() {
        return medidas;
    }

    public void setMedidas(Medidas medidas) {
        this.medidas = medidas;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void adicionarLocacao(Locacao locacao) {
        this.locacoes.add(locacao);
    }

    public void removerLocacao(Locacao locacao) {
        for (Locacao l : this.locacoes) {
            if (l.getId() == locacao.getId()) {
                this.locacoes.remove(l);
                break;
            }
        }
    }

    public List<Locacao> getLocacoes() {
        return locacoes;
    }

    public void setLocacoes(List<Locacao> locacoes) {
        this.locacoes = locacoes;
    }

}
