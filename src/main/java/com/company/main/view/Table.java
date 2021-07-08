package com.company.main.view;

import com.company.main.model.MainStorage;
import com.company.main.model.TableModel;

import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.*;

public class Table extends JFrame {
    public Table(MainStorage storage) {
        super("Полученные данные");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JTable table = new JTable(new TableModel(storage));
        TableColumn columnSize;
        for (int i = 0; i < storage.getRepPeriod(); i++) {
            columnSize = table.getColumnModel().getColumn(i);
            if (i == 0) {
                columnSize.setMaxWidth(200);
                columnSize.setMinWidth(170);
            } else {
                columnSize.setMinWidth(70);
            }
        }
        JScrollPane jScrollPane = new JScrollPane(table);
        add(jScrollPane, BorderLayout.CENTER);
        setPreferredSize(new Dimension(1500,300));
        pack();

        setLocation(200,300);
        setVisible(true);
    }
}
