package main.java.utspbo1125035vaico;

import main.java.utspbo1125035vaico.Model.EnumUkuran;

public abstract class MenuItem {
    protected int ID;
    protected String Nama;
    protected double hargaBase;
    protected int Stok;
    
    public MenuItem (int ID, String Nama, double hargaBase, int stok){
        this.ID = ID;
        this.Nama = Nama;
        this.hargaBase = hargaBase;
        this.stok = stok;
    }
    public String getId() { return id; }
    public String getNama() { return nama; }
    public int getStok() { return stok; }
    public void setStok(int stok) { this.stok = stok; }
    public double getHargaBase() { return hargaBase; }


    public abstract double hitungHargaTotal();
    abstract String getOrderDetail();

    public double hitungHargaTotal(int jumlah) {
        return hitungHargaTotal() * jumlah;
    }

    public double hitungHargaTotal(int jumlah, String kodePromo) {
            double total = hitungHargaTotal(jumlah);
            if (kodePromo != null){
                System.out.println( "Selamat anda mendapatkan diskon sebesar : 30%");
             total = total * 0.7;
            }
         return total;
    }

    public hitungHargaTotal(int jumlah, EnumUkuran ukuran){
        double total = hitungHargaTotal(jumlah);
            switch (ukurankuran) {
                case MEDIUM: total += 10000;
                    break;
                case LARGE: total += 20000;
                case SMALL:
                default:
                    break;
            }
        }
}


        















