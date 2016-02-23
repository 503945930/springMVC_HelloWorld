package cn.ucai.dao;

import cn.ucai.model.UserModel;

/**
 * Created by Administrator on 2016/2/23.
 */
public interface UserDao {
    public UserModel getUser();
    public void addUser(UserModel userModel);
    void deleteUser(int UserId);
    void updateUser(UserModel userModel);
}
