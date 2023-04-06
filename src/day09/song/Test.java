package day09.song;

import day04.array.StringList;
import day09.song.Artist;

public class Test {

    public static void main(String[] args) {

        // 가수 객체 생성
        Artist artist = new Artist("동방신기", new StringList("hug","rising star"));

        //객체 생성 이후에 노래를 추가하고싶다
        StringList songList = artist.getSongList();
        songList.push("mirotic");

        artist.info();
    }
}