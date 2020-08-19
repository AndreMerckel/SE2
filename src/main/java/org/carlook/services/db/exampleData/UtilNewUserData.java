package org.carlook.services.db.exampleData;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class UtilNewUserData {

    public static String getFormat(String s, List<String> attList) {


        String res = "";
        int usrCounter = 0;
        Scanner sc = new Scanner(s);
        while (sc.hasNext()) {
            Iterator<String> it = attList.iterator();
            res += "\nlist.add(Factories.createNewFahrzeug().set" + it.next() + "(";
            String tmpLine = sc.nextLine().trim();
            String tmpArg = "";
            for (int i = 0; i < (tmpLine.length()); ++i) {
                char tmpChar = tmpLine.charAt(i);
                tmpArg += tmpChar;
                if (i+1 == tmpLine.length() || tmpLine.charAt(i+1) == ',') {
                    try {
                        int number = Integer.parseInt(tmpArg);
                        res += tmpArg;
                    } catch (Exception e) {
                        res += "\"" + tmpArg + "\"";
                    } finally {
                        if (i+1 == tmpLine.length())
                            res += "));";
                        else
                            res += ").set" + it.next() + "(";
                        tmpArg = "";
                        i++;
                    }
                }
            }
        }
        return res;
    }

    public static void printFahrzeugData() {
        List<String> list = new ArrayList<>();
        list.add("Hersteller");
        list.add("Beschreibung");
        list.add("Kraftstoff");
        list.add("Baujahr");
        list.add("Modell");
        list.add("Fahrgestellnummer");
        list.add("Kennzeichen");
        list.add("Vertriebler");
        list.add("Location");


        String s = "Mazda,Kindersitz im Kofferraum,Diesel,2018,Concerto,WBA1K5C55FV233044,SU-CL-5938,46,Bonn\n" +
                "Ford,gutes Entetainment-System,Gas,2019,Integra SJ,3D7LP2ET8AG786303,SU-CL-9236,3,Rheinbach\n" +
                "Dodge,mit Ledersitze,Elektro,2019,Elysion,JTHFE2C25A2530070,SU-CL-8061,32,Hamburg\n" +
                "Mercury,Ganzjahresreifen,Diesel,2019,Integra SJ,WAUFEBFM2CA942855,SU-CL-5482,31,Hamburg\n" +
                "Ford,Confort-Ausstattung,Diesel,2019,CR-X,4USFE43547L257126,SU-CL-0478,29,Rheinbach\n" +
                "Saturn,Kindersitz im Kofferraum,Benzin,2017,Rafaga,1G6AH5SX8D0880636,SU-CL-7123,15,Siegburg\n" +
                "Hummer,Ganzjahresreifen,Gas,2018,Concerto,2G4WB55K511023691,SU-CL-9328,30,Hamburg\n" +
                "Pontiac,Klimaautomatik,Elektro,2017,Insight,1FMEU7FE0AU903984,SU-CL-9801,19,Rheinbach\n" +
                "Mercury,begehrt!,Benzin,2017,Capa,KL4CJESBXDB344610,SU-CL-3609,50,Sankt Augustin\n" +
                "Hyundai,unfallfrei mit vielen Extra,Benzin,2018,Orthia,WBABN53453J280421,SU-CL-4514,41,Berlin\n" +
                "Subaru,Kindersitz im Kofferraum,Gas,2020,Concerto,WBAKE5C50DJ578742,SU-CL-0117,4,Rheinbach\n" +
                "Dodge,Gepflegtes Auto,Elektro,2017,Prelude,SALAG2D4XAA975540,SU-CL-5705,31,Berlin\n" +
                "Nissan,mit Ledersitze,Diesel,2020,City,5J8TB3H3XFL505849,SU-CL-2771,40,Hennef\n" +
                "Mitsubishi,kleiner Unfallschaden,Elektro,2020,Insight,JH4CL95904C701642,SU-CL-1043,12,Hennef\n" +
                "Buick,mit Ledersitze,Benzin,2019,Fit,WAUVT68E04A535259,SU-CL-0574,29,Köln\n" +
                "Bentley,kleiner Unfallschaden,Gas,2020,Life,WAUEF98E07A168392,SU-CL-2555,21,Siegburg\n" +
                "Jeep,mit Ledersitze,Elektro,2020,Mobilio,3D73M3HL5AG071554,SU-CL-0573,38,Berlin\n" +
                "BMW,Unsere Besten!,Benzin,2019,Ridgeline,1GYS3SKJ6FR539349,SU-CL-1544,22,Hamburg\n" +
                "GMC,Klimaautomatik,Diesel,2018,Civic,4T1BF1FK3CU811502,SU-CL-3951,28,Hamburg\n" +
                "Pontiac,Highline,Diesel,2020,CR-Z,3C6TD4DT2CG728214,SU-CL-9541,12,Köln\n" +
                "Volkswagen,mit Ledersitze,Gas,2020,Fit,WBS3C9C58FP326346,SU-CL-1797,26,Rheinbach\n" +
                "Infiniti,begehrt!,Elektro,2019,Ridgeline,1GD02ZCG6EF908525,SU-CL-4294,4,Rheinbach\n" +
                "Chrysler,Ganzjahresreifen,Gas,2019,Capa,WAUPL68E45A927865,SU-CL-0419,49,Siegburg\n" +
                "Chevrolet,elektrisch verstellbare Sitze,Diesel,2017,Partner,3C3CFFAR9FT769950,SU-CL-6768,33,Bonn\n" +
                "Volkswagen,unfallfrei mit vielen Extra,Diesel,2018,Logo,WAU2MAFC1FN443433,SU-CL-8248,21,Hennef\n" +
                "Land Rover,Klimaautomatik,Elektro,2017,Accord,WBAPK7C51BA043751,SU-CL-6179,2,Siegburg\n" +
                "Hyundai,begehrt!,Elektro,2018,MDX,1GYFC66808R640485,SU-CL-4940,4,Sankt Augustin\n" +
                "Cadillac,Confort-Ausstattung,Gas,2017,Inspire,19UUA9F28DA849998,SU-CL-4686,42,Köln\n" +
                "Chevrolet,Confort-Ausstattung,Diesel,2019,FR-V,5TDDK3DC3DS299634,SU-CL-9123,24,Sankt Augustin\n" +
                "Chevrolet,mit Ledersitze,Benzin,2020,Fit Aria,SALAB2D42AA638858,SU-CL-9948,11,Rheinbach\n" +
                "Nissan,unfallfrei mit vielen Extra,Diesel,2019,CR-X,2G4GR5ER5D9518122,SU-CL-6690,4,München\n" +
                "Mitsubishi,Gepflegtes Auto,Gas,2019,Insight,WBSDE93431B480023,SU-CL-6018,32,München\n" +
                "GMC,begehrt!,Diesel,2017,FR-V,3C4PDDAG5ET554232,SU-CL-6054,28,München\n" +
                "GMC,elektrisch verstellbare Sitze,Elektro,2019,Crossroad,WBA5A5C55FD780289,SU-CL-2478,39,Bonn\n" +
                "Chevrolet,kleiner Unfallschaden,Gas,2019,Elysion,19XFB2E27CE690142,SU-CL-5823,41,Hamburg\n" +
                "Mercedes-Benz,elektrisch verstellbare Sitze,Diesel,2017,Insight,JN1CV6AP2CM895276,SU-CL-0480,21,Hamburg\n" +
                "Isuzu,Confort-Ausstattung,Elektro,2018,Jazz,1N6AF0KY2EN450911,SU-CL-2583,13,Bonn\n" +
                "GMC,unfallfrei mit vielen Extra,Benzin,2017,Edix,3D7TP2CT4BG723400,SU-CL-7757,17,Berlin\n" +
                "Suzuki,begehrt!,Benzin,2019,Crosstour,WDBSK7AA9CF905534,SU-CL-3793,7,Hennef\n" +
                "Honda,Ganzjahresreifen,Diesel,2020,Crossroad,WBANA535X5B381940,SU-CL-1057,30,Köln\n" +
                "Ford,elektrisch verstellbare Sitze,Benzin,2020,Capa,1G6AH5R39F0409424,SU-CL-9350,18,Hennef\n" +
                "Volkswagen,kleiner Unfallschaden,Elektro,2018,Insight,1GYUKAEF8AR943341,SU-CL-8673,22,Hennef\n" +
                "GMC,kleiner Unfallschaden,Elektro,2018,Partner,JN8AE2KP0C9029675,SU-CL-9614,6,Hamburg\n" +
                "Lincoln,Klimaautomatik,Benzin,2020,Prelude,WBANN73516C577499,SU-CL-0537,3,Hennef\n" +
                "Pontiac,begehrt!,Diesel,2017,NSX,137ZA90381E550914,SU-CL-2489,45,Rheinbach\n" +
                "Mazda,Ganzjahresreifen,Diesel,2018,FR-V,3D73Y4EL7AG778797,SU-CL-8415,19,Rheinbach\n" +
                "Jeep,mit Ledersitze,Elektro,2019,Life,3VW507AT1EM329993,SU-CL-2788,33,Hennef\n" +
                "Toyota,Highline,Gas,2017,Insight,JTHKD5BH9E2759382,SU-CL-0192,43,Hamburg\n" +
                "Toyota,Ganzjahresreifen,Elektro,2020,City,WBADW3C51CE623205,SU-CL-2104,22,Siegburg\n" +
                "Mercedes-Benz,unfallfrei mit vielen Extra,Benzin,2018,Domani,1G6YV36A175050492,SU-CL-9256,11,Hamburg\n" +
                "Ford,elektrisch verstellbare Sitze,Gas,2017,NSX,5J6TF1H58EL542951,SU-CL-1958,37,Berlin\n" +
                "Mitsubishi,Klimaautomatik,Gas,2017,Insight,JTDBT4K35A1832170,SU-CL-8994,47,Siegburg\n" +
                "Volkswagen,elektrisch verstellbare Sitze,Diesel,2020,Accord,19UUA66274A679261,SU-CL-4311,2,Sankt Augustin\n" +
                "Ford,gutes Entetainment-System,Elektro,2017,Capa,WAUGGAFR3EA391665,SU-CL-6438,7,Sankt Augustin\n" +
                "Chevrolet,Gepflegtes Auto,Diesel,2019,Airwave,WA1CMAFP0EA664340,SU-CL-2258,14,Rheinbach\n" +
                "Mitsubishi,gutes Entetainment-System,Gas,2019,Domani,WBAVB73517K513530,SU-CL-2970,16,Hamburg\n" +
                "GMC,mit Ledersitze,Gas,2018,Element,5FNRL3H26AB005146,SU-CL-4890,25,Rheinbach\n" +
                "Aston Martin,unfallfrei mit vielen Extra,Elektro,2019,Pilot,JH4DC53826S670863,SU-CL-4781,23,Bonn\n" +
                "Kia,unfallfrei mit vielen Extra,Elektro,2020,Element,WAUJFAFH2BN570722,SU-CL-3421,25,Hennef\n" +
                "Mitsubishi,elektrisch verstellbare Sitze,Elektro,2018,Integra,WBAVA33538P330372,SU-CL-5108,39,Köln\n" +
                "BMW,elektrisch verstellbare Sitze,Elektro,2020,Jazz,JN8AE2KP8C9845243,SU-CL-8321,22,Köln\n" +
                "Dodge,elektrisch verstellbare Sitze,Gas,2018,CR-X,WA1LGBFE7CD352975,SU-CL-5039,4,Rheinbach\n" +
                "Volvo,elektrisch verstellbare Sitze,Benzin,2019,Element,1G6AB5R36D0542995,SU-CL-9204,25,Bonn\n" +
                "Scion,Kindersitz im Kofferraum,Diesel,2020,Ridgeline,1G4GC5ER2DF957920,SU-CL-5869,32,Sankt Augustin\n" +
                "Ford,gutes Entetainment-System,Gas,2019,HR-V,5GADS13SX72180246,SU-CL-2489,38,Bonn\n" +
                "Hyundai,Unsere Besten!,Diesel,2018,Orthia,3C4PDDDG4CT860329,SU-CL-1743,25,Sankt Augustin\n" +
                "Ford,Kindersitz im Kofferraum,Diesel,2020,CR-X,5GAEV23798J114453,SU-CL-9544,21,Köln\n" +
                "Ford,Gepflegtes Auto,Elektro,2020,Elysion,WBALZ5C5XCD034075,SU-CL-7886,32,München\n" +
                "Jaguar,Unsere Besten!,Elektro,2018,CR-V,1FMEU5DE1AU471526,SU-CL-8542,22,Köln\n" +
                "Honda,kleiner Unfallschaden,Elektro,2019,Prelude,JH4KC1F5XEC233705,SU-CL-2442,42,Sankt Augustin\n" +
                "BMW,Ganzjahresreifen,Elektro,2019,City,WAUHE78P48A519313,SU-CL-1656,10,Berlin\n" +
                "Mitsubishi,Unsere Besten!,Diesel,2020,Passport,2T1BPRHE2EC961608,SU-CL-3539,50,Sankt Augustin\n" +
                "Pontiac,mit Ledersitze,Elektro,2017,Logo,1G6DE5EG6A0882379,SU-CL-5797,46,Sankt Augustin\n" +
                "GMC,Ganzjahresreifen,Gas,2018,Crosstour,1FTWX3A56AE344385,SU-CL-4721,27,Rheinbach\n" +
                "GMC,Highline,Elektro,2020,Civic,5LMJJ2H51AE952550,SU-CL-5347,11,Hamburg\n" +
                "Ford,kleiner Unfallschaden,Diesel,2018,Mobilio,JTDKDTB38F1997063,SU-CL-2877,4,Köln\n" +
                "Volkswagen,elektrisch verstellbare Sitze,Gas,2019,Partner,JTHBB1BAXA2090180,SU-CL-3207,1,Köln\n" +
                "Chevrolet,Confort-Ausstattung,Gas,2019,Fit,WBAYP9C56FD365968,SU-CL-3564,21,Bonn\n" +
                "Mercury,Kindersitz im Kofferraum,Gas,2020,Logo,3D7TP2CT0BG757091,SU-CL-6653,38,Sankt Augustin\n" +
                "Nissan,elektrisch verstellbare Sitze,Benzin,2019,FR-V,WBABV13464J835581,SU-CL-7103,37,Köln\n" +
                "Toyota,Klimaautomatik,Elektro,2017,Element,YV140MEB5F1648045,SU-CL-4058,21,Hamburg\n" +
                "Dodge,Klimaautomatik,Elektro,2018,Passport,1G6AF5S38D0561952,SU-CL-5125,24,Berlin\n" +
                "Audi,Highline,Gas,2020,FR-V,WAUVT68E14A043632,SU-CL-0810,7,Köln\n" +
                "Mercedes-Benz,Unsere Besten!,Gas,2020,NSX,JH4KB16687C212611,SU-CL-7521,10,Berlin\n" +
                "Toyota,Confort-Ausstattung,Elektro,2019,Orthia,2T2BK1BA0AC721579,SU-CL-1714,40,Rheinbach\n" +
                "Dodge,kleiner Unfallschaden,Elektro,2017,Accord,2T2BK1BA7FC249095,SU-CL-5497,20,Sankt Augustin\n" +
                "Dodge,Unsere Besten!,Gas,2020,Odyssey,WAULD64B64N244063,SU-CL-0363,4,Köln\n" +
                "Mazda,elektrisch verstellbare Sitze,Diesel,2018,Rafaga,3N1AB6AP5AL755942,SU-CL-9221,1,Berlin\n" +
                "Volvo,kleiner Unfallschaden,Benzin,2018,Ascot,2G4GV5GV7C9892090,SU-CL-6525,26,Hennef\n" +
                "Dodge,elektrisch verstellbare Sitze,Benzin,2019,Life,1D4RE2GG2BC363511,SU-CL-8889,38,Bonn\n" +
                "Acura,Ganzjahresreifen,Diesel,2020,Orthia,WBAHL03516D625149,SU-CL-1209,11,Bonn\n" +
                "Lexus,Klimaautomatik,Elektro,2019,Integra,WAUBVAFB4BN020232,SU-CL-7117,34,Sankt Augustin\n" +
                "Dodge,Kindersitz im Kofferraum,Benzin,2018,NSX,5N1AA0NC5EN073648,SU-CL-7601,16,Hamburg\n" +
                "Volkswagen,unfallfrei mit vielen Extra,Gas,2018,Jazz,2C3CDXCT1DH005214,SU-CL-4327,45,Berlin\n" +
                "Ford,begehrt!,Benzin,2020,Crosstour,WVWAA7AJ6BW520186,SU-CL-2585,23,Berlin\n" +
                "Dodge,Highline,Elektro,2019,Element,2G4GV5EV1B9926736,SU-CL-8056,10,Hennef\n" +
                "Chevrolet,begehrt!,Elektro,2020,Fit Aria,JTHBE1KSXB0545736,SU-CL-2798,36,Sankt Augustin\n" +
                "Honda,Klimaautomatik,Diesel,2019,Civic,5GALVBED1AJ917953,SU-CL-4658,25,Hamburg\n" +
                "Honda,elektrisch verstellbare Sitze,Diesel,2019,Accord,WA1DMAFP3FA282406,SU-CL-7218,20,Hamburg\n" +
                "GMC,elektrisch verstellbare Sitze,Elektro,2018,Elysion,SCFFDCCD8CG121337,SU-CL-1151,15,Rheinbach";

        System.out.println(getFormat(s,list));

    }

    public static void printUserData() {
        List<String> list = new ArrayList<>();
        list.add("Vorname");
        list.add("Nachname");
        list.add("Email");
        list.add("Password");

        String s = "Rafaelita,Snartt,rafaelita.snartt@carlook.de,463xtqPiOE\n" +
                "Philly,Warratt,philly.warratt@carlook.de,3aeVurH\n" +
                "Gerry,Burgne,gerry.burgne@carlook.de,LTE9H0\n" +
                "Yorker,Lauks,yorker.lauks@carlook.de,UeUIoe8K\n" +
                "Cozmo,Cotman,cozmo.cotman@carlook.de,77h7jRNgMK8d\n" +
                "Dallis,Swinn,dallis.swinn@carlook.de,c4XuioOy1\n" +
                "Elenore,Armer,elenore.armer@carlook.de,hlnb72hER\n" +
                "Dorie,Flukes,dorie.flukes@carlook.de,If862GQVp737\n" +
                "Gabriela,Trimming,gabriela.trimming@carlook.de,RrB8GBOsnK\n" +
                "Carson,Ellse,carson.ellse@carlook.de,zOQYJhUb\n" +
                "Jessy,Defty,jessy.defty@carlook.de,l0RViAFIG\n" +
                "Chickie,Margetts,chickie.margetts@carlook.de,ZCTN2mz3\n" +
                "Hershel,Champneys,hershel.champneys@carlook.de,699IRccKn\n" +
                "Susana,Kubacek,susana.kubacek@carlook.de,C6P523m\n" +
                "Victoria,McVittie,victoria.mcvittie@carlook.de,BPuZxt0zz\n" +
                "Claudian,Rubert,claudian.rubert@carlook.de,el2bqE8rAV\n" +
                "Erie,Bare,erie.bare@carlook.de,ZSYDNsgAWfmS\n" +
                "Lira,Penreth,lira.penreth@carlook.de,T1moWVJ\n" +
                "Orlando,Luck,orlando.luck@carlook.de,W6CasQK1O\n" +
                "Mickey,Shoubridge,mickey.shoubridge@carlook.de,ecFyMMmGg6\n" +
                "Isak,Pilger,isak.pilger@carlook.de,flfcbC\n" +
                "Xaviera,Gellibrand,xaviera.gellibrand@carlook.de,bLTYdYVyP3\n" +
                "Tim,Koubek,tim.koubek@carlook.de,7RIQexxVy\n" +
                "Eryn,Autin,eryn.autin@carlook.de,2Vi1uSsZ5N\n" +
                "Saxon,Fanner,saxon.fanner@carlook.de,bIa6PKbf\n" +
                "Mireielle,Rafferty,mireielle.rafferty@carlook.de,sDLMJh5xe4\n" +
                "Berkly,Titterton,berkly.titterton@carlook.de,vXR8Ipwud\n" +
                "Menard,Ruilton,menard.ruilton@carlook.de,tvP7AtROFIb\n" +
                "Kim,Danbye,kim.danbye@carlook.de,jAM8qz4\n" +
                "Vinny,Quelch,vinny.quelch@carlook.de,9LB81X\n" +
                "Northrop,Fryers,northrop.fryers@carlook.de,o95H3uJuKRR\n" +
                "Niko,Bulle,niko.bulle@carlook.de,AH1jOfOXB\n" +
                "Marylin,Orteaux,marylin.orteaux@carlook.de,Bo93i4Cmdv\n" +
                "Jasen,Chinnick,jasen.chinnick@carlook.de,xbCw3P4J\n" +
                "Susy,Trunkfield,susy.trunkfield@carlook.de,EzH9nH\n" +
                "Deerdre,Prendiville,deerdre.prendiville@carlook.de,sOnOjut\n" +
                "Cortney,Currell,cortney.currell@carlook.de,Uw3lomHlHKVd\n" +
                "Terence,Koschek,terence.koschek@carlook.de,CWDNEzQiSW\n" +
                "Noelani,Ferreiro,noelani.ferreiro@carlook.de,bZmaS6bImv\n" +
                "Stephana,Pattini,stephana.pattini@carlook.de,rSC8hr\n" +
                "Zita,MacKeogh,zita.mackeogh@carlook.de,iIeRwI\n" +
                "Minda,Clardge,minda.clardge@carlook.de,g6SM2g2X5\n" +
                "Melisent,Moyse,melisent.moyse@carlook.de,ettzpK1f\n" +
                "Cornell,Stanyon,cornell.stanyon@carlook.de,JyCLjSIu9\n" +
                "Eveleen,Temporal,eveleen.temporal@carlook.de,fuaqgvdY\n" +
                "Eward,Breem,eward.breem@carlook.de,3dXGPumsqzgg\n" +
                "Hermy,Richford,hermy.richford@carlook.de,ADIlP1Y0TDd\n" +
                "Todd,Bluett,todd.bluett@carlook.de,8dQm6V\n" +
                "Christiano,Nuzzetti,christiano.nuzzetti@carlook.de,xCoIz31\n" +
                "Fritz,Borris,fritz.borris@carlook.de,9YZV63";

        System.out.println(getFormat(s,list));
    }

    public static void main(String[] args) {
        printFahrzeugData();
    }
}
