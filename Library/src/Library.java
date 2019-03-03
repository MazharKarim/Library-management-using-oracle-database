import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.*;

import net.proteanit.sql.DbUtils;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

/*import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;*/

import java.sql.*;
import java.awt.Font;

public class Library {

	private JFrame frame;
	private JTable table;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JTextField textField5;
	private JTextField textField6;
	private JTextField textField7;
	private JTextField textField8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Library window = new Library();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Library() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1366, 768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel pnlMenu = new JPanel();
		pnlMenu.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, new Color(240, 240, 240), new Color(255, 255, 255), new Color(105, 105, 105), new Color(160, 160, 160)), new LineBorder(new Color(180, 180, 180), 5)));
		pnlMenu.setBounds(10, 103, 217, 615);
		frame.getContentPane().add(pnlMenu);
		pnlMenu.setLayout(null);
		
		//Buttons
		
		JButton btnIsuBooks = new JButton("Issue Book");
		btnIsuBooks.setBounds(10, 139, 197, 23);
		pnlMenu.add(btnIsuBooks);
		
		JButton btnRetBooks = new JButton("Return Book");
		btnRetBooks.setBounds(10, 173, 197, 23);
		pnlMenu.add(btnRetBooks);
		
		JButton btnAddMem = new JButton("Add New Member");
		btnAddMem.setBounds(10, 207, 197, 23);
		pnlMenu.add(btnAddMem);
		
		JButton btnAddBooks = new JButton("Add New Book");
		btnAddBooks.setBounds(10, 241, 197, 23);
		pnlMenu.add(btnAddBooks);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.setBounds(10, 558, 197, 23);
		pnlMenu.add(btnQuit);
		
		JButton btnRules = new JButton("Rules");
		btnRules.setBounds(10, 37, 197, 23);
		pnlMenu.add(btnRules);
		
		JButton btnBooks = new JButton("Books");
		btnBooks.setBounds(10, 71, 197, 23);
		pnlMenu.add(btnBooks);
		
		JButton btnMembers = new JButton("Members");
		btnMembers.setBounds(10, 105, 197, 23);
		pnlMenu.add(btnMembers);
		
		JButton btnFaculty = new JButton("Faculty");
		btnFaculty.setBounds(10, 37, 197, 23);
		pnlMenu.add(btnFaculty);
		
		JButton btnStudent = new JButton("Student");
		btnStudent.setBounds(10, 71, 197, 23);
		pnlMenu.add(btnStudent);
		
		JButton btnCseBooks = new JButton("Depertment of CSE");
		btnCseBooks.setBounds(10, 37, 197, 23);
		pnlMenu.add(btnCseBooks);
		
		JButton btnEeeBooks = new JButton("Depertment of EEE");
		btnEeeBooks.setBounds(10, 71, 197, 23);
		pnlMenu.add(btnEeeBooks);
		
		JButton btnEnglishBooks = new JButton("Depertment of English");
		btnEnglishBooks.setBounds(10, 105, 197, 23);
		pnlMenu.add(btnEnglishBooks);
		
		JButton btnCseFaculty = new JButton("Depertment of CSE");
		btnCseFaculty.setBounds(10, 37, 197, 23);
		pnlMenu.add(btnCseFaculty);
		
		JButton btnEeeFaculty = new JButton("Depertment of EEE");
		btnEeeFaculty.setBounds(10, 71, 197, 23);
		pnlMenu.add(btnEeeFaculty);
		
		JButton btnEnglishFaculty = new JButton("Depertment of English");
		btnEnglishFaculty.setBounds(10, 105, 197, 23);
		pnlMenu.add(btnEnglishFaculty);
		
		JButton btnCseStudent = new JButton("Depertment of CSE");
		btnCseStudent.setBounds(10, 37, 197, 23);
		pnlMenu.add(btnCseStudent);
		
		JButton btnEeeStudent = new JButton("Depertment of EEE");
		btnEeeStudent.setBounds(10, 71, 197, 23);
		pnlMenu.add(btnEeeStudent);
		
		JButton btnEnglishStudent = new JButton("Depertment of English");
		btnEnglishStudent.setBounds(10, 105, 197, 23);
		pnlMenu.add(btnEnglishStudent);
		
		JButton btnBackToFaculty = new JButton("Back");
		btnBackToFaculty.setBounds(10, 388, 197, 23);
		pnlMenu.add(btnBackToFaculty);
		
		JButton btnBackToMainMenu = new JButton("Back");
		btnBackToMainMenu.setBounds(10, 377, 197, 23);
		pnlMenu.add(btnBackToMainMenu);
		
		JButton btnBackToStudent = new JButton("Back");
		btnBackToStudent.setBounds(10, 367, 197, 23);
		pnlMenu.add(btnBackToStudent);
		
		JButton btnBackToBooks = new JButton("Back");
		btnBackToBooks.setBounds(10, 354, 197, 23);
		pnlMenu.add(btnBackToBooks);
		
		JButton btnBackToMembers = new JButton("Back");
		btnBackToMembers.setBounds(10, 343, 197, 23);
		pnlMenu.add(btnBackToMembers);
		
		JButton btnDone = new JButton("Done");
		btnDone.setBounds(10, 456, 197, 23);
		pnlMenu.add(btnDone);
		
		JButton btnDone2 = new JButton("Done");
		btnDone2.setBounds(10, 422, 197, 23);
		pnlMenu.add(btnDone2);
		
		
		
		
		
		
				
		JPanel pnlBody = new JPanel();
		pnlBody.setLayout(null);
		pnlBody.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, new Color(240, 240, 240), new Color(255, 255, 255), new Color(105, 105, 105), new Color(160, 160, 160)), new LineBorder(new Color(180, 180, 180), 5)));
		pnlBody.setBounds(237, 103, 1103, 615);
		frame.getContentPane().add(pnlBody);
		
		JButton btnIssue = new JButton("Issue");
		btnIssue.setBounds(304, 44, 105, 23);
		pnlBody.add(btnIssue);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.setBounds(304, 44, 105, 23);
		pnlBody.add(btnReturn);
		
		JPanel pnlTitle = new JPanel();
		pnlTitle.setBackground(Color.LIGHT_GRAY);
		pnlTitle.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnlTitle.setBounds(0, 0, 1350, 101);
		frame.getContentPane().add(pnlTitle);
		
		JLabel lblLibraryManagementSystem = new JLabel("Library Management System");
		lblLibraryManagementSystem.setFont(new Font("Trajan Pro 3", Font.BOLD, 50));
		pnlTitle.add(lblLibraryManagementSystem);
		
		
		
		
		
		
		
		
		//Labels
		
		JLabel lblMainMenu = new JLabel("Main Menu");
		lblMainMenu.setBounds(10, 12, 197, 14);
		pnlMenu.add(lblMainMenu);
		lblMainMenu.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblRules = new JLabel("Rules");
		lblRules.setBounds(10, 12, 197, 14);
		pnlMenu.add(lblRules);
		lblRules.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblBooks = new JLabel("Books");
		lblBooks.setBounds(10, 12, 197, 14);
		pnlMenu.add(lblBooks);
		lblBooks.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblMembers = new JLabel("Members");
		lblMembers.setBounds(10, 12, 197, 14);
		pnlMenu.add(lblMembers);
		lblMembers.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblIssueBook = new JLabel("Issue Book");
		lblIssueBook.setBounds(10, 12, 197, 14);
		pnlMenu.add(lblIssueBook);
		lblIssueBook.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblReturnBook = new JLabel("Return Book");
		lblReturnBook.setBounds(10, 12, 197, 14);
		pnlMenu.add(lblReturnBook);
		lblReturnBook.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblAddNewMember = new JLabel("Add New Member");
		lblAddNewMember.setBounds(10, 12, 197, 14);
		pnlMenu.add(lblAddNewMember);
		lblAddNewMember.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblAddNewBook = new JLabel("Add New Book");
		lblAddNewBook.setBounds(10, 12, 197, 14);
		pnlMenu.add(lblAddNewBook);
		lblAddNewBook.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblEdit = new JLabel("Edit");
		lblEdit.setBounds(10, 12, 197, 14);
		pnlMenu.add(lblEdit);
		lblEdit.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblFaculty_1 = new JLabel("Faculty");
		lblFaculty_1.setBounds(10, 12, 197, 14);
		pnlMenu.add(lblFaculty_1);
		lblFaculty_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblStudent_1 = new JLabel("Student");
		lblStudent_1.setBounds(10, 12, 197, 14);
		pnlMenu.add(lblStudent_1);
		lblStudent_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblDepertmentOfCse_1 = new JLabel("Depertment of CSE");
		lblDepertmentOfCse_1.setBounds(10, 12, 197, 14);
		pnlMenu.add(lblDepertmentOfCse_1);
		lblDepertmentOfCse_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblDepertmentOfEee_1 = new JLabel("Depertment of EEE");
		lblDepertmentOfEee_1.setBounds(10, 12, 197, 14);
		pnlMenu.add(lblDepertmentOfEee_1);
		lblDepertmentOfEee_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblDepertmentOfEnglish_1 = new JLabel("Depertment of English");
		lblDepertmentOfEnglish_1.setBounds(10, 12, 197, 14);
		pnlMenu.add(lblDepertmentOfEnglish_1);
		lblDepertmentOfEnglish_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblMainMenu2 = new JLabel("Main Menu");
		lblMainMenu2.setBounds(10, 12, 1083, 14);
		pnlBody.add(lblMainMenu2);
		lblMainMenu2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblRules2 = new JLabel("Rules");
		lblRules2.setBounds(10, 12, 1083, 14);
		pnlBody.add(lblRules2);
		lblRules2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblBooks_1 = new JLabel("Books");
		lblBooks_1.setBounds(10, 12, 1083, 14);
		pnlBody.add(lblBooks_1);
		lblBooks_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblMembers_1 = new JLabel("Members");
		lblMembers_1.setBounds(10, 12, 1083, 14);
		pnlBody.add(lblMembers_1);
		lblMembers_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblReturnBook_1 = new JLabel("Return Book");
		lblReturnBook_1.setBounds(10, 12, 1083, 14);
		pnlBody.add(lblReturnBook_1);
		lblReturnBook_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblAddNewMember_1 = new JLabel("Add New Member");
		lblAddNewMember_1.setBounds(10, 12, 1083, 14);
		pnlBody.add(lblAddNewMember_1);
		lblAddNewMember_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblAddNewBook_1 = new JLabel("Add New Book");
		lblAddNewBook_1.setBounds(10, 12, 1083, 14);
		pnlBody.add(lblAddNewBook_1);
		lblAddNewBook_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblIssueBook_1 = new JLabel("Issue Book");
		lblIssueBook_1.setBounds(10, 12, 1083, 14);
		pnlBody.add(lblIssueBook_1);
		lblIssueBook_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblEdit_1 = new JLabel("Edit");
		lblEdit_1.setBounds(10, 12, 1083, 14);
		pnlBody.add(lblEdit_1);
		lblEdit_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblDepertmentOfCse = new JLabel("Depertment of CSE");
		lblDepertmentOfCse.setBounds(10, 12, 1083, 14);
		pnlBody.add(lblDepertmentOfCse);
		lblDepertmentOfCse.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblDepertmentOfEnglish = new JLabel("Depertment of English");
		lblDepertmentOfEnglish.setBounds(10, 12, 1083, 14);
		pnlBody.add(lblDepertmentOfEnglish);
		lblDepertmentOfEnglish.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblFaculty = new JLabel("Faculty");
		lblFaculty.setBounds(10, 12, 1083, 14);
		pnlBody.add(lblFaculty);
		lblFaculty.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblDepertmentOfEee = new JLabel("Depertment of EEE");
		lblDepertmentOfEee.setBounds(10, 12, 1083, 14);
		pnlBody.add(lblDepertmentOfEee);
		lblDepertmentOfEee.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblStudent = new JLabel("Student");
		lblStudent.setBounds(10, 12, 1083, 14);
		pnlBody.add(lblStudent);
		lblStudent.setHorizontalAlignment(SwingConstants.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 78, 1083, 556);
		pnlBody.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setVisible(false);
		
		JTextPane txtpnRules = new JTextPane();
		txtpnRules.setBounds(10, 37, 1081, 565);
		pnlBody.add(txtpnRules);
		txtpnRules.setText("1. This book may be kept for a week and may be renewed once for the same period.\r\n2. Late fine of Taka 5.00/day will be charged if t he book is not returned in time.\r\n3. No book will be issued if the fine is not paid.\r\n4. A student borrower will be held solely responsible for any borrowed book(s).\r\n5. A borrower may take one book at a time.\r\n6. Fine will be charged for damage/loss of book(s).");
		
		textField1 = new JTextField();
		textField1.setColumns(10);
		textField1.setBounds(155, 47, 136, 20);
		pnlBody.add(textField1);
		
		JLabel lblBookID = new JLabel("Book ID");
		lblBookID.setBounds(36, 53, 84, 14);
		pnlBody.add(lblBookID);
		
		JLabel lblTitle = new JLabel("Title");
		lblTitle.setBounds(36, 84, 84, 14);
		pnlBody.add(lblTitle);
		
		JLabel lblAuthor = new JLabel("Author");
		lblAuthor.setBounds(36, 115, 84, 14);
		pnlBody.add(lblAuthor);
		
		textField2 = new JTextField();
		textField2.setColumns(10);
		textField2.setBounds(155, 78, 136, 20);
		pnlBody.add(textField2);
		
		textField3 = new JTextField();
		textField3.setColumns(10);
		textField3.setBounds(155, 109, 136, 20);
		pnlBody.add(textField3);
		
		textField4 = new JTextField();
		textField4.setColumns(10);
		textField4.setBounds(155, 140, 136, 20);
		pnlBody.add(textField4);
		
		textField5 = new JTextField();
		textField5.setColumns(10);
		textField5.setBounds(155, 171, 136, 20);
		pnlBody.add(textField5);
		
		textField6 = new JTextField();
		textField6.setColumns(10);
		textField6.setBounds(155, 202, 136, 20);
		pnlBody.add(textField6);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(36, 146, 84, 14);
		pnlBody.add(lblPrice);
		
		JLabel lblAvailability = new JLabel("Availability");
		lblAvailability.setBounds(36, 177, 84, 14);
		pnlBody.add(lblAvailability);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setBounds(36, 208, 84, 14);
		pnlBody.add(lblDepartment);
		
		JLabel lblMemberId = new JLabel("Member ID");
		lblMemberId.setBounds(36, 53, 84, 14);
		pnlBody.add(lblMemberId);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(36, 84, 84, 14);
		pnlBody.add(lblName);
		
		JLabel lblMembershipType = new JLabel("Membership Type");
		lblMembershipType.setBounds(36, 115, 109, 14);
		pnlBody.add(lblMembershipType);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(36, 146, 84, 14);
		pnlBody.add(lblAddress);
		
		JLabel lblContact = new JLabel("Contact");
		lblContact.setBounds(36, 177, 84, 14);
		pnlBody.add(lblContact);
		
		JButton btnDeleteMember = new JButton("Delete Member");
		btnDeleteMember.setBounds(304, 44, 120, 23);
		pnlBody.add(btnDeleteMember);
				
		JButton btnDeleteBook = new JButton("Delete Book");
		btnDeleteBook.setBounds(304, 44, 105, 23);
		pnlBody.add(btnDeleteBook);
		
		JLabel lblBorrowerID = new JLabel("Borrower ID");
		lblBorrowerID.setBounds(400, 53, 84, 14);
		pnlBody.add(lblBorrowerID);
		
		textField8 = new JTextField();
		textField8.setColumns(10);
		textField8.setBounds(500, 47, 136, 20);
		pnlBody.add(textField8);
		
				
		
		
		
		
		
		
		
		
		String user= "mydatabase";
		String pass= "1234";
		
		textField7 = new JTextField();
		textField7.setColumns(10);
		textField7.setBounds(255, 202, 136, 20);
		pnlBody.add(textField7);
		textField7.setVisible(false);
		textField7.setText(null);
		
		
		
		//Main Menu
		
		txtpnRules.setVisible(false);
		table.setVisible(false);
		scrollPane.setVisible(false);
		
		btnRules.setVisible(true); btnBooks.setVisible(true); btnMembers.setVisible(true);
		btnIsuBooks.setVisible(true); btnRetBooks.setVisible(true); btnAddMem.setVisible(true);
		btnAddBooks.setVisible(true);btnQuit.setVisible(true);
		btnCseBooks.setVisible(false); btnEeeBooks.setVisible(false); btnEnglishBooks.setVisible(false);
		btnCseFaculty.setVisible(false); btnEeeFaculty.setVisible(false); btnEnglishFaculty.setVisible(false);
		btnCseStudent.setVisible(false); btnEeeStudent.setVisible(false); btnEnglishStudent.setVisible(false);
		btnFaculty.setVisible(false); btnStudent.setVisible(false);
		btnBackToMembers.setVisible(false); btnBackToBooks.setVisible(false); 
		btnBackToFaculty.setVisible(false); btnBackToStudent.setVisible(false);
		btnBackToMainMenu.setVisible(false);
		btnDone.setVisible(false); btnDone2.setVisible(false);
		btnIssue.setVisible(false); btnReturn.setVisible(false);
		btnDeleteBook.setVisible(false); btnDeleteMember.setVisible(false);
		btnIssue.setVisible(false); btnReturn.setVisible(false);
		
		btnQuit.setBounds(10, 275, 197, 23);
		
		lblBookID.setBounds(36, 53, 84, 14);textField1.setBounds(155, 47, 136, 20);
				
		lblMainMenu.setVisible(true); lblMainMenu2.setVisible(true); 
		lblRules.setVisible(false); lblRules2.setVisible(false);
		lblBooks.setVisible(false); lblBooks_1.setVisible(false); 
		lblMembers.setVisible(false); lblMembers_1.setVisible(false); 
		lblIssueBook.setVisible(false); lblReturnBook.setVisible(false); lblEdit.setVisible(false); 
		lblIssueBook_1.setVisible(false); lblReturnBook_1.setVisible(false); lblEdit_1.setVisible(false); 
		lblDepertmentOfCse.setVisible(false); lblDepertmentOfEee.setVisible(false); lblDepertmentOfEnglish.setVisible(false); 
		lblDepertmentOfCse_1.setVisible(false); lblDepertmentOfEee_1.setVisible(false); lblDepertmentOfEnglish_1.setVisible(false); 
		lblAddNewMember.setVisible(false); lblAddNewBook.setVisible(false); 
		lblAddNewMember_1.setVisible(false); lblAddNewBook_1.setVisible(false); 
		lblFaculty.setVisible(false); lblStudent.setVisible(false); 
		lblFaculty_1.setVisible(false); lblStudent_1.setVisible(false);
		lblBookID.setVisible(false); lblTitle.setVisible(false); lblAuthor.setVisible(false); 
		lblPrice.setVisible(false); lblAvailability.setVisible(false); lblDepartment.setVisible(false);
		lblMemberId.setVisible(false); lblName.setVisible(false); lblMembershipType.setVisible(false); 
		lblAddress.setVisible(false); lblContact.setVisible(false);
		
		textField1.setVisible(false); textField2.setVisible(false); textField3.setVisible(false);
		textField4.setVisible(false); textField5.setVisible(false); textField6.setVisible(false);
		
		textField1.setText(null); textField2.setText(null);
		textField3.setText(null); textField4.setText(null);
		textField5.setText(null); textField6.setText(null);
		
		textField8.setVisible(false);lblBorrowerID.setVisible(false);
		
	
		
		
		
		

		//Actions
		
		btnRules.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtpnRules.setVisible(true);
				table.setVisible(false);
				scrollPane.setVisible(false);
				
				btnRules.setVisible(false); btnBooks.setVisible(false); btnMembers.setVisible(false);
				btnIsuBooks.setVisible(false); btnRetBooks.setVisible(false); btnAddMem.setVisible(false);
				btnAddBooks.setVisible(false); btnDeleteBook.setVisible(false); btnQuit.setVisible(true);
				btnCseBooks.setVisible(false); btnEeeBooks.setVisible(false); btnEnglishBooks.setVisible(false);
				btnCseFaculty.setVisible(false); btnEeeFaculty.setVisible(false); btnEnglishFaculty.setVisible(false);
				btnCseStudent.setVisible(false); btnEeeStudent.setVisible(false); btnEnglishStudent.setVisible(false);
				btnFaculty.setVisible(false); btnStudent.setVisible(false);
				btnBackToMembers.setVisible(false); btnBackToBooks.setVisible(false); 
				btnBackToFaculty.setVisible(false); btnBackToStudent.setVisible(false);
				btnBackToMainMenu.setVisible(true);
				btnDone.setVisible(false); btnDone2.setVisible(false);
				btnIssue.setVisible(false); btnReturn.setVisible(false);
				btnDeleteBook.setVisible(false); btnDeleteMember.setVisible(false);
				btnIssue.setVisible(false); btnReturn.setVisible(false);
				
				btnBackToMainMenu.setBounds(10, 37, 197, 23);
				btnQuit.setBounds(10, 71, 197, 23);
				
				lblBookID.setBounds(36, 53, 84, 14);textField1.setBounds(155, 47, 136, 20);
				
				lblMainMenu.setVisible(false); lblMainMenu2.setVisible(false); 
				lblRules.setVisible(true); lblRules2.setVisible(true);
				lblBooks.setVisible(false); lblBooks_1.setVisible(false); 
				lblMembers.setVisible(false); lblMembers_1.setVisible(false); 
				lblIssueBook.setVisible(false); lblReturnBook.setVisible(false); lblEdit.setVisible(false); 
				lblIssueBook_1.setVisible(false); lblReturnBook_1.setVisible(false); lblEdit_1.setVisible(false); 
				lblDepertmentOfCse.setVisible(false); lblDepertmentOfEee.setVisible(false); lblDepertmentOfEnglish.setVisible(false); 
				lblDepertmentOfCse_1.setVisible(false); lblDepertmentOfEee_1.setVisible(false); lblDepertmentOfEnglish_1.setVisible(false); 
				lblAddNewMember.setVisible(false); lblAddNewBook.setVisible(false); 
				lblAddNewMember_1.setVisible(false); lblAddNewBook_1.setVisible(false); 
				lblFaculty.setVisible(false); lblStudent.setVisible(false); 
				lblFaculty_1.setVisible(false); lblStudent_1.setVisible(false);
				lblBookID.setVisible(false); lblTitle.setVisible(false); lblAuthor.setVisible(false); 
				lblPrice.setVisible(false); lblAvailability.setVisible(false); lblDepartment.setVisible(false);
				lblMemberId.setVisible(false); lblName.setVisible(false); lblMembershipType.setVisible(false); 
				lblAddress.setVisible(false); lblContact.setVisible(false);
				
				textField1.setVisible(false); textField2.setVisible(false); textField3.setVisible(false);
				textField4.setVisible(false); textField5.setVisible(false); textField6.setVisible(false);
				
				textField1.setText(null); textField2.setText(null);
				textField3.setText(null); textField4.setText(null);
				textField5.setText(null); textField6.setText(null);
				
				textField8.setVisible(false);lblBorrowerID.setVisible(false);
			}
		});
		
		btnBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtpnRules.setVisible(false);
				table.setVisible(true);
				scrollPane.setVisible(true);
				
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",user,pass);
					String sql= "select * from books";
					PreparedStatement st= con.prepareStatement(sql);
					ResultSet rs= st.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, e1);
				}
				
				btnRules.setVisible(false); btnBooks.setVisible(false); btnMembers.setVisible(false);
				btnIsuBooks.setVisible(false); btnRetBooks.setVisible(false); btnAddMem.setVisible(false);
				btnAddBooks.setVisible(false); btnDeleteBook.setVisible(false); btnQuit.setVisible(true);
				btnCseBooks.setVisible(true); btnEeeBooks.setVisible(true); btnEnglishBooks.setVisible(true);
				btnCseFaculty.setVisible(false); btnEeeFaculty.setVisible(false); btnEnglishFaculty.setVisible(false);
				btnCseStudent.setVisible(false); btnEeeStudent.setVisible(false); btnEnglishStudent.setVisible(false);
				btnFaculty.setVisible(false); btnStudent.setVisible(false);
				btnBackToMembers.setVisible(false); btnBackToBooks.setVisible(false); 
				btnBackToFaculty.setVisible(false); btnBackToStudent.setVisible(false);
				btnBackToMainMenu.setVisible(true);
				btnDone.setVisible(false); btnDone2.setVisible(false);
				btnIssue.setVisible(false); btnReturn.setVisible(false);
				btnDeleteBook.setVisible(true); btnDeleteMember.setVisible(false);
				btnIssue.setVisible(false); btnReturn.setVisible(false);
				
				btnBackToMainMenu.setBounds(10, 139, 197, 23);
				btnQuit.setBounds(10, 173, 197, 23);
				
				lblBookID.setBounds(36, 53, 84, 14);textField1.setBounds(155, 47, 136, 20);
				
				lblMainMenu.setVisible(false); lblMainMenu2.setVisible(false); 
				lblRules.setVisible(false); lblRules2.setVisible(false);
				lblBooks.setVisible(true); lblBooks_1.setVisible(true); 
				lblMembers.setVisible(false); lblMembers_1.setVisible(false); 
				lblIssueBook.setVisible(false); lblReturnBook.setVisible(false); lblEdit.setVisible(false); 
				lblIssueBook_1.setVisible(false); lblReturnBook_1.setVisible(false); lblEdit_1.setVisible(false); 
				lblDepertmentOfCse.setVisible(false); lblDepertmentOfEee.setVisible(false); lblDepertmentOfEnglish.setVisible(false); 
				lblDepertmentOfCse_1.setVisible(false); lblDepertmentOfEee_1.setVisible(false); lblDepertmentOfEnglish_1.setVisible(false); 
				lblAddNewMember.setVisible(false); lblAddNewBook.setVisible(false); 
				lblAddNewMember_1.setVisible(false); lblAddNewBook_1.setVisible(false); 
				lblFaculty.setVisible(false); lblStudent.setVisible(false); 
				lblFaculty_1.setVisible(false); lblStudent_1.setVisible(false);
				lblBookID.setVisible(true); lblTitle.setVisible(false); lblAuthor.setVisible(false); 
				lblPrice.setVisible(false); lblAvailability.setVisible(false); lblDepartment.setVisible(false);
				lblMemberId.setVisible(false); lblName.setVisible(false); lblMembershipType.setVisible(false); 
				lblAddress.setVisible(false); lblContact.setVisible(false);
				
				textField1.setVisible(true); textField2.setVisible(false); textField3.setVisible(false);
				textField4.setVisible(false); textField5.setVisible(false); textField6.setVisible(false);
				
				textField1.setText(null); textField2.setText(null);
				textField3.setText(null); textField4.setText(null);
				textField5.setText(null); textField6.setText(null);
				
				textField7.setText("btnBooks");
				
				textField8.setVisible(false);lblBorrowerID.setVisible(false);
			}
		});
		
		btnMembers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpnRules.setVisible(false);
				table.setVisible(true);
				scrollPane.setVisible(true);
				
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",user,pass);
					String sql= "select * from members";
					PreparedStatement st= con.prepareStatement(sql);
					ResultSet rs= st.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, e1);
				}
				
				btnRules.setVisible(false); btnBooks.setVisible(false); btnMembers.setVisible(false);
				btnIsuBooks.setVisible(false); btnRetBooks.setVisible(false); btnAddMem.setVisible(false);
				btnAddBooks.setVisible(false); btnDeleteBook.setVisible(false); btnQuit.setVisible(true);
				btnCseBooks.setVisible(false); btnEeeBooks.setVisible(false); btnEnglishBooks.setVisible(false);
				btnCseFaculty.setVisible(false); btnEeeFaculty.setVisible(false); btnEnglishFaculty.setVisible(false);
				btnCseStudent.setVisible(false); btnEeeStudent.setVisible(false); btnEnglishStudent.setVisible(false);
				btnFaculty.setVisible(true); btnStudent.setVisible(true);
				btnBackToMembers.setVisible(false); btnBackToBooks.setVisible(false); 
				btnBackToFaculty.setVisible(false); btnBackToStudent.setVisible(false);
				btnBackToMainMenu.setVisible(true);
				btnDone.setVisible(false); btnDone2.setVisible(false);
				btnIssue.setVisible(false); btnReturn.setVisible(false);
				btnDeleteBook.setVisible(false); btnDeleteMember.setVisible(true);
				btnIssue.setVisible(false); btnReturn.setVisible(false);
				
				btnBackToMainMenu.setBounds(10, 105, 197, 23);
				btnQuit.setBounds(10, 139, 197, 23);
				
				lblBookID.setBounds(36, 53, 84, 14);textField1.setBounds(155, 47, 136, 20);
				
				lblMainMenu.setVisible(false); lblMainMenu2.setVisible(false); 
				lblRules.setVisible(false); lblRules2.setVisible(false);
				lblBooks.setVisible(false); lblBooks_1.setVisible(false); 
				lblMembers.setVisible(true); lblMembers_1.setVisible(true); 
				lblIssueBook.setVisible(false); lblReturnBook.setVisible(false); lblEdit.setVisible(false); 
				lblIssueBook_1.setVisible(false); lblReturnBook_1.setVisible(false); lblEdit_1.setVisible(false); 
				lblDepertmentOfCse.setVisible(false); lblDepertmentOfEee.setVisible(false); lblDepertmentOfEnglish.setVisible(false); 
				lblDepertmentOfCse_1.setVisible(false); lblDepertmentOfEee_1.setVisible(false); lblDepertmentOfEnglish_1.setVisible(false); 
				lblAddNewMember.setVisible(false); lblAddNewBook.setVisible(false); 
				lblAddNewMember_1.setVisible(false); lblAddNewBook_1.setVisible(false); 
				lblFaculty.setVisible(false); lblStudent.setVisible(false); 
				lblFaculty_1.setVisible(false); lblStudent_1.setVisible(false);
				lblBookID.setVisible(false); lblTitle.setVisible(false); lblAuthor.setVisible(false); 
				lblPrice.setVisible(false); lblAvailability.setVisible(false); lblDepartment.setVisible(false);
				lblMemberId.setVisible(true); lblName.setVisible(false); lblMembershipType.setVisible(false); 
				lblAddress.setVisible(false); lblContact.setVisible(false);
				
				textField1.setVisible(true); textField2.setVisible(false); textField3.setVisible(false);
				textField4.setVisible(false); textField5.setVisible(false); textField6.setVisible(false);
				
				textField1.setText(null); textField2.setText(null);
				textField3.setText(null); textField4.setText(null);
				textField5.setText(null); textField6.setText(null);
				
				textField7.setText("btnMembers");
				
				textField8.setVisible(false);lblBorrowerID.setVisible(false);
			}
		});
		
		btnFaculty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpnRules.setVisible(false);
				table.setVisible(true);
				scrollPane.setVisible(true);
				
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",user,pass);
					String sql= "select * from members where membership_type='Faculty'";
					PreparedStatement st= con.prepareStatement(sql);
					ResultSet rs= st.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, e1);
				}
				
				btnRules.setVisible(false); btnBooks.setVisible(false); btnMembers.setVisible(false);
				btnIsuBooks.setVisible(false); btnRetBooks.setVisible(false); btnAddMem.setVisible(false);
				btnAddBooks.setVisible(false); btnDeleteBook.setVisible(false); btnQuit.setVisible(true);
				btnCseBooks.setVisible(false); btnEeeBooks.setVisible(false); btnEnglishBooks.setVisible(false);
				btnCseFaculty.setVisible(true); btnEeeFaculty.setVisible(true); btnEnglishFaculty.setVisible(true);
				btnCseStudent.setVisible(false); btnEeeStudent.setVisible(false); btnEnglishStudent.setVisible(false);
				btnFaculty.setVisible(false); btnStudent.setVisible(false);
				btnBackToMembers.setVisible(true); btnBackToBooks.setVisible(false); 
				btnBackToFaculty.setVisible(false); btnBackToStudent.setVisible(false);
				btnBackToMembers.setVisible(true); btnBackToMainMenu.setVisible(false);
				btnDone.setVisible(false); btnDone2.setVisible(false);
				btnIssue.setVisible(false); btnReturn.setVisible(false);
				btnDeleteBook.setVisible(false); btnDeleteMember.setVisible(true);
				btnIssue.setVisible(false); btnReturn.setVisible(false);
				
				btnBackToMembers.setBounds(10, 139, 197, 23);
				btnQuit.setBounds(10, 173, 197, 23);
				
				lblBookID.setBounds(36, 53, 84, 14);textField1.setBounds(155, 47, 136, 20);
				
				lblMainMenu.setVisible(false); lblMainMenu2.setVisible(false); 
				lblRules.setVisible(false); lblRules2.setVisible(false);
				lblBooks.setVisible(false); lblBooks_1.setVisible(false); 
				lblMembers.setVisible(false); lblMembers_1.setVisible(false); 
				lblIssueBook.setVisible(false); lblReturnBook.setVisible(false); lblEdit.setVisible(false); 
				lblIssueBook_1.setVisible(false); lblReturnBook_1.setVisible(false); lblEdit_1.setVisible(false); 
				lblDepertmentOfCse.setVisible(false); lblDepertmentOfEee.setVisible(false); lblDepertmentOfEnglish.setVisible(false); 
				lblDepertmentOfCse_1.setVisible(false); lblDepertmentOfEee_1.setVisible(false); lblDepertmentOfEnglish_1.setVisible(false); 
				lblAddNewMember.setVisible(false); lblAddNewBook.setVisible(false); 
				lblAddNewMember_1.setVisible(false); lblAddNewBook_1.setVisible(false); 
				lblFaculty.setVisible(true); lblStudent.setVisible(false); 
				lblFaculty_1.setVisible(true); lblStudent_1.setVisible(false);
				lblBookID.setVisible(false); lblTitle.setVisible(false); lblAuthor.setVisible(false); 
				lblPrice.setVisible(false); lblAvailability.setVisible(false); lblDepartment.setVisible(false);
				lblMemberId.setVisible(true); lblName.setVisible(false); lblMembershipType.setVisible(false); 
				lblAddress.setVisible(false); lblContact.setVisible(false);
				
				textField1.setVisible(true); textField2.setVisible(false); textField3.setVisible(false);
				textField4.setVisible(false); textField5.setVisible(false); textField6.setVisible(false);
				
				textField1.setText(null); textField2.setText(null);
				textField3.setText(null); textField4.setText(null);
				textField5.setText(null); textField6.setText(null);
				
				textField7.setText("btnFaculty");
				
				textField8.setVisible(false);lblBorrowerID.setVisible(false);
			}
		});

		btnCseFaculty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpnRules.setVisible(false);
				table.setVisible(true);
				scrollPane.setVisible(true);
				
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",user,pass);
					String sql= "select * from members where membership_type='Faculty' and department='CSE'";
					PreparedStatement st= con.prepareStatement(sql);
					ResultSet rs= st.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, e1);
				}
				
				btnRules.setVisible(false); btnBooks.setVisible(false); btnMembers.setVisible(false);
				btnIsuBooks.setVisible(false); btnRetBooks.setVisible(false); btnAddMem.setVisible(false);
				btnAddBooks.setVisible(false); btnDeleteBook.setVisible(false); btnQuit.setVisible(true);
				btnCseBooks.setVisible(false); btnEeeBooks.setVisible(false); btnEnglishBooks.setVisible(false);
				btnCseFaculty.setVisible(true); btnEeeFaculty.setVisible(true); btnEnglishFaculty.setVisible(true);
				btnCseStudent.setVisible(false); btnEeeStudent.setVisible(false); btnEnglishStudent.setVisible(false);
				btnFaculty.setVisible(false); btnStudent.setVisible(false);
				btnBackToMembers.setVisible(true); btnBackToBooks.setVisible(false); 
				btnBackToFaculty.setVisible(false); btnBackToStudent.setVisible(false);
				btnBackToMembers.setVisible(true); btnBackToMainMenu.setVisible(false);
				btnDone.setVisible(false); btnDone2.setVisible(false);
				btnIssue.setVisible(false); btnReturn.setVisible(false);
				btnDeleteBook.setVisible(false); btnDeleteMember.setVisible(true);
				btnIssue.setVisible(false); btnReturn.setVisible(false);
				
				btnBackToMembers.setBounds(10, 139, 197, 23);
				btnQuit.setBounds(10, 173, 197, 23);
				
				lblBookID.setBounds(36, 53, 84, 14);textField1.setBounds(155, 47, 136, 20);
				
				lblMainMenu.setVisible(false); lblMainMenu2.setVisible(false); 
				lblRules.setVisible(false); lblRules2.setVisible(false);
				lblBooks.setVisible(false); lblBooks_1.setVisible(false); 
				lblMembers.setVisible(false); lblMembers_1.setVisible(false); 
				lblIssueBook.setVisible(false); lblReturnBook.setVisible(false); lblEdit.setVisible(false); 
				lblIssueBook_1.setVisible(false); lblReturnBook_1.setVisible(false); lblEdit_1.setVisible(false); 
				lblDepertmentOfCse.setVisible(true); lblDepertmentOfEee.setVisible(false); lblDepertmentOfEnglish.setVisible(false); 
				lblDepertmentOfCse_1.setVisible(true); lblDepertmentOfEee_1.setVisible(false); lblDepertmentOfEnglish_1.setVisible(false); 
				lblAddNewMember.setVisible(false); lblAddNewBook.setVisible(false); 
				lblAddNewMember_1.setVisible(false); lblAddNewBook_1.setVisible(false); 
				lblFaculty.setVisible(false); lblStudent.setVisible(false); 
				lblFaculty_1.setVisible(false); lblStudent_1.setVisible(false);
				lblBookID.setVisible(false); lblTitle.setVisible(false); lblAuthor.setVisible(false); 
				lblPrice.setVisible(false); lblAvailability.setVisible(false); lblDepartment.setVisible(false);
				lblMemberId.setVisible(true); lblName.setVisible(false); lblMembershipType.setVisible(false); 
				lblAddress.setVisible(false); lblContact.setVisible(false);
				
				textField1.setVisible(true); textField2.setVisible(false); textField3.setVisible(false);
				textField4.setVisible(false); textField5.setVisible(false); textField6.setVisible(false);
				
				textField1.setText(null); textField2.setText(null);
				textField3.setText(null); textField4.setText(null);
				textField5.setText(null); textField6.setText(null);
				
				textField7.setText("btnCseFaculty");
				
				textField8.setVisible(false);lblBorrowerID.setVisible(false);
			}
		});

		btnEeeFaculty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpnRules.setVisible(false);
				table.setVisible(true);
				scrollPane.setVisible(true);
				
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",user,pass);
					String sql= "select * from members where membership_type='Faculty' and department='EEE'";
					PreparedStatement st= con.prepareStatement(sql);
					ResultSet rs= st.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, e1);
				}
				
				btnRules.setVisible(false); btnBooks.setVisible(false); btnMembers.setVisible(false);
				btnIsuBooks.setVisible(false); btnRetBooks.setVisible(false); btnAddMem.setVisible(false);
				btnAddBooks.setVisible(false); btnDeleteBook.setVisible(false); btnQuit.setVisible(true);
				btnCseBooks.setVisible(false); btnEeeBooks.setVisible(false); btnEnglishBooks.setVisible(false);
				btnCseFaculty.setVisible(true); btnEeeFaculty.setVisible(true); btnEnglishFaculty.setVisible(true);
				btnCseStudent.setVisible(false); btnEeeStudent.setVisible(false); btnEnglishStudent.setVisible(false);
				btnFaculty.setVisible(false); btnStudent.setVisible(false);
				btnBackToMembers.setVisible(true); btnBackToBooks.setVisible(false); 
				btnBackToFaculty.setVisible(false); btnBackToStudent.setVisible(false);
				btnBackToMembers.setVisible(true); btnBackToMainMenu.setVisible(false);
				btnDone.setVisible(false); btnDone2.setVisible(false);
				btnIssue.setVisible(false); btnReturn.setVisible(false);
				btnDeleteBook.setVisible(false); btnDeleteMember.setVisible(true);
				btnIssue.setVisible(false); btnReturn.setVisible(false);
				
				btnBackToMembers.setBounds(10, 139, 197, 23);
				btnQuit.setBounds(10, 173, 197, 23);
				
				lblBookID.setBounds(36, 53, 84, 14);textField1.setBounds(155, 47, 136, 20);
				
				lblMainMenu.setVisible(false); lblMainMenu2.setVisible(false); 
				lblRules.setVisible(false); lblRules2.setVisible(false);
				lblBooks.setVisible(false); lblBooks_1.setVisible(false); 
				lblMembers.setVisible(false); lblMembers_1.setVisible(false); 
				lblIssueBook.setVisible(false); lblReturnBook.setVisible(false); lblEdit.setVisible(false); 
				lblIssueBook_1.setVisible(false); lblReturnBook_1.setVisible(false); lblEdit_1.setVisible(false); 
				lblDepertmentOfCse.setVisible(false); lblDepertmentOfEee.setVisible(true); lblDepertmentOfEnglish.setVisible(false); 
				lblDepertmentOfCse_1.setVisible(false); lblDepertmentOfEee_1.setVisible(true); lblDepertmentOfEnglish_1.setVisible(false); 
				lblAddNewMember.setVisible(false); lblAddNewBook.setVisible(false); 
				lblAddNewMember_1.setVisible(false); lblAddNewBook_1.setVisible(false); 
				lblFaculty.setVisible(false); lblStudent.setVisible(false); 
				lblFaculty_1.setVisible(false); lblStudent_1.setVisible(false);
				lblBookID.setVisible(false); lblTitle.setVisible(false); lblAuthor.setVisible(false); 
				lblPrice.setVisible(false); lblAvailability.setVisible(false); lblDepartment.setVisible(false);
				lblMemberId.setVisible(true); lblName.setVisible(false); lblMembershipType.setVisible(false); 
				lblAddress.setVisible(false); lblContact.setVisible(false);
				
				textField1.setVisible(true); textField2.setVisible(false); textField3.setVisible(false);
				textField4.setVisible(false); textField5.setVisible(false); textField6.setVisible(false);
				
				textField1.setText(null); textField2.setText(null);
				textField3.setText(null); textField4.setText(null);
				textField5.setText(null); textField6.setText(null);
				
				textField7.setText("btnEeeFaculty");
				
				textField8.setVisible(false);lblBorrowerID.setVisible(false);
			}
		});

		btnEnglishFaculty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpnRules.setVisible(false);
				table.setVisible(true);
				scrollPane.setVisible(true);
				
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",user,pass);
					String sql= "select * from members where membership_type='Faculty' and department='English'";
					PreparedStatement st= con.prepareStatement(sql);
					ResultSet rs= st.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, e1);
				}
				
				btnRules.setVisible(false); btnBooks.setVisible(false); btnMembers.setVisible(false);
				btnIsuBooks.setVisible(false); btnRetBooks.setVisible(false); btnAddMem.setVisible(false);
				btnAddBooks.setVisible(false); btnDeleteBook.setVisible(false); btnQuit.setVisible(true);
				btnCseBooks.setVisible(false); btnEeeBooks.setVisible(false); btnEnglishBooks.setVisible(false);
				btnCseFaculty.setVisible(true); btnEeeFaculty.setVisible(true); btnEnglishFaculty.setVisible(true);
				btnCseStudent.setVisible(false); btnEeeStudent.setVisible(false); btnEnglishStudent.setVisible(false);
				btnFaculty.setVisible(false); btnStudent.setVisible(false);
				btnBackToMembers.setVisible(true); btnBackToBooks.setVisible(false); 
				btnBackToFaculty.setVisible(false); btnBackToStudent.setVisible(false);
				btnBackToMembers.setVisible(true); btnBackToMainMenu.setVisible(false);
				btnDone.setVisible(false); btnDone2.setVisible(false);
				btnIssue.setVisible(false); btnReturn.setVisible(false);
				btnDeleteBook.setVisible(false); btnDeleteMember.setVisible(true);
				btnIssue.setVisible(false); btnReturn.setVisible(false);
				
				btnBackToMembers.setBounds(10, 139, 197, 23);
				btnQuit.setBounds(10, 173, 197, 23);
				
				lblBookID.setBounds(36, 53, 84, 14);textField1.setBounds(155, 47, 136, 20);
				
				lblMainMenu.setVisible(false); lblMainMenu2.setVisible(false); 
				lblRules.setVisible(false); lblRules2.setVisible(false);
				lblBooks.setVisible(false); lblBooks_1.setVisible(false); 
				lblMembers.setVisible(false); lblMembers_1.setVisible(false); 
				lblIssueBook.setVisible(false); lblReturnBook.setVisible(false); lblEdit.setVisible(false); 
				lblIssueBook_1.setVisible(false); lblReturnBook_1.setVisible(false); lblEdit_1.setVisible(false); 
				lblDepertmentOfCse.setVisible(false); lblDepertmentOfEee.setVisible(false); lblDepertmentOfEnglish.setVisible(true); 
				lblDepertmentOfCse_1.setVisible(false); lblDepertmentOfEee_1.setVisible(false); lblDepertmentOfEnglish_1.setVisible(true); 
				lblAddNewMember.setVisible(false); lblAddNewBook.setVisible(false); 
				lblAddNewMember_1.setVisible(false); lblAddNewBook_1.setVisible(false); 
				lblFaculty.setVisible(false); lblStudent.setVisible(false); 
				lblFaculty_1.setVisible(false); lblStudent_1.setVisible(false);
				lblBookID.setVisible(false); lblTitle.setVisible(false); lblAuthor.setVisible(false); 
				lblPrice.setVisible(false); lblAvailability.setVisible(false); lblDepartment.setVisible(false);
				lblMemberId.setVisible(true); lblName.setVisible(false); lblMembershipType.setVisible(false); 
				lblAddress.setVisible(false); lblContact.setVisible(false);
				
				textField1.setVisible(true); textField2.setVisible(false); textField3.setVisible(false);
				textField4.setVisible(false); textField5.setVisible(false); textField6.setVisible(false);
				
				textField1.setText(null); textField2.setText(null);
				textField3.setText(null); textField4.setText(null);
				textField5.setText(null); textField6.setText(null);
				
				textField7.setText("btnEnglishFaculty");
				
				textField8.setVisible(false);lblBorrowerID.setVisible(false);
			}
		});
		
		btnStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpnRules.setVisible(false);
				table.setVisible(true);
				scrollPane.setVisible(true);
				
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",user,pass);
					String sql= "select * from members where membership_type='Student'";
					PreparedStatement st= con.prepareStatement(sql);
					ResultSet rs= st.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, e1);
				}
				
				btnRules.setVisible(false); btnBooks.setVisible(false); btnMembers.setVisible(false);
				btnIsuBooks.setVisible(false); btnRetBooks.setVisible(false); btnAddMem.setVisible(false);
				btnAddBooks.setVisible(false); btnDeleteBook.setVisible(false); btnQuit.setVisible(true);
				btnCseBooks.setVisible(false); btnEeeBooks.setVisible(false); btnEnglishBooks.setVisible(false);
				btnCseFaculty.setVisible(false); btnEeeFaculty.setVisible(false); btnEnglishFaculty.setVisible(false);
				btnCseStudent.setVisible(true); btnEeeStudent.setVisible(true); btnEnglishStudent.setVisible(true);
				btnFaculty.setVisible(false); btnStudent.setVisible(false);
				btnBackToMembers.setVisible(true); btnBackToBooks.setVisible(false); 
				btnBackToFaculty.setVisible(false); btnBackToStudent.setVisible(false);
				btnBackToMembers.setVisible(true); btnBackToMainMenu.setVisible(false);
				btnDone.setVisible(false); btnDone2.setVisible(false);
				btnIssue.setVisible(false); btnReturn.setVisible(false);
				btnDeleteBook.setVisible(false); btnDeleteMember.setVisible(true);
				btnIssue.setVisible(false); btnReturn.setVisible(false);
				
				btnBackToMembers.setBounds(10, 139, 197, 23);
				btnQuit.setBounds(10, 173, 197, 23);
				
				lblBookID.setBounds(36, 53, 84, 14);textField1.setBounds(155, 47, 136, 20);
				
				lblMainMenu.setVisible(false); lblMainMenu2.setVisible(false); 
				lblRules.setVisible(false); lblRules2.setVisible(false);
				lblBooks.setVisible(false); lblBooks_1.setVisible(false); 
				lblMembers.setVisible(false); lblMembers_1.setVisible(false); 
				lblIssueBook.setVisible(false); lblReturnBook.setVisible(false); lblEdit.setVisible(false); 
				lblIssueBook_1.setVisible(false); lblReturnBook_1.setVisible(false); lblEdit_1.setVisible(false); 
				lblDepertmentOfCse.setVisible(false); lblDepertmentOfEee.setVisible(false); lblDepertmentOfEnglish.setVisible(false); 
				lblDepertmentOfCse_1.setVisible(false); lblDepertmentOfEee_1.setVisible(false); lblDepertmentOfEnglish_1.setVisible(false); 
				lblAddNewMember.setVisible(false); lblAddNewBook.setVisible(false); 
				lblAddNewMember_1.setVisible(false); lblAddNewBook_1.setVisible(false); 
				lblFaculty.setVisible(false); lblStudent.setVisible(true); 
				lblFaculty_1.setVisible(false); lblStudent_1.setVisible(true);
				lblBookID.setVisible(false); lblTitle.setVisible(false); lblAuthor.setVisible(false); 
				lblPrice.setVisible(false); lblAvailability.setVisible(false); lblDepartment.setVisible(false);
				lblMemberId.setVisible(true); lblName.setVisible(false); lblMembershipType.setVisible(false); 
				lblAddress.setVisible(false); lblContact.setVisible(false);
				
				textField1.setVisible(true); textField2.setVisible(false); textField3.setVisible(false);
				textField4.setVisible(false); textField5.setVisible(false); textField6.setVisible(false);
				
				textField1.setText(null); textField2.setText(null);
				textField3.setText(null); textField4.setText(null);
				textField5.setText(null); textField6.setText(null);
				
				textField7.setText("btnStudent");
				
				textField8.setVisible(false);lblBorrowerID.setVisible(false);
			}
		});
		
		btnCseStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpnRules.setVisible(false);
				table.setVisible(true);
				scrollPane.setVisible(true);
				
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",user,pass);
					String sql= "select * from members where membership_type='Student' and department='CSE'";
					PreparedStatement st= con.prepareStatement(sql);
					ResultSet rs= st.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, e1);
				}
				
				btnRules.setVisible(false); btnBooks.setVisible(false); btnMembers.setVisible(false);
				btnIsuBooks.setVisible(false); btnRetBooks.setVisible(false); btnAddMem.setVisible(false);
				btnAddBooks.setVisible(false); btnDeleteBook.setVisible(false); btnQuit.setVisible(true);
				btnCseBooks.setVisible(false); btnEeeBooks.setVisible(false); btnEnglishBooks.setVisible(false);
				btnCseFaculty.setVisible(false); btnEeeFaculty.setVisible(false); btnEnglishFaculty.setVisible(false);
				btnCseStudent.setVisible(true); btnEeeStudent.setVisible(true); btnEnglishStudent.setVisible(true);
				btnFaculty.setVisible(false); btnStudent.setVisible(false);
				btnBackToMembers.setVisible(true); btnBackToBooks.setVisible(false); 
				btnBackToFaculty.setVisible(false); btnBackToStudent.setVisible(false);
				btnBackToMembers.setVisible(true); btnBackToMainMenu.setVisible(false);
				btnDone.setVisible(false); btnDone2.setVisible(false);
				btnIssue.setVisible(false); btnReturn.setVisible(false);
				btnDeleteBook.setVisible(false); btnDeleteMember.setVisible(true);
				btnIssue.setVisible(false); btnReturn.setVisible(false);
				
				btnBackToMembers.setBounds(10, 139, 197, 23);
				btnQuit.setBounds(10, 173, 197, 23);
				
				lblBookID.setBounds(36, 53, 84, 14);textField1.setBounds(155, 47, 136, 20);
				
				lblMainMenu.setVisible(false); lblMainMenu2.setVisible(false); 
				lblRules.setVisible(false); lblRules2.setVisible(false);
				lblBooks.setVisible(false); lblBooks_1.setVisible(false); 
				lblMembers.setVisible(false); lblMembers_1.setVisible(false); 
				lblIssueBook.setVisible(false); lblReturnBook.setVisible(false); lblEdit.setVisible(false); 
				lblIssueBook_1.setVisible(false); lblReturnBook_1.setVisible(false); lblEdit_1.setVisible(false); 
				lblDepertmentOfCse.setVisible(true); lblDepertmentOfEee.setVisible(false); lblDepertmentOfEnglish.setVisible(false); 
				lblDepertmentOfCse_1.setVisible(true); lblDepertmentOfEee_1.setVisible(false); lblDepertmentOfEnglish_1.setVisible(false); 
				lblAddNewMember.setVisible(false); lblAddNewBook.setVisible(false); 
				lblAddNewMember_1.setVisible(false); lblAddNewBook_1.setVisible(false); 
				lblFaculty.setVisible(false); lblStudent.setVisible(false); 
				lblFaculty_1.setVisible(false); lblStudent_1.setVisible(false);
				lblBookID.setVisible(false); lblTitle.setVisible(false); lblAuthor.setVisible(false); 
				lblPrice.setVisible(false); lblAvailability.setVisible(false); lblDepartment.setVisible(false);
				lblMemberId.setVisible(true); lblName.setVisible(false); lblMembershipType.setVisible(false); 
				lblAddress.setVisible(false); lblContact.setVisible(false);
				
				textField1.setVisible(true); textField2.setVisible(false); textField3.setVisible(false);
				textField4.setVisible(false); textField5.setVisible(false); textField6.setVisible(false);
				
				textField1.setText(null); textField2.setText(null);
				textField3.setText(null); textField4.setText(null);
				textField5.setText(null); textField6.setText(null);
				
				textField7.setText("btnCseStudent");
				
				textField8.setVisible(false);lblBorrowerID.setVisible(false);
			}
		});

		btnEeeStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpnRules.setVisible(false);
				table.setVisible(true);
				scrollPane.setVisible(true);
				
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",user,pass);
					String sql= "select * from members where membership_type='Student' and department='EEE'";
					PreparedStatement st= con.prepareStatement(sql);
					ResultSet rs= st.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, e1);
				}
				
				btnRules.setVisible(false); btnBooks.setVisible(false); btnMembers.setVisible(false);
				btnIsuBooks.setVisible(false); btnRetBooks.setVisible(false); btnAddMem.setVisible(false);
				btnAddBooks.setVisible(false); btnDeleteBook.setVisible(false); btnQuit.setVisible(true);
				btnCseBooks.setVisible(false); btnEeeBooks.setVisible(false); btnEnglishBooks.setVisible(false);
				btnCseFaculty.setVisible(false); btnEeeFaculty.setVisible(false); btnEnglishFaculty.setVisible(false);
				btnCseStudent.setVisible(true); btnEeeStudent.setVisible(true); btnEnglishStudent.setVisible(true);
				btnFaculty.setVisible(false); btnStudent.setVisible(false);
				btnBackToMembers.setVisible(true); btnBackToBooks.setVisible(false); 
				btnBackToFaculty.setVisible(false); btnBackToStudent.setVisible(false);
				btnBackToMembers.setVisible(true); btnBackToMainMenu.setVisible(false);
				btnDone.setVisible(false); btnDone2.setVisible(false);
				btnIssue.setVisible(false); btnReturn.setVisible(false);
				btnDeleteBook.setVisible(false); btnDeleteMember.setVisible(true);
				btnIssue.setVisible(false); btnReturn.setVisible(false);
				
				btnBackToMembers.setBounds(10, 139, 197, 23);
				btnQuit.setBounds(10, 173, 197, 23);
				
				lblBookID.setBounds(36, 53, 84, 14);textField1.setBounds(155, 47, 136, 20);
				
				lblMainMenu.setVisible(false); lblMainMenu2.setVisible(false); 
				lblRules.setVisible(false); lblRules2.setVisible(false);
				lblBooks.setVisible(false); lblBooks_1.setVisible(false); 
				lblMembers.setVisible(false); lblMembers_1.setVisible(false); 
				lblIssueBook.setVisible(false); lblReturnBook.setVisible(false); lblEdit.setVisible(false); 
				lblIssueBook_1.setVisible(false); lblReturnBook_1.setVisible(false); lblEdit_1.setVisible(false); 
				lblDepertmentOfCse.setVisible(false); lblDepertmentOfEee.setVisible(true); lblDepertmentOfEnglish.setVisible(false); 
				lblDepertmentOfCse_1.setVisible(false); lblDepertmentOfEee_1.setVisible(true); lblDepertmentOfEnglish_1.setVisible(false); 
				lblAddNewMember.setVisible(false); lblAddNewBook.setVisible(false); 
				lblAddNewMember_1.setVisible(false); lblAddNewBook_1.setVisible(false); 
				lblFaculty.setVisible(false); lblStudent.setVisible(false); 
				lblFaculty_1.setVisible(false); lblStudent_1.setVisible(false);
				lblBookID.setVisible(false); lblTitle.setVisible(false); lblAuthor.setVisible(false); 
				lblPrice.setVisible(false); lblAvailability.setVisible(false); lblDepartment.setVisible(false);
				lblMemberId.setVisible(true); lblName.setVisible(false); lblMembershipType.setVisible(false); 
				lblAddress.setVisible(false); lblContact.setVisible(false);
				
				textField1.setVisible(true); textField2.setVisible(false); textField3.setVisible(false);
				textField4.setVisible(false); textField5.setVisible(false); textField6.setVisible(false);
				
				textField1.setText(null); textField2.setText(null);
				textField3.setText(null); textField4.setText(null);
				textField5.setText(null); textField6.setText(null);
				
				textField7.setText("btnEeeStudent");
				
				textField8.setVisible(false);lblBorrowerID.setVisible(false);
			}
		});

		btnEnglishStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpnRules.setVisible(false);
				table.setVisible(true);
				scrollPane.setVisible(true);
				
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",user,pass);
					String sql= "select * from members where membership_type='Student' and department='English'";
					PreparedStatement st= con.prepareStatement(sql);
					ResultSet rs= st.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, e1);
				}
				
				btnRules.setVisible(false); btnBooks.setVisible(false); btnMembers.setVisible(false);
				btnIsuBooks.setVisible(false); btnRetBooks.setVisible(false); btnAddMem.setVisible(false);
				btnAddBooks.setVisible(false); btnDeleteBook.setVisible(false); btnQuit.setVisible(true);
				btnCseBooks.setVisible(false); btnEeeBooks.setVisible(false); btnEnglishBooks.setVisible(false);
				btnCseFaculty.setVisible(false); btnEeeFaculty.setVisible(false); btnEnglishFaculty.setVisible(false);
				btnCseStudent.setVisible(true); btnEeeStudent.setVisible(true); btnEnglishStudent.setVisible(true);
				btnFaculty.setVisible(false); btnStudent.setVisible(false);
				btnBackToMembers.setVisible(true); btnBackToBooks.setVisible(false); 
				btnBackToFaculty.setVisible(false); btnBackToStudent.setVisible(false);
				btnBackToMembers.setVisible(true); btnBackToMainMenu.setVisible(false);
				btnDone.setVisible(false); btnDone2.setVisible(false);
				btnIssue.setVisible(false); btnReturn.setVisible(false);
				btnDeleteBook.setVisible(false); btnDeleteMember.setVisible(true);
				btnIssue.setVisible(false); btnReturn.setVisible(false);
				
				btnBackToMembers.setBounds(10, 139, 197, 23);
				btnQuit.setBounds(10, 173, 197, 23);
				
				lblBookID.setBounds(36, 53, 84, 14);textField1.setBounds(155, 47, 136, 20);
				
				lblMainMenu.setVisible(false); lblMainMenu2.setVisible(false); 
				lblRules.setVisible(false); lblRules2.setVisible(false);
				lblBooks.setVisible(false); lblBooks_1.setVisible(false); 
				lblMembers.setVisible(false); lblMembers_1.setVisible(false); 
				lblIssueBook.setVisible(false); lblReturnBook.setVisible(false); lblEdit.setVisible(false); 
				lblIssueBook_1.setVisible(false); lblReturnBook_1.setVisible(false); lblEdit_1.setVisible(false); 
				lblDepertmentOfCse.setVisible(false); lblDepertmentOfEee.setVisible(false); lblDepertmentOfEnglish.setVisible(true); 
				lblDepertmentOfCse_1.setVisible(false); lblDepertmentOfEee_1.setVisible(false); lblDepertmentOfEnglish_1.setVisible(true); 
				lblAddNewMember.setVisible(false); lblAddNewBook.setVisible(false); 
				lblAddNewMember_1.setVisible(false); lblAddNewBook_1.setVisible(false); 
				lblFaculty.setVisible(false); lblStudent.setVisible(false); 
				lblFaculty_1.setVisible(false); lblStudent_1.setVisible(false);
				lblBookID.setVisible(false); lblTitle.setVisible(false); lblAuthor.setVisible(false); 
				lblPrice.setVisible(false); lblAvailability.setVisible(false); lblDepartment.setVisible(false);
				lblMemberId.setVisible(true); lblName.setVisible(false); lblMembershipType.setVisible(false); 
				lblAddress.setVisible(false); lblContact.setVisible(false);
				
				textField1.setVisible(true); textField2.setVisible(false); textField3.setVisible(false);
				textField4.setVisible(false); textField5.setVisible(false); textField6.setVisible(false);
				
				textField1.setText(null); textField2.setText(null);
				textField3.setText(null); textField4.setText(null);
				textField5.setText(null); textField6.setText(null);
				
				textField7.setText("btnEnglishStudent");
				
				textField8.setVisible(false);lblBorrowerID.setVisible(false);
			}
		});
		
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		btnBackToMembers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnMembers.doClick();
			}
		});
		
		btnBackToBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnBooks.doClick();
			}
		});
		
		btnBackToStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnMembers.doClick();
			}
		});
		
		btnBackToMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {txtpnRules.setVisible(false);
			table.setVisible(false);
			scrollPane.setVisible(false);
			
			btnRules.setVisible(true); btnBooks.setVisible(true); btnMembers.setVisible(true);
			btnIsuBooks.setVisible(true); btnRetBooks.setVisible(true); btnAddMem.setVisible(true);
			btnAddBooks.setVisible(true);btnQuit.setVisible(true);
			btnCseBooks.setVisible(false); btnEeeBooks.setVisible(false); btnEnglishBooks.setVisible(false);
			btnCseFaculty.setVisible(false); btnEeeFaculty.setVisible(false); btnEnglishFaculty.setVisible(false);
			btnCseStudent.setVisible(false); btnEeeStudent.setVisible(false); btnEnglishStudent.setVisible(false);
			btnFaculty.setVisible(false); btnStudent.setVisible(false);
			btnBackToMembers.setVisible(false); btnBackToBooks.setVisible(false); 
			btnBackToFaculty.setVisible(false); btnBackToStudent.setVisible(false);
			btnBackToMainMenu.setVisible(false);
			btnDone.setVisible(false); btnDone2.setVisible(false);
			btnIssue.setVisible(false); btnReturn.setVisible(false);
			btnDeleteBook.setVisible(false); btnDeleteMember.setVisible(false);
			btnIssue.setVisible(false); btnReturn.setVisible(false);
			
			btnQuit.setBounds(10, 275, 197, 23);
			
			lblBookID.setBounds(36, 53, 84, 14);textField1.setBounds(155, 47, 136, 20);
					
			lblMainMenu.setVisible(true); lblMainMenu2.setVisible(true); 
			lblRules.setVisible(false); lblRules2.setVisible(false);
			lblBooks.setVisible(false); lblBooks_1.setVisible(false); 
			lblMembers.setVisible(false); lblMembers_1.setVisible(false); 
			lblIssueBook.setVisible(false); lblReturnBook.setVisible(false); lblEdit.setVisible(false); 
			lblIssueBook_1.setVisible(false); lblReturnBook_1.setVisible(false); lblEdit_1.setVisible(false); 
			lblDepertmentOfCse.setVisible(false); lblDepertmentOfEee.setVisible(false); lblDepertmentOfEnglish.setVisible(false); 
			lblDepertmentOfCse_1.setVisible(false); lblDepertmentOfEee_1.setVisible(false); lblDepertmentOfEnglish_1.setVisible(false); 
			lblAddNewMember.setVisible(false); lblAddNewBook.setVisible(false); 
			lblAddNewMember_1.setVisible(false); lblAddNewBook_1.setVisible(false); 
			lblFaculty.setVisible(false); lblStudent.setVisible(false); 
			lblFaculty_1.setVisible(false); lblStudent_1.setVisible(false);
			lblBookID.setVisible(false); lblTitle.setVisible(false); lblAuthor.setVisible(false); 
			lblPrice.setVisible(false); lblAvailability.setVisible(false); lblDepartment.setVisible(false);
			lblMemberId.setVisible(false); lblName.setVisible(false); lblMembershipType.setVisible(false); 
			lblAddress.setVisible(false); lblContact.setVisible(false);
			
			textField1.setVisible(false); textField2.setVisible(false); textField3.setVisible(false);
			textField4.setVisible(false); textField5.setVisible(false); textField6.setVisible(false);
			
			textField1.setText(null); textField2.setText(null);
			textField3.setText(null); textField4.setText(null);
			textField5.setText(null); textField6.setText(null);
			
			textField8.setVisible(false);lblBorrowerID.setVisible(false);
			}
		});
		
		btnBackToFaculty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnMembers.doClick();
			}
		});
		
		btnCseBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpnRules.setVisible(false);
				table.setVisible(true);
				scrollPane.setVisible(true);
				
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",user,pass);
					String sql= "select * from books where department='CSE'";
					PreparedStatement st= con.prepareStatement(sql);
					ResultSet rs= st.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, e1);
				}
				
				btnRules.setVisible(false); btnBooks.setVisible(false); btnMembers.setVisible(false);
				btnIsuBooks.setVisible(false); btnRetBooks.setVisible(false); btnAddMem.setVisible(false);
				btnAddBooks.setVisible(false); btnDeleteBook.setVisible(false); btnQuit.setVisible(true);
				btnCseBooks.setVisible(true); btnEeeBooks.setVisible(true); btnEnglishBooks.setVisible(true);
				btnCseFaculty.setVisible(false); btnEeeFaculty.setVisible(false); btnEnglishFaculty.setVisible(false);
				btnCseStudent.setVisible(false); btnEeeStudent.setVisible(false); btnEnglishStudent.setVisible(false);
				btnFaculty.setVisible(false); btnStudent.setVisible(false);
				btnBackToMembers.setVisible(false); btnBackToBooks.setVisible(false); 
				btnBackToFaculty.setVisible(false); btnBackToStudent.setVisible(false);
				btnBackToMainMenu.setVisible(false); btnBackToBooks.setVisible(true);
				btnDone.setVisible(false); btnDone2.setVisible(false);
				btnIssue.setVisible(false); btnReturn.setVisible(false);
				btnDeleteBook.setVisible(true); btnDeleteMember.setVisible(false);
				btnIssue.setVisible(false); btnReturn.setVisible(false);
				
				btnBackToBooks.setBounds(10, 139, 197, 23);
				btnQuit.setBounds(10, 173, 197, 23);
				
				lblBookID.setBounds(36, 53, 84, 14);textField1.setBounds(155, 47, 136, 20);
				
				lblMainMenu.setVisible(false); lblMainMenu2.setVisible(false); 
				lblRules.setVisible(false); lblRules2.setVisible(false);
				lblBooks.setVisible(false); lblBooks_1.setVisible(false); 
				lblMembers.setVisible(false); lblMembers_1.setVisible(false); 
				lblIssueBook.setVisible(false); lblReturnBook.setVisible(false); lblEdit.setVisible(false); 
				lblIssueBook_1.setVisible(false); lblReturnBook_1.setVisible(false); lblEdit_1.setVisible(false); 
				lblDepertmentOfCse.setVisible(true); lblDepertmentOfEee.setVisible(false); lblDepertmentOfEnglish.setVisible(false); 
				lblDepertmentOfCse_1.setVisible(true); lblDepertmentOfEee_1.setVisible(false); lblDepertmentOfEnglish_1.setVisible(false); 
				lblAddNewMember.setVisible(false); lblAddNewBook.setVisible(false); 
				lblAddNewMember_1.setVisible(false); lblAddNewBook_1.setVisible(false); 
				lblFaculty.setVisible(false); lblStudent.setVisible(false); 
				lblFaculty_1.setVisible(false); lblStudent_1.setVisible(false);
				lblBookID.setVisible(true); lblTitle.setVisible(false); lblAuthor.setVisible(false); 
				lblPrice.setVisible(false); lblAvailability.setVisible(false); lblDepartment.setVisible(false);
				lblMemberId.setVisible(false); lblName.setVisible(false); lblMembershipType.setVisible(false); 
				lblAddress.setVisible(false); lblContact.setVisible(false);
				
				textField1.setVisible(true); textField2.setVisible(false); textField3.setVisible(false);
				textField4.setVisible(false); textField5.setVisible(false); textField6.setVisible(false);
				
				textField1.setText(null); textField2.setText(null);
				textField3.setText(null); textField4.setText(null);
				textField5.setText(null); textField6.setText(null);
				
				textField7.setText("btnCseBooks");
				
				textField8.setVisible(false);lblBorrowerID.setVisible(false);
			}
		});
		
		btnEeeBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpnRules.setVisible(false);
				table.setVisible(true);
				scrollPane.setVisible(true);
				
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",user,pass);
					String sql= "select * from books where department='EEE'";
					PreparedStatement st= con.prepareStatement(sql);
					ResultSet rs= st.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, e1);
				}
				
				btnRules.setVisible(false); btnBooks.setVisible(false); btnMembers.setVisible(false);
				btnIsuBooks.setVisible(false); btnRetBooks.setVisible(false); btnAddMem.setVisible(false);
				btnAddBooks.setVisible(false); btnDeleteBook.setVisible(false); btnQuit.setVisible(true);
				btnCseBooks.setVisible(true); btnEeeBooks.setVisible(true); btnEnglishBooks.setVisible(true);
				btnCseFaculty.setVisible(false); btnEeeFaculty.setVisible(false); btnEnglishFaculty.setVisible(false);
				btnCseStudent.setVisible(false); btnEeeStudent.setVisible(false); btnEnglishStudent.setVisible(false);
				btnFaculty.setVisible(false); btnStudent.setVisible(false);
				btnBackToMembers.setVisible(false); btnBackToBooks.setVisible(false); 
				btnBackToFaculty.setVisible(false); btnBackToStudent.setVisible(false);
				btnBackToMainMenu.setVisible(false); btnBackToBooks.setVisible(true);
				btnDone.setVisible(false); btnDone2.setVisible(false);
				btnIssue.setVisible(false); btnReturn.setVisible(false);
				btnDeleteBook.setVisible(true); btnDeleteMember.setVisible(false);
				btnIssue.setVisible(false); btnReturn.setVisible(false);
				
				btnBackToBooks.setBounds(10, 139, 197, 23);
				btnQuit.setBounds(10, 173, 197, 23);
				
				lblBookID.setBounds(36, 53, 84, 14);textField1.setBounds(155, 47, 136, 20);
				
				lblMainMenu.setVisible(false); lblMainMenu2.setVisible(false); 
				lblRules.setVisible(false); lblRules2.setVisible(false);
				lblBooks.setVisible(false); lblBooks_1.setVisible(false); 
				lblMembers.setVisible(false); lblMembers_1.setVisible(false); 
				lblIssueBook.setVisible(false); lblReturnBook.setVisible(false); lblEdit.setVisible(false); 
				lblIssueBook_1.setVisible(false); lblReturnBook_1.setVisible(false); lblEdit_1.setVisible(false); 
				lblDepertmentOfCse.setVisible(false); lblDepertmentOfEee.setVisible(true); lblDepertmentOfEnglish.setVisible(false); 
				lblDepertmentOfCse_1.setVisible(false); lblDepertmentOfEee_1.setVisible(true); lblDepertmentOfEnglish_1.setVisible(false); 
				lblAddNewMember.setVisible(false); lblAddNewBook.setVisible(false); 
				lblAddNewMember_1.setVisible(false); lblAddNewBook_1.setVisible(false); 
				lblFaculty.setVisible(false); lblStudent.setVisible(false); 
				lblFaculty_1.setVisible(false); lblStudent_1.setVisible(false);
				lblBookID.setVisible(true); lblTitle.setVisible(false); lblAuthor.setVisible(false); 
				lblPrice.setVisible(false); lblAvailability.setVisible(false); lblDepartment.setVisible(false);
				lblMemberId.setVisible(false); lblName.setVisible(false); lblMembershipType.setVisible(false); 
				lblAddress.setVisible(false); lblContact.setVisible(false);
				
				textField1.setVisible(true); textField2.setVisible(false); textField3.setVisible(false);
				textField4.setVisible(false); textField5.setVisible(false); textField6.setVisible(false);
				
				textField1.setText(null); textField2.setText(null);
				textField3.setText(null); textField4.setText(null);
				textField5.setText(null); textField6.setText(null);
				
				textField7.setText("btnEeeBooks");
				
				textField8.setVisible(false);lblBorrowerID.setVisible(false);
			}
		});
		
		btnEnglishBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpnRules.setVisible(false);
				table.setVisible(true);
				scrollPane.setVisible(true);
				
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",user,pass);
					String sql= "select * from books where department='English'";
					PreparedStatement st= con.prepareStatement(sql);
					ResultSet rs= st.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, e1);
				}
				
				btnRules.setVisible(false); btnBooks.setVisible(false); btnMembers.setVisible(false);
				btnIsuBooks.setVisible(false); btnRetBooks.setVisible(false); btnAddMem.setVisible(false);
				btnAddBooks.setVisible(false); btnDeleteBook.setVisible(false); btnQuit.setVisible(true);
				btnCseBooks.setVisible(true); btnEeeBooks.setVisible(true); btnEnglishBooks.setVisible(true);
				btnCseFaculty.setVisible(false); btnEeeFaculty.setVisible(false); btnEnglishFaculty.setVisible(false);
				btnCseStudent.setVisible(false); btnEeeStudent.setVisible(false); btnEnglishStudent.setVisible(false);
				btnFaculty.setVisible(false); btnStudent.setVisible(false);
				btnBackToMembers.setVisible(false); btnBackToBooks.setVisible(false); 
				btnBackToFaculty.setVisible(false); btnBackToStudent.setVisible(false);
				btnBackToMainMenu.setVisible(false); btnBackToBooks.setVisible(true);
				btnDone.setVisible(false); btnDone2.setVisible(false);
				btnIssue.setVisible(false); btnReturn.setVisible(false);
				btnDeleteBook.setVisible(true); btnDeleteMember.setVisible(false);
				btnIssue.setVisible(false); btnReturn.setVisible(false);
				
				btnBackToBooks.setBounds(10, 139, 197, 23);
				btnQuit.setBounds(10, 173, 197, 23);
				
				lblBookID.setBounds(36, 53, 84, 14);textField1.setBounds(155, 47, 136, 20);
				
				lblMainMenu.setVisible(false); lblMainMenu2.setVisible(false); 
				lblRules.setVisible(false); lblRules2.setVisible(false);
				lblBooks.setVisible(false); lblBooks_1.setVisible(false); 
				lblMembers.setVisible(false); lblMembers_1.setVisible(false); 
				lblIssueBook.setVisible(false); lblReturnBook.setVisible(false); lblEdit.setVisible(false); 
				lblIssueBook_1.setVisible(false); lblReturnBook_1.setVisible(false); lblEdit_1.setVisible(false); 
				lblDepertmentOfCse.setVisible(false); lblDepertmentOfEee.setVisible(false); lblDepertmentOfEnglish.setVisible(true); 
				lblDepertmentOfCse_1.setVisible(false); lblDepertmentOfEee_1.setVisible(false); lblDepertmentOfEnglish_1.setVisible(true); 
				lblAddNewMember.setVisible(false); lblAddNewBook.setVisible(false); 
				lblAddNewMember_1.setVisible(false); lblAddNewBook_1.setVisible(false); 
				lblFaculty.setVisible(false); lblStudent.setVisible(false); 
				lblFaculty_1.setVisible(false); lblStudent_1.setVisible(false);
				lblBookID.setVisible(true); lblTitle.setVisible(false); lblAuthor.setVisible(false); 
				lblPrice.setVisible(false); lblAvailability.setVisible(false); lblDepartment.setVisible(false);
				lblMemberId.setVisible(false); lblName.setVisible(false); lblMembershipType.setVisible(false); 
				lblAddress.setVisible(false); lblContact.setVisible(false);
				
				textField1.setVisible(true); textField2.setVisible(false); textField3.setVisible(false);
				textField4.setVisible(false); textField5.setVisible(false); textField6.setVisible(false);
				
				textField1.setText(null); textField2.setText(null);
				textField3.setText(null); textField4.setText(null);
				textField5.setText(null); textField6.setText(null);
				
				textField7.setText("btnEnglishBooks");
				
				textField8.setVisible(false);lblBorrowerID.setVisible(false);
			}
		});
		
		btnAddBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtpnRules.setVisible(false);
				table.setVisible(false);
				scrollPane.setVisible(false);
				
				btnRules.setVisible(false); btnBooks.setVisible(false); btnMembers.setVisible(false);
				btnIsuBooks.setVisible(false); btnRetBooks.setVisible(false); btnAddMem.setVisible(false);
				btnAddBooks.setVisible(false);btnQuit.setVisible(true);
				btnCseBooks.setVisible(false); btnEeeBooks.setVisible(false); btnEnglishBooks.setVisible(false);
				btnCseFaculty.setVisible(false); btnEeeFaculty.setVisible(false); btnEnglishFaculty.setVisible(false);
				btnCseStudent.setVisible(false); btnEeeStudent.setVisible(false); btnEnglishStudent.setVisible(false);
				btnFaculty.setVisible(false); btnStudent.setVisible(false);
				btnBackToMembers.setVisible(false); btnBackToBooks.setVisible(false); 
				btnBackToFaculty.setVisible(false); btnBackToStudent.setVisible(false);
				btnBackToMainMenu.setVisible(true);
				btnDone.setVisible(true); btnDone2.setVisible(false);
				btnIssue.setVisible(false); btnReturn.setVisible(false);
				btnDeleteBook.setVisible(false); btnDeleteBook.setVisible(false);
				btnIssue.setVisible(false); btnReturn.setVisible(false);
				
				btnDone.setBounds(10, 37, 197, 23);
				btnBackToMainMenu.setBounds(10, 71, 197, 23);
				btnQuit.setBounds(10, 105, 197, 23);
				
				lblBookID.setBounds(36, 53, 84, 14);textField1.setBounds(155, 47, 136, 20);
				
				lblMainMenu.setVisible(false); lblMainMenu2.setVisible(false); 
				lblRules.setVisible(false); lblRules2.setVisible(false);
				lblBooks.setVisible(false); lblBooks_1.setVisible(false); 
				lblMembers.setVisible(false); lblMembers_1.setVisible(false); 
				lblIssueBook.setVisible(false); lblReturnBook.setVisible(false); lblEdit.setVisible(false); 
				lblIssueBook_1.setVisible(false); lblReturnBook_1.setVisible(false); lblEdit_1.setVisible(false); 
				lblDepertmentOfCse.setVisible(false); lblDepertmentOfEee.setVisible(false); lblDepertmentOfEnglish.setVisible(false); 
				lblDepertmentOfCse_1.setVisible(false); lblDepertmentOfEee_1.setVisible(false); lblDepertmentOfEnglish_1.setVisible(false); 
				lblAddNewMember.setVisible(false); lblAddNewBook.setVisible(true); 
				lblAddNewMember_1.setVisible(false); lblAddNewBook_1.setVisible(true); 
				lblFaculty.setVisible(false); lblStudent.setVisible(false); 
				lblFaculty_1.setVisible(false); lblStudent_1.setVisible(false);
				lblBookID.setVisible(true); lblTitle.setVisible(true); lblAuthor.setVisible(true); 
				lblPrice.setVisible(true); lblAvailability.setVisible(true); lblDepartment.setVisible(true);
				lblMemberId.setVisible(false); lblName.setVisible(false); lblMembershipType.setVisible(false); 
				lblAddress.setVisible(false); lblContact.setVisible(false);
				
				textField1.setVisible(true); textField2.setVisible(true); textField3.setVisible(true);
				textField4.setVisible(true); textField5.setVisible(true); textField6.setVisible(true);
				
				textField1.setText(null); textField2.setText(null);
				textField3.setText(null); textField4.setText(null);
				textField5.setText(null); textField6.setText(null);
				
				textField8.setVisible(false);lblBorrowerID.setVisible(false);
			}
		});
		
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpnRules.setVisible(false);
				table.setVisible(true);
				scrollPane.setVisible(false);
				
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",user,pass);
					String sql= "insert into books (book_id,title,author,price,availability,department) values (?,?,?,?,?,?)";
					PreparedStatement st= con.prepareStatement(sql);
					st.setString(1,textField1.getText()); st.setString(2,textField2.getText());
					st.setString(3,textField3.getText()); st.setString(4,textField4.getText());
					st.setString(5,textField5.getText()); st.setString(6,textField6.getText());
					
					st.execute();
					JOptionPane.showMessageDialog(null, "Book added");
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, e1);
				}
				
				textField1.setText(null); textField2.setText(null);
				textField3.setText(null); textField4.setText(null);
				textField5.setText(null); textField6.setText(null);
			}
		});
		
		btnAddMem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtpnRules.setVisible(false);
				table.setVisible(false);
				scrollPane.setVisible(false);
				
				btnRules.setVisible(false); btnBooks.setVisible(false); btnMembers.setVisible(false);
				btnIsuBooks.setVisible(false); btnRetBooks.setVisible(false); btnAddMem.setVisible(false);
				btnAddBooks.setVisible(false);btnQuit.setVisible(true);
				btnCseBooks.setVisible(false); btnEeeBooks.setVisible(false); btnEnglishBooks.setVisible(false);
				btnCseFaculty.setVisible(false); btnEeeFaculty.setVisible(false); btnEnglishFaculty.setVisible(false);
				btnCseStudent.setVisible(false); btnEeeStudent.setVisible(false); btnEnglishStudent.setVisible(false);
				btnFaculty.setVisible(false); btnStudent.setVisible(false);
				btnBackToMembers.setVisible(false); btnBackToBooks.setVisible(false); 
				btnBackToFaculty.setVisible(false); btnBackToStudent.setVisible(false);
				btnBackToMainMenu.setVisible(true);
				btnDone.setVisible(false); btnDone2.setVisible(true);
				btnIssue.setVisible(false); btnReturn.setVisible(false);
				btnDeleteBook.setVisible(false); btnDeleteBook.setVisible(false);
				btnIssue.setVisible(false); btnReturn.setVisible(false);
				
				btnDone2.setBounds(10, 37, 197, 23);
				btnBackToMainMenu.setBounds(10, 71, 197, 23);
				btnQuit.setBounds(10, 105, 197, 23);
				
				lblBookID.setBounds(36, 53, 84, 14);textField1.setBounds(155, 47, 136, 20);
				
				lblMainMenu.setVisible(false); lblMainMenu2.setVisible(false); 
				lblRules.setVisible(false); lblRules2.setVisible(false);
				lblBooks.setVisible(false); lblBooks_1.setVisible(false); 
				lblMembers.setVisible(false); lblMembers_1.setVisible(false); 
				lblIssueBook.setVisible(false); lblReturnBook.setVisible(false); lblEdit.setVisible(false); 
				lblIssueBook_1.setVisible(false); lblReturnBook_1.setVisible(false); lblEdit_1.setVisible(false); 
				lblDepertmentOfCse.setVisible(false); lblDepertmentOfEee.setVisible(false); lblDepertmentOfEnglish.setVisible(false); 
				lblDepertmentOfCse_1.setVisible(false); lblDepertmentOfEee_1.setVisible(false); lblDepertmentOfEnglish_1.setVisible(false); 
				lblAddNewMember.setVisible(true); lblAddNewBook.setVisible(false); 
				lblAddNewMember_1.setVisible(true); lblAddNewBook_1.setVisible(false); 
				lblFaculty.setVisible(false); lblStudent.setVisible(false); 
				lblFaculty_1.setVisible(false); lblStudent_1.setVisible(false);
				lblBookID.setVisible(false); lblTitle.setVisible(false); lblAuthor.setVisible(false); 
				lblPrice.setVisible(false); lblAvailability.setVisible(false); lblDepartment.setVisible(true);
				lblMemberId.setVisible(true); lblName.setVisible(true); lblMembershipType.setVisible(true); 
				lblAddress.setVisible(true); lblContact.setVisible(true);
				
				textField1.setVisible(true); textField2.setVisible(true); textField3.setVisible(true);
				textField4.setVisible(true); textField5.setVisible(true); textField6.setVisible(true);
				
				textField1.setText(null); textField2.setText(null);
				textField3.setText(null); textField4.setText(null);
				textField5.setText(null); textField6.setText(null);
				
				textField8.setVisible(false);lblBorrowerID.setVisible(false);
			}
		});
		
		btnDone2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpnRules.setVisible(false);
				table.setVisible(true);
				scrollPane.setVisible(false);
				
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",user,pass);
					String sql= "insert into members (member_id,member_name,membership_type,member_address,member_contact,department) values (?,?,?,?,?,?)";
					PreparedStatement st= con.prepareStatement(sql);
					st.setString(1,textField1.getText()); st.setString(2,textField2.getText());
					st.setString(3,textField3.getText()); st.setString(4,textField4.getText());
					st.setString(5,textField5.getText()); st.setString(6,textField6.getText());
					
					st.execute();
					JOptionPane.showMessageDialog(null, "Member added");
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, e1);
				}
				
				textField1.setText(null); textField2.setText(null);
				textField3.setText(null); textField4.setText(null);
				textField5.setText(null); textField6.setText(null);
			}
		});
		
		btnIsuBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtpnRules.setVisible(false);
				table.setVisible(true);
				scrollPane.setVisible(true);
				
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",user,pass);
					String sql= "select * from books";
					PreparedStatement st= con.prepareStatement(sql);
					ResultSet rs= st.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, e1);
				}
				
				btnRules.setVisible(false); btnBooks.setVisible(false); btnMembers.setVisible(false);
				btnIsuBooks.setVisible(false); btnRetBooks.setVisible(false); btnAddMem.setVisible(false);
				btnAddBooks.setVisible(false); btnDeleteBook.setVisible(false); btnQuit.setVisible(true);
				btnCseBooks.setVisible(false); btnEeeBooks.setVisible(false); btnEnglishBooks.setVisible(false);
				btnCseFaculty.setVisible(false); btnEeeFaculty.setVisible(false); btnEnglishFaculty.setVisible(false);
				btnCseStudent.setVisible(false); btnEeeStudent.setVisible(false); btnEnglishStudent.setVisible(false);
				btnFaculty.setVisible(false); btnStudent.setVisible(false);
				btnBackToMembers.setVisible(false); btnBackToBooks.setVisible(false); 
				btnBackToFaculty.setVisible(false); btnBackToStudent.setVisible(false);
				btnBackToMainMenu.setVisible(true);
				btnDone.setVisible(false); btnDone2.setVisible(false);
				btnIssue.setVisible(true); btnReturn.setVisible(false);
				btnDeleteBook.setVisible(false); btnDeleteMember.setVisible(false);
				
				btnBackToMainMenu.setBounds(10, 37, 197, 23);
				btnQuit.setBounds(10, 71, 197, 23);
				
				lblBookID.setBounds(10, 53, 84, 14);textField1.setBounds(58, 47, 134, 20);
				lblBorrowerID.setBounds(242, 53, 84, 14);textField8.setBounds(315, 47, 134, 20);
				btnIssue.setBounds(500, 44, 105, 23);
				
				lblMainMenu.setVisible(false); lblMainMenu2.setVisible(false); 
				lblRules.setVisible(false); lblRules2.setVisible(false);
				lblBooks.setVisible(false); lblBooks_1.setVisible(false); 
				lblMembers.setVisible(false); lblMembers_1.setVisible(false); 
				lblIssueBook.setVisible(true); lblReturnBook.setVisible(false); lblEdit.setVisible(false); 
				lblIssueBook_1.setVisible(true); lblReturnBook_1.setVisible(false); lblEdit_1.setVisible(false); 
				lblDepertmentOfCse.setVisible(false); lblDepertmentOfEee.setVisible(false); lblDepertmentOfEnglish.setVisible(false); 
				lblDepertmentOfCse_1.setVisible(false); lblDepertmentOfEee_1.setVisible(false); lblDepertmentOfEnglish_1.setVisible(false); 
				lblAddNewMember.setVisible(false); lblAddNewBook.setVisible(false); 
				lblAddNewMember_1.setVisible(false); lblAddNewBook_1.setVisible(false); 
				lblFaculty.setVisible(false); lblStudent.setVisible(false); 
				lblFaculty_1.setVisible(false); lblStudent_1.setVisible(false);
				lblBookID.setVisible(true); lblTitle.setVisible(false); lblAuthor.setVisible(false); 
				lblPrice.setVisible(false); lblAvailability.setVisible(false); lblDepartment.setVisible(false);
				lblMemberId.setVisible(false); lblName.setVisible(false); lblMembershipType.setVisible(false); 
				lblAddress.setVisible(false); lblContact.setVisible(false);
				
				textField1.setVisible(true); textField2.setVisible(false); textField3.setVisible(false);
				textField4.setVisible(false); textField5.setVisible(false); textField6.setVisible(false);
				
				textField1.setText(null); textField2.setText(null);
				textField3.setText(null); textField4.setText(null);
				textField5.setText(null); textField6.setText(null);
				
				textField8.setVisible(true);lblBorrowerID.setVisible(true);
			}
		});
		
		btnIssue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpnRules.setVisible(false);
				table.setVisible(true);
				scrollPane.setVisible(false);
				
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",user,pass);
					String sql= "update books set availability = availability - 1 where book_id = '"+textField1.getText()+"'";
					PreparedStatement st= con.prepareStatement(sql);
					
					st.execute();
					JOptionPane.showMessageDialog(null, "Issued");
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, e1);
				}
				
				textField1.setText(null);
				btnIsuBooks.doClick();
			}
		});
		
		btnRetBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtpnRules.setVisible(false);
				table.setVisible(true);
				scrollPane.setVisible(true);
				
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",user,pass);
					String sql= "select * from books";
					PreparedStatement st= con.prepareStatement(sql);
					ResultSet rs= st.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, e1);
				}
				
				btnRules.setVisible(false); btnBooks.setVisible(false); btnMembers.setVisible(false);
				btnIsuBooks.setVisible(false); btnRetBooks.setVisible(false); btnAddMem.setVisible(false);
				btnAddBooks.setVisible(false); btnDeleteBook.setVisible(false); btnQuit.setVisible(true);
				btnCseBooks.setVisible(false); btnEeeBooks.setVisible(false); btnEnglishBooks.setVisible(false);
				btnCseFaculty.setVisible(false); btnEeeFaculty.setVisible(false); btnEnglishFaculty.setVisible(false);
				btnCseStudent.setVisible(false); btnEeeStudent.setVisible(false); btnEnglishStudent.setVisible(false);
				btnFaculty.setVisible(false); btnStudent.setVisible(false);
				btnBackToMembers.setVisible(false); btnBackToBooks.setVisible(false); 
				btnBackToFaculty.setVisible(false); btnBackToStudent.setVisible(false);
				btnBackToMainMenu.setVisible(true);
				btnDone.setVisible(false); btnDone2.setVisible(false);
				btnIssue.setVisible(false); btnReturn.setVisible(true);
				btnDeleteBook.setVisible(false); btnDeleteMember.setVisible(false);
				
				btnBackToMainMenu.setBounds(10, 37, 197, 23);
				btnQuit.setBounds(10, 71, 197, 23);
				
				lblBookID.setBounds(10, 53, 84, 14);textField1.setBounds(58, 47, 134, 20);
				lblBorrowerID.setBounds(242, 53, 84, 14);textField8.setBounds(315, 47, 134, 20);
				btnReturn.setBounds(500, 44, 105, 23);
				
				lblMainMenu.setVisible(false); lblMainMenu2.setVisible(false); 
				lblRules.setVisible(false); lblRules2.setVisible(false);
				lblBooks.setVisible(false); lblBooks_1.setVisible(false); 
				lblMembers.setVisible(false); lblMembers_1.setVisible(false); 
				lblIssueBook.setVisible(false); lblReturnBook.setVisible(true); lblEdit.setVisible(false); 
				lblIssueBook_1.setVisible(false); lblReturnBook_1.setVisible(true); lblEdit_1.setVisible(false); 
				lblDepertmentOfCse.setVisible(false); lblDepertmentOfEee.setVisible(false); lblDepertmentOfEnglish.setVisible(false); 
				lblDepertmentOfCse_1.setVisible(false); lblDepertmentOfEee_1.setVisible(false); lblDepertmentOfEnglish_1.setVisible(false); 
				lblAddNewMember.setVisible(false); lblAddNewBook.setVisible(false); 
				lblAddNewMember_1.setVisible(false); lblAddNewBook_1.setVisible(false); 
				lblFaculty.setVisible(false); lblStudent.setVisible(false); 
				lblFaculty_1.setVisible(false); lblStudent_1.setVisible(false);
				lblBookID.setVisible(true); lblTitle.setVisible(false); lblAuthor.setVisible(false); 
				lblPrice.setVisible(false); lblAvailability.setVisible(false); lblDepartment.setVisible(false);
				lblMemberId.setVisible(false); lblName.setVisible(false); lblMembershipType.setVisible(false); 
				lblAddress.setVisible(false); lblContact.setVisible(false);
				
				textField1.setVisible(true); textField2.setVisible(false); textField3.setVisible(false);
				textField4.setVisible(false); textField5.setVisible(false); textField6.setVisible(false);
				
				textField1.setText(null); textField2.setText(null);
				textField3.setText(null); textField4.setText(null);
				textField5.setText(null); textField6.setText(null);
				
				textField8.setVisible(true);lblBorrowerID.setVisible(true);
			}
		});
		
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpnRules.setVisible(false);
				table.setVisible(true);
				scrollPane.setVisible(false);
				
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",user,pass);
					String sql= "update books set availability = availability + 1 where book_id = '"+textField1.getText()+"'";
					PreparedStatement st= con.prepareStatement(sql);
					
					st.execute();
					JOptionPane.showMessageDialog(null, "Returned");
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, e1);
				}
				
				textField1.setText(null);
				btnRetBooks.doClick();
			}
		});
		
		btnDeleteBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpnRules.setVisible(false);
				table.setVisible(true);
				scrollPane.setVisible(false);
				
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",user,pass);
					String sql= "delete from books where book_id = '"+textField1.getText()+"'";
					PreparedStatement st= con.prepareStatement(sql);
					
					st.execute();
					JOptionPane.showMessageDialog(null, "Book record deleted");
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, e1);
				}
				
				textField1.setText(null);
				String flag = textField7.getText();
				if(flag=="btnBooks") {
					btnBooks.doClick();
				}
				if(flag=="btnCseBooks") {
					btnCseBooks.doClick();
				}
				if(flag=="btnEeeBooks") {
					btnEeeBooks.doClick();
				}
				if(flag=="btnEnglishBooks") {
					btnEnglishBooks.doClick();
				}
			}
		});
		
		btnDeleteMember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpnRules.setVisible(false);
				table.setVisible(true);
				scrollPane.setVisible(false);
				
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",user,pass);
					String sql= "delete from members where member_id = '"+textField1.getText()+"'";
					PreparedStatement st= con.prepareStatement(sql);

					st.execute();
					JOptionPane.showMessageDialog(null, "Member record deleted");
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, e1);
				}
				
				textField1.setText(null);
				String flag = textField7.getText();
				if(flag=="btnMembers") {
					btnMembers.doClick();
				}
				if(flag=="btnFaculty") {
					btnFaculty.doClick();
				}
				if(flag=="btnCseFaculty") {
					btnCseFaculty.doClick();
				}
				if(flag=="btnEeeFaculty") {
					btnEeeFaculty.doClick();
				}
				if(flag=="btnEnglishFaculty") {
					btnEnglishFaculty.doClick();
				}
				if(flag=="btnStudent") {
					btnStudent.doClick();
				}
				if(flag=="btnCseStudent") {
					btnCseStudent.doClick();
				}
				if(flag=="btnEeeStudent") {
					btnEeeStudent.doClick();
				}
				if(flag=="btnEnglishStudent") {
					btnEnglishStudent.doClick();
				}
			}
		});
	}
}
