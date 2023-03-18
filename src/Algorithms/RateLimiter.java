package Algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class RateLimiter {

    /**Whenever you expose
     *  web service / api endpoint,
     *  you need to implement a
     *  rate limiter to prevent
     *  abuse of the service (DOS attacks).

     Implement a RateLimiter Class
     with an isAllow method.
     Every request comes in with a unique clientID, deny a request if that client has made more than 100 requests in the past second.
     **/

    private final int REQUEST_LIMIT=100;
    private final long TIME_LIMIT=1000L;
    private final Map<String, Queue<Long>> clinetHitQ=new HashMap<>();
    public static void main(String[] args){

    }

}
