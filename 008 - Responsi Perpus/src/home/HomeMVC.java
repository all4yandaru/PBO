/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import about.AboutView;
import pinjam.PinjamView;
import tampil.TampilView;

/**
 *
 * @author Orenji
 */
public class HomeMVC {
    public HomeController controller ;
    public HomeView homeView;
    
    public HomeMVC() {
        this.homeView = new HomeView();
        AboutView aboutView = new AboutView();
        PinjamView pinjamView = new PinjamView();
        TampilView tampilView = new TampilView();
        HomeModel homeModel = new HomeModel();
        this.controller = new HomeController(homeView, aboutView, pinjamView, tampilView, homeModel);
    }
}
