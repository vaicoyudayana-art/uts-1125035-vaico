package main.java.utspbo1125035vaico;


enum EnumUkuran {
 SMALL, MEDIUM, LARGE
}

enum Enumkategori{

}


interface Customizable {
void customize(List<Integer> customizations);
void customize(int[] customizations);
}



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


    abstract double hitungHargaTotal();
    abstract String getOrderDetail();

    public double hitungHargaTotal(int ) {
        return hitungHargaTotal() *;
    }

    public double hitungHargaTotal (int jumlah){}


}

public class Kopi extends MenuItem {

    public Kopi(int ID, String Nama, double hargaBase, int stok) {
        super(ID, Nama, hargaBase, stok);


    }

}







