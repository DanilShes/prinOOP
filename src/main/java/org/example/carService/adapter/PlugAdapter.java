package org.example.carService.adapter;

public class PlugAdapter implements MediaPlayer {

    private VideoPlayer videoPlayer;

    public PlugAdapter(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    public void play() {
        videoPlayer.playAvi();
    }
}
