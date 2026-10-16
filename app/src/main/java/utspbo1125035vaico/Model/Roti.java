package main.java.utspbo1125035vaico.Model;
import java.util.List;
import main.java.utspbo1125035vaico.MenuItem;

public abstract class roti extends MenuItem implements Customizable{
    private int meses = 0, gula = 0, karamel = 0;

    public roti(String ID, String Nama, double hargaBase, int stok) {
        super(ID, Nama, hargaBase, stok);
    }


    @Override
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
        this.meses = validasi(custom[0], 1);        
        this.gula = validasi(custom[2], 5);     
        this.karamel = validasi(custom[3], 5);  
    }
    
    @Override
    public void customize(List<Integer> custom) {
        this.meses = validasi(custom.get(0), 1);
        this.gula = validasi(custom.get(2), 5);
        this.karamel = validasi(custom.get(3), 5);
    }
    @Override
    public double hitungHargaTotal() {
        return hargaBase + (meses * 3000) + (karamel * 3000); 
    }

    @Override
    public String getOrderDetail() {
        return Nama + " [meses: " + meses + ", Gula: " + gula + ", Karamel: " + karamel + "]";
    }
        
    }


