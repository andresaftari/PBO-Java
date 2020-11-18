package OpenLibrary;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Perpustakaan perpustakaan = new Perpustakaan("Open Library");
    static Koleksi buku, koran, majalah, cakram;

    public static void main(String[] args) {
        int positionBuku = 0, positionMajalah = 0, positionKoran = 0, positionCakram = 0;
        String jenis;
        System.out.println("\n========== SELAMAT DATANG DI APLIKASI KATALOG " + perpustakaan.getNamaPerpustakaan() + " ==========\n");

        do {
            try {
                System.out.print(
                        "\nSilakan pilih salah satu dari opsi di bawah ini :" +
                                "\n1. Input koleksi" +
                                "\n2. Tampilkan seluruh koleksi" +
                                "\n3. Tampilkan seluruh koleksi berdasarkan judul" +
                                "\n4. Tampilkan seluruh koleksi berdasarkan jenis" +
                                "\n5. Tampilkan seluruh koleksi berdasarkan tanggal terbit" +
                                "\n6. Tampilkan seluruh koleksi berdasarkan penerbit" +
                                "\n7. Exit program" +
                                "\nPilihan Anda [1 - 7] : ");
                int option1 = Integer.parseInt(br.readLine());

                switch (option1) {
                    case 1:
                        System.out.print(
                                "\nJenis koleksi yang ingin diinput?" +
                                        "\n1. Buku" +
                                        "\n2. Koran" +
                                        "\n3. Majalah" +
                                        "\n4. Cakram Digital" +
                                        "\n5. Kembali ke menu utama" +
                                        "\nPilihan Anda [1 - 5] : "
                        );
                        int option2 = Integer.parseInt(br.readLine());

                        switch (option2) {
                            case 1:
                                jenis = "Buku";
                                System.out.print("Input judul : ");
                                String judulBuku = br.readLine();
                                System.out.print("Input penerbit : ");
                                String penerbitBuku = br.readLine();
                                System.out.print("Input tanggal terbit : ");
                                String releaseBuku = br.readLine();
                                System.out.print("Input status ketersediaan (Ada/Rusak/Hilang) : ");
                                String statusBuku = br.readLine();
                                System.out.print("Input pengarang : ");
                                String authorBuku = br.readLine();
                                System.out.print("Input tahun masuk : ");
                                String tahunMasukBuku = br.readLine();
                                System.out.print("Input ISSN : ");
                                String issnBuku = br.readLine();
                                System.out.print("Input ISBN : ");
                                String isbnBuku = br.readLine();
                                System.out.print("Input DOI : ");
                                String doiBuku = br.readLine();
                                System.out.print("Input ARXIVLD : ");
                                String arxivIdBuku = br.readLine();

                                positionBuku++;

                                buku = new Buku(
                                        positionBuku,
                                        judulBuku,
                                        penerbitBuku,
                                        releaseBuku,
                                        jenis,
                                        statusBuku,
                                        authorBuku,
                                        tahunMasukBuku,
                                        issnBuku,
                                        isbnBuku,
                                        doiBuku,
                                        arxivIdBuku
                                );
                                perpustakaan.addKoleksi(buku);
                                break;

                            case 2:
                                jenis = "Koran";
                                System.out.print("Input judul : ");
                                String judulKoran = br.readLine();
                                System.out.print("Input penerbit : ");
                                String penerbitKoran = br.readLine();
                                System.out.print("Input tanggal terbit : ");
                                String releaseKoran = br.readLine();
                                System.out.print("Input status ketersediaan (Ada/Rusak/Hilang) : ");
                                String statusKoran = br.readLine();
                                System.out.print("Input jenis terbit : ");
                                String jenisTerbitKoran = br.readLine();

                                positionKoran++;

                                koran = new Koran(
                                        positionKoran,
                                        judulKoran,
                                        penerbitKoran,
                                        releaseKoran,
                                        jenis,
                                        statusKoran,
                                        jenisTerbitKoran
                                );
                                perpustakaan.addKoleksi(koran);
                                break;

                            case 3:
                                jenis = "Majalah";
                                System.out.print("Input judul : ");
                                String judulMajalah = br.readLine();
                                System.out.print("Input penerbit : ");
                                String penerbitMajalah = br.readLine();
                                System.out.print("Input tanggal terbit : ");
                                String releaseMajalah = br.readLine();
                                System.out.print("Input status ketersediaan (Ada/Rusak/Hilang) : ");
                                String statusMajalah = br.readLine();
                                System.out.print("Input nomor edisi : ");
                                String nomorEdisi = br.readLine();
                                System.out.print("Input jenis terbit : ");
                                String jenisTerbitMajalah = br.readLine();

                                positionMajalah++;

                                majalah = new Majalah(
                                        positionMajalah,
                                        judulMajalah,
                                        penerbitMajalah,
                                        releaseMajalah,
                                        jenis,
                                        statusMajalah,
                                        nomorEdisi,
                                        jenisTerbitMajalah
                                );
                                perpustakaan.addKoleksi(majalah);
                                break;

                            case 4:
                                jenis = "Cakram Digital";
                                System.out.print("Input judul : ");
                                String judulCakram = br.readLine();
                                System.out.print("Input penerbit : ");
                                String penerbitCakram = br.readLine();
                                System.out.print("Input tanggal terbit : ");
                                String releaseCakram = br.readLine();
                                System.out.print("Input status ketersediaan (Ada/Rusak/Hilang) : ");
                                String statusCakram = br.readLine();
                                System.out.print("Input jenis media : ");
                                String jenisMediaCakram = br.readLine();

                                positionCakram++;

                                cakram = new CakramDigital(
                                        positionCakram,
                                        judulCakram,
                                        penerbitCakram,
                                        releaseCakram,
                                        jenis,
                                        statusCakram,
                                        jenisMediaCakram
                                );
                                perpustakaan.addKoleksi(cakram);
                                break;

                            case 5:
                                break;
                        }
                        break;

                    case 2:
                        perpustakaan.displayAllKoleksi();
                        break;

                    case 3:
                        perpustakaan.displayKoleksiByTitle();
                        break;

                    case 4:
                        System.out.print("\nPilih jenis koleksi yang ingin ditampilkan :" +
                                "\n1. Buku" +
                                "\n2. Majalah" +
                                "\n3. Koran" +
                                "\n4. Cakram Digital" +
                                "\nPilihan Anda [1 - 4] : ");

                        int input = Integer.parseInt(br.readLine());
                        perpustakaan.displayKoleksiByType(input);
                        break;

                    case 5:
                        perpustakaan.displayKoleksiByRelease();
                        break;

                    case 6:
                        perpustakaan.displayKoleksiByPublisher();
                        break;

                    case 7:
                        System.exit(0);

                    default:
                        System.out.println("Mohon periksa input anda kembali!");
                }
            } catch (Exception e) {
                System.out.println("Error! " + e.getMessage());
            }
        } while (true);
    }
}