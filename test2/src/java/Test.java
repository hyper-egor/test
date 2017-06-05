import redis.clients.jedis.*;

public class Test {
    
    public static void main(String[] sss)
    {
        Jedis redis = new Jedis("94.23.213.170", 6379);
        
        redis.set("Yoba", "Some text!");
        redis.set("Yoba", "Some text 2!");
        
        redis.incr("bobo");
        
        
        
        System.out.println("---------- Yoba - " + redis.get("Yoba"));
        System.out.println("---------- bobo - " + redis.get("bobo"));
        
    }
                            
}
