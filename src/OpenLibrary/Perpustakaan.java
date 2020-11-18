package OpenLibrary;

import java.util.ArrayList;
import java.util.Comparator;

public class Perpustakaan {
    private final ArrayList<Koleksi> listKoleksi = new ArrayList<>();
    private final String namaPerpustakaan;

    public Perpustakaan(String namaPerpustakaan) {
        this.namaPerpustakaan = namaPerpustakaan;
    }

    public void addKoleksi(Koleksi koleksi) {
        getListKoleksi().add(koleksi);
    }

    public void displayAllKoleksi() {
        if (!getListKoleksi().isEmpty()) this.getListKoleksi().forEach(Koleksi::display);
        else System.out.println("Koleksi kosong");
    }

    public void displayKoleksiByTitle() {
        TitleComparator comparator = new TitleComparator();
        getListKoleksi().sort(comparator);

        if (!getListKoleksi().isEmpty()) this.getListKoleksi().forEach(Koleksi::display);
        else System.out.println("Koleksi kosong");
    }

    public void displayKoleksiByPublisher() {
        PublisherComparator comparator = new PublisherComparator();
        getListKoleksi().sort(comparator);

        if (!getListKoleksi().isEmpty()) this.getListKoleksi().forEach(Koleksi::display);
        else System.out.println("Koleksi kosong");
    }

    public void displayKoleksiByRelease() {
        ReleaseComparator comparator = new ReleaseComparator();
        getListKoleksi().sort(comparator);

        if (!getListKoleksi().isEmpty()) this.getListKoleksi().forEach(Koleksi::display);
        else System.out.println("Koleksi kosong");
    }

    public void displayKoleksiByType(int kodeJenis) {
        if (!getListKoleksi().isEmpty()) {
            switch (kodeJenis) {
                case 1:
                    getListKoleksi().stream().filter(it -> it.jenis.equals("Buku")).forEach(Koleksi::display);
                    break;

                case 2:
                    getListKoleksi().stream().filter(it -> it.jenis.equals("Majalah")).forEach(Koleksi::display);
                    break;

                case 3:
                    getListKoleksi().stream().filter(it -> it.jenis.equals("Koran")).forEach(Koleksi::display);
                    break;

                case 4:
                    getListKoleksi().stream().filter(it -> it.jenis.equals("Cakram Digital")).forEach(Koleksi::display);
                    break;
            }
        } else System.out.println("Koleksi kosong");
    }

    public ArrayList<Koleksi> getListKoleksi() {
        return listKoleksi;
    }

    public String getNamaPerpustakaan() {
        return namaPerpustakaan;
    }
}

class TitleComparator implements Comparator<Koleksi> {
    @Override
    public int compare(Koleksi koleksi1, Koleksi koleksi2) {
        return koleksi1.judul.compareTo(koleksi2.judul);
    }
}

class PublisherComparator implements Comparator<Koleksi> {
    @Override
    public int compare(Koleksi koleksi1, Koleksi koleksi2) {
        return koleksi1.penerbit.compareTo(koleksi2.penerbit);
    }
}

class ReleaseComparator implements Comparator<Koleksi> {
    @Override
    public int compare(Koleksi koleksi1, Koleksi koleksi2) {
        return koleksi1.tglTerbit.compareTo(koleksi2.tglTerbit);
    }
}