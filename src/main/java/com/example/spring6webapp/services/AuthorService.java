package com.example.spring6webapp.services;

import com.example.spring6webapp.domain.Author;
import org.springframework.stereotype.Service;

public interface AuthorService {
    Iterable<Author> findAll();
}
