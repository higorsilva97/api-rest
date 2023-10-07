package com.apirest.service;

import com.apirest.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
