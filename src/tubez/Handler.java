/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubez;

/**
 *
 * @author aka
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import tubez.*;

public class Handler implements ActionListener{
    private App model;
    private GUI view;
    
    public Handler()
    {
        model = new App();
        view = new GUI();
        view.setVisible(true);
        view.addActionListener(this);
        view.setOutput(model.viewOutput());
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        try
        {
            if (source.equals(view.getBtnDaftar()))
            {
                String KTP = view.getNo_KTP();
                String nama = view.getNama();
                int saldo = view.getSaldoAwal();
            }
        }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(view, "Terjadi Kesalahan");
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(view, e.getMessage());
            view.reset();
        }
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
