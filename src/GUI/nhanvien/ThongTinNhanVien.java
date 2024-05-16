/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.nhanvien;

import javax.swing.JFrame;
import DAO.NhanVienDao;
import POJO.NhanVien;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class ThongTinNhanVien extends javax.swing.JFrame {

    /**
     * Creates new form TrangChinh
     */
    DefaultTableModel dtm = new DefaultTableModel();

    public ThongTinNhanVien() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        String[] tieuDe = {"Mã", "Họ Tên", "Ngày Sinh", "Email", "Số căn cước", "Số điện thoại"};
        dtm.setColumnIdentifiers(tieuDe);

        taiDuLieu(new NhanVienDao().HienThiDanhSachNhanVien());
        tbDSNV.setRowHeight(30);
    }

    private void taiDuLieu(ArrayList<NhanVien> dsNV) {
        dtm.setRowCount(0);
        for (NhanVien nv : dsNV) {
            Vector<Object> vec = new Vector<Object>();
            vec.add(nv.getMaNV());
            vec.add(nv.getHoTen());
            vec.add(nv.getNgaySinh());
            vec.add(nv.getEmail());
            vec.add(nv.getSoCanCuoc());
            vec.add(nv.getSDT());

            dtm.addRow(vec);
        }
        tbDSNV.setModel(dtm);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLeft = new javax.swing.JPanel();
        panelLeft_Top = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSoDienThoaii = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jDateNgaySinh = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        txtSoCanCuoc = new javax.swing.JTextField();
        panelLeft_Center = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnXoa = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        txtMaTimKiem = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDSNV = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(44, 170, 110));
        jLabel3.setText("Quản lí nhân viên");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel7.setText("Mã nhân viên:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel9.setText("Họ tên nhân viên:");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel12.setText("Email :");

        txtMa.setEnabled(false);
        txtMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel8.setText("Số điện thoại:");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel20.setText("Ngày sinh: ");

        jDateNgaySinh.setDateFormatString("yyyy-MM-dd");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel18.setText("Số căn cước:");

        javax.swing.GroupLayout panelLeft_TopLayout = new javax.swing.GroupLayout(panelLeft_Top);
        panelLeft_Top.setLayout(panelLeft_TopLayout);
        panelLeft_TopLayout.setHorizontalGroup(
            panelLeft_TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLeft_TopLayout.createSequentialGroup()
                .addGroup(panelLeft_TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLeft_TopLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelLeft_TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12))
                        .addGap(24, 24, 24)
                        .addGroup(panelLeft_TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMa, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(txtTen)
                            .addComponent(txtEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelLeft_TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLeft_TopLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLeft_TopLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLeft_TopLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))))
                    .addGroup(panelLeft_TopLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGroup(panelLeft_TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(txtSoDienThoaii)
                    .addComponent(txtSoCanCuoc))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLeft_TopLayout.setVerticalGroup(
            panelLeft_TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLeft_TopLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(panelLeft_TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txtSoCanCuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelLeft_TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtSoDienThoaii, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLeft_TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLeft_TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20))
                    .addComponent(jDateNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        btnXoa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnThem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnTimKiem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel21.setText("Nhập mã nhân viên:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21)
                    .addComponent(btnThem))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMaTimKiem)
                        .addGap(18, 18, 18)
                        .addComponent(btnTimKiem)
                        .addGap(45, 45, 45))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnSua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 272, Short.MAX_VALUE)
                        .addComponent(btnXoa)
                        .addGap(74, 74, 74)
                        .addComponent(btnReset)
                        .addGap(14, 14, 14))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnReset))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTimKiem)
                    .addComponent(jLabel21)
                    .addComponent(txtMaTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbDSNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbDSNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDSNVMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbDSNV);

        javax.swing.GroupLayout panelLeft_CenterLayout = new javax.swing.GroupLayout(panelLeft_Center);
        panelLeft_Center.setLayout(panelLeft_CenterLayout);
        panelLeft_CenterLayout.setHorizontalGroup(
            panelLeft_CenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLeft_CenterLayout.createSequentialGroup()
                .addGroup(panelLeft_CenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLeft_CenterLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelLeft_CenterLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        panelLeft_CenterLayout.setVerticalGroup(
            panelLeft_CenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLeft_CenterLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelLeftLayout = new javax.swing.GroupLayout(panelLeft);
        panelLeft.setLayout(panelLeftLayout);
        panelLeftLayout.setHorizontalGroup(
            panelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLeftLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(panelLeft_Top, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelLeftLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(panelLeft_Center, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelLeftLayout.setVerticalGroup(
            panelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelLeft_Top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelLeft_Center, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        String tenNV = txtTen.getText();
        Date ngaySinh = jDateNgaySinh.getDate();
        String email = txtEmail.getText();
        String socc = txtSoCanCuoc.getText();
        String sdt = txtSoDienThoaii.getText();

        // Kiểm tra dữ liệu đầu vào bằng cách sử dụng try-catch
        try {
            if (tenNV.isEmpty()) {
                throw new Exception("Vui lòng nhập tên nhân viên");
            }

            if (ngaySinh == null) {
                throw new Exception("Vui lòng chọn ngày sinh");
            }

            if (email.isEmpty()) {
                throw new Exception("Vui lòng nhập email");
            }

            if (socc.isEmpty()) {
                throw new Exception("Vui lòng nhập số căn cước");
            }

            if (sdt.isEmpty()) {
                throw new Exception("Vui lòng nhập số điện thoại");
            }

            // Tạo đối tượng nhân viên và thêm vào cơ sở dữ liệu
            NhanVien nv = new NhanVien();
            nv.setHoTen(tenNV);
            nv.setNgaySinh(ngaySinh);
            nv.setEmail(email);
            nv.setSoCanCuoc(socc);
            nv.setSDT(sdt);

            NhanVienDao.ThemNhanVien(nv);
            taiDuLieu(new NhanVienDao().HienThiDanhSachNhanVien());
            JOptionPane.showMessageDialog(this, "Thêm nhân viên thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // Kiểm tra dữ liệu đầu vào bằng cách sử dụng try-catch
        String MaNV = txtMa.getText();
        try {
            if (MaNV.isEmpty()) {
                throw new Exception("Vui lòng nhập mã nhân viên");
            }

            // Tạo hộp thoại xác nhận
            int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
            int maNV = Integer.parseInt(txtMa.getText());
            // Kiểm tra xem người dùng đã xác nhận xóa chưa
            if (confirm == JOptionPane.YES_OPTION) {
                // Nếu người dùng xác nhận xóa, tiến hành xóa lịch làm
                NhanVien nv = new NhanVien(maNV, "", null, "", "", "");

                NhanVienDao.XoaNhanVien(nv.getMaNV());

                // Cập nhật dữ liệu hiển thị
                taiDuLieu(new NhanVienDao().HienThiDanhSachNhanVien());

                // Thông báo xóa thành công
                JOptionPane.showMessageDialog(this, "Xóa thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnXoaActionPerformed

    private void tbDSNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDSNVMouseClicked
        // TODO add your handling code here:
        int row = tbDSNV.getSelectedRow();
        txtMa.setText(tbDSNV.getValueAt(row, 0) + "");
        txtTen.setText((String) tbDSNV.getValueAt(row, 1));
        try {
            Date ngaySinh = (Date) tbDSNV.getValueAt(row, 2); // Lấy giá trị Date trực tiếp từ ResultSet

            // Đặt giá trị ngày sinh cho jDateChooser
            jDateNgaySinh.setDate(ngaySinh);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        txtEmail.setText((String) tbDSNV.getValueAt(row, 3));
        txtSoCanCuoc.setText((String) tbDSNV.getValueAt(row, 4));
        txtSoDienThoaii.setText((String) tbDSNV.getValueAt(row, 5));


    }//GEN-LAST:event_tbDSNVMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:

        //int maNV = Integer.parseInt(txtMa.getText());
        String tenNV = txtTen.getText();
        Date ngaySinh = jDateNgaySinh.getDate();
        String email = txtEmail.getText();
        String socc = txtSoCanCuoc.getText();
        String sdt = txtSoDienThoaii.getText();

        try {
            String maNVStr = txtMa.getText().trim();
            if (maNVStr.isEmpty()) {
                throw new Exception("Vui lòng nhập mã nhân viên");
            }

            if (tenNV.isEmpty()) {
                throw new Exception("Vui lòng nhập tên nhân viên");
            }

            if (ngaySinh == null) {
                throw new Exception("Vui lòng chọn ngày sinh");
            }

            if (email.isEmpty()) {
                throw new Exception("Vui lòng nhập email");
            }

            if (socc.isEmpty()) {
                throw new Exception("Vui lòng nhập số căn cước");
            }

            if (sdt.isEmpty()) {
                throw new Exception("Vui lòng nhập số điện thoại");
            }
            int maNV = Integer.parseInt(txtMa.getText());
            // Khởi tạo đối tượng NhanVien với các giá trị mới
            NhanVien nv = new NhanVien(maNV, tenNV, ngaySinh, email, socc, sdt);

            // Gọi phương thức SuaNhanVien với đối tượng NhanVien đã được thiết lập giá trị
            NhanVienDao.SuaNhanVien(nv);

            // Tải lại dữ liệu
            taiDuLieu(new NhanVienDao().HienThiDanhSachNhanVien());

            // Hiển thị thông báo thành công
            JOptionPane.showMessageDialog(this, "Cập nhật thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnSuaActionPerformed

    private void txtMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtMaActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtMa.setText("");
        txtTen.setText("");
        jDateNgaySinh.setDate(null);
        txtEmail.setText("");
        txtSoDienThoaii.setText("");
        txtSoCanCuoc.setText("");
        txtMaTimKiem.setText("");

        txtTen.requestFocus();
        taiDuLieu(new NhanVienDao().HienThiDanhSachNhanVien());
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        int manv;

        try {
            manv = Integer.parseInt(txtMaTimKiem.getText());
            NhanVien nv = new NhanVien(manv, "", null, "", "", "");

            taiDuLieu(new NhanVienDao().TimNhanVien(nv.getMaNV()));

            JOptionPane.showMessageDialog(this, "Tìm thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số nguyên cho mã nhân viên", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return; // Dừng thực hiện phương thức nếu có lỗi
        }

    }//GEN-LAST:event_btnTimKiemActionPerformed

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
            java.util.logging.Logger.getLogger(ThongTinNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongTinNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongTinNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongTinNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongTinNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private com.toedter.calendar.JDateChooser jDateNgaySinh;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelLeft;
    private javax.swing.JPanel panelLeft_Center;
    private javax.swing.JPanel panelLeft_Top;
    private javax.swing.JTable tbDSNV;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtMaTimKiem;
    private javax.swing.JTextField txtSoCanCuoc;
    private javax.swing.JTextField txtSoDienThoaii;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}