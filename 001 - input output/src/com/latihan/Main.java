package com.latihan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner terminalInput = new Scanner(System.in);
        String nama;
        int[] nilai = new int[5];
        float nilaiRataRata, nilaiTotal=0;
        int nilaiMax = -1000, nilaiMin = 1000, n=5;
        boolean init = true;

        System.out.print("Nama : ");
        nama = terminalInput.nextLine();

        for (int i=0; i<n; i++){
            System.out.print("Nilai ke-" + (i+1) + " : ");
            nilai[i] = terminalInput.nextInt();

            nilaiMax = (init)?nilai[0]:nilaiMax;
            nilaiMin = (init)?nilai[0]:nilaiMin;
            init = false;

            if (nilaiMax < nilai[i]){
                nilaiMax = nilai[i];
            }

            if (nilaiMin > nilai[i]){
                nilaiMin = nilai[i];
            }

            nilaiTotal+=nilai[i];
        }

        nilaiRataRata = nilaiTotal/n;

        System.out.println();

        System.out.println("Nama : " + nama);
        System.out.println("Nilai Tertinggi : " + nilaiMax);
        System.out.println("Nilai Terendah : " + nilaiMin);
        System.out.printf("Nilai rata-rata : %.2f", nilaiRataRata);


    }
}