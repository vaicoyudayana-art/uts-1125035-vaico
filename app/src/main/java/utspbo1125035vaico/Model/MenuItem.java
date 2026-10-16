package main.java.utspbo1125035vaico;


enum EnumUkuran {
    
        SMALL, MEDIUM, LARGE
    }

public abstract class MenuItem {
    protected String ID;
    protected String Nama;
    protected double hargaBase;
    protected int stok;
    
    public MenuItem (String ID, String Nama, double hargaBase, int stok){
        this.ID = ID;
        this.Nama = Nama;
        this.hargaBase = hargaBase;
        this.stok = stok;
    }
    public String getId() { return ID; }
    public String getNama() { return Nama; }
    public int getStok() { return stok; }
    public void setStok(int stok) { this.stok = stok; }
    public double getHargaBase() { return hargaBase; }


    public abstract double hitungHargaTotal();
    public abstract String getOrderDetail();

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

    double hitungHargaTotal(int jumlah, EnumUkuran ukuran){
        double total = hitungHargaTotal(jumlah);
            switch (ukuran) {
                case MEDIUM: total += 10000;
                    break;
                case LARGE: total += 20000;
                case SMALL:
                default:
                    break;
            }
            return total;
        }
}


        















