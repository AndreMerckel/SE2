package org.carlook.services.exampleData;

import org.carlook.controller.exception.DatabaseException;
import org.carlook.factories.DTOFactory;
import org.carlook.factories.Factories;
import org.carlook.model.dao.FahrzeugDAO;
import org.carlook.model.dao.UserDAO;
import org.carlook.model.objects.dto.KundeDTO;
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
        private static List<org.carlook.model.objects.entities.Fahrzeug> dataList = null;

        public static List<org.carlook.model.objects.entities.Fahrzeug> getList() {
            List<org.carlook.model.objects.entities.Fahrzeug> list = dataList;
            if (dataList == null) {
                list = new ArrayList<>();
                list.add(Factories.createNewFahrzeug().setHersteller("Ford").setBeschreibung("Gossling").setKraftstoff("Diesel").setBaujahr(2017).setModell("Quint").setFahrgestellnummer("WVGAV3AX7DW214002").setKennzeichen(Parameter.KENNZEICHEN + "0094").setVertriebler(39).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Chevrolet").setBeschreibung("Bonifazio").setKraftstoff("Gas").setBaujahr(2018).setModell("Pilot").setFahrgestellnummer("1G4CU541654103405").setKennzeichen(Parameter.KENNZEICHEN + "0385").setVertriebler(22).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Chevrolet").setBeschreibung("Cheney").setKraftstoff("Gas").setBaujahr(2019).setModell("Logo").setFahrgestellnummer("JM1DE1KYXE0703947").setKennzeichen(Parameter.KENNZEICHEN + "8915").setVertriebler(5).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Volkswagen").setBeschreibung("Madre").setKraftstoff("Elektro").setBaujahr(2017).setModell("Legend").setFahrgestellnummer("WAUEF78E37A212342").setKennzeichen(Parameter.KENNZEICHEN + "0959").setVertriebler(2).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Subaru").setBeschreibung("Woodyeare").setKraftstoff("Elektro").setBaujahr(2019).setModell("CR-V").setFahrgestellnummer("SAJWA4EC8DM022944").setKennzeichen(Parameter.KENNZEICHEN + "4751").setVertriebler(37).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("BMW").setBeschreibung("Scheu").setKraftstoff("Diesel").setBaujahr(2017).setModell("Prelude").setFahrgestellnummer("WBA5B1C51FG277461").setKennzeichen(Parameter.KENNZEICHEN + "1035").setVertriebler(39).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Chevrolet").setBeschreibung("Golborn").setKraftstoff("Benzin").setBaujahr(2018).setModell("Ascot").setFahrgestellnummer("SAJWA1CZ8E8280543").setKennzeichen(Parameter.KENNZEICHEN + "1261").setVertriebler(10).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Maserati").setBeschreibung("Milington").setKraftstoff("Diesel").setBaujahr(2017).setModell("Avancier").setFahrgestellnummer("2V4RW3D10AR406139").setKennzeichen(Parameter.KENNZEICHEN + "8804").setVertriebler(17).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Jeep").setBeschreibung("Bromilow").setKraftstoff("Benzin").setBaujahr(2018).setModell("Passport").setFahrgestellnummer("5N1AT2ML5EC362399").setKennzeichen(Parameter.KENNZEICHEN + "7229").setVertriebler(5).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Chevrolet").setBeschreibung("Payze").setKraftstoff("Benzin").setBaujahr(2019).setModell("Avancier").setFahrgestellnummer("JHMZF1C67ES664916").setKennzeichen(Parameter.KENNZEICHEN + "3139").setVertriebler(12).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Jaguar").setBeschreibung("Bottell").setKraftstoff("Elektro").setBaujahr(2019).setModell("Fit").setFahrgestellnummer("1FTEX1E8XAF697601").setKennzeichen(Parameter.KENNZEICHEN + "5369").setVertriebler(15).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("GMC").setBeschreibung("Wight").setKraftstoff("Benzin").setBaujahr(2019).setModell("Jazz").setFahrgestellnummer("1G6DK1ED5B0670596").setKennzeichen(Parameter.KENNZEICHEN + "1376").setVertriebler(43).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Pontiac").setBeschreibung("Sibson").setKraftstoff("Elektro").setBaujahr(2018).setModell("City").setFahrgestellnummer("WVGFG9BP6CD684386").setKennzeichen(Parameter.KENNZEICHEN + "5127").setVertriebler(42).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Hyundai").setBeschreibung("Churchouse").setKraftstoff("Diesel").setBaujahr(2018).setModell("Prelude").setFahrgestellnummer("SCBBR53W36C112121").setKennzeichen(Parameter.KENNZEICHEN + "3655").setVertriebler(43).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Toyota").setBeschreibung("Haliburn").setKraftstoff("Diesel").setBaujahr(2018).setModell("Airwave").setFahrgestellnummer("1G6KD54Y72U163947").setKennzeichen(Parameter.KENNZEICHEN + "7186").setVertriebler(25).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Subaru").setBeschreibung("Shubotham").setKraftstoff("Diesel").setBaujahr(2019).setModell("Integra").setFahrgestellnummer("1G4GC5G38EF842314").setKennzeichen(Parameter.KENNZEICHEN + "1978").setVertriebler(12).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Chevrolet").setBeschreibung("O'Noland").setKraftstoff("Elektro").setBaujahr(2019).setModell("Ridgeline").setFahrgestellnummer("2LMDJ8JK0FB437582").setKennzeichen(Parameter.KENNZEICHEN + "7028").setVertriebler(9).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Chevrolet").setBeschreibung("Domnick").setKraftstoff("Gas").setBaujahr(2017).setModell("Logo").setFahrgestellnummer("WA1WMAFE4ED999255").setKennzeichen(Parameter.KENNZEICHEN + "0649").setVertriebler(20).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Buick").setBeschreibung("Stopper").setKraftstoff("Diesel").setBaujahr(2018).setModell("Domani").setFahrgestellnummer("WAUFFAFL2FN986138").setKennzeichen(Parameter.KENNZEICHEN + "2240").setVertriebler(1).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Volvo").setBeschreibung("Silveston").setKraftstoff("Diesel").setBaujahr(2019).setModell("Integra").setFahrgestellnummer("WBALX3C58CD947914").setKennzeichen(Parameter.KENNZEICHEN + "7878").setVertriebler(42).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Ford").setBeschreibung("Crosfield").setKraftstoff("Diesel").setBaujahr(2017).setModell("Inspire").setFahrgestellnummer("1G6AC5S38F0877685").setKennzeichen(Parameter.KENNZEICHEN + "1411").setVertriebler(17).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Pontiac").setBeschreibung("Manolov").setKraftstoff("Diesel").setBaujahr(2020).setModell("Crosstour").setFahrgestellnummer("JTHBB1BA5A2153959").setKennzeichen(Parameter.KENNZEICHEN + "9284").setVertriebler(34).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Volvo").setBeschreibung("Lerner").setKraftstoff("Gas").setBaujahr(2019).setModell("Civic").setFahrgestellnummer("WVWED7AJ4CW343762").setKennzeichen(Parameter.KENNZEICHEN + "7916").setVertriebler(4).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mazda").setBeschreibung("Nutkins").setKraftstoff("Elektro").setBaujahr(2018).setModell("FR-V").setFahrgestellnummer("1GKUKFDJ6AR885520").setKennzeichen(Parameter.KENNZEICHEN + "6715").setVertriebler(3).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Infiniti").setBeschreibung("Dibsdale").setKraftstoff("Benzin").setBaujahr(2017).setModell("Element").setFahrgestellnummer("KMHEC4A41FA306466").setKennzeichen(Parameter.KENNZEICHEN + "9937").setVertriebler(10).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Porsche").setBeschreibung("Rau").setKraftstoff("Gas").setBaujahr(2020).setModell("Integra").setFahrgestellnummer("1FTKR1AD9BP761137").setKennzeichen(Parameter.KENNZEICHEN + "0408").setVertriebler(19).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Hummer").setBeschreibung("Steels").setKraftstoff("Benzin").setBaujahr(2020).setModell("CR-Z").setFahrgestellnummer("1FTEW1E86AF361561").setKennzeichen(Parameter.KENNZEICHEN + "6325").setVertriebler(13).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("GMC").setBeschreibung("Richardot").setKraftstoff("Benzin").setBaujahr(2018).setModell("Quint").setFahrgestellnummer("5N1AR1NB1AC288665").setKennzeichen(Parameter.KENNZEICHEN + "9107").setVertriebler(12).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Infiniti").setBeschreibung("McCrorie").setKraftstoff("Benzin").setBaujahr(2019).setModell("Rafaga").setFahrgestellnummer("1G6AY5S33F0137673").setKennzeichen(Parameter.KENNZEICHEN + "4046").setVertriebler(22).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Porsche").setBeschreibung("Pude").setKraftstoff("Diesel").setBaujahr(2018).setModell("Life").setFahrgestellnummer("5J8TB4H79GL146875").setKennzeichen(Parameter.KENNZEICHEN + "3538").setVertriebler(2).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Buick").setBeschreibung("Symes").setKraftstoff("Gas").setBaujahr(2020).setModell("Odyssey").setFahrgestellnummer("WDDHH8HB5BA603058").setKennzeichen(Parameter.KENNZEICHEN + "3453").setVertriebler(14).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Kia").setBeschreibung("Archambault").setKraftstoff("Gas").setBaujahr(2020).setModell("Fit").setFahrgestellnummer("1G6AC5S39D0775227").setKennzeichen(Parameter.KENNZEICHEN + "8193").setVertriebler(9).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Ford").setBeschreibung("Yeoman").setKraftstoff("Elektro").setBaujahr(2020).setModell("CR-X").setFahrgestellnummer("3C3CFFDR9ET337286").setKennzeichen(Parameter.KENNZEICHEN + "7440").setVertriebler(32).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Volkswagen").setBeschreibung("Giraldez").setKraftstoff("Gas").setBaujahr(2018).setModell("Fit").setFahrgestellnummer("5FNRL3H20AB966180").setKennzeichen(Parameter.KENNZEICHEN + "1337").setVertriebler(35).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Chevrolet").setBeschreibung("Grogono").setKraftstoff("Benzin").setBaujahr(2020).setModell("Jazz").setFahrgestellnummer("5UXFA13545L288257").setKennzeichen(Parameter.KENNZEICHEN + "8669").setVertriebler(43).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Ford").setBeschreibung("Vallentine").setKraftstoff("Benzin").setBaujahr(2020).setModell("Legend").setFahrgestellnummer("1GYUKAEF1AR210211").setKennzeichen(Parameter.KENNZEICHEN + "8850").setVertriebler(36).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Volkswagen").setBeschreibung("Caddens").setKraftstoff("Diesel").setBaujahr(2018).setModell("Legend").setFahrgestellnummer("JH4CL96868C547045").setKennzeichen(Parameter.KENNZEICHEN + "9374").setVertriebler(33).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Lexus").setBeschreibung("Houselee").setKraftstoff("Gas").setBaujahr(2018).setModell("Civic").setFahrgestellnummer("1G4GG5E36CF148080").setKennzeichen(Parameter.KENNZEICHEN + "1962").setVertriebler(37).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Lexus").setBeschreibung("Tuck").setKraftstoff("Elektro").setBaujahr(2020).setModell("CR-Z").setFahrgestellnummer("1C6RD6PT1CS184430").setKennzeichen(Parameter.KENNZEICHEN + "4428").setVertriebler(40).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mazda").setBeschreibung("Audsley").setKraftstoff("Elektro").setBaujahr(2019).setModell("Pilot").setFahrgestellnummer("1G6DP577170867904").setKennzeichen(Parameter.KENNZEICHEN + "3893").setVertriebler(33).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("BMW").setBeschreibung("Dover").setKraftstoff("Elektro").setBaujahr(2017).setModell("CR-V").setFahrgestellnummer("WAUEFAFL1AN046627").setKennzeichen(Parameter.KENNZEICHEN + "1783").setVertriebler(6).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Chrysler").setBeschreibung("Rendell").setKraftstoff("Elektro").setBaujahr(2018).setModell("Odyssey").setFahrgestellnummer("KM8NU4CC9BU938061").setKennzeichen(Parameter.KENNZEICHEN + "7500").setVertriebler(50).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Suzuki").setBeschreibung("Gabites").setKraftstoff("Diesel").setBaujahr(2020).setModell("Rafaga").setFahrgestellnummer("19UUA9F27DA687541").setKennzeichen(Parameter.KENNZEICHEN + "9630").setVertriebler(32).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mercury").setBeschreibung("Wynrehame").setKraftstoff("Benzin").setBaujahr(2020).setModell("Mobilio").setFahrgestellnummer("JN8AF5MV1FT658458").setKennzeichen(Parameter.KENNZEICHEN + "1029").setVertriebler(9).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Toyota").setBeschreibung("Jenteau").setKraftstoff("Gas").setBaujahr(2017).setModell("CR-Z").setFahrgestellnummer("5NPET4AC5AH431225").setKennzeichen(Parameter.KENNZEICHEN + "1366").setVertriebler(31).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Saturn").setBeschreibung("Gouny").setKraftstoff("Elektro").setBaujahr(2020).setModell("City").setFahrgestellnummer("WVWAB7AJ3CW689399").setKennzeichen(Parameter.KENNZEICHEN + "7928").setVertriebler(30).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Dodge").setBeschreibung("Sutty").setKraftstoff("Benzin").setBaujahr(2020).setModell("Orthia").setFahrgestellnummer("WAUHFAFL1BN322139").setKennzeichen(Parameter.KENNZEICHEN + "4134").setVertriebler(18).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Maybach").setBeschreibung("Lindsay").setKraftstoff("Gas").setBaujahr(2020).setModell("NSX").setFahrgestellnummer("W04GP5EC6B1335880").setKennzeichen(Parameter.KENNZEICHEN + "7605").setVertriebler(16).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mazda").setBeschreibung("Durbann").setKraftstoff("Diesel").setBaujahr(2018).setModell("Mobilio").setFahrgestellnummer("3VWJX7AJ1AM949150").setKennzeichen(Parameter.KENNZEICHEN + "8430").setVertriebler(28).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Saab").setBeschreibung("Aiken").setKraftstoff("Elektro").setBaujahr(2020).setModell("Ascot").setFahrgestellnummer("1G6AB5R31E0039568").setKennzeichen(Parameter.KENNZEICHEN + "2455").setVertriebler(24).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Oldsmobile").setBeschreibung("Huckett").setKraftstoff("Benzin").setBaujahr(2017).setModell("Civic").setFahrgestellnummer("3D73Y4HL1AG441716").setKennzeichen(Parameter.KENNZEICHEN + "4437").setVertriebler(3).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Honda").setBeschreibung("Eubank").setKraftstoff("Diesel").setBaujahr(2018).setModell("Concerto").setFahrgestellnummer("YV1672MK3B2859341").setKennzeichen(Parameter.KENNZEICHEN + "2755").setVertriebler(19).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Toyota").setBeschreibung("Arr").setKraftstoff("Benzin").setBaujahr(2017).setModell("Element").setFahrgestellnummer("1D7RB1GP1AS371531").setKennzeichen(Parameter.KENNZEICHEN + "6310").setVertriebler(40).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Kia").setBeschreibung("Collerd").setKraftstoff("Benzin").setBaujahr(2019).setModell("Life").setFahrgestellnummer("WVWED7AJ3BW375374").setKennzeichen(Parameter.KENNZEICHEN + "5610").setVertriebler(24).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Volkswagen").setBeschreibung("Shalcras").setKraftstoff("Elektro").setBaujahr(2020).setModell("Edix").setFahrgestellnummer("2T1BU4EE5BC902466").setKennzeichen(Parameter.KENNZEICHEN + "7159").setVertriebler(46).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Lexus").setBeschreibung("Low").setKraftstoff("Gas").setBaujahr(2017).setModell("Logo").setFahrgestellnummer("5GALRBED1AJ865583").setKennzeichen(Parameter.KENNZEICHEN + "0172").setVertriebler(18).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("GMC").setBeschreibung("Eldon").setKraftstoff("Gas").setBaujahr(2019).setModell("Civic").setFahrgestellnummer("WAUWFAFHXBN883202").setKennzeichen(Parameter.KENNZEICHEN + "6933").setVertriebler(9).setLocation("Bonn"));

                list.add(Factories.createNewFahrzeug().setHersteller("Mercedes-Benz").setBeschreibung("Jelly").setKraftstoff("Gas").setBaujahr(2017).setModell("Insight").setFahrgestellnummer("WBAFR1C56BC806145").setKennzeichen(Parameter.KENNZEICHEN + "0132").setVertriebler(21).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("MINI").setBeschreibung("Saltsberger").setKraftstoff("Gas").setBaujahr(2020).setModell("Rafaga").setFahrgestellnummer("2G61W5S85F9312884").setKennzeichen(Parameter.KENNZEICHEN + "2748").setVertriebler(27).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Buick").setBeschreibung("Shimwall").setKraftstoff("Benzin").setBaujahr(2019).setModell("Rafaga").setFahrgestellnummer("W04GT5GCXB1724496").setKennzeichen(Parameter.KENNZEICHEN + "8355").setVertriebler(39).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Volkswagen").setBeschreibung("Hacking").setKraftstoff("Gas").setBaujahr(2020).setModell("Element").setFahrgestellnummer("2C3CA4CD7AH374199").setKennzeichen(Parameter.KENNZEICHEN + "2341").setVertriebler(25).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Cadillac").setBeschreibung("Tunno").setKraftstoff("Elektro").setBaujahr(2017).setModell("Edix").setFahrgestellnummer("WAUDF78E68A579801").setKennzeichen(Parameter.KENNZEICHEN + "3518").setVertriebler(12).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mercedes-Benz").setBeschreibung("Antonetti").setKraftstoff("Gas").setBaujahr(2019).setModell("Airwave").setFahrgestellnummer("2LMHJ5AR0AB124005").setKennzeichen(Parameter.KENNZEICHEN + "7821").setVertriebler(49).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Dodge").setBeschreibung("Valance").setKraftstoff("Elektro").setBaujahr(2020).setModell("NSX").setFahrgestellnummer("5LMJJ3H51CE388195").setKennzeichen(Parameter.KENNZEICHEN + "1267").setVertriebler(14).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Bugatti").setBeschreibung("Leak").setKraftstoff("Diesel").setBaujahr(2019).setModell("CR-Z").setFahrgestellnummer("5UXFA93505L308955").setKennzeichen(Parameter.KENNZEICHEN + "4567").setVertriebler(3).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("BMW").setBeschreibung("Carnock").setKraftstoff("Gas").setBaujahr(2020).setModell("Rafaga").setFahrgestellnummer("1GYS4JEF6ER652330").setKennzeichen(Parameter.KENNZEICHEN + "2853").setVertriebler(1).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Dodge").setBeschreibung("Aldiss").setKraftstoff("Benzin").setBaujahr(2018).setModell("Crosstour").setFahrgestellnummer("3GYFNFEYXBS584295").setKennzeichen(Parameter.KENNZEICHEN + "7140").setVertriebler(1).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mazda").setBeschreibung("Danby").setKraftstoff("Gas").setBaujahr(2020).setModell("Legend").setFahrgestellnummer("1G6DM8EG1A0523980").setKennzeichen(Parameter.KENNZEICHEN + "4373").setVertriebler(49).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Volkswagen").setBeschreibung("Juliff").setKraftstoff("Diesel").setBaujahr(2018).setModell("Prelude").setFahrgestellnummer("1B3CC1FBXAN604843").setKennzeichen(Parameter.KENNZEICHEN + "7626").setVertriebler(1).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Jeep").setBeschreibung("Peare").setKraftstoff("Gas").setBaujahr(2019).setModell("Edix").setFahrgestellnummer("1C6RD6NT6CS927876").setKennzeichen(Parameter.KENNZEICHEN + "4647").setVertriebler(10).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Toyota").setBeschreibung("Reames").setKraftstoff("Diesel").setBaujahr(2019).setModell("Accord").setFahrgestellnummer("JM3ER2A55C0256678").setKennzeichen(Parameter.KENNZEICHEN + "0019").setVertriebler(24).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("BMW").setBeschreibung("Woolway").setKraftstoff("Elektro").setBaujahr(2019).setModell("Quint").setFahrgestellnummer("WBAGN63585D475564").setKennzeichen(Parameter.KENNZEICHEN + "6874").setVertriebler(17).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Isuzu").setBeschreibung("Siebert").setKraftstoff("Elektro").setBaujahr(2020).setModell("Passport").setFahrgestellnummer("WDBSK7AA8CF964722").setKennzeichen(Parameter.KENNZEICHEN + "9643").setVertriebler(3).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mercedes-Benz").setBeschreibung("Armsby").setKraftstoff("Elektro").setBaujahr(2020).setModell("Ascot").setFahrgestellnummer("3GYVKNEF4AG377755").setKennzeichen(Parameter.KENNZEICHEN + "7486").setVertriebler(48).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Chrysler").setBeschreibung("Jurges").setKraftstoff("Elektro").setBaujahr(2017).setModell("Concerto").setFahrgestellnummer("1G6AY5SX7E0153084").setKennzeichen(Parameter.KENNZEICHEN + "5187").setVertriebler(47).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mitsubishi").setBeschreibung("Hazelhurst").setKraftstoff("Elektro").setBaujahr(2020).setModell("Pilot").setFahrgestellnummer("1FMJU1F57AE480875").setKennzeichen(Parameter.KENNZEICHEN + "3596").setVertriebler(2).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Infiniti").setBeschreibung("Shapira").setKraftstoff("Gas").setBaujahr(2018).setModell("Partner").setFahrgestellnummer("WAUYP54B61N537366").setKennzeichen(Parameter.KENNZEICHEN + "6680").setVertriebler(39).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mitsubishi").setBeschreibung("Bulfield").setKraftstoff("Diesel").setBaujahr(2020).setModell("Gooding").setFahrgestellnummer("WBALL5C50DE565735").setKennzeichen(Parameter.KENNZEICHEN + "3751").setVertriebler(9).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Isuzu").setBeschreibung("Rosson").setKraftstoff("Elektro").setBaujahr(2019).setModell("Ridgeline").setFahrgestellnummer("KNDMB5C18F6118977").setKennzeichen(Parameter.KENNZEICHEN + "0957").setVertriebler(9).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Suzuki").setBeschreibung("MacCague").setKraftstoff("Benzin").setBaujahr(2017).setModell("Element").setFahrgestellnummer("1G6DL1ED1B0232512").setKennzeichen(Parameter.KENNZEICHEN + "7516").setVertriebler(44).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Nissan").setBeschreibung("Hitzschke").setKraftstoff("Benzin").setBaujahr(2017).setModell("Passport").setFahrgestellnummer("KNDPB3ACXF7905798").setKennzeichen(Parameter.KENNZEICHEN + "9460").setVertriebler(37).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Chevrolet").setBeschreibung("Georgius").setKraftstoff("Benzin").setBaujahr(2017).setModell("Accord").setFahrgestellnummer("1GYEK63N55R636405").setKennzeichen(Parameter.KENNZEICHEN + "5188").setVertriebler(5).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Pontiac").setBeschreibung("Pestridge").setKraftstoff("Elektro").setBaujahr(2018).setModell("Capa").setFahrgestellnummer("JH4CL96816C730849").setKennzeichen(Parameter.KENNZEICHEN + "9930").setVertriebler(38).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("GMC").setBeschreibung("Legge").setKraftstoff("Elektro").setBaujahr(2019).setModell("Crossroad").setFahrgestellnummer("5UXFA13555L315367").setKennzeichen(Parameter.KENNZEICHEN + "1483").setVertriebler(11).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mercury").setBeschreibung("Dalla").setKraftstoff("Elektro").setBaujahr(2018).setModell("Quint").setFahrgestellnummer("WAUGFBFC7EN363493").setKennzeichen(Parameter.KENNZEICHEN + "3380").setVertriebler(42).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Ford").setBeschreibung("Beadel").setKraftstoff("Diesel").setBaujahr(2019).setModell("FCX Clarity").setFahrgestellnummer("2GKALMEK2D6121370").setKennzeichen(Parameter.KENNZEICHEN + "6067").setVertriebler(2).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Ford").setBeschreibung("Pardoe").setKraftstoff("Gas").setBaujahr(2018).setModell("Orthia").setFahrgestellnummer("1GKS1CE06ER882699").setKennzeichen(Parameter.KENNZEICHEN + "9935").setVertriebler(24).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Hyundai").setBeschreibung("Favey").setKraftstoff("Diesel").setBaujahr(2018).setModell("Civic").setFahrgestellnummer("2C3CDXJG5CH919700").setKennzeichen(Parameter.KENNZEICHEN + "4383").setVertriebler(15).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Chevrolet").setBeschreibung("Sinclar").setKraftstoff("Gas").setBaujahr(2020).setModell("Passport").setFahrgestellnummer("WBA5B3C51ED646136").setKennzeichen(Parameter.KENNZEICHEN + "2151").setVertriebler(9).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Toyota").setBeschreibung("Eidelman").setKraftstoff("Gas").setBaujahr(2020).setModell("CR-V").setFahrgestellnummer("1FTEX1EW9AF793444").setKennzeichen(Parameter.KENNZEICHEN + "7346").setVertriebler(10).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("BMW").setBeschreibung("Bamblett").setKraftstoff("Gas").setBaujahr(2018).setModell("Crosstour").setFahrgestellnummer("WAUEF78E66A705544").setKennzeichen(Parameter.KENNZEICHEN + "5637").setVertriebler(32).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Pontiac").setBeschreibung("Halvosen").setKraftstoff("Elektro").setBaujahr(2018).setModell("CR-X").setFahrgestellnummer("2C3CCABG1DH827063").setKennzeichen(Parameter.KENNZEICHEN + "3667").setVertriebler(5).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("GMC").setBeschreibung("Alyutin").setKraftstoff("Elektro").setBaujahr(2020).setModell("Life").setFahrgestellnummer("JN1AZ4EH1BM352356").setKennzeichen(Parameter.KENNZEICHEN + "1702").setVertriebler(10).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Chrysler").setBeschreibung("Snartt").setKraftstoff("Benzin").setBaujahr(2019).setModell("City").setFahrgestellnummer("WAUVC68E65A915806").setKennzeichen(Parameter.KENNZEICHEN + "8001").setVertriebler(24).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Cadillac").setBeschreibung("Carlens").setKraftstoff("Elektro").setBaujahr(2019).setModell("Odyssey").setFahrgestellnummer("WAUDV94F39N183560").setKennzeichen(Parameter.KENNZEICHEN + "0255").setVertriebler(14).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Lamborghini").setBeschreibung("Peers").setKraftstoff("Diesel").setBaujahr(2017).setModell("Life").setFahrgestellnummer("3FA6P0SU5FR430398").setKennzeichen(Parameter.KENNZEICHEN + "5818").setVertriebler(20).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Honda").setBeschreibung("Gwillym").setKraftstoff("Gas").setBaujahr(2018).setModell("Pilot").setFahrgestellnummer("1FTNF2B57AE676200").setKennzeichen(Parameter.KENNZEICHEN + "0079").setVertriebler(44).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Ram").setBeschreibung("Broggelli").setKraftstoff("Benzin").setBaujahr(2020).setModell("Ascot").setFahrgestellnummer("WVWGD7AJ5EW118326").setKennzeichen(Parameter.KENNZEICHEN + "3482").setVertriebler(16).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Ford").setBeschreibung("Hawlgarth").setKraftstoff("Benzin").setBaujahr(2019).setModell("Domani").setFahrgestellnummer("1N6AD0CW5FN001646").setKennzeichen(Parameter.KENNZEICHEN + "6976").setVertriebler(8).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mitsubishi").setBeschreibung("Britee").setKraftstoff("Diesel").setBaujahr(2020).setModell("Logo").setFahrgestellnummer("JH4DC548X4S225699").setKennzeichen(Parameter.KENNZEICHEN + "8402").setVertriebler(27).setLocation("Berlin"));

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
                    Logger.getLogger(ExampleData.class.getName()).log(Level.SEVERE, null, e);
                }

                List<ReservationDTO> newDataList = new ArrayList<>();

                for (String tmp : listSign) {

                    Kunde kunde = Factories.createNewKunde().setKundennummer(new Random().nextInt(sizeKunde-1) + 1);
                    Fahrzeug fahrzeug = Factories.createNewFahrzeug().setKennzeichen(tmp);

                    newDataList.add(DTOFactory.createNewReservationDTO().setFahrzeug(fahrzeug).setKunde(kunde));
                }
                dataList = newDataList;
            }
            return dataList;
        }
    }
}
