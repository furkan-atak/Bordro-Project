package bordroproject;

public class Personel {

    private String adi, soyAdi, medeniHali, girisTarihi, tcNo, tür,dogumTarihi;
    private double netMaas, brütMaas, kesintiler;
    private int cocukSayısı;

    public Personel(String adi, String soyAdi, String medeniHali, String tcNo, String girisTarihi,String dogumTarihi, double brütMaas,int cocukSayısı) {
        this.adi = adi;
        this.soyAdi = soyAdi;
        this.medeniHali = medeniHali;
        this.girisTarihi = girisTarihi;
        this.dogumTarihi = dogumTarihi;
        this.tcNo = tcNo;
        this.brütMaas = brütMaas;
        
    }

    public String getAdi() {
        return adi;
    }
   
    public double getNetMaas() {
        return netMaas;
    }

    public void setNetMaas(double netMaas) {
        netMaas = this.brütMaas - this.kesintiler;
        this.netMaas = netMaas;
    }
 
    public String getMedeniHali() {
        return medeniHali;
    }
   
    public void setMedeniHali(String medeniHali) {
        this.medeniHali = medeniHali;
    }

    public String getSoyAdi() {
        return soyAdi;
    }

    public String getTarihGiris() {
        return girisTarihi;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }
    
    public String getTcNo() {
        return tcNo;
    }

    public double getBrütMaas() {
        return brütMaas;
    }

    public void setBrütMaas(double brütMaas) {
        this.brütMaas = brütMaas;
    }
   
    public String getTür() {
        return tür;
    }

    public void setTür(String tür) {
        this.tür = tür;
    }

    public int getCocukSayısı() {
        return cocukSayısı;
    }

    public void setCocukSayısı(int cocukSayısı) {
        this.cocukSayısı = cocukSayısı;
    }
     
    public double getKesintiler() {
        return kesintiler;
    }

    public void setKesintiler(double kesintiler) {
        this.kesintiler = +kesintiler;
    }
    public void personelePrimVer(){
        this.netMaas += (netMaas*10.0)/100.0;
    }
}
