package com.groupu.tbmm.repository;

import com.groupu.tbmm.entity.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by baba on 6/9/2016.
 */
@Repository
public interface AccountRepository extends MongoRepository<Account,String>{

    public Account findByUsernameAndPasswordAndRoleAndAccountStatus(String username,String password,Account.Role role,Account.AccountStatus status);
    public Account findByUsername(String username);
}
