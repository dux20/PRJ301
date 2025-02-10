/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.UserDAO;
import dto.UserDTO;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class UserTest {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        
        //insert
//        for (int i = 0; i < 10; i++) {
//            UserDTO u = new UserDTO("USER" + i, "Nguyen Van " + i
//                    , "US", "___" + i);
//            userDAO.create(u);
//        }
        //read all
        List<UserDTO> l1 = userDAO.readAll();
        for (UserDTO u : l1) {
            System.out.println(u);
        }
        
        System.out.println(userDAO.readById("USER0"));
    }
}
