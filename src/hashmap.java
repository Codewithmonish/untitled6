import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        mapusinghash map=new mapusinghash();
        map.put("mango","king of fruits");
      //  map.put("apple","king of apple"););


    }

}
class mapusinghash{
    private Entity[] entity;


    public mapusinghash(){
        entity=new Entity[100];
    }
    public void put(String key,String value){
        int hash=Math.abs(key.hashCode()%entity.length);
        entity[hash]=new Entity(key,value);
    }
    public String put(String key){
        int hash=Math.abs(key.hashCode()%entity.length);
        if (entity[hash]!=null && entity[hash].key.equals(key)){
            return entity[hash].value;
        }
        return null;

    }
    public void remove(String key){
        int hash=Math.abs(key.hashCode()%entity.length);

    }
    private class Entity{
        String key;
        String value;

        public Entity(String key,String value) {
            this.key = key;
            this.value=value;
        }
    }
}
