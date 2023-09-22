package org.example.repo;

import org.example.entity.DeviceData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface deviceDataRepository extends MongoRepository<DeviceData,String> {
}
