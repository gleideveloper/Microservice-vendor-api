package com.vendor.api.repositories;

import com.vendor.api.models.CompanyModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyModel, String> {
    boolean existsByMacPrefix(String Id);
}
