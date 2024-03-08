package quiz1;

// @author amdtr
public class Interfaz extends javax.swing.JFrame {

    // public Double lado1, lado2;
    public Interfaz() {
        initComponents();
        ladoC.setVisible(false);
        txtC.setVisible(false);
        cambiante.setVisible(false);
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
        txtB = new javax.swing.JLabel();
        LadoB = new javax.swing.JTextField();
        resultado = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        circulo = new javax.swing.JRadioButton();
        triangulo = new javax.swing.JRadioButton();
        cuadrado = new javax.swing.JRadioButton();
        area = new javax.swing.JRadioButton();
        perimetro = new javax.swing.JRadioButton();
        cambiante = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        txtA = new javax.swing.JLabel();
        ladoA = new javax.swing.JTextField();
        txtC = new javax.swing.JLabel();
        ladoC = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtB.setText("Ingrese el lado B");
        jPanel1.add(txtB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 21, 124, -1));

        LadoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LadoBActionPerformed(evt);
            }
        });
        jPanel1.add(LadoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 43, 124, -1));

        resultado.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        resultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 120, 22));

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 115, -1, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        circulo.setText("Circulo");
        circulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circuloActionPerformed(evt);
            }
        });
        jPanel3.add(circulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 82, -1, -1));

        triangulo.setText("Triangulo");
        triangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trianguloActionPerformed(evt);
            }
        });
        jPanel3.add(triangulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 49, -1, -1));

        cuadrado.setText("Cuadrado");
        cuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuadradoActionPerformed(evt);
            }
        });
        jPanel3.add(cuadrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 16, -1, -1));

        area.setText("Area");
        area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaActionPerformed(evt);
            }
        });
        jPanel3.add(area, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 16, -1, -1));

        perimetro.setText("Perimetro");
        perimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perimetroActionPerformed(evt);
            }
        });
        jPanel3.add(perimetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 49, -1, -1));

        cambiante.setText("texto");
        cambiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambianteActionPerformed(evt);
            }
        });
        jPanel3.add(cambiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 82, -1, -1));

        jPanel4.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtA.setText("Ingrese el lado A");
        jPanel4.add(txtA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 21, 124, -1));

        ladoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ladoAActionPerformed(evt);
            }
        });
        jPanel4.add(ladoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 43, 124, -1));

        txtC.setText("Ingrese el lado C");
        jPanel4.add(txtC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 93, 124, -1));

        ladoC.setEnabled(false);
        ladoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ladoCActionPerformed(evt);
            }
        });
        jPanel4.add(ladoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 115, 124, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Cuadrados cuadrados = new Cuadrados();
    Triangulos triangulos = new Triangulos();
    Circulos circulos = new Circulos();

    public void datos() {

        if (!ladoA.getText().isEmpty()) {
            cuadrados.setLadoA(Double.parseDouble(ladoA.getText()));
            triangulos.setLadoA(Double.parseDouble(ladoA.getText()));

        }
        if (!LadoB.getText().isEmpty()) {
            cuadrados.setLadoB(Double.parseDouble(LadoB.getText()));
            triangulos.setLadoB(Double.parseDouble(LadoB.getText()));
        }
        if (!ladoC.getText().isEmpty()) {
            circulos.setRadio(Double.parseDouble(ladoC.getText()));
        }

    }

    private void ladoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ladoCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ladoCActionPerformed

    private void LadoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LadoBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LadoBActionPerformed

    private void ladoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ladoAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ladoAActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        datos();
        if (cuadrado.isSelected() && area.isSelected()) {
            resultado.setText(String.valueOf(cuadrados.calcularArea()));
        } else if (cuadrado.isSelected() && perimetro.isSelected()) {
            resultado.setText(String.valueOf(cuadrados.calcularPerimetro()));
        } else if (cuadrado.isSelected() && cambiante.isSelected()) {
            resultado.setText(String.valueOf(cuadrados.calcularDiagonal()));
        } else if (triangulo.isSelected() && area.isSelected()) {
            resultado.setText(String.valueOf(triangulos.calcularArea()));
        } else if (triangulo.isSelected() && perimetro.isSelected()) {
            resultado.setText(String.valueOf(triangulos.calcularPerimetro()));
        } else if (triangulo.isSelected() && cambiante.isSelected()) {
            resultado.setText(String.valueOf(triangulos.calcularHipotenusa()));
        } else if (circulo.isSelected() && area.isSelected()) {
            resultado.setText(String.valueOf(circulos.calcularArea()));
        } else if (circulo.isSelected() && perimetro.isSelected()) {
            resultado.setText(String.valueOf(circulos.calcularPerimetro()));
        } else if (circulo.isSelected() && cambiante.isSelected()) {
            resultado.setText(String.valueOf(circulos.calcularDiametro()));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuadradoActionPerformed
        if (cuadrado.isSelected()) {
            //desmarcar
            triangulo.setSelected(false);
            circulo.setSelected(false);
            //mostrar
            ladoA.setEnabled(true);
            LadoB.setEnabled(true);
            //ocultar
            ladoC.setVisible(false);
            txtC.setVisible(false);
            //cambiante
            cambiante.setText("Diagonal");
            cambiante.setVisible(true);
        }
    }//GEN-LAST:event_cuadradoActionPerformed

    private void trianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trianguloActionPerformed
        if (triangulo.isSelected()) {
            //desmarcar
            cuadrado.setSelected(false);
            circulo.setSelected(false);
            //
            ladoA.setEnabled(true);
            LadoB.setEnabled(true);
            // cambiante
            cambiante.setText("Hipotenusa");
            cambiante.setVisible(true);

        }
    }//GEN-LAST:event_trianguloActionPerformed

    private void circuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circuloActionPerformed

        if (circulo.isSelected()) {
            //descarmar
            triangulo.setSelected(false);
            cuadrado.setSelected(false);
            //ocultar
            ladoA.setEnabled(false);
            LadoB.setEnabled(false);
            //
            ladoC.setVisible(true);
            ladoC.setEnabled(true);
            txtC.setVisible(true);
            txtC.setText("Ingrese el radio");
            // cambiante
            cambiante.setText("Diametro");
            cambiante.setVisible(true);

        }
    }//GEN-LAST:event_circuloActionPerformed

    private void areaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaActionPerformed
        if (area.isSelected()) {
            perimetro.setSelected(false);
            cambiante.setSelected(false);
        }
    }//GEN-LAST:event_areaActionPerformed

    private void perimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perimetroActionPerformed
        if (perimetro.isSelected()) {
            area.setSelected(false);
            cambiante.setSelected(false);

        }
    }//GEN-LAST:event_perimetroActionPerformed

    private void cambianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambianteActionPerformed
        if (cambiante.isSelected()) {
            area.setSelected(false);
            perimetro.setSelected(false);
        }


    }//GEN-LAST:event_cambianteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField LadoB;
    private javax.swing.JRadioButton area;
    private javax.swing.JRadioButton cambiante;
    private javax.swing.JRadioButton circulo;
    private javax.swing.JRadioButton cuadrado;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField ladoA;
    private javax.swing.JTextField ladoC;
    private javax.swing.JRadioButton perimetro;
    private javax.swing.JLabel resultado;
    private javax.swing.JRadioButton triangulo;
    private javax.swing.JLabel txtA;
    private javax.swing.JLabel txtB;
    private javax.swing.JLabel txtC;
    // End of variables declaration//GEN-END:variables
}