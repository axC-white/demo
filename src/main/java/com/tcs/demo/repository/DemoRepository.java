package com.tcs.demo.repository;

import com.tcs.demo.data.DemoData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DemoRepository extends JpaRepository<DemoData, Integer> {

    Optional<DemoData> findById(Integer id);
}
