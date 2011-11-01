package edu.lmu.cs.headmaster.ws.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Path;

import edu.lmu.cs.headmaster.ws.domain.User;

/**
 * The sole implementation of the user service.
 */
@Path("/users")
public class UserServiceImpl implements UserService {

    /**
     * Constructs the service.
     */
    public UserServiceImpl() {
        // No-op, for now.
    }

    @Override
    public List<User> getUsers() {
        // Mock implementation for now, just to get things going.
        List<User> mockResult = new ArrayList<User>();
        User mock = new User();
        mock.setId(1L);
        mock.setLogin("headmaster");
        mock.setEmail("headmaster@cs.lmu.edu");
        mock.setActive(true);
        mockResult.add(mock);
        return mockResult;
    }

    @Override
    public User getDon() {
        User mock = new User();
        mock.setId(2L);
        mock.setLogin("don");
        return mock;
    }

    @Override
    public User getDon(int id) {
        User mock = new User();
        mock.setId((long)id);
        mock.setLogin("don");
        return mock;
    }

    @Override
    public User getToal(int id) {
        User mock = new User();
        mock.setId((long)id);
        mock.setLogin("toal");
        return mock;
    }
    
    @Override
    public User getToal(User mock) {
        mock.setEmail("touched");
        return mock;
    }

}
