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
        list.add("Vertriebler");
        list.add("Location");


        String s = "Dodge,begehrt!,Elektro,2020,Accord,WAUDF68E35A059612,93,München\n" +
                "Hyundai,gutes Entetainment-System,Benzin,2020,CR-X,2G61N5S33D9234013,70,Köln\n" +
                "Nissan,gutes Entetainment-System,Elektro,2018,CR-X,WAUJGAFC7DN055624,80,Sankt Augustin\n" +
                "Mazda,Gepflegtes Auto,Diesel,2017,Inspire,WAUDGAFL7DA456952,68,Berlin\n" +
                "GMC,mit Klimaautomatik,Gas,2017,NSX,WBAYF4C59DD955505,70,Berlin\n" +
                "Chevrolet,Geil!,Gas,2020,Fit Aria,19XFB2E51DE298124,70,Bonn\n" +
                "BMW,Geil!,Elektro,2017,Fit Aria,WVGEP9BP7FD441797,87,Bonn\n" +
                "Mercury,begehrt!,Gas,2020,Avancier,3C63D2JL6CG829765,60,Bonn\n" +
                "Mercedes-Benz,Confort-Ausstattung,Gas,2020,Rafaga,WA1VMBFE2ED840879,78,Hamburg\n" +
                "Buick,unfallfrei mit vielen Extra,Elektro,2020,CR-X,1G6DK5EG1A0741602,69,Hamburg\n" +
                "Aston Martin,Gepflegtes Auto,Elektro,2018,Fit Aria,1FTEX1CM8DF220654,88,Hamburg\n" +
                "Volvo,unfallfrei mit vielen Extra,Benzin,2020,Inspire,WAUFGBFC8DN768673,75,Sankt Augustin\n" +
                "MINI,mit Kindersitz,Elektro,2018,City,JN1BY1AR4EM714835,60,Sankt Augustin\n" +
                "Pontiac,mit Klimaautomatik,Diesel,2019,HR-V,WBAKG7C58DJ405184,89,Berlin\n" +
                "Lexus,Gepflegtes Auto,Elektro,2020,City,JN8AZ1FY1DW504092,61,München\n" +
                "Aston Martin,gutes Entetainment-System,Elektro,2019,Ascot,JH4NA12662T206577,69,München\n" +
                "Hummer,mit Kindersitz,Elektro,2017,CR-V,3VW4A7AT0DM445533,68,Berlin\n" +
                "Mitsubishi,unfallfrei mit vielen Extra,Elektro,2018,Capa,SALSF2D44DA150072,56,Köln\n" +
                "Mazda,Gepflegtes Auto,Diesel,2020,Insight,3D7JB1ET7BG117991,100,Sankt Augustin\n" +
                "Infiniti,Gepflegtes Auto,Diesel,2019,Civic,SCBCR63W95C479419,71,Köln\n" +
                "Honda,gutes Entetainment-System,Elektro,2017,MDX,4USCN33462L255522,96,Köln\n" +
                "Mazda,begehrt!,Diesel,2019,Avancier,WA1AV74L49D622619,99,Köln\n" +
                "Infiniti,mit Klimaautomatik,Elektro,2018,Legend,WBAVT13526A805024,97,Hamburg\n" +
                "GMC,kleiner Unfallschaden,Gas,2018,FCX Clarity,1FTWF3B5XAE058315,59,Hamburg\n" +
                "Lexus,mit Kindersitz,Gas,2020,MDX,TRUUT28N731583336,87,München\n" +
                "Nissan,mit Kindersitz,Gas,2020,Life,2LNBL8CVXAX843157,53,Bonn\n" +
                "Subaru,Unsere Besten!,Diesel,2018,Accord,SALVP2BG2EH040296,99,Sankt Augustin\n" +
                "Isuzu,Gepflegtes Auto,Gas,2017,Orthia,3D73Y4EL9BG377818,57,Hamburg\n" +
                "Nissan,begehrt!,Gas,2019,Accord,KMHTC6AD1EU807227,77,Sankt Augustin\n" +
                "Lexus,Highline,Gas,2017,Ridgeline,2FMGK5BC2CB695431,92,Köln\n" +
                "Chevrolet,unfallfrei mit vielen Extra,Diesel,2019,Odyssey,1G6DS8E32D0015749,95,Sankt Augustin\n" +
                "Chrysler,gutes Entetainment-System,Benzin,2019,Life,1G6DJ1E34D0207992,57,Köln\n" +
                "Dodge,gutes Entetainment-System,Benzin,2020,Gooding,1G4GF5G3XCF622757,78,Sankt Augustin\n" +
                "Oldsmobile,gutes Entetainment-System,Benzin,2020,Integra,1B3BD4FBXBN784420,52,Bonn\n" +
                "Jaguar,mit Klimaautomatik,Benzin,2019,Gooding,1N6AA0CAXAN929779,74,München\n" +
                "Oldsmobile,unfallfrei mit vielen Extra,Elektro,2017,CR-Z,1FTFW1E84AF811714,77,Hamburg\n" +
                "Plymouth,mit Kindersitz,Diesel,2019,Capa,1G6DL5E34C0564363,61,Berlin\n" +
                "Audi,Unsere Besten!,Diesel,2020,Quint,1GTN1TEHXEZ644434,64,Köln\n" +
                "Suzuki,unfallfrei mit vielen Extra,Elektro,2019,Ascot,2FMGK5C82FB589625,57,Bonn\n" +
                "Ford,Geil!,Benzin,2019,Freed,JN8AF5MV3FT168670,51,Bonn\n" +
                "Infiniti,Unsere Besten!,Diesel,2018,Odyssey,2C4RDGBG6ER946521,91,Bonn\n" +
                "Audi,unfallfrei mit vielen Extra,Gas,2018,Elysion,1G6AH5S38D0383373,85,Bonn\n" +
                "Lotus,Gepflegtes Auto,Gas,2017,Crossroad,2T2BK1BA2FC727228,79,Bonn\n" +
                "Land Rover,mit Kindersitz,Benzin,2017,MDX,3D7TP2CT5BG052867,62,Köln\n" +
                "Chevrolet,unfallfrei mit vielen Extra,Elektro,2018,Passport,KNADM5A36F6376068,94,München\n" +
                "Ford,mit Klimaautomatik,Diesel,2019,Pilot,WAUDF98E78A241514,95,Bonn\n" +
                "Land Rover,mit Klimaautomatik,Gas,2017,Accord,1GD11ZCG2DF073173,88,Sankt Augustin\n" +
                "Volkswagen,gutes Entetainment-System,Benzin,2018,CR-Z,WBAYP1C53FD874269,61,Bonn\n" +
                "Ford,kleiner Unfallschaden,Gas,2018,Insight,WAUMFAFH6FN127797,72,Bonn\n" +
                "Cadillac,Gepflegtes Auto,Elektro,2018,Rafaga,5LMJJ2H53CE152724,68,Bonn\n" +
                "Nissan,begehrt!,Diesel,2020,CR-V,WBALL5C56EJ529640,91,Sankt Augustin\n" +
                "Jeep,mit Klimaautomatik,Elektro,2017,Logo,1G4GH5G39CF210906,59,Köln\n" +
                "Lincoln,mit Klimaautomatik,Gas,2020,Mobilio,1GYFK66847R690811,62,Hamburg\n" +
                "Oldsmobile,Unsere Besten!,Benzin,2017,Crosstour,JN1CV6EK0CM749800,81,Sankt Augustin\n" +
                "Chevrolet,kleiner Unfallschaden,Benzin,2017,Inspire,3VW517ATXEM217898,67,Bonn\n" +
                "Toyota,Gepflegtes Auto,Diesel,2017,Ridgeline,1FTSX2B51AE656167,97,München\n" +
                "Jaguar,mit Kindersitz,Gas,2018,Element,5N1CR2MM6EC150630,75,Hamburg\n" +
                "Mitsubishi,Unsere Besten!,Elektro,2019,Fit Aria,JN1AY1AP7CM019711,65,Sankt Augustin\n" +
                "Mazda,Unsere Besten!,Diesel,2020,Prelude,1FAHP2DW7BG762489,63,Sankt Augustin\n" +
                "Hyundai,kleiner Unfallschaden,Diesel,2017,Ridgeline,YV1672MK7A2742957,61,Köln\n" +
                "Volkswagen,Confort-Ausstattung,Diesel,2020,CR-V,WVGAV3AXXDW363262,98,Sankt Augustin\n" +
                "Ford,Gepflegtes Auto,Benzin,2019,Integra,2FMGK5BC9CB536261,91,Sankt Augustin\n" +
                "Toyota,mit Kindersitz,Gas,2018,CR-X,WA1CFBFPXBA058667,74,Bonn\n" +
                "Toyota,Highline,Gas,2019,Accord,WAUVT58E32A247131,78,München\n" +
                "Eagle,gutes Entetainment-System,Benzin,2018,Integra,WBAEU33422K379646,68,Berlin\n" +
                "Mazda,kleiner Unfallschaden,Diesel,2017,MDX,WAUJGAFC2DN924498,94,Hamburg\n" +
                "Cadillac,unfallfrei mit vielen Extra,Diesel,2020,Crossroad,WP0CA2A84ES008947,91,Köln\n" +
                "BMW,unfallfrei mit vielen Extra,Gas,2020,Life,JN8AF5MR3DT355200,69,Köln\n" +
                "MINI,Geil!,Elektro,2019,Inspire,1FTWW3A51AE896833,81,Berlin\n" +
                "Mitsubishi,Gepflegtes Auto,Elektro,2019,Gooding,1C4RDJAG8EC376481,83,Hamburg\n" +
                "Acura,Highline,Gas,2018,Orthia,3N1CN7APXEK414599,58,Bonn\n" +
                "Ford,kleiner Unfallschaden,Benzin,2020,CR-X,WAUNG94F09N853578,95,Bonn\n" +
                "Dodge,mit Kindersitz,Elektro,2017,MDX,1D4RE2GG1BC106047,97,Hamburg\n" +
                "Subaru,mit Kindersitz,Elektro,2020,Gooding,1D7RV1GTXAS598303,90,Berlin\n" +
                "Mitsubishi,Highline,Diesel,2018,Integra,1C4RDJDG7EC423768,83,München\n" +
                "GMC,mit Kindersitz,Gas,2019,Elysion,1G6DP5E34C0977601,59,Sankt Augustin\n" +
                "Audi,Unsere Besten!,Gas,2018,CR-V,WAUAFAFL1CA254712,82,Bonn\n" +
                "Ford,Highline,Benzin,2019,Edix,1GT01ZCG7EF299906,65,Sankt Augustin\n" +
                "Studebaker,Highline,Gas,2019,FCX Clarity,WBABD33495P845356,54,München\n" +
                "Toyota,kleiner Unfallschaden,Gas,2019,Passport,WBADX1C57CJ411353,81,Köln\n" +
                "Mazda,Gepflegtes Auto,Benzin,2020,Jazz,4USBU53548L905976,64,Sankt Augustin\n" +
                "Audi,begehrt!,Benzin,2019,Prelude,1GD11ZCG3DF914806,68,Bonn\n" +
                "Chevrolet,Geil!,Benzin,2017,Passport,JM1NC2JFXB0274188,56,Hamburg\n" +
                "Jeep,kleiner Unfallschaden,Diesel,2018,Inspire,1G6DE5E51D0707105,76,Berlin\n" +
                "Mazda,Geil!,Benzin,2020,NSX,2C3CCAEG1EH558575,68,München\n" +
                "Chevrolet,begehrt!,Diesel,2019,CR-Z,WAUCD64B54N420486,69,Berlin\n" +
                "Chevrolet,Highline,Diesel,2017,Edix,TRUTC28N061656143,80,Sankt Augustin\n" +
                "Ford,Geil!,Benzin,2020,HR-V,1FTWX3A58AE983884,75,Berlin\n" +
                "Mazda,unfallfrei mit vielen Extra,Elektro,2020,Crosstour,KMHHT6KD6DU531503,58,Berlin\n" +
                "Cadillac,mit Klimaautomatik,Elektro,2019,Pilot,3D7TT2HT0BG757774,100,München\n" +
                "GMC,mit Klimaautomatik,Benzin,2019,CR-V,1G6AJ5S31F0274373,99,Köln\n" +
                "Mercedes-Benz,unfallfrei mit vielen Extra,Benzin,2019,Passport,3LNDL2L30BR646325,95,Berlin\n" +
                "Toyota,kleiner Unfallschaden,Gas,2020,Crossroad,1FTEX1CM8BF163532,97,Bonn\n" +
                "Kia,unfallfrei mit vielen Extra,Diesel,2017,Crosstour,WAUHF98P57A361619,81,Hamburg\n" +
                "Suzuki,mit Kindersitz,Diesel,2018,CR-V,1C3ADEBZ6DV465378,65,München\n" +
                "Acura,begehrt!,Diesel,2019,Elysion,3GYFNEE37DS799490,51,Bonn\n" +
                "Isuzu,begehrt!,Elektro,2017,Insight,1N6AD0CU3AC967464,70,Bonn\n" +
                "Honda,kleiner Unfallschaden,Diesel,2018,Ridgeline,JH4NA12625S107541,55,München\n" +
                "Acura,Highline,Gas,2018,Integra SJ,JTHBC1KS5A5652913,98,Bonn\n" +
                "Oldsmobile,begehrt!,Elektro,2018,Beat,1GD21ZCG2DZ578567,85,Berlin";

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
