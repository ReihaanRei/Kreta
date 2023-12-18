package Node;

public class Kereta {
    public String nama;
    public int kode;
    public int duduk;
    public int jumlahGerbong;
    public int kapasitas;

    public Kereta(String nama, int kode,int jumlahGerbong) {
        this.nama = nama;
        this.kode = kode;
        this.duduk = 30;
        this.kapasitas = duduk*jumlahGerbong;
    }

    public void viewKereta(){
        System.out.println(nama +" - "+ kode);
        System.out.println("Kuota : "+kapasitas);
    }

}
