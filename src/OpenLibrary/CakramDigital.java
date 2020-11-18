package OpenLibrary;

public class CakramDigital extends Koleksi {
    private final String jenisMedia;

    public CakramDigital(
            int noKoleksi,
            String judul,
            String penerbit,
            String tglTerbit,
            String jenis,
            String status,
            String jenisMedia
    ) {
        super(noKoleksi, judul, penerbit, tglTerbit, jenis, status);
        this.noKoleksi = noKoleksi;
        this.judul = judul;
        this.penerbit = penerbit;
        this.tglTerbit = tglTerbit;
        this.jenis = jenis;
        this.status = status;
        this.jenisMedia = jenisMedia;
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
                        "\nJenis media : " + this.jenisMedia
        );
    }
}