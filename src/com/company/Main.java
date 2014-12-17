package com.company;

public class Main {

    public static void main(String[] args) {
                int a = 0;
                int b = 1;
                int c;
                int total = 0;

                do {
                    c = a + b;
                    a = b;
                    b = c;
                    if (b % 2 == 0) total += b;
                } while (b <= 4000000);
                System.out.println(total);
            }
        }
