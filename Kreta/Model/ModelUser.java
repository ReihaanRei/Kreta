package Model;

import java.util.ArrayList;
import ModelGSON.ModelGSONUser;
import Node.User;

import com.google.gson.reflect.TypeToken;
public class ModelUser {
    ArrayList<User> ListUser;
    ModelGSONUser<User> modelGSONUser;

    public ModelUser(){
        ListUser = new ArrayList<User>();
        modelGSONUser = new ModelGSONUser<>("Database/DatabaseUser.json");
        loadData();
    }

    public void addUser(User pengguna) {
        ListUser.add(pengguna);
    }

    public User searchUser(String username){
        User user = null;
        for (User akun : ListUser){
            if (akun.username.contains(username)){
                return akun;
            }
        }
        return user;
    }

    public ArrayList<User> getAllUser(){
        return ListUser;
    }

    public void updateUser(String username, User pengguna){
        ListUser.contains(pengguna);
    }

    public void deleteUser(User user){
        ListUser.remove(user);
    }

    private void loadData(){
        ListUser = modelGSONUser.readFromFile(new TypeToken<ArrayList<User>>()
            {}.getType());
    }

    public void commitData(){
        modelGSONUser.WriteToFile(ListUser);
    }
}
