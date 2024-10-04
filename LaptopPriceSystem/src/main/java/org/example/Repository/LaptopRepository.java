package org.example.Repository;

import org.example.Module.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, UUID>
{
}
