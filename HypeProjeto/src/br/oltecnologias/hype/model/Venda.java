package br.oltecnologias.hype.model;

import br.oltecnologias.hype.controller.GerenciadorDoSistema;
import br.oltecnologias.hype.exception.ProdutoInexistenteException;
import br.oltecnologias.hype.exception.VendaInexistenteException;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Venda implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="fk_venda")
    private List<ProdutoVendido> produtosVendidos;
    
    private double valor;
    
    private String formaDePagamento;
    
    @Temporal(TemporalType.DATE)
    private Calendar dataVenda;
    
    private int quantidadeParcelas;

    private double entrada;
    
    private int percentualDesconto;
    
    private double jaPago;
    

    public Venda() {
    }

    /**
     *
     * @param produtos
     * @param valor
     * @param formaDePagamento
     * @param dataVenda
     * @param quantidadeParcelas
     * @param entrada
     */
    
    public Venda(List<ProdutoVendido> produtos, double valor, String formaDePagamento, 
            Calendar dataVenda, int quantidadeParcelas, double entrada, int percentualDesconto) {
        this.produtosVendidos = produtos;
        this.valor = valor;
        this.formaDePagamento = formaDePagamento;
        this.dataVenda = dataVenda;
        this.quantidadeParcelas = quantidadeParcelas;
        this.entrada = entrada;
        this.percentualDesconto = percentualDesconto;
        if (formaDePagamento.toUpperCase().equals("À VISTA")){
            this.valor = valor - (valor*Configuracao.getInstance().getDescontoAVista());
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<ProdutoVendido> getProdutosVendidos() {
        return produtosVendidos;
    }

    public void setProdutos(List<ProdutoVendido> produtosVendidos) {
        this.produtosVendidos = produtosVendidos;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public String getValorInString() {
        return new DecimalFormat("#.##").format(this.valor);
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }
    
    public Calendar getDataVenda() {
        return this.dataVenda;
    }
    
    public int getQuantidadeParcelas() {
        return quantidadeParcelas;
    }

    public void setQuantidadeParcelas(int quantidadeParcelas) {
        this.quantidadeParcelas = quantidadeParcelas;
    }

    public double getEntrada() {
        return entrada;
    }

    public void setEntrada(double entrada) {
        this.entrada = entrada;
    }
    
    public String getEntradaInString() {
        return new DecimalFormat("#.##").format(this.entrada);
    }

    public String getDataVendaInString() {
        return new SimpleDateFormat("dd/MM/yyyy").format(this.dataVenda.getTime());
    }
    
    public int getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(int percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public double getJaPago() {
        return jaPago;
    }

    public void setJaPago(double jaPago) {
        this.jaPago = jaPago;
    }
    
    public void addValorJaPago(double valorDessePagamento){
        this.jaPago += valorDessePagamento;
    }

    public void gerarEImprimirRecibo() throws ProdutoInexistenteException, VendaInexistenteException {
        GeradorDeRecibo.getInstance().gerarReciboDeVenda(this);
    }
    
    public void gerarEImprimirPxRecibo(double valorDessePagamento) throws VendaInexistenteException, ProdutoInexistenteException{
        GeradorDeRecibo.getInstance().gerarEImprimirPxReciboDeVenda(this, valorDessePagamento);
    }
    
    

}
