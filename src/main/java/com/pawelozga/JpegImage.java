package com.pawelozga;

public class JpegImage implements Image {

    private final String image;

    JpegImage(String image){
    this.image=image;
}

    @Override
    public String getImage(String content) {
      return "Obrazek Jpeg";
    }


}
