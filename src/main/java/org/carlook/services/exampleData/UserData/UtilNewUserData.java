package org.carlook.services.exampleData.UserData;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class UtilNewUserData {

    public static String getObjects(String s, List<String> attList) {


        String res = "List<" + "UserDTO" + "> list = new ArrayList<>();";
        int usrCounter = 0;
        Scanner sc = new Scanner(s);
        while (sc.hasNext()) {
            Iterator<String> it = attList.iterator();
            res += "\nlist.add(DTOFactories.createUserDTO().set" + it.next() + "(\"";
            String tmp = sc.nextLine().trim();
            for (int i = 0; i < (tmp.length()-1); ++i) {
                char tmpChar = tmp.charAt(i);
                if (tmpChar == ',') {
                    res += "\").set" + it.next() + "(\"";
                } else {
                    res += tmpChar;
                }
            }
            res += "\"));";
        }
        return res;
    }



        System.out.println(getObjects("jemblin0@wordpress.org,Emblin,demblin0@carlook.de,35D7zZY98WRx\n" +
                "kroantree1@t.co,Roantree,croantree1@carlook.de,vnvZYrQcnhl\n" +
                "xheppner2@123-reg.co.uk,Heppner,bheppner2@carlook.de,V9JJWw6\n" +
                "bhouchen3@mail.ru,Houchen,fhouchen3@carlook.de,s7HsaVhj9LUN\n" +
                "dmathevon4@accuweather.com,Mathevon,pmathevon4@carlook.de,5xWuFS\n" +
                "hlittell5@ftc.gov,Littell,glittell5@carlook.de,qipiMn\n" +
                "cmccurtain6@youtube.com,McCurtain,cmccurtain6@carlook.de,cbRnQvEPzoty\n" +
                "pruselin7@youtu.be,Ruselin,rruselin7@carlook.de,3XlCp7VtBY9\n" +
                "vshay8@rakuten.co.jp,Shay,lshay8@carlook.de,CgCu2ziyK\n" +
                "nduffield9@phpbb.com,Duffield,lduffield9@carlook.de,aELHk8\n" +
                "mprobeya@upenn.edu,Probey,aprobeya@carlook.de,rAbcG7W\n" +
                "stwomeyb@joomla.org,Twomey,wtwomeyb@carlook.de,FoGXx8RcOp\n" +
                "rgeallec@latimes.com,Gealle,tgeallec@carlook.de,zo5Qk1bbkH\n" +
                "shawksworthd@guardian.co.uk,Hawksworth,mhawksworthd@carlook.de,cbjb0T7J\n" +
                "lcovolinie@census.gov,Covolini,acovolinie@carlook.de,N4snuu\n" +
                "msharpef@macromedia.com,Sharpe,wsharpef@carlook.de,TaJHAR7VEjix\n" +
                "alorkingsg@nydailynews.com,Lorkings,alorkingsg@carlook.de,jNpsFj0iVcTR\n" +
                "cshoreh@uol.com.br,Shore,jshoreh@carlook.de,rqqQfZa\n" +
                "kklimentyonoki@trellian.com,Klimentyonok,gklimentyonoki@carlook.de,WtNoKnFIp19i\n" +
                "cwilsonj@simplemachines.org,Wilson,lwilsonj@carlook.de,xrsIL0Swv\n" +
                "fmaundk@sakura.ne.jp,Maund,dmaundk@carlook.de,qmvJJxhB\n" +
                "aswitzerl@prnewswire.com,Switzer,aswitzerl@carlook.de,lFpkS20I7xXR\n" +
                "gharnesm@sogou.com,Harnes,lharnesm@carlook.de,Yo8SyatF8x\n" +
                "rmartensenn@lulu.com,Martensen,gmartensenn@carlook.de,sahxxm3eE9\n" +
                "dgribbino@illinois.edu,Gribbin,lgribbino@carlook.de,W0EfUECDTREH\n" +
                "nbeckenhamp@sourceforge.net,Beckenham,pbeckenhamp@carlook.de,Qnhh7DyPf\n" +
                "jtrinkwonq@tripadvisor.com,Trinkwon,ltrinkwonq@carlook.de,7piTAb4cvcbG\n" +
                "sfebenr@theguardian.com,Feben,ofebenr@carlook.de,N6mYLxF\n" +
                "rcators@163.com,Cator,lcators@carlook.de,Bcpet9r1b\n" +
                "ldelvest@amazon.com,Delves,sdelvest@carlook.de,QETZPkyvAd\n" +
                "ginglesonu@wikia.com,Ingleson,minglesonu@carlook.de,v6QlQB\n" +
                "osoldiv@army.mil,Soldi,msoldiv@carlook.de,MeZehqhUZ5yT\n" +
                "dbartusekw@feedburner.com,Bartusek,kbartusekw@carlook.de,BWmvrlIFciy\n" +
                "bstutherx@surveymonkey.com,Stuther,cstutherx@carlook.de,ZHMOSeH1Rmy4\n" +
                "mgiffy@intel.com,Giff,kgiffy@carlook.de,QrfOmuxzlm21\n" +
                "chinchshawz@wunderground.com,Hinchshaw,ahinchshawz@carlook.de,TeiytjNTBI4\n" +
                "mgarroway10@google.ca,Garroway,igarroway10@carlook.de,xGGXlzS\n" +
                "adowda11@blog.com,Dowda,adowda11@carlook.de,8Yf24sj\n" +
                "cidiens12@microsoft.com,Idiens,cidiens12@carlook.de,xfvMP0bYwyH\n" +
                "mjerwood13@posterous.com,Jerwood,vjerwood13@carlook.de,7AgXun9OIY\n" +
                "kapps14@blogger.com,Apps,japps14@carlook.de,PoIOhLZ\n" +
                "rkirsopp15@comsenz.com,Kirsopp,mkirsopp15@carlook.de,EfYFGaqZgP\n" +
                "cstiegers16@wordpress.com,Stiegers,jstiegers16@carlook.de,GyPjV9Jdds18\n" +
                "bemblen17@buzzfeed.com,Emblen,aemblen17@carlook.de,0J4VFCj\n" +
                "dsowley18@istockphoto.com,Sowley,rsowley18@carlook.de,oEvARHNQd\n" +
                "hmauchlen19@com.com,Mauchlen,emauchlen19@carlook.de,KKeQQFV\n" +
                "hsodeau1a@forbes.com,Sodeau,esodeau1a@carlook.de,3Ag6Ul4b\n" +
                "fsabberton1b@who.int,Sabberton,jsabberton1b@carlook.de,6Oei1SxWUD\n" +
                "jsaterweyte1c@dagondesign.com,Saterweyte,psaterweyte1c@carlook.de,z36fDpG8pR\n" +
                "karpin1d@issuu.com,Arpin,carpin1d@carlook.de,eOJF5F", list));
    }
}
