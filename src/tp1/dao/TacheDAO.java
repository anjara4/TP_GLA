/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.dao;

import java.util.List;
import tp1.modele.Tache;


/**
 *
 * @author nobby
 */
public interface TacheDAO {
    public List<Tache> addTache(Tache tache);

    public int getIndexeListTache(int tch_id);
    
    public List<Tache> getAllTache();
    
    public Tache getTache(int tch_id);

    public List<Tache> deleteTache(int tch_id);

    public List<Tache> updateTache(int tch_id, Tache tache);
    
    public List<Tache> getTacheIdMembre(int mbr_id);
    
    public List<Tache> getTacheStatus(String tch_status);
    
    public List getIndexeListTache_IdMembre(int mbr_id);
    
    public List getIndexeListTache_Status(String tch_status);
}
