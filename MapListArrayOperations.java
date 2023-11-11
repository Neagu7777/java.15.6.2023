/*Вывести все ключи из мапы на экран.
        Проверить, содержит ли мапа определенное значение.
        Найти ключ, связанный с определенным значением.
        Вывести на экран все ключи, у которых значение начинается с определенной буквы.
        Проверить, содержит ли мапа определенный ключ.
        Найти ключ с максимальным значением.
        Подсчитать количество ключей, значение которых содержит определенное слово.
        Найти все ключи, значение которых состоит только из цифр.
        Подсчитать сумму числовых значений в мапе.
        Подсчитать количество ключей, у которых длина значения превышает определенную границу.
        Создать новую мапу, где значениями будут ключи, а ключами - значения исходной мапы.
        Очистить мапу и вывести сообщение о ее пустом состоянии.
        Создать список List, заполнить его несколькими значениями и вывести на экран каждый элемент списка.
        Создать список List, заполнить его несколькими значениями и вывести на экран каждый элемент списка.
        Создать список List, заполнить его несколькими значениями. Затем перебрать список и вывести элементы в обратном порядке.
        Вычислить сумму всех элементов в массиве int[] и вывести результат.
        Найти наименьший и наибольший элементы в массиве int[] и вывести их.
        Подсчитать количество четных элементов в массиве int[] и вывести результат.
        Отсортировать массив int[] в порядке убывания и вывести отсортированный массив.
        Подсчитать сумму квадратов всех элементов в массиве int[] и вывести результат.

 */

import java.util.*;

public class MapListArrayOperations {
    public static void main(String[] args) {
        // Создание и заполнение мапы
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);

        // Вывести все ключи из мапы на экран
        System.out.println("Все ключи в мапе: " + map.keySet());

        // Проверить, содержит ли мапа определенное значение
        int valueToCheck = 3;
        System.out.println("Мапа содержит значение " + valueToCheck + ": " + map.containsValue(valueToCheck));

        // Найти ключ, связанный с определенным значением
        int valueToFind = 4;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == valueToFind) {
                System.out.println("Ключ, связанный с значением " + valueToFind + ": " + entry.getKey());
                break;
            }
        }

        // Вывести на экран все ключи, у которых значение начинается с определенной буквы
        char letterToMatch = 't';
        for (String key : map.keySet()) {
            if (map.get(key).toString().charAt(0) == letterToMatch) {
                System.out.println("Ключ, значение которого начинается с буквы " + letterToMatch + ": " + key);
            }
        }

        // Проверить, содержит ли мапа определенный ключ
        String keyToCheck = "three";
        System.out.println("Мапа содержит ключ " + keyToCheck + ": " + map.containsKey(keyToCheck));

        // Найти ключ с максимальным значением
        Map.Entry<String, Integer> maxEntry = Collections.max(map.entrySet(), Comparator.comparing(Map.Entry::getValue));
        System.out.println("Ключ с максимальным значением: " + maxEntry.getKey());

        // Подсчитать количество ключей, значение которых содержит определенное слово
        String wordToCount = "ve";
        long count = map.values().stream().filter(value -> value.toString().contains(wordToCount)).count();
        System.out.println("Количество ключей, значение которых содержит слово \"" + wordToCount + "\": " + count);

        // Найти все ключи, значение которых состоит только из цифр
        List<String> digitKeys = new ArrayList<>();
        for (String key : map.keySet()) {
            if (map.get(key).toString().matches("\\d+")) {
                digitKeys.add(key);
            }
        }
        System.out.println("Ключи, значение которых состоит только из цифр: " + digitKeys);

        // Подсчитать сумму числовых значений в мапе
        int sum = map.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println("Сумма числовых значений в мапе: " + sum);

        // Подсчитать количество ключей, у которых длина значения превышает определенную границу
        int maxStringLength = 1; // Например, граница 1
        long keysAboveMaxLength = map.keySet().stream().filter(key -> map.get(key).toString().length() > maxStringLength).count();
        System.out.println("Количество ключей, у которых длина значения превышает " + maxStringLength + ": " + keysAboveMaxLength);

        // Создать новую мапу, где значениями будут ключи, а ключами - значения исходной мапы
        Map<Integer, String> reversedMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            reversedMap.put(entry.getValue(), entry.getKey());
        }
        System.out.println("Новая мапа с обменом ключей и значениями: " + reversedMap);

        // Очистить мапу и вывести сообщение о ее пустом состоянии
        map.clear();
        System.out.println("Мапа после очистки: " + (map.isEmpty() ? "пуста" : "не пуста"));

        // Создать список List, заполнить его несколькими значениями и вывести на экран каждый элемент списка
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Элементы списка: " + integerList);

        // Создать список List, заполнить его несколькими значениями и вывести на экран каждый элемент списка
        List<String> stringList = Arrays.asList("apple", "banana", "orange");
        System.out.println("Элементы списка: " + stringList);

        // Создать список List, заполнить его несколькими значениями. Затем перебрать список и вывести элементы в обратном порядке
        List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.5, 4.5);
        Collections.reverse(doubleList);
        System.out.println("Элементы списка в обратном порядке: " + doubleList);

        // Вычислить сумму всех элементов в массиве int[] и вывести результат
        int[] intArray = {1, 2, 3, 4, 5};
        int sumArray = Arrays.stream(intArray).sum();
        System.out.println("Сумма элементов в массиве: " + sumArray);

        // Найти наименьший и наибольший элементы в массиве int[] и вывести их
        int minArray = Arrays.stream(intArray).min().orElseThrow();
        int maxArray = Arrays.stream(intArray).max().orElseThrow();
    }}