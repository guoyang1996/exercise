package jianzhi.offer;

public class LastRemainingSolution {
    public int LastRemaining_Solution(int n, int m) {
        if(n<=0){
            return -1;
        }
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = 1;//1表示其还未出队列
        }
        int num = n;
        int count = m-1;
        int index = 0;
        for (index = 0; ; index++) {
            if (array[index%n] == 1) {
                if (count > 0) {
                    count--;//报数
                } else {
                    array[index%n] = 0;//出列
                   // System.out.print(index%n+" ");
                    num--;
                    count = m-1;
                }
            }
           if(num==0){
              // System.out.println();
                return index%n;

           }
        }

    }

    public static void main(String[] args) {
        System.out.println(new LastRemainingSolution().LastRemaining_Solution(5, 3));
    }
}