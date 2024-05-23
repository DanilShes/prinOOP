package org.example.carService.adapter;

public class Main {
    public static void main(String[] args) {

        VideoPlayer videoPlayer = new VideoPlayer();
        PlugAdapter plugAdapter = new PlugAdapter(videoPlayer);
        plugAdapter.play();
    }
}
