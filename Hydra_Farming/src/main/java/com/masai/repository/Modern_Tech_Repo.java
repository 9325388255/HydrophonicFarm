package com.masai.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.masai.module.ModernTech;

@Repository
public interface Modern_Tech_Repo extends JpaRepository<ModernTech, Integer>{

}
