package com.mti.jokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImp implements JokeService {
    private final ChuckNorrisQuotes mChuckNorrisQuotes;

    /*custom bean needed for that in configuration file*/
    public JokeServiceImp(ChuckNorrisQuotes mChuckNorrisQuotes) {
        this.mChuckNorrisQuotes = mChuckNorrisQuotes;
    }

    @Override
    public String getJokes() {

        return mChuckNorrisQuotes.getRandomQuote();
    }
}
