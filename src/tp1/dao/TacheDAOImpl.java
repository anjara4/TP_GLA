/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.dao;

import java.util.LinkedList;
import java.util.List;
import tp1.modele.Tache;

/**
 *
 * @author nobby
 */
public class TacheDAOImpl implements TacheDAO {
    List<Tache> list_tache = new LinkedList();
    
    @Override
    public int getIndexeListTache(int tch_id){
        for(Tache tache : list_tache)  
            if(tache.getTch_id() == tch_id)
                return list_tache.indexOf(tache);
        return -1; 
    }
    
    @Override
    public List<Tache> addTache(Tache tache) {
        list_tache.add(new Tache(tache.getTch_id(), tache.getTch_nom(), tache.getTch_description(), tache.getTch_status(), tache.getMbr_id()));
        return list_tache; 
    }

    @Override
    public List<Tache> getAllTache() {
        return list_tache;
    }

    @Override
    public Tache getTache(int tch_id) {
        return list_tache.get(tch_id);
    }

    @Override
    public List<Tache> deleteTache(int tch_id) {
        int indexe = getIndexeListTache(tch_id);
        if(indexe != -1)
            list_tache.remove(indexe);
        return list_tache;
    }

    @Override
    public List<Tache> updateTache(int tch_id, Tache tache) {
        int indexe = getIndexeListTache(tch_id);
        if(indexe != -1)
            list_tache.set(indexe, tache);
        return list_tache;
    }

    @Override
    public List getIndexeListTache_IdMembre(int mbr_id) {
        List liste_indexe_membreId = new LinkedList();
        for(Tache tache : list_tache)  
            if(tache.getMbr_id() == mbr_id)
                liste_indexe_membreId.add(list_tache.indexOf(tache));
        return liste_indexe_membreId; 
    }

    @Override
    public List getIndexeListTache_Status(String tch_status) {
        List liste_indexe_status = new LinkedList();
        for(Tache tache : list_tache)  
            if(tache.getTch_status().equals(tch_status))
                liste_indexe_status.add(list_tache.indexOf(tache));
        return liste_indexe_status; 
    }
    
    @Override
    public List<Tache> getTacheIdMembre(int mbr_id) {
        List liste_indexe_IdMembre = new LinkedList();
        List<Tache> liste_IdMembre = new LinkedList();
        liste_indexe_IdMembre = getIndexeListTache_IdMembre(mbr_id);
        for(int i = 0; i < liste_indexe_IdMembre.size(); i++)
            liste_IdMembre.add(list_tache.get((int) liste_indexe_IdMembre.get(i)));
        return liste_IdMembre;
    }

    @Override
    public List<Tache> getTacheStatus(String tch_status) {
        List liste_indexe_status = new LinkedList();
        List<Tache> liste__status = new LinkedList();
        liste_indexe_status = getIndexeListTache_Status(tch_status);
        for(int i = 0; i < liste_indexe_status.size(); i++)
            liste__status.add(list_tache.get((int) liste_indexe_status.get(i)));
        return liste__status;
    }
}
