package ua.tut.study.chuksjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckJokerService implements JokerService {

    private final ChuckNorrisQuotes quotes;

    public ChuckJokerService() {
        quotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return quotes.getRandomQuote();
    }
}
