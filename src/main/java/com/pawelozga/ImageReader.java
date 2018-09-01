package com.pawelozga;

public interface ImageReader {

    Image createImage(String content);
    void saveImage(Image image);



}
