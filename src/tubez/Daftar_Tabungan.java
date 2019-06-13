/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubez;

import java.util.ArrayList;

/**
 *
 * @author aka
 */
public class Daftar_Tabungan {
    ArrayList<Tabungan> ListNasabah ;
    public int Jumlah; 
    
    public void AddRekening(Tabungan x)
    {
        ListNasabah.add(x);
    };
    
    public void LihatRekening()
    {
        for (int i = 0; i < ListNasabah.size(); i++) {
            System.out.println(ListNasabah.get(i));
        }
    };
    
}
