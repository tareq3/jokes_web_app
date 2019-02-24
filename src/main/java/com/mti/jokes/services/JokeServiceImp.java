package com.mti.jokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImp implements JokeService {
    private final ChuckNorrisQuotes mChuckNorrisQuotes;

    public JokeServiceImp() {
        this.mChuckNorrisQuotes = new ChuckNorrisQuotes(); //this is fixed
    }

    @Override
    public String getJokes() {

        return mChuckNorrisQuotes.getRandomQuote();
    }
}
