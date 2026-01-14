package TPC;

import java.util.Scanner;

class MediaPlayer{
    void play(){
        System.out.println();
    }
}

class AudioPlayer extends MediaPlayer{
    @Override
    void play(){
        System.out.println("Playing Audio");
    }
}

class VideoPlayer extends MediaPlayer{
    @Override
    void play(){
        System.out.println("Playing Video");
    }
}


public class Player {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter video or audeio");
        String s = scan.nextLine();
        if(s.equalsIgnoreCase("audio")){
            AudioPlayer obj1 = new AudioPlayer();
            obj1.play();
            return;
        }
        VideoPlayer obj2 = new VideoPlayer();
        obj2.play();
    }
}
