
package proje__odevi;


public class Kisi {
    private String ad;
    private String soyad;
    private String email;
    private int telefonNumarasi;
    //uml diagramında belirtilen değişkenleri tanımladım.Hepsi private.
    //bu sınıfa ait belirtilen yapıcıyı tanımladım.
    public Kisi(String ad,String soyad,String email,int telefonNumarasi)
    {
        this.ad=ad;
        this.soyad=soyad;
        this.email=email;
        this.telefonNumarasi=telefonNumarasi;   
    }
    //değişkenler için getter ve setter metotlarını tanımladım.
     public void setad(String ad)
    {
        this.ad=ad;
    }
    public String getad()
    {
        return ad;
    }
    public void setsoyad(String soyad)
    {
        this.soyad=soyad;
    }
    public String getsoyad()
    {
        return soyad;
    }
    public void setemail(String email)
    {
        this.email=email;
    }
    public String getemail()
    {
        return email;
    }
    public void settelefonNumarasi(int telefonNumarasi)
    {
        this.telefonNumarasi=telefonNumarasi;
    }
    public int gettelefonNumarasi()
    {
        return telefonNumarasi;
    } 
    //bu class için toString metotunu override ettim.
    @Override
    public String toString()
    {
        return("kisinin adi: "+ ad +" kisinin soyadi:"+soyad+" kisinin emaili: "+email+" kisinin telefon numarasi: "+telefonNumarasi);
        
    }
      
}
