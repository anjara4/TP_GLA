/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.modele;

/**
 *
 * @author nobby
 */
public class Membre {
    private int mbrId;
    private String mbrNom;

    public Membre() {}
    
    public Membre(int mbrId, String mbrNom) {
        this.mbrId = mbrId;
        this.mbrNom = mbrNom;
    }
    
    public int getMbrId() {
        return mbrId;
    }

    public void setMbrId(int mbrId) {
        this.mbrId = mbrId;
    }

    public String getMbrNom() {
        return mbrNom;
    }

    public void setMbrNom(String mbrNom) {
        this.mbrNom = mbrNom;
    }

}
