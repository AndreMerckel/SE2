package org.carlook.AdminClass;

import org.carlook.factories.DTOFactories;
import org.carlook.model.objects.dto.UserDTO;
import org.carlook.services.db.DBCreation;
import org.carlook.services.exampleData.UserData.UserData;

import java.util.ArrayList;
import java.util.List;

public class AdminMain {

    public static void main (String[] args) {

        DBCreation.refreshTables();
        UserData.insertUserData(getList());





    }

    public static List<UserDTO> getList() {
        List<UserDTO> list = new ArrayList<>();
        list.add(DTOFactories.createUserDTO().setVorname("Kata").setNachname("Cadge").setEmail("kcadge0@blogtalkradio.com").setPassword("yWOW3U2"));
        list.add(DTOFactories.createUserDTO().setVorname("Calley").setNachname("Fernier").setEmail("cfernier1@nba.com").setPassword("Fk5rA1J8kfV"));
        list.add(DTOFactories.createUserDTO().setVorname("Trey").setNachname("Yendle").setEmail("tyendle2@macromedia.com").setPassword("UMq8X"));
        list.add(DTOFactories.createUserDTO().setVorname("Sabina").setNachname("Moubray").setEmail("smoubray3@archive.org").setPassword("Wmjpa2SSo"));
        list.add(DTOFactories.createUserDTO().setVorname("Linn").setNachname("Instock").setEmail("linstock4@apache.org").setPassword("nB4QYEnmvo"));
        list.add(DTOFactories.createUserDTO().setVorname("Ives").setNachname("Embling").setEmail("iembling5@nps.gov").setPassword("SUIiWHV"));
        list.add(DTOFactories.createUserDTO().setVorname("Edgard").setNachname("Bussetti").setEmail("ebussetti6@mapy.cz").setPassword("4JPZFwg"));
        list.add(DTOFactories.createUserDTO().setVorname("Mei").setNachname("Carus").setEmail("mcarus7@whitehouse.gov").setPassword("h5dSnuEhKF"));
        list.add(DTOFactories.createUserDTO().setVorname("Kittie").setNachname("Bentjens").setEmail("kbentjens8@soup.io").setPassword("I6Qar6Dgl"));
        list.add(DTOFactories.createUserDTO().setVorname("Mildrid").setNachname("Daubney").setEmail("mdaubney9@infoseek.co.jp").setPassword("kRXdROC9467"));
        list.add(DTOFactories.createUserDTO().setVorname("Neall").setNachname("Wahlberg").setEmail("nwahlberga@mediafire.com").setPassword("G5GLG"));
        list.add(DTOFactories.createUserDTO().setVorname("Anica").setNachname("Jewers").setEmail("ajewersb@weather.com").setPassword("XfrEY4dJz"));
        list.add(DTOFactories.createUserDTO().setVorname("Francyne").setNachname("Kristufek").setEmail("fkristufekc@tiny.cc").setPassword("nWREOYyYmt"));
        list.add(DTOFactories.createUserDTO().setVorname("Rochelle").setNachname("Poure").setEmail("rpoured@loc.gov").setPassword("FMyfTx"));
        list.add(DTOFactories.createUserDTO().setVorname("Truda").setNachname("Boulsher").setEmail("tboulshere@infoseek.co.jp").setPassword("BSrhnKz"));
        list.add(DTOFactories.createUserDTO().setVorname("Puff").setNachname("Sanja").setEmail("psanjaf@mapy.cz").setPassword("h7bnMU"));
        list.add(DTOFactories.createUserDTO().setVorname("Crawford").setNachname("Jancik").setEmail("cjancikg@istockphoto.com").setPassword("2SUzfJoK"));
        list.add(DTOFactories.createUserDTO().setVorname("Julie").setNachname("Van Hesteren").setEmail("jvanhesterenh@blogs.com").setPassword("utqUSCYRzC0"));
        list.add(DTOFactories.createUserDTO().setVorname("Ninon").setNachname("Giacopini").setEmail("ngiacopinii@columbia.edu").setPassword("7RfpY6ty"));
        list.add(DTOFactories.createUserDTO().setVorname("Katie").setNachname("Willavize").setEmail("kwillavizej@japanpost.jp").setPassword("ASYFOfOpX"));
        list.add(DTOFactories.createUserDTO().setVorname("Pooh").setNachname("Dryden").setEmail("pdrydenk@smh.com.au").setPassword("f05RCQxE"));
        list.add(DTOFactories.createUserDTO().setVorname("Northrup").setNachname("Mogenot").setEmail("nmogenotl@behance.net").setPassword("FQKiL9fA"));
        list.add(DTOFactories.createUserDTO().setVorname("Nan").setNachname("Durrad").setEmail("ndurradm@google.com.au").setPassword("31qz4yYH"));
        list.add(DTOFactories.createUserDTO().setVorname("Ivor").setNachname("Trowell").setEmail("itrowelln@cyberchimps.com").setPassword("5Q3nvBw"));
        list.add(DTOFactories.createUserDTO().setVorname("Timofei").setNachname("Aspland").setEmail("tasplando@howstuffworks.com").setPassword("Eob8szsQJwO"));
        list.add(DTOFactories.createUserDTO().setVorname("Breena").setNachname("Stairs").setEmail("bstairsp@github.io").setPassword("OBa8YfZ"));
        list.add(DTOFactories.createUserDTO().setVorname("Kikelia").setNachname("Gallandre").setEmail("kgallandreq@joomla.org").setPassword("pHo9lL"));
        list.add(DTOFactories.createUserDTO().setVorname("Orrin").setNachname("Royle").setEmail("oroyler@admin.ch").setPassword("kgTAEkx21"));
        list.add(DTOFactories.createUserDTO().setVorname("Lanette").setNachname("Lammie").setEmail("llammies@amazon.co.uk").setPassword("WELPAgKEK4a"));
        list.add(DTOFactories.createUserDTO().setVorname("Amandy").setNachname("Andree").setEmail("aandreet@istockphoto.com").setPassword("HidbL"));
        list.add(DTOFactories.createUserDTO().setVorname("Ellsworth").setNachname("Fosberry").setEmail("efosberryu@github.com").setPassword("vKcg2trd45i"));
        list.add(DTOFactories.createUserDTO().setVorname("Lars").setNachname("Rubbert").setEmail("lrubbertv@cloudflare.com").setPassword("taxLa"));
        list.add(DTOFactories.createUserDTO().setVorname("Ricoriki").setNachname("Vuittet").setEmail("rvuittetw@businessweek.com").setPassword("7ATcA8tzF6"));
        list.add(DTOFactories.createUserDTO().setVorname("Solomon").setNachname("Cowdray").setEmail("scowdrayx@bloomberg.com").setPassword("keSfxQJ"));
        list.add(DTOFactories.createUserDTO().setVorname("Niall").setNachname("Portlock").setEmail("nportlocky@g.co").setPassword("RNVPG"));
        list.add(DTOFactories.createUserDTO().setVorname("Heindrick").setNachname("Rickcord").setEmail("hrickcordz@blogs.com").setPassword("SuTbmEEDF"));
        list.add(DTOFactories.createUserDTO().setVorname("Cooper").setNachname("Zanre").setEmail("czanre10@arizona.edu").setPassword("cZQfx92CbI"));
        list.add(DTOFactories.createUserDTO().setVorname("Merralee").setNachname("Gibben").setEmail("mgibben11@rambler.ru").setPassword("IDGINndFowb"));
        list.add(DTOFactories.createUserDTO().setVorname("Roderick").setNachname("Doyland").setEmail("rdoyland12@posterous.com").setPassword("c0B3mZf236j"));
        list.add(DTOFactories.createUserDTO().setVorname("Ham").setNachname("Huckle").setEmail("hhuckle13@chicagotribune.com").setPassword("Fj3Mf"));
        list.add(DTOFactories.createUserDTO().setVorname("Olivia").setNachname("Wade").setEmail("owade14@scribd.com").setPassword("a1azKOPLv6"));
        list.add(DTOFactories.createUserDTO().setVorname("Ginelle").setNachname("Vain").setEmail("gvain15@ocn.ne.jp").setPassword("3q9Wg"));
        list.add(DTOFactories.createUserDTO().setVorname("Laurella").setNachname("Bischop").setEmail("lbischop16@tripadvisor.com").setPassword("xcHvKZdlzD"));
        list.add(DTOFactories.createUserDTO().setVorname("Suzann").setNachname("Coe").setEmail("scoe17@auda.org.au").setPassword("FpKirI25kN"));
        list.add(DTOFactories.createUserDTO().setVorname("Jameson").setNachname("Walaron").setEmail("jwalaron18@51.la").setPassword("vtI7jF93ODY"));
        list.add(DTOFactories.createUserDTO().setVorname("Adena").setNachname("Cancelier").setEmail("acancelier19@apple.com").setPassword("esIrv2E2y1"));
        list.add(DTOFactories.createUserDTO().setVorname("Darnall").setNachname("Lafaye").setEmail("dlafaye1a@wordpress.org").setPassword("E1jhOa"));
        list.add(DTOFactories.createUserDTO().setVorname("Costa").setNachname("Paulig").setEmail("cpaulig1b@cyberchimps.com").setPassword("0GoxQX"));
        list.add(DTOFactories.createUserDTO().setVorname("Vivianna").setNachname("Mardlin").setEmail("vmardlin1c@cam.ac.uk").setPassword("paxvbl"));
        list.add(DTOFactories.createUserDTO().setVorname("Archy").setNachname("Ellsbury").setEmail("aellsbury1d@bizjournals.com").setPassword("LVvqhK1gP"));

        // Vertriebler

        list.add(DTOFactories.createUserDTO().setVorname("jemblin0@wordpress.org").setNachname("Emblin").setEmail("demblin0@carlook.de").setPassword("35D7zZY98WR"));
        list.add(DTOFactories.createUserDTO().setVorname("kroantree1@t.co").setNachname("Roantree").setEmail("croantree1@carlook.de").setPassword("vnvZYrQcnh"));
        list.add(DTOFactories.createUserDTO().setVorname("xheppner2@123-reg.co.uk").setNachname("Heppner").setEmail("bheppner2@carlook.de").setPassword("V9JJWw"));
        list.add(DTOFactories.createUserDTO().setVorname("bhouchen3@mail.ru").setNachname("Houchen").setEmail("fhouchen3@carlook.de").setPassword("s7HsaVhj9LU"));
        list.add(DTOFactories.createUserDTO().setVorname("dmathevon4@accuweather.com").setNachname("Mathevon").setEmail("pmathevon4@carlook.de").setPassword("5xWuF"));
        list.add(DTOFactories.createUserDTO().setVorname("hlittell5@ftc.gov").setNachname("Littell").setEmail("glittell5@carlook.de").setPassword("qipiM"));
        list.add(DTOFactories.createUserDTO().setVorname("cmccurtain6@youtube.com").setNachname("McCurtain").setEmail("cmccurtain6@carlook.de").setPassword("cbRnQvEPzot"));
        list.add(DTOFactories.createUserDTO().setVorname("pruselin7@youtu.be").setNachname("Ruselin").setEmail("rruselin7@carlook.de").setPassword("3XlCp7VtBY"));
        list.add(DTOFactories.createUserDTO().setVorname("vshay8@rakuten.co.jp").setNachname("Shay").setEmail("lshay8@carlook.de").setPassword("CgCu2ziy"));
        list.add(DTOFactories.createUserDTO().setVorname("nduffield9@phpbb.com").setNachname("Duffield").setEmail("lduffield9@carlook.de").setPassword("aELHk"));
        list.add(DTOFactories.createUserDTO().setVorname("mprobeya@upenn.edu").setNachname("Probey").setEmail("aprobeya@carlook.de").setPassword("rAbcG7"));
        list.add(DTOFactories.createUserDTO().setVorname("stwomeyb@joomla.org").setNachname("Twomey").setEmail("wtwomeyb@carlook.de").setPassword("FoGXx8RcO"));
        list.add(DTOFactories.createUserDTO().setVorname("rgeallec@latimes.com").setNachname("Gealle").setEmail("tgeallec@carlook.de").setPassword("zo5Qk1bbk"));
        list.add(DTOFactories.createUserDTO().setVorname("shawksworthd@guardian.co.uk").setNachname("Hawksworth").setEmail("mhawksworthd@carlook.de").setPassword("cbjb0T7"));
        list.add(DTOFactories.createUserDTO().setVorname("lcovolinie@census.gov").setNachname("Covolini").setEmail("acovolinie@carlook.de").setPassword("N4snu"));
        list.add(DTOFactories.createUserDTO().setVorname("msharpef@macromedia.com").setNachname("Sharpe").setEmail("wsharpef@carlook.de").setPassword("TaJHAR7VEji"));
        list.add(DTOFactories.createUserDTO().setVorname("alorkingsg@nydailynews.com").setNachname("Lorkings").setEmail("alorkingsg@carlook.de").setPassword("jNpsFj0iVcT"));
        list.add(DTOFactories.createUserDTO().setVorname("cshoreh@uol.com.br").setNachname("Shore").setEmail("jshoreh@carlook.de").setPassword("rqqQfZ"));
        list.add(DTOFactories.createUserDTO().setVorname("kklimentyonoki@trellian.com").setNachname("Klimentyonok").setEmail("gklimentyonoki@carlook.de").setPassword("WtNoKnFIp19"));
        list.add(DTOFactories.createUserDTO().setVorname("cwilsonj@simplemachines.org").setNachname("Wilson").setEmail("lwilsonj@carlook.de").setPassword("xrsIL0Sw"));
        list.add(DTOFactories.createUserDTO().setVorname("fmaundk@sakura.ne.jp").setNachname("Maund").setEmail("dmaundk@carlook.de").setPassword("qmvJJxh"));
        list.add(DTOFactories.createUserDTO().setVorname("aswitzerl@prnewswire.com").setNachname("Switzer").setEmail("aswitzerl@carlook.de").setPassword("lFpkS20I7xX"));
        list.add(DTOFactories.createUserDTO().setVorname("gharnesm@sogou.com").setNachname("Harnes").setEmail("lharnesm@carlook.de").setPassword("Yo8SyatF8"));
        list.add(DTOFactories.createUserDTO().setVorname("rmartensenn@lulu.com").setNachname("Martensen").setEmail("gmartensenn@carlook.de").setPassword("sahxxm3eE"));
        list.add(DTOFactories.createUserDTO().setVorname("dgribbino@illinois.edu").setNachname("Gribbin").setEmail("lgribbino@carlook.de").setPassword("W0EfUECDTRE"));
        list.add(DTOFactories.createUserDTO().setVorname("nbeckenhamp@sourceforge.net").setNachname("Beckenham").setEmail("pbeckenhamp@carlook.de").setPassword("Qnhh7DyP"));
        list.add(DTOFactories.createUserDTO().setVorname("jtrinkwonq@tripadvisor.com").setNachname("Trinkwon").setEmail("ltrinkwonq@carlook.de").setPassword("7piTAb4cvcb"));
        list.add(DTOFactories.createUserDTO().setVorname("sfebenr@theguardian.com").setNachname("Feben").setEmail("ofebenr@carlook.de").setPassword("N6mYLx"));
        list.add(DTOFactories.createUserDTO().setVorname("rcators@163.com").setNachname("Cator").setEmail("lcators@carlook.de").setPassword("Bcpet9r1"));
        list.add(DTOFactories.createUserDTO().setVorname("ldelvest@amazon.com").setNachname("Delves").setEmail("sdelvest@carlook.de").setPassword("QETZPkyvA"));
        list.add(DTOFactories.createUserDTO().setVorname("ginglesonu@wikia.com").setNachname("Ingleson").setEmail("minglesonu@carlook.de").setPassword("v6QlQ"));
        list.add(DTOFactories.createUserDTO().setVorname("osoldiv@army.mil").setNachname("Soldi").setEmail("msoldiv@carlook.de").setPassword("MeZehqhUZ5y"));
        list.add(DTOFactories.createUserDTO().setVorname("dbartusekw@feedburner.com").setNachname("Bartusek").setEmail("kbartusekw@carlook.de").setPassword("BWmvrlIFci"));
        list.add(DTOFactories.createUserDTO().setVorname("bstutherx@surveymonkey.com").setNachname("Stuther").setEmail("cstutherx@carlook.de").setPassword("ZHMOSeH1Rmy"));
        list.add(DTOFactories.createUserDTO().setVorname("mgiffy@intel.com").setNachname("Giff").setEmail("kgiffy@carlook.de").setPassword("QrfOmuxzlm2"));
        list.add(DTOFactories.createUserDTO().setVorname("chinchshawz@wunderground.com").setNachname("Hinchshaw").setEmail("ahinchshawz@carlook.de").setPassword("TeiytjNTBI"));
        list.add(DTOFactories.createUserDTO().setVorname("mgarroway10@google.ca").setNachname("Garroway").setEmail("igarroway10@carlook.de").setPassword("xGGXlz"));
        list.add(DTOFactories.createUserDTO().setVorname("adowda11@blog.com").setNachname("Dowda").setEmail("adowda11@carlook.de").setPassword("8Yf24s"));
        list.add(DTOFactories.createUserDTO().setVorname("cidiens12@microsoft.com").setNachname("Idiens").setEmail("cidiens12@carlook.de").setPassword("xfvMP0bYwy"));
        list.add(DTOFactories.createUserDTO().setVorname("mjerwood13@posterous.com").setNachname("Jerwood").setEmail("vjerwood13@carlook.de").setPassword("7AgXun9OI"));
        list.add(DTOFactories.createUserDTO().setVorname("kapps14@blogger.com").setNachname("Apps").setEmail("japps14@carlook.de").setPassword("PoIOhL"));
        list.add(DTOFactories.createUserDTO().setVorname("rkirsopp15@comsenz.com").setNachname("Kirsopp").setEmail("mkirsopp15@carlook.de").setPassword("EfYFGaqZg"));
        list.add(DTOFactories.createUserDTO().setVorname("cstiegers16@wordpress.com").setNachname("Stiegers").setEmail("jstiegers16@carlook.de").setPassword("GyPjV9Jdds1"));
        list.add(DTOFactories.createUserDTO().setVorname("bemblen17@buzzfeed.com").setNachname("Emblen").setEmail("aemblen17@carlook.de").setPassword("0J4VFC"));
        list.add(DTOFactories.createUserDTO().setVorname("dsowley18@istockphoto.com").setNachname("Sowley").setEmail("rsowley18@carlook.de").setPassword("oEvARHNQ"));
        list.add(DTOFactories.createUserDTO().setVorname("hmauchlen19@com.com").setNachname("Mauchlen").setEmail("emauchlen19@carlook.de").setPassword("KKeQQF"));
        list.add(DTOFactories.createUserDTO().setVorname("hsodeau1a@forbes.com").setNachname("Sodeau").setEmail("esodeau1a@carlook.de").setPassword("3Ag6Ul4"));
        list.add(DTOFactories.createUserDTO().setVorname("fsabberton1b@who.int").setNachname("Sabberton").setEmail("jsabberton1b@carlook.de").setPassword("6Oei1SxWU"));
        list.add(DTOFactories.createUserDTO().setVorname("jsaterweyte1c@dagondesign.com").setNachname("Saterweyte").setEmail("psaterweyte1c@carlook.de").setPassword("z36fDpG8p"));
        list.add(DTOFactories.createUserDTO().setVorname("karpin1d@issuu.com").setNachname("Arpin").setEmail("carpin1d@carlook.de").setPassword("eOJF5"));

        return list;
    }


}
