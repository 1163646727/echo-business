package com.echo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * className: RedisTest <BR>
 * description: 集成redis测试类<BR>
 * remark: <BR>
 * auther: ChenQi <BR>
 * date: 2020/7/15 18:52 <BR>
 * version 1.0 jdk1.8 <BR>
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {
    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void redisHashTest(){
        Map<String,String> map=new HashMap<String,String>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
        map.put("key4","value4");
        map.put("key5","value5");
        redisTemplate.opsForHash().putAll("map1",map);

        Map<Object, Object> resultMap= redisTemplate.opsForHash().entries("map1");

        List<Object> reslutMapList=redisTemplate.opsForHash().values("map1");

        Set<Object> resultMapSet=redisTemplate.opsForHash().keys("map1");

        String value=(String)redisTemplate.opsForHash().get("map1","key1");

        System.out.println("value:"+value);
        System.out.println("resultMapSet:"+resultMapSet);
        System.out.println("resultMap:"+resultMap);
        System.out.println("resulreslutMapListtMap:"+reslutMapList);
        System.out.println();
    }

    @Test
    public void redisSetTest(){
        SetOperations<String, String> set = stringRedisTemplate.opsForSet();
        set.add("set1","22");
        set.add("set1","33");
        set.add("set1","44");
        Set<String> resultSet =stringRedisTemplate.opsForSet().members("set1");
        System.out.println("resultSet:"+resultSet);
        //stringRedisTemplate.expire(  )
    }
}
