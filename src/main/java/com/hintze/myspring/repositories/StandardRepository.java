package com.hintze.myspring.repositories;

import com.hintze.myspring.models.Standard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StandardRepository extends JpaRepository<Standard, Long> {
}
