package Node;

import java.time.LocalDate;

public class Jadwal {
    public String kotaAwal;
    public String kotaTujuan;
    public String kelas;
    public String jam;
    LocalDate tanggal;
    Kereta kereta;

    public Jadwal(String kotaAwal, String kotaTujuan,String kelas,String jam,Kereta kereta) {
        this.kotaAwal = kotaAwal;
        this.kotaTujuan = kotaTujuan;
        this.kelas = kelas;
        this.jam = jam;
        this.kereta = kereta;
    }

    public void viewJadwal(){
        System.out.println("Kereta\t :"+this.kereta);
        System.out.println("Kota Awal\t :"+this.kotaAwal);
        System.out.println("Kota Tujuan\t :"+this.kotaTujuan);
        System.out.println("Kelas\t\t :"+this.kelas);
        System.out.println("Jam\t\t :"+this.jam);
    }
}
