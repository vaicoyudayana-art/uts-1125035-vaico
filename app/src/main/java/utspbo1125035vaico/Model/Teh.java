package main.java.utspbo1125035vaico.Model;
import java.util.List;
import main.java.utspbo1125035vaico.MenuItem;

public abstract class Teh extends MenuItem implements Customizable{
    private int boba = 0, es = 0, gula = 0, karamel = 0;

    public Teh(int ID, String Nama, double hargaBase, int stok) {
        super(ID, Nama, hargaBase, stok);
    }
    @Override
    public double hitungHargaTotal() {
        return hargaBase + (boba * 3000) + (karamel * 3000); 
    }

    @Override
    public String getOrderDetail() {
        return nama + " [Boba: " + boba + ", Es: " + es + ", Gula: " + gula + ", Karamel: " + karamel + "]";
    }

    @Override
        public void customize(List<Integer> customizations){
            if (customizations.length());
            this.boba = customizations.get();
            this.es = customizations.get();
            this.gula = customizations.get();
            this.karamel = customizations.get();


        }

        
    }


