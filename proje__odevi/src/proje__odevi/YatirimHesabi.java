
package proje__odevi;

import java.util.Scanner;


public class YatirimHesabi extends BankaHesabi{
    
    private String hesapTuru;
    public YatirimHesabi(double bakiye)
    {
        //ata sınıfından bakiyeyi aldı.
        super(bakiye);
    }
    public void paraEkle()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("ne kadar eklenecek:");
        double eklenecek=input.nextDouble();
        //eklenecek tutarı get ve set metotlarıyla hesaba ekledim.
        //get metotu bakiyeyi çeğırdı.
        //get metotuna eklenecek tutar kadar arttırdım.
        //set metotuyla geri gönderdim.
        super.setbakiye(super.getbakiye()+eklenecek);
          
    }
    public void paracek()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("ne kadar cekilecek:");
        double cekilecek=input.nextDouble();
        //çekilecek olan tutarı kullanıcıdan aldım.
        //get metotu bakiyeyi çağırdı.
        //bakiyeden çekilen parayi çıkarttım.
        //super ile ata sınıftan bakiyeyi aldım.
        super.setbakiye(super.getbakiye() - cekilecek);
        
    }
    public void sethesapturu(String hesapturu)
    {
        this.hesapTuru = hesapTuru;
    }
    public String gethesapturu()
    {
        return hesapTuru;
    }
    @Override
    public String toString()
    {
        return(super.toString()+" hesap turu: "+hesapTuru);
    }
}
