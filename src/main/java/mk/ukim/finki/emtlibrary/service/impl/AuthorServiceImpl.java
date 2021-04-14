package mk.ukim.finki.emtlibrary.service.impl;

import mk.ukim.finki.emtlibrary.model.Author;
import mk.ukim.finki.emtlibrary.repository.AuthorRepository;
import mk.ukim.finki.emtlibrary.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<Author> findAll()
    {
        return authorRepository.findAll();
    }
}
