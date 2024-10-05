package ru.yandex.practicum.interview.subject_1_JavaCore.question9;

public class Practicum {
}
/*
В чем плюсы использования интерфейса Comparator по сравнению с Comparable? Выберите все верные варианты.


Неправильный ответ
Comparator, в отличие от Comparable, позволяет при необходимости сравнивать объекты двух разных классов.
Скорее наоборот. При объявлении класса, реализующим интерфейс Comparable, можно указать любой другой класс T, с которым данный будет сравниваться. А вот метод compare из интерфейса Comparator предполагает, что оба аргумента будут иметь одинаковый класс T.

Правильный ответ
С помощью Comparator можно легко использовать разные алгоритмы сравнения для одних и тех же объектов.

Неправильный ответ
Comparator, в отличие от Comparable, использует дженерики для типа аргумента, а это позволяет проверить на этапе компиляции, что данное сравнение валидно с точки зрения типов.
И Comparator, и Comparable используют дженерики — в этом отношении между ними нет разницы.

Правильный ответ
Comparator позволяет осуществлять сравнение, даже если один или оба аргумента равны null.

Правильный ответ
С помощью Comparator можно сравнивать объекты даже тех классов, к исходному коду которых у разработчика нет доступа.
 */