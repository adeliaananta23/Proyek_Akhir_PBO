public class Peminjaman {
    private String nomorTransaksi;
    private Date tanggalPeminjaman;
    private Date tanggalJatuhTempo;
    private List<Item_Perpustakaan> listItemDipinjam = new ArrayList<>();
    private Anggota anggota;

    public void peminjaman() {
        System.out.println("Proses peminjaman dilakukan.");
    }

    public boolean cekKetersediaan(Item_Perpustakaan item) {
        System.out.println("Memeriksa ketersediaan item: " + item.getJudul());
        return true; // Placeholder
    }

    public boolean tambahItemDipinjam(Item_Perpustakaan item) {
        if (cekKetersediaan(item)) {
            listItemDipinjam.add(item);
            return true;
        }
        return false;
    }
}

// Class Pengembalian
class Pengembalian implements Transaksi {

}
