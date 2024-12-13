import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Perpustakaan {
    private List<Anggota> listAnggota = new ArrayList<>();
    private List<Item_Perpustakaan> listItemPerpustakaan = new ArrayList<>();

    public void tampilkanMenu() {
        System.out.println("Menu Perpustakaan");
    }

    public void tampilkanDataAnggota() {
        for (Anggota anggota : listAnggota) {
            System.out.println("Nama: " + anggota.getNama());
        }
    }

    public void tampilkanKoleksi() {
        for (Item_Perpustakaan item : listItemPerpustakaan) {
            System.out.println("Judul: " + item.getJudul());
        }
    }

    public void tambahAnggota(Anggota anggota) {
        listAnggota.add(anggota);
    }

    public void tambahItemPerpustakaan(Item_Perpustakaan item) {
        listItemPerpustakaan.add(item);
    }

}
