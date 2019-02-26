# Задание №2, в классе.
TestNG, Parameters, Dependency, testng.xml

Использовать TestNG, maven, IntelliJIdea IDE, jdk8.

1. Создать новый проект.

2. Создать тестовый метод isSiteAliveTest с параметром url типа String.
    В этот параметр передавать адрес сайта из testng.xml.

3. Написать параметризованный метод  isElementPresentTest с параметром  webElement типа String.
В этот параметр передавать id элемтов веб траницы из текстового       
файла вида

#web elements

id12987

btn22

spisok_users

par11_12_23323

Метод isElementPresentTest должен хависить от метода
isSiteAliveTest

4. Имя файла (файлов) с веб элементами передавать через конфиг 
testng.xml
   



