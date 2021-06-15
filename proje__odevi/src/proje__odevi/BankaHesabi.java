
package proje__odevi;

import java.util.ArrayList;
import java.util.Random;


public class BankaHesabi {
    //iban numarasini random olarak alacagimız için bir nesne tanımladım.
    Random ret=new Random();
    private double iban=ret.nextDouble();
    private double bakiye;
    //bankaHesabi sınıfına ait bir constructor tanimladim.
    public BankaHesabi(double bakiye)
    {
        this.bakiye=bakiye;    
    }
    //sinif içindeki değişkenler için set ve get metotlarını yazdim.
    //set metotu void tanimlanir geriye bir değer dönndürmez.
    public void setiban(double iban)
    {
        this.iban=iban;
    }
    //get metotu değişkenin türünde tanımlanır ve değişkeni döndürür.
    public double getiban()
    {
        return iban;
    }
    public void setbakiye(double bakiye)
    {
        this.bakiye=bakiye;
    }
    public double getbakiye()
    {
        return bakiye;
    }
    //bu class için tostring metotunu tanımladım.
    //tostring metotu bakiyeyi ve iban'i döndürür.
    public String toString()
    {
        return(" bakiye: "+bakiye+" iban: "+iban);
        
    }
    
}
