/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.calender;

import java.util.*;

/**
 *
 * @author LENOVO
 */
public class Calender {
    
    public static int Tahun;
    public static int Spaceday;
    public static String[] Bulan = {" ",
        "Januari", "Februari", "Maret", "April",
        "Mei", "Juni", "Juli", "Agustus",
        "September", "Oktober", "November", "Desember"
    };
    public static int[] Total_hari = {0,
        31, 28, 31, 30, 31, 30, 31, 31, 30,
        31, 30, 31
    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Tahun : ");
        Tahun = input.nextInt();
        System.out.print("Masukkan hari pertama di awal tahun(1 = Senin) : ");
        Spaceday = input.nextInt();
        for (int B = 1; B <= 12; B++) {
            if (((Tahun % 4 == 0) && (Tahun % 100 != 0)) || (Tahun % 400 == 0)) {
                Total_hari[2] = 29;
            } else {
                Total_hari[2] = 28;
            }
            System.out.println("              " + Bulan[B] + " " + Tahun);
            System.out.println("____________________________________________");
            System.out.println(" Minggu Senin Selasa Rabu Kamis Jumat Sabtu");
            Spaceday = (Total_hari[B-1] + Spaceday) % 7;
            for (int i = 0; i < Spaceday; i++) {
                System.out.print("      ");
            }
            for (int i = 1; i <= Total_hari[B]; i++) {
                System.out.printf(" %4d ", i);
                if (((i + Spaceday) % 7 == 0) || (i == Total_hari[B])) {
                    System.out.println();
                }
            }
            System.out.println(" ");
        }

    }

}
