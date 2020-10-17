package ru.rasulberov.consumer.services;


import ru.rasulberov.consumer.repositories.DataRepository;
import ru.rasulberov.dto.Data;
import org.springframework.stereotype.Service;

@Service
public class DataServiceImpl implements DataService {

    private DataRepository repository;

    public DataServiceImpl(DataRepository repository) {
        this.repository = repository;
    }

    @Override
    public Data saveMessage(Data data) {
        return repository.save(data);
    }
}
