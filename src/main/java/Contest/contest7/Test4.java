package Contest.contest7;

import java.util.*;

/**
 * @Description: TODO
 * @author: lzm
 * @date: 2021年04月18日 10:50
 */
class Task{
    int id;
    int enqueueTime;
    int processingTime;

    public Task(int id, int enqueueTime, int processingTime){
        this.id = id;
        this.enqueueTime = enqueueTime;
        this.processingTime = processingTime;
    }
}

public class Test4 {
    public static void main(String[] args) {
        int[][]  tasks= {{1,2},{2,4},{3,2},{4,1}};
        Test4 test4=new Test4();
        int[] order = test4.getOrder(tasks);
        System.out.println(Arrays.toString(order));
    }

    public int[] getOrder(int[][] tasks) {
        int len = tasks.length;
        List<Task> taskList = new ArrayList<>();
        for(int i=0; i<len; i++){
            taskList.add(new Task(i, tasks[i][0], tasks[i][1]));
        }
        //按入队时间排序
        Collections.sort(taskList, (t1,t2) -> t1.enqueueTime - t2.enqueueTime);
        //利用最小堆获取下个要执行的任务
        PriorityQueue<Task> minHeap = new PriorityQueue<>((t1,t2) -> {
            if(t1.processingTime == t2.processingTime){
                //当执行时间相同时，根据id升序
                return t1.id - t2.id;
            }else{
                //当执行时间不同时，根据执行时间升序
                return t1.processingTime - t2.processingTime;
            }
        });
        long now = 0;//当前时间，使用long防止int溢出
        int i = 0;//taskList的坐标
        int[] ret = new int[len];
        int p = 0;//ret的坐标
        while(i<len){//taskList中还有任务没有放入堆时
            //将所有入队时间<=当前时间的任务放入堆中
            while(i<len && taskList.get(i).enqueueTime<=now){
                minHeap.offer(taskList.get(i));
                i++;
            }
            //当堆中没有任务，即当前cpu空闲
            if(minHeap.isEmpty()){
                //当前时间置为任务队列taskList中入队时间最小的时间
                now = (long)taskList.get(i).enqueueTime;
                while(i<len && taskList.get(i).enqueueTime<=now){
                    minHeap.offer(taskList.get(i));
                    i++;
                }
            }
            //此时保证堆中有任务待执行，取出执行即可
            Task task = minHeap.poll();
            ret[p++] = task.id;
            now += task.processingTime;
        }
        //当任务列表taskList中的全部任务已经入堆
        while(!minHeap.isEmpty()){
            //按顺序取出任务执行即可
            ret[p++] = minHeap.poll().id;
        }
        return ret;
    }


}