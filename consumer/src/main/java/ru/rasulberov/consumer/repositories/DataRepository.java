package ru.rasulberov.consumer.repositories;

import ru.rasulberov.dto.Data;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository extends CrudRepository<Data, String> {
}
