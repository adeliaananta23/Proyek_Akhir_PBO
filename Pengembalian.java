public class Pengembalian {
    private String nomorTransaksi;
    private Date tanggalPengembalian;
    private List<Item_Perpustakaan> listItemDikembalikan = new ArrayList<>();
    private Anggota anggota;

    public void pengembalian() {
        System.out.println("Proses pengembalian dilakukan.");
    }

    public boolean verifikasiPengembalian(Item_Perpustakaan item) {
        System.out.println("Memverifikasi pengembalian item: " + item.getJudul());
        return true; // Placeholder
    }
}

