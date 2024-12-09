package static1;

import memory.Data;

public class Data1 {
    public String name;
    public int count;

    //생성된 인스턴스의 수를 세기 위한 메서드
    public Data1(String name) {
        this.name = name;
        count++;
    }
}
