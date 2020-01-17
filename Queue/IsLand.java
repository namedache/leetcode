package Queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Classname IsLand
 * @Description 给定一个由 '1'（陆地）和 '0'（水）
 * 组成的的二维网格，计算岛屿的数量。一个岛被水包围，
 * 并且它是通过水平方向或垂直方向上相邻的陆地连接而成的。你可以假设网格的四个边均被水包围。
 * @Date 2019-11-18 09:57
 * @Author zhoukun
 */
public class IsLand {

    public static  int numIslands(char[][] grid) {
        //如果什么都没有返回0
        if (grid.length==0){
            return 0;
        }
        //岛屿的数量
        int isLandCount = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                //如果没被遍历到就是新的节点 就++
                if (grid[i][j]=='1'){
                    isLandCount++;
                }
                // 开始bfs 广度优先遍历算法探索岛屿
                bfs(grid,i,j);
            }
        }


        return isLandCount;
    }

    public static void bfs(char[][] grid,int i,int j){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(i);
        queue.offer(j);
        while (!queue.isEmpty()){

            i = queue.poll();

            j = queue.poll();

            if (grid[i][j]!='1'){
                continue;
            }
            grid[i][j] = '0';
            if (i - 1 >= 0) {
                queue.offer(i - 1);
                queue.offer(j);
            }

            // 把这个点的下面点加入队列
            if (i + 1 < grid.length) {
                queue.offer(i + 1);
                queue.offer(j);
            }

            // 把这个点的左面点加入队列
            if (j - 1 >= 0) {
                queue.offer(i);
                queue.offer(j - 1);
            }

            // 把这个点的右面点加入队列
            if (j + 1 < grid[i].length) {
                queue.offer(i);
                queue.offer(j + 1);
            }
        }
    }

    public static void main(String[] args) {
        char[][] grid = {{'1','1','1','0','0'},
                         {'1','1','0','0','0'},
                         {'0','0','0','0','0'},
                         {'1','0','1','0','1'}};
        System.out.println(numIslands(grid));
    }

}
