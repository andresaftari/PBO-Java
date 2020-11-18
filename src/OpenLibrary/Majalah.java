package OpenLibrary;

public class Majalah extends Koleksi {
    private final String noEdisi;
    private final String jenisTerbit;

    public Majalah(
            int noKoleksi,
            String judul,
            String penerbit,
            String tglTerbit,
            String jenis,
            String status,
            String noEdisi,
            String jenisTerbit
    ) {
        super(noKoleksi, judul, penerbit, tglTerbit, jenis, status);
        this.noKoleksi = noKoleksi;
        this.judul = judul;
        this.penerbit = penerbit;
        this.tglTerbit = tglTerbit;
        this.jenis = jenis;
        this.status = status;
        this.noEdisi = noEdisi;
        this.jenisTerbit = jenisTerbit;
    }

    @Override
    protected void display() {
        System.out.println("\n========== Data " + this.jenis + " ==========");
        System.out.println(
                "\nNo Koleksi : " + this.noKoleksi +
                        "\nJudul : " + this.judul +
                        "\nPenerbit : " + this.penerbit +
                        "\nTanggal Terbit : " + this.tglTerbit +
                        "\nStatus buku : " + this.status +
                        "\nNomor edisi : " + this.noEdisi +
                        "\nJenis terbit : " + this.jenisTerbit
        );
    }
}