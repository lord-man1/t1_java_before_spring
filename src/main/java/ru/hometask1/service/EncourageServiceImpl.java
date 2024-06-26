package ru.hometask1.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.hometask1.dto.ExampleRequest;
import ru.hometask1.dto.ExampleResponse;
import ru.hometask1.repository.EncourageRepository;

@Service
@RequiredArgsConstructor
public class EncourageServiceImpl implements EncourageService {
    private final EncourageRepository repository;

    @Override
    public ExampleResponse findRandomPhrase() {
        return repository.getRandomPhrase();
    }

    @Override
    public void addPhrase(ExampleRequest phrase) {
        repository.addPhrase(phrase);
    }
}
