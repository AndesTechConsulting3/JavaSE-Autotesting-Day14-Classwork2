# Задание №2, в классе.
TestNG, Parameters, Dependency, testng.xml

Использовать TestNG, maven, IntelliJIdea IDE, jdk8.

1. Создать новый проект.

2. Создать тестовый метод isSiteAliveTest с параметром url типа String.
    В этот параметр передавать адрес сайта из testng.xml.

3. Написать параметризованный метод  isElementPresentTest с параметром  webElement типа String.
В этот параметр нужно передавать id элементов веб траницы из текстового       
файла вида:

#web elements

id12987

btn22

spisok_users

par11_12_23323

Соответственно, сколько веб элементов считается, столько раз должен быть запущен тест
isElementPresentTest.

Метод isElementPresentTest должен зависить от метода
isSiteAliveTest. Т.е., если тест isSiteAliveTest не проходит, то тест
isElementPresentTest должен быть пропущен.

4. Имя файла (файлов) с веб элементами передавать через конфиг 
testng.xml
   



