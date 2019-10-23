package day10;

public class Queue {
    String antri [];
    int size;
    int tambah;
    int ekor;

    public Queue (int kapasitas) {
        tambah = -1;
        ekor = -1;
        size = kapasitas;
        antri = new String[size];
    }

    public boolean isEmpty () {
        return tambah == -1;
    }
    public boolean isFull () {
        return ekor >=size;
    }



    public void enQueue (String data) {
        if (isEmpty()) {
            antri[++tambah] = data;
            ekor++;
        } else {
            if (isFull()) {
                System.out.println("semabako disini sudah abis, silahkan mengantri di tempat lain");
            } else {
                antri[++ekor] = data;
            }
        }

            System.out.println(data);
        }


    public void  tampil () {
        System.out.println(" ");
        for (int i =0; i<size; i++){
            System.out.println(antri[i]+" dipangggil untuk mengambil sembako ");
        }
    }



    public void deQueue () {
        if (isEmpty()) {
            System.out.println("tidak ada yang mengantri ");
        } else {
            String temp = antri[tambah];
            for (int i = 0; i < ekor; i++) {
                antri[i] = antri[i + 1];

            }
            ekor--;
            System.out.println(temp + "telah mengambil sembako");

        }
    }

    public static void main(String[] args) {
        System.out.println("daftar orang yang mengantri sembako ");
        Queue S = new Queue(4);

        S.enQueue("bibah");
        S.enQueue("sabar");
        S.enQueue("windy");
        S.enQueue("faizah");

        S.tampil();

        System.out.println("");
        S.deQueue();
        S.deQueue();
        S.deQueue();
        S.deQueue();
    }


    }


