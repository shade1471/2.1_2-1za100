# Домашнее задание к занятию «2.1. Примитивные типы данных, условные операторы, выход за границы типов и погрешность вычислений»

В качестве результата пришлите ссылки на ваши GitHub-проекты в личном кабинете студента на сайте [netology.ru](https://netology.ru).

Все задачи этого занятия нужно делать в разных репозиториях.

**Важно**: если у вас что-то не получилось, то оформляйте Issue [по установленным правилам](../report-requirements.md).

**Важно**: не делайте ДЗ всех занятий в одном репозитории! Иначе вам потом придётся достаточно сложно подключать системы Continuous Integration.

Напоминалку по некоторым теоретическим моментам в джаве вы можете найти [здесь](../tips/tips.md).

## Как сдавать задачи

1. Инициализируйте на своём компьютере пустой Git-репозиторий
1. Добавьте в него готовый файл [.gitignore](../.gitignore)
1. Добавьте в этот же каталог необходимые файлы
1. Сделайте необходимые коммиты
1. Создайте публичный репозиторий на GitHub и свяжите свой локальный репозиторий с удалённым
1. Сделайте пуш (удостоверьтесь, что ваш код появился на GitHub)
1. Ссылку на ваш проект отправьте в личном кабинете на сайте [netology.ru](https://netology.ru)
1. Задачи, отмеченные, как необязательные, можно не сдавать, это не повлияет на получение зачета (в этом ДЗ все задачи являются обязательными)

## Задача №1 - Мили

### Легенда

Авиаперевозчики предлагают различные бонусные программы, начисляющие бесплатные мили за перелёты.

Формула следующая: за каждые 20 рублей, потраченные на билет, начисляется 1 миля. Дробные мили не начисляются.

Что вам нужно: создать приложение, рассчитывающее количество начисленных мили за купленный билет.

Стоимость билета вы выбираете сами (сами создайте переменную, в которой она будет храниться).

Пример схемы кода вашего приложения:

```java
public class Main {
  public static void main(String[] args) {
  
    // Объявляете переменные для входных данных и
    // параметров программы: одну для хранения 
    // стоимости билета, другую для хранения количества
    // рублей для одной бонусной милли
    
    // Рассчитываете количество бонусных милль, используя
    // значения заведённых переменных. Ответ сохраняете в
    // новую переменную и выводите на экран
  }
}
```

Итого: у вас должен быть репозиторий на GitHub, в котором расположен ваш Java-код.

## Задача №2 - "Получи рубль за каждые 100!"

### Легенда

Один из сотовых операторов решил сделать своим клиентам приятный бонус: если клиент пополняет счёт более чем на 1000 рублей, то сотовый оператор дарит ему по 1 рублю за каждые 100 рублей.

Начальные данные: у клиента на счёте 100 рублей.

Примеры:
1. Клиент пополнил счёт на 100 рублей - бонусов нет, итоговая сумма на счету клиента - 200 рублей
2. Клиент пополнил счёт на 1100 рублей - бонус равен 11 рублям, итоговая сумма на счету клиента - 1211 рублей

Что вам нужно: создать приложение, выводящее итоговый счёт и количество бонусных рублей.

Количество денег на текущем счёте клиента и сумму пополнения вы выбираете сами (сами создайте переменные, в которых эти данные будут храниться).

Приложение должно быть написано так, что нам достаточно было бы поменять только значения переменных хранящих начальную сумму счёта и сумму пополнения чтобы итоговый счёт и бонусные рубли были расчитаны верно.

Пример схемы кода вашего приложения:

```java
public class Main {
  public static void main(String[] args) {
  
    // Объявляете переменные для входных данных и
    // параметров программы: начального счёта, 
    // суммы пополнения и тп
    
    // Условным оператором проверяете превысила ли
    // сумма пополнения порог и для этих двух разных
    // сценариев рассчитываете сумму бонуса и выводите
    // на экран.
  }
}
```

Итого: у вас должен быть репозиторий на GitHub, в котором расположен ваш Java-код.
