package org.carlook.services.exampleData;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class UtilNewUserData {

    public static String getFormat(String s, List<String> attList) {


        String res = "list = new ArrayList<>();";
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


        String s = "Ford,Gossling,Diesel,2017,Quint,WVGAV3AX7DW214002,SU-CL-0094,39,Hamburg\n" +
                "Chevrolet,Bonifazio,Gas,2018,Pilot,1G4CU541654103405,SU-CL-0385,22,Hamburg\n" +
                "Chevrolet,Cheney,Gas,2019,Logo,JM1DE1KYXE0703947,SU-CL-8915,5,Köln\n" +
                "Volkswagen,Madre,Elektro,2017,Legend,WAUEF78E37A212342,SU-CL-0959,2,Berlin\n" +
                "Subaru,Woodyeare,Elektro,2019,CR-V,SAJWA4EC8DM022944,SU-CL-4751,37,Berlin\n" +
                "BMW,Scheu,Diesel,2017,Prelude,WBA5B1C51FG277461,SU-CL-1035,39,Hamburg\n" +
                "Chevrolet,Golborn,Benzin,2018,Ascot,SAJWA1CZ8E8280543,SU-CL-1261,10,Bonn\n" +
                "Maserati,Milington,Diesel,2017,Avancier,2V4RW3D10AR406139,SU-CL-8804,17,Sankt Augustin\n" +
                "Jeep,Bromilow,Benzin,2018,Passport,5N1AT2ML5EC362399,SU-CL-7229,5,Berlin\n" +
                "Chevrolet,Payze,Benzin,2019,Avancier,JHMZF1C67ES664916,SU-CL-3139,12,Köln\n" +
                "Jaguar,Bottell,Elektro,2019,Fit,1FTEX1E8XAF697601,SU-CL-5369,15,Köln\n" +
                "GMC,Wight,Benzin,2019,Jazz,1G6DK1ED5B0670596,SU-CL-1376,43,Bonn\n" +
                "Pontiac,Sibson,Elektro,2018,City,WVGFG9BP6CD684386,SU-CL-5127,42,Sankt Augustin\n" +
                "Hyundai,Churchouse,Diesel,2018,Prelude,SCBBR53W36C112121,SU-CL-3655,43,München\n" +
                "Toyota,Haliburn,Diesel,2018,Airwave,1G6KD54Y72U163947,SU-CL-7186,25,München\n" +
                "Subaru,Shubotham,Diesel,2019,Integra,1G4GC5G38EF842314,SU-CL-1978,12,Köln\n" +
                "Chevrolet,O'Noland,Elektro,2019,Ridgeline,2LMDJ8JK0FB437582,SU-CL-7028,9,Köln\n" +
                "Chevrolet,Domnick,Gas,2017,Logo,WA1WMAFE4ED999255,SU-CL-0649,20,Bonn\n" +
                "Buick,Stopper,Diesel,2018,Domani,WAUFFAFL2FN986138,SU-CL-2240,1,Köln\n" +
                "Volvo,Silveston,Diesel,2019,Integra,WBALX3C58CD947914,SU-CL-7878,42,München\n" +
                "Ford,Crosfield,Diesel,2017,Inspire,1G6AC5S38F0877685,SU-CL-1411,17,Bonn\n" +
                "Pontiac,Manolov,Diesel,2020,Crosstour,JTHBB1BA5A2153959,SU-CL-9284,34,Bonn\n" +
                "Volvo,Lerner,Gas,2019,Civic,WVWED7AJ4CW343762,SU-CL-7916,4,München\n" +
                "Mazda,Nutkins,Elektro,2018,FR-V,1GKUKFDJ6AR885520,SU-CL-6715,3,Bonn\n" +
                "Infiniti,Dibsdale,Benzin,2017,Element,KMHEC4A41FA306466,SU-CL-9937,10,München\n" +
                "Porsche,Rau,Gas,2020,Integra,1FTKR1AD9BP761137,SU-CL-0408,19,Berlin\n" +
                "Hummer,Steels,Benzin,2020,CR-Z,1FTEW1E86AF361561,SU-CL-6325,13,München\n" +
                "GMC,Richardot,Benzin,2018,Quint,5N1AR1NB1AC288665,SU-CL-9107,12,München\n" +
                "Infiniti,McCrorie,Benzin,2019,Rafaga,1G6AY5S33F0137673,SU-CL-4046,22,München\n" +
                "Porsche,Pude,Diesel,2018,Life,5J8TB4H79GL146875,SU-CL-3538,2,Bonn\n" +
                "Buick,Symes,Gas,2020,Odyssey,WDDHH8HB5BA603058,SU-CL-3453,14,München\n" +
                "Kia,Archambault,Gas,2020,Fit,1G6AC5S39D0775227,SU-CL-8193,9,Köln\n" +
                "Ford,Yeoman,Elektro,2020,CR-X,3C3CFFDR9ET337286,SU-CL-7440,32,München\n" +
                "Volkswagen,Giraldez,Gas,2018,Fit,5FNRL3H20AB966180,SU-CL-3667,35,München\n" +
                "Chevrolet,Grogono,Benzin,2020,Jazz,5UXFA13545L288257,SU-CL-8669,43,Berlin\n" +
                "Ford,Vallentine,Benzin,2020,Legend,1GYUKAEF1AR210211,SU-CL-8850,36,Hamburg\n" +
                "Volkswagen,Caddens,Diesel,2018,Legend,JH4CL96868C547045,SU-CL-9374,33,Bonn\n" +
                "Lexus,Houselee,Gas,2018,Civic,1G4GG5E36CF148080,SU-CL-1962,37,Bonn\n" +
                "Lexus,Tuck,Elektro,2020,CR-Z,1C6RD6PT1CS184430,SU-CL-4428,40,Köln\n" +
                "Mazda,Audsley,Elektro,2019,Pilot,1G6DP577170867904,SU-CL-3893,33,Köln\n" +
                "BMW,Dover,Elektro,2017,CR-V,WAUEFAFL1AN046627,SU-CL-1783,6,Bonn\n" +
                "Chrysler,Rendell,Elektro,2018,Odyssey,KM8NU4CC9BU938061,SU-CL-7500,50,Bonn\n" +
                "Suzuki,Gabites,Diesel,2020,Rafaga,19UUA9F27DA687541,SU-CL-9630,32,Sankt Augustin\n" +
                "Mercury,Wynrehame,Benzin,2020,Mobilio,JN8AF5MV1FT658458,SU-CL-1029,9,Sankt Augustin\n" +
                "Toyota,Jenteau,Gas,2017,CR-Z,5NPET4AC5AH431225,SU-CL-1366,31,Sankt Augustin\n" +
                "Saturn,Gouny,Elektro,2020,City,WVWAB7AJ3CW689399,SU-CL-7928,30,Berlin\n" +
                "Dodge,Sutty,Benzin,2020,Orthia,WAUHFAFL1BN322139,SU-CL-4134,18,München\n" +
                "Maybach,Lindsay,Gas,2020,NSX,W04GP5EC6B1335880,SU-CL-7605,16,Sankt Augustin\n" +
                "Mazda,Durbann,Diesel,2018,Mobilio,3VWJX7AJ1AM949150,SU-CL-8430,28,Köln\n" +
                "Saab,Aiken,Elektro,2020,Ascot,1G6AB5R31E0039568,SU-CL-2455,24,Berlin\n" +
                "Oldsmobile,Huckett,Benzin,2017,Civic,3D73Y4HL1AG441716,SU-CL-4437,3,Sankt Augustin\n" +
                "Honda,Eubank,Diesel,2018,Concerto,YV1672MK3B2859341,SU-CL-2755,19,Berlin\n" +
                "Toyota,Arr,Benzin,2017,Element,1D7RB1GP1AS371531,SU-CL-6310,40,Sankt Augustin\n" +
                "Kia,Collerd,Benzin,2019,Life,WVWED7AJ3BW375374,SU-CL-5610,24,Sankt Augustin\n" +
                "Volkswagen,Shalcras,Elektro,2020,Edix,2T1BU4EE5BC902466,SU-CL-7159,46,Sankt Augustin\n" +
                "Lexus,Low,Gas,2017,Logo,5GALRBED1AJ865583,SU-CL-0172,18,Bonn\n" +
                "GMC,Eldon,Gas,2019,Civic,WAUWFAFHXBN883202,SU-CL-6933,9,Bonn\n" +
                "Mercedes-Benz,Jelly,Gas,2017,Insight,WBAFR1C56BC806145,SU-CL-0132,21,Sankt Augustin\n" +
                "MINI,Saltsberger,Gas,2020,Rafaga,2G61W5S85F9312884,SU-CL-2748,27,München\n" +
                "Buick,Shimwall,Benzin,2019,Rafaga,W04GT5GCXB1724496,SU-CL-8355,39,Hamburg\n" +
                "Volkswagen,Hacking,Gas,2020,Element,2C3CA4CD7AH374199,SU-CL-2341,25,Sankt Augustin\n" +
                "Cadillac,Tunno,Elektro,2017,Edix,WAUDF78E68A579801,SU-CL-3518,12,Hamburg\n" +
                "Mercedes-Benz,Antonetti,Gas,2019,Airwave,2LMHJ5AR0AB124005,SU-CL-7821,49,München\n" +
                "Dodge,Valance,Elektro,2020,NSX,5LMJJ3H51CE388195,SU-CL-1267,14,Köln\n" +
                "Bugatti,Leak,Diesel,2019,CR-Z,5UXFA93505L308955,SU-CL-4567,3,Köln\n" +
                "BMW,Carnock,Gas,2020,Rafaga,1GYS4JEF6ER652330,SU-CL-2853,1,Köln\n" +
                "Dodge,Aldiss,Benzin,2018,Crosstour,3GYFNFEYXBS584295,SU-CL-7140,1,München\n" +
                "Mazda,Danby,Gas,2020,Legend,1G6DM8EG1A0523980,SU-CL-4373,49,Berlin\n" +
                "Volkswagen,Juliff,Diesel,2018,Prelude,1B3CC1FBXAN604843,SU-CL-7626,1,Köln\n" +
                "Jeep,Peare,Gas,2019,Edix,1C6RD6NT6CS927876,SU-CL-4647,10,Berlin\n" +
                "Toyota,Reames,Diesel,2019,Accord,JM3ER2A55C0256678,SU-CL-0019,24,Bonn\n" +
                "BMW,Woolway,Elektro,2019,Quint,WBAGN63585D475564,SU-CL-6874,17,München\n" +
                "Isuzu,Siebert,Elektro,2020,Passport,WDBSK7AA8CF964722,SU-CL-9643,3,Sankt Augustin\n" +
                "Mercedes-Benz,Armsby,Elektro,2020,Ascot,3GYVKNEF4AG377755,SU-CL-7486,48,Hamburg\n" +
                "Chrysler,Jurges,Elektro,2017,Concerto,1G6AY5SX7E0153084,SU-CL-5187,47,Köln\n" +
                "Mitsubishi,Hazelhurst,Elektro,2020,Pilot,1FMJU1F57AE480875,SU-CL-3596,2,Bonn\n" +
                "Infiniti,Shapira,Gas,2018,Partner,WAUYP54B61N537366,SU-CL-6680,39,Köln\n" +
                "Mitsubishi,Bulfield,Diesel,2020,Gooding,WBALL5C50DE565735,SU-CL-3751,9,München\n" +
                "Isuzu,Rosson,Elektro,2019,Ridgeline,KNDMB5C18F6118977,SU-CL-0957,9,Sankt Augustin\n" +
                "Suzuki,MacCague,Benzin,2017,Element,1G6DL1ED1B0232512,SU-CL-7516,44,Köln\n" +
                "Nissan,Hitzschke,Benzin,2017,Passport,KNDPB3ACXF7905798,SU-CL-9460,37,Köln\n" +
                "Chevrolet,Georgius,Benzin,2017,Accord,1GYEK63N55R636405,SU-CL-5188,5,Köln\n" +
                "Pontiac,Pestridge,Elektro,2018,Capa,JH4CL96816C730849,SU-CL-9930,38,Sankt Augustin\n" +
                "GMC,Legge,Elektro,2019,Crossroad,5UXFA13555L315367,SU-CL-1483,11,Hamburg\n" +
                "Mercury,Dalla,Elektro,2018,Quint,WAUGFBFC7EN363493,SU-CL-3380,42,Köln\n" +
                "Ford,Beadel,Diesel,2019,FCX Clarity,2GKALMEK2D6121370,SU-CL-6067,2,Sankt Augustin\n" +
                "Ford,Pardoe,Gas,2018,Orthia,1GKS1CE06ER882699,SU-CL-9935,24,Hamburg\n" +
                "Hyundai,Favey,Diesel,2018,Civic,2C3CDXJG5CH919700,SU-CL-4383,15,Berlin\n" +
                "Chevrolet,Sinclar,Gas,2020,Passport,WBA5B3C51ED646136,SU-CL-2151,9,Bonn\n" +
                "Toyota,Eidelman,Gas,2020,CR-V,1FTEX1EW9AF793444,SU-CL-7346,10,Sankt Augustin\n" +
                "BMW,Bamblett,Gas,2018,Crosstour,WAUEF78E66A705544,SU-CL-5637,32,Köln\n" +
                "Pontiac,Halvosen,Elektro,2018,CR-X,2C3CCABG1DH827063,SU-CL-3667,5,Köln\n" +
                "GMC,Alyutin,Elektro,2020,Life,JN1AZ4EH1BM352356,SU-CL-1702,10,München\n" +
                "Chrysler,Snartt,Benzin,2019,City,WAUVC68E65A915806,SU-CL-8001,24,Köln\n" +
                "Cadillac,Carlens,Elektro,2019,Odyssey,WAUDV94F39N183560,SU-CL-0255,14,Sankt Augustin\n" +
                "Lamborghini,Peers,Diesel,2017,Life,3FA6P0SU5FR430398,SU-CL-5818,20,Sankt Augustin\n" +
                "Honda,Gwillym,Gas,2018,Pilot,1FTNF2B57AE676200,SU-CL-0079,44,Köln\n" +
                "Ram,Broggelli,Benzin,2020,Ascot,WVWGD7AJ5EW118326,SU-CL-3482,16,Sankt Augustin\n" +
                "Ford,Hawlgarth,Benzin,2019,Domani,1N6AD0CW5FN001646,SU-CL-6976,8,Hamburg\n" +
                "Mitsubishi,Britee,Diesel,2020,Logo,JH4DC548X4S225699,SU-CL-8402,27,Berlin";

        System.out.println(getFormat(s,list));

    }

    public static void printUserData() {
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
    }

    public static void main(String[] args) {
        printFahrzeugData();
    }
}
