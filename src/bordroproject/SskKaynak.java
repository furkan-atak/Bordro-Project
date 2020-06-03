
package bordroproject;

public class SskKaynak {
private static double asgariUcret_Ssk = 2500d;    
   private double sskDamga,sskAgi,sskİsciPay,sskEsasUcret,gelirVergisi;
    public double getAsgariUcret_Ssk() {
        return asgariUcret_Ssk;
    }

    public double getSskAgi(Personel p) {
        return (p.getBrütMaas()*6.0)/100.0;
    }

    public double getSskDamga(Personel p) {
        sskDamga = (p.getBrütMaas()*6.0)/100.0;
        return sskDamga;
    }

    public double getSskİsciPay(Personel p) {
        sskİsciPay = (p.getBrütMaas()*6.0)/100.0;
        return sskİsciPay;
    }

    public double getGelirVergisi(Personel p) {
        if(p.getBrütMaas() < 15000.0){
        gelirVergisi = (p.getBrütMaas()*(10.0-((double)p.getCocukSayısı())))/100.0;
        }else{
        gelirVergisi = (p.getBrütMaas()*(15.0-((double)p.getCocukSayısı())))/100.0;
        }
        return gelirVergisi;
    }
  
}
