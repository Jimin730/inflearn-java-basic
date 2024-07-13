package oop1;

public class MusicPlayerMain4 { // 객체 지향 프로그래밍

    public static void main(String[] args) {

        MusicPlayer player = new MusicPlayer();

        // 음악 플레이어 켜기
        player.on();
        // 볼륨 증가
        player.volumeUp();
        player.volumeUp();
        // 볼륨 감소
        player.volumeDown();
        // 음악 플레이어 상태
        player.showStatus();
        // 음악 플레이어 끄기
        player.off();
    }

    /*
    MusicPlayer를 사용하는 사용자는 MusicPlayer 안에 무엇이 들었는지 알 필요 없다. 그저 그 기능만 사용할 뿐이다.
     */
}
