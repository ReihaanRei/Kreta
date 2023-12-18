import Model.ModelUser;
import Node.User;
import Controller.ControllerUser;
import View.ViewUser;

public class Main {
    public static void main(String[] args) {
        ModelUser modeluser = new ModelUser();
        ControllerUser kontrolUser = new ControllerUser(modeluser);
        ViewUser viewuser = new ViewUser(kontrolUser);

        // viewuser.searchUser();
        viewuser.userView();
        // viewuser.viewUser();
    }
}
