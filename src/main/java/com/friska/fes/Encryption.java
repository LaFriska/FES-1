package com.friska.fes;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;

public class Encryption {

    private SecureRandom PRNG; /*
    PRNG should be private, and methods such as getByte() should be
    implemented in this class that uses the PRNG to do its respective actions,
    which could then be accessed from elsewhere. PRNG should not be directly
    accessed from other classes.
    */
    public final byte[] key;

    public Encryption(byte[] key) {
        this.key = key;
    }

    private void establishPRNG(){
        try {

            PRNG = SecureRandom.getInstance("SHA1PRNG", "SUN");
            PRNG.setSeed(key);

        }catch (NoSuchAlgorithmException | NoSuchProviderException e){

        }
    }
}