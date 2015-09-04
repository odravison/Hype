package br.oltecnologias.hype.model;

import com.itextpdf.text.DocumentException;

import java.io.IOException;
import java.io.Serializable;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.Transient;

@Entity
public class Locacao implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_locacao")
    private long id;

    @ManyToOne(fetch = FetchType.EAGER)
    private Cliente cliente;

//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinColumn(name="fk_locacao")
//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)  //o nome da propriedade de "value" que liga a esta classe  
//    @JoinColumn(name = "fk_locacao")
//    @ElementCollection
//    @MapKeyColumn(name="CODIGO")
//    @Column(name="QUANTIDADE")
//    @CollectionTable(name="locacao_produtos", joinColumns=@JoinColumn(name="id_locacao"))
//    @ElementCollection
//
//    @CollectionTable(
//            name = "PRODUTOS_LOCACAO",
//            joinColumns = @JoinColumn(name = "id_locacao"))
//    @Column(name = "produtos")
//    @ElementCollection(fetch = FetchType.EAGER)
//    @CollectionTable(name = "PRODUTOS")
//    @MapKeyColumn(name = "CODIGO")
//    @Column(name = "QUANTIDADE")
//    @ElementCollection
//    @CollectionTable(name="produtos", joinColumns=@JoinColumn(name="id_locacao"))
//    @Column(name="produtos")
//    @MapKeyJoinColumn(name="codigo", referencedColumnName="quantidade")
    
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "id")
//    @MapKeyJoinColumn(name = "codigo")
    
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_locacao")
    private List<ProdutoLocado> produtosLocados;

    private double valorLocacao;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar dataLocacao;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar dataDevolucao;

    private String formaDePagamento;

    private double valorDeEntrada = 0;

    private double jaPago = 0;

    private int parcelas;

    private boolean ativa;
    
    private int percentualDesconto;
    
    public Locacao() {
    }

    public Locacao(Cliente cliente, List<ProdutoLocado> produtosLocados, double valorLocacao, Calendar dataLocacao,
            Calendar dataDeDevolucao, String formaDePagamento, int parcelas, double valorDeEntrada, int percentualDesconto) {
        this.cliente = cliente;
        this.produtosLocados = produtosLocados;
        this.valorDeEntrada = valorDeEntrada;
        this.valorLocacao = valorLocacao;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDeDevolucao;
        this.formaDePagamento = formaDePagamento;
        if (valorDeEntrada == 0) {
            this.jaPago = valorLocacao;
        }
        this.parcelas = parcelas;
        if (formaDePagamento.equals("A VISTA")) {
            this.valorLocacao = valorLocacao - (valorLocacao * Configuracao.getInstance().getDescontoAVista());
        }
        this.ativa = true;
    }

    public void gerarContrato() throws DocumentException, IOException, Exception {
        GeradorDeContrato.getInstance().gerarContrato(this);

    }

    public void imprimirContrato() throws DocumentException, IOException, Exception {
        GeradorDeContrato.getInstance().imprimirContrato(this);
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ProdutoLocado> getProdutos() {
        return this.produtosLocados;
    }

    public void setProdutos(List<ProdutoLocado> produtosLocados) {
        this.produtosLocados = produtosLocados;
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public Calendar getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Calendar dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public void setDataDevolucao(Calendar dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Calendar getDataDevolucao() {
        return dataDevolucao;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public double getValorDeEntrada() {
        return valorDeEntrada;
    }

    public void setValorDeEntrada(double valorDeEntrada) {
        this.valorDeEntrada = valorDeEntrada;
    }

    public double getJaPago() {
        return jaPago;
    }

    public void setJaPago(double jaPago) {
        this.jaPago = jaPago;
    }

    public String getVencimento() {
        return new SimpleDateFormat("dd/MM/yyyy").format(this.dataDevolucao.getTime());
    }

    public String getContato() {
        return this.cliente.getCelular();
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public void addValorJaPago(double valorDessePagamento) {
        this.jaPago += valorDessePagamento;
    }

    public String getValorLocacaoInString() {
        return new DecimalFormat("#.##").format(this.valorLocacao);
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
    
    public String getDataLocacaoInString() {
        return new SimpleDateFormat("dd/MM/yyyy").format(this.dataLocacao.getTime());
    }
    
    public String getEntradaInString() {
        return new DecimalFormat("#.##").format(this.valorDeEntrada);
    }
    
    public int getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(int percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }
    
    public void resetarId(){
        this.id = 0;
    }
    
}
