/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.oltecnologias.hype.gui;

import br.oltecnologias.hype.controller.GerenciadorDeLocacao;
import br.oltecnologias.hype.controller.GerenciadorDePessoas;
import br.oltecnologias.hype.controller.GerenciadorDeProduto;
import br.oltecnologias.hype.controller.GerenciadorDoSistema;
import br.oltecnologias.hype.exception.ClienteInexistenteException;
import br.oltecnologias.hype.exception.ProdutoInexistenteException;
import br.oltecnologias.hype.exception.TemporadaInexistenteException;
import br.oltecnologias.hype.model.Cliente;
import br.oltecnologias.hype.model.Configuracao;
import br.oltecnologias.hype.model.Locacao;
import br.oltecnologias.hype.model.Movimentacao;
import br.oltecnologias.hype.model.Produto;
import br.oltecnologias.hype.model.ProdutoLocado;
import java.awt.Dialog;
import java.awt.Frame;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;


import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luender Lima
 */
public class RealizarLocacaoDialog extends java.awt.Dialog {

    
     public RealizarLocacaoDialog(Frame owner) {
        super(owner);
        initComponents();
        locador = null;
        valorTotalLocacao = 0;
        produtosLocados = new ArrayList<ProdutoLocado>();
        pane = new JOptionPane();
        dialog = null;
        pane.setMessageType(JOptionPane.WARNING_MESSAGE);
        dialog = pane.createDialog("Aviso");
        dialog.setAlwaysOnTop(true);
        produtosEmEstoque = GerenciadorDeProduto.getInstance().getProdutosDeLocacao();
        decimalFormat = new DecimalFormat("#.##");
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelLocador = new javax.swing.JPanel();
        labelCliente = new javax.swing.JLabel();
        botaoSelecionarCliente = new javax.swing.JButton();
        labelNomeCliente = new javax.swing.JLabel();
        botaoCancelar = new javax.swing.JButton();
        botaoConcluir = new javax.swing.JButton();
        labelValorTotal = new javax.swing.JLabel();
        painelSelecionar = new javax.swing.JPanel();
        botaoSelecionarProdutos = new javax.swing.JButton();
        campoPesquisar = new javax.swing.JTextField();
        botaoBuscar = new javax.swing.JButton();
        scPnProdutos = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        painelProdutos = new javax.swing.JPanel();
        botaoRemover = new javax.swing.JButton();
        scPnTabelaProdutosLocados = new javax.swing.JScrollPane();
        tabelaProdutosLocados = new javax.swing.JTable();
        painelContrato = new javax.swing.JPanel();
        labelDataInicial = new javax.swing.JLabel();
        dateDataInicialContrato = new com.toedter.calendar.JDateChooser();
        labelDataFinal = new javax.swing.JLabel();
        dateDataFinalContrato = new com.toedter.calendar.JDateChooser();
        labelMensagemContrato = new javax.swing.JLabel();
        labelDesconto = new javax.swing.JLabel();
        campoPercentualDesconto = new javax.swing.JTextField();
        labelSimboloPorcentagem = new javax.swing.JLabel();
        labelValorLocacao = new javax.swing.JLabel();
        painelFormaPagamento = new javax.swing.JPanel();
        radioAVista = new javax.swing.JRadioButton();
        radioCartao = new javax.swing.JRadioButton();
        radioPromissoria = new javax.swing.JRadioButton();
        labelEntrada = new javax.swing.JLabel();
        campoEntrada = new javax.swing.JTextField();
        labelParcelas = new javax.swing.JLabel();
        campoParcelas = new javax.swing.JTextField();
        radioCredito = new javax.swing.JRadioButton();
        radioDebito = new javax.swing.JRadioButton();

        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1366, 620));
        setResizable(false);
        setTitle("Realizar Locação");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        painelLocador.setBackground(new java.awt.Color(255, 255, 255));
        painelLocador.setBorder(javax.swing.BorderFactory.createTitledBorder("Locador"));
        painelLocador.setPreferredSize(new java.awt.Dimension(568, 79));
        painelLocador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelLocadorMouseClicked(evt);
            }
        });

        labelCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelCliente.setText("Cliente:*");

        botaoSelecionarCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoSelecionarCliente.setText("Pesquisar");
        botaoSelecionarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoSelecionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSelecionarClienteActionPerformed(evt);
            }
        });

        labelNomeCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNomeCliente.setPreferredSize(new java.awt.Dimension(10, 6));

        javax.swing.GroupLayout painelLocadorLayout = new javax.swing.GroupLayout(painelLocador);
        painelLocador.setLayout(painelLocadorLayout);
        painelLocadorLayout.setHorizontalGroup(
            painelLocadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLocadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoSelecionarCliente)
                .addContainerGap())
        );
        painelLocadorLayout.setVerticalGroup(
            painelLocadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLocadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelLocadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelNomeCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoSelecionarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        botaoCancelar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botaoCancelar.setText("Cancelar");
        botaoCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoCancelar.setIcon(new ImageIcon("Imagens\\Cancelar.png"));
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        botaoConcluir.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botaoConcluir.setText("Concluir");
        botaoConcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoConcluir.setIcon(new ImageIcon("Imagens\\Salvar.png"));
        botaoConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConcluirActionPerformed(evt);
            }
        });

        labelValorTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelValorTotal.setText("Valor Total: ");

        painelSelecionar.setBackground(new java.awt.Color(255, 255, 255));
        painelSelecionar.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecionar Produtos"));
        painelSelecionar.setPreferredSize(new java.awt.Dimension(564, 238));
        painelSelecionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelSelecionarMouseClicked(evt);
            }
        });

        botaoSelecionarProdutos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoSelecionarProdutos.setText("Selecionar");
        botaoSelecionarProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoSelecionarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSelecionarProdutosActionPerformed(evt);
            }
        });

        campoPesquisar.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        campoPesquisar.setForeground(new java.awt.Color(204, 204, 255));
        campoPesquisar.setText("Pesquisar Produto");
        campoPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoPesquisarMouseClicked(evt);
            }
        });
        campoPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoPesquisarKeyTyped(evt);
            }
        });

        botaoBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoBuscar.setText("Pesquisar");
        botaoBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscarActionPerformed(evt);
            }
        });

        scPnProdutos.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scPnProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        scPnProdutos.setPreferredSize(new java.awt.Dimension(478, 402));

        tabelaProdutos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabelaProdutos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        //Define a fonte do cabeçalho da tabela de produtos
        tabelaProdutos.getTableHeader().setFont(new java.awt.Font("Tahoma", 0, 14));
        // Altura das linhas
        tabelaProdutos.setRowHeight(20);

        String[] nomesColunasTabelaProdutos = {"Código", "Descrição", "Qtd"};
        //Essa lista terá as linhas da tabela
        List<Object[]> listaLinhasProdutos = new ArrayList<>();

        //Adicionando valores nas linhas
        for (Produto produto : GerenciadorDeProduto.getInstance().getProdutosDeLocacao()) {
            listaLinhasProdutos.add(new Object[]{produto.getCodigo(), produto.getDescricao(), produto.getQuantidade()});
        }
        //cria um defaultablemodel com as informações acima
        modeloTabelaProdutos = new DefaultTableModel(
            listaLinhasProdutos.toArray(new Object[listaLinhasProdutos.size()][]), nomesColunasTabelaProdutos){

            boolean[] canEdit = new boolean [] {false, false, false};

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex){
                return canEdit [columnIndex];
            }

        };

        //define o model da tabela
        tabelaProdutos.setModel(modeloTabelaProdutos);
        // Redimensionando a largura da coluna de código
        tabelaProdutos.getColumnModel().getColumn(0).setPreferredWidth(80);
        // Redimensionando a largura da coluna de descrição
        tabelaProdutos.getColumnModel().getColumn(1).setPreferredWidth(387);
        // Redimensionando a largura da coluna de finalidade
        tabelaProdutos.getColumnModel().getColumn(2).setPreferredWidth(40);
        tabelaProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProdutosMouseClicked(evt);
            }
        });
        scPnProdutos.setViewportView(tabelaProdutos);

        javax.swing.GroupLayout painelSelecionarLayout = new javax.swing.GroupLayout(painelSelecionar);
        painelSelecionar.setLayout(painelSelecionarLayout);
        painelSelecionarLayout.setHorizontalGroup(
            painelSelecionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSelecionarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelSelecionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoPesquisar)
                    .addComponent(scPnProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE))
                .addGroup(painelSelecionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelSelecionarLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(botaoSelecionarProdutos))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSelecionarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoBuscar)))
                .addContainerGap())
        );
        painelSelecionarLayout.setVerticalGroup(
            painelSelecionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSelecionarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelSelecionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoBuscar))
                .addGap(18, 18, 18)
                .addGroup(painelSelecionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelSelecionarLayout.createSequentialGroup()
                        .addComponent(botaoSelecionarProdutos)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(scPnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        painelProdutos.setBackground(new java.awt.Color(255, 255, 255));
        painelProdutos.setBorder(javax.swing.BorderFactory.createTitledBorder("Produtos Locados"));
        painelProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelProdutosMouseClicked(evt);
            }
        });

        botaoRemover.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoRemover.setText("Remover");
        botaoRemover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverActionPerformed(evt);
            }
        });

        scPnTabelaProdutosLocados.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scPnTabelaProdutosLocados.setPreferredSize(new java.awt.Dimension(532, 402));

        tabelaProdutosLocados.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        //Define a fonte do cabeçalho da tabela de produtos
        tabelaProdutosLocados.getTableHeader().setFont(new java.awt.Font("Tahoma", 0, 14));
        // Altura das linhas
        tabelaProdutosLocados.setRowHeight(20);

        String[] nomesColunasTabelaProdutosLocados = {"Código", "Descrição", "Qtd"};
        //Essa lista terá as linhas da tabela
        List<Object[]> listaLinhasProdutosLocados = new ArrayList<>();

        //cria um defaultablemodel com as informações acima
        modeloTabelaProdutosLocados = new DefaultTableModel(
            listaLinhasProdutosLocados.toArray(new Object[listaLinhasProdutosLocados.size()][]), nomesColunasTabelaProdutosLocados){

            boolean[] canEdit = new boolean [] {false, false, false};

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex){
                return canEdit [columnIndex];
            }

        };

        //define o model da tabela
        tabelaProdutosLocados.setModel(modeloTabelaProdutosLocados);
        // Redimensionando a largura da coluna de código
        tabelaProdutosLocados.getColumnModel().getColumn(0).setPreferredWidth(80);
        // Redimensionando a largura da coluna de descrição
        tabelaProdutosLocados.getColumnModel().getColumn(1).setPreferredWidth(387);
        // Redimensionando a largura da coluna de finalidade
        tabelaProdutosLocados.getColumnModel().getColumn(2).setPreferredWidth(40);
        tabelaProdutosLocados.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabelaProdutosLocados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProdutosLocadosMouseClicked(evt);
            }
        });
        scPnTabelaProdutosLocados.setViewportView(tabelaProdutosLocados);

        javax.swing.GroupLayout painelProdutosLayout = new javax.swing.GroupLayout(painelProdutos);
        painelProdutos.setLayout(painelProdutosLayout);
        painelProdutosLayout.setHorizontalGroup(
            painelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scPnTabelaProdutosLocados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoRemover)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelProdutosLayout.setVerticalGroup(
            painelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoRemover)
                    .addComponent(scPnTabelaProdutosLocados, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelContrato.setBackground(new java.awt.Color(255, 255, 255));
        painelContrato.setBorder(javax.swing.BorderFactory.createTitledBorder("Contrato"));
        painelContrato.setPreferredSize(new java.awt.Dimension(571, 130));

        labelDataInicial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelDataInicial.setText("Data Inicial:*");

        labelDataFinal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelDataFinal.setText("Data Final:*");

        labelMensagemContrato.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelMensagemContrato.setText("Informe a duração do contrato:");

        javax.swing.GroupLayout painelContratoLayout = new javax.swing.GroupLayout(painelContrato);
        painelContrato.setLayout(painelContratoLayout);
        painelContratoLayout.setHorizontalGroup(
            painelContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelContratoLayout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(painelContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelMensagemContrato)
                    .addGroup(painelContratoLayout.createSequentialGroup()
                        .addComponent(labelDataInicial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateDataInicialContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(labelDataFinal)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateDataFinalContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        painelContratoLayout.setVerticalGroup(
            painelContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelContratoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelMensagemContrato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(painelContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateDataFinalContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateDataInicialContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDataInicial)
                    .addComponent(labelDataFinal))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        labelDesconto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelDesconto.setText("Desconto:");

        campoPercentualDesconto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoPercentualDesconto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoPercentualDescontoKeyTyped(evt);
            }
        });

        labelSimboloPorcentagem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelSimboloPorcentagem.setText("%");

        labelValorLocacao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelValorLocacao.setForeground(new java.awt.Color(0, 153, 0));

        painelFormaPagamento.setBackground(new java.awt.Color(255, 255, 255));
        painelFormaPagamento.setBorder(javax.swing.BorderFactory.createTitledBorder("Forma de Pagamento"));
        painelFormaPagamento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        painelFormaPagamento.setPreferredSize(new java.awt.Dimension(636, 130));

        radioAVista.setBackground(new java.awt.Color(255, 255, 255));
        radioAVista.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioAVista.setSelected(true);
        radioAVista.setText("À Vista");
        radioAVista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radioAVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAVistaActionPerformed(evt);
            }
        });
        radioAVista.setSelected(true);
        labelEntrada.setVisible(false);
        labelParcelas.setVisible(false);
        campoEntrada.setVisible(false);
        campoParcelas.setVisible(false);

        radioCartao.setBackground(new java.awt.Color(255, 255, 255));
        radioCartao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioCartao.setText("Cartão");
        radioCartao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radioCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCartaoActionPerformed(evt);
            }
        });

        radioPromissoria.setBackground(new java.awt.Color(255, 255, 255));
        radioPromissoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioPromissoria.setText("Promissória");
        radioPromissoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radioPromissoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPromissoriaActionPerformed(evt);
            }
        });

        labelEntrada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelEntrada.setText("Entrada: R$");

        campoEntrada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        labelParcelas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelParcelas.setText("Qtd. Parcelas:*");

        campoParcelas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        radioCredito.setBackground(new java.awt.Color(255, 255, 255));
        radioCredito.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioCredito.setText("Crédito");
        radioCredito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radioCredito.setVisible(false);
        radioCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCreditoActionPerformed(evt);
            }
        });

        radioDebito.setBackground(new java.awt.Color(255, 255, 255));
        radioDebito.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioDebito.setSelected(true);
        radioDebito.setText("Débito");
        radioDebito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radioDebito.setVisible(false);
        radioDebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDebitoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelFormaPagamentoLayout = new javax.swing.GroupLayout(painelFormaPagamento);
        painelFormaPagamento.setLayout(painelFormaPagamentoLayout);
        painelFormaPagamentoLayout.setHorizontalGroup(
            painelFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFormaPagamentoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelFormaPagamentoLayout.createSequentialGroup()
                        .addComponent(labelEntrada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(labelParcelas))
                    .addGroup(painelFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelFormaPagamentoLayout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(radioCredito)
                            .addGap(77, 77, 77)
                            .addComponent(radioDebito))
                        .addGroup(painelFormaPagamentoLayout.createSequentialGroup()
                            .addComponent(radioAVista)
                            .addGap(18, 18, 18)
                            .addComponent(radioCartao)
                            .addGap(18, 18, 18)
                            .addComponent(radioPromissoria))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelFormaPagamentoLayout.setVerticalGroup(
            painelFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFormaPagamentoLayout.createSequentialGroup()
                .addGroup(painelFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioAVista)
                    .addComponent(radioCartao)
                    .addComponent(radioPromissoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                .addGroup(painelFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioCredito)
                    .addComponent(radioDebito))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(painelFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEntrada)
                    .addComponent(campoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelParcelas)
                    .addComponent(campoParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(painelSelecionar, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                        .addComponent(painelFormaPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(labelValorTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelValorLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelDesconto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoPercentualDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelSimboloPorcentagem)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(botaoConcluir)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botaoCancelar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(painelContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(painelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(painelLocador, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(painelLocador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(painelSelecionar, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoCancelar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoConcluir)
                        .addComponent(labelValorTotal)
                        .addComponent(labelDesconto)
                        .addComponent(campoPercentualDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelSimboloPorcentagem)
                        .addComponent(labelValorLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConcluirActionPerformed
        
        try {
            String formaPagamento = "";
            
            if(labelNomeCliente.getText().length() <= 0) {
                pane.setMessage("Selecione o cliente que irá realizar a locação");
                dialog.setVisible(true);
                
            } else if(produtosLocados.size() <= 0) {
                pane.setMessage("Selecione os produtos para a locação");
                dialog.setVisible(true);
                
            } else if(campoPercentualDesconto.getText().length() > 0 && Integer.parseInt(campoPercentualDesconto.getText()) > 100) { 
                pane.setMessage("O percentual de desconto não pode estar acima de 100%");
                dialog.setVisible(true);
            } else if (!radioAVista.isSelected() && !radioCartao.isSelected() && !radioPromissoria.isSelected()) {
                pane.setMessage("Informe a forma de pagamento da locação");
                dialog.setVisible(true);
                
            } else if (radioCartao.isSelected() && !radioCredito.isSelected() && !radioDebito.isSelected()) {
                pane.setMessage("Informe a forma de pagamento da locação");
                dialog.setVisible(true);
                    
            } else if ((radioCartao.isSelected() || radioPromissoria.isSelected()) && campoParcelas.getText().length() <= 0) {
                pane.setMessage("Informe a quantidade de parcelas da locação");
                dialog.setVisible(true);

            } else {
                
                //Se o campo de desconto estiver em branco, a locação terá 0% de desconto
                if (campoPercentualDesconto.getText().length() <= 0) {
                    campoPercentualDesconto.setText("0");
                }
                //Se o campo de entrada estiver em branco, a locação terá R$ 0 de entrada
                if (campoEntrada.getText().length() <= 0) {
                    campoEntrada.setText("0");
                }
                //Se o campo de parcelas estiver em branco, a quantidade de parcelas será 0
                if (campoParcelas.getText().length() <= 0) {
                    campoParcelas.setText("0");
                }
                
                if (radioCartao.isSelected()) {
                    formaPagamento = "Cartão";
                } else if (radioPromissoria.isSelected()) {
                    formaPagamento = "Promissória";
                } else {
                    formaPagamento = "À Vista";
                    campoEntrada.setText("0");
                    campoParcelas.setText("0");
                }

                Calendar dataInicial = Calendar.getInstance();
                Calendar dataFinal = Calendar.getInstance();

                dataInicial.setTime(dateDataInicialContrato.getDate());
                dataFinal.setTime(dateDataFinalContrato.getDate());

                try {
                    novaLocacao = GerenciadorDeLocacao.getInstance().realizarLocacao(locador, produtosLocados, valorTotalLocacao, dataInicial,
                            dataFinal, formaPagamento, Integer.parseInt(campoParcelas.getText()),
                            Float.parseFloat(campoEntrada.getText()), Integer.parseInt(campoPercentualDesconto.getText()));

                    //mudar o método
                    novaMovimentacao = GerenciadorDoSistema.getInstance().adicionarMovimentacao(novaLocacao, "LOCAÇÃO");
                    
                    JOptionPane pane = new JOptionPane();
                    pane.setMessage("Locação realizada com sucesso!\n\nImprimindo contrato...");
                    pane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
                    Dialog dialogMessage = pane.createDialog("Mensagem");
                    dialogMessage.setAlwaysOnTop(true);
                    dialogMessage.setVisible(true);

                    //O botão concluir foi selecionado
                    concluirSelecionado = true;
                    //Fecha janela
                    setVisible(false);

                } catch (Exception e) {
                    pane.setMessage(e.getMessage());
                    dialog.setVisible(true);
                }
                                        
            }
        } catch(Exception e) {
            pane.setMessage("Informe corretamente todos os dados necessários");
            dialog.setVisible(true);
        }
        
    }//GEN-LAST:event_botaoConcluirActionPerformed

    private void botaoSelecionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSelecionarClienteActionPerformed
        PesquisarClienteDialog dialog = new PesquisarClienteDialog(null);
        dialog.setLocationRelativeTo(null);
        if (dialog.alterarDados()) {
            labelNomeCliente.setText(dialog.getNomeClienteSelecionado());
            try {
                locador = GerenciadorDePessoas.getInstance().pesquisarCliente(dialog.getCpfLocador());
            } catch (ClienteInexistenteException e) {
                JOptionPane pane = new JOptionPane();
                pane.setMessage(e.getMessage());
                pane.setMessageType(JOptionPane.WARNING_MESSAGE);
                JDialog messageDialog = pane.createDialog("Aviso");
                messageDialog.setAlwaysOnTop(true);
                messageDialog.setVisible(true);
            }
        }
        dialog.dispose();
    }//GEN-LAST:event_botaoSelecionarClienteActionPerformed

    private void campoPesquisarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPesquisarKeyTyped
        if(campoPesquisar.getText().equals("Pesquisar Produto")) 
            eliminarTextoDeCampo(campoPesquisar);
        
    }//GEN-LAST:event_campoPesquisarKeyTyped

    private void campoPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoPesquisarMouseClicked
        if(campoPesquisar.getText().equals("Pesquisar Produto")) 
            eliminarTextoDeCampo(campoPesquisar);
        
    }//GEN-LAST:event_campoPesquisarMouseClicked

    private void painelSelecionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelSelecionarMouseClicked
        if(campoPesquisar.getText().length() <= 0) 
            criarTextoEmCampo(campoPesquisar, "Pesquisar Produto");
        
    }//GEN-LAST:event_painelSelecionarMouseClicked

    private void botaoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscarActionPerformed
        if(campoPesquisar.getText().length() <= 0) {
            JOptionPane pane = new JOptionPane();
            pane.setMessage("É preciso informar o nome ou o código do produto para a pesquisa");
            pane.setMessageType(JOptionPane.WARNING_MESSAGE);
            JDialog messageDialog = pane.createDialog("Aviso");
            messageDialog.setAlwaysOnTop(true);
            messageDialog.setVisible(true);
        } else {
            for (Produto produto : GerenciadorDeProduto.getInstance().pesquisarProdutosDeLocacaoPeloNome(campoPesquisar.getText())) {
                modeloTabelaProdutos.addRow(new Object[]{produto.getCodigo(), produto.getDescricao(), produto.getQuantidade()});
            }
        }
    }//GEN-LAST:event_botaoBuscarActionPerformed

    private void botaoSelecionarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSelecionarProdutosActionPerformed
        if(tabelaProdutos.getSelectedRow() < 0) {
            pane.setMessage("Selecione um produto na lista para poder adicioná-lo aos produtos locados");
            dialog.setVisible(true);
        } else {
            try {
                adicionarProdutoALocacao(GerenciadorDeProduto.getInstance().pesquisarProdutoPeloCodigo(
                        (String) modeloTabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 0)));
                
                labelValorLocacao.setText("R$ "+decimalFormat.format(valorTotalLocacao));
            } catch (ProdutoInexistenteException e) {
                pane.setMessage(e.getMessage());
                dialog.setVisible(true);
            } 
        }
    }//GEN-LAST:event_botaoSelecionarProdutosActionPerformed

    private void botaoRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverActionPerformed
        if(tabelaProdutosLocados.getSelectedRow() < 0) {
            pane.setMessage("Selecione um produto para remoção");
            dialog.setVisible(true);
        } else {
            removerProdutoDaLocacao(tabelaProdutosLocados.getSelectedRow(), (String) modeloTabelaProdutos.getValueAt(tabelaProdutosLocados.getSelectedRow(), 0));
            labelValorLocacao.setText("R$ "+decimalFormat.format(valorTotalLocacao));
        }
    }//GEN-LAST:event_botaoRemoverActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        if(campoPesquisar.getText().length() <= 0) 
            criarTextoEmCampo(campoPesquisar, "Pesquisar Produto");
        
    }//GEN-LAST:event_formMouseClicked

    private void painelLocadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelLocadorMouseClicked
        if(campoPesquisar.getText().length() <= 0) 
            criarTextoEmCampo(campoPesquisar, "Pesquisar Produto");
        
    }//GEN-LAST:event_painelLocadorMouseClicked

    private void painelProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelProdutosMouseClicked
        if(campoPesquisar.getText().length() <= 0) 
            criarTextoEmCampo(campoPesquisar, "Pesquisar Produto");
        
    }//GEN-LAST:event_painelProdutosMouseClicked

    private void campoPercentualDescontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPercentualDescontoKeyTyped
        validarNumerosETamanho(evt, campoPercentualDesconto, maxCaracteresDesconto);
        try {
            System.out.println(", VALOR LOCAÇÃO: "+valorTotalLocacao+"(CAMPOPERCENTUALKEYTYPED) PERCENTUAL DE DESCONTO DA TEMPORADA: "+
                    GerenciadorDoSistema.getInstance().getPercentualDescontoTemporada()+", DESCONTO: "+
                    ((valorTotalLocacao * GerenciadorDoSistema.getInstance().getPercentualDescontoTemporada()) / 100));
                    
            labelValorLocacao.setText("R$ " + decimalFormat.format(valorTotalLocacao
                    - ((valorTotalLocacao * GerenciadorDoSistema.getInstance().getPercentualDescontoTemporada()) / 100)));
        } catch (TemporadaInexistenteException e) {
            System.out.println("ERRO: "+e.getMessage());
            //Se a temporada não existir não precisa fazer nenhum cálculo
        }
    }//GEN-LAST:event_campoPercentualDescontoKeyTyped

    private void tabelaProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutosMouseClicked
        if(evt.getClickCount() == 2){            
            try {
                adicionarProdutoALocacao(GerenciadorDeProduto.getInstance().pesquisarProdutoPeloCodigo(
                        (String) modeloTabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 0)));
                
                labelValorLocacao.setText("R$ "+decimalFormat.format(valorTotalLocacao));
            } catch (ProdutoInexistenteException e) {
                pane.setMessage(e.getMessage());
                dialog.setVisible(true);
            }
        }
    }//GEN-LAST:event_tabelaProdutosMouseClicked

    private void tabelaProdutosLocadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutosLocadosMouseClicked
        if(evt.getClickCount() == 2){            
            removerProdutoDaLocacao(tabelaProdutosLocados.getSelectedRow(), (String) modeloTabelaProdutosLocados.getValueAt(tabelaProdutosLocados.getSelectedRow(), 0));
            labelValorLocacao.setText("R$ "+decimalFormat.format(valorTotalLocacao));
        }
    }//GEN-LAST:event_tabelaProdutosLocadosMouseClicked

    private void radioAVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAVistaActionPerformed
        radioCartao.setSelected(false);
        radioPromissoria.setSelected(false);
        desabilitarCampos();
        desabilitarRadios();
    }//GEN-LAST:event_radioAVistaActionPerformed

    private void radioCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCartaoActionPerformed
        radioAVista.setSelected(false);
        radioPromissoria.setSelected(false);
        habilitarRadios();
        desabilitarCampos();
    }//GEN-LAST:event_radioCartaoActionPerformed

    private void radioPromissoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPromissoriaActionPerformed
        radioCartao.setSelected(false);
        radioAVista.setSelected(false);
        habilitarCampos();
        desabilitarRadios();
    }//GEN-LAST:event_radioPromissoriaActionPerformed

    private void radioCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCreditoActionPerformed
        radioDebito.setSelected(false);
        habilitarCampos();
    }//GEN-LAST:event_radioCreditoActionPerformed

    private void radioDebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDebitoActionPerformed
        radioCredito.setSelected(false);
        desabilitarCampos();
    }//GEN-LAST:event_radioDebitoActionPerformed
   
    public void eliminarTextoDeCampo(javax.swing.JTextField campo) {
        campo.setText("");
        campo.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        campo.setForeground(new java.awt.Color(0, 0, 0));
    }
    
    public void criarTextoEmCampo(javax.swing.JTextField campo, String mensagem) {
        campo.setText(mensagem);
        campo.setForeground(new java.awt.Color(153, 153, 153));
        campo.setFont(new java.awt.Font("Tahoma", 2, 14));
    }
    
    public void validarNumerosETamanho(java.awt.event.KeyEvent evt, javax.swing.JTextField campo, int maxCaracteres) {
        if(!numeros.contains(evt.getKeyChar()+"")){// se o carácter que gerou o evento não estiver na lista 
            evt.consume();
        }
        if(campo.getText().length()>= maxCaracteres){
            evt.consume();
        }
    }

    public void habilitarCampos() {
        labelEntrada.setVisible(true);
        labelParcelas.setVisible(true);
        campoEntrada.setVisible(true);
        campoParcelas.setVisible(true);
    }
    
    public void desabilitarCampos() {
        labelEntrada.setVisible(false);
        labelParcelas.setVisible(false);
        campoEntrada.setVisible(false);
        campoParcelas.setVisible(false);
    }
    
    public void habilitarRadios() {
        radioCredito.setSelected(false);
        radioDebito.setSelected(true);
        radioCredito.setVisible(true);
        radioDebito.setVisible(true);
    }
    
    public void desabilitarRadios() {
        radioCredito.setVisible(false);
        radioDebito.setVisible(false);
    }
    
    public boolean alterarDados() {        
        concluirSelecionado = false;  //Marcamos que o salvar não foi selecionado
        setModal(true);         //A dialog tem que ser modal. Só pode retornar do setVisible ap�s ficar invisível.
        setVisible(true);       //Mostramos a dialog e esperamos o usuário escolher alguma coisa.
        return concluirSelecionado;   //Retornamos true, se ele pressionou concluir
    }
    
    public void adicionarProdutoALocacao(Produto produto) {
        ProdutoLocado produtoLocado = getProdutoLocado(produto.getCodigo());
        if(produtoLocado != null) {
            if(getProdutoEmEstoque(produto.getCodigo()).getQuantidade() > 0) {
                //Atualiza a quantidade do produto na locação
                produtoLocado.setQuantidade(produtoLocado.getQuantidade()+1);
                //Atualiza a linha da tabela (2 = terceira coluna da tabela)
                for(int i=0; i < modeloTabelaProdutosLocados.getRowCount(); i++) {
                    if(modeloTabelaProdutosLocados.getValueAt(i, 0).equals(produto.getCodigo())) {
                        modeloTabelaProdutosLocados.setValueAt(produtoLocado.getQuantidade(), i, 2);
                        //Atualiza a quantidade de produtos em estoque
                        removerProdutoDoEstoque(tabelaProdutos.getSelectedRow(), produto.getCodigo());

                        //Atualiza o valor total da locação
                        valorTotalLocacao += produto.getValor();
                    }
                }
            } else {
                pane.setMessage("Este produto não pode ser locado! \n\nQuantidade de produtos insuficiente no estoque");
                dialog.setVisible(true);
            }
        } else {
            ProdutoLocado novoProdutoLocado = new ProdutoLocado(produto.getCodigo(), 1);
            produtosLocados.add(novoProdutoLocado);
            //Adiciona os dados do novo produto na tabela
            modeloTabelaProdutosLocados.addRow(new Object[]{produto.getCodigo(), produto.getDescricao(), novoProdutoLocado.getQuantidade()});
            //Atualiza a quantidade de produtos em estoque
            removerProdutoDoEstoque(tabelaProdutos.getSelectedRow(), produto.getCodigo());

            //Atualiza o valor total da locação
            valorTotalLocacao += produto.getValor();
        }
        
    }
    
    public void removerProdutoDaLocacao(int linhaSelecionada, String codigo) {
        ProdutoLocado produtoLocado = getProdutoLocado(codigo);
        if(produtoLocado != null) {
            //Decrementa o valor da quantidade de produtos que está no map, caso a chave já exista
            int quantidade = produtoLocado.getQuantidade()-1;  
            //Remove o produto selecionada da lista de locação
            if(quantidade == 0) {
                modeloTabelaProdutosLocados.removeRow(linhaSelecionada);
                produtosLocados.remove(produtoLocado);
            } else {
                //Atualiza o valor da coluna de quantidade (segunda coluna) da tabela de produtos locados
                modeloTabelaProdutosLocados.setValueAt(quantidade+"", linhaSelecionada, 2);
            }
            //Atualiza a quantidade do produto no estoque
            adicionarProdutoAoEstoque(codigo);
            //Atualiza a quantidade no produto referente
            produtoLocado.setQuantidade(quantidade);
            
            try {
                //Atualiza o valor total da locação
                valorTotalLocacao -= GerenciadorDeProduto.getInstance().pesquisarProdutoPeloCodigo(codigo).getValor();
            } catch (ProdutoInexistenteException e) {
                pane.setMessage(e.getMessage());
                dialog.setVisible(true);
            }
        } else {
            pane.setMessage("O produto não foi encontrado");
            dialog.setVisible(true);
        }
        
    }
    
    public ProdutoLocado getProdutoLocado(String codigo) {
        for(ProdutoLocado produto: this.produtosLocados) {
            if(produto.getId().equals(codigo)) {
                return produto;
            }
        }
        return null;
    }
    
    public void removerProdutoDoEstoque(int linhaSelecionada, String codigo) {
        int quantProdutoEmEstoque = ((Integer) modeloTabelaProdutos.getValueAt(linhaSelecionada, 2))-1;
        modeloTabelaProdutos.setValueAt(quantProdutoEmEstoque, linhaSelecionada, 2);
        //Atualiza a quantidade do produto na lista de produtos em estoque
        getProdutoEmEstoque(codigo).setQuantidade(quantProdutoEmEstoque);
    }
    
    public void adicionarProdutoAoEstoque(String codigo) {
        boolean atualizou = false;
        
        Produto produtoEmEstoque = getProdutoEmEstoque(codigo);
        
        //Atualiza a quantidade em estoque do produto
        produtoEmEstoque.setQuantidade(produtoEmEstoque.getQuantidade()+1);
        
        for (int i = 0; i < modeloTabelaProdutos.getRowCount(); i++) {
            if (modeloTabelaProdutos.getValueAt(i, 0).equals(codigo)) {
                //Atualiza a linha da tabela (2 = coluna de quantidade da tabela)
                modeloTabelaProdutos.setValueAt(produtoEmEstoque.getQuantidade(), i, 2);
                atualizou = true;
                break;
            }
        }
        
        if(!atualizou) {
            pane.setMessage("Não foi possível atualizar a quantidade em estoque do produto");
            dialog.setVisible(true);
        }
    }
    
    public Produto getProdutoEmEstoque(String codigo) {
        for(Produto produto: this.produtosEmEstoque) {
            if(produto.getCodigo().equals(codigo)) {
                return produto;
            }
        }
        return null;
    }
    
    public Locacao getNovaLocacao() {
        return novaLocacao;
    }
    
    public Movimentacao getNovaMovimentacao() {
        return novaMovimentacao;
    }

    
    private String numeros = "0987654321"; // Alguns campos não devem aceitar números
    private int maxCaracteresDesconto = 3;
    private Cliente locador;
    private ArrayList<ProdutoLocado> produtosLocados;
    private List<Produto> produtosEmEstoque;
    private double valorTotalLocacao;
    protected boolean concluirSelecionado;
    protected Locacao novaLocacao;
    private Movimentacao novaMovimentacao;
    private DefaultTableModel modeloTabelaProdutos;
    private DefaultTableModel modeloTabelaProdutosLocados;
    private DecimalFormat decimalFormat;
    private JOptionPane pane;
    private JDialog dialog;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoBuscar;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoConcluir;
    private javax.swing.JButton botaoRemover;
    private javax.swing.JButton botaoSelecionarCliente;
    private javax.swing.JButton botaoSelecionarProdutos;
    private javax.swing.JTextField campoEntrada;
    private javax.swing.JTextField campoParcelas;
    private javax.swing.JTextField campoPercentualDesconto;
    private javax.swing.JTextField campoPesquisar;
    private com.toedter.calendar.JDateChooser dateDataFinalContrato;
    private com.toedter.calendar.JDateChooser dateDataInicialContrato;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JLabel labelDataFinal;
    private javax.swing.JLabel labelDataInicial;
    private javax.swing.JLabel labelDesconto;
    private javax.swing.JLabel labelEntrada;
    private javax.swing.JLabel labelMensagemContrato;
    private javax.swing.JLabel labelNomeCliente;
    private javax.swing.JLabel labelParcelas;
    private javax.swing.JLabel labelSimboloPorcentagem;
    private javax.swing.JLabel labelValorLocacao;
    private javax.swing.JLabel labelValorTotal;
    private javax.swing.JPanel painelContrato;
    private javax.swing.JPanel painelFormaPagamento;
    private javax.swing.JPanel painelLocador;
    private javax.swing.JPanel painelProdutos;
    private javax.swing.JPanel painelSelecionar;
    private javax.swing.JRadioButton radioAVista;
    private javax.swing.JRadioButton radioCartao;
    private javax.swing.JRadioButton radioCredito;
    private javax.swing.JRadioButton radioDebito;
    private javax.swing.JRadioButton radioPromissoria;
    private javax.swing.JScrollPane scPnProdutos;
    private javax.swing.JScrollPane scPnTabelaProdutosLocados;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JTable tabelaProdutosLocados;
    // End of variables declaration//GEN-END:variables


}
