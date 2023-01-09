package Modelo;

import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;
import java.applet.AudioClip;

public class Entrenar extends javax.swing.JFrame {
    AudioClip Sound;
    Timer timer;
    public Entrenar() {
        initComponents();
        this.setLocationRelativeTo(null);
        Sound = java.applet.Applet.newAudioClip(getClass().getResource("/Bases/kk.wav"));
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContadorTiempo1 = new javax.swing.JLabel();
        Modes = new javax.swing.JComboBox<>();
        ContadorTiempo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PalabraRandom = new javax.swing.JLabel();
        Iniciar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ContadorTiempo1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ContadorTiempo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(ContadorTiempo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 180, 30));

        Modes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Easy Mode", "HardMode", "Tematica", "Personajes" }));
        getContentPane().add(Modes, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 130, 30));

        ContadorTiempo.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        ContadorTiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(ContadorTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 180, 90));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 140, 30));

        PalabraRandom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PalabraRandom.setForeground(new java.awt.Color(255, 255, 255));
        PalabraRandom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(PalabraRandom, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 130, 30));

        Iniciar.setText("Iniciar");
        Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarActionPerformed(evt);
            }
        });
        getContentPane().add(Iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 150, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Timer.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 300, 360));

        salir.setText("x");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        back.setText("Regresar");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo_Entrenar.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarActionPerformed
        if (Iniciar.getText().equals("Parar")) {
            Sound.stop();
            Iniciar.setText("Iniciar");
            timer.cancel();
            jLabel4.setText("");
            ContadorTiempo.setText("");
            PalabraRandom.setText("");
            Modes.setVisible(true);
        }else{
            timer = new Timer();
            Sound.play();
        String[] PAE = 
        {"Bajo","Arriba","juego","Maquina","Elon Musk","CiberPunk","Start","Star","Gol","Vivir","llorar","Pepa",
        "Mauricio","Diego","Casa","Hogar","Familia","Amigo","Enemigo","Cama","Dormitorio","Sol","Playa","Arena",
        "Comida","Costumbre","Infiel","Animal","Beso","Habilidad","Manejo","Noche","Dia","Luz","Minecraft","Fortnite",
        "Telefono","Comunicación","Profesor","Alumno","Compañero","Llama","Alpaca","Ganar","Orgullo","Homosexual","Choteado",
        "Tony","Camisa","Negra","Sobrevalorado","Infravalorado","Atrás","BigBand","Lentes","Pantalla","Botella","Pantalon",
        "Ratón","Pescesuelo","Gordo","Fisico","Quimica","Laboratorio","Escritorio","Ventana","Pizarra","Youtube","Facebook",
        "Insultar","Conejo","Leon","Cajas","Voto","Balon","Modelo","Imagenes","Vacio","Tiempo","Gravedad","Soledad","Documento",
        "Texto","Comunicado","Noticia","Universidad","Interfaz","Entrenar","Componentes","Árbol","Nasa"};
        switch (Modes.getSelectedIndex()){
        case 0:
            TimerTask EasyMode= new TimerTask() {
                int s = 74;
                @Override
                public void run() {
                    if(s==74)ContadorTiempo1.setText("¿Listo para Entrenar?");
                    if(s==71)ContadorTiempo1.setText("¡Recuerda Visitarnos!");
                    if(s==68)ContadorTiempo1.setText("¡Es tu Momento!");
                    if(s==66)ContadorTiempo1.setText("");
                    if(s==65)ContadorTiempo.setText("En..");
                    if(s==64)ContadorTiempo.setText("3");
                    if(s==63)ContadorTiempo.setText("2");
                    if(s==62)ContadorTiempo.setText("1");
                    if(s==61)ContadorTiempo.setText("¡Go!");
                    if(s <= 60){
                    if(s>=0){
                        ContadorTiempo.setText(""+s);
                        if(s%10==0){PalabraRandom.setText(PAE[new Random().nextInt(PAE.length)]);}
                        if(s==0){
                            Iniciar.setEnabled(true);
                            back.setEnabled(true);
                            ContadorTiempo.setText("");
                            PalabraRandom.setText("");
                            jLabel4.setText("");
                            Iniciar.setText("Iniciar");
                            Sound.stop();
                            Modes.setVisible(true);
                        }
                    }
                }s = s - 1; 
            }
        };
            Iniciar.setText("Parar");
            jLabel4.setText("Easy - Mode");
            timer.schedule(EasyMode, 2000, 1000);
            break;
        case 1:
                TimerTask HardMode= new TimerTask() {
            int s = 74;
            @Override
            public void run() {
                Random Minecraft = new Random();
                if(s==74)ContadorTiempo1.setText("¿Listo para Entrenar?");
                    if(s==71)ContadorTiempo1.setText("¡Recuerda Visitarnos!");
                    if(s==68)ContadorTiempo1.setText("¡Es tu Momento!");
                    if(s==66)ContadorTiempo1.setText("");
                if(s==65)ContadorTiempo.setText("En..");
                if(s==63)ContadorTiempo.setText("2");
                if(s==62)ContadorTiempo.setText("1");
                if(s==61)ContadorTiempo.setText("¡Go!");
                if(s <= 60){
                    if(s>=0){
                        ContadorTiempo.setText(""+s);
                    if(s%5==0){
                        PalabraRandom.setText(PAE[Minecraft.nextInt(PAE.length)]);
                    }
                    if(s==0){
                        Iniciar.setEnabled(true);
                        ContadorTiempo.setText("");
                        PalabraRandom.setText("");
                        jLabel4.setText("");
                        Modes.setVisible(true);
                        Iniciar.setText("Iniciar");
                        Sound.stop();
                        }
                    }
                }s = s - 1; 
            }
        };
            Iniciar.setText("Parar");
            jLabel4.setText("Hard - Mode");
            PalabraRandom.setText("");
            timer.schedule(HardMode, 2000, 1000);
            break;
        case 2:
            TimerTask Tematica= new TimerTask() {
            int s = 74;
            @Override
            public void run() {
                Random Minecraft = new Random();
                if(s==74)ContadorTiempo1.setText("¿Listo para Entrenar?");
                    if(s==71)ContadorTiempo1.setText("¡Recuerda Visitarnos!");
                    if(s==68)ContadorTiempo1.setText("¡Es tu Momento!");
                    if(s==66)ContadorTiempo1.setText("");
                if(s==65)ContadorTiempo.setText("En..");
                if(s==64)ContadorTiempo.setText("3");
                if(s==63)ContadorTiempo.setText("2");
                if(s==62)ContadorTiempo.setText("1");
                if(s==61)ContadorTiempo.setText("¡Go!");
                if(s <= 60){
                    if(s>=0){ContadorTiempo.setText(""+s);
                    if(s==60)PalabraRandom.setText(PAE[Minecraft.nextInt(PAE.length)]);
                    if(s==0){Iniciar.setEnabled(true);
                        ContadorTiempo.setText("");
                        PalabraRandom.setText("");
                        jLabel4.setText("");
                        Modes.setVisible(true);
                        Iniciar.setText("Iniciar");
                        Sound.stop();
                    }}
                }s = s - 1; 
            }
        };
            Iniciar.setText("Parar");
            jLabel4.setText("Tematica");
            PalabraRandom.setText("");
            timer.schedule(Tematica, 2000, 1000);
            break;
        case 3:
            TimerTask Person= new TimerTask() {
            int s = 74;
            @Override
            public void run() {
                Random Minecraft = new Random();
                if(s==74)ContadorTiempo1.setText("¿Listo para Entrenar?");
                if(s==71)ContadorTiempo1.setText("¡Recuerda Visitarnos!");
                if(s==68)ContadorTiempo1.setText("¡Es tu Momento!");
                if(s==66)ContadorTiempo1.setText("");
                if(s==65)ContadorTiempo.setText("En..");
                if(s==64)ContadorTiempo.setText("3");
                if(s==63)ContadorTiempo.setText("2");
                if(s==62)ContadorTiempo.setText("1");
                if(s==61)ContadorTiempo.setText("¡Go!");
                if(s <= 60){
                    if(s>=0){ContadorTiempo.setText(""+s);
                    if(s==60){
                        PalabraRandom.setText(PAE[Minecraft.nextInt(PAE.length)]);
                        jLabel4.setText(PAE[Minecraft.nextInt(PAE.length)]);
                    }
                    if(s==0){
                        Iniciar.setEnabled(true);
                        ContadorTiempo.setText("");
                        PalabraRandom.setText("");
                        jLabel4.setText("");
                        Modes.setVisible(true);
                        Iniciar.setText("Iniciar");
                        Sound.stop();
                    }}
                }s = s - 1; 
            }
        };
            Iniciar.setText("Parar");
            PalabraRandom.setText("Personajes");
            jLabel4.setText("Contrapuestos");
            timer.schedule(Person, 2000, 1000);break;
        }
    Modes.setVisible(false);
        }
    }//GEN-LAST:event_IniciarActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Carga carga = new Carga();
        carga.setVisible(true);
        try{
            timer.cancel();
            Sound.stop();
        }catch(Exception ex){
        }
        this.dispose();
    }//GEN-LAST:event_backActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entrenar().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ContadorTiempo;
    private javax.swing.JLabel ContadorTiempo1;
    private javax.swing.JButton Iniciar;
    private javax.swing.JComboBox<String> Modes;
    private javax.swing.JLabel PalabraRandom;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
