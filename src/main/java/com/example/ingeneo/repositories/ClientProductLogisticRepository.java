package com.example.ingeneo.repositories;
import com.example.ingeneo.models.ClientProductLogisticModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientProductLogisticRepository extends CrudRepository<ClientProductLogisticModel, Long>{
}
