/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1_genie_logicile;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import tp1.dao.MembreDAOImpl;
import tp1.dao.TacheDAOImpl;
import tp1.modele.Membre;
import tp1.modele.Tache;

/**
 *
 * @author nobby
 */
public class Tp1_genie_logicile {

    /**
     * @param args the command line arguments
     */

    /**
	 * Create the application.
	 */
	
    public static void main(String[] args) {
        // TODO code application logic here   
        //VARIABLE POUR TACHE
        TacheDAOImpl tacheDAO = new TacheDAOImpl();
        List<Tache> liste_tache = null;
        int tch_id = 0;
        String tch_nom = "";
        String tch_description = "";
        String tch_status = "";
        
        //VARIABLE POUR MEMBRE
        MembreDAOImpl membreDAO = new MembreDAOImpl();
        List<Membre> liste_membre = null;
        int mbr_id = 0;
        String mbr_nom = "";
        
        //VARIABLE POUR LES MENUS
        int choix_menu = 0;
        int choix_menu_mise_a_jour = 0;
        int choix_menu_recherche = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("*************************************");
        System.out.println("MENU PRINCIPALE GESTIONNAIRE DE TACHE");
        System.out.println("*************************************");
        System.out.println("SAISIR: 0 POUR QUITTER APPLICATION");
        System.out.println("SAISIR: 1 POUR AFFICHAGE TACHE");
        System.out.println("SAISIR: 2 POUR AFFICHAGE MEMBRE");
        System.out.println("*************************************");
        
        System.out.println("CHOIX (ENTIER 0-3):");
        choix_menu = sc.nextInt();

        if (choix_menu == 0)//QUITTER APPLICATION
            System.exit(0);
        
        if (choix_menu == 1){//MENU TACHE
            tacheDAO.addTache(new Tache(1, "tache1", "gla", "nouveau", 1));
            tacheDAO.addTache(new Tache(2, "tache2", "sma", "en progres", 2));
            tacheDAO.addTache(new Tache(3, "tache3", "francais", "termine", 2));
            tacheDAO.addTache(new Tache(4, "tache4", "anglais", "termine", 3));
            
            liste_tache = tacheDAO.getAllTache();
            for(Tache tache : liste_tache) 
                System.out.println("ID:" + tache.getTch_id() + " **NOM:" + tache.getTch_nom() + " **DESCRIPTION:" + tache.getTch_description() + " **STATUS:" + tache.getTch_status() + " **MEMBRE ID:" + tache.getMbr_id());
            System.out.println("*************************************");
            System.out.println("MENU DE MISE A JOUR DE TACHE");
            System.out.println("*************************************");
            System.out.println("SAISIR: 0 POUR QUITTER APPLICATION");
            System.out.println("SAISIR: 1 POUR ASSIGNER TACHE");
            System.out.println("SAISIR: 2 POUR MODIFIER TACHE");
            System.out.println("SAISIR: 3 POUR SUPPRIMER TACHE");
            System.out.println("SAISIR: 4 POUR RECHERCHE TACHE");
            System.out.println("*************************************");
            System.out.println("CHOIX (ENTIER 0-4):");
            choix_menu_mise_a_jour = sc.nextInt();     
            
            switch (choix_menu_mise_a_jour) {
                case 0:// QUITTER APPLICATION
                    System.exit(0);

                case 1:// AJOUTER TACHE
                    System.out.println("*********************************");
                    System.out.println("MENU ASSIGNATION TACHE");
                    System.out.println("*********************************");
                    System.out.println("SAISIR ID (ENTIER):");
                    tch_id = sc.nextInt();
                    System.out.println("SAISIR NOM:");
                    tch_nom = sc.next();
                    System.out.println("SAISIR DESCRIPTION:");
                    tch_description = sc.next();
                    System.out.println("SAISIR STATUS (nouveau, en progres, termine):");
                    tch_status = sc.next();
                    System.out.println("SAISIR MEMBRE ID (ENTIER):");
                    mbr_id = sc.nextInt();
                        
                    
                    liste_tache = tacheDAO.addTache(new Tache(tch_id, tch_nom, tch_description, tch_status, mbr_id));
                    for(Tache tache : liste_tache) 
                        System.out.println("ID:" + tache.getTch_id() + " **NOM:" + tache.getTch_nom() + " **DESCRIPTION:" + tache.getTch_description() + " **STATUS:" + tache.getTch_status() + " **MEMBRE ID:" + tache.getMbr_id());
                    break;

                case 2:// MODIFIER TACHE
                    System.out.println("*********************************");
                    System.out.println("MENU MODIFIER TACHE");
                    System.out.println("*********************************");
                    System.out.println("SAISIR ID ELEMENT A MODIFIER (ENTIER):");
                    tch_id = sc.nextInt();
                    System.out.println("SAISIR NOUVEAU NOM:");
                    tch_nom = sc.next();
                    System.out.println("SAISIR NOUVEAU DESCRIPTION:");
                    tch_description = sc.next();
                    System.out.println("SAISIR NOUVEAU STATUS:");
                    tch_status = sc.next();
                    System.out.println("SAISIR NOUVEAU ID MEMBRE (ENTIER):");
                    mbr_id = sc.nextInt();
                    liste_tache = tacheDAO.updateTache(tch_id, new Tache(tch_id, tch_nom, tch_description, tch_status, mbr_id));
                    for(Tache tache : liste_tache) 
                        System.out.println("ID:" + tache.getTch_id() + " **NOM:" + tache.getTch_nom() + " **DESCRIPTION:" + tache.getTch_description() + " **STATUS:" + tache.getTch_status() + " **MEMBRE ID:" + tache.getMbr_id());
                    break;

                case 3:// SUPPRIMER TACHE
                    System.out.println("*********************************");
                    System.out.println("MENU SUPPRIMER TACHE");
                    System.out.println("*********************************");
                    System.out.println("SAISIR ID ELEMENT A SUPPRIMER (ENTIER):");
                    tch_id = sc.nextInt();
                    liste_tache = tacheDAO.deleteTache(tch_id);
                    for(Tache tache : liste_tache) 
                        System.out.println("ID:" + tache.getTch_id() + " **NOM:" + tache.getTch_nom() + " **DESCRIPTION:" + tache.getTch_description() + " **STATUS:" + tache.getTch_status() + " **MEMBRE ID:" + tache.getMbr_id());
                    break;

                case 4:// RECHERCHE TACHE
                    System.out.println("*********************************");
                    System.out.println("MENU RECHERCHE TACHE");
                    System.out.println("*********************************");
                    System.out.println("SAISIR 0 ANNULER ET QUITTER APPLICATION");
                    System.out.println("SAISIR 1 RECHERCHE PAR ID MEMBRE");
                    System.out.println("SAISIR 2 RECHERCHE PAR STATUS");
                    System.out.println("CHOIX (ENTIER 0-2):");
                    choix_menu_recherche = sc.nextInt();
                    
                    
                    switch (choix_menu_recherche) {
                        case 0:// ANNULER ET QUITTER APPLICATION
                            System.exit(0);

                        case 1:// RECHERCHE PAR ID MEMBRE
                            System.out.println("SAISIR ID MEMBRE (ENTIER):");
                            mbr_id = sc.nextInt();
                            List liste = new LinkedList();
                            liste_tache = tacheDAO.getTacheIdMembre(mbr_id);
                            if(liste_tache.size() == 0)
                                System.out.println("ID MEMBRE PAS PRESENT DANS LA LISTE");
                            else
                                for(Tache tache : liste_tache) 
                                    System.out.println("ID:" + tache.getTch_id() + " **NOM:" + tache.getTch_nom() + " **DESCRIPTION:" + tache.getTch_description() + " **ID MEMBRE:" + tache.getMbr_id());
                            break;

                        case 2:// RECHERCHE PAR STATUS
                            System.out.println("SAISIR STATUS (nouveau, en progres, termine):");
                            tch_status = sc.next();
                            liste_tache = tacheDAO.getTacheStatus(tch_status);
                            if(liste_tache.size() == 0)
                                System.out.println("STATUS PAS PRESENT DANS LA LISTE");
                            else
                                for(Tache tache : liste_tache) 
                                    System.out.println("ID:" + tache.getTch_id() + " **NOM:" + tache.getTch_nom() + " **DESCRIPTION:" + tache.getTch_description() + " **ID MEMBRE:" + tache.getMbr_id());
                            break;

                        default:// Code
                            for(Tache tache : liste_tache) 
                                System.out.println("ID:" + tache.getTch_id() + " **NOM:" + tache.getTch_nom() + " **DESCRIPTION:" + tache.getTch_description() + " **STATUS:" + tache.getTch_status() + " **MEMBRE ID:" + tache.getMbr_id());
                            break;
                    }
                    break;

                default:// LISTER TACHE
                    for(Tache tache : liste_tache) 
                        System.out.println("ID:" + tache.getTch_id() + " **NOM:" + tache.getTch_nom() + " **DESCRIPTION:" + tache.getTch_description() + " **STATUS:" + tache.getTch_status() + " **MEMBRE ID:" + tache.getMbr_id());
                    break;
            }
        }if (choix_menu == 2){//MENU MEMBRE
            membreDAO.addMembre(new Membre(1, "nobby"));
            membreDAO.addMembre(new Membre(2, "anjara"));
            membreDAO.addMembre(new Membre(3, "paul"));
            membreDAO.addMembre(new Membre(4, "cristian"));
            membreDAO.addMembre(new Membre(5, "nobby"));
            
            liste_membre = membreDAO.getAllMembre();
            for(Membre membre : liste_membre) 
                System.out.println("ID:" + membre.getMbrId() + " **NOM:" + membre.getMbrNom());
            
            System.out.println("*************************************");
            System.out.println("MENU DE MISE A JOUR DE MEMBRE");
            System.out.println("*************************************");
            System.out.println("SAISIR: 0 POUR QUITTER APPLICATION");
            System.out.println("SAISIR: 1 POUR AJOUTER MEMBRE");
            System.out.println("SAISIR: 2 POUR MODIFIER MEMBRE");
            System.out.println("SAISIR: 3 POUR SUPPRIMER MEMBRE");
            System.out.println("SAISIR: 4 POUR RECHERCHE MEMBRE");
            System.out.println("*************************************");
            System.out.println("CHOIX (ENTIER 0-4):");
            choix_menu_mise_a_jour = sc.nextInt();
            switch (choix_menu_mise_a_jour) {
                case 0:// QUITTER APPLICATION
                    System.exit(0);

                case 1:// AJOUTER MEMBRE
                    System.out.println("*********************************");
                    System.out.println("MENU AJOUTER MEMBRE");
                    System.out.println("*********************************");
                    System.out.println("SAISIR ID (ENTIER):");
                    mbr_id = sc.nextInt();
                    System.out.println("SAISIR NOM:");
                    mbr_nom = sc.next();

                    liste_membre = membreDAO.addMembre(new Membre(mbr_id, mbr_nom));
                    for(Membre membre : liste_membre) 
                        System.out.println("ID:" + membre.getMbrId() + " **NOM:" + membre.getMbrNom());
                    break;

                case 2:// MODIFIER MEMBRE
                    System.out.println("*********************************");
                    System.out.println("MENU MODIFIER MEMBRE");
                    System.out.println("*********************************");
                    System.out.println("SAISIR ID ELEMENT A MODIFIER (ENTIER):");
                    mbr_id = sc.nextInt();
                    System.out.println("SAISIR NOUVEAU NOM:");
                    mbr_nom = sc.next();

                    liste_membre = membreDAO.updateMembre(mbr_id, new Membre(mbr_id, mbr_nom));
                    for(Membre membre : liste_membre) 
                        System.out.println("ID:" + membre.getMbrId() + " **NOM:" + membre.getMbrNom());
                    break;

                case 3:// SUPPRIMER MEMBRE
                    System.out.println("*********************************");
                    System.out.println("MENU SUPPRIMER MEMBRE");
                    System.out.println("*********************************");
                    System.out.println("SAISIR ID ELEMENT A SUPPRIMER (ENTIER):");
                    mbr_id = sc.nextInt();
                    liste_membre = membreDAO.deleteMembre(mbr_id);
                    for(Membre membre : liste_membre) 
                        System.out.println("ID:" + membre.getMbrId() + " **NOM:" + membre.getMbrNom());
                    break;

                case 4:// RECHERCHE MEMBRE
                    System.out.println("*********************************");
                    System.out.println("MENU RECHERCHE MEMBRE");
                    System.out.println("*********************************");
                    System.out.println("SAISIR NOM A RECHERCHE:");
                    mbr_nom = sc.next();
                    liste_membre = membreDAO.getMembreNom(mbr_nom);
                    if(liste_membre.size() == 0)
                        System.out.println("NOM PAS PRESENT DANS LA LISTE");
                    else
                        for(Membre membre : liste_membre) 
                            System.out.println("ID:" + membre.getMbrId() + " **NOM:" + membre.getMbrNom());
                    break;
                    
                default:// LISTER MEMBRE
                    liste_membre = membreDAO.addMembre(new Membre(mbr_id, mbr_nom));
                    for(Membre membre : liste_membre) 
                        System.out.println("ID:" + membre.getMbrId() + " **NOM:" + membre.getMbrNom());
                    break;
            }
        }
        
    }
    
}
