package com.company;

public class Main {

    public static void main(String[] args) {
	int p;
    int w=4;
    if(w<=2)
        p=3;
    else if (w<=5) {
        p=3+(w-2)*2;
    }
    else
        p=3+3*2+(w-5)*3;

        System.out.println(p);
    }
}
