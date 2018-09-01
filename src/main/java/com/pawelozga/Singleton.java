package com.pawelozga;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Singleton {

    private static Singleton instance;

    private Map<String, String> mapa;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String getProperty(String key){
        return mapa.get(key);
    }




    public Singleton() {
        this.mapa = new HashMap<>();
        try {
            Files.readAllLines(Paths.get("C:\\Users\\Jerzy\\ozon3k\\plik.txt")).stream().forEach(value -> {
                String[] mapka= value.split("=");
            mapa.put(mapka[0],mapka[1]);});

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
