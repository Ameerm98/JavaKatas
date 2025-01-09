package katas.exercises;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class RoundRobinLoadBalancerTest {



    @Test
    public void testRoundRobinLoadBalancer(){
        RoundRobinLoadBalancer loadBalancer = new RoundRobinLoadBalancer();

        loadBalancer.addServer(new RoundRobinLoadBalancer.IP("192.168.0.1"));
        loadBalancer.addServer(new RoundRobinLoadBalancer.IP("192.168.0.2"));
        loadBalancer.addServer(new RoundRobinLoadBalancer.IP("192.168.0.3"));

        assertEquals("192.168.0.1",loadBalancer.routeRequest().toString());
        assertEquals("192.168.0.2",loadBalancer.routeRequest().toString());
        assertEquals("192.168.0.3",loadBalancer.routeRequest().toString());
        assertEquals("192.168.0.1",loadBalancer.routeRequest().toString());
        loadBalancer.removeServer(new RoundRobinLoadBalancer.IP("192.168.0.2"));
        assertEquals("192.168.0.3",loadBalancer.routeRequest().toString());
        assertEquals("192.168.0.1",loadBalancer.routeRequest().toString());


    }
}
