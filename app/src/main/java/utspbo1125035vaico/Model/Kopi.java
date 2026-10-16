package main.java.utspbo1125035vaico.Model;
import java.util.List;
import main.java.utspbo1125035vaico.MenuItem;

public abstract class Kopi extends MenuItem implements Customizable{
    private int rum = 0, es = 0, gula = 0, karamel = 0;

    public Kopi(String ID, String Nama, double hargaBase, int stok) {
        super(ID, Nama, hargaBase, stok);
    }
    
    public int validasi(int nilai, int max) {
        if (nilai < 0) {
            return 0;
        }
        if (nilai > max) {
            return max; 
        }
        return nilai;
    }
    
    @Override
    public void customize(int[] custom) {
        this.rum = validasi(custom[0], 1);     
        this.es = validasi(custom[1], 5);      
        this.gula = validasi(custom[2], 5);     
        this.karamel = validasi(custom[3], 5);  
    }
    
    @Override
    public void customize(List<Integer> custom) {
        this.rum = validasi(custom.get(0), 1);
        this.es = validasi(custom.get(1), 5);
        this.gula = validasi(custom.get(2), 5);
        this.karamel = validasi(custom.get(3), 5);
    }
    
    
    @Override
    public double hitungHargaTotal() {
        return hargaBase + (rum * 3000) + (karamel * 3000); 
    }

    @Override
    public String getOrderDetail() {
        return Nama + " [Rum: " + rum + ", Es: " + es + ", Gula: " + gula + ", Karamel: " + karamel + "]";
    }

}
    



        



