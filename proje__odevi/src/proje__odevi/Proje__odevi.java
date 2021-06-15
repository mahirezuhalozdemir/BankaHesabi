
package proje__odevi;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

 public class Proje__odevi extends JFrame implements ActionListener{
    
    
    
    
    
    Kisi nesne=new Kisi("zuhal","ozdemir","z@gmail",123);
    
    ArrayList<Musteri> musterilerrr=nesne.getClass().
    
    
    
     JTextField adtxt,soyadtxt,emailtxt,telnotxt,ogrenciad,ogrencinumara,uyaritxt,bilgiler,musteriekle;
     JButton buton1,buton2,buton3,buton4;
     JLabel label1,label2,label3,label4,labeladsoyad,labelnumara;
     JFrame frame1;
   
    Proje__odevi(){
    frame1=new JFrame();
    
    adtxt=new JTextField();
    soyadtxt=new JTextField();
    emailtxt=new JTextField();
    telnotxt=new JTextField();
    
    ogrenciad=new JTextField("MAHİRE ZÜHAL ÖZDEMİR");
    ogrencinumara=new JTextField("19360859015");
    adtxt.setBounds(50,0,100,50);
    soyadtxt.setBounds(50,50,100,50);
    emailtxt.setBounds(50,100,100,50);
    telnotxt.setBounds(50,150,100,50);
    
    ogrenciad.setBounds(400, 450, 150, 50);
    ogrencinumara.setBounds(400,500,150,50);
    frame1.add(adtxt);
    frame1.add(soyadtxt);
    frame1.add(emailtxt);
    frame1.add(telnotxt);
    frame1.add(ogrenciad);
    frame1.add(ogrencinumara);
    
    
    label1=new JLabel("ADI: ");
    label1.setBounds(0,0,100,50);
    frame1.add(label1);
    
    label2=new JLabel("SOYADI: ");
    label2.setBounds(0,50,100,50);
    frame1.add(label2);
    
    label3=new JLabel("EMAIL: ");
    label3.setBounds(0,100,100,50);
    frame1.add(label3);
    
    label4=new JLabel("TEL_NO: ");
    label4.setBounds(0,150,100,50);
    frame1.add(label4);
    
    labeladsoyad=new JLabel("AD-SOYAD: ");
    labeladsoyad.setBounds(300, 450, 100, 50);
    frame1.add(labeladsoyad);
    
    labelnumara=new JLabel("NUMARANİZ: ");
    labelnumara.setBounds(300,500,100,50);
    frame1.add(labelnumara);
    
    
    buton1=new JButton("Musteri Ekle");
    buton1.setBounds(100,300,150,50);
    frame1.add(buton1);
    
    buton2=new JButton("Musteri Bilgileri");
    buton2.setBounds(0,350,150,50);
    frame1.add(buton2);
    
    buton3=new JButton("Hesap Bilgileri");
    buton3.setBounds(150,350,150,50);
    frame1.add(buton3);
    
    buton4=new JButton("Kredi Bilgileri");
    buton4.setBounds(300,350,150,50);
    frame1.add(buton4);
    
    
    buton1.addActionListener(this); //butonlari action listener arayüzüne ekledik
    buton2.addActionListener(this);
    buton3.addActionListener(this);
    buton4.addActionListener(this);
    //butonları arayüze eklememizin nedeni butonlara tıkladığmızda ne yapacağını belirtecek olmamız.
    frame1.getContentPane().setBackground(Color.YELLOW);
    //frame arka planına sarı renk verdim.
    frame1.setLayout(null);
    frame1.setSize(700,700); //çerçevenin boyutu
    frame1.setVisible(true); //gorunmesini sağlar.
    frame1.setLocationRelativeTo(null); //ekranın ortasında gösterir.
    
    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //çarpıya bastiğimizda kapanması için setdefault'u eklememiz lazzım.
    
    
}
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource().equals(buton1)) 
        {
            
            
            Musteri nesne=new Musteri(adtxt.getText(),soyadtxt.getText(),emailtxt.getText(),telnotxt.getX());
            musteriekle.setBounds(150,0,100,100);
            frame1.add(musteriekle);
           
        } 
        
        else if(e.getSource().equals(buton2))
        {
            BankaPersoneli nesne1=new BankaPersoneli(adtxt.getText(),soyadtxt.getText(),emailtxt.getText(),telnotxt.getX());
            
            for(Musteri nesne: nesne1.getmusteriler())
            {
                if(nesne1.getmusteriler().contains(nesne))
                {
                    bilgiler = new JTextField(nesne.toString());
                    bilgiler.setBounds(50,200,200,100);
                    frame1.add(bilgiler);
                }
                else
            {
                    uyaritxt=new JTextField("bu isimde bir müşteri yok");
                    uyaritxt.setBounds(50,200,150,50);
                    frame1.add(uyaritxt);
            }
            }
  
            
        }
        else if(e.getSource().equals(buton3))
        {
            //hesap bilgileri
            BankaPersoneli nesne1 =new BankaPersoneli(adtxt.getText(),soyadtxt.getText(),emailtxt.getText(),telnotxt.getX());
            for(Musteri a: nesne1.getmusteriler())
            {
                if(nesne1.getmusteriler().contains(nesne1))
                {
                   
                    bilgiler=new JTextField(a.BankaHesabi().toString());
                    bilgiler.setBounds(50,200,200,100);
                    frame1.add(bilgiler);
                    //bilgiler isimli text alanının açarak içine bilgileri yazdırdım.
                }
                else
                {
                    uyaritxt=new JTextField("bu isimde bir müşteri yok");
                    uyaritxt.setBounds(50,200,150,50);
                    frame1.add(uyaritxt);
                    //musteriyi bulamazsa ekrana txt içinde bulamadığını yazar.
                }
                
            }
            
        }
        else 
        {
            BankaPersoneli nesne1 =new BankaPersoneli(adtxt.getText(),soyadtxt.getText(),emailtxt.getText(),telnotxt.getX());
            
            
            for(Musteri b:nesne1.getmusteriler())
            {
                //musteriler sınıfınında dongü yardımıyla,bilgilerini girdiğimiz musteriiyi bulmaya çalıştım.
                if(nesne1.getmusteriler().contains(nesne1))
                {
                    //bilgilerini girdiğimiz musteriyle, musteriiler sınıfında daha önce tanımladığımız nesne aynı ise kredi karti bilgilerini yazdırmayı denedim.
                     bilgiler=new JTextField(nesne1.KrediKarti.toString());
                     bilgiler.setBounds(50,200,200,100);
                     frame1.add(bilgiler);
                   
                }
                else
                {
                    uyaritxt=new JTextField("bu isimde bir müşteri yok");
                    uyaritxt.setBounds(50,200,150,50);
                    frame1.add(uyaritxt);
                    //eger musteri yoksa uyarı yazdırdım ekrana.
                    
                }
                
            }
            
        }
        
    }
    
     public static void main(String[] args) {
        
        Musteri muss=new Musteri("zuhal", "ozdemir", "z@gmail", 123);
        
    
       Proje__odevi nesneee=new Proje__odevi();
        
        
       
}


    
}
