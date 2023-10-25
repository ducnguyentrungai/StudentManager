package home;

import db.MyConnection;
import java.awt.Color;
import java.awt.Image;
import java.awt.print.PrinterException;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import studentmanager.Course;
import login.Login;
import studentmanager.MarksSheet;
import studentmanager.Score;
import studentmanager.Student;

public class Home extends javax.swing.JFrame {
    
    Student student = new Student();
    Course course = new Course();
    Score score = new Score();
    MarksSheet marksSheet = new MarksSheet();
    int xx, xy;
    private DefaultTableModel model;
    private String imagePath;
    private int rowIndex;
    private NumberFormat nf = NumberFormat.getInstance();
    
    public Home() {
        initComponents();
        init();
        setLocationRelativeTo(null);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plHome = new javax.swing.JPanel();
        plTitle = new javax.swing.JPanel();
        lbTitle = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        plStudent = new javax.swing.JPanel();
        plStudentInformationL = new javax.swing.JPanel();
        tfStudentID = new javax.swing.JTextField();
        tfStudentName = new javax.swing.JTextField();
        tfStudentEmail = new javax.swing.JTextField();
        tfStudentPhone = new javax.swing.JTextField();
        tfStudentFather = new javax.swing.JTextField();
        cbStudentGender = new javax.swing.JComboBox<>();
        tfStudentMother = new javax.swing.JTextField();
        tfStudentAddress1 = new javax.swing.JTextField();
        tfStudentAddress2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        plStudentIamge = new javax.swing.JPanel();
        btStudentBrowes = new javax.swing.JButton();
        plStudentShowImage = new javax.swing.JPanel();
        jLabelImage = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        dcStudentDate = new com.toedter.calendar.JDateChooser();
        plStudentInformationR = new javax.swing.JPanel();
        plStudentSearch = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        tfStudentSearch = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btStudentRefresh = new javax.swing.JButton();
        plStudentTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbStudent = new javax.swing.JTable();
        plStudentSelect = new javax.swing.JPanel();
        btStudentAdd = new javax.swing.JButton();
        btStudentUpdate = new javax.swing.JButton();
        btStudentDelete = new javax.swing.JButton();
        btStudentPrint = new javax.swing.JButton();
        btStudentClear = new javax.swing.JButton();
        btStudentLogout = new javax.swing.JButton();
        plCourse = new javax.swing.JPanel();
        plCourseL = new javax.swing.JPanel();
        plCourseSearchL = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        tfCourseIDL = new javax.swing.JTextField();
        btCourseSearchL = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        tfCourseID = new javax.swing.JTextField();
        tfCourseStudentID = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        cbCourseSemester = new javax.swing.JComboBox<>();
        cbCourseCourse1 = new javax.swing.JComboBox<>();
        cbCourseCourse2 = new javax.swing.JComboBox<>();
        cbCourseCourse3 = new javax.swing.JComboBox<>();
        cbCourseCourse4 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cbCourseCourse5 = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        plCourseR = new javax.swing.JPanel();
        plCouseSearchR = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        tfCourseIDR = new javax.swing.JTextField();
        btCourseSearchR = new javax.swing.JButton();
        btCourseRefresh = new javax.swing.JButton();
        plCourseTable = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbCourse = new javax.swing.JTable();
        plCourseSelect = new javax.swing.JPanel();
        btCourseSave = new javax.swing.JButton();
        btCoursePrint = new javax.swing.JButton();
        btCourseClear = new javax.swing.JButton();
        btCourseLogout = new javax.swing.JButton();
        plScore = new javax.swing.JPanel();
        plScoreL = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        tfScoreID = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        tfScoreStudentID = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        plScoreSearchL = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        tfScoreStudentIDL = new javax.swing.JTextField();
        tfScoreSemesterSearch = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        btScoreSearchL = new javax.swing.JButton();
        tfScoreSemester = new javax.swing.JTextField();
        tfScoreCourse1 = new javax.swing.JTextField();
        tfScoreCourse2 = new javax.swing.JTextField();
        tfScoreCourse3 = new javax.swing.JTextField();
        tfScoreCourse4 = new javax.swing.JTextField();
        tfScoreCourse5 = new javax.swing.JTextField();
        tfScoreScore1 = new javax.swing.JTextField();
        tfScoreScore2 = new javax.swing.JTextField();
        tfScoreScore3 = new javax.swing.JTextField();
        tfScoreScore4 = new javax.swing.JTextField();
        tfScoreScore5 = new javax.swing.JTextField();
        plScoreR = new javax.swing.JPanel();
        plScoreSearchR = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        tfScoreStudentIDR = new javax.swing.JTextField();
        btScoreSearchR = new javax.swing.JButton();
        btScoreRefresh = new javax.swing.JButton();
        plScoreTable = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbScore = new javax.swing.JTable();
        jPanel26 = new javax.swing.JPanel();
        btScoreSave = new javax.swing.JButton();
        btScoreUpdate = new javax.swing.JButton();
        btScorePrint = new javax.swing.JButton();
        btScoreClear = new javax.swing.JButton();
        btScoreLogout = new javax.swing.JButton();
        btScoreSort = new javax.swing.JButton();
        plMarksSheet = new javax.swing.JPanel();
        plMarksSheetL = new javax.swing.JPanel();
        plMarksSheetSearch = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        tfMarksSheetID = new javax.swing.JTextField();
        btMarksSheetSearch = new javax.swing.JButton();
        plMarksSheetGPA = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        plMarksSheetR = new javax.swing.JPanel();
        plMarksSheetSelect = new javax.swing.JPanel();
        btMarksSheetPrint = new javax.swing.JButton();
        btMarksSheetClear = new javax.swing.JButton();
        btMarksSheetLogout = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbMarksSheet = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        plHome.setBackground(new java.awt.Color(255, 255, 255));
        plHome.setPreferredSize(new java.awt.Dimension(1300, 700));
        plHome.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                plHomeMouseDragged(evt);
            }
        });
        plHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                plHomeMousePressed(evt);
            }
        });

        plTitle.setBackground(new java.awt.Color(255, 255, 255));

        lbTitle.setFont(new java.awt.Font("Times New Roman", 2, 30)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(0, 153, 153));
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("STUDENT MANAGEMENT SYSTEM");
        lbTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout plTitleLayout = new javax.swing.GroupLayout(plTitle);
        plTitle.setLayout(plTitleLayout);
        plTitleLayout.setHorizontalGroup(
            plTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        plTitleLayout.setVerticalGroup(
            plTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        plStudent.setBackground(new java.awt.Color(255, 255, 255));

        plStudentInformationL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tfStudentID.setEditable(false);
        tfStudentID.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        tfStudentName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        tfStudentEmail.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        tfStudentPhone.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tfStudentPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfStudentPhoneActionPerformed(evt);
            }
        });
        tfStudentPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfStudentPhoneKeyTyped(evt);
            }
        });

        tfStudentFather.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        cbStudentGender.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbStudentGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        tfStudentMother.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        tfStudentAddress1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        tfStudentAddress2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Student's ID ");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Student's name: ");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Date Of Birth");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Gender");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Email");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Phone ");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Father's Name");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Mother's Name ");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Address Line 1");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Address Line 2");

        plStudentIamge.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btStudentBrowes.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btStudentBrowes.setText("Browes");
        btStudentBrowes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btStudentBrowes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btStudentBrowesActionPerformed(evt);
            }
        });

        plStudentShowImage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabelImage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImage.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout plStudentShowImageLayout = new javax.swing.GroupLayout(plStudentShowImage);
        plStudentShowImage.setLayout(plStudentShowImageLayout);
        plStudentShowImageLayout.setHorizontalGroup(
            plStudentShowImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
        );
        plStudentShowImageLayout.setVerticalGroup(
            plStudentShowImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel13.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel13.setText("Image");

        javax.swing.GroupLayout plStudentIamgeLayout = new javax.swing.GroupLayout(plStudentIamge);
        plStudentIamge.setLayout(plStudentIamgeLayout);
        plStudentIamgeLayout.setHorizontalGroup(
            plStudentIamgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plStudentIamgeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plStudentIamgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(btStudentBrowes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(plStudentShowImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        plStudentIamgeLayout.setVerticalGroup(
            plStudentIamgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plStudentIamgeLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(btStudentBrowes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plStudentIamgeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(plStudentShowImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        dcStudentDate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        javax.swing.GroupLayout plStudentInformationLLayout = new javax.swing.GroupLayout(plStudentInformationL);
        plStudentInformationL.setLayout(plStudentInformationLLayout);
        plStudentInformationLLayout.setHorizontalGroup(
            plStudentInformationLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plStudentInformationLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plStudentInformationLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(plStudentIamge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(plStudentInformationLLayout.createSequentialGroup()
                        .addGroup(plStudentInformationLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(plStudentInformationLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(plStudentInformationLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(plStudentInformationLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfStudentName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfStudentID, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dcStudentDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addComponent(cbStudentGender, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfStudentEmail)
                            .addComponent(tfStudentPhone)
                            .addComponent(tfStudentFather)
                            .addComponent(tfStudentMother)
                            .addComponent(tfStudentAddress1)
                            .addComponent(tfStudentAddress2))))
                .addContainerGap())
        );
        plStudentInformationLLayout.setVerticalGroup(
            plStudentInformationLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plStudentInformationLLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(plStudentInformationLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(tfStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(plStudentInformationLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plStudentInformationLLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tfStudentName, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(plStudentInformationLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dcStudentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(plStudentInformationLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbStudentGender, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(plStudentInformationLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfStudentEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(plStudentInformationLLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(plStudentInformationLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(plStudentInformationLLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(plStudentInformationLLayout.createSequentialGroup()
                        .addComponent(tfStudentPhone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(plStudentInformationLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfStudentFather, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(plStudentInformationLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfStudentMother, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(plStudentInformationLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plStudentInformationLLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel10))
                    .addGroup(plStudentInformationLLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfStudentAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(plStudentInformationLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(tfStudentAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(plStudentIamge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        plStudentInformationR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        plStudentSearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel12.setText("Search Student");

        tfStudentSearch.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tfStudentSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfStudentSearchActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\StudentManager\\StudentManager\\src\\image\\Search.png")); // NOI18N
        jButton2.setText("Search");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btStudentRefresh.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btStudentRefresh.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\StudentManager\\StudentManager\\src\\image\\Refresh.png")); // NOI18N
        btStudentRefresh.setText("Refresh");
        btStudentRefresh.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btStudentRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btStudentRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout plStudentSearchLayout = new javax.swing.GroupLayout(plStudentSearch);
        plStudentSearch.setLayout(plStudentSearchLayout);
        plStudentSearchLayout.setHorizontalGroup(
            plStudentSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plStudentSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfStudentSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btStudentRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        plStudentSearchLayout.setVerticalGroup(
            plStudentSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plStudentSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plStudentSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfStudentSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jButton2)
                    .addComponent(btStudentRefresh))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Student's ID", "Student's name", "Date of Brith", "Gender", "Email", "Phone", "Father' Name", "Mother' Name", "Address Line1", "Address Line 2", "Image path"
            }
        ));
        tbStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbStudentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbStudent);

        javax.swing.GroupLayout plStudentTableLayout = new javax.swing.GroupLayout(plStudentTable);
        plStudentTable.setLayout(plStudentTableLayout);
        plStudentTableLayout.setHorizontalGroup(
            plStudentTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        plStudentTableLayout.setVerticalGroup(
            plStudentTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        plStudentSelect.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btStudentAdd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btStudentAdd.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\StudentManager\\StudentManager\\src\\image\\Add.png")); // NOI18N
        btStudentAdd.setText("Add");
        btStudentAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btStudentAddActionPerformed(evt);
            }
        });

        btStudentUpdate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btStudentUpdate.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\StudentManager\\StudentManager\\src\\image\\Save as.png")); // NOI18N
        btStudentUpdate.setText("Update");
        btStudentUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btStudentUpdateActionPerformed(evt);
            }
        });

        btStudentDelete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btStudentDelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\StudentManager\\StudentManager\\src\\image\\Delete.png")); // NOI18N
        btStudentDelete.setText("Delete");
        btStudentDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btStudentDeleteActionPerformed(evt);
            }
        });

        btStudentPrint.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btStudentPrint.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\StudentManager\\StudentManager\\src\\image\\Print preview.png")); // NOI18N
        btStudentPrint.setText("Print");
        btStudentPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btStudentPrintActionPerformed(evt);
            }
        });

        btStudentClear.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btStudentClear.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\StudentManager\\StudentManager\\src\\image\\broom.jpg")); // NOI18N
        btStudentClear.setText("Clear");
        btStudentClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btStudentClearActionPerformed(evt);
            }
        });

        btStudentLogout.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btStudentLogout.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\StudentManager\\StudentManager\\src\\image\\Exit.png")); // NOI18N
        btStudentLogout.setText("Logout");
        btStudentLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btStudentLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout plStudentSelectLayout = new javax.swing.GroupLayout(plStudentSelect);
        plStudentSelect.setLayout(plStudentSelectLayout);
        plStudentSelectLayout.setHorizontalGroup(
            plStudentSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plStudentSelectLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btStudentAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btStudentUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btStudentDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btStudentPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btStudentClear, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btStudentLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        plStudentSelectLayout.setVerticalGroup(
            plStudentSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plStudentSelectLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(plStudentSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btStudentUpdate)
                    .addComponent(btStudentAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btStudentDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btStudentPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btStudentClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btStudentLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout plStudentInformationRLayout = new javax.swing.GroupLayout(plStudentInformationR);
        plStudentInformationR.setLayout(plStudentInformationRLayout);
        plStudentInformationRLayout.setHorizontalGroup(
            plStudentInformationRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plStudentInformationRLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plStudentInformationRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(plStudentSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(plStudentSelect, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(plStudentTable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        plStudentInformationRLayout.setVerticalGroup(
            plStudentInformationRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plStudentInformationRLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(plStudentSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plStudentTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plStudentSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout plStudentLayout = new javax.swing.GroupLayout(plStudent);
        plStudent.setLayout(plStudentLayout);
        plStudentLayout.setHorizontalGroup(
            plStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plStudentLayout.createSequentialGroup()
                .addComponent(plStudentInformationL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plStudentInformationR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        plStudentLayout.setVerticalGroup(
            plStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plStudentLayout.createSequentialGroup()
                .addGroup(plStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(plStudentInformationR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(plStudentInformationL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Student", plStudent);

        plCourse.setBackground(new java.awt.Color(255, 255, 255));

        plCourseL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        plCourseSearchL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setText("Student's ID");

        tfCourseIDL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tfCourseIDL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCourseIDLKeyTyped(evt);
            }
        });

        btCourseSearchL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btCourseSearchL.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\StudentManager\\StudentManager\\src\\image\\Search.png")); // NOI18N
        btCourseSearchL.setText("Search");
        btCourseSearchL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btCourseSearchL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCourseSearchLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout plCourseSearchLLayout = new javax.swing.GroupLayout(plCourseSearchL);
        plCourseSearchL.setLayout(plCourseSearchLLayout);
        plCourseSearchLLayout.setHorizontalGroup(
            plCourseSearchLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plCourseSearchLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plCourseSearchLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(plCourseSearchLLayout.createSequentialGroup()
                        .addComponent(tfCourseIDL, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btCourseSearchL, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        plCourseSearchLLayout.setVerticalGroup(
            plCourseSearchLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plCourseSearchLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plCourseSearchLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btCourseSearchL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfCourseIDL))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel14.setText("Student's ID ");

        tfCourseID.setEditable(false);
        tfCourseID.setBackground(new java.awt.Color(204, 204, 204));
        tfCourseID.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        tfCourseStudentID.setEditable(false);
        tfCourseStudentID.setBackground(new java.awt.Color(204, 204, 204));
        tfCourseStudentID.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel16.setText("ID ");

        cbCourseSemester.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        cbCourseCourse1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbCourseCourse1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C", "C++", "C#", "JAVA", "Python" }));

        cbCourseCourse2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbCourseCourse2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer NetWorking", "Computer Science", "Digital Image Processing" }));

        cbCourseCourse3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbCourseCourse3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Database", "Linux", "Data Science", "Big Data", "Software Testing", " " }));

        cbCourseCourse4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbCourseCourse4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Java OOP", "JSP", "Mobile App Development", "Web Programing" }));
        cbCourseCourse4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCourseCourse4ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setText("Semester ");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setText("Course 1");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel19.setText("Course 2");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel20.setText("Course 3");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel21.setText("Course 4");

        cbCourseCourse5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbCourseCourse5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Machine Learning", "Deep Learning", "Could Computing" }));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel22.setText("Course 5");

        javax.swing.GroupLayout plCourseLLayout = new javax.swing.GroupLayout(plCourseL);
        plCourseL.setLayout(plCourseLLayout);
        plCourseLLayout.setHorizontalGroup(
            plCourseLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plCourseLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plCourseLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(plCourseSearchL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(plCourseLLayout.createSequentialGroup()
                        .addGroup(plCourseLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(plCourseLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbCourseCourse4, javax.swing.GroupLayout.Alignment.LEADING, 0, 328, Short.MAX_VALUE)
                            .addComponent(cbCourseCourse3, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbCourseCourse2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbCourseCourse1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbCourseSemester, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfCourseStudentID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCourseID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbCourseCourse5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        plCourseLLayout.setVerticalGroup(
            plCourseLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plCourseLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(plCourseSearchL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(plCourseLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfCourseID, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(plCourseLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tfCourseStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(plCourseLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(cbCourseSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(plCourseLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCourseCourse1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(plCourseLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(cbCourseCourse2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(plCourseLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(cbCourseCourse3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(plCourseLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(cbCourseCourse4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(plCourseLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCourseCourse5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        plCourseR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        plCouseSearchR.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Search Student");

        tfCourseIDR.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        btCourseSearchR.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btCourseSearchR.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\StudentManager\\StudentManager\\src\\image\\Search.png")); // NOI18N
        btCourseSearchR.setText("Search");
        btCourseSearchR.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btCourseSearchR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCourseSearchRActionPerformed(evt);
            }
        });

        btCourseRefresh.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btCourseRefresh.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\StudentManager\\StudentManager\\src\\image\\Refresh.png")); // NOI18N
        btCourseRefresh.setText("Refresh");
        btCourseRefresh.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btCourseRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCourseRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout plCouseSearchRLayout = new javax.swing.GroupLayout(plCouseSearchR);
        plCouseSearchR.setLayout(plCouseSearchRLayout);
        plCouseSearchRLayout.setHorizontalGroup(
            plCouseSearchRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plCouseSearchRLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tfCourseIDR, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btCourseSearchR, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btCourseRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                .addContainerGap())
        );
        plCouseSearchRLayout.setVerticalGroup(
            plCouseSearchRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plCouseSearchRLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(plCouseSearchRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCourseIDR, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCourseSearchR)
                    .addComponent(btCourseRefresh))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        tbCourse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbCourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "ID", "Student's ID", "Semester", "Course 1", "Course 2", "Course 3", "Course 4", "Course 5"
            }
        ));
        jScrollPane2.setViewportView(tbCourse);

        javax.swing.GroupLayout plCourseTableLayout = new javax.swing.GroupLayout(plCourseTable);
        plCourseTable.setLayout(plCourseTableLayout);
        plCourseTableLayout.setHorizontalGroup(
            plCourseTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        plCourseTableLayout.setVerticalGroup(
            plCourseTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
        );

        plCourseSelect.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btCourseSave.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btCourseSave.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\StudentManager\\StudentManager\\src\\image\\Save.png")); // NOI18N
        btCourseSave.setText("Save");
        btCourseSave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btCourseSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCourseSaveActionPerformed(evt);
            }
        });

        btCoursePrint.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btCoursePrint.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\StudentManager\\StudentManager\\src\\image\\Print preview.png")); // NOI18N
        btCoursePrint.setText("Print");
        btCoursePrint.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btCoursePrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCoursePrintActionPerformed(evt);
            }
        });

        btCourseClear.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btCourseClear.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\StudentManager\\StudentManager\\src\\image\\broom.jpg")); // NOI18N
        btCourseClear.setText("Clear");
        btCourseClear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btCourseClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCourseClearActionPerformed(evt);
            }
        });

        btCourseLogout.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btCourseLogout.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\StudentManager\\StudentManager\\src\\image\\Exit.png")); // NOI18N
        btCourseLogout.setText("Logout");
        btCourseLogout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btCourseLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCourseLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout plCourseSelectLayout = new javax.swing.GroupLayout(plCourseSelect);
        plCourseSelect.setLayout(plCourseSelectLayout);
        plCourseSelectLayout.setHorizontalGroup(
            plCourseSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plCourseSelectLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btCourseSave, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btCoursePrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btCourseClear, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btCourseLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        plCourseSelectLayout.setVerticalGroup(
            plCourseSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plCourseSelectLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plCourseSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCourseClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCourseLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCoursePrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCourseSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout plCourseRLayout = new javax.swing.GroupLayout(plCourseR);
        plCourseR.setLayout(plCourseRLayout);
        plCourseRLayout.setHorizontalGroup(
            plCourseRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plCourseRLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plCourseRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(plCourseSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(plCouseSearchR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(plCourseTable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        plCourseRLayout.setVerticalGroup(
            plCourseRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plCourseRLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(plCouseSearchR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(plCourseTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(plCourseSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout plCourseLayout = new javax.swing.GroupLayout(plCourse);
        plCourse.setLayout(plCourseLayout);
        plCourseLayout.setHorizontalGroup(
            plCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plCourseLayout.createSequentialGroup()
                .addComponent(plCourseL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plCourseR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        plCourseLayout.setVerticalGroup(
            plCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plCourseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(plCourseL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(plCourseR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Course", plCourse);

        plScore.setBackground(new java.awt.Color(255, 255, 255));

        plScoreL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel23.setText("Course 2");

        tfScoreID.setEditable(false);
        tfScoreID.setBackground(new java.awt.Color(204, 204, 204));
        tfScoreID.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        tfScoreID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfScoreIDActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel24.setText("Course 3");

        jLabel50.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel50.setText("ID ");

        jLabel51.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel51.setText("Course 4");

        jLabel52.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel52.setText("Course 5");

        jLabel53.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel53.setText("Student's ID ");

        tfScoreStudentID.setEditable(false);
        tfScoreStudentID.setBackground(new java.awt.Color(204, 204, 204));
        tfScoreStudentID.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        tfScoreStudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfScoreStudentIDActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel54.setText("Semester ");

        jLabel55.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel55.setText("Course 1");

        plScoreSearchL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel56.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel56.setText("Student's ID");

        tfScoreStudentIDL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tfScoreStudentIDL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfScoreStudentIDLKeyTyped(evt);
            }
        });

        tfScoreSemesterSearch.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tfScoreSemesterSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfScoreSemesterSearchKeyTyped(evt);
            }
        });

        jLabel57.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel57.setText("Semester ");

        btScoreSearchL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btScoreSearchL.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\StudentManager\\StudentManager\\src\\image\\Search.png")); // NOI18N
        btScoreSearchL.setText("Search");
        btScoreSearchL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btScoreSearchL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btScoreSearchLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addComponent(btScoreSearchL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btScoreSearchL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout plScoreSearchLLayout = new javax.swing.GroupLayout(plScoreSearchL);
        plScoreSearchL.setLayout(plScoreSearchLLayout);
        plScoreSearchLLayout.setHorizontalGroup(
            plScoreSearchLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plScoreSearchLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plScoreSearchLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel57)
                    .addGroup(plScoreSearchLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tfScoreSemesterSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                        .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfScoreStudentIDL)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        plScoreSearchLLayout.setVerticalGroup(
            plScoreSearchLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plScoreSearchLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plScoreSearchLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(plScoreSearchLLayout.createSequentialGroup()
                        .addComponent(jLabel56)
                        .addGap(12, 12, 12)
                        .addComponent(tfScoreStudentIDL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfScoreSemesterSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tfScoreSemester.setEditable(false);
        tfScoreSemester.setBackground(new java.awt.Color(204, 204, 204));
        tfScoreSemester.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        tfScoreCourse1.setEditable(false);
        tfScoreCourse1.setBackground(new java.awt.Color(204, 204, 204));
        tfScoreCourse1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        tfScoreCourse2.setEditable(false);
        tfScoreCourse2.setBackground(new java.awt.Color(204, 204, 204));
        tfScoreCourse2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        tfScoreCourse2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfScoreCourse2ActionPerformed(evt);
            }
        });

        tfScoreCourse3.setEditable(false);
        tfScoreCourse3.setBackground(new java.awt.Color(204, 204, 204));
        tfScoreCourse3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        tfScoreCourse4.setEditable(false);
        tfScoreCourse4.setBackground(new java.awt.Color(204, 204, 204));
        tfScoreCourse4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        tfScoreCourse5.setEditable(false);
        tfScoreCourse5.setBackground(new java.awt.Color(204, 204, 204));
        tfScoreCourse5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        tfScoreScore1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tfScoreScore1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfScoreScore1.setText("0.0");
        tfScoreScore1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfScoreScore1ActionPerformed(evt);
            }
        });

        tfScoreScore2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tfScoreScore2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfScoreScore2.setText("0.0");

        tfScoreScore3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tfScoreScore3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfScoreScore3.setText("0.0");
        tfScoreScore3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfScoreScore3ActionPerformed(evt);
            }
        });

        tfScoreScore4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tfScoreScore4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfScoreScore4.setText("0.0");

        tfScoreScore5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tfScoreScore5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfScoreScore5.setText("0.0");

        javax.swing.GroupLayout plScoreLLayout = new javax.swing.GroupLayout(plScoreL);
        plScoreL.setLayout(plScoreLLayout);
        plScoreLLayout.setHorizontalGroup(
            plScoreLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plScoreLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plScoreLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(plScoreSearchL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(plScoreLLayout.createSequentialGroup()
                        .addGroup(plScoreLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel52)
                            .addGroup(plScoreLLayout.createSequentialGroup()
                                .addGroup(plScoreLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24)
                                    .addGroup(plScoreLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel54))
                                    .addComponent(jLabel51)
                                    .addComponent(jLabel55)
                                    .addGroup(plScoreLLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel50)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(plScoreLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, plScoreLLayout.createSequentialGroup()
                                        .addGroup(plScoreLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tfScoreCourse4)
                                            .addGroup(plScoreLLayout.createSequentialGroup()
                                                .addGap(0, 1, Short.MAX_VALUE)
                                                .addComponent(tfScoreCourse3, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(tfScoreCourse2)
                                            .addComponent(tfScoreCourse5))
                                        .addGap(18, 18, 18)
                                        .addGroup(plScoreLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tfScoreScore3, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfScoreScore4, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfScoreScore5, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfScoreScore2)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, plScoreLLayout.createSequentialGroup()
                                        .addGroup(plScoreLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tfScoreID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                            .addComponent(tfScoreStudentID, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfScoreSemester, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfScoreCourse1, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(18, 18, 18)
                                        .addComponent(tfScoreScore1)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        plScoreLLayout.setVerticalGroup(
            plScoreLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plScoreLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(plScoreSearchL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(plScoreLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(tfScoreID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(plScoreLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel53)
                    .addComponent(tfScoreStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(plScoreLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(tfScoreSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(plScoreLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(tfScoreScore1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfScoreCourse1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(plScoreLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(tfScoreScore2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfScoreCourse2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(plScoreLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(tfScoreScore3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfScoreCourse3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(plScoreLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(tfScoreScore4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfScoreCourse4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(plScoreLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(tfScoreScore5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfScoreCourse5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        plScoreR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        plScoreSearchR.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel37.setText("Search Student");

        tfScoreStudentIDR.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N

        btScoreSearchR.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btScoreSearchR.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\StudentManager\\StudentManager\\src\\image\\Search.png")); // NOI18N
        btScoreSearchR.setText("Search");
        btScoreSearchR.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btScoreSearchR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btScoreSearchRActionPerformed(evt);
            }
        });

        btScoreRefresh.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btScoreRefresh.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\StudentManager\\StudentManager\\src\\image\\Refresh.png")); // NOI18N
        btScoreRefresh.setText("Refresh");
        btScoreRefresh.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btScoreRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btScoreRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout plScoreSearchRLayout = new javax.swing.GroupLayout(plScoreSearchR);
        plScoreSearchR.setLayout(plScoreSearchRLayout);
        plScoreSearchRLayout.setHorizontalGroup(
            plScoreSearchRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plScoreSearchRLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfScoreStudentIDR, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btScoreSearchR, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btScoreRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        plScoreSearchRLayout.setVerticalGroup(
            plScoreSearchRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plScoreSearchRLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(plScoreSearchRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(tfScoreStudentIDR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btScoreSearchR)
                    .addComponent(btScoreRefresh))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        tbScore.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "ID", "Student's ID", "Semester", "Course1", "Score 1", "Course 2", "Socre 2", "Course 3", "Score 3", "Course 4", "Score 4", "Course 5", "Score 5", "Average"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbScore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbScoreMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbScore);

        javax.swing.GroupLayout plScoreTableLayout = new javax.swing.GroupLayout(plScoreTable);
        plScoreTable.setLayout(plScoreTableLayout);
        plScoreTableLayout.setHorizontalGroup(
            plScoreTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        plScoreTableLayout.setVerticalGroup(
            plScoreTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
        );

        jPanel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btScoreSave.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btScoreSave.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\StudentManager\\StudentManager\\src\\image\\Save.png")); // NOI18N
        btScoreSave.setText("Save");
        btScoreSave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btScoreSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btScoreSaveActionPerformed(evt);
            }
        });

        btScoreUpdate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btScoreUpdate.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\StudentManager\\StudentManager\\src\\image\\Save as.png")); // NOI18N
        btScoreUpdate.setText("Uppdate");
        btScoreUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btScoreUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btScoreUpdateActionPerformed(evt);
            }
        });

        btScorePrint.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btScorePrint.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\StudentManager\\StudentManager\\src\\image\\Print preview.png")); // NOI18N
        btScorePrint.setText("Print");
        btScorePrint.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btScorePrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btScorePrintActionPerformed(evt);
            }
        });

        btScoreClear.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btScoreClear.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\StudentManager\\StudentManager\\src\\image\\broom.jpg")); // NOI18N
        btScoreClear.setText("Clear");
        btScoreClear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btScoreClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btScoreClearActionPerformed(evt);
            }
        });

        btScoreLogout.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btScoreLogout.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\StudentManager\\StudentManager\\src\\image\\Exit.png")); // NOI18N
        btScoreLogout.setText("Logout");
        btScoreLogout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btScoreLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btScoreLogoutActionPerformed(evt);
            }
        });

        btScoreSort.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btScoreSort.setText("Sort ");
        btScoreSort.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btScoreSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btScoreSortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btScoreSave, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btScoreUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btScorePrint, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btScoreSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btScoreClear, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btScoreLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btScorePrint)
                    .addComponent(btScoreUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btScoreClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btScoreLogout)
                    .addComponent(btScoreSave)
                    .addComponent(btScoreSort))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout plScoreRLayout = new javax.swing.GroupLayout(plScoreR);
        plScoreR.setLayout(plScoreRLayout);
        plScoreRLayout.setHorizontalGroup(
            plScoreRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plScoreRLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plScoreRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(plScoreSearchR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(plScoreTable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        plScoreRLayout.setVerticalGroup(
            plScoreRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plScoreRLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(plScoreSearchR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plScoreTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout plScoreLayout = new javax.swing.GroupLayout(plScore);
        plScore.setLayout(plScoreLayout);
        plScoreLayout.setHorizontalGroup(
            plScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plScoreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(plScoreL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plScoreR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        plScoreLayout.setVerticalGroup(
            plScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plScoreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(plScoreR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(plScoreL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Score", plScore);

        plMarksSheet.setBackground(new java.awt.Color(255, 255, 255));

        plMarksSheetL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        plMarksSheetSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel26.setText("Student's ID");

        tfMarksSheetID.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        btMarksSheetSearch.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btMarksSheetSearch.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\StudentManager\\StudentManager\\src\\image\\Search.png")); // NOI18N
        btMarksSheetSearch.setText("Search");
        btMarksSheetSearch.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btMarksSheetSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMarksSheetSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout plMarksSheetSearchLayout = new javax.swing.GroupLayout(plMarksSheetSearch);
        plMarksSheetSearch.setLayout(plMarksSheetSearchLayout);
        plMarksSheetSearchLayout.setHorizontalGroup(
            plMarksSheetSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plMarksSheetSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plMarksSheetSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addGroup(plMarksSheetSearchLayout.createSequentialGroup()
                        .addComponent(tfMarksSheetID, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btMarksSheetSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        plMarksSheetSearchLayout.setVerticalGroup(
            plMarksSheetSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plMarksSheetSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plMarksSheetSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMarksSheetID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMarksSheetSearch))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("GPA: 0.0");

        javax.swing.GroupLayout plMarksSheetGPALayout = new javax.swing.GroupLayout(plMarksSheetGPA);
        plMarksSheetGPA.setLayout(plMarksSheetGPALayout);
        plMarksSheetGPALayout.setHorizontalGroup(
            plMarksSheetGPALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plMarksSheetGPALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        plMarksSheetGPALayout.setVerticalGroup(
            plMarksSheetGPALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plMarksSheetGPALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout plMarksSheetLLayout = new javax.swing.GroupLayout(plMarksSheetL);
        plMarksSheetL.setLayout(plMarksSheetLLayout);
        plMarksSheetLLayout.setHorizontalGroup(
            plMarksSheetLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(plMarksSheetGPA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(plMarksSheetSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        plMarksSheetLLayout.setVerticalGroup(
            plMarksSheetLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plMarksSheetLLayout.createSequentialGroup()
                .addComponent(plMarksSheetSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(plMarksSheetGPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        plMarksSheetR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        plMarksSheetSelect.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btMarksSheetPrint.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btMarksSheetPrint.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\StudentManager\\StudentManager\\src\\image\\Print preview.png")); // NOI18N
        btMarksSheetPrint.setText("Print");
        btMarksSheetPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMarksSheetPrintActionPerformed(evt);
            }
        });

        btMarksSheetClear.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btMarksSheetClear.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\StudentManager\\StudentManager\\src\\image\\broom.jpg")); // NOI18N
        btMarksSheetClear.setText("Clear");
        btMarksSheetClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMarksSheetClearActionPerformed(evt);
            }
        });

        btMarksSheetLogout.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btMarksSheetLogout.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\StudentManager\\StudentManager\\src\\image\\Exit.png")); // NOI18N
        btMarksSheetLogout.setText("Logout");
        btMarksSheetLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMarksSheetLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout plMarksSheetSelectLayout = new javax.swing.GroupLayout(plMarksSheetSelect);
        plMarksSheetSelect.setLayout(plMarksSheetSelectLayout);
        plMarksSheetSelectLayout.setHorizontalGroup(
            plMarksSheetSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plMarksSheetSelectLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btMarksSheetPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btMarksSheetClear, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(btMarksSheetLogout)
                .addContainerGap(381, Short.MAX_VALUE))
        );
        plMarksSheetSelectLayout.setVerticalGroup(
            plMarksSheetSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plMarksSheetSelectLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plMarksSheetSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btMarksSheetPrint, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(btMarksSheetClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(plMarksSheetSelectLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btMarksSheetLogout)))
                .addContainerGap())
        );

        tbMarksSheet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "ID", "Student's ID", "Semester", "Course1", "Score 1", "Course 2", "Socre 2", "Course 3", "Score 3", "Course 4", "Score 4", "Course 5", "Score 5", "Average"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tbMarksSheet);

        javax.swing.GroupLayout plMarksSheetRLayout = new javax.swing.GroupLayout(plMarksSheetR);
        plMarksSheetR.setLayout(plMarksSheetRLayout);
        plMarksSheetRLayout.setHorizontalGroup(
            plMarksSheetRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plMarksSheetRLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plMarksSheetRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addComponent(plMarksSheetSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        plMarksSheetRLayout.setVerticalGroup(
            plMarksSheetRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plMarksSheetRLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plMarksSheetSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout plMarksSheetLayout = new javax.swing.GroupLayout(plMarksSheet);
        plMarksSheet.setLayout(plMarksSheetLayout);
        plMarksSheetLayout.setHorizontalGroup(
            plMarksSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plMarksSheetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(plMarksSheetL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(plMarksSheetR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        plMarksSheetLayout.setVerticalGroup(
            plMarksSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plMarksSheetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plMarksSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(plMarksSheetL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(plMarksSheetR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Marks Sheet", plMarksSheet);

        javax.swing.GroupLayout plHomeLayout = new javax.swing.GroupLayout(plHome);
        plHome.setLayout(plHomeLayout);
        plHomeLayout.setHorizontalGroup(
            plHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(plTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        plHomeLayout.setVerticalGroup(
            plHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plHomeLayout.createSequentialGroup()
                .addComponent(plTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(plHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(plHome, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void init() {
        tableViewStudent();
        tableViewCourse();
        tableViewScore();
        tableViewScoreView();
        tfStudentID.setText(String.valueOf(student.getMax()));
        tfCourseID.setText(String.valueOf(course.getMax()));
        tfScoreID.setText(String.valueOf(score.getMax()));
    }
    
    private void tableViewStudent() {
        student.getStudentValue(tbStudent, "");
        model = (DefaultTableModel) tbStudent.getModel();
        tbStudent.setRowHeight(30);
        tbStudent.setShowGrid(true);
        tbStudent.setGridColor(Color.black);
        tbStudent.setBackground(Color.white);
        
    }
    
    private void tableViewCourse() {
        course.getCourseValue(tbCourse, "");
        model = (DefaultTableModel) tbCourse.getModel();
        tbCourse.setRowHeight(30);
        tbCourse.setShowGrid(true);
        tbCourse.setGridColor(Color.black);
        tbCourse.setBackground(Color.white);
    }
    
    private void tableViewScore() {
        score.getScoreValue(tbScore, "");
        model = (DefaultTableModel) tbScore.getModel();
        tbScore.setRowHeight(30);
        tbScore.setShowGrid(true);
        tbScore.setGridColor(Color.black);
        tbScore.setBackground(Color.white);
    }
    
    private void tableViewScoreView() {
        model = (DefaultTableModel) tbMarksSheet.getModel();
        tbMarksSheet.setRowHeight(30);
        tbMarksSheet.setShowGrid(true);
        tbMarksSheet.setGridColor(Color.black);
        tbMarksSheet.setBackground(Color.white);
    }
    
    public void clearStudent() {
        // Khi ta clear thì thông tin rỗng.
        tfStudentID.setText(String.valueOf(student.getMax()));
        tfStudentName.setText(null);
        tfStudentEmail.setText(null);
        tfStudentPhone.setText(null);
        tfStudentFather.setText(null);
        tfStudentMother.setText(null);
        tfStudentAddress1.setText(null);
        tfStudentAddress2.setText(null);
        dcStudentDate.setDate(null);
        cbStudentGender.setSelectedIndex(0);
        jLabelImage.setIcon(null);
        tbStudent.clearSelection();
        imagePath = null;
    }
    
    public void clearCourse() {
        tfCourseID.setText(String.valueOf(course.getMax()));
        tfScoreCourse3.setText(null);
        tfCourseStudentID.setText(null);
        cbCourseSemester.removeAllItems();
        cbCourseCourse1.setSelectedIndex(0);
        cbCourseCourse2.setSelectedIndex(0);
        cbCourseCourse3.setSelectedIndex(0);
        cbCourseCourse4.setSelectedIndex(0);
        cbCourseCourse5.setSelectedIndex(0);
        tbCourse.clearSelection();
    }
    
    public void clearSore() {
        tfScoreID.setText(String.valueOf(score.getMax()));
        tfScoreStudentIDL.setText(null);
        tfScoreSemesterSearch.setText(null);
        tfScoreStudentID.setText(null);
        tfScoreID.setText(null);
        tfScoreSemester.setText(null);
        tfScoreCourse1.setText(null);
        tfScoreCourse2.setText(null);
        tfScoreCourse3.setText(null);
        tfScoreCourse4.setText(null);
        tfScoreCourse5.setText(null);
        tfScoreScore1.setText("0.0");
        tfScoreScore2.setText("0.0");
        tfScoreScore3.setText("0.0");
        tfScoreScore4.setText("0.0");
        tfScoreScore5.setText("0.0");
        tbScore.clearSelection();
        
    }
    
    public boolean isEmptyStudent() {
        if (tfStudentName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Student name is missing");
            return false;
        }
        if (dcStudentDate.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Student date of birth is missing");
            return false;
        }
        if (dcStudentDate.getDate().compareTo(new Date()) > 0) {
            JOptionPane.showMessageDialog(this, "No student from the future are allowed");
            return false;
        }
        if (tfStudentEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Student email address is missing");
            return false;
        }
        if (!tfStudentEmail.getText().matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            JOptionPane.showMessageDialog(this, "Invalid email address");
            return false;
        }
        if (tfStudentPhone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Student phone number is missing");
            return false;
        }
        if (tfStudentPhone.getText().length() != 10) {
            JOptionPane.showMessageDialog(this, "Student Phone number must be '10' digits!");
            return false;
        }
        
        if (tfStudentFather.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Student father name is missing");
            return false;
        }
        if (tfStudentMother.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Student mother name is missing");
            return false;
        }
        if (tfStudentAddress1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Address line 1 is missing");
            return false;
        }
        if (tfStudentAddress2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Address line 2 is missing");
            return false;
        }
        return true;
        
    }

    private void tfScoreScore1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfScoreScore1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfScoreScore1ActionPerformed

    private void btStudentLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btStudentLogoutActionPerformed
        int a = JOptionPane.showConfirmDialog(this, "Do you want to logout now?",
                "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_btStudentLogoutActionPerformed

    private void btMarksSheetSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMarksSheetSearchActionPerformed
        if (tfMarksSheetID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a student id");
        } else {
            int sid = Integer.parseInt(tfMarksSheetID.getText());
            if (marksSheet.isIdExist(sid)) {
                
                tbMarksSheet.setModel(new DefaultTableModel(null, new Object[]{"ID", "StudentID", "Semester",
                    "Course1", "Score1", "Course2", "Score2", "Course3", "Score3", "Course4", "Score4", "Course5", "Score5", "Average"}));
                marksSheet.getMarksSheetValue(tbMarksSheet, sid);
                
                String gpa = String.valueOf(String.format("%.2f", marksSheet.getGPA(sid)));
                jLabel27.setText("GPA: " + gpa);
            } else {
                JOptionPane.showMessageDialog(this, "Not found");
            }
        }
    }//GEN-LAST:event_btMarksSheetSearchActionPerformed

    private void tfScoreScore3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfScoreScore3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfScoreScore3ActionPerformed

    private void btCourseLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCourseLogoutActionPerformed
        int a = JOptionPane.showConfirmDialog(this, "Do you want to logout now?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_btCourseLogoutActionPerformed

    private void btScoreLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btScoreLogoutActionPerformed
        int a = JOptionPane.showConfirmDialog(this, "Do you want to logout now?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_btScoreLogoutActionPerformed

    private void btMarksSheetLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMarksSheetLogoutActionPerformed
        int a = JOptionPane.showConfirmDialog(this, "Do you want to logout now?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_btMarksSheetLogoutActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.1; i < 1.0; i += 0.1) {
            String s = i + "";
            float f = Float.parseFloat(s);
            this.setOpacity(f);
            try {
                Thread.sleep(30);
            } catch (InterruptedException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void btStudentClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btStudentClearActionPerformed
        clearStudent();
    }//GEN-LAST:event_btStudentClearActionPerformed

    private void btStudentAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btStudentAddActionPerformed
        if (isEmptyStudent()) {
            if (!student.isEmailExist(tfStudentEmail.getText())) {
                if (!student.isPhoneExist(tfStudentPhone.getText())) {
                    int id = student.getMax();
                    String name = tfStudentName.getText();
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    String date = dateFormat.format(dcStudentDate.getDate());
                    String gender = cbStudentGender.getSelectedItem().toString();
                    String email = tfStudentEmail.getText();
                    String phone = tfStudentPhone.getText();
                    String father = tfStudentFather.getText();
                    String mother = tfStudentMother.getText();
                    String address1 = tfStudentAddress1.getText();
                    String address2 = tfStudentAddress2.getText();
                    student.insert(id, name, date, gender, email, phone, father,
                            mother, address1, address2, imagePath);
                    tbStudent.setModel(new DefaultTableModel(null, new Object[]{"Student ID", "Student Name",
                        "Date of Birth", "Gender", "Email", "Phone Number",
                        "Father Name", "Mother Name", "Address Line 1", "Address Line 2", "Image Path"}));
                    student.getStudentValue(tbStudent, "");                    
                    clearStudent();
                } else {
                    JOptionPane.showMessageDialog(this, "This phone alreadly exists");
                }
            } else {
                JOptionPane.showMessageDialog(this, "This email alreadly exists");
            }
        }
    }//GEN-LAST:event_btStudentAddActionPerformed

    private void tfStudentPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfStudentPhoneKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "The phone number must be a number!");
        }
    }//GEN-LAST:event_tfStudentPhoneKeyTyped

    private void btStudentBrowesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btStudentBrowesActionPerformed
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*image",
                "jpg", "gif", "png");
        file.addChoosableFileFilter(filter);
        int output = file.showSaveDialog(file);
        if (output == JFileChooser.APPROVE_OPTION) {
            File selectFile = file.getSelectedFile();
            String path = selectFile.getAbsolutePath();
            jLabelImage.setIcon(imageAdjust(path, null));
            imagePath = path;
        } else {
            JOptionPane.showMessageDialog(this, "No image selected");
        }
    }//GEN-LAST:event_btStudentBrowesActionPerformed

    private void btStudentUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btStudentUpdateActionPerformed
        if (isEmptyStudent()) {
            int id = Integer.parseInt(tfStudentID.getText());
            if (student.isIdExist(id)) {
                if (!check()) {
                    String name = tfStudentName.getText();
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    String date = dateFormat.format(dcStudentDate.getDate());
                    String gender = cbStudentGender.getSelectedItem().toString();
                    String email = tfStudentEmail.getText();
                    String phone = tfStudentPhone.getText();
                    String father = tfStudentFather.getText();
                    String mother = tfStudentMother.getText();
                    String address1 = tfStudentAddress1.getText();
                    String address2 = tfStudentAddress2.getText();
                    student.update(id, name, date, gender, email, phone, father, mother, address1, address2, imagePath);
                    tbStudent.setModel(new DefaultTableModel(null, new Object[]{"Student ID", "Student Name",
                        "Date of Birth", "Gender", "Email", "Phone Number",
                        "Father Name", "Mother Name", "Address Line 1", "Address Line 2", "Image Path"}));
                    student.getStudentValue(tbStudent, "");   // Đẩy thông tin sinh viên bảng sinh viên. 
                    clearStudent();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Student id doesn't exits");
            }
        }
    }//GEN-LAST:event_btStudentUpdateActionPerformed
    public boolean check() {
        String newEmail = tfStudentEmail.getText();
        String newPhone = tfStudentPhone.getText();
        String oldEmail = model.getValueAt(rowIndex, 4).toString();
        String oldPhone = model.getValueAt(rowIndex, 5).toString();
        if (newEmail.equals(oldEmail) && newPhone.equals(oldPhone)) {
            return false;
        } else {
            if (!newEmail.equals(oldEmail)) {
                boolean x = student.isEmailExist(newEmail);
                if (x) {
                    JOptionPane.showMessageDialog(this, "This email already exists");
                }
                return x;
            }
            if (!newPhone.equals(oldPhone)) {
                boolean x = student.isPhoneExist(newPhone);
                if (x) {
                    JOptionPane.showMessageDialog(this, "This phone numbber already exists");
                }
                return x;
            }
        }
        return false;
    }

    private void tbStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbStudentMouseClicked
        model = (DefaultTableModel) tbStudent.getModel();
        rowIndex = tbStudent.getSelectedRow();
        tfStudentID.setText(model.getValueAt(rowIndex, 0).toString());
        tfStudentName.setText(model.getValueAt(rowIndex, 1).toString());
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rowIndex, 2).toString());
            dcStudentDate.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        String gender = model.getValueAt(rowIndex, 3).toString();
        if (gender.equals("Male")) {
            cbStudentGender.setSelectedIndex(0);
        } else {
            cbStudentGender.setSelectedIndex(1);
        }
        tfStudentEmail.setText(model.getValueAt(rowIndex, 4).toString());
        tfStudentPhone.setText(model.getValueAt(rowIndex, 5).toString());
        tfStudentFather.setText(model.getValueAt(rowIndex, 6).toString());
        tfStudentMother.setText(model.getValueAt(rowIndex, 7).toString());
        tfStudentAddress1.setText(model.getValueAt(rowIndex, 8).toString());
        tfStudentAddress2.setText(model.getValueAt(rowIndex, 9).toString());
        String path = String.valueOf(model.getValueAt(rowIndex, 10));
        imagePath = path;
        jLabelImage.setIcon(imageAdjust(path, null));
    }//GEN-LAST:event_tbStudentMouseClicked

    private void btStudentDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btStudentDeleteActionPerformed
        int id = Integer.parseInt(tfStudentID.getText());
        if (student.isIdExist(id)) {
            student.delete(id);
            tbStudent.setModel(new DefaultTableModel(null, new Object[]{
                "Student ID", "Student Name",
                "Date of Birth", "Gender", "Email", "Phone Number",
                "Father Name", "Mother Name", "Address Line 1",
                "Address Line 2", "Image Path"}));
            student.getStudentValue(tbStudent, "");            
            clearStudent();
        } else {
            JOptionPane.showMessageDialog(this, "");
        }
    }//GEN-LAST:event_btStudentDeleteActionPerformed

    private void tfStudentSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfStudentSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfStudentSearchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (tfStudentSearch.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a student id");
        } else {
            tbStudent.setModel(new DefaultTableModel(null, new Object[]{"Student ID", "Student Name",
                "Date of Birth", "Gender", "Email", "Phone Number",
                "Father Name", "Mother Name", "Address Line 1", "Address Line 2", "Image Path"}));
            student.searchStudent(tbStudent, tfStudentSearch.getText());
            clearStudent();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btStudentRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btStudentRefreshActionPerformed
        tbStudent.setModel(new DefaultTableModel(null, new Object[]{"Student ID", "Student Name",
            "Date of Birth", "Gender", "Email", "Phone Number",
            "Father Name", "Mother Name", "Address Line 1", "Address Line 2", "Image Path"}));
        student.refreshStudent(tbStudent);
        tfStudentSearch.setText(null);
    }//GEN-LAST:event_btStudentRefreshActionPerformed

    private void btStudentPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btStudentPrintActionPerformed
        try {
            MessageFormat header = new MessageFormat("Students Information");
            MessageFormat footer = new MessageFormat("Page{0, number, integer}");
            tbStudent.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (PrinterException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btStudentPrintActionPerformed

    private void cbCourseCourse4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCourseCourse4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCourseCourse4ActionPerformed

    private void btCourseClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCourseClearActionPerformed
        clearCourse();
    }//GEN-LAST:event_btCourseClearActionPerformed

    private void btCourseSearchLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCourseSearchLActionPerformed
        if (tfCourseIDL.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a student id");
        } else {
            int id = Integer.parseInt(tfCourseIDL.getText());
            if (course.getId(id)) {
                cbCourseSemester.removeAllItems();
                int semester = course.countSemester(id);
                if (semester >= 0) {
                    for (int i = 1; i <= semester + 1; i++) {
                        cbCourseSemester.addItem(i + "");
                    }
                }
            }
        }
    }//GEN-LAST:event_btCourseSearchLActionPerformed

    private void btCourseSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCourseSaveActionPerformed
        if (tfCourseStudentID.getText().isEmpty() || cbCourseSemester.getItemCount() == 0) {
            JOptionPane.showMessageDialog(this, "Student id or semester number is missing");
        } else {
            int id = course.getMax();
            int sid = Integer.parseInt(tfCourseStudentID.getText());
            int semesterNo = Integer.parseInt(cbCourseSemester.getSelectedItem().toString());
            String course1 = cbCourseCourse1.getSelectedItem().toString();
            String course2 = cbCourseCourse2.getSelectedItem().toString();
            String course3 = cbCourseCourse3.getSelectedItem().toString();
            String course4 = cbCourseCourse4.getSelectedItem().toString();
            String course5 = cbCourseCourse5.getSelectedItem().toString();
            if (course.isSemesterExist(sid, semesterNo)) {
                JOptionPane.showMessageDialog(this, "This student has already taken semester" + semesterNo);
            } else {
                if (course.isCourseExist(sid, "course1", course1)) {
                    JOptionPane.showMessageDialog(this, "This student has already taken " + course1 + " course");
                } else {
                    if (course.isCourseExist(sid, "course2", course2)) {
                        JOptionPane.showMessageDialog(this, "This student has already taken " + course2 + " course");
                    } else {
                        if (course.isCourseExist(sid, "course3", course3)) {
                            JOptionPane.showMessageDialog(this, "This student has already taken " + course3 + " course");
                        } else {
                            if (course.isCourseExist(sid, "course4", course4)) {
                                JOptionPane.showMessageDialog(this, "This student has already taken " + course4 + " course");
                            } else {
                                if (course.isCourseExist(sid, "course5", course5)) {
                                    JOptionPane.showMessageDialog(this, "This student has already taken " + course5 + " course");
                                } else {
                                    course.insert(id, sid, semesterNo, course1, course2, course3, course4, course5);
                                    tbCourse.setModel(new DefaultTableModel(null, new Object[]{"ID", "StudentID", "Semester",
                                        "Course1", "Course2", "Course3", "Course4", "Course5"}));
                                    course.getCourseValue(tbCourse, "");   // Đẩy thông tin course bảng course.
                                    clearCourse();
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btCourseSaveActionPerformed

    private void tfCourseIDLKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCourseIDLKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_tfCourseIDLKeyTyped

    private void tfStudentPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfStudentPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfStudentPhoneActionPerformed

    private void btCourseSearchRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCourseSearchRActionPerformed
        if (tfCourseIDR.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a student id");
        } else {
            tbCourse.setModel(new DefaultTableModel(null, new Object[]{"ID", "StudentID",
                "Semester", "Course1", "Course2", "Course3", "Course4", "Course5"}));
            course.searchCourse(tbCourse, tfCourseIDR.getText());
            clearCourse();
        }
    }//GEN-LAST:event_btCourseSearchRActionPerformed

    private void btCourseRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCourseRefreshActionPerformed
        tbCourse.setModel(new DefaultTableModel(null, new Object[]{"ID", "StudentID",
            "Semester", "Course1", "Course2", "Course3", "Course4", "Course5"}));
        course.refreshCourse(tbCourse);
        tfCourseIDR.setText(null);
    }//GEN-LAST:event_btCourseRefreshActionPerformed

    private void btCoursePrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCoursePrintActionPerformed
        try {
            MessageFormat header = new MessageFormat("All students course information");
            MessageFormat footer = new MessageFormat("Page{0, number, integer}");
            tbCourse.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (PrinterException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btCoursePrintActionPerformed

    private void tfScoreStudentIDLKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfScoreStudentIDLKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_tfScoreStudentIDLKeyTyped

    private void tfScoreSemesterSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfScoreSemesterSearchKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_tfScoreSemesterSearchKeyTyped

    private void btScoreClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btScoreClearActionPerformed
        clearSore();
    }//GEN-LAST:event_btScoreClearActionPerformed

    private void btScoreSearchLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btScoreSearchLActionPerformed
        if (tfScoreStudentIDL.getText().isEmpty() || tfScoreSemesterSearch.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Student id or semester id missing");
        } else {
            int sid = Integer.parseInt(tfScoreStudentIDL.getText());
            int seNo = Integer.parseInt(tfScoreSemesterSearch.getText());
            score.getDetails(sid, seNo);
        }
    }//GEN-LAST:event_btScoreSearchLActionPerformed

    private void btScorePrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btScorePrintActionPerformed
        try {
            MessageFormat header = new MessageFormat("Score Information");
            MessageFormat footer = new MessageFormat("Page{0, number, integer}");
            tbScore.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (PrinterException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btScorePrintActionPerformed

    private void tfScoreCourse2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfScoreCourse2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfScoreCourse2ActionPerformed

    private void btScoreSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btScoreSaveActionPerformed
        if (!tfScoreStudentID.getText().isEmpty()) {
            if (!score.isIdExist(Integer.parseInt(tfScoreID.getText()))) {
                int sid = Integer.parseInt(tfScoreStudentID.getText());
                int semesterNo = Integer.parseInt(tfScoreSemester.getText());
                if (!score.isSiSemeterNodExist(sid, semesterNo)) {
                    if (isNumeric(tfScoreScore1.getText()) && isNumeric(tfScoreScore2.getText())
                            && isNumeric(tfScoreScore3.getText()) && isNumeric(tfScoreScore4.getText())
                            && isNumeric(tfScoreScore5.getText())) {
                        int id = score.getMax();
                        String course1 = tfScoreCourse1.getText();
                        String course2 = tfScoreCourse2.getText();
                        String course3 = tfScoreCourse3.getText();
                        String course4 = tfScoreCourse4.getText();
                        String course5 = tfScoreCourse5.getText();
                        
                        double score1 = Double.parseDouble(tfScoreScore1.getText());
                        double score2 = Double.parseDouble(tfScoreScore2.getText());
                        double score3 = Double.parseDouble(tfScoreScore3.getText());
                        double score4 = Double.parseDouble(tfScoreScore4.getText());
                        double score5 = Double.parseDouble(tfScoreScore5.getText());
                        double average = (score1 + score2 + score3 + score4 + score5) / 5;
                        
                        nf.setMaximumFractionDigits(2);
                        score.insert(id, sid, semesterNo, course1, course2, course3, course4, course5, score1, score2, score3, score4, score5, Double.parseDouble(nf.format(average)));
                        tbScore.setModel(new DefaultTableModel(null, new Object[]{"ID", "StudentID", "Semester",
                            "Course1", "Score1", "Course2", "Score2", "Course3", "Score3", "Course4", "Score4", "Course5", "Score5", "Average"}));
                        score.getScoreValue(tbScore, "");
                        clearSore();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Semester " + semesterNo + " score already added");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Score id already exists");
            }
        } else {
            JOptionPane.showMessageDialog(this, "No student selected");
        }
    }//GEN-LAST:event_btScoreSaveActionPerformed
    
    private boolean isNumeric(String s) {
        try {
            double d = Double.parseDouble(s);
            if (d >= 0.0 && d <= 4.0) {
                return true;
            } else {
                JOptionPane.showMessageDialog(this, "Please enter a valid value, it must be between 0.0 to 4.0");
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "" + e);
        }
        return false;
    }

    private void tfScoreStudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfScoreStudentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfScoreStudentIDActionPerformed

    private void tfScoreIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfScoreIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfScoreIDActionPerformed

    private void tbScoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbScoreMouseClicked
        model = (DefaultTableModel) tbScore.getModel();
        rowIndex = tbScore.getSelectedRow();
        
        tfScoreID.setText(model.getValueAt(rowIndex, 0).toString());
        tfScoreStudentID.setText(model.getValueAt(rowIndex, 1).toString());
        tfScoreSemester.setText(model.getValueAt(rowIndex, 2).toString());
        
        tfScoreCourse1.setText(model.getValueAt(rowIndex, 3).toString());
        tfScoreCourse2.setText(model.getValueAt(rowIndex, 5).toString());
        tfScoreCourse3.setText(model.getValueAt(rowIndex, 7).toString());
        tfScoreCourse4.setText(model.getValueAt(rowIndex, 9).toString());
        tfScoreCourse5.setText(model.getValueAt(rowIndex, 11).toString());
        
        tfScoreScore1.setText(model.getValueAt(rowIndex, 4).toString());
        tfScoreScore2.setText(model.getValueAt(rowIndex, 6).toString());
        tfScoreScore3.setText(model.getValueAt(rowIndex, 8).toString());
        tfScoreScore4.setText(model.getValueAt(rowIndex, 10).toString());
        tfScoreScore5.setText(model.getValueAt(rowIndex, 12).toString());
    }//GEN-LAST:event_tbScoreMouseClicked

    private void btScoreUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btScoreUpdateActionPerformed
        int id = Integer.parseInt(tfScoreID.getText());
        if (score.isIdExist(id)) {
            if (isNumeric(tfScoreScore1.getText()) && isNumeric(tfScoreScore2.getText())
                    && isNumeric(tfScoreScore3.getText()) && isNumeric(tfScoreScore4.getText())
                    && isNumeric(tfScoreScore5.getText())) {
                double score1 = Double.parseDouble(tfScoreScore1.getText());
                double score2 = Double.parseDouble(tfScoreScore2.getText());
                double score3 = Double.parseDouble(tfScoreScore3.getText());
                double score4 = Double.parseDouble(tfScoreScore4.getText());
                double score5 = Double.parseDouble(tfScoreScore5.getText());
                double average = (score1 + score2 + score3 + score4 + score5) / 5;
                nf.setMaximumFractionDigits(2);
                score.update(id, score1, score2, score3, score4, score5, Double.parseDouble(nf.format(average)));
                tbScore.setModel(new DefaultTableModel(null, new Object[]{"ID", "StudentID", "Semester",
                    "Course1", "Score1", "Course2", "Score2", "Course3", "Score3", "Course4", "Score4", "Course5", "Score5", "Average"}));
                score.getScoreValue(tbScore, "");
                clearSore();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Score id doesn't exist");
        }
    }//GEN-LAST:event_btScoreUpdateActionPerformed

    private void btScoreSearchRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btScoreSearchRActionPerformed
        if (tfScoreStudentIDR.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a student id");
        } else {
            tbScore.setModel(new DefaultTableModel(null, new Object[]{"ID", "StudentID", "Semester",
                "Course1", "Score1", "Course2", "Score2", "Course3", "Score3", "Course4", "Score4", "Course5", "Score5", "Average"}));
            score.searchScore(tbScore, tfScoreStudentIDR.getText());
        }
    }//GEN-LAST:event_btScoreSearchRActionPerformed

    private void btScoreRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btScoreRefreshActionPerformed
        tbScore.setModel(new DefaultTableModel(null, new Object[]{"ID", "StudentID", "Semester",
            "Course1", "Score1", "Course2", "Score2", "Course3", "Score3", "Course4", "Score4", "Course5", "Score5", "Average"}));
        score.refreshScore(tbScore);
    }//GEN-LAST:event_btScoreRefreshActionPerformed

    private void btMarksSheetClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMarksSheetClearActionPerformed
        tfMarksSheetID.setText(null);
        jLabel27.setText("GPA: 0.0");
        tbMarksSheet.setModel(new DefaultTableModel(null, new Object[]{"ID", "StudentID", "Semester",
            "Course1", "Score1", "Course2", "Score2", "Course3", "Score3", "Course4", "Score4", "Course5", "Score5", "Average"}));
    }//GEN-LAST:event_btMarksSheetClearActionPerformed

    private void btMarksSheetPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMarksSheetPrintActionPerformed
        try {
            MessageFormat header = new MessageFormat("Marks Sheet Student ID " + tfMarksSheetID.getText() + "  " + jLabel27.getText());
            MessageFormat footer = new MessageFormat("Page{0, number, integer}");
            tbScore.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (PrinterException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btMarksSheetPrintActionPerformed

    private void plHomeMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plHomeMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_plHomeMouseDragged

    private void plHomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plHomeMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_plHomeMousePressed

    private void btScoreSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btScoreSortActionPerformed
        tbScore.setModel(new DefaultTableModel(null, new Object[]{"ID", "StudentID", "Semester",
            "Course1", "Score1", "Course2", "Score2", "Course3", "Score3", "Course4", "Score4", "Course5", "Score5", "Average"}));
        score.sortAverage(tbScore);
    }//GEN-LAST:event_btScoreSortActionPerformed
    
    private ImageIcon imageAdjust(String path, byte[] pic) {
        ImageIcon myImage = null;
        if (path != null) {
            myImage = new ImageIcon(path);
            
        } else {
            myImage = new ImageIcon(pic);
        }
        Image img = myImage.getImage();
        Image newImage = img.getScaledInstance(jLabelImage.getWidth(), jLabelImage.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(newImage);
        return icon;
    }

//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(() -> {
//            new Home().setVisible(true);
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCourseClear;
    private javax.swing.JButton btCourseLogout;
    private javax.swing.JButton btCoursePrint;
    private javax.swing.JButton btCourseRefresh;
    private javax.swing.JButton btCourseSave;
    private javax.swing.JButton btCourseSearchL;
    private javax.swing.JButton btCourseSearchR;
    private javax.swing.JButton btMarksSheetClear;
    private javax.swing.JButton btMarksSheetLogout;
    private javax.swing.JButton btMarksSheetPrint;
    private javax.swing.JButton btMarksSheetSearch;
    private javax.swing.JButton btScoreClear;
    private javax.swing.JButton btScoreLogout;
    private javax.swing.JButton btScorePrint;
    private javax.swing.JButton btScoreRefresh;
    private javax.swing.JButton btScoreSave;
    private javax.swing.JButton btScoreSearchL;
    private javax.swing.JButton btScoreSearchR;
    private javax.swing.JButton btScoreSort;
    private javax.swing.JButton btScoreUpdate;
    private javax.swing.JButton btStudentAdd;
    private javax.swing.JButton btStudentBrowes;
    private javax.swing.JButton btStudentClear;
    private javax.swing.JButton btStudentDelete;
    private javax.swing.JButton btStudentLogout;
    private javax.swing.JButton btStudentPrint;
    private javax.swing.JButton btStudentRefresh;
    private javax.swing.JButton btStudentUpdate;
    private javax.swing.JComboBox<String> cbCourseCourse1;
    private javax.swing.JComboBox<String> cbCourseCourse2;
    private javax.swing.JComboBox<String> cbCourseCourse3;
    private javax.swing.JComboBox<String> cbCourseCourse4;
    private javax.swing.JComboBox<String> cbCourseCourse5;
    private javax.swing.JComboBox<String> cbCourseSemester;
    private javax.swing.JComboBox<String> cbStudentGender;
    private com.toedter.calendar.JDateChooser dcStudentDate;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelImage;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JPanel plCourse;
    private javax.swing.JPanel plCourseL;
    private javax.swing.JPanel plCourseR;
    private javax.swing.JPanel plCourseSearchL;
    private javax.swing.JPanel plCourseSelect;
    private javax.swing.JPanel plCourseTable;
    private javax.swing.JPanel plCouseSearchR;
    private javax.swing.JPanel plHome;
    private javax.swing.JPanel plMarksSheet;
    private javax.swing.JPanel plMarksSheetGPA;
    private javax.swing.JPanel plMarksSheetL;
    private javax.swing.JPanel plMarksSheetR;
    private javax.swing.JPanel plMarksSheetSearch;
    private javax.swing.JPanel plMarksSheetSelect;
    private javax.swing.JPanel plScore;
    private javax.swing.JPanel plScoreL;
    private javax.swing.JPanel plScoreR;
    private javax.swing.JPanel plScoreSearchL;
    private javax.swing.JPanel plScoreSearchR;
    private javax.swing.JPanel plScoreTable;
    private javax.swing.JPanel plStudent;
    private javax.swing.JPanel plStudentIamge;
    private javax.swing.JPanel plStudentInformationL;
    private javax.swing.JPanel plStudentInformationR;
    private javax.swing.JPanel plStudentSearch;
    private javax.swing.JPanel plStudentSelect;
    private javax.swing.JPanel plStudentShowImage;
    private javax.swing.JPanel plStudentTable;
    private javax.swing.JPanel plTitle;
    private javax.swing.JTable tbCourse;
    private javax.swing.JTable tbMarksSheet;
    private javax.swing.JTable tbScore;
    private javax.swing.JTable tbStudent;
    private javax.swing.JTextField tfCourseID;
    private javax.swing.JTextField tfCourseIDL;
    private javax.swing.JTextField tfCourseIDR;
    public static javax.swing.JTextField tfCourseStudentID;
    private javax.swing.JTextField tfMarksSheetID;
    public static javax.swing.JTextField tfScoreCourse1;
    public static javax.swing.JTextField tfScoreCourse2;
    public static javax.swing.JTextField tfScoreCourse3;
    public static javax.swing.JTextField tfScoreCourse4;
    public static javax.swing.JTextField tfScoreCourse5;
    private javax.swing.JTextField tfScoreID;
    private javax.swing.JTextField tfScoreScore1;
    private javax.swing.JTextField tfScoreScore2;
    private javax.swing.JTextField tfScoreScore3;
    private javax.swing.JTextField tfScoreScore4;
    private javax.swing.JTextField tfScoreScore5;
    public static javax.swing.JTextField tfScoreSemester;
    private javax.swing.JTextField tfScoreSemesterSearch;
    public static javax.swing.JTextField tfScoreStudentID;
    private javax.swing.JTextField tfScoreStudentIDL;
    private javax.swing.JTextField tfScoreStudentIDR;
    private javax.swing.JTextField tfStudentAddress1;
    private javax.swing.JTextField tfStudentAddress2;
    private javax.swing.JTextField tfStudentEmail;
    private javax.swing.JTextField tfStudentFather;
    private javax.swing.JTextField tfStudentID;
    private javax.swing.JTextField tfStudentMother;
    private javax.swing.JTextField tfStudentName;
    private javax.swing.JTextField tfStudentPhone;
    private javax.swing.JTextField tfStudentSearch;
    // End of variables declaration//GEN-END:variables
}
