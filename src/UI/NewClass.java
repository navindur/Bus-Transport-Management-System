/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

/**
 *
 * @author hirun
 */
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ikush
 */
public class NewClass {

    /**
     * Fills the given table model with data from the provided result set.
     *
     * @param current_table The DefaultTableModel to be filled with data
     * @param current_result The ResultSet containing the data to be displayed
     */
    public static void fillTheTable(DefaultTableModel current_table, ResultSet current_result) {
        // Clear existing rows in the table model
        current_table.setRowCount(0);

        try {
            // Get metadata to determine the number of columns
            ResultSetMetaData metaData = current_result.getMetaData();
            int columnCount = metaData.getColumnCount();

            // Get column names
            String[] columnNames = new String[columnCount];
            for (int i = 1; i <= columnCount; i++) {
                columnNames[i - 1] = metaData.getColumnName(i);
            }

            // Set the column names for the table model
            current_table.setColumnIdentifiers(columnNames);

            while (current_result.next()) {
                // Create an array to store data for each row
                Object[] rowData = new Object[columnCount];

                // Populate the array with data from the result set
                for (int i = 1; i <= columnCount; i++) {
                    rowData[i - 1] = current_result.getString(i);
                }

                // Add the row data to the table model
                current_table.addRow(rowData);
            }

            // Close the result set
            current_result.close();
        } catch (SQLException ex) {
            // Handle SQL exception by showing an error message
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public static String returnColumnValue(String columnName, JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        // Get the index of the selected row
        int rowIndex = table.getSelectedRow();

        if (rowIndex != -1) { // Check if a row is selected
            try {
                // Get the index of the column by name
                int columnIndex = model.findColumn(columnName);

                // Check if the column index is valid
                if (columnIndex != -1) {
                    // Get the value of the specified column in the selected row
                    Object columnValue = model.getValueAt(rowIndex, columnIndex);

                    if (columnValue != null) {
                        // Convert the column value to a string and return
                        return columnValue.toString();
                    }
                }
            } catch (IllegalArgumentException e) {
                // Log or handle the exception appropriately
                e.printStackTrace();
            }
        }
        // Return an empty string if an issue occurs
        return "";
    }
    
}
