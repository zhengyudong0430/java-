import java.util.LinkedList;
import java.util.Queue;
public class Solution2 {
        class QueueStack {
            private Queue<Integer> queueA = new LinkedList<Integer>();
            private Queue<Integer> queueB = new LinkedList<Integer>();
            public void push(Integer val) {
               if (queueA==null) {
                  queueA.offer(val);
               }else{
                   while (queueA.size()!=0) {
                       queueB.offer(queueA.poll());
                   }
                   queueA.offer(val);
                   while (queueB.size()!=0) {
                       queueA.offer(queueB.poll());
                   }
               }
            }

            public Integer pop() {
              return queueA.poll();
            }

        }
}


