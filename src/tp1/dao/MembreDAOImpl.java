/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.dao;

import java.util.LinkedList;
import java.util.List;
import tp1.modele.Membre;

/**
 *
 * @author nobby
 */
public class MembreDAOImpl implements MembreDAO  {
    List<Membre> list_membre = new LinkedList();
    
    @Override
    public List<Membre> addMembre(Membre membre) {
        list_membre.add(new Membre(membre.getMbrId(), membre.getMbrNom()));
        return list_membre; 
    }

    @Override
    public int getIndexeListMembreId(int mbr_id) {
        for(Membre membre : list_membre)  
            if(membre.getMbrId() == mbr_id)
                return list_membre.indexOf(membre);
        return -1; 
    }

    @Override
    public List<Membre> getAllMembre() {
        return list_membre;
    }

    @Override
    public Membre getMembreId(int mbr_id) {
        return list_membre.get(getIndexeListMembreId(mbr_id));
    }

    @Override
    public List<Membre> deleteMembre(int mbr_id) {
        int indexe = getIndexeListMembreId(mbr_id);
        if(indexe != -1)
            list_membre.remove(indexe);
        return list_membre;
    }

    @Override
    public List<Membre> updateMembre(int mbr_id, Membre membre) {
        int indexe = getIndexeListMembreId(mbr_id);
        if(indexe != -1)
            list_membre.set(indexe, membre);
        return list_membre;
    }

    @Override
    public List getIndexeListMembreNom(String mbr_nom) {
        List liste_indexe_nom = new LinkedList();
        for(Membre membre : list_membre)  
            if(membre.getMbrNom().equals(mbr_nom))
                liste_indexe_nom.add(list_membre.indexOf(membre));
        return liste_indexe_nom; 
    }

    @Override
    public List<Membre> getMembreNom(String mbr_nom) {
        List liste_indexe_nom = new LinkedList();
        List<Membre> liste__nom = new LinkedList();
        liste_indexe_nom = getIndexeListMembreNom(mbr_nom);
        for(int i = 0; i < liste_indexe_nom.size(); i++)
            liste__nom.add(list_membre.get((int) liste_indexe_nom.get(i)));
        return liste__nom;
    }   
}
