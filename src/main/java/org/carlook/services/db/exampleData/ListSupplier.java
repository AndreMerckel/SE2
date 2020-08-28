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
                list.add(Factories.createNewFahrzeug().setHersteller("Mazda").setBeschreibung("Kindersitz im Kofferraum").setKraftstoff("Diesel").setBaujahr(2018).setModell("Concerto").setFahrgestellnummer("WBA1K5C55FV233044").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "5938")).setVertriebler(46).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Ford").setBeschreibung("gutes Entetainment-System").setKraftstoff("Gas").setBaujahr(2019).setModell("Integra SJ").setFahrgestellnummer("3D7LP2ET8AG786303").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "9236")).setVertriebler(3).setLocation("Rheinbach"));
                list.add(Factories.createNewFahrzeug().setHersteller("Dodge").setBeschreibung("mit Ledersitze").setKraftstoff("Elektro").setBaujahr(2019).setModell("Elysion").setFahrgestellnummer("JTHFE2C25A2530070").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "8061")).setVertriebler(32).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mercury").setBeschreibung("Ganzjahresreifen").setKraftstoff("Diesel").setBaujahr(2019).setModell("Integra SJ").setFahrgestellnummer("WAUFEBFM2CA942855").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "5482")).setVertriebler(31).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Ford").setBeschreibung("Confort-Ausstattung").setKraftstoff("Diesel").setBaujahr(2019).setModell("CR-X").setFahrgestellnummer("4USFE43547L257126").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "0478")).setVertriebler(29).setLocation("Rheinbach"));
                list.add(Factories.createNewFahrzeug().setHersteller("Saturn").setBeschreibung("Kindersitz im Kofferraum").setKraftstoff("Benzin").setBaujahr(2017).setModell("Rafaga").setFahrgestellnummer("1G6AH5SX8D0880636").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "7123")).setVertriebler(15).setLocation("Siegburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Hummer").setBeschreibung("Ganzjahresreifen").setKraftstoff("Gas").setBaujahr(2018).setModell("Concerto").setFahrgestellnummer("2G4WB55K511023691").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "9328")).setVertriebler(30).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Pontiac").setBeschreibung("Klimaautomatik").setKraftstoff("Elektro").setBaujahr(2017).setModell("Insight").setFahrgestellnummer("1FMEU7FE0AU903984").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "9801")).setVertriebler(19).setLocation("Rheinbach"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mercury").setBeschreibung("begehrt!").setKraftstoff("Benzin").setBaujahr(2017).setModell("Capa").setFahrgestellnummer("KL4CJESBXDB344610").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "3609")).setVertriebler(50).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Hyundai").setBeschreibung("unfallfrei mit vielen Extras").setKraftstoff("Benzin").setBaujahr(2018).setModell("Orthia").setFahrgestellnummer("WBABN53453J280421").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "4514")).setVertriebler(41).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Subaru").setBeschreibung("Kindersitz im Kofferraum").setKraftstoff("Gas").setBaujahr(2020).setModell("Concerto").setFahrgestellnummer("WBAKE5C50DJ578742").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "0117")).setVertriebler(4).setLocation("Rheinbach"));
                list.add(Factories.createNewFahrzeug().setHersteller("Dodge").setBeschreibung("Gepflegtes Auto").setKraftstoff("Elektro").setBaujahr(2017).setModell("Prelude").setFahrgestellnummer("SALAG2D4XAA975540").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "5705")).setVertriebler(31).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Nissan").setBeschreibung("mit Ledersitze").setKraftstoff("Diesel").setBaujahr(2020).setModell("City").setFahrgestellnummer("5J8TB3H3XFL505849").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "2771")).setVertriebler(40).setLocation("Hennef"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mitsubishi").setBeschreibung("kleiner Unfallschaden").setKraftstoff("Elektro").setBaujahr(2020).setModell("Insight").setFahrgestellnummer("JH4CL95904C701642").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "1043")).setVertriebler(12).setLocation("Hennef"));
                list.add(Factories.createNewFahrzeug().setHersteller("Buick").setBeschreibung("mit Ledersitze").setKraftstoff("Benzin").setBaujahr(2019).setModell("Fit").setFahrgestellnummer("WAUVT68E04A535259").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "0574")).setVertriebler(29).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Bentley").setBeschreibung("kleiner Unfallschaden").setKraftstoff("Gas").setBaujahr(2020).setModell("Life").setFahrgestellnummer("WAUEF98E07A168392").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "2555")).setVertriebler(21).setLocation("Siegburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Jeep").setBeschreibung("mit Ledersitze").setKraftstoff("Elektro").setBaujahr(2020).setModell("Mobilio").setFahrgestellnummer("3D73M3HL5AG071554").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "0573")).setVertriebler(38).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("BMW").setBeschreibung("Unsere Besten!").setKraftstoff("Benzin").setBaujahr(2019).setModell("Ridgeline").setFahrgestellnummer("1GYS3SKJ6FR539349").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "1544")).setVertriebler(22).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("GMC").setBeschreibung("Klimaautomatik").setKraftstoff("Diesel").setBaujahr(2018).setModell("Civic").setFahrgestellnummer("4T1BF1FK3CU811502").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "3951")).setVertriebler(28).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Pontiac").setBeschreibung("Highline").setKraftstoff("Diesel").setBaujahr(2020).setModell("CR-Z").setFahrgestellnummer("3C6TD4DT2CG728214").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "9541")).setVertriebler(12).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Volkswagen").setBeschreibung("mit Ledersitze").setKraftstoff("Gas").setBaujahr(2020).setModell("Fit").setFahrgestellnummer("WBS3C9C58FP326346").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "1797")).setVertriebler(26).setLocation("Rheinbach"));
                list.add(Factories.createNewFahrzeug().setHersteller("Infiniti").setBeschreibung("begehrt!").setKraftstoff("Elektro").setBaujahr(2019).setModell("Ridgeline").setFahrgestellnummer("1GD02ZCG6EF908525").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "4294")).setVertriebler(4).setLocation("Rheinbach"));
                list.add(Factories.createNewFahrzeug().setHersteller("Chrysler").setBeschreibung("Ganzjahresreifen").setKraftstoff("Gas").setBaujahr(2019).setModell("Capa").setFahrgestellnummer("WAUPL68E45A927865").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "0419")).setVertriebler(49).setLocation("Siegburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Chevrolet").setBeschreibung("elektrisch verstellbare Sitze").setKraftstoff("Diesel").setBaujahr(2017).setModell("Partner").setFahrgestellnummer("3C3CFFAR9FT769950").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "6768")).setVertriebler(33).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Volkswagen").setBeschreibung("unfallfrei mit vielen Extras").setKraftstoff("Diesel").setBaujahr(2018).setModell("Logo").setFahrgestellnummer("WAU2MAFC1FN443433").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "8248")).setVertriebler(21).setLocation("Hennef"));
                list.add(Factories.createNewFahrzeug().setHersteller("Land Rover").setBeschreibung("Klimaautomatik").setKraftstoff("Elektro").setBaujahr(2017).setModell("Accord").setFahrgestellnummer("WBAPK7C51BA043751").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "6179")).setVertriebler(2).setLocation("Siegburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Hyundai").setBeschreibung("begehrt!").setKraftstoff("Elektro").setBaujahr(2018).setModell("MDX").setFahrgestellnummer("1GYFC66808R640485").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "4940")).setVertriebler(4).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Cadillac").setBeschreibung("Confort-Ausstattung").setKraftstoff("Gas").setBaujahr(2017).setModell("Inspire").setFahrgestellnummer("19UUA9F28DA849998").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "4686")).setVertriebler(42).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Chevrolet").setBeschreibung("Confort-Ausstattung").setKraftstoff("Diesel").setBaujahr(2019).setModell("FR-V").setFahrgestellnummer("5TDDK3DC3DS299634").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "9123")).setVertriebler(24).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Chevrolet").setBeschreibung("mit Ledersitze").setKraftstoff("Benzin").setBaujahr(2020).setModell("Fit Aria").setFahrgestellnummer("SALAB2D42AA638858").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "9948")).setVertriebler(11).setLocation("Rheinbach"));
                list.add(Factories.createNewFahrzeug().setHersteller("Nissan").setBeschreibung("unfallfrei mit vielen Extras").setKraftstoff("Diesel").setBaujahr(2019).setModell("CR-X").setFahrgestellnummer("2G4GR5ER5D9518122").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "6690")).setVertriebler(4).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mitsubishi").setBeschreibung("Gepflegtes Auto").setKraftstoff("Gas").setBaujahr(2019).setModell("Insight").setFahrgestellnummer("WBSDE93431B480023").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "6018")).setVertriebler(32).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("GMC").setBeschreibung("begehrt!").setKraftstoff("Diesel").setBaujahr(2017).setModell("FR-V").setFahrgestellnummer("3C4PDDAG5ET554232").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "6054")).setVertriebler(28).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("GMC").setBeschreibung("elektrisch verstellbare Sitze").setKraftstoff("Elektro").setBaujahr(2019).setModell("Crossroad").setFahrgestellnummer("WBA5A5C55FD780289").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "2478")).setVertriebler(39).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Chevrolet").setBeschreibung("kleiner Unfallschaden").setKraftstoff("Gas").setBaujahr(2019).setModell("Elysion").setFahrgestellnummer("19XFB2E27CE690142").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "5823")).setVertriebler(41).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mercedes-Benz").setBeschreibung("elektrisch verstellbare Sitze").setKraftstoff("Diesel").setBaujahr(2017).setModell("Insight").setFahrgestellnummer("JN1CV6AP2CM895276").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "0480")).setVertriebler(21).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Isuzu").setBeschreibung("Confort-Ausstattung").setKraftstoff("Elektro").setBaujahr(2018).setModell("Jazz").setFahrgestellnummer("1N6AF0KY2EN450911").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "2583")).setVertriebler(13).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("GMC").setBeschreibung("unfallfrei mit vielen Extras").setKraftstoff("Benzin").setBaujahr(2017).setModell("Edix").setFahrgestellnummer("3D7TP2CT4BG723400").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "7757")).setVertriebler(17).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Suzuki").setBeschreibung("begehrt!").setKraftstoff("Benzin").setBaujahr(2019).setModell("Crosstour").setFahrgestellnummer("WDBSK7AA9CF905534").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "3793")).setVertriebler(7).setLocation("Hennef"));
                list.add(Factories.createNewFahrzeug().setHersteller("Honda").setBeschreibung("Ganzjahresreifen").setKraftstoff("Diesel").setBaujahr(2020).setModell("Crossroad").setFahrgestellnummer("WBANA535X5B381940").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "1057")).setVertriebler(30).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Ford").setBeschreibung("elektrisch verstellbare Sitze").setKraftstoff("Benzin").setBaujahr(2020).setModell("Capa").setFahrgestellnummer("1G6AH5R39F0409424").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "9350")).setVertriebler(18).setLocation("Hennef"));
                list.add(Factories.createNewFahrzeug().setHersteller("Volkswagen").setBeschreibung("kleiner Unfallschaden").setKraftstoff("Elektro").setBaujahr(2018).setModell("Insight").setFahrgestellnummer("1GYUKAEF8AR943341").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "8673")).setVertriebler(22).setLocation("Hennef"));
                list.add(Factories.createNewFahrzeug().setHersteller("GMC").setBeschreibung("kleiner Unfallschaden").setKraftstoff("Elektro").setBaujahr(2018).setModell("Partner").setFahrgestellnummer("JN8AE2KP0C9029675").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "9614")).setVertriebler(6).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Lincoln").setBeschreibung("Klimaautomatik").setKraftstoff("Benzin").setBaujahr(2020).setModell("Prelude").setFahrgestellnummer("WBANN73516C577499").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "0537")).setVertriebler(3).setLocation("Hennef"));
                list.add(Factories.createNewFahrzeug().setHersteller("Pontiac").setBeschreibung("begehrt!").setKraftstoff("Diesel").setBaujahr(2017).setModell("NSX").setFahrgestellnummer("137ZA90381E550914").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "1337")).setVertriebler(45).setLocation("Rheinbach"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mazda").setBeschreibung("Ganzjahresreifen").setKraftstoff("Diesel").setBaujahr(2018).setModell("FR-V").setFahrgestellnummer("3D73Y4EL7AG778797").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "8415")).setVertriebler(19).setLocation("Rheinbach"));
                list.add(Factories.createNewFahrzeug().setHersteller("Jeep").setBeschreibung("mit Ledersitze").setKraftstoff("Elektro").setBaujahr(2019).setModell("Life").setFahrgestellnummer("3VW507AT1EM329993").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "2788")).setVertriebler(33).setLocation("Hennef"));
                list.add(Factories.createNewFahrzeug().setHersteller("Toyota").setBeschreibung("Highline").setKraftstoff("Gas").setBaujahr(2017).setModell("Insight").setFahrgestellnummer("JTHKD5BH9E2759382").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "0192")).setVertriebler(43).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Toyota").setBeschreibung("Ganzjahresreifen").setKraftstoff("Elektro").setBaujahr(2020).setModell("City").setFahrgestellnummer("WBADW3C51CE623205").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "2104")).setVertriebler(22).setLocation("Siegburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mercedes-Benz").setBeschreibung("unfallfrei mit vielen Extras").setKraftstoff("Benzin").setBaujahr(2018).setModell("Domani").setFahrgestellnummer("1G6YV36A175050492").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "9256")).setVertriebler(11).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Ford").setBeschreibung("elektrisch verstellbare Sitze").setKraftstoff("Gas").setBaujahr(2017).setModell("NSX").setFahrgestellnummer("5J6TF1H58EL542951").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "1958")).setVertriebler(37).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mitsubishi").setBeschreibung("Klimaautomatik").setKraftstoff("Gas").setBaujahr(2017).setModell("Insight").setFahrgestellnummer("JTDBT4K35A1832170").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "8994")).setVertriebler(47).setLocation("Siegburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Volkswagen").setBeschreibung("elektrisch verstellbare Sitze").setKraftstoff("Diesel").setBaujahr(2020).setModell("Accord").setFahrgestellnummer("19UUA66274A679261").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "4311")).setVertriebler(2).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Ford").setBeschreibung("gutes Entetainment-System").setKraftstoff("Elektro").setBaujahr(2017).setModell("Capa").setFahrgestellnummer("WAUGGAFR3EA391665").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "6438")).setVertriebler(7).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Chevrolet").setBeschreibung("Gepflegtes Auto").setKraftstoff("Diesel").setBaujahr(2019).setModell("Airwave").setFahrgestellnummer("WA1CMAFP0EA664340").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "2258")).setVertriebler(14).setLocation("Rheinbach"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mitsubishi").setBeschreibung("gutes Entetainment-System").setKraftstoff("Gas").setBaujahr(2019).setModell("Domani").setFahrgestellnummer("WBAVB73517K513530").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "2970")).setVertriebler(16).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("GMC").setBeschreibung("mit Ledersitze").setKraftstoff("Gas").setBaujahr(2018).setModell("Element").setFahrgestellnummer("5FNRL3H26AB005146").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "4890")).setVertriebler(25).setLocation("Rheinbach"));
                list.add(Factories.createNewFahrzeug().setHersteller("Aston Martin").setBeschreibung("unfallfrei mit vielen Extras").setKraftstoff("Elektro").setBaujahr(2019).setModell("Pilot").setFahrgestellnummer("JH4DC53826S670863").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "4781")).setVertriebler(23).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Kia").setBeschreibung("unfallfrei mit vielen Extras").setKraftstoff("Elektro").setBaujahr(2020).setModell("Element").setFahrgestellnummer("WAUJFAFH2BN570722").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "3421")).setVertriebler(25).setLocation("Hennef"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mitsubishi").setBeschreibung("elektrisch verstellbare Sitze").setKraftstoff("Elektro").setBaujahr(2018).setModell("Integra").setFahrgestellnummer("WBAVA33538P330372").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "5108")).setVertriebler(39).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("BMW").setBeschreibung("elektrisch verstellbare Sitze").setKraftstoff("Elektro").setBaujahr(2020).setModell("Jazz").setFahrgestellnummer("JN8AE2KP8C9845243").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "8321")).setVertriebler(22).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Dodge").setBeschreibung("elektrisch verstellbare Sitze").setKraftstoff("Gas").setBaujahr(2018).setModell("CR-X").setFahrgestellnummer("WA1LGBFE7CD352975").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "5039")).setVertriebler(4).setLocation("Rheinbach"));
                list.add(Factories.createNewFahrzeug().setHersteller("Volvo").setBeschreibung("elektrisch verstellbare Sitze").setKraftstoff("Benzin").setBaujahr(2019).setModell("Element").setFahrgestellnummer("1G6AB5R36D0542995").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "9204")).setVertriebler(25).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Scion").setBeschreibung("Kindersitz im Kofferraum").setKraftstoff("Diesel").setBaujahr(2020).setModell("Ridgeline").setFahrgestellnummer("1G4GC5ER2DF957920").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "5869")).setVertriebler(32).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Ford").setBeschreibung("gutes Entetainment-System").setKraftstoff("Gas").setBaujahr(2019).setModell("HR-V").setFahrgestellnummer("5GADS13SX72180246").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "2489")).setVertriebler(38).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Hyundai").setBeschreibung("Unsere Besten!").setKraftstoff("Diesel").setBaujahr(2018).setModell("Orthia").setFahrgestellnummer("3C4PDDDG4CT860329").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "1743")).setVertriebler(25).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Ford").setBeschreibung("Kindersitz im Kofferraum").setKraftstoff("Diesel").setBaujahr(2020).setModell("CR-X").setFahrgestellnummer("5GAEV23798J114453").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "9544")).setVertriebler(21).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Ford").setBeschreibung("Gepflegtes Auto").setKraftstoff("Elektro").setBaujahr(2020).setModell("Elysion").setFahrgestellnummer("WBALZ5C5XCD034075").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "7886")).setVertriebler(32).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Jaguar").setBeschreibung("Unsere Besten!").setKraftstoff("Elektro").setBaujahr(2018).setModell("CR-V").setFahrgestellnummer("1FMEU5DE1AU471526").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "8542")).setVertriebler(22).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Honda").setBeschreibung("kleiner Unfallschaden").setKraftstoff("Elektro").setBaujahr(2019).setModell("Prelude").setFahrgestellnummer("JH4KC1F5XEC233705").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "2442")).setVertriebler(42).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("BMW").setBeschreibung("Ganzjahresreifen").setKraftstoff("Elektro").setBaujahr(2019).setModell("City").setFahrgestellnummer("WAUHE78P48A519313").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "1656")).setVertriebler(10).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mitsubishi").setBeschreibung("Unsere Besten!").setKraftstoff("Diesel").setBaujahr(2020).setModell("Passport").setFahrgestellnummer("2T1BPRHE2EC961608").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "3539")).setVertriebler(50).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Pontiac").setBeschreibung("mit Ledersitze").setKraftstoff("Elektro").setBaujahr(2017).setModell("Logo").setFahrgestellnummer("1G6DE5EG6A0882379").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "5797")).setVertriebler(46).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("GMC").setBeschreibung("Ganzjahresreifen").setKraftstoff("Gas").setBaujahr(2018).setModell("Crosstour").setFahrgestellnummer("1FTWX3A56AE344385").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "4721")).setVertriebler(27).setLocation("Rheinbach"));
                list.add(Factories.createNewFahrzeug().setHersteller("GMC").setBeschreibung("Highline").setKraftstoff("Elektro").setBaujahr(2020).setModell("Civic").setFahrgestellnummer("5LMJJ2H51AE952550").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "5347")).setVertriebler(11).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Ford").setBeschreibung("kleiner Unfallschaden").setKraftstoff("Diesel").setBaujahr(2018).setModell("Mobilio").setFahrgestellnummer("JTDKDTB38F1997063").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "2877")).setVertriebler(4).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Volkswagen").setBeschreibung("elektrisch verstellbare Sitze").setKraftstoff("Gas").setBaujahr(2019).setModell("Partner").setFahrgestellnummer("JTHBB1BAXA2090180").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "3207")).setVertriebler(1).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Chevrolet").setBeschreibung("Confort-Ausstattung").setKraftstoff("Gas").setBaujahr(2019).setModell("Fit").setFahrgestellnummer("WBAYP9C56FD365968").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "3564")).setVertriebler(21).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mercury").setBeschreibung("Kindersitz im Kofferraum").setKraftstoff("Gas").setBaujahr(2020).setModell("Logo").setFahrgestellnummer("3D7TP2CT0BG757091").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "6653")).setVertriebler(38).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Nissan").setBeschreibung("elektrisch verstellbare Sitze").setKraftstoff("Benzin").setBaujahr(2019).setModell("FR-V").setFahrgestellnummer("WBABV13464J835581").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "7103")).setVertriebler(37).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Toyota").setBeschreibung("Klimaautomatik").setKraftstoff("Elektro").setBaujahr(2017).setModell("Element").setFahrgestellnummer("YV140MEB5F1648045").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "4058")).setVertriebler(21).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Dodge").setBeschreibung("Klimaautomatik").setKraftstoff("Elektro").setBaujahr(2018).setModell("Passport").setFahrgestellnummer("1G6AF5S38D0561952").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "5125")).setVertriebler(24).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Audi").setBeschreibung("Highline").setKraftstoff("Gas").setBaujahr(2020).setModell("FR-V").setFahrgestellnummer("WAUVT68E14A043632").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "0810")).setVertriebler(7).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mercedes-Benz").setBeschreibung("Unsere Besten!").setKraftstoff("Gas").setBaujahr(2020).setModell("NSX").setFahrgestellnummer("JH4KB16687C212611").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "7521")).setVertriebler(10).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Toyota").setBeschreibung("Confort-Ausstattung").setKraftstoff("Elektro").setBaujahr(2019).setModell("Orthia").setFahrgestellnummer("2T2BK1BA0AC721579").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "1714")).setVertriebler(40).setLocation("Rheinbach"));
                list.add(Factories.createNewFahrzeug().setHersteller("Dodge").setBeschreibung("kleiner Unfallschaden").setKraftstoff("Elektro").setBaujahr(2017).setModell("Accord").setFahrgestellnummer("2T2BK1BA7FC249095").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "5497")).setVertriebler(20).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Dodge").setBeschreibung("Unsere Besten!").setKraftstoff("Gas").setBaujahr(2020).setModell("Odyssey").setFahrgestellnummer("WAULD64B64N244063").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "0363")).setVertriebler(4).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mazda").setBeschreibung("elektrisch verstellbare Sitze").setKraftstoff("Diesel").setBaujahr(2018).setModell("Rafaga").setFahrgestellnummer("3N1AB6AP5AL755942").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "9221")).setVertriebler(1).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Volvo").setBeschreibung("kleiner Unfallschaden").setKraftstoff("Benzin").setBaujahr(2018).setModell("Ascot").setFahrgestellnummer("2G4GV5GV7C9892090").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "6525")).setVertriebler(26).setLocation("Hennef"));
                list.add(Factories.createNewFahrzeug().setHersteller("Dodge").setBeschreibung("elektrisch verstellbare Sitze").setKraftstoff("Benzin").setBaujahr(2019).setModell("Life").setFahrgestellnummer("1D4RE2GG2BC363511").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "8889")).setVertriebler(38).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Acura").setBeschreibung("Ganzjahresreifen").setKraftstoff("Diesel").setBaujahr(2020).setModell("Orthia").setFahrgestellnummer("WBAHL03516D625149").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "1209")).setVertriebler(11).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Lexus").setBeschreibung("Klimaautomatik").setKraftstoff("Elektro").setBaujahr(2019).setModell("Integra").setFahrgestellnummer("WAUBVAFB4BN020232").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "7117")).setVertriebler(34).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Dodge").setBeschreibung("Kindersitz im Kofferraum").setKraftstoff("Benzin").setBaujahr(2018).setModell("NSX").setFahrgestellnummer("5N1AA0NC5EN073648").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "7601")).setVertriebler(16).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Volkswagen").setBeschreibung("unfallfrei mit vielen Extras").setKraftstoff("Gas").setBaujahr(2018).setModell("Jazz").setFahrgestellnummer("2C3CDXCT1DH005214").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "4327")).setVertriebler(45).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Ford").setBeschreibung("begehrt!").setKraftstoff("Benzin").setBaujahr(2020).setModell("Crosstour").setFahrgestellnummer("WVWAA7AJ6BW520186").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "2585")).setVertriebler(23).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Dodge").setBeschreibung("Highline").setKraftstoff("Elektro").setBaujahr(2019).setModell("Element").setFahrgestellnummer("2G4GV5EV1B9926736").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "8056")).setVertriebler(10).setLocation("Hennef"));
                list.add(Factories.createNewFahrzeug().setHersteller("Chevrolet").setBeschreibung("begehrt!").setKraftstoff("Elektro").setBaujahr(2020).setModell("Fit Aria").setFahrgestellnummer("JTHBE1KSXB0545736").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "2798")).setVertriebler(36).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Honda").setBeschreibung("Klimaautomatik").setKraftstoff("Diesel").setBaujahr(2019).setModell("Civic").setFahrgestellnummer("5GALVBED1AJ917953").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "4658")).setVertriebler(25).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Honda").setBeschreibung("elektrisch verstellbare Sitze").setKraftstoff("Diesel").setBaujahr(2019).setModell("Accord").setFahrgestellnummer("WA1DMAFP3FA282406").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "7218")).setVertriebler(20).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("GMC").setBeschreibung("elektrisch verstellbare Sitze").setKraftstoff("Elektro").setBaujahr(2018).setModell("Elysion").setFahrgestellnummer("SCFFDCCD8CG121337").setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(Parameter.KENNZEICHEN + "1151")).setVertriebler(15).setLocation("Rheinbach"));
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
