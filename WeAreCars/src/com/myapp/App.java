package com.myapp;

    import javax.swing.*;
    import com.myapp.ui.MainFrame;
    import javax.swing.SwingUtilities;

    public class App {
        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> new MainFrame());
        }
    }

