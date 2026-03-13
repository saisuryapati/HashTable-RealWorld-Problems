package week1;

import java.util.HashSet;

public class Problem2DuplicateFinder {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,2,5,6,3};

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr)
        {
            if(set.contains(num))
                System.out.println("Duplicate: " + num);
            else
                set.add(num);
        }
    }
}