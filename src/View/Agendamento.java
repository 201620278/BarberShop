/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author cicer
 */
public class Agendamento extends javax.swing.JInternalFrame {

    /**
     * Creates new form Agendamento
     */
    public Agendamento() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formAgendamento = new javax.swing.JPanel();
        Nome = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        Id = new javax.swing.JLabel();
        cboServicoCliente = new javax.swing.JComboBox<>();
        Servico = new javax.swing.JLabel();
        cboNomeCliente = new javax.swing.JComboBox<>();
        Valor = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        Data = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        Hora = new javax.swing.JLabel();
        Agendamento = new javax.swing.JLabel();
        Observacoes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        btnAgendar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAgendamento = new javax.swing.JTable();
        txtData = new javax.swing.JFormattedTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Agendamentos");
        setPreferredSize(new java.awt.Dimension(1026, 568));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        formAgendamento.setBackground(new java.awt.Color(0, 51, 51));
        formAgendamento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Nome.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Nome.setForeground(new java.awt.Color(255, 255, 255));
        Nome.setText("Nome");

        Id.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Id.setForeground(new java.awt.Color(255, 255, 255));
        Id.setText("ID");

        cboServicoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Servico.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Servico.setForeground(new java.awt.Color(255, 255, 255));
        Servico.setText("Serviço");

        cboNomeCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Valor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Valor.setForeground(new java.awt.Color(255, 255, 255));
        Valor.setText("Valor R$");

        Data.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Data.setForeground(new java.awt.Color(255, 255, 255));
        Data.setText("Data");

        Hora.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Hora.setForeground(new java.awt.Color(255, 255, 255));
        Hora.setText("Hora");

        Agendamento.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        Agendamento.setForeground(new java.awt.Color(255, 255, 255));
        Agendamento.setText("Agendamentos");

        Observacoes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Observacoes.setForeground(new java.awt.Color(255, 255, 255));
        Observacoes.setText("Observaçoes");

        jScrollPane1.setViewportView(jTextPane1);

        btnAgendar.setBackground(new java.awt.Color(51, 204, 0));
        btnAgendar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAgendar.setText("Agendar");
        btnAgendar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tblAgendamento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tblAgendamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "CLIENTE", "SERVIÇO", "VALOR", "DATA", "HORA", "OBSERVAÇOES"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblAgendamento);

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout formAgendamentoLayout = new javax.swing.GroupLayout(formAgendamento);
        formAgendamento.setLayout(formAgendamentoLayout);
        formAgendamentoLayout.setHorizontalGroup(
            formAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formAgendamentoLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(Id)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(formAgendamentoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(formAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formAgendamentoLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 916, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 51, Short.MAX_VALUE))
                    .addGroup(formAgendamentoLayout.createSequentialGroup()
                        .addGroup(formAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nome)
                            .addComponent(Servico)
                            .addComponent(Valor)
                            .addComponent(Data))
                        .addGap(31, 31, 31)
                        .addGroup(formAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, formAgendamentoLayout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(Hora)
                                .addGap(18, 18, 18)
                                .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(formAgendamentoLayout.createSequentialGroup()
                                .addGroup(formAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboServicoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(formAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtValor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(formAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(formAgendamentoLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(formAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Observacoes)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btnAgendar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(35, 35, 35))
                                    .addGroup(formAgendamentoLayout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(Agendamento)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))))
        );
        formAgendamentoLayout.setVerticalGroup(
            formAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formAgendamentoLayout.createSequentialGroup()
                .addGroup(formAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(formAgendamentoLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(formAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Id)
                            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(formAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nome)
                            .addComponent(cboNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(formAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Servico)
                            .addComponent(cboServicoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(formAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Valor)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formAgendamentoLayout.createSequentialGroup()
                        .addComponent(Agendamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Observacoes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(formAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formAgendamentoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formAgendamentoLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(formAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtData, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(formAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Data)
                                .addComponent(Hora)
                                .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(formAgendamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 538));

        setBounds(0, 0, 1026, 568);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Agendamento;
    private javax.swing.JLabel Data;
    private javax.swing.JLabel Hora;
    private javax.swing.JLabel Id;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel Observacoes;
    private javax.swing.JLabel Servico;
    private javax.swing.JLabel Valor;
    private javax.swing.JButton btnAgendar;
    private javax.swing.JComboBox<String> cboNomeCliente;
    private javax.swing.JComboBox<String> cboServicoCliente;
    private javax.swing.JPanel formAgendamento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTable tblAgendamento;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}