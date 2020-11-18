package OpenLibrary;

public abstract class Koleksi {
    protected String judul, penerbit, tglTerbit, jenis, status;
    protected int noKoleksi;

    public Koleksi(int noKoleksi, String judul, String penerbit, String tglTerbit, String jenis, String status) {
        this.noKoleksi = noKoleksi;
        this.judul = judul;
        this.penerbit = penerbit;
        this.tglTerbit = tglTerbit;
        this.jenis = jenis;
        this.status = status;
    }

    protected abstract void display();
}