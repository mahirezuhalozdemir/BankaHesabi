
package proje__odevi;

import java.util.Scanner;


public class VadesizHesap extends BankaHesabi{
    private String hesapTuru;
    
 
    public VadesizHesap(double bakiye)
    {
        super(bakiye);
        //ata sınıfındaki bakiyeyi döndürür.
    }
    
    public void paraTransferi(BankaHesabi gonderen,BankaHesabi alan,double miktar)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("gonderen hesap bakiyesi: ");
        System.out.println(gonderen.getbakiye());
        //gönderen hesabin bakiyesini yazdırdım.
     
        
        System.out.println("alan hesap bakiyesi: ");
        System.out.println(alan.getbakiye());
        //alan hesabin bakiyesini yazdirdim.

        System.out.println("ne kadar gondermek istiyorsunuz: ");
        miktar=input.nextDouble();
        //gonderen hesabtan gönderdiği miktarı get ve set metotlarını kullanarak eksilttim.
        gonderen.setbakiye(gonderen.getbakiye()- miktar);
        //alan hesabın : get metotu ile bakiyesini öğrendim. set metotu ile de bu bakiyeye aldığı parayı ekledim.
        alan.setbakiye(alan.getbakiye() + miktar);
        
  
    }
   
    
    public void krediKartiBorcOdeme(KrediKarti e)
    {
        //kredikarti seçme işlemini nasıl yapacağımı bulamadım.
        //tekrar bir kredi karti tanımlamadan olan kredi kartını seçme işlemini finding kullanarak yapmak istedim.
        //bulamadım maalesef.
        //TEKRAR DENE
        double odenecek;
        Scanner al= new Scanner(System.in);
        System.out.println("ne kadar odeyeceksin");
        odenecek=al.nextDouble();
        e.setkullanilabilirlimit(e.getkullanilabilirLimit() - odenecek);
        e.setguncelBorc(e.getguncelBorc() - odenecek);
        
        
        
    }
    public void sethesapturu(String hesapturu)
    {
        this.hesapTuru=hesapTuru;
    }
    public String gethesapturu()
    {
        return hesapTuru;
    }
    @Override
    public String toString()
    {
        return(super.toString()+ "hesap turu: "+hesapTuru);
    }
    
}
