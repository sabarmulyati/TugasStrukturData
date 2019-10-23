package day10;

public class tumpukan {
    private int  ukuran;
    private long[] tumpukan;
    private int top;

    public tumpukan (int s){
        ukuran = s;
        tumpukan = new long[ukuran];
        top = -1;
    }
    public void push(long j){
        tumpukan[++top] = j;
    }
    public long pop(){
        return tumpukan[top--];
    }
    public long peek(){
        return tumpukan[top];
        }
        public boolean isFull(){
            return (top == ukuran -1);
        }
        public void baca(){
            int i = top;
            while (i >= 0){
                System.out.print(tumpukan[i]);
                System.out.print(" ");
                i--;
            }
            System.out.println(" ");
        }

    }

