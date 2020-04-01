package facade;


import static org.junit.Assert.*;

import facade.exceptions.InformationsSaisiesIncoherentesException;
import facade.exceptions.UtilisateurDejaConnecteException;
import org.junit.*;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.function.Supplier;

public abstract class FacadeParisTest {
    private FacadeParis facadeParis;
    private Supplier<FacadeParis> fabrique;

    @Before
    public void setUp() throws Exception {
        facadeParis = fabrique.get();
    }

    public void specialDedicaceYo(Supplier<FacadeParis> fabrique) {
        this.fabrique = fabrique;
    }

    @Test
    public void connexionOK() throws InformationsSaisiesIncoherentesException, UtilisateurDejaConnecteException {
        facadeParis.connexion("fred","fred");
    }

    @Test(expected = InformationsSaisiesIncoherentesException.class)
    public void connexionKO1() throws InformationsSaisiesIncoherentesException, UtilisateurDejaConnecteException {
        facadeParis.connexion("abc","abc");
    }

    @Test(expected = UtilisateurDejaConnecteException.class)
    public void connexionKO2() throws InformationsSaisiesIncoherentesException, UtilisateurDejaConnecteException {
        facadeParis.connexion("fred","fred");
        facadeParis.connexion("fred","fred");
    }

    @org.junit.Test
    public void getMatchsPasCommences() {
    }

    @org.junit.Test
    public void parier() {
    }

    @org.junit.Test
    public void annulerPari() {
    }

    @org.junit.Test
    public void getMesParis() {
    }

    @org.junit.Test
    public void ajouterMatch() {
    }

    @org.junit.Test
    public void resultatMatch() {
    }

    @org.junit.Test
    public void deconnexion() {
    }

    @org.junit.Test
    public void getAllParis() {
    }

    @org.junit.Test
    public void getMatch() {
    }

    @org.junit.Test
    public void getPari() {
    }

    @org.junit.Test
    public void getAllMatchs() {
    }
}
