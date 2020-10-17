package ru.rasulberov.producer.restclient.services;

import ru.rasulberov.dto.Data;

import java.util.List;

public interface ApiService {
    List<Data> getData(Integer limit);
}
