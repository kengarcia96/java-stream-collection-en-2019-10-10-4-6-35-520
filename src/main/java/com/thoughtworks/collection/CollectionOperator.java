package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {

        List<Integer> finalList = new ArrayList<>();
        int smallerNumber = Math.min(left, right);
        int biggerNumber = Math.max(left,right);

        for (int x=smallerNumber; x<=biggerNumber; x++){
                finalList.add(x);
        }

        if (left >= right){
            finalList.sort(Comparator.reverseOrder());
        }

        return finalList;

    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> finalList = new ArrayList<>();
        int smallerNumber = Math.min(left, right);
        int biggerNumber = Math.max(left,right);

        for (int x=smallerNumber; x<=biggerNumber; x++){
            if (x % 2 == 0) {
                finalList.add(x);
            }
        }

        if (left >= right){
            finalList.sort(Comparator.reverseOrder());
        }

        return finalList;
    }

    public List<Integer> popEvenElments(int[] array) {
        return Arrays.stream(array).filter(n -> n % 2 == 0).boxed().collect(Collectors.toList());
    }

    public int popLastElment(int[] array) {
        return Arrays.stream(array).reduce((x,y) -> y).getAsInt();
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        return Arrays.stream(firstArray).filter(n -> Arrays.stream(secondArray).anyMatch(x -> x == n)).boxed().collect(Collectors.toList());
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        return Stream.concat(Arrays.stream(firstArray), Arrays.stream(secondArray)).distinct().collect(Collectors.toList());
    }
}
