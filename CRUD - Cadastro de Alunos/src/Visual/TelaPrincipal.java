/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

import Modelo.ModeloTelaPesquisa;
import cadastroaluno.Aluno;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rodrigo
 */
public class TelaPrincipal extends javax.swing.JFrame {

    ArrayList<Aluno> alun;

    public void loadTable() {
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Nome", "Idade", "Sexo"}, 0);

        for (int i = 0; i < alun.size(); i++) {
            modelo.addRow(new Object[]{alun.get(i).getNome(), alun.get(i).getIdade(), alun.get(i).getSexo()});
        }
        tbl_Alunos.setModel(modelo);
    }

    public void verificaLista(ArrayList<Aluno> alun) {
        System.out.println("Imprime Lista");
        for (int i = 0; i < alun.size(); i++) {
            System.out.println(alun.get(i).getNome());
        }

    }

    public void carregarArquivo() {

    }

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        alun = new ArrayList();

        txt_Nome.setText("");
        txt_Idade.setText("");
        txt_Nome.setEditable(false);
        txt_Idade.setEditable(false);
        cbx_Sexo.setEnabled(false);
        btn_Adicionar.setEnabled(false);
        btn_Cancelar.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_Adicionar = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Alunos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btn_Novo = new javax.swing.JButton();
        btn_Deletar = new javax.swing.JButton();
        btn_Pesquisar = new javax.swing.JButton();
        btn_Salvar = new javax.swing.JButton();
        txt_Pesquisa = new javax.swing.JTextField();
        btn_Sair = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_Idade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_Nome = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        cbx_Sexo = new javax.swing.JComboBox<>();
        btn_Editar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_Adicionar.setText("ADICIONAR");
        btn_Adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdicionarActionPerformed(evt);
            }
        });

        btn_Cancelar.setText("CANCELAR");
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CADASTRO DE ALUNOS");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tbl_Alunos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tbl_Alunos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbl_Alunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME", "IDADE", "SEXO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_Alunos);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btn_Novo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rodrigo\\Desktop\\Image Icon\\add-user (5).png")); // NOI18N
        btn_Novo.setToolTipText("");
        btn_Novo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NovoActionPerformed(evt);
            }
        });

        btn_Deletar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rodrigo\\Desktop\\Image Icon\\delete-user (1).png")); // NOI18N
        btn_Deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeletarActionPerformed(evt);
            }
        });

        btn_Pesquisar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rodrigo\\Desktop\\Image Icon\\lupa (4).png")); // NOI18N
        btn_Pesquisar.setBorderPainted(false);
        btn_Pesquisar.setContentAreaFilled(false);
        btn_Pesquisar.setMaximumSize(new java.awt.Dimension(605, 521));
        btn_Pesquisar.setMinimumSize(new java.awt.Dimension(565, 521));
        btn_Pesquisar.setPreferredSize(new java.awt.Dimension(605, 521));
        btn_Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PesquisarActionPerformed(evt);
            }
        });

        btn_Salvar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rodrigo\\Desktop\\Image Icon\\salve-.png")); // NOI18N
        btn_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalvarActionPerformed(evt);
            }
        });

        txt_Pesquisa.setForeground(new java.awt.Color(153, 153, 153));
        txt_Pesquisa.setText("Digite o nome do aluno !");
        txt_Pesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_PesquisaMouseClicked(evt);
            }
        });
        txt_Pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PesquisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Novo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_Pesquisar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btn_Novo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_Deletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_Salvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_Pesquisa)
                .addContainerGap())
        );

        btn_Sair.setText("SAIR");
        btn_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SairActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Aluno"));

        jLabel1.setText("NOME:");

        txt_Idade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IdadeActionPerformed(evt);
            }
        });

        jLabel2.setText("IDADE:");

        txt_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NomeActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Sexo"));

        cbx_Sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        cbx_Sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_SexoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbx_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(cbx_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Idade, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_Idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_Editar.setText("EDITAR");
        btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_Adicionar)
                        .addGap(27, 27, 27)
                        .addComponent(btn_Cancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Adicionar)
                    .addComponent(btn_Cancelar)
                    .addComponent(btn_Sair)
                    .addComponent(btn_Editar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_SexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_SexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_SexoActionPerformed

    private void btn_DeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeletarActionPerformed
        //int x = tbl_Alunos.getSelectedRow();
        //String id = (String) tbl_Alunos.getValueAt(x, 0);  
        if (tbl_Alunos.getSelectedRow() >= 0) {
            alun.remove(tbl_Alunos.getSelectedRow());
            tbl_Alunos.clearSelection();
            loadTable();
        }
        //tbl_Alunos.clearSelection();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_DeletarActionPerformed

    private void btn_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NovoActionPerformed
        txt_Nome.setText("");
        txt_Idade.setText("");
        txt_Nome.setEditable(true);
        txt_Idade.setEditable(true);
        cbx_Sexo.setEnabled(true);
        btn_Adicionar.setEnabled(true);
        btn_Cancelar.setEnabled(true);
        txt_Pesquisa.setText("Digite o nome do aluno !");

// TODO add your handling code here:
    }//GEN-LAST:event_btn_NovoActionPerformed

    private void txt_IdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IdadeActionPerformed

    private void txt_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NomeActionPerformed

    private void btn_AdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AdicionarActionPerformed
        Aluno aluno = new Aluno();
        boolean cadastrado = false;
        //verificaLista(alun);
        for (int i = 0; i < alun.size(); i++) {
            if (alun.get(i).getNome().equals(txt_Nome.getText())) {
                System.out.println("Aluno já Cadastrado!");
                cadastrado = true;
                break;
            } else {
                cadastrado = false;
            }
        }
        if (cadastrado == false) {
            aluno.setNome(txt_Nome.getText());
            // try{
            int idade = Integer.parseInt(txt_Idade.getText());
            aluno.setIdade(idade);
            // } catch (NumberFormatException e) {
            //    JOptionPane.showMessageDialog(null, e.getLocalizedMessage() + "\nERRO !!! Somente números!!");
            // }
            aluno.setSexo((String) (cbx_Sexo.getSelectedItem()));
            aluno.setCadastrado(true);
            alun.add(aluno);
            System.out.println("Aluno Adicionado");
            System.out.println("Tamanho da lista: " + alun.size());
            loadTable();
        } else {
            JOptionPane.showMessageDialog(null, "Aluno já Cadastrado!!");
        }

        txt_Nome.setText("");
        txt_Idade.setText("");
        txt_Nome.setEditable(false);
        txt_Idade.setEditable(false);
        cbx_Sexo.setEnabled(false);
        btn_Adicionar.setEnabled(false);
        btn_Cancelar.setEnabled(false);
        txt_Pesquisa.setText("Digite o nome do aluno !");

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AdicionarActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        txt_Nome.setText("");
        txt_Idade.setText("");
        txt_Nome.setEditable(false);
        txt_Idade.setEditable(false);
        cbx_Sexo.setEnabled(false);
        btn_Adicionar.setEnabled(false);
        btn_Cancelar.setEnabled(false);
        txt_Pesquisa.setText("Digite o nome do aluno !");

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void btn_PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PesquisarActionPerformed
        // String nome = txt_Pesquisa.getText();
        ModeloTelaPesquisa model = new ModeloTelaPesquisa();
        boolean cadastrado = false;
        //txt_Pesquisa.setText("Digite o nome do aluno !");
        if (alun.isEmpty()) {
            System.out.println("Lista Vazia!!");
            JOptionPane.showMessageDialog(null, "Lista Vazia!!");
        } else {
            for (int i = 0; i < alun.size(); i++) {
                if (alun.get(i).getNome().equals(txt_Pesquisa.getText())) {
                    System.out.println("Aluno: " + alun.get(i).getNome()
                            + " Idade: " + alun.get(i).getIdade()
                            + " Sexo: " + alun.get(i).getSexo());
                    model.setNome(alun.get(i).getNome());
                    model.setIdade(alun.get(i).getIdade());
                    model.setSexo(alun.get(i).getSexo());
                    TelaDaPesquisa telaPesquisa = new TelaDaPesquisa();
                    telaPesquisa.exportarInfo(model);
                    telaPesquisa.setVisible(true);
                    cadastrado = true;
                    break;
                } else {
                    cadastrado = false;
                }
            }
        }
        if (cadastrado == true) {
            System.out.println("Aluno cadastrado!!");
        } else if (cadastrado == false) {
            System.out.println("Aluno não cadastrado!!");
            JOptionPane.showMessageDialog(null, "Aluno não cadastrado!!");
        }
        txt_Pesquisa.setText("Digite o nome do aluno !");
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_PesquisarActionPerformed

    private void btn_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SairActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_SairActionPerformed

    private void txt_PesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PesquisaActionPerformed

    private void btn_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalvarActionPerformed
        FileWriter arq = null;
        try {
            arq = new FileWriter("C:\\Users\\Rodrigo\\Desktop\\Nova pasta\\Lista de Alunos.txt");
        } catch (IOException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        PrintWriter gravarArq = new PrintWriter(arq);
        String nome; // só um exemplo, crie todoas as variaveis que são atributos dos objetos do array list
        int idade;
        String sexo;

        for (int i = 0; i < alun.size(); i++) {
            gravarArq.println("Nome: " + alun.get(i).getNome()
                    + " Idade: " + alun.get(i).getIdade()
                    + " Sexo: " + alun.get(i).getSexo());
        }
        gravarArq.println("---------------------------------------------");
        try {
            arq.close();
        } catch (IOException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Alunos gravados com sucesso!!");
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_SalvarActionPerformed

    private void txt_PesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_PesquisaMouseClicked
        txt_Pesquisa.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PesquisaMouseClicked

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed
        String nomeAluno = JOptionPane.showInputDialog("Nome do Aluno: ");
        for (int i = 0; i < alun.size(); i++) {
            if (nomeAluno.equals(alun.get(i).getNome())) {
                JOptionPane.showMessageDialog(null, "Nome: " + alun.get(i).getNome()
                        + "/ Idade: " + alun.get(i).getIdade()
                        + "/ Sexo: " + alun.get(i).getSexo());
                String nome = JOptionPane.showInputDialog("Novo nome: ");
                alun.get(i).setNome(nome);
                String idad = JOptionPane.showInputDialog("Nova Idade: ");
                int idade = Integer.parseInt(idad);
                alun.get(i).setIdade(idade);
                loadTable();
                break;
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_EditarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windowns".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Adicionar;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_Deletar;
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_Novo;
    private javax.swing.JButton btn_Pesquisar;
    private javax.swing.JButton btn_Sair;
    private javax.swing.JButton btn_Salvar;
    private javax.swing.JComboBox<String> cbx_Sexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_Alunos;
    private javax.swing.JTextField txt_Idade;
    private javax.swing.JTextField txt_Nome;
    private javax.swing.JTextField txt_Pesquisa;
    // End of variables declaration//GEN-END:variables
}