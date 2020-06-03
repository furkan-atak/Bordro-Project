
package bordroproject;


public class Isci extends Personel{

    public Isci(String adi, String soyAdi,String medeniHali,String tcNo,String girisTarihi,String dogumTarihi, double brütMaas,int cocukSayısı) {
        super(adi, soyAdi, medeniHali, tcNo,girisTarihi,dogumTarihi,brütMaas,cocukSayısı);
    }
    @Override
    public void personelePrimVer() {
        double maas = super.getNetMaas()+(super.getNetMaas()*20.0)/100.0;
        super.setNetMaas(maas);
    }
}
