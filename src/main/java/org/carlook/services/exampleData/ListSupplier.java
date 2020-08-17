package org.carlook.services.exampleData;

import org.carlook.controller.exception.DatabaseException;
import org.carlook.factories.DTOFactory;
import org.carlook.factories.Factories;
import org.carlook.model.dao.FahrzeugDAO;
import org.carlook.model.dao.KundeReserviertFahrzeugDAO;
import org.carlook.model.objects.dto.FahrzeugDTO;
import org.carlook.model.objects.dto.KundeDTO;
import org.carlook.model.objects.dto.ReservationDTO;
import org.carlook.model.objects.dto.UserDTO;
import org.carlook.model.objects.entities.Fahrzeug;

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

                list.add(DTOFactory.createNewUserDTO().setVorname("Richie").setNachname("Wainscot").setEmail("rwainscot0@carlook.de").setPassword("kz9gZs"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Kimball").setNachname("Chessun").setEmail("kchessun1@carlook.de").setPassword("3COw0c"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Nichole").setNachname("Nann").setEmail("nnann2@carlook.de").setPassword("xKrezzhY0"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Hetty").setNachname("Pesik").setEmail("hpesik3@carlook.de").setPassword("VU3kLqw"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Bernice").setNachname("Chalice").setEmail("bchalice4@carlook.de").setPassword("NXrPh"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Janela").setNachname("Nuschke").setEmail("jnuschke5@carlook.de").setPassword("mqhvgLeHKB"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Donia").setNachname("Garnam").setEmail("dgarnam6@carlook.de").setPassword("gE0FY"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Nariko").setNachname("Western").setEmail("nwestern7@carlook.de").setPassword("OafvUGsemQ"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Cullin").setNachname("Monketon").setEmail("cmonketon8@carlook.de").setPassword("IQs9Nob9Ldo"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Jaquelyn").setNachname("Del Castello").setEmail("jdelcastello9@carlook.de").setPassword("HqWZwo2rXl"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Sean").setNachname("Garber").setEmail("sgarbera@carlook.de").setPassword("WuP9aMAEv8"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Cornela").setNachname("Iddens").setEmail("ciddensb@carlook.de").setPassword("SMcvlG"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Claretta").setNachname("Watton").setEmail("cwattonc@carlook.de").setPassword("r4HdeojAq8"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Quintina").setNachname("Jellett").setEmail("qjellettd@carlook.de").setPassword("mA0qErG8"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Moina").setNachname("Skene").setEmail("mskenee@carlook.de").setPassword("kb1RvQQDa"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Read").setNachname("Master").setEmail("rmasterf@carlook.de").setPassword("Fv5hpGBSE"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Filberte").setNachname("Prue").setEmail("fprueg@carlook.de").setPassword("mPt3ffpx"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Garvin").setNachname("Brithman").setEmail("gbrithmanh@carlook.de").setPassword("BvrIqj"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Emmery").setNachname("Matz").setEmail("ematzi@carlook.de").setPassword("OUpIdEdDB"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Yetty").setNachname("Jagoe").setEmail("yjagoej@carlook.de").setPassword("kU4vXdXQx"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Burt").setNachname("Batchley").setEmail("bbatchleyk@carlook.de").setPassword("nkvk6k"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Trisha").setNachname("Mullender").setEmail("tmullenderl@carlook.de").setPassword("RREkoLBy"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Toma").setNachname("Kassidy").setEmail("tkassidym@carlook.de").setPassword("6yp3Slo7X"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Cathlene").setNachname("Billany").setEmail("cbillanyn@carlook.de").setPassword("uloxLSzSf9H"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Lucille").setNachname("Brightling").setEmail("lbrightlingo@carlook.de").setPassword("fH8Z7fBH"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Guillemette").setNachname("Hallowell").setEmail("ghallowellp@carlook.de").setPassword("0hI8BkLs7"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Killian").setNachname("Shearsby").setEmail("kshearsbyq@carlook.de").setPassword("V0BLZOokuQd"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Wynn").setNachname("Epps").setEmail("weppsr@carlook.de").setPassword("BGxB2Hw2Y"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Ethelyn").setNachname("Pennino").setEmail("epenninos@carlook.de").setPassword("Wq8sJ5"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Reider").setNachname("Lacotte").setEmail("rlacottet@carlook.de").setPassword("UNZsX5aF7Lw"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Brandy").setNachname("Ormonde").setEmail("bormondeu@carlook.de").setPassword("H09f56rTynM"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Barney").setNachname("Pethybridge").setEmail("bpethybridgev@carlook.de").setPassword("gMwBJQ0ML6"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Billie").setNachname("D'Antoni").setEmail("bdantoniw@carlook.de").setPassword("nmeltFqZZx"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Elie").setNachname("Trudgian").setEmail("etrudgianx@carlook.de").setPassword("eoodCd2we"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Pippy").setNachname("Korneichik").setEmail("pkorneichiky@carlook.de").setPassword("V9wXhF"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Sigrid").setNachname("Heam").setEmail("sheamz@carlook.de").setPassword("aHIf9SV5yUr"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Rawley").setNachname("Sheahan").setEmail("rsheahan10@carlook.de").setPassword("8AKk8RBPA"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Tuck").setNachname("Shrimpling").setEmail("tshrimpling11@carlook.de").setPassword("buhGVmvHjq2"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Brade").setNachname("Starmer").setEmail("bstarmer12@carlook.de").setPassword("jXpsuve"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Tyson").setNachname("Haresnape").setEmail("tharesnape13@carlook.de").setPassword("EYZP4l2"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Zonda").setNachname("Bullas").setEmail("zbullas14@carlook.de").setPassword("tXDJ37KjD"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Nicki").setNachname("Prayer").setEmail("nprayer15@carlook.de").setPassword("oYaOp"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Harald").setNachname("Lever").setEmail("hlever16@carlook.de").setPassword("Y2EtMM6D"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Esmeralda").setNachname("Batchellor").setEmail("ebatchellor17@carlook.de").setPassword("iXFuzg"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Bendix").setNachname("Moloney").setEmail("bmoloney18@carlook.de").setPassword("r0Giy"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Catherine").setNachname("Satterly").setEmail("csatterly19@carlook.de").setPassword("73L4qw6s1"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Emmye").setNachname("Ossulton").setEmail("eossulton1a@carlook.de").setPassword("mEoJvfyW"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Tova").setNachname("Lamond").setEmail("tlamond1b@carlook.de").setPassword("P1EHyGQiX"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Paola").setNachname("Castles").setEmail("pcastles1c@carlook.de").setPassword("fNOSW1UlM"));
                list.add(DTOFactory.createNewUserDTO().setVorname("Mile").setNachname("McDonnell").setEmail("mmcdonnell1d@carlook.de").setPassword("TuKtBDiaVUn"));
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
                list.add(Factories.createNewFahrzeug().setHersteller("Ford").setBeschreibung("Gossling").setKraftstoff("Diesel").setBaujahr(2017).setModell("Quint").setFahrgestellnummer("WVGAV3AX7DW214002").setKennzeichen("SU-CL-0094").setVertriebler(39).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Chevrolet").setBeschreibung("Bonifazio").setKraftstoff("Gas").setBaujahr(2018).setModell("Pilot").setFahrgestellnummer("1G4CU541654103405").setKennzeichen("SU-CL-0385").setVertriebler(22).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Chevrolet").setBeschreibung("Cheney").setKraftstoff("Gas").setBaujahr(2019).setModell("Logo").setFahrgestellnummer("JM1DE1KYXE0703947").setKennzeichen("SU-CL-8915").setVertriebler(5).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Volkswagen").setBeschreibung("Madre").setKraftstoff("Elektro").setBaujahr(2017).setModell("Legend").setFahrgestellnummer("WAUEF78E37A212342").setKennzeichen("SU-CL-0959").setVertriebler(2).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Subaru").setBeschreibung("Woodyeare").setKraftstoff("Elektro").setBaujahr(2019).setModell("CR-V").setFahrgestellnummer("SAJWA4EC8DM022944").setKennzeichen("SU-CL-4751").setVertriebler(37).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("BMW").setBeschreibung("Scheu").setKraftstoff("Diesel").setBaujahr(2017).setModell("Prelude").setFahrgestellnummer("WBA5B1C51FG277461").setKennzeichen("SU-CL-1035").setVertriebler(39).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Chevrolet").setBeschreibung("Golborn").setKraftstoff("Benzin").setBaujahr(2018).setModell("Ascot").setFahrgestellnummer("SAJWA1CZ8E8280543").setKennzeichen("SU-CL-1261").setVertriebler(10).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Maserati").setBeschreibung("Milington").setKraftstoff("Diesel").setBaujahr(2017).setModell("Avancier").setFahrgestellnummer("2V4RW3D10AR406139").setKennzeichen("SU-CL-8804").setVertriebler(17).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Jeep").setBeschreibung("Bromilow").setKraftstoff("Benzin").setBaujahr(2018).setModell("Passport").setFahrgestellnummer("5N1AT2ML5EC362399").setKennzeichen("SU-CL-7229").setVertriebler(5).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Chevrolet").setBeschreibung("Payze").setKraftstoff("Benzin").setBaujahr(2019).setModell("Avancier").setFahrgestellnummer("JHMZF1C67ES664916").setKennzeichen("SU-CL-3139").setVertriebler(12).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Jaguar").setBeschreibung("Bottell").setKraftstoff("Elektro").setBaujahr(2019).setModell("Fit").setFahrgestellnummer("1FTEX1E8XAF697601").setKennzeichen("SU-CL-5369").setVertriebler(15).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("GMC").setBeschreibung("Wight").setKraftstoff("Benzin").setBaujahr(2019).setModell("Jazz").setFahrgestellnummer("1G6DK1ED5B0670596").setKennzeichen("SU-CL-1376").setVertriebler(43).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Pontiac").setBeschreibung("Sibson").setKraftstoff("Elektro").setBaujahr(2018).setModell("City").setFahrgestellnummer("WVGFG9BP6CD684386").setKennzeichen("SU-CL-5127").setVertriebler(42).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Hyundai").setBeschreibung("Churchouse").setKraftstoff("Diesel").setBaujahr(2018).setModell("Prelude").setFahrgestellnummer("SCBBR53W36C112121").setKennzeichen("SU-CL-3655").setVertriebler(43).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Toyota").setBeschreibung("Haliburn").setKraftstoff("Diesel").setBaujahr(2018).setModell("Airwave").setFahrgestellnummer("1G6KD54Y72U163947").setKennzeichen("SU-CL-7186").setVertriebler(25).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Subaru").setBeschreibung("Shubotham").setKraftstoff("Diesel").setBaujahr(2019).setModell("Integra").setFahrgestellnummer("1G4GC5G38EF842314").setKennzeichen("SU-CL-1978").setVertriebler(12).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Chevrolet").setBeschreibung("O'Noland").setKraftstoff("Elektro").setBaujahr(2019).setModell("Ridgeline").setFahrgestellnummer("2LMDJ8JK0FB437582").setKennzeichen("SU-CL-7028").setVertriebler(9).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Chevrolet").setBeschreibung("Domnick").setKraftstoff("Gas").setBaujahr(2017).setModell("Logo").setFahrgestellnummer("WA1WMAFE4ED999255").setKennzeichen("SU-CL-0649").setVertriebler(20).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Buick").setBeschreibung("Stopper").setKraftstoff("Diesel").setBaujahr(2018).setModell("Domani").setFahrgestellnummer("WAUFFAFL2FN986138").setKennzeichen("SU-CL-2240").setVertriebler(1).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Volvo").setBeschreibung("Silveston").setKraftstoff("Diesel").setBaujahr(2019).setModell("Integra").setFahrgestellnummer("WBALX3C58CD947914").setKennzeichen("SU-CL-7878").setVertriebler(42).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Ford").setBeschreibung("Crosfield").setKraftstoff("Diesel").setBaujahr(2017).setModell("Inspire").setFahrgestellnummer("1G6AC5S38F0877685").setKennzeichen("SU-CL-1411").setVertriebler(17).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Pontiac").setBeschreibung("Manolov").setKraftstoff("Diesel").setBaujahr(2020).setModell("Crosstour").setFahrgestellnummer("JTHBB1BA5A2153959").setKennzeichen("SU-CL-9284").setVertriebler(34).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Volvo").setBeschreibung("Lerner").setKraftstoff("Gas").setBaujahr(2019).setModell("Civic").setFahrgestellnummer("WVWED7AJ4CW343762").setKennzeichen("SU-CL-7916").setVertriebler(4).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mazda").setBeschreibung("Nutkins").setKraftstoff("Elektro").setBaujahr(2018).setModell("FR-V").setFahrgestellnummer("1GKUKFDJ6AR885520").setKennzeichen("SU-CL-6715").setVertriebler(3).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Infiniti").setBeschreibung("Dibsdale").setKraftstoff("Benzin").setBaujahr(2017).setModell("Element").setFahrgestellnummer("KMHEC4A41FA306466").setKennzeichen("SU-CL-9937").setVertriebler(10).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Porsche").setBeschreibung("Rau").setKraftstoff("Gas").setBaujahr(2020).setModell("Integra").setFahrgestellnummer("1FTKR1AD9BP761137").setKennzeichen("SU-CL-0408").setVertriebler(19).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Hummer").setBeschreibung("Steels").setKraftstoff("Benzin").setBaujahr(2020).setModell("CR-Z").setFahrgestellnummer("1FTEW1E86AF361561").setKennzeichen("SU-CL-6325").setVertriebler(13).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("GMC").setBeschreibung("Richardot").setKraftstoff("Benzin").setBaujahr(2018).setModell("Quint").setFahrgestellnummer("5N1AR1NB1AC288665").setKennzeichen("SU-CL-9107").setVertriebler(12).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Infiniti").setBeschreibung("McCrorie").setKraftstoff("Benzin").setBaujahr(2019).setModell("Rafaga").setFahrgestellnummer("1G6AY5S33F0137673").setKennzeichen("SU-CL-4046").setVertriebler(22).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Porsche").setBeschreibung("Pude").setKraftstoff("Diesel").setBaujahr(2018).setModell("Life").setFahrgestellnummer("5J8TB4H79GL146875").setKennzeichen("SU-CL-3538").setVertriebler(2).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Buick").setBeschreibung("Symes").setKraftstoff("Gas").setBaujahr(2020).setModell("Odyssey").setFahrgestellnummer("WDDHH8HB5BA603058").setKennzeichen("SU-CL-3453").setVertriebler(14).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Kia").setBeschreibung("Archambault").setKraftstoff("Gas").setBaujahr(2020).setModell("Fit").setFahrgestellnummer("1G6AC5S39D0775227").setKennzeichen("SU-CL-8193").setVertriebler(9).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Ford").setBeschreibung("Yeoman").setKraftstoff("Elektro").setBaujahr(2020).setModell("CR-X").setFahrgestellnummer("3C3CFFDR9ET337286").setKennzeichen("SU-CL-7440").setVertriebler(32).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Volkswagen").setBeschreibung("Giraldez").setKraftstoff("Gas").setBaujahr(2018).setModell("Fit").setFahrgestellnummer("5FNRL3H20AB966180").setKennzeichen("SU-CL-1337").setVertriebler(35).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Chevrolet").setBeschreibung("Grogono").setKraftstoff("Benzin").setBaujahr(2020).setModell("Jazz").setFahrgestellnummer("5UXFA13545L288257").setKennzeichen("SU-CL-8669").setVertriebler(43).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Ford").setBeschreibung("Vallentine").setKraftstoff("Benzin").setBaujahr(2020).setModell("Legend").setFahrgestellnummer("1GYUKAEF1AR210211").setKennzeichen("SU-CL-8850").setVertriebler(36).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Volkswagen").setBeschreibung("Caddens").setKraftstoff("Diesel").setBaujahr(2018).setModell("Legend").setFahrgestellnummer("JH4CL96868C547045").setKennzeichen("SU-CL-9374").setVertriebler(33).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Lexus").setBeschreibung("Houselee").setKraftstoff("Gas").setBaujahr(2018).setModell("Civic").setFahrgestellnummer("1G4GG5E36CF148080").setKennzeichen("SU-CL-1962").setVertriebler(37).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Lexus").setBeschreibung("Tuck").setKraftstoff("Elektro").setBaujahr(2020).setModell("CR-Z").setFahrgestellnummer("1C6RD6PT1CS184430").setKennzeichen("SU-CL-4428").setVertriebler(40).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mazda").setBeschreibung("Audsley").setKraftstoff("Elektro").setBaujahr(2019).setModell("Pilot").setFahrgestellnummer("1G6DP577170867904").setKennzeichen("SU-CL-3893").setVertriebler(33).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("BMW").setBeschreibung("Dover").setKraftstoff("Elektro").setBaujahr(2017).setModell("CR-V").setFahrgestellnummer("WAUEFAFL1AN046627").setKennzeichen("SU-CL-1783").setVertriebler(6).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Chrysler").setBeschreibung("Rendell").setKraftstoff("Elektro").setBaujahr(2018).setModell("Odyssey").setFahrgestellnummer("KM8NU4CC9BU938061").setKennzeichen("SU-CL-7500").setVertriebler(50).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Suzuki").setBeschreibung("Gabites").setKraftstoff("Diesel").setBaujahr(2020).setModell("Rafaga").setFahrgestellnummer("19UUA9F27DA687541").setKennzeichen("SU-CL-9630").setVertriebler(32).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mercury").setBeschreibung("Wynrehame").setKraftstoff("Benzin").setBaujahr(2020).setModell("Mobilio").setFahrgestellnummer("JN8AF5MV1FT658458").setKennzeichen("SU-CL-1029").setVertriebler(9).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Toyota").setBeschreibung("Jenteau").setKraftstoff("Gas").setBaujahr(2017).setModell("CR-Z").setFahrgestellnummer("5NPET4AC5AH431225").setKennzeichen("SU-CL-1366").setVertriebler(31).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Saturn").setBeschreibung("Gouny").setKraftstoff("Elektro").setBaujahr(2020).setModell("City").setFahrgestellnummer("WVWAB7AJ3CW689399").setKennzeichen("SU-CL-7928").setVertriebler(30).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Dodge").setBeschreibung("Sutty").setKraftstoff("Benzin").setBaujahr(2020).setModell("Orthia").setFahrgestellnummer("WAUHFAFL1BN322139").setKennzeichen("SU-CL-4134").setVertriebler(18).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Maybach").setBeschreibung("Lindsay").setKraftstoff("Gas").setBaujahr(2020).setModell("NSX").setFahrgestellnummer("W04GP5EC6B1335880").setKennzeichen("SU-CL-7605").setVertriebler(16).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mazda").setBeschreibung("Durbann").setKraftstoff("Diesel").setBaujahr(2018).setModell("Mobilio").setFahrgestellnummer("3VWJX7AJ1AM949150").setKennzeichen("SU-CL-8430").setVertriebler(28).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Saab").setBeschreibung("Aiken").setKraftstoff("Elektro").setBaujahr(2020).setModell("Ascot").setFahrgestellnummer("1G6AB5R31E0039568").setKennzeichen("SU-CL-2455").setVertriebler(24).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Oldsmobile").setBeschreibung("Huckett").setKraftstoff("Benzin").setBaujahr(2017).setModell("Civic").setFahrgestellnummer("3D73Y4HL1AG441716").setKennzeichen("SU-CL-4437").setVertriebler(3).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Honda").setBeschreibung("Eubank").setKraftstoff("Diesel").setBaujahr(2018).setModell("Concerto").setFahrgestellnummer("YV1672MK3B2859341").setKennzeichen("SU-CL-2755").setVertriebler(19).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Toyota").setBeschreibung("Arr").setKraftstoff("Benzin").setBaujahr(2017).setModell("Element").setFahrgestellnummer("1D7RB1GP1AS371531").setKennzeichen("SU-CL-6310").setVertriebler(40).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Kia").setBeschreibung("Collerd").setKraftstoff("Benzin").setBaujahr(2019).setModell("Life").setFahrgestellnummer("WVWED7AJ3BW375374").setKennzeichen("SU-CL-5610").setVertriebler(24).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Volkswagen").setBeschreibung("Shalcras").setKraftstoff("Elektro").setBaujahr(2020).setModell("Edix").setFahrgestellnummer("2T1BU4EE5BC902466").setKennzeichen("SU-CL-7159").setVertriebler(46).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Lexus").setBeschreibung("Low").setKraftstoff("Gas").setBaujahr(2017).setModell("Logo").setFahrgestellnummer("5GALRBED1AJ865583").setKennzeichen("SU-CL-0172").setVertriebler(18).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("GMC").setBeschreibung("Eldon").setKraftstoff("Gas").setBaujahr(2019).setModell("Civic").setFahrgestellnummer("WAUWFAFHXBN883202").setKennzeichen("SU-CL-6933").setVertriebler(9).setLocation("Bonn"));

                list.add(Factories.createNewFahrzeug().setHersteller("Mercedes-Benz").setBeschreibung("Jelly").setKraftstoff("Gas").setBaujahr(2017).setModell("Insight").setFahrgestellnummer("WBAFR1C56BC806145").setKennzeichen("SU-CL-0132").setVertriebler(21).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("MINI").setBeschreibung("Saltsberger").setKraftstoff("Gas").setBaujahr(2020).setModell("Rafaga").setFahrgestellnummer("2G61W5S85F9312884").setKennzeichen("SU-CL-2748").setVertriebler(27).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Buick").setBeschreibung("Shimwall").setKraftstoff("Benzin").setBaujahr(2019).setModell("Rafaga").setFahrgestellnummer("W04GT5GCXB1724496").setKennzeichen("SU-CL-8355").setVertriebler(39).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Volkswagen").setBeschreibung("Hacking").setKraftstoff("Gas").setBaujahr(2020).setModell("Element").setFahrgestellnummer("2C3CA4CD7AH374199").setKennzeichen("SU-CL-2341").setVertriebler(25).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Cadillac").setBeschreibung("Tunno").setKraftstoff("Elektro").setBaujahr(2017).setModell("Edix").setFahrgestellnummer("WAUDF78E68A579801").setKennzeichen("SU-CL-3518").setVertriebler(12).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mercedes-Benz").setBeschreibung("Antonetti").setKraftstoff("Gas").setBaujahr(2019).setModell("Airwave").setFahrgestellnummer("2LMHJ5AR0AB124005").setKennzeichen("SU-CL-7821").setVertriebler(49).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Dodge").setBeschreibung("Valance").setKraftstoff("Elektro").setBaujahr(2020).setModell("NSX").setFahrgestellnummer("5LMJJ3H51CE388195").setKennzeichen("SU-CL-1267").setVertriebler(14).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Bugatti").setBeschreibung("Leak").setKraftstoff("Diesel").setBaujahr(2019).setModell("CR-Z").setFahrgestellnummer("5UXFA93505L308955").setKennzeichen("SU-CL-4567").setVertriebler(3).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("BMW").setBeschreibung("Carnock").setKraftstoff("Gas").setBaujahr(2020).setModell("Rafaga").setFahrgestellnummer("1GYS4JEF6ER652330").setKennzeichen("SU-CL-2853").setVertriebler(1).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Dodge").setBeschreibung("Aldiss").setKraftstoff("Benzin").setBaujahr(2018).setModell("Crosstour").setFahrgestellnummer("3GYFNFEYXBS584295").setKennzeichen("SU-CL-7140").setVertriebler(1).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mazda").setBeschreibung("Danby").setKraftstoff("Gas").setBaujahr(2020).setModell("Legend").setFahrgestellnummer("1G6DM8EG1A0523980").setKennzeichen("SU-CL-4373").setVertriebler(49).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Volkswagen").setBeschreibung("Juliff").setKraftstoff("Diesel").setBaujahr(2018).setModell("Prelude").setFahrgestellnummer("1B3CC1FBXAN604843").setKennzeichen("SU-CL-7626").setVertriebler(1).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Jeep").setBeschreibung("Peare").setKraftstoff("Gas").setBaujahr(2019).setModell("Edix").setFahrgestellnummer("1C6RD6NT6CS927876").setKennzeichen("SU-CL-4647").setVertriebler(10).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Toyota").setBeschreibung("Reames").setKraftstoff("Diesel").setBaujahr(2019).setModell("Accord").setFahrgestellnummer("JM3ER2A55C0256678").setKennzeichen("SU-CL-0019").setVertriebler(24).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("BMW").setBeschreibung("Woolway").setKraftstoff("Elektro").setBaujahr(2019).setModell("Quint").setFahrgestellnummer("WBAGN63585D475564").setKennzeichen("SU-CL-6874").setVertriebler(17).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Isuzu").setBeschreibung("Siebert").setKraftstoff("Elektro").setBaujahr(2020).setModell("Passport").setFahrgestellnummer("WDBSK7AA8CF964722").setKennzeichen("SU-CL-9643").setVertriebler(3).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mercedes-Benz").setBeschreibung("Armsby").setKraftstoff("Elektro").setBaujahr(2020).setModell("Ascot").setFahrgestellnummer("3GYVKNEF4AG377755").setKennzeichen("SU-CL-7486").setVertriebler(48).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Chrysler").setBeschreibung("Jurges").setKraftstoff("Elektro").setBaujahr(2017).setModell("Concerto").setFahrgestellnummer("1G6AY5SX7E0153084").setKennzeichen("SU-CL-5187").setVertriebler(47).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mitsubishi").setBeschreibung("Hazelhurst").setKraftstoff("Elektro").setBaujahr(2020).setModell("Pilot").setFahrgestellnummer("1FMJU1F57AE480875").setKennzeichen("SU-CL-3596").setVertriebler(2).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Infiniti").setBeschreibung("Shapira").setKraftstoff("Gas").setBaujahr(2018).setModell("Partner").setFahrgestellnummer("WAUYP54B61N537366").setKennzeichen("SU-CL-6680").setVertriebler(39).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mitsubishi").setBeschreibung("Bulfield").setKraftstoff("Diesel").setBaujahr(2020).setModell("Gooding").setFahrgestellnummer("WBALL5C50DE565735").setKennzeichen("SU-CL-3751").setVertriebler(9).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Isuzu").setBeschreibung("Rosson").setKraftstoff("Elektro").setBaujahr(2019).setModell("Ridgeline").setFahrgestellnummer("KNDMB5C18F6118977").setKennzeichen("SU-CL-0957").setVertriebler(9).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Suzuki").setBeschreibung("MacCague").setKraftstoff("Benzin").setBaujahr(2017).setModell("Element").setFahrgestellnummer("1G6DL1ED1B0232512").setKennzeichen("SU-CL-7516").setVertriebler(44).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Nissan").setBeschreibung("Hitzschke").setKraftstoff("Benzin").setBaujahr(2017).setModell("Passport").setFahrgestellnummer("KNDPB3ACXF7905798").setKennzeichen("SU-CL-9460").setVertriebler(37).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Chevrolet").setBeschreibung("Georgius").setKraftstoff("Benzin").setBaujahr(2017).setModell("Accord").setFahrgestellnummer("1GYEK63N55R636405").setKennzeichen("SU-CL-5188").setVertriebler(5).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Pontiac").setBeschreibung("Pestridge").setKraftstoff("Elektro").setBaujahr(2018).setModell("Capa").setFahrgestellnummer("JH4CL96816C730849").setKennzeichen("SU-CL-9930").setVertriebler(38).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("GMC").setBeschreibung("Legge").setKraftstoff("Elektro").setBaujahr(2019).setModell("Crossroad").setFahrgestellnummer("5UXFA13555L315367").setKennzeichen("SU-CL-1483").setVertriebler(11).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mercury").setBeschreibung("Dalla").setKraftstoff("Elektro").setBaujahr(2018).setModell("Quint").setFahrgestellnummer("WAUGFBFC7EN363493").setKennzeichen("SU-CL-3380").setVertriebler(42).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Ford").setBeschreibung("Beadel").setKraftstoff("Diesel").setBaujahr(2019).setModell("FCX Clarity").setFahrgestellnummer("2GKALMEK2D6121370").setKennzeichen("SU-CL-6067").setVertriebler(2).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Ford").setBeschreibung("Pardoe").setKraftstoff("Gas").setBaujahr(2018).setModell("Orthia").setFahrgestellnummer("1GKS1CE06ER882699").setKennzeichen("SU-CL-9935").setVertriebler(24).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Hyundai").setBeschreibung("Favey").setKraftstoff("Diesel").setBaujahr(2018).setModell("Civic").setFahrgestellnummer("2C3CDXJG5CH919700").setKennzeichen("SU-CL-4383").setVertriebler(15).setLocation("Berlin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Chevrolet").setBeschreibung("Sinclar").setKraftstoff("Gas").setBaujahr(2020).setModell("Passport").setFahrgestellnummer("WBA5B3C51ED646136").setKennzeichen("SU-CL-2151").setVertriebler(9).setLocation("Bonn"));
                list.add(Factories.createNewFahrzeug().setHersteller("Toyota").setBeschreibung("Eidelman").setKraftstoff("Gas").setBaujahr(2020).setModell("CR-V").setFahrgestellnummer("1FTEX1EW9AF793444").setKennzeichen("SU-CL-7346").setVertriebler(10).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("BMW").setBeschreibung("Bamblett").setKraftstoff("Gas").setBaujahr(2018).setModell("Crosstour").setFahrgestellnummer("WAUEF78E66A705544").setKennzeichen("SU-CL-5637").setVertriebler(32).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Pontiac").setBeschreibung("Halvosen").setKraftstoff("Elektro").setBaujahr(2018).setModell("CR-X").setFahrgestellnummer("2C3CCABG1DH827063").setKennzeichen("SU-CL-3667").setVertriebler(5).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("GMC").setBeschreibung("Alyutin").setKraftstoff("Elektro").setBaujahr(2020).setModell("Life").setFahrgestellnummer("JN1AZ4EH1BM352356").setKennzeichen("SU-CL-1702").setVertriebler(10).setLocation("München"));
                list.add(Factories.createNewFahrzeug().setHersteller("Chrysler").setBeschreibung("Snartt").setKraftstoff("Benzin").setBaujahr(2019).setModell("City").setFahrgestellnummer("WAUVC68E65A915806").setKennzeichen("SU-CL-8001").setVertriebler(24).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Cadillac").setBeschreibung("Carlens").setKraftstoff("Elektro").setBaujahr(2019).setModell("Odyssey").setFahrgestellnummer("WAUDV94F39N183560").setKennzeichen("SU-CL-0255").setVertriebler(14).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Lamborghini").setBeschreibung("Peers").setKraftstoff("Diesel").setBaujahr(2017).setModell("Life").setFahrgestellnummer("3FA6P0SU5FR430398").setKennzeichen("SU-CL-5818").setVertriebler(20).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Honda").setBeschreibung("Gwillym").setKraftstoff("Gas").setBaujahr(2018).setModell("Pilot").setFahrgestellnummer("1FTNF2B57AE676200").setKennzeichen("SU-CL-0079").setVertriebler(44).setLocation("Köln"));
                list.add(Factories.createNewFahrzeug().setHersteller("Ram").setBeschreibung("Broggelli").setKraftstoff("Benzin").setBaujahr(2020).setModell("Ascot").setFahrgestellnummer("WVWGD7AJ5EW118326").setKennzeichen("SU-CL-3482").setVertriebler(16).setLocation("Sankt Augustin"));
                list.add(Factories.createNewFahrzeug().setHersteller("Ford").setBeschreibung("Hawlgarth").setKraftstoff("Benzin").setBaujahr(2019).setModell("Domani").setFahrgestellnummer("1N6AD0CW5FN001646").setKennzeichen("SU-CL-6976").setVertriebler(8).setLocation("Hamburg"));
                list.add(Factories.createNewFahrzeug().setHersteller("Mitsubishi").setBeschreibung("Britee").setKraftstoff("Diesel").setBaujahr(2020).setModell("Logo").setFahrgestellnummer("JH4DC548X4S225699").setKennzeichen("SU-CL-8402").setVertriebler(27).setLocation("Berlin"));

            }
            return list;
        }
    }

    public static class KundeResFahrzg {
        private static List<ReservationDTO> dataList = null;

        public static List<ReservationDTO> getList() {
            if (dataList == null) {
                List<String> listSign = null;
                try {
                    listSign = FahrzeugDAO.getInstance().getKennzeichenRandRows();
                } catch (DatabaseException e) {
                    Logger.getLogger(ExampleData.class.getName()).log(Level.SEVERE, null, e);
                }

                List<ReservationDTO> newDataList = new ArrayList<>();

                for (String tmp : listSign) {

                    KundeDTO kundeDTO = DTOFactory.createNewKundeDTO().setKundennummer(new Random().nextInt(49) + 1);
                    FahrzeugDTO fahrzeugDTO = DTOFactory.createNewFahrzeugDTO().setKennzeichen(tmp);

                    newDataList.add(DTOFactory.createNewReservationDTO().setFahrzeugDTO(fahrzeugDTO).setKundeDTO(kundeDTO));
                }
                dataList = newDataList;
            }
            return dataList;
        }
    }
}
