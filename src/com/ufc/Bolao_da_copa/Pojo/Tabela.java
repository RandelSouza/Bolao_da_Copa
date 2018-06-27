/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufc.Bolao_da_copa.Pojo;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author randel
 */
public class Tabela extends AbstractTableModel{
   
    private ArrayList row = null;
    private String[] column=  null;
    
    
    
    public Tabela(ArrayList row, String[] column){
        setRow(row);
        setColumn(column);               
    }
    
     public ArrayList getRow() {
        return row;
    }

    public void setRow(ArrayList row) {
        this.row = row;
    }

    public String[] getColumn() {
        return column;
    }

    public void setColumn(String[] collumn) {
        this.column = collumn;
    }
    
    @Override
    public String getColumnName(int numCol){
        return column[numCol];
    }
        
    @Override
    public int getRowCount() {
        return row.size();
    }

    @Override
    public int getColumnCount() {
        return column.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object[] rows = (Object[]) getRow().get(rowIndex);
        return rows[columnIndex];
    }    
}