package org.carlook.services.db.exampleData;

import org.carlook.controller.exception.DatabaseException;
import org.carlook.factories.DTOFactory;
import org.carlook.factories.Factories;
import org.carlook.model.dao.FahrzeugDAO;
import org.carlook.model.dao.UserDAO;
import org.carlook.model.objects.dto.ReservationDTO;
import org.carlook.model.objects.dto.UserDTO;
import org.carlook.model.objects.entities.Fahrzeug;
import org.carlook.model.objects.entities.Kunde;
import org.carlook.services.util.Parameter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListSupplier {

    public static class UserData {

        private static List<UserDTO> dataList = null;

        public static List<UserDTO> getList() {
            List<UserDTO> list = dataList;
            if (dataList == null) {
                list = new ArrayList<>();
                list.add(DTOFactory.createNewUserDTO().setVorname("Kata").setNachname("Cadge").setEmail("kcadge0@blogtalkradio.com").setPassword("yWOW3U2"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Calley").setNachname("Fernier").setEmail("cfernier1@nba.com").setPassword("Fk5rA1J8kfV"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Trey").setNachname("Yendle").setEmail("tyendle2@macromedia.com").setPassword("UMq8X"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Sabina").setNachname("Moubray").setEmail("smoubray3@archive.org").setPassword("Wmjpa2SSo"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Linn").setNachname("Instock").setEmail("linstock4@apache.org").setPassword("nB4QYEnmvo"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Ives").setNachname("Embling").setEmail("iembling5@nps.gov").setPassword("SUIiWHV"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Edgard").setNachname("Bussetti").setEmail("ebussetti6@mapy.cz").setPassword("4JPZFwg"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Mei").setNachname("Carus").setEmail("mcarus7@whitehouse.gov").setPassword("h5dSnuEhKF"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Kittie").setNachname("Bentjens").setEmail("kbentjens8@soup.io").setPassword("I6Qar6Dgl"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Mildrid").setNachname("Daubney").setEmail("mdaubney9@infoseek.co.jp").setPassword("kRXdROC9467"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Neall").setNachname("Wahlberg").setEmail("nwahlberga@mediafire.com").setPassword("G5GLG"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Anica").setNachname("Jewers").setEmail("ajewersb@weather.com").setPassword("XfrEY4dJz"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Francyne").setNachname("Kristufek").setEmail("fkristufekc@tiny.cc").setPassword("nWREOYyYmt"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Rochelle").setNachname("Poure").setEmail("rpoured@loc.gov").setPassword("FMyfTx"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Truda").setNachname("Boulsher").setEmail("tboulshere@infoseek.co.jp").setPassword("BSrhnKz"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Puff").setNachname("Sanja").setEmail("psanjaf@mapy.cz").setPassword("h7bnMU"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Crawford").setNachname("Jancik").setEmail("cjancikg@istockphoto.com").setPassword("2SUzfJoK"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Julie").setNachname("Van Hesteren").setEmail("jvanhesterenh@blogs.com").setPassword("utqUSCYRzC0"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Ninon").setNachname("Giacopini").setEmail("ngiacopinii@columbia.edu").setPassword("7RfpY6ty"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Katie").setNachname("Willavize").setEmail("kwillavizej@japanpost.jp").setPassword("ASYFOfOpX"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Pooh").setNachname("Dryden").setEmail("pdrydenk@smh.com.au").setPassword("f05RCQxE"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Northrup").setNachname("Mogenot").setEmail("nmogenotl@behance.net").setPassword("FQKiL9fA"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Nan").setNachname("Durrad").setEmail("ndurradm@google.com.au").setPassword("31qz4yYH"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Ivor").setNachname("Trowell").setEmail("itrowelln@cyberchimps.com").setPassword("5Q3nvBw"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Timofei").setNachname("Aspland").setEmail("tasplando@howstuffworks.com").setPassword("Eob8szsQJwO"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Breena").setNachname("Stairs").setEmail("bstairsp@github.io").setPassword("OBa8YfZ"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Kikelia").setNachname("Gallandre").setEmail("kgallandreq@joomla.org").setPassword("pHo9lL"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Orrin").setNachname("Royle").setEmail("oroyler@admin.ch").setPassword("kgTAEkx21"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Lanette").setNachname("Lammie").setEmail("llammies@amazon.co.uk").setPassword("WELPAgKEK4a"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Amandy").setNachname("Andree").setEmail("aandreet@istockphoto.com").setPassword("HidbL"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Ellsworth").setNachname("Fosberry").setEmail("efosberryu@github.com").setPassword("vKcg2trd45i"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Lars").setNachname("Rubbert").setEmail("lrubbertv@cloudflare.com").setPassword("taxLa"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Ricoriki").setNachname("Vuittet").setEmail("rvuittetw@businessweek.com").setPassword("7ATcA8tzF6"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Solomon").setNachname("Cowdray").setEmail("scowdrayx@bloomberg.com").setPassword("keSfxQJ"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Niall").setNachname("Portlock").setEmail("nportlocky@g.co").setPassword("RNVPG"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Heindrick").setNachname("Rickcord").setEmail("hrickcordz@blogs.com").setPassword("SuTbmEEDF"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Cooper").setNachname("Zanre").setEmail("czanre10@arizona.edu").setPassword("cZQfx92CbI"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Merralee").setNachname("Gibben").setEmail("mgibben11@rambler.ru").setPassword("IDGINndFowb"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Roderick").setNachname("Doyland").setEmail("rdoyland12@posterous.com").setPassword("c0B3mZf236j"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Ham").setNachname("Huckle").setEmail("hhuckle13@chicagotribune.com").setPassword("Fj3Mf"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Olivia").setNachname("Wade").setEmail("owade14@scribd.com").setPassword("a1azKOPLv6"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Ginelle").setNachname("Vain").setEmail("gvain15@ocn.ne.jp").setPassword("3q9Wg"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Laurella").setNachname("Bischop").setEmail("lbischop16@tripadvisor.com").setPassword("xcHvKZdlzD"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Suzann").setNachname("Coe").setEmail("scoe17@auda.org.au").setPassword("FpKirI25kN"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Jameson").setNachname("Walaron").setEmail("jwalaron18@51.la").setPassword("vtI7jF93ODY"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Adena").setNachname("Cancelier").setEmail("acancelier19@apple.com").setPassword("esIrv2E2y1"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Darnall").setNachname("Lafaye").setEmail("dlafaye1a@wordpress.org").setPassword("E1jhOa"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Costa").setNachname("Paulig").setEmail("cpaulig1b@cyberchimps.com").setPassword("0GoxQX"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Vivianna").setNachname("Mardlin").setEmail("vmardlin1c@cam.ac.uk").setPassword("paxvbl"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Archy").setNachname("Ellsbury").setEmail("aellsbury1d@bizjournals.com").setPassword("LVvqhK1gP"));

                // Vertriebler
                list.add(DTOFactory.createNewUserDTO().setVorname("Rafaelita").setNachname("Snartt").setEmail("rafaelita.snartt" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("463xtqPiOE"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Philly").setNachname("Warratt").setEmail("philly.warratt" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("3aeVurH"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Gerry").setNachname("Burgne").setEmail("gerry.burgne" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("LTE9H0"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Yorker").setNachname("Lauks").setEmail("yorker.lauks" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("UeUIoe8K"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Cozmo").setNachname("Cotman").setEmail("cozmo.cotman" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("77h7jRNgMK8d"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Dallis").setNachname("Swinn").setEmail("dallis.swinn" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("c4XuioOy1"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Elenore").setNachname("Armer").setEmail("elenore.armer" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("hlnb72hER"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Dorie").setNachname("Flukes").setEmail("dorie.flukes" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("If862GQVp737"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Gabriela").setNachname("Trimming").setEmail("gabriela.trimming" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("RrB8GBOsnK"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Carson").setNachname("Ellse").setEmail("carson.ellse" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("zOQYJhUb"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Jessy").setNachname("Defty").setEmail("jessy.defty" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("l0RViAFIG"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Chickie").setNachname("Margetts").setEmail("chickie.margetts" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("ZCTN2mz3"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Hershel").setNachname("Champneys").setEmail("hershel.champneys" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("699IRccKn"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Susana").setNachname("Kubacek").setEmail("susana.kubacek" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("C6P523m"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Victoria").setNachname("McVittie").setEmail("victoria.mcvittie" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("BPuZxt0zz"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Claudian").setNachname("Rubert").setEmail("claudian.rubert" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("el2bqE8rAV"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Erie").setNachname("Bare").setEmail("erie.bare" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("ZSYDNsgAWfmS"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Lira").setNachname("Penreth").setEmail("lira.penreth" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("T1moWVJ"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Orlando").setNachname("Luck").setEmail("orlando.luck" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("W6CasQK1O"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Mickey").setNachname("Shoubridge").setEmail("mickey.shoubridge" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("ecFyMMmGg6"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Isak").setNachname("Pilger").setEmail("isak.pilger" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("flfcbC"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Xaviera").setNachname("Gellibrand").setEmail("xaviera.gellibrand" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("bLTYdYVyP3"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Tim").setNachname("Koubek").setEmail("tim.koubek" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("7RIQexxVy"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Eryn").setNachname("Autin").setEmail("eryn.autin" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("2Vi1uSsZ5N"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Saxon").setNachname("Fanner").setEmail("saxon.fanner" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("bIa6PKbf"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Mireielle").setNachname("Rafferty").setEmail("mireielle.rafferty" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("sDLMJh5xe4"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Berkly").setNachname("Titterton").setEmail("berkly.titterton" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("vXR8Ipwud"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Menard").setNachname("Ruilton").setEmail("menard.ruilton" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("tvP7AtROFIb"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Kim").setNachname("Danbye").setEmail("kim.danbye" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("jAM8qz4"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Vinny").setNachname("Quelch").setEmail("vinny.quelch" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("9LB81X"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Northrop").setNachname("Fryers").setEmail("northrop.fryers" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("o95H3uJuKRR"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Niko").setNachname("Bulle").setEmail("niko.bulle" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("AH1jOfOXB"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Marylin").setNachname("Orteaux").setEmail("marylin.orteaux" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("Bo93i4Cmdv"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Jasen").setNachname("Chinnick").setEmail("jasen.chinnick" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("xbCw3P4J"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Susy").setNachname("Trunkfield").setEmail("susy.trunkfield" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("EzH9nH"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Deerdre").setNachname("Prendiville").setEmail("deerdre.prendiville" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("sOnOjut"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Cortney").setNachname("Currell").setEmail("cortney.currell" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("Uw3lomHlHKVd"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Terence").setNachname("Koschek").setEmail("terence.koschek" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("CWDNEzQiSW"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Noelani").setNachname("Ferreiro").setEmail("noelani.ferreiro" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("bZmaS6bImv"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Stephana").setNachname("Pattini").setEmail("stephana.pattini" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("rSC8hr"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Zita").setNachname("MacKeogh").setEmail("zita.mackeogh" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("iIeRwI"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Minda").setNachname("Clardge").setEmail("minda.clardge" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("g6SM2g2X5"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Melisent").setNachname("Moyse").setEmail("melisent.moyse" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("ettzpK1f"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Cornell").setNachname("Stanyon").setEmail("cornell.stanyon" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("JyCLjSIu9"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Eveleen").setNachname("Temporal").setEmail("eveleen.temporal" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("fuaqgvdY"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Eward").setNachname("Breem").setEmail("eward.breem" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("3dXGPumsqzgg"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Hermy").setNachname("Richford").setEmail("hermy.richford" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("ADIlP1Y0TDd"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Todd").setNachname("Bluett").setEmail("todd.bluett" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("8dQm6V"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Christiano").setNachname("Nuzzetti").setEmail("christiano.nuzzetti" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("xCoIz31"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Fritz").setNachname("Borris").setEmail("fritz.borris" + Parameter.COMPANY_MAIL_ADDRESS).setPassword("9YZV63"));

                dataList = list;
            }

            return list;
        }
    }

    public static class FahrzeugData {
        private static List<Fahrzeug> dataList = null;

        public static List<Fahrzeug> getList() {
            List<Fahrzeug> list = dataList;
            if (dataList == null) {
                list = new ArrayList<>();
                list.add(Factories.createNewFahrzeug().setHersteller("Dodge").setBeschreibung("begehrt!").setKraftstoff("Elektro").setBaujahr(2020).setModell("Accord").setFahrgestellnummer("WAUDF68E35A059612").setVertriebler(93).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Hyundai").setBeschreibung("gutes Entetainment-System").setKraftstoff("Benzin").setBaujahr(2020).setModell("CR-X").setFahrgestellnummer("2G61N5S33D9234013").setVertriebler(70).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Nissan").setBeschreibung("gutes Entetainment-System").setKraftstoff("Elektro").setBaujahr(2018).setModell("CR-X").setFahrgestellnummer("WAUJGAFC7DN055624").setVertriebler(80).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mazda").setBeschreibung("Gepflegtes Auto").setKraftstoff("Diesel").setBaujahr(2017).setModell("Inspire").setFahrgestellnummer("WAUDGAFL7DA456952").setVertriebler(68).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("GMC").setBeschreibung("mit Klimaautomatik").setKraftstoff("Gas").setBaujahr(2017).setModell("NSX").setFahrgestellnummer("WBAYF4C59DD955505").setVertriebler(70).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Chevrolet").setBeschreibung("Geil!").setKraftstoff("Gas").setBaujahr(2020).setModell("Fit Aria").setFahrgestellnummer("19XFB2E51DE298124").setVertriebler(70).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("BMW").setBeschreibung("Geil!").setKraftstoff("Elektro").setBaujahr(2017).setModell("Fit Aria").setFahrgestellnummer("WVGEP9BP7FD441797").setVertriebler(87).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mercury").setBeschreibung("begehrt!").setKraftstoff("Gas").setBaujahr(2020).setModell("Avancier").setFahrgestellnummer("3C63D2JL6CG829765").setVertriebler(60).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mercedes-Benz").setBeschreibung("Confort-Ausstattung").setKraftstoff("Gas").setBaujahr(2020).setModell("Rafaga").setFahrgestellnummer("WA1VMBFE2ED840879").setVertriebler(78).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Buick").setBeschreibung("unfallfrei mit vielen Extra").setKraftstoff("Elektro").setBaujahr(2020).setModell("CR-X").setFahrgestellnummer("1G6DK5EG1A0741602").setVertriebler(69).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Aston Martin").setBeschreibung("Gepflegtes Auto").setKraftstoff("Elektro").setBaujahr(2018).setModell("Fit Aria").setFahrgestellnummer("1FTEX1CM8DF220654").setVertriebler(88).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Volvo").setBeschreibung("unfallfrei mit vielen Extra").setKraftstoff("Benzin").setBaujahr(2020).setModell("Inspire").setFahrgestellnummer("WAUFGBFC8DN768673").setVertriebler(75).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("MINI").setBeschreibung("mit Kindersitz").setKraftstoff("Elektro").setBaujahr(2018).setModell("City").setFahrgestellnummer("JN1BY1AR4EM714835").setVertriebler(60).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Pontiac").setBeschreibung("mit Klimaautomatik").setKraftstoff("Diesel").setBaujahr(2019).setModell("HR-V").setFahrgestellnummer("WBAKG7C58DJ405184").setVertriebler(89).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Lexus").setBeschreibung("Gepflegtes Auto").setKraftstoff("Elektro").setBaujahr(2020).setModell("City").setFahrgestellnummer("JN8AZ1FY1DW504092").setVertriebler(61).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Aston Martin").setBeschreibung("gutes Entetainment-System").setKraftstoff("Elektro").setBaujahr(2019).setModell("Ascot").setFahrgestellnummer("JH4NA12662T206577").setVertriebler(69).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Hummer").setBeschreibung("mit Kindersitz").setKraftstoff("Elektro").setBaujahr(2017).setModell("CR-V").setFahrgestellnummer("3VW4A7AT0DM445533").setVertriebler(68).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mitsubishi").setBeschreibung("unfallfrei mit vielen Extra").setKraftstoff("Elektro").setBaujahr(2018).setModell("Capa").setFahrgestellnummer("SALSF2D44DA150072").setVertriebler(56).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mazda").setBeschreibung("Gepflegtes Auto").setKraftstoff("Diesel").setBaujahr(2020).setModell("Insight").setFahrgestellnummer("3D7JB1ET7BG117991").setVertriebler(100).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Infiniti").setBeschreibung("Gepflegtes Auto").setKraftstoff("Diesel").setBaujahr(2019).setModell("Civic").setFahrgestellnummer("SCBCR63W95C479419").setVertriebler(71).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Honda").setBeschreibung("gutes Entetainment-System").setKraftstoff("Elektro").setBaujahr(2017).setModell("MDX").setFahrgestellnummer("4USCN33462L255522").setVertriebler(96).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mazda").setBeschreibung("begehrt!").setKraftstoff("Diesel").setBaujahr(2019).setModell("Avancier").setFahrgestellnummer("WA1AV74L49D622619").setVertriebler(99).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Infiniti").setBeschreibung("mit Klimaautomatik").setKraftstoff("Elektro").setBaujahr(2018).setModell("Legend").setFahrgestellnummer("WBAVT13526A805024").setVertriebler(97).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("GMC").setBeschreibung("kleiner Unfallschaden").setKraftstoff("Gas").setBaujahr(2018).setModell("FCX Clarity").setFahrgestellnummer("1FTWF3B5XAE058315").setVertriebler(59).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Lexus").setBeschreibung("mit Kindersitz").setKraftstoff("Gas").setBaujahr(2020).setModell("MDX").setFahrgestellnummer("TRUUT28N731583336").setVertriebler(87).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Nissan").setBeschreibung("mit Kindersitz").setKraftstoff("Gas").setBaujahr(2020).setModell("Life").setFahrgestellnummer("2LNBL8CVXAX843157").setVertriebler(53).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Subaru").setBeschreibung("Unsere Besten!").setKraftstoff("Diesel").setBaujahr(2018).setModell("Accord").setFahrgestellnummer("SALVP2BG2EH040296").setVertriebler(99).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Isuzu").setBeschreibung("Gepflegtes Auto").setKraftstoff("Gas").setBaujahr(2017).setModell("Orthia").setFahrgestellnummer("3D73Y4EL9BG377818").setVertriebler(57).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Nissan").setBeschreibung("begehrt!").setKraftstoff("Gas").setBaujahr(2019).setModell("Accord").setFahrgestellnummer("KMHTC6AD1EU807227").setVertriebler(77).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Lexus").setBeschreibung("Highline").setKraftstoff("Gas").setBaujahr(2017).setModell("Ridgeline").setFahrgestellnummer("2FMGK5BC2CB695431").setVertriebler(92).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Chevrolet").setBeschreibung("unfallfrei mit vielen Extra").setKraftstoff("Diesel").setBaujahr(2019).setModell("Odyssey").setFahrgestellnummer("1G6DS8E32D0015749").setVertriebler(95).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Chrysler").setBeschreibung("gutes Entetainment-System").setKraftstoff("Benzin").setBaujahr(2019).setModell("Life").setFahrgestellnummer("1G6DJ1E34D0207992").setVertriebler(57).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Dodge").setBeschreibung("gutes Entetainment-System").setKraftstoff("Benzin").setBaujahr(2020).setModell("Gooding").setFahrgestellnummer("1G4GF5G3XCF622757").setVertriebler(78).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Oldsmobile").setBeschreibung("gutes Entetainment-System").setKraftstoff("Benzin").setBaujahr(2020).setModell("Integra").setFahrgestellnummer("1B3BD4FBXBN784420").setVertriebler(52).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Jaguar").setBeschreibung("mit Klimaautomatik").setKraftstoff("Benzin").setBaujahr(2019).setModell("Gooding").setFahrgestellnummer("1N6AA0CAXAN929779").setVertriebler(74).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Oldsmobile").setBeschreibung("unfallfrei mit vielen Extra").setKraftstoff("Elektro").setBaujahr(2017).setModell("CR-Z").setFahrgestellnummer("1FTFW1E84AF811714").setVertriebler(77).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Plymouth").setBeschreibung("mit Kindersitz").setKraftstoff("Diesel").setBaujahr(2019).setModell("Capa").setFahrgestellnummer("1G6DL5E34C0564363").setVertriebler(61).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Audi").setBeschreibung("Unsere Besten!").setKraftstoff("Diesel").setBaujahr(2020).setModell("Quint").setFahrgestellnummer("1GTN1TEHXEZ644434").setVertriebler(64).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Suzuki").setBeschreibung("unfallfrei mit vielen Extra").setKraftstoff("Elektro").setBaujahr(2019).setModell("Ascot").setFahrgestellnummer("2FMGK5C82FB589625").setVertriebler(57).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Ford").setBeschreibung("Geil!").setKraftstoff("Benzin").setBaujahr(2019).setModell("Freed").setFahrgestellnummer("JN8AF5MV3FT168670").setVertriebler(51).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Infiniti").setBeschreibung("Unsere Besten!").setKraftstoff("Diesel").setBaujahr(2018).setModell("Odyssey").setFahrgestellnummer("2C4RDGBG6ER946521").setVertriebler(91).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Audi").setBeschreibung("unfallfrei mit vielen Extra").setKraftstoff("Gas").setBaujahr(2018).setModell("Elysion").setFahrgestellnummer("1G6AH5S38D0383373").setVertriebler(85).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Lotus").setBeschreibung("Gepflegtes Auto").setKraftstoff("Gas").setBaujahr(2017).setModell("Crossroad").setFahrgestellnummer("2T2BK1BA2FC727228").setVertriebler(79).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Land Rover").setBeschreibung("mit Kindersitz").setKraftstoff("Benzin").setBaujahr(2017).setModell("MDX").setFahrgestellnummer("3D7TP2CT5BG052867").setVertriebler(62).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Chevrolet").setBeschreibung("unfallfrei mit vielen Extra").setKraftstoff("Elektro").setBaujahr(2018).setModell("Passport").setFahrgestellnummer("KNADM5A36F6376068").setVertriebler(94).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Ford").setBeschreibung("mit Klimaautomatik").setKraftstoff("Diesel").setBaujahr(2019).setModell("Pilot").setFahrgestellnummer("WAUDF98E78A241514").setVertriebler(95).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Land Rover").setBeschreibung("mit Klimaautomatik").setKraftstoff("Gas").setBaujahr(2017).setModell("Accord").setFahrgestellnummer("1GD11ZCG2DF073173").setVertriebler(88).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Volkswagen").setBeschreibung("gutes Entetainment-System").setKraftstoff("Benzin").setBaujahr(2018).setModell("CR-Z").setFahrgestellnummer("WBAYP1C53FD874269").setVertriebler(61).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Ford").setBeschreibung("kleiner Unfallschaden").setKraftstoff("Gas").setBaujahr(2018).setModell("Insight").setFahrgestellnummer("WAUMFAFH6FN127797").setVertriebler(72).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Cadillac").setBeschreibung("Gepflegtes Auto").setKraftstoff("Elektro").setBaujahr(2018).setModell("Rafaga").setFahrgestellnummer("5LMJJ2H53CE152724").setVertriebler(68).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Nissan").setBeschreibung("begehrt!").setKraftstoff("Diesel").setBaujahr(2020).setModell("CR-V").setFahrgestellnummer("WBALL5C56EJ529640").setVertriebler(91).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Jeep").setBeschreibung("mit Klimaautomatik").setKraftstoff("Elektro").setBaujahr(2017).setModell("Logo").setFahrgestellnummer("1G4GH5G39CF210906").setVertriebler(59).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Lincoln").setBeschreibung("mit Klimaautomatik").setKraftstoff("Gas").setBaujahr(2020).setModell("Mobilio").setFahrgestellnummer("1GYFK66847R690811").setVertriebler(62).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Oldsmobile").setBeschreibung("Unsere Besten!").setKraftstoff("Benzin").setBaujahr(2017).setModell("Crosstour").setFahrgestellnummer("JN1CV6EK0CM749800").setVertriebler(81).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Chevrolet").setBeschreibung("kleiner Unfallschaden").setKraftstoff("Benzin").setBaujahr(2017).setModell("Inspire").setFahrgestellnummer("3VW517ATXEM217898").setVertriebler(67).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Toyota").setBeschreibung("Gepflegtes Auto").setKraftstoff("Diesel").setBaujahr(2017).setModell("Ridgeline").setFahrgestellnummer("1FTSX2B51AE656167").setVertriebler(97).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Jaguar").setBeschreibung("mit Kindersitz").setKraftstoff("Gas").setBaujahr(2018).setModell("Element").setFahrgestellnummer("5N1CR2MM6EC150630").setVertriebler(75).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mitsubishi").setBeschreibung("Unsere Besten!").setKraftstoff("Elektro").setBaujahr(2019).setModell("Fit Aria").setFahrgestellnummer("JN1AY1AP7CM019711").setVertriebler(65).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mazda").setBeschreibung("Unsere Besten!").setKraftstoff("Diesel").setBaujahr(2020).setModell("Prelude").setFahrgestellnummer("1FAHP2DW7BG762489").setVertriebler(63).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Hyundai").setBeschreibung("kleiner Unfallschaden").setKraftstoff("Diesel").setBaujahr(2017).setModell("Ridgeline").setFahrgestellnummer("YV1672MK7A2742957").setVertriebler(61).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Volkswagen").setBeschreibung("Confort-Ausstattung").setKraftstoff("Diesel").setBaujahr(2020).setModell("CR-V").setFahrgestellnummer("WVGAV3AXXDW363262").setVertriebler(98).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Ford").setBeschreibung("Gepflegtes Auto").setKraftstoff("Benzin").setBaujahr(2019).setModell("Integra").setFahrgestellnummer("2FMGK5BC9CB536261").setVertriebler(91).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Toyota").setBeschreibung("mit Kindersitz").setKraftstoff("Gas").setBaujahr(2018).setModell("CR-X").setFahrgestellnummer("WA1CFBFPXBA058667").setVertriebler(74).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Toyota").setBeschreibung("Highline").setKraftstoff("Gas").setBaujahr(2019).setModell("Accord").setFahrgestellnummer("WAUVT58E32A247131").setVertriebler(78).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Eagle").setBeschreibung("gutes Entetainment-System").setKraftstoff("Benzin").setBaujahr(2018).setModell("Integra").setFahrgestellnummer("WBAEU33422K379646").setVertriebler(68).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mazda").setBeschreibung("kleiner Unfallschaden").setKraftstoff("Diesel").setBaujahr(2017).setModell("MDX").setFahrgestellnummer("WAUJGAFC2DN924498").setVertriebler(94).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Cadillac").setBeschreibung("unfallfrei mit vielen Extra").setKraftstoff("Diesel").setBaujahr(2020).setModell("Crossroad").setFahrgestellnummer("WP0CA2A84ES008947").setVertriebler(91).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("BMW").setBeschreibung("unfallfrei mit vielen Extra").setKraftstoff("Gas").setBaujahr(2020).setModell("Life").setFahrgestellnummer("JN8AF5MR3DT355200").setVertriebler(69).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("MINI").setBeschreibung("Geil!").setKraftstoff("Elektro").setBaujahr(2019).setModell("Inspire").setFahrgestellnummer("1FTWW3A51AE896833").setVertriebler(81).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mitsubishi").setBeschreibung("Gepflegtes Auto").setKraftstoff("Elektro").setBaujahr(2019).setModell("Gooding").setFahrgestellnummer("1C4RDJAG8EC376481").setVertriebler(83).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Acura").setBeschreibung("Highline").setKraftstoff("Gas").setBaujahr(2018).setModell("Orthia").setFahrgestellnummer("3N1CN7APXEK414599").setVertriebler(58).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Ford").setBeschreibung("kleiner Unfallschaden").setKraftstoff("Benzin").setBaujahr(2020).setModell("CR-X").setFahrgestellnummer("WAUNG94F09N853578").setVertriebler(95).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Dodge").setBeschreibung("mit Kindersitz").setKraftstoff("Elektro").setBaujahr(2017).setModell("MDX").setFahrgestellnummer("1D4RE2GG1BC106047").setVertriebler(97).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Subaru").setBeschreibung("mit Kindersitz").setKraftstoff("Elektro").setBaujahr(2020).setModell("Gooding").setFahrgestellnummer("1D7RV1GTXAS598303").setVertriebler(90).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mitsubishi").setBeschreibung("Highline").setKraftstoff("Diesel").setBaujahr(2018).setModell("Integra").setFahrgestellnummer("1C4RDJDG7EC423768").setVertriebler(83).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("GMC").setBeschreibung("mit Kindersitz").setKraftstoff("Gas").setBaujahr(2019).setModell("Elysion").setFahrgestellnummer("1G6DP5E34C0977601").setVertriebler(59).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Audi").setBeschreibung("Unsere Besten!").setKraftstoff("Gas").setBaujahr(2018).setModell("CR-V").setFahrgestellnummer("WAUAFAFL1CA254712").setVertriebler(82).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Ford").setBeschreibung("Highline").setKraftstoff("Benzin").setBaujahr(2019).setModell("Edix").setFahrgestellnummer("1GT01ZCG7EF299906").setVertriebler(65).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Studebaker").setBeschreibung("Highline").setKraftstoff("Gas").setBaujahr(2019).setModell("FCX Clarity").setFahrgestellnummer("WBABD33495P845356").setVertriebler(54).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Toyota").setBeschreibung("kleiner Unfallschaden").setKraftstoff("Gas").setBaujahr(2019).setModell("Passport").setFahrgestellnummer("WBADX1C57CJ411353").setVertriebler(81).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mazda").setBeschreibung("Gepflegtes Auto").setKraftstoff("Benzin").setBaujahr(2020).setModell("Jazz").setFahrgestellnummer("4USBU53548L905976").setVertriebler(64).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Audi").setBeschreibung("begehrt!").setKraftstoff("Benzin").setBaujahr(2019).setModell("Prelude").setFahrgestellnummer("1GD11ZCG3DF914806").setVertriebler(68).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Chevrolet").setBeschreibung("Geil!").setKraftstoff("Benzin").setBaujahr(2017).setModell("Passport").setFahrgestellnummer("JM1NC2JFXB0274188").setVertriebler(56).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Jeep").setBeschreibung("kleiner Unfallschaden").setKraftstoff("Diesel").setBaujahr(2018).setModell("Inspire").setFahrgestellnummer("1G6DE5E51D0707105").setVertriebler(76).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mazda").setBeschreibung("Geil!").setKraftstoff("Benzin").setBaujahr(2020).setModell("NSX").setFahrgestellnummer("2C3CCAEG1EH558575").setVertriebler(68).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Chevrolet").setBeschreibung("begehrt!").setKraftstoff("Diesel").setBaujahr(2019).setModell("CR-Z").setFahrgestellnummer("WAUCD64B54N420486").setVertriebler(69).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Chevrolet").setBeschreibung("Highline").setKraftstoff("Diesel").setBaujahr(2017).setModell("Edix").setFahrgestellnummer("TRUTC28N061656143").setVertriebler(80).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Ford").setBeschreibung("Geil!").setKraftstoff("Benzin").setBaujahr(2020).setModell("HR-V").setFahrgestellnummer("1FTWX3A58AE983884").setVertriebler(75).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mazda").setBeschreibung("unfallfrei mit vielen Extra").setKraftstoff("Elektro").setBaujahr(2020).setModell("Crosstour").setFahrgestellnummer("KMHHT6KD6DU531503").setVertriebler(58).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Cadillac").setBeschreibung("mit Klimaautomatik").setKraftstoff("Elektro").setBaujahr(2019).setModell("Pilot").setFahrgestellnummer("3D7TT2HT0BG757774").setVertriebler(100).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("GMC").setBeschreibung("mit Klimaautomatik").setKraftstoff("Benzin").setBaujahr(2019).setModell("CR-V").setFahrgestellnummer("1G6AJ5S31F0274373").setVertriebler(99).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mercedes-Benz").setBeschreibung("unfallfrei mit vielen Extra").setKraftstoff("Benzin").setBaujahr(2019).setModell("Passport").setFahrgestellnummer("3LNDL2L30BR646325").setVertriebler(95).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Toyota").setBeschreibung("kleiner Unfallschaden").setKraftstoff("Gas").setBaujahr(2020).setModell("Crossroad").setFahrgestellnummer("1FTEX1CM8BF163532").setVertriebler(97).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Kia").setBeschreibung("unfallfrei mit vielen Extra").setKraftstoff("Diesel").setBaujahr(2017).setModell("Crosstour").setFahrgestellnummer("WAUHF98P57A361619").setVertriebler(81).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Suzuki").setBeschreibung("mit Kindersitz").setKraftstoff("Diesel").setBaujahr(2018).setModell("CR-V").setFahrgestellnummer("1C3ADEBZ6DV465378").setVertriebler(65).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Acura").setBeschreibung("begehrt!").setKraftstoff("Diesel").setBaujahr(2019).setModell("Elysion").setFahrgestellnummer("3GYFNEE37DS799490").setVertriebler(51).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Isuzu").setBeschreibung("begehrt!").setKraftstoff("Elektro").setBaujahr(2017).setModell("Insight").setFahrgestellnummer("1N6AD0CU3AC967464").setVertriebler(70).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Honda").setBeschreibung("kleiner Unfallschaden").setKraftstoff("Diesel").setBaujahr(2018).setModell("Ridgeline").setFahrgestellnummer("JH4NA12625S107541").setVertriebler(55).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Acura").setBeschreibung("Highline").setKraftstoff("Gas").setBaujahr(2018).setModell("Integra SJ").setFahrgestellnummer("JTHBC1KS5A5652913").setVertriebler(98).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Oldsmobile").setBeschreibung("begehrt!").setKraftstoff("Elektro").setBaujahr(2018).setModell("Beat").setFahrgestellnummer("1GD21ZCG2DZ578567").setVertriebler(85).setLocation("Berlin"));
                dataList = list;
            }
            return list;
        }
    }

    public static class KundeResFahrzg {

        private static List<ReservationDTO> dataList = null;

        public static List<ReservationDTO> getList() {
            if (dataList == null) {
                List<String> listSign = null;
                int sizeKunde = 0;
                try {
                    sizeKunde = UserDAO.getInstance().sizeKunde();
                    listSign = FahrzeugDAO.getInstance().getKennzeichenRandRows();
                } catch (DatabaseException e) {
                    Logger.getLogger(ListSupplier.class.getName()).log(Level.INFO, null, e);
                }

                List<ReservationDTO> newDataList = new ArrayList<>();

                for (String tmp : listSign) {

                    Kunde kunde = Factories.createNewKunde().setKundennummer(new Random().nextInt(sizeKunde-1) + 1);
                    Fahrzeug fahrzeug = Factories.createNewFahrzeug().setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(tmp));

                    newDataList.add(DTOFactory.createNewReservationDTO().setFahrzeug(fahrzeug).setKunde(kunde));
                }
                dataList = newDataList;
            }
            return dataList;
        }
    }
}
