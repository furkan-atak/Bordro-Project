
package bordroproject;

public class Memur extends Personel{

    public Memur(String adi, String soyAdi,String medeniHali,String tcNo,String girisTarihi,String dogumTarihi, double brütMaas,int cocukSayısı) {
        super(adi, soyAdi, medeniHali,tcNo, girisTarihi, dogumTarihi, brütMaas,cocukSayısı);
    }

  @Override
    public void personelePrimVer() {
        double maas = super.getNetMaas()+(super.getNetMaas()*12.0)/100.0;
        super.setNetMaas(maas);
    }
    
}
