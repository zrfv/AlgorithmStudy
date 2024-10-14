package datastructures;

public class HashTable {
    private final int INITIAL_SIZE = 16;
    private HashEntry[] data;

    public class HashEntry {
        String key; // hashcode로 변환하여 index로 써야하기 때문에 key 자료형 String 선언
        String value;
        HashEntry next;

        public HashEntry(String key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    public HashTable() {
        data = new HashEntry[INITIAL_SIZE];
    }

    // key를 index로 변환하는 메서드
    public int getIndex(String key) {
        int hashCode = key.hashCode();
        int index = (hashCode& 0x7fffffff) % INITIAL_SIZE; // 0 <= index <= 15 값을 갖게함
        return index;
    }

    public void put(String key, String value) {
        int index = getIndex(key); // 넣을 키 값을 메서드를 이용해 index로 변환
        HashEntry entry = new HashEntry(key, value);

        if(data[index] == null) {
            data[index] = entry;
            return;
        }

        HashEntry entries = data[index];
        while(entries.next != null) {     // 인덱스에 값이 존재하면 링크드리스트로 끝을 찾아서 연결
            if(entries.key.equals(key)) return; // 같은 키가 이미 존재하면 return
            entries = entries.next;
        }
        entries.next = entry;
    }

    public String get(String key) {
        int index = getIndex(key); // 넣을 키 값을 메서드를 이용해 index로 변환
        HashEntry entries = data[index];
        while(entries != null) {
            if(entries.key.equals(key)) return entries.value;
            entries = entries.next;
        }
        return null; // 위의 조건을 모두 만족하지 못하면 null return
    }

}
