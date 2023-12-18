package View;

import Controller.ControllerUser;
import Node.User;

import java.util.Scanner;

public class ViewUser {
    private ControllerUser kontrolUser;

    public ViewUser(ControllerUser kontrolUser){
        this.kontrolUser = kontrolUser;
    }

    public void userView(){
        Scanner input = new Scanner(System.in);
        int pilih;
        x: while (true){
        System.out.println("-------------------------");
        System.out.println("|\tMenu User\t|");
        System.out.println("-------------------------");
        System.out.println("1. Tambah User\t\t|");
        System.out.println("2. Lihat User\t\t|");
        System.out.println("3. Update User\t\t|");
        System.out.println("4. Hapus User\t\t|");
        System.out.println("5. Cari User\t\t|");
        System.out.println("6. Kembali\t\t|");
        System.out.println("-------------------------");
        System.out.print("Pilih : ");
        pilih = input.nextInt();
        input.nextLine();
        System.out.println("-------------------------");
            switch (pilih) {
                case 1:
                    insertUser();
                    break;
                case 2:
                    viewUser();
                    break;
                case 3:
                    updateUser();
                    break;
                case 4:
                    deleteUser();
                    break;
                case 5:
                    searchUser();
                    break;
                case 6:
                    System.out.println("Program berakhir");
                    break x;
                default:
                    System.out.println("INVALID INPUT!");
                    break;
            }
        }
    }

    public void viewUser(){
        System.out.println("- Menampilkan Data User -");
        for(User user : kontrolUser.viewAllUser()){
            System.out.println("Username : "+user.username);
            System.out.println("Password : "+user.password);
            System.out.println("Nama : "+user.nama);
            System.out.println("NIK  : "+user.nik);
            System.out.println("Telp : "+user.telp);
            System.out.println("==============================");
        }
    }

    public void insertUser(){
        Scanner input = new Scanner(System.in);
        System.out.println("- Tambah User -");
        System.out.print("Masukkan Username : ");
        String username = input.nextLine();
        System.out.print("Masukkan Password : ");
        String password = input.nextLine();
        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIK : ");
        String nik = input.nextLine();
        System.out.print("Masukkan Telp : ");
        String telp = input.nextLine();
        System.out.println("User Berhasil Di Tambahkan");
        kontrolUser.insertUser(username, password, nama, nik, telp);
    }

    public void updateUser(){
        Scanner input = new Scanner(System.in);
        System.out.println("- Update User -");
        System.out.print("Masukkan Username : ");
        String username = input.nextLine();
        User user = kontrolUser.searchUser(username);
        if(user == null){
            System.out.println("PENGGUNA TIDAK DITEMUKAN!");
        }else{
            System.out.println("Ubah No Telp : ");
            String newTelp = input.nextLine();
            kontrolUser.updateUser(username, newTelp); 
        }
    }

    public void deleteUser(){
        Scanner input = new Scanner(System.in);
        System.out.println("- Hapus User -");
        System.out.print("Masukkan Username : ");
        String username = input.nextLine();
        User user = kontrolUser.searchUser(username);
        if(user == null){
            System.out.println("PENGGUNA TIDAK DITEMUKAN!");
        }else{
            System.out.println("- User Berhasil Di Hapus -");
            kontrolUser.deleteUser(username);;
        }
    }

    public void searchUser(){
        Scanner input = new Scanner(System.in);
        System.out.println("- Pencarian User -");
        System.out.print("Masukkan Username : ");
        String username = input.nextLine();
        User user = kontrolUser.searchUser(username);
        if (user == null) {
            System.out.println("PENGGUNA TIDAK DITEMUKAN!");
        }else{
            System.out.println("- User Ditemukan -");
            System.out.println("Username : "+user.username);
            System.out.println("Password : "+user.password);
            System.out.println("Nama : "+user.nama);
            System.out.println("NIK  : "+user.nik);
            System.out.println("Telp : "+user.telp);
        }
    }
}
