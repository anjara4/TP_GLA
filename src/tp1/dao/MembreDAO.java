/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.dao;

import java.util.List;
import tp1.modele.Membre;

/**
 *
 * @author nobby
 */
public interface MembreDAO {
    public List<Membre> addMembre(Membre membre);

    public int getIndexeListMembreId(int mbr_id);
    
    public List getIndexeListMembreNom(String mbr_nom);
    
    public List<Membre> getAllMembre();
    
    public Membre getMembreId(int mbr_id);
    
    public List<Membre> getMembreNom(String mbr_nom);

    public List<Membre> deleteMembre(int mbr_id);

    public List<Membre> updateMembre(int mbr_id, Membre membre);
}
