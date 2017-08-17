/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.dao;

import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsCollectionContaining.hasItem;
import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNull;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import tp1.modele.Tache;

import org.junit.Assert;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import static org.hamcrest.Matchers.isIn;
import static org.hamcrest.Matchers.isOneOf;
import static org.junit.Assert.assertThat;

import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
/**
 *
 * @author nobby
 */
public class TacheDAOImplTest {
    
    private Map<Tache, Integer> hashTache;
    
    public TacheDAOImplTest() {
    }
    
    @Test
    public void getTacheTestVrai() {
        TacheDAOImpl tacheDao = new TacheDAOImpl();
        hashTache = new HashMap<Tache, Integer>();
        Tache tache1 = new Tache(1, "tache1", "gla", "nouveau", 1);
        List<Tache> listeTache = tacheDao.addTache(tache1);
        Tache tache2 = tacheDao.getTache(0);//test getTache
        hashTache.put(tache2, 1);
        assertThat(hashTache, hasEntry(tache2, 1));
    }
    
    @Test
    public void getTacheTestFaux() {
        TacheDAOImpl tacheDao = new TacheDAOImpl();
        hashTache = new HashMap<Tache, Integer>();
        Tache tache1 = new Tache(1, "tache1", "gla", "nouveau", 1);
        Tache tache2 = new Tache(2, "tache2", "sma", "en progres", 2);
        List<Tache> listeTache = tacheDao.addTache(tache1);
        Tache tache = tacheDao.getTache(0);//test getTache
        hashTache.put(tache, 1);
        assertThat(hashTache, hasEntry(tache2, 1));
    }
    
    @Test
    public void addTacheTestVrai() {
        TacheDAOImpl tacheDao = new TacheDAOImpl();
        hashTache = new HashMap<Tache, Integer>();
        Tache tache1 = new Tache(1, "tache1", "gla", "nouveau", 1);
        List<Tache> listeTache = tacheDao.addTache(tache1);
        Tache tache2 = listeTache.get(0);
        hashTache.put(tache2, 1);
        assertThat(hashTache, hasEntry(tache2, 1));
    }
    
    @Test
    public void addTacheTestFaux() {
        TacheDAOImpl tacheDao = new TacheDAOImpl();
        hashTache = new HashMap<Tache, Integer>();
        Tache tache1 = new Tache(1, "tache1", "gla", "nouveau", 1);
        Tache tache2 = new Tache(2, "tache2", "sma", "en progres", 2);
        List<Tache> listeTache = tacheDao.addTache(tache1);
        Tache tache = listeTache.get(0);
        hashTache.put(tache, 1);
        assertThat(hashTache, hasEntry(tache2, 1));
    }
}
