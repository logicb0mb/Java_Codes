package com.shreyasshukla;

import java.util.Arrays;
import java.util.Scanner;

class TrainStation {
    double trainNo;
    String source;
    String destination;
    double time;
    double travelTime;
    double platformNo;
    String travelType;
    void getDetails(){
        Scanner z = new Scanner(System.in);
        System.out.println("------------------------");
        System.out.println("Enter the train no:");
        this.trainNo = z.nextDouble();
        System.out.println("Enter the source:");
        this.source = z.next();
        System.out.println("Enter the destination:");
        this.destination = z.next();
        System.out.println("Enter the time:");
        this.time = z.nextDouble();
        System.out.println("Enter the travel Time:");
        this.travelTime = z.nextDouble();
        System.out.println("Enter the platformNo:");
        this.platformNo = z.nextDouble();
        System.out.println("Enter the travelType:");
        this.travelType = z.next();
    }

    @Override
    public String toString() {
        return "TrainStation{" +
                "trainNo=" + trainNo +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", time=" + time +
                ", travelTime=" + travelTime +
                ", platformNo=" + platformNo +
                ", travelType='" + travelType + '\'' +
                '}' + "\n";
    }
}

public class Main {

    public static  void searchTrainNo( int trainNoToBeSearched, TrainStation[] aob){
        try {
            boolean found = false;
            for(int i = 0; i< aob.length;i++){
                if(aob[i].trainNo == trainNoToBeSearched){
                    found = true;
                    System.out.println("Found!");
                }
            }
            if(!found){
                throw new ArrayIndexOutOfBoundsException();
            }
        } catch (ArrayIndexOutOfBoundsException a){
            System.out.println(a);
        }

    }

    public static void sortTrain(TrainStation[] aob){
        try{
            String type;
            Scanner inp = new Scanner(System.in);
            type = inp.next();

            if(type.equals("TM")){
                for(int i = 0; i<aob.length;i++){
                    for(int j = i+1; j< aob.length;j++){
                        if(aob[i].time > aob[j].time){
                            TrainStation temp = aob[i];
                            aob[i] = aob[j];
                            aob[j] = temp;
                        }
                    }
                }
                System.out.println("Sorted based on time:");
                System.out.println(Arrays.toString(aob));

            } else if(type.equals("TN")) {
                for(int i = 0; i<aob.length;i++){
                    for(int j = i+1; j< aob.length;j++){
                        if(aob[i].trainNo > aob[j].trainNo){
                            TrainStation temp = aob[i];
                            aob[i] = aob[j];
                            aob[j] = temp;
                        }
                    }
                }
                System.out.println("Sorted based on trainNo:");
                System.out.println(Arrays.toString(aob));
            } else {
                throw new ArithmeticException();
            }

        }catch (ArithmeticException a){
            System.out.println(a);
        }
    }
    public static void main(String[] args) {
	// train search and sort
        int n;
        System.out.println("Enter the no of objects needed:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        TrainStation[] aob = new TrainStation[n];

        System.out.println("Enter each train's details:");
        for(int i = 0; i<n;i++){
            aob[i] = new TrainStation();
            aob[i].getDetails();
        }
        System.out.println("Train no to be searched");
        int trainNoToBeSearched;
        trainNoToBeSearched = sc.nextInt();
        searchTrainNo(trainNoToBeSearched, aob);
        sortTrain(aob);
    }
}
