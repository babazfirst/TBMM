package com.groupu.tbmm.repository;

import com.groupu.tbmm.entity.Member;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by baba on 6/9/2016.
 */
@Repository
public interface MemberRepository extends MongoRepository<Member,String> {
}
