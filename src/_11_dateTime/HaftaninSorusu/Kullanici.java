package _11_dateTime.HaftaninSorusu;

import java.time.LocalDateTime;

public class Kullanici {

    String name;
    LocalDateTime kayitZamani;

    public Kullanici(String name, LocalDateTime kayitZamani) { //p'li const
        this.name = name;
        this.kayitZamani = kayitZamani;
    }

    public Kullanici() {//p'siz cons
    }
}
