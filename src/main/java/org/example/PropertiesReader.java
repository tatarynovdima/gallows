package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Random;

public class PropertiesReader {
    private static final String FILE_PATH = "src/main/resources/dictionary.properties";
    private static final Random RANDOM = new Random();
    private Properties properties;

    public char[] readDictionaryFromFile() {
        loadPropertiesFromFile();
        return getRandomWord().toCharArray();
    }

    private void loadPropertiesFromFile() {
        properties = new Properties();
        try (InputStream inputStream = new FileInputStream(FILE_PATH)) {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getRandomWord() {
        return properties.getProperty("word" + (RANDOM.nextInt(properties.size()) + 1), "");
    }
}