package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {

        int answer = 0;
        int smallerNumber = Math.min(leftBorder, rightBorder);
        int biggerNumber = Math.max(leftBorder,rightBorder);


        for (int x=smallerNumber; x<=biggerNumber; x++){
            if (x % 2 == 0){
                answer += x;
            }
        }

        return answer;

    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int answer = 0;
        int smallerNumber = Math.min(leftBorder, rightBorder);
        int biggerNumber = Math.max(leftBorder,rightBorder);


        for (int x=smallerNumber; x<=biggerNumber; x++){
            if (x % 2 != 0){
                answer += x;
            }
        }

        return answer;

    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map(n -> (n * 3) + 2).reduce((x,y) -> x+y).get();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        List<Integer> finalList = new ArrayList<>();

        arrayList.stream().forEach(x ->{
                if (x % 2 == 0){
                    finalList.add(x);
                }
                else{
                    finalList.add((x * 3) + 2);
                }
            }
        );

        return finalList;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        return arrayList.stream().filter(n -> (n % 2 != 0)).map(n -> ((n * 3) + 5)).reduce((x,y) -> x+y).get();
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        return arrayList.stream().sorted().filter(n -> (n % 2 == 0)).reduce((x,y) -> (x+y) / 2).get();
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        return arrayList.stream().filter(n -> (n % 2 == 0)).reduce((x,y) -> (x+y) / 2).get();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        return arrayList.stream().filter(n -> n % 2 == 0).anyMatch(n -> n.equals(specialElment));
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

//    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

//    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
}
