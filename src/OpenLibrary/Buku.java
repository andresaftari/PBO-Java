package OpenLibrary;

public class Buku extends Koleksi {
    private final String pengarang;
    private final String tahunMasuk;
    private final String issn;
    private final String isbn;
    private final String doi;
    private final String arxivId;

    public Buku(int noKoleksi,
                String judul,
                String penerbit,
                String tglTerbit,
                String jenis,
                String status,
                String pengarang,
                String tahunMasuk,
                String issn,
                String isbn,
                String doi,
                String arxivId
    ) {
        super(noKoleksi, judul, penerbit, tglTerbit, jenis, status);
        this.noKoleksi = noKoleksi;
        this.judul = judul;
        this.penerbit = penerbit;
        this.tglTerbit = tglTerbit;
        this.jenis = jenis;
        this.status = status;
        this.pengarang = pengarang;
        this.tahunMasuk = tahunMasuk;
        this.issn = issn;
        this.isbn = isbn;
        this.doi = doi;
        this.arxivId = arxivId;
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
                        "\nPengarang buku : " + this.pengarang +
                        "\nTahun Masuk : " + this.tahunMasuk +
                        "\nISSN buku : " + this.issn +
                        "\nISBN buku : " + this.isbn +
                        "\nDOI buku : " + this.doi +
                        "\nARXIVLD buku : " + this.arxivId
        );
    }
}