package com.company;

public class Main {

    public static void main(String[] args) {


        String []myname={"Rian","hassan","mahiop"};
        String []newmyname=new String[myname.length];
        int counter=0;
        for(int i=myname.length-1;i>=0;i--)
        {
            newmyname[counter]=myname[i];
            counter++;
        }
        myname=newmyname;
        for(String name :newmyname)
            System.out.println(name);

    }
}
