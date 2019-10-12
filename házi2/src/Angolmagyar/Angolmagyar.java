/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Angolmagyar;

/**
 *
 * @author Kornél
 */
public class Angolmagyar {
    String angol;
    String magyar;

    public Angolmagyar(String angol, String magyar) {
        this.angol = angol;
        this.magyar = magyar;
    }

    public String getAngol() {
        return angol;
    }

    public String getMagyar() {
        return magyar;
    }

    public void setAngol(String angol) {
        this.angol = angol;
    }

    public void setMagyar(String magyar) {
        this.magyar = magyar;
    }

    @Override
    public String toString() {
        return angol + ":" + magyar;
    }

}
