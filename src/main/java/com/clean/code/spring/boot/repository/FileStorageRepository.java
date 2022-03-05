package com.clean.code.spring.boot.repository;

import com.clean.code.spring.boot.domain.FileStorage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileStorageRepository extends JpaRepository<FileStorage, Long> {

}
