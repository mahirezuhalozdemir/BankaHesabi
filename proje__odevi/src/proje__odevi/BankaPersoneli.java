
package proje__odevi;

import java.util.ArrayList;
import java.util.Random;


public class BankaPersoneli extends Kisi{
    Random rnd=new Random();
    //personelld isimli int değişkeni random olarak tanımladım.
    private int personelld=rnd.nextInt();
    //banka personelinin sorumlu olduğu müşterileri tutan bir ArrayList tanımladım.
    private ArrayList<Musteri> musteriler=new ArrayList<>();
    //Musteri sinifindan nesneleri tutan bir Array List olusturdum.
   
    public BankaPersoneli(String ad,String soyad,String email,int telefonNumarasi)
    {
        super(ad,soyad,email,telefonNumarasi);
        
    }
    //banka personeli sinifinin değişkenleri için get ve set metotlarını tanımladım.
    public void setpersonelld(int personelld)
    {
        this.personelld=personelld;
    }
    public int getpersonelld()
    {
        return personelld;
    }
    
    //ArrayList için getter ve setter methodu tanimlamak istedim.
    
    public void setmusteriler( ArrayList <Musteri> musteriler)
    {
        this.musteriler=musteriler;
    }
    public ArrayList<Musteri> getmusteriler()
    {
        return musteriler;
    }
    
    @Override
    //toString tanımlarken banka personelinin sorumlu olduğu musteriler arraylistini de geri döndürmek istedim. Bunun
    //için forEach methodunu kullandım. Çalışıp çalışmayacağını deneyeceğim.
    public String toString()
    {
        return(super.toString()+" personelld: "+personelld);
    }
    
    
}
