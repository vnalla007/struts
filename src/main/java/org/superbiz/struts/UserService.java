package org.superbiz.struts;

import java.util.List;

public interface UserService {

    public void add(User user);

    public User find(long id);

    public List<User> findAll();
}