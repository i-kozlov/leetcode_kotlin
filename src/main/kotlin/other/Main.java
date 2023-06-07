package other;

import kotlin.Pair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        //create priority queue
        var pq = new PriorityQueue<Integer>( );
        pq.offer(3);
        pq.offer(1);
        pq.offer(2);
        pq.offer(14);
        pq.offer(-1);
        pq.offer(5);
        //print priority queue
        System.out.println(pq);


        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

    }



}