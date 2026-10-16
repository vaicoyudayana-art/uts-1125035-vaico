package main.java.utspbo1125035vaico.Model;
import java.util.List;
import main.java.utspbo1125035vaico.MenuItem;

public abstract class Kopi extends MenuItem implements Customizable{
    private int rum = 0, es = 0, gula = 0, karamel = 0;

    public Kopi(int ID, String Nama, double hargaBase, int stok) {
        super(ID, Nama, hargaBase, stok);
    }
    @Override
    public double hitungHargaTotal() {
        return hargaBase + (rum * 3000) + (karamel * 3000); 
    }

    @Override
    public String getOrderDetail() {
        return nama + " [Rum: " + rum + ", Es: " + es + ", Gula: " + gula + ", Karamel: " + karamel + "]";
    }

    @Override
        public void customize(List<Integer> customizations){
            if (customizations.length());
            this.rum = customizations.get();
            this.es = customizations.get();
            this.gula = customizations.get();
            this.karamel = customizations.get();


        }
        
    }


