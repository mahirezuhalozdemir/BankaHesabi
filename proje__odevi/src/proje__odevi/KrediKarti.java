
package proje__odevi;

import java.util.Random;


public class KrediKarti {
    Random rbt=new Random();
    //kart numarasini random tanımladık.
    private int kartNumarasi=rbt.nextInt();
    private double limit;
    private double guncelBorc;
    private double kullanilabilirLimit;
    //sınıfa ait constructor'ı tanımladım.
    public KrediKarti(double limit,double guncelBorc)
    {
        this.limit=limit;
        this.guncelBorc=guncelBorc;
        
    }
    //değişkenlere ait get ve set metotlarını tanımladım.
    public void setkartNumarasi(int kartNumarasi)
    {
        this.kartNumarasi=kartNumarasi;
    }
    public int getkartNumarasi()
    {
        return kartNumarasi;
    }
    public void setlimit(double limit)
    {
        this.limit=limit;
    }
    public double getlimit()
    {
        return limit;
    }
    public void setguncelBorc(double guncelBorc)
    {
        this.guncelBorc=guncelBorc;
    }
    public double getguncelBorc()
    {
        return guncelBorc;
    }
    public void setkullanilabilirlimit(double kullanilabilirLimit)
    {
        this.kullanilabilirLimit=kullanilabilirLimit;
    }
    public double getkullanilabilirLimit()
    {
        return kullanilabilirLimit;
    }
    @Override
    //toString metotunu override ettim.
    public String toString()
    {
        return("kart numarasi: "+kartNumarasi+" limit: "+limit+" guncel borc: "+guncelBorc+" kullanilablilir limit: "+kullanilabilirLimit);
        
    }
    
}
