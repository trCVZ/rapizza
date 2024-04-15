package com.rapizza.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import com.rapizza.AdminInfoPanel;

public class InfoButtonListener implements ActionListener {
    private JPanel parentPanel;

    public InfoButtonListener(JPanel parentPanel) {
        this.parentPanel = parentPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (parentPanel != null) {
            // Show the AdminInfoPanel
            parentPanel.removeAll();
            parentPanel.add(new AdminInfoPanel());
            parentPanel.revalidate();
            parentPanel.repaint();
        }
    }
    
}
