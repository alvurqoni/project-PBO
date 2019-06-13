/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubez;

import java.util.*;
/**
 *
 * @author ariven yutzky
 */
public class App {
    ArrayList<Customer> ListNasabah;
    ArrayList<Rekening> ListTabungan;
    Database db;
    
    public App()
    {
        db = new Database();
        db.connect();
        ListNasabah = db.loadNasabah();
        ListTabungan = db.loadTabungan();
    }
    
    public String viewOutput()
    {
        String s = "";
        for (Customer m : ListNasabah) {
            s += m.getNama() + " ";
            s += m.getNo_KTP() + "\n";
        }
        return s;
    }
    
    public String  viewOuput2(){
        String q = "";
        for (Rekening T : ListTabungan) {
            q += T.getSaldo()+ "\n";
        }
        return q;
        
        
    }    
    
//    public void addNasabah(String nama, String No_KTP){
//        if(getNasabah(No_KTP) != null){
//            throw new IllegalArgumentException("username telah dipakai");
//            }
//       Customer  m = new Customer(nama, No_KTP);
//        ListNasabah.add(m);
//        db.saveNasabah(m);
//    }
//  public addSaldo(String No_KTP, ){
        
}
