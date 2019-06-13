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
public class Rekening {
    public double Saldo;
    public String NoRekening;
    
    public Rekening(double Saldo , String NoRekening)
    {
        this.Saldo = Saldo;
        this.NoRekening = NoRekening;
    }
    public void setSaldo(double Saldo )
    {
        this.Saldo += Saldo;
    }
    public double getSaldo()
            {
                return Saldo;
                
            }
    public void setNoRekening(String NoRekening)
    {
        this.NoRekening = NoRekening;
    }
    public String getNoRekening()
    {
        return NoRekening;
    }
}
