/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.oltecnologias.hype.gui;

import java.awt.Frame;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Luender Lima
 */
public class CadastrarUsuarioDialog extends java.awt.Dialog {

    /**
     * Creates new form CadastrarAdministradorDialog
     */
    public CadastrarUsuarioDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public CadastrarUsuarioDialog(Frame owner) {
        super(owner);
        initComponents(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelDadosGerais = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        labelNickName = new javax.swing.JLabel();
        campoNickName = new javax.swing.JTextField();
        labelSenha = new javax.swing.JLabel();
        campoSenha = new javax.swing.JPasswordField();
        radioAdm = new javax.swing.JRadioButton();
        radioFuncionario = new javax.swing.JRadioButton();
        botaoSalvar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setTitle("Cadastrar Usuário");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        painelDadosGerais.setBackground(new java.awt.Color(255, 255, 255));
        painelDadosGerais.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Gerais"));

        labelNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNome.setText("Nome:*");

        campoNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoNomeKeyTyped(evt);
            }
        });

        labelNickName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNickName.setText("NickName:*");

        campoNickName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        labelSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelSenha.setText("Senha:*");

        campoSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        radioAdm.setBackground(new java.awt.Color(255, 255, 255));
        radioAdm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioAdm.setSelected(true);
        radioAdm.setText("Administrador");
        radioAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAdmActionPerformed(evt);
            }
        });

        radioFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        radioFuncionario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioFuncionario.setText("Funcionário");
        radioFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelDadosGeraisLayout = new javax.swing.GroupLayout(painelDadosGerais);
        painelDadosGerais.setLayout(painelDadosGeraisLayout);
        painelDadosGeraisLayout.setHorizontalGroup(
            painelDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosGeraisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosGeraisLayout.createSequentialGroup()
                        .addComponent(labelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelDadosGeraisLayout.createSequentialGroup()
                        .addComponent(labelNickName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNickName, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelDadosGeraisLayout.createSequentialGroup()
                        .addComponent(labelSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDadosGeraisLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radioAdm)
                .addGap(18, 18, 18)
                .addComponent(radioFuncionario)
                .addGap(131, 131, 131))
        );
        painelDadosGeraisLayout.setVerticalGroup(
            painelDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosGeraisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNickName)
                    .addComponent(campoNickName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSenha)
                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioAdm)
                    .addComponent(radioFuncionario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botaoSalvar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botaoSalvar.setText(" Salvar ");
        botaoSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoSalvar.setIcon(new ImageIcon("Imagens\\Salvar.png"));
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoCancelar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botaoCancelar.setText("Cancelar");
        botaoCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoCancelar.setIcon(new ImageIcon("Imagens\\Cancelar.png"));
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoCancelar))
                    .addComponent(painelDadosGerais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(painelDadosGerais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSalvar)
                    .addComponent(botaoCancelar))
                .addContainerGap(35, Short.MAX_VALUE))
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

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        // Validar campos para cadastro
        if(campoNome.getText().length() <= 0) {
            JOptionPane.showMessageDialog(null, "Informe o nome do cliente", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else if(campoNickName.getText().length() <= 0) {
            JOptionPane.showMessageDialog(null, "Informe a rua do cliente", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else if(campoSenha.getPassword().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe a cidade do cliente", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {
            // lógica para salvar um usuário
            
        }

    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void radioAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAdmActionPerformed
        if(radioFuncionario.isSelected())
            radioFuncionario.setSelected(false);
    }//GEN-LAST:event_radioAdmActionPerformed

    private void radioFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFuncionarioActionPerformed
        if(radioAdm.isSelected())
            radioAdm.setSelected(false);
    }//GEN-LAST:event_radioFuncionarioActionPerformed

    private void campoNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNomeKeyTyped
        validarLetrasETamanho(evt, campoNome, maxCaracteresNome); // Mesmo tamanho para nomes de pessoas e ruas
    }//GEN-LAST:event_campoNomeKeyTyped

    private void validarLetrasETamanho(java.awt.event.KeyEvent evt, javax.swing.JTextField campo, int maxCaracteres) { 
        if(numeros.contains(evt.getKeyChar()+"")){// se o carácter que gerou o evento estiver na lista 
            evt.consume();
        } if(campo.getText().length()>= maxCaracteres){ 
            evt.consume(); 
            campo.setText(campo.getText().substring(0, maxCaracteres)); // Remove os caracters inválidos caso o usuário tenha colado o texto
        }
    }
    
    public void validarNumerosETamanho(java.awt.event.KeyEvent evt, javax.swing.JTextField campo, int maxCaracteres) {
        if(!numeros.contains(evt.getKeyChar()+"")){// se o carácter que gerou o evento não estiver na lista 
            evt.consume();
        } if(campo.getText().length()>= maxCaracteres){ 
            evt.consume(); 
        }
    }
    
    public boolean alterarDados() {        
        salvarSelecionado = false;  //Marcamos que o salavar não foi selecionado
        setModal(true);         //A dialog tem que ser modal. Só pode retornar do setVisible ap�s ficar invisível.
        setVisible(true);       //Mostramos a dialog e esperamos o usuário escolher alguma coisa.
        return salvarSelecionado;   //Retornamos true, se ele pressionou ok.
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastrarUsuarioDialog dialog = new CadastrarUsuarioDialog(new java.awt.Frame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    private String numeros = "0987654321"; // Alguns campos não devem aceitar números
    protected boolean salvarSelecionado;
    private int maxCaracteresNome = 40;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JTextField campoNickName;
    private javax.swing.JTextField campoNome;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JLabel labelNickName;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JPanel painelDadosGerais;
    private javax.swing.JRadioButton radioAdm;
    private javax.swing.JRadioButton radioFuncionario;
    // End of variables declaration//GEN-END:variables
}
