package controller.dashboard_controller.admin_dashboard_controller;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import model.account.Account;
import model.classroom.Classroom;
import model.people.pupil.Pupil;
import model.people.pupil.PupilDatabase;
import model.people.teacher.Teacher;
import model.people.teacher.TeacherDatabase;
import view.dashboard.admin_dashboard.ManagePupilJFrame;
import view.dashboard.admin_dashboard.ReportJFrame;

public class ShowDetailController {

    private  JPanel jpnView;
    private  JTextField jtfSearch;
    private  JLabel jlbClassroom;
    private  JLabel jlbTeacher;
    private  JButton btnExportReport;
    private  Classroom classroom;
    private Account account;
    private JTable table;
    private  String[] listColumn = {"ID", "Name", "Date of Birth", "Gender", "Class", "Parent Name", "Phone", "Address", "Boarding Room"};
    private TableRowSorter<TableModel> rowSorter = null;

    List<Object[]> originalRows = new ArrayList<>();
    public JTable getTable() {return table;}
    public ShowDetailController(JPanel jpnView, JTextField jtfSearch, JLabel jlbClass,JLabel jlbTeacher,JButton btnExportReport, Classroom classroom,Account account) {
        this.jpnView = jpnView;
        this.jtfSearch = jtfSearch;
        this.btnExportReport=btnExportReport;
        this.jlbClassroom = jlbClass;
        this.jlbTeacher=jlbTeacher;
        this.account=account;
        this.classroom = classroom;
    }

    public void setDataToTable() throws SQLException, ClassNotFoundException {

        jlbClassroom.setText("Class "+classroom.getClassID());
//    System.out.println("Test Classroom.....");
//    System.out.println("ID:"+classroom.getClassID());
//    System.out.println("Room:"+classroom.getRoom());
//    System.out.println("Quantity:"+classroom.getQuantity());
        List<Pupil> listItemPupil = PupilDatabase.getAllPupil("SELECT * FROM pupil WHERE class = '" + classroom.getClassID() + "'");


        List<Teacher> listItemTeacher = TeacherDatabase.getAllTeacher("SELECT * FROM teacher where classid='" + classroom.getClassID() + "'");
        //DefaultTableModel model = new DefaultTableModel();
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        model.setColumnIdentifiers(listColumn);
        for (Pupil pupil : listItemPupil) {
            //System.out.println("ID:"+classroom.getClassID()+" Pupil ClassID:"+pupil.getClassID());
            model.addRow(new Object[]{
                pupil.getID(),
                pupil.getName(),
                pupil.getDoB(),
                // pupil.getGender(),
                (pupil.getGender() == 0) ? "Male" : "Female",
                pupil.getClassID(),
                pupil.getParentName(),
                pupil.getPhone(),
                pupil.getAddress(),
                pupil.getBoardingroom(), // pupil.getAbsentday()
            });
        }
        for (Teacher teacher : listItemTeacher) {
            //System.out.println("Test Teacher.....");
             jlbTeacher.setText(teacher.getName());
        }
        table = new JTable(model);
        for (int i = 0; i < model.getRowCount(); i++) {
            Object[] row = new Object[model.getColumnCount()];
            for (int j = 0; j < model.getColumnCount(); j++) {
                row[j] = model.getValueAt(i, j);
            }
            originalRows.add(row);
        }
        //table.setEnabled(false);
        rowSorter = new TableRowSorter<>(table.getModel());
        table.setRowSorter(rowSorter);
        jtfSearch.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                filterTable(jtfSearch.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                filterTable(jtfSearch.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                filterTable(jtfSearch.getText());
            }
        });
        // Other settings for table (font, size, etc.)

        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getClickCount() == 2 && table.getSelectedRow() != -1) {
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    int selectedRowIndex = table.getSelectedRow();
                    selectedRowIndex = table.convertRowIndexToModel(selectedRowIndex);

                    // Retrieve data from the selected row in the model
                    String id = model.getValueAt(selectedRowIndex, 0).toString();
                    String name = model.getValueAt(selectedRowIndex, 1).toString();
                    Date dateOfBirth = (Date) model.getValueAt(selectedRowIndex, 2);
                    int gender = ("Male".equals(model.getValueAt(selectedRowIndex, 3).toString())) ? 0 : 1;

                    String classId = model.getValueAt(selectedRowIndex, 4).toString();
                    String parentName = model.getValueAt(selectedRowIndex, 5).toString();
                    String phone = model.getValueAt(selectedRowIndex, 6).toString();
                    String address = model.getValueAt(selectedRowIndex, 7).toString();
                    String boardingRoom = model.getValueAt(selectedRowIndex, 8).toString();
                    //int absentDay = Integer.parseInt(model.getValueAt(selectedRowIndex, 9).toString());

                    // Create a new Pupil object with the parsed data
                    Pupil pupil = new Pupil(id, name, dateOfBirth, gender, classId, parentName, phone, address, boardingRoom);

                    // Open the ManagePupilJFrame to display detailed pupil information for editing
                    ManagePupilJFrame frame = new ManagePupilJFrame(pupil, "edit");
                    frame.setTitle("Pupil Information");
                    frame.setResizable(false);
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                }
            }
        });

        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        table.getTableHeader().setPreferredSize(new Dimension(100, 50));
        table.setRowHeight(50);
        table.validate();
        // Set up UI for the JPanel
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.getViewport().add(table);
        scrollPane.setPreferredSize(new Dimension(1100, 400));
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(scrollPane);
        jpnView.validate();
        jpnView.repaint();
    }
 private void filterTable(String query) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        if (query.trim().isEmpty()) {
            model.setRowCount(0); // Reset the table to its original state
            for (Object[] row : originalRows) {
                model.addRow(row);
            }
        } else {
            List<Object[]> filteredRows = new ArrayList<>();
            for (Object[] row : originalRows) {
                boolean match = false;
                for (Object cell : row) {
                    // Case-insensitive partial string match (startsWith)
                    if (cell.toString().toLowerCase().startsWith(query.toLowerCase())) {
                        match = true;
                        break;
                    }
                }
                if (match) {
                    filteredRows.add(row);
                }
            }
            model.setRowCount(0);
            for (Object[] row : filteredRows) {
                model.addRow(row);
            }
        }
    }
    public void setEvent() {
        btnExportReport.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                try { 
                    System.out.println("Opening export pdf\n");
                    ReportJFrame frame=new ReportJFrame(classroom,account);
                         frame.setTitle("Export");
                        frame.setResizable(false);
                        frame.setLocationRelativeTo(null);
                        frame.setVisible(true);
                } catch (SQLException | ClassNotFoundException | IOException ex) {
                    Logger.getLogger(ShowDetailController.class.getName()).log(Level.SEVERE, null, ex);
                }
               
            }

            

        });
    }
}
