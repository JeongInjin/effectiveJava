package com.injin.me.effectivejava.testExample;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;


public class TestExample {

    @Test
    void sortInts() {
        final int[] numbers = {-3, -5, 1, 7, 4, -2};
        final int[] expected = {-5, -3, -2, 1, 4, 7};

        Arrays.sort(numbers);
        assertThat(numbers).isEqualTo(expected);
    }

    @Test
    void sortObjects() {
        final String[] strings = {"z", "x", "y", "abc", "zzz", "zazzy"};
        final String[] expected = {"abc", "x", "y", "z", "zazzy", "zzz"};
        Arrays.sort(strings);
        assertThat(strings).isEqualTo(expected);
    }

    @Test
    void customSorting() {
        final List<Integer> numbers = Arrays.asList(4, 7, 1, 6, 3, 5, 4);
        final List<Integer> expected = Arrays.asList(7, 6, 5, 4, 4, 3, 1);

        Collections.sort(numbers, new ReverseNumericalOrder());
        assertThat(numbers).isEqualTo(expected);
    }

    @Test
    void bubbleSorting() {
        final int[] numbers = {3, 1, 5, 7, 8, 2, 4, 9, 6};
        final int[] excepted = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean numberSSwitched;
        do {
            numberSSwitched = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i + 1] < numbers[i]) {
                    int tmp = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = tmp;
                    numberSSwitched = true;
                }
            }
        } while (numberSSwitched);

        assertThat(numbers).isEqualTo(excepted);
    }

    @Test
    void finalReferenceChanges() {
        final int i = 42;
        //i = 43 error

        final List<String> list = new ArrayList<>();
        //list = new ArrayList<>(); error
        assertThat(0).isEqualTo(list.size());

        list.add("adding a new value into my list");
        assertThat(1).isEqualTo(list.size());

        list.clear();
        assertThat(0).isEqualTo(list.size());
    }

    @Test
    void staticVariableAccess() {
        assertThat(7).isEqualTo(ExampleClass.EXAMPLE_VALUE);
        ExampleClass c1 = new ExampleClass();
        ExampleClass c2 = new ExampleClass();
        c1.EXAMPLE_VALUE = 13; // 가능은 하지만 추천하지 않음.
        assertThat(13).isEqualTo(ExampleClass.EXAMPLE_VALUE);
        assertThat(c2.EXAMPLE_VALUE).isEqualTo(ExampleClass.EXAMPLE_VALUE);
    }

    @Test
    void mutateBookRecordState() throws IllegalAccessException, NoSuchFieldException {
        final BookRecord record = new BookRecord("jeong", "bestBook");
        Field author = record.getClass().getDeclaredField("author");
        author.setAccessible(true);
        author.set(record, "injin");

        assertThat("injin").isEqualTo(record.getAuthor());
    }

    public final class BookRecord {
        private String author;
        private String bookTitle;

        public BookRecord(String author, String bookTitle) {
            this.author = author;
            this.bookTitle = bookTitle;
        }

        public String getAuthor() {
            return author;
        }

        public String getBookTitle() {
            return bookTitle;
        }
    }


    public class ExampleClass {
        public static int EXAMPLE_VALUE = 7;
    }

    public class ReverseNumericalOrder implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    }

}
