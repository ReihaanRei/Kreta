package Controller;

import Model.ModelUser;
import Node.User;

import java.util.ArrayList;

public class ControllerUser {
    private ModelUser user;

    public ControllerUser(ModelUser user) {
        this.user = user;
    }

    public ArrayList<User> viewAllUser() {
        return user.getAllUser();
    }

    public void insertUser(String username, String password, String nama, String nik, String telp) {
        user.addUser(new User(username, password, nik, nama, telp));
    }

    public void updateUser (String username, String newTelp){
        User pengguna = user.searchUser(username);
        if (pengguna == null){
            System.out.println("Pengguna tidak ditemukan");
        }else{
            pengguna.telp = newTelp;
            user.updateUser(username, pengguna);
        }
    }

    public void deleteUser (String username){
        User pengguna = user.searchUser(username);
        if (pengguna == null) {
            System.out.println("Pengguna tidak ditemukan");
        }else{
            user.deleteUser(pengguna);;
        }
    }

    public User searchUser(String username){
        return user.searchUser(username);
    }
}
