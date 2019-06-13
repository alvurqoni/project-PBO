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

import java.sql.*;

public class Tabungan {
    private Rekening Giro;
    private Customer Nasabah;

    public Tabungan(String Nama , String No_KTP , double Saldo , String NoRekening) {
        Saldo = Giro.getSaldo();
        No_KTP = Nasabah.getNo_KTP();
        Nama = Nasabah.getNama();
        NoRekening = Nasabah.getNo_KTP();
    }

    Tabungan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void tambahSaldo(double Saldo)
    {
        this.Giro.setSaldo(Saldo);
    }
    
    public void kurangSaldo(double Saldo)
    {
        this.Giro.setSaldo(-Saldo);
    }
}
