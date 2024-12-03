import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Process> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new Process(i, priorities[i]));
        }
        
        int order = 0;

        while (!queue.isEmpty()) {
            Process current = queue.poll();

            boolean hasHigherPriority = queue.stream().anyMatch(p -> p.priority > current.priority);

            if (hasHigherPriority) {
                queue.add(current);
            } else {
                order++;
                if (current.index == location) {
                    return order;
                }
            }
        }

        return -1;
    }
}


class Process {
    int index;   
    int priority; 

    Process(int index, int priority) {
        this.index = index;
        this.priority = priority;
    }
}