
package proje__odevi;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Musteri extends Kisi{
    //musteri sınıfı kisi sinifindan miras alıyor.
    Random rnt=new Random();
    private int musteriNumarasi=rnt.nextInt();
    //Hesaplar isimli,musterinin hesaaplarını tutan ArrayList tanımladım.
    //musterinin vadesizHesap ve Yatirimhesabi sınıfından hesaplarini tutan ArrayList'ler tanımladım.
    //VadesizHesap ve YatirimHesap isimli arraylistler tek bir ArrayList'te tutulabilir mi?
    
    private  ArrayList<VadesizHesap > hesaplar1=new ArrayList<>();
    private  ArrayList<YatirimHesabi> hesaplar2=new ArrayList<>();
    private  ArrayList<KrediKarti> krediKartlari=new ArrayList<>();
    public Musteri(String ad,String soyad,String email,int telefonNumarasi)
    {
        super(ad,soyad,email,telefonNumarasi);       
    }
    public void hesapEkle(String hesapTuru)
    {
        Scanner input=new Scanner(System.in);
        //String hesapTuru,
        System.out.println("hesap turu:");
        hesapTuru=input.next();
        
        
        if(hesapTuru=="vadesiz hesap")
        {
            double bakiye;
            System.out.println("Bakiye: ");
            bakiye=input.nextDouble();
            VadesizHesap b=new VadesizHesap(bakiye);  
            hesaplar1.add(b);
        }
        else 
        {
            double bakiye;
            System.out.println("Bakiye: ");
            bakiye=input.nextDouble();
            YatirimHesabi b=new YatirimHesabi(bakiye);
            hesaplar2.add(b);
           
        }
    }
    public void krediKartiEkle()
    {
        Scanner input=new Scanner(System.in);
        int kartNumarasi;
        double limit;
        double guncelBorc;
        int kullanilabilirLimit;
        System.out.println("limit: ");
        limit=input.nextDouble();
        System.out.println("guncelborc: ");
        guncelBorc=input.nextDouble();
        System.out.println("kart numarasi: ");
        kartNumarasi=input.nextInt();
        System.out.println("kullanilabilir limit: ");
        kullanilabilirLimit=input.nextInt();
        KrediKarti b=new KrediKarti(limit,guncelBorc);
        krediKartlari.add(b);
        
    }
    public void hesapSil()
    {
        Scanner input=new Scanner (System.in);
        System.out.println(" silmek istediğiiniz hesap turu: ");
        String z= input.next();
        if(z=="vadesiz hesap")
        {
            	for(VadesizHesap m :hesaplar1)
                {
                    if(m.getbakiye()== 0)
                        hesaplar1.remove(m);
                    else
                        System.out.println("lütfen öncelikle bakiyenizi başka bir hesaba aktarınız");
                }
                
        }
        else
        {
            for (YatirimHesabi o:hesaplar2)
            {
                if(o.getbakiye() == 0)
                    hesaplar2.remove(o);
                else
                    System.out.println("lütfen öncelikle bakiyenizi başka bir hesaba aktarınız");
            }
        }

    
        
    }  
    public void krediKartiSil()        
    {
        for(KrediKarti v: krediKartlari)
        {
           if(v.getguncelBorc() ==0)
           {
               krediKartlari.remove(v);
           }
           else
           {
               System.out.println("lütfen öncelikle borç ödemesi yapiniz");
               
           }
        }
        
    }
    //musteri numarasi için getter ve setter metotlar:
    public void setmusteriNumarasi(int musteriNumarasi)
    {
        this.musteriNumarasi=musteriNumarasi;
    }
    public int getmusteriNumarasi()
    {
        return musteriNumarasi;
    }
    //
    public void sethesaplar1(ArrayList<VadesizHesap> hesaplar1)
    {
        this.hesaplar1=hesaplar1;
        
    }
    public ArrayList<VadesizHesap> gethesaplar1()
    {
        return hesaplar1;
    }
    public void sethesaplar2(ArrayList<YatirimHesabi> hesaplar2)
    {
        this.hesaplar2=hesaplar2;
        
    }
    public ArrayList<YatirimHesabi> gethesaplar2()
    {
        return hesaplar2;
    }
    public void setkredikarti(ArrayList<KrediKarti> krediKartlari)
    {
        this.krediKartlari=krediKartlari;
        
    }
    public ArrayList<KrediKarti> get()
    {
        return krediKartlari;
    }
 
    @Override
    public String toString()
    {
        //hesaplari ve kredikartlarini yazdırmak için forEach metotunu kullandım.
        //bu metotu kullanabilmek iiçin içine a,b,c değişkenleri tanımladım.
        //bu değişkenler her bir rraylistin tanımlandığı sınıf türünden.
        VadesizHesap a;
        YatirimHesabi b;
        KrediKarti c;
        return(super.toString()+" musteri numarasi: "+ musteriNumarasi );
        
    }
    
    
}
