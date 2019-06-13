/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubez;

/**
 *
 * @author arivenyutzky
 */
public class Customer {
    private String Nama;
    private String No_KTP;

    public Customer(String Nama, String No_KTP) {
        this.Nama = Nama;
        this.No_KTP = No_KTP;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getNama() {
        return Nama;
    }
    
    public void setNo_KTP(String No_KTP) {
        this.No_KTP = No_KTP;
    }

    public String getNo_KTP() {
        return No_KTP;
    }
    
    
    
    
    
    
   
   
   
}
