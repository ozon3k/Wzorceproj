package com.pawelozga;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;

public class JpegImageReader implements ImageReader {

    @Override
    public Image createImage(String content) {
        return new JpegImage(content);
    }

    @Override
    public void saveImage(Image image) {
        try {
            Files.write(Paths.get("image.jpg"),Collections.singletonList(image.getImage("asd")));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
