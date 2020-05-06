import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisTest {
    @Test
    public void testString(){
        Jedis jedis = new Jedis("192.168.242.128", 6379);
        jedis.set("uname","lisi");
        String uname = jedis.get("uname");
        System.out.println(uname);
        String na = jedis.getSet("uname", "我爱你");
        System.out.println(na);
        System.out.println(jedis.get("uname"));
    }

    /**
     * jedis连接池
     */
    @Test
    public void testPool(){
        //连接池配置对象
        JedisPoolConfig jedisPoll = new JedisPoolConfig();
        jedisPoll.setMaxTotal(50);
        jedisPoll.setMaxIdle(20);
        //连接池对象
        JedisPool pool = new JedisPool(jedisPoll,"192.168.242.128", 6379);
        Jedis je = pool.getResource();
        System.out.println(je.get("uname"));
        Long del = je.del("uname");
        System.out.println(del);
        //归还连接
        je.close();
    }
}
