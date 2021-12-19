package ru.kokourov.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Packer {

    private List<Integer> list;
    private List<Integer>[] buckets;

    public List<Integer>[] pack(int[] arr, int amount) throws MyException {
        int sumArr = Arrays.stream(arr).sum();
        int sum = sumArr / amount;
        if (sumArr % amount != 0) {
            throw new MyException();
        }
        list = Arrays.stream(arr).sorted().boxed().collect(Collectors.toList());

        buckets = new List[amount];

        for (int i = 0; i < amount; i++) {
            buckets[i] = new ArrayList<>();
            full(list.size() - 1, sum, i);
            if (buckets[i].stream().mapToInt(a -> a).sum() != sum) {
                throw new MyException();
            }
            for (Integer el : buckets[i]) {
                list.remove(el);
            }
        }
        return buckets;
    }

    private int full(int index, int sum, int i) {
        if (index < 0) {
            return 0;
        }
        if (sum - list.get(index) == 0) {
            buckets[i].add(list.get(index));
            return 0;
        } else if (sum - list.get(index) > 0) {
            buckets[i].add(list.get(index));
            return full(index - 1,sum - list.get(index), i);
        } else {
            return full(index - 1, sum, i);
        }
    }


}
