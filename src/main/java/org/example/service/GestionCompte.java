package org.example.service;

import org.example.metier.Compte;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;


@WebService
public class GestionCompte {
    private final List<Compte> comptes = new ArrayList<>();
    public double Conversion(float Montant) {
        return  Montant*3.5;
    }
    @WebMethod
    public String CreaetionCompte(int Code,String prop){
        Compte c1=new Compte(Code,prop);
        //Compte c2=new Compte(2,"ahmed",100);
        comptes.add(c1);
        //comptes.add(c2);
        return "Compte created with succes";
    }
    @WebMethod
    public List<Compte> ListeCompte() {
        return comptes;
    }
}
