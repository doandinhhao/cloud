package com.javaweb.jobconnectionsystem.repository;

import com.javaweb.jobconnectionsystem.entity.BlockUserEntity;
import com.javaweb.jobconnectionsystem.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockUserRepository extends JpaRepository<BlockUserEntity,Long> {
}
