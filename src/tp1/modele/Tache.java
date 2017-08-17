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
public class Tache {
    private int tch_id;
    private String tch_nom;
    private String tch_description;
    private String tch_status;
    private int mbr_id;

    public int getMbr_id() {
        return mbr_id;
    }

    public void setMbr_id(int mbr_id) {
        this.mbr_id = mbr_id;
    }
    
    public int getTch_id() {
        return tch_id;
    }

    public void setTch_id(int tch_id) {
        this.tch_id = tch_id;
    }

    public String getTch_nom() {
        return tch_nom;
    }

    public void setTch_nom(String tch_nom) {
        this.tch_nom = tch_nom;
    }

    public String getTch_description() {
        return tch_description;
    }

    public void setTch_description(String tch_description) {
        this.tch_description = tch_description;
    }

    public String getTch_status() {
        return tch_status;
    }

    public void setTch_status(String tch_status) {
        this.tch_status = tch_status;
    }
    
    public Tache(int tch_id, String tch_nom, String tch_description, String tch_status, int mbr_id) {
        this.tch_id = tch_id;
        this.tch_nom = tch_nom;
        this.tch_description = tch_description;
        this.tch_status = tch_status;
        this.mbr_id = mbr_id;
    }
    
    public Tache(int tch_id) {
        this.tch_id = tch_id;
    }
    
    public Tache() {}
    
    @Override
    public String toString() {
        return "Tache{" + "tch_id=" + tch_id + ", tch_nom=" + tch_nom + ", tch_description=" + tch_description + ", tch_status=" + tch_status + '}';
    }
}
