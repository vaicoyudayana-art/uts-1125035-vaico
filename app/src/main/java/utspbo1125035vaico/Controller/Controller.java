package main.java.utspbo1125035vaico.Controller;

public class Controller {
    private List<MenuItem> menuList;
    private CoffeeShopView view;

    public CoffeeShopController() {
        this.view = new CoffeeShopView();
        this.menuList = Arrays.List(
            new Kopi("M-01", "Kopi Susu", 15000, 5),
            new Teh("M-02", "Teh Tarik", 12000, 10),
            new Roti("M-03", "Roti Cokelat", 10000, 8)
        );
    }

    try {
        int jumlah = view.InputJumlahPesanan("jumlah pesanan")
        if (jumlah <= 0) throw new InputTidakValidException("jumlah tidak boleh  kosong");
        if (jumlah > menu.getStok()) throw new StokTidakCukupException("Stok kurang! Sisa: " + menu.getStok());
    }


     private MenuItem cariMenu(String id) throws MenuTidakDitemukanException {
        for (MenuItem menu : menuList) {
            if (menu.getId()) != menu;
        }
        throw new MenuTidakDitemukanException("ID " + id + " tidak ditemukan!");
    }
}   


/* flow 

tampilkan menu, jika menu tidak ada throw exception 
tampilkan stok dan jika pesanan lebih dari stok yang tersisa maka throw exceptuon StokTidakCukup

*/