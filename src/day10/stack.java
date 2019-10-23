package day10;

public class stack {
    private String[] stack;
    private int max;
    private int top;

    public stack(int size) {
        max = size;
        stack = new String[max];
        top = -1;
    }

    public boolean isEmpty (){
        return top == -1;
    }

    public boolean isFull () {
        return top == max-1;
    }
    public void input (String masuk) {
        if (isFull()){
            System.out.println("tumpukan kursi telah maksimal ");
        }  else {
            stack[++top]=masuk;
            System.out.println("kursi " +masuk+ " ditumpuk");
        }
    }

    public void hapus () {
        if (isEmpty()){
            System.out.println("tidak ada tumpukan kursi ");
        } else {
            String temp = stack[top];
            stack[top] = stack[top--];
            System.out.println("kursi "+ temp+ " diambil dari dalam tumpukan");
        }
    }
    public void info () {
        System.out.println("kursi dalam ruangan :");
        for (int i =0; i<=top; i++){
            System.out.println("*"+stack[i]);
        }
    }

    public static void main(String[] args) {
        stack s = new stack(5);
        s.input("merah");
        s.input("biru");
        s.input("kuning");
        s.input("hijau");
        s.input("ungu");
        System.out.println("setelah di pop :");
        s.hapus();
        s.hapus();
        s.info();
    }
}
