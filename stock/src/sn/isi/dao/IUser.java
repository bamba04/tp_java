package sn.isi.dao;

import sn.isi.entities.User;

import java.util.List;

public interface IUser {
    public int add(User u) throws Exception;
    public int delete(int id)throws Exception;
    public int update(User u)throws Exception;
    public User getUser(int id)throws Exception;
    public List<User> liste()throws Exception;
}
