package other;

import java.util.*;

/*
Написать структуру данных, хранящую целые числа и поддерживающую следующие операции:
1) добавление значения в множество
2) проверка есть ли значение в множестве
3) удаление значения из множества
4) получение случайного значения из множества.

Требование - все операции должны работать за амортизированную константу
*/
public class Randomizer {

    private final Map<Integer, Integer> map = new HashMap<>();
    private final List<Integer> list = new ArrayList<>();

    public Randomizer() {
    }

    //List -ok, map ok
    public void add(int val) {
        list.add(val);
        map.put(val, list.size() - 1);
    }

    //list - не ok
    public boolean contains(int val) {
        return map.containsKey(val);
    }

    //list - ok , map не ok
    public int getRandom() {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }


    //list не - ок , map - ok
    public void remove(int val) {
        Integer index = map.get(val);
        if (index == null) {
            return;
        }

        // получаем последний элемент
        int lastElement = list.get(list.size() - 1);
        // заменяем удаляемый элемент последним
        list.set(index, lastElement);
        // обновляем индекс последнего элемента в map
        map.put(lastElement, index);
        // удаляем последний элемент из списка
        list.remove(list.size() - 1);
        // удаляем удаляемый элемент из map
        map.remove(val);
    }


    /// 1, 3, 5, 8, 9, 7, 6
    //       del |       || O(1)
};