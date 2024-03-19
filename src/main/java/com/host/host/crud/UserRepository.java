package com.host.host.crud;

import com.host.host.jpa.HostingUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<HostingUser, Long> {}