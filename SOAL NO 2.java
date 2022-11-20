import java.util.ArrayList;
class Mahasiswa {
    private String nama;
    private String kelas;
    private int npm;
    private int angkatan;

    public Mahasiswa(String nama, String kelas, int npm, int angkatan) {
        this.npm = npm;
        this.nama = nama;
        this.kelas = kelas;
        this.angkatan = angkatan;
    }

    public String getName() {
        return nama;
    }

    public void setName(String nameNew) {
        this.nama = nameNew;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelasNew) {
        this.kelas = kelasNew;
    }

    public int getId() {
        return npm;
    }

    public void setId(int idNew) {
        this.npm = idNew;
    }

    @Override
    public String toString() {
        return
                "Nama     = " + nama +
                        "\nKelas    = " + kelas +
                        "\nNIM      = " + npm +
                        "\nAngkatan = " + angkatan + "\n";
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> mahasiswa = new ArrayList<>();

        System.out.println( "\n__________________");
        System.out.println( "| Zesica Fitriani |");
        System.out.println( "| 22552011217 |");
        System.out.println( "------------------\n");

        System.out.println("\n'''''Data Mahasiswa Berprestasi'''''\n");

        //Data Awal
        System.out.println("\n______________________________");
        System.out.println("Data Awal Mahasiswa Berprestasi");
        System.out.println("===============================");
        mahasiswa.add(new Mahasiswa("Epul Saepul", "Teknik Informatika", 225512837, 2022));
        mahasiswa.add(new Mahasiswa("Ramdan", "Teknik Informatika", 205582287, 2020));
        mahasiswa.add(new Mahasiswa("Nijar Saputra", "Desain Komunikasi Visual", 1955456734, 2019));
        mahasiswa.add(new Mahasiswa("Agus Saepuloh", "Teknik Industri", 225539347, 2022));
        mahasiswa.add(new Mahasiswa("Zaenal Mutakin", "Bisnis Digital", 215598751, 2021));


        //Print All
        mahasiswa.forEach(System.out::println);

        //Remove Data
        System.out.println("\n\n______________________________");
        System.out.println("Menghapus Satu Data");
        System.out.println("===============================");
        mahasiswa.remove(1);
        mahasiswa.forEach(System.out::println);

        //Add Data
        System.out.println("\n\n______________________________");
        System.out.println("Menambahkan Satu Data");
        System.out.println("===============================");
        mahasiswa.add(1, new Mahasiswa("Muhammad Andre", "Teknik Informatika", 225599833, 2022));
        mahasiswa.forEach(System.out::println);

        //Jumlah Data
        System.out.println("\n______________________________");
        System.out.println("Total Mahasiswa Berprestasi: " + mahasiswa.size() + " Orang");
        System.out.println("===============================\n");

    }
}