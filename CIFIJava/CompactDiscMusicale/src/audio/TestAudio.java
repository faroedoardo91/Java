package audio;

public class TestAudio {

	public static void main(String[] args) {
		
		Brano b1 = new Brano(1,"aaa",234);
        Brano b2 = new Brano(2,"bbb",321);
        Brano b3 = new Brano(3,"qqq",741);
        Brano b4 = new Brano(4,"xxx",654);
        Brano b5 = new Brano(5,"asdf",159);
        Brano b6 = new Brano(6,"xsw",850);
        Brano b7 = new Brano(7,"fdrtg",53);
        Brano b8 = new Brano(8,"vfr",300);
        Brano b9 = new Brano(9,"bgt",540);
        Brano b10 = new Brano(10,"hyn",560);
        
        Brano[] elenco = {b1,b2,b3,b4,b5,b6,b7,b8,b9,b10};
        
        /*
        Brano[] elenco = new Brano[10];
        elenco[0]=b1;
        elenco[1]=b2;
        ecc..
        
        */
        
        CompactDisc cd = new CompactDisc("Titolo del cd","Artista del cd","Casa Discografica del cd",12.50,elenco);
        
        System.out.println(cd);
        
    }

}
