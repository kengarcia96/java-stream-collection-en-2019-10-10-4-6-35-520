package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

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
        //
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

//    public double getMedianOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

    public double getAverageOfEven(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
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
