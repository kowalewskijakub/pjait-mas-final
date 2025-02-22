package com.github.bredecorne.masp;

import com.github.bredecorne.masp.model.Address;
import com.github.bredecorne.masp.model.Country;
import com.github.bredecorne.masp.model.TaxOffice;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;

import java.io.IOException;

public class Application extends javafx.application.Application {
    public static void main(String[] args) {
        populateWithRandomData();
        launch();
    }

    private static void populateWithRandomData() {
        var taxOffice1 = new TaxOffice("Urząd Skarbowy nr 1 w Lipinkach-Łużyckich");
        var taxOffice2 = new TaxOffice("Urząd Skarbowy nr 2 dla Rzeszów-Półudnie w Rzeszowie");
        var taxOffice3 = new TaxOffice("Urząd Skarbowy w Białymstoku-Centrum");
        var taxOffice4 = new TaxOffice("I Urząd Skarbowy w Gdańsku");
        var taxOffice5 = new TaxOffice("Urząd Skarbowy w Krakowie-Śródmieście");
        var taxOffice6 = new TaxOffice("II Urząd Skarbowy w Lublinie");
        var taxOffice7 = new TaxOffice("Urząd Skarbowy w Łodzi-Śródmieście");
        var taxOffice8 = new TaxOffice("Urząd Skarbowy w Poznaniu-Jeżyce");
        var taxOffice9 = new TaxOffice("Urząd Skarbowy w Szczecinie-Prawobrzeże");
        var taxOffice10 = new TaxOffice("Urząd Skarbowy we Wrocławiu-Stare Miasto");
        var taxOffice11 = new TaxOffice("I Urząd Skarbowy Warszawa-Wola");
        var taxOffice12 = new TaxOffice("II Urząd Skarbowy Warszawa-Śródmieście");
        var taxOffice13 = new TaxOffice("Urząd Skarbowy w Gdyni");
        var taxOffice14 = new TaxOffice("Urząd Skarbowy w Katowicach-Panewniki");
        var taxOffice15 = new TaxOffice("Urząd Skarbowy w Sosnowcu");
        var taxOffice16 = new TaxOffice("Urząd Skarbowy w Opolu");
        var taxOffice17 = new TaxOffice("Urząd Skarbowy w Rzeszowie-Śródmieście");
        var taxOffice18 = new TaxOffice("Urząd Skarbowy w Zielonej Górze");
        var taxOffice19 = new TaxOffice("Urząd Skarbowy w Wałbrzychu");
        var taxOffice20 = new TaxOffice("Urząd Skarbowy w Toruniu");
        var address1 = new Address(Country.PL, "Katowice", "Urzędowa", "1A", "4");
        var address2 = new Address(Country.DE, "Dresden", "Warszawska", "13", "22");
        var address4 = new Address(Country.DE, "Bonn", "Mickiewicza", "3", "10");
        var address6 = new Address(Country.SK, "Jamnik Słowacki", "Słowackiego", "1", "45");
        var address8 = new Address(Country.PL, "Rubaszów Śląski", "Grzybowska", "32", "17");
        var address10 = new Address(Country.PL, "Katowice", "Puławska", "123", "4A");
        var address12 = new Address(Country.SK, "Ołomuniec", "Rynek", "7A", "2");
        var address14 = new Address(Country.PL, "Katowice", "Krakowskie Przedmieście", "24", "53");
        var address16 = new Address(Country.PL, "Katowice", "Marszałkowska", "100", "1A");
        taxOffice1.addAddress(address1);
        taxOffice1.addAddress(address2);
        taxOffice3.addAddress(address1);
        taxOffice3.addAddress(address2);
        taxOffice3.addAddress(address4);
        taxOffice3.addAddress(address6);
        taxOffice3.addAddress(address8);
        taxOffice4.addAddress(address2);
        taxOffice5.addAddress(address4);
        taxOffice6.addAddress(address6);
        taxOffice7.addAddress(address8);
        taxOffice8.addAddress(address10);
        taxOffice9.addAddress(address12);
        taxOffice10.addAddress(address14);
        taxOffice11.addAddress(address16);
        taxOffice4.addAddress(address2);
        taxOffice5.addAddress(address4);
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("tax-office-change-address.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 1200, 800);
        stage.setTitle("TaxMate");

        stage.setScene(scene);
        stage.setMinHeight(600); // Określa minimalną wielkość okna
        stage.setMinWidth(1000); // Określa maksymalną wielkość okna

        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
        stage.show();

    }
}