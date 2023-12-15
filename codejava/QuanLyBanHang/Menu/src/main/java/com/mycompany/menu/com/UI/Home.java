/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.menu.com.UI;

/**
 *
 * @author ADMIN
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }
    
    int width = 210;
    int height = 600;

    // Mo menu
    void openMENU(){
        new Thread(new Runnable(){
            @Override
            public void run(){
                for (int i=0; i <width; i++){
                    pTrangChu.setSize(i, height);
                }
            }
        }).start();
    }
    // Dong menu
        void closeMENU(){
        new Thread(new Runnable(){
            @Override
            public void run(){
                for (int i=width; i >0; i--){
                    pTrangChu.setSize(i, height);
                }
            }
        }).start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main = new javax.swing.JPanel();
        Slide = new javax.swing.JPanel();
        TrangChu = new javax.swing.JLabel();
        Them = new javax.swing.JLabel();
        Xoaa = new javax.swing.JLabel();
        Sua = new javax.swing.JLabel();
        ThongKe = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        TroGiup = new javax.swing.JLabel();
        GioiThieu = new javax.swing.JLabel();
        DangXuat = new javax.swing.JLabel();
        TenNhom = new javax.swing.JLabel();
        Dong = new javax.swing.JLabel();
        Container = new javax.swing.JPanel();
        pThem = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pGioiThieu = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pTrangChu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pTroGiup = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        MENU = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Main.setBackground(new java.awt.Color(255, 255, 255));

        Slide.setBackground(new java.awt.Color(255, 255, 255));
        Slide.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        TrangChu.setText("Trang Chủ");

        Them.setText("Thêm");

        Xoaa.setText("Xóa");

        Sua.setText("Sửa");

        ThongKe.setText("Thống Kê");

        TroGiup.setText("Trợ Giúp");

        GioiThieu.setText("Giới Thiệu");

        DangXuat.setText("Đăng Xuất");

        TenNhom.setText("Siêu Thị Nhóm 5");

        Dong.setText("X");
        Dong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DongMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SlideLayout = new javax.swing.GroupLayout(Slide);
        Slide.setLayout(SlideLayout);
        SlideLayout.setHorizontalGroup(
            SlideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(SlideLayout.createSequentialGroup()
                .addGroup(SlideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SlideLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Dong, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SlideLayout.createSequentialGroup()
                        .addGroup(SlideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SlideLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(SlideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TroGiup, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(GioiThieu)
                                    .addComponent(DangXuat)))
                            .addGroup(SlideLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(SlideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TrangChu)
                                    .addComponent(ThongKe)
                                    .addComponent(Them)
                                    .addComponent(Xoaa)
                                    .addComponent(Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(SlideLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(TenNhom, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator1)
        );
        SlideLayout.setVerticalGroup(
            SlideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SlideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Dong)
                .addGap(16, 16, 16)
                .addComponent(TenNhom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(TrangChu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Them)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Xoaa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Sua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ThongKe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TroGiup)
                .addGap(14, 14, 14)
                .addComponent(GioiThieu)
                .addGap(18, 18, 18)
                .addComponent(DangXuat)
                .addGap(21, 21, 21))
        );

        Container.setLayout(new java.awt.CardLayout());

        jLabel2.setText("Thêm");

        javax.swing.GroupLayout pThemLayout = new javax.swing.GroupLayout(pThem);
        pThem.setLayout(pThemLayout);
        pThemLayout.setHorizontalGroup(
            pThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pThemLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(660, Short.MAX_VALUE))
        );
        pThemLayout.setVerticalGroup(
            pThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pThemLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel2)
                .addContainerGap(305, Short.MAX_VALUE))
        );

        Container.add(pThem, "card2");

        jLabel7.setText("Giới Thiệu");

        javax.swing.GroupLayout pGioiThieuLayout = new javax.swing.GroupLayout(pGioiThieu);
        pGioiThieu.setLayout(pGioiThieuLayout);
        pGioiThieuLayout.setHorizontalGroup(
            pGioiThieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pGioiThieuLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(621, Short.MAX_VALUE))
        );
        pGioiThieuLayout.setVerticalGroup(
            pGioiThieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pGioiThieuLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel7)
                .addContainerGap(273, Short.MAX_VALUE))
        );

        Container.add(pGioiThieu, "card8");

        jLabel1.setText("Trang Chủ");

        javax.swing.GroupLayout pTrangChuLayout = new javax.swing.GroupLayout(pTrangChu);
        pTrangChu.setLayout(pTrangChuLayout);
        pTrangChuLayout.setHorizontalGroup(
            pTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTrangChuLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addContainerGap(688, Short.MAX_VALUE))
        );
        pTrangChuLayout.setVerticalGroup(
            pTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTrangChuLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addContainerGap(319, Short.MAX_VALUE))
        );

        Container.add(pTrangChu, "card5");

        jLabel6.setText("Trợ Giúp");

        javax.swing.GroupLayout pTroGiupLayout = new javax.swing.GroupLayout(pTroGiup);
        pTroGiup.setLayout(pTroGiupLayout);
        pTroGiupLayout.setHorizontalGroup(
            pTroGiupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTroGiupLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel6)
                .addContainerGap(643, Short.MAX_VALUE))
        );
        pTroGiupLayout.setVerticalGroup(
            pTroGiupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTroGiupLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel6)
                .addContainerGap(259, Short.MAX_VALUE))
        );

        Container.add(pTroGiup, "card7");

        Menu.setBackground(new java.awt.Color(255, 255, 255));

        MENU.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\RoadMap\\BaiTapCoSoDuLieu\\menu.png")); // NOI18N
        MENU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MENUMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(MENU)
                .addContainerGap(741, Short.MAX_VALUE))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(MENU)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MainLayout = new javax.swing.GroupLayout(Main);
        Main.setLayout(MainLayout);
        MainLayout.setHorizontalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Slide, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Container, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainLayout.setVerticalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Slide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MainLayout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Container, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DongMouseClicked
        closeMENU();
    }//GEN-LAST:event_DongMouseClicked

    private void MENUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MENUMouseClicked
        openMENU ();
    }//GEN-LAST:event_MENUMouseClicked

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JLabel DangXuat;
    private javax.swing.JLabel Dong;
    private javax.swing.JLabel GioiThieu;
    private javax.swing.JLabel MENU;
    private javax.swing.JPanel Main;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Slide;
    private javax.swing.JLabel Sua;
    private javax.swing.JLabel TenNhom;
    private javax.swing.JLabel Them;
    private javax.swing.JLabel ThongKe;
    private javax.swing.JLabel TrangChu;
    private javax.swing.JLabel TroGiup;
    private javax.swing.JLabel Xoaa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel pGioiThieu;
    private javax.swing.JPanel pThem;
    private javax.swing.JPanel pTrangChu;
    private javax.swing.JPanel pTroGiup;
    // End of variables declaration//GEN-END:variables
}
