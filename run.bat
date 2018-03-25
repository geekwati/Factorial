echo off
@rem to delete class files from classes folder
set tPath=WEB-INF\classes\
del %tPath%\*.class /s /q 



rem create class files in classes folder


javac -source 1.4 -cp .;./WEB-INF/lib/servlet-api.jar  -d  %tPath% src/com/example/web/*.java src/com/example/model/*.java



rem run controller
rem cd target
rem java -cp ../lib/h2-1.3.176.jar;. org/myemail/controller/Controller
rem cd..

rem F:\project\WebApps\Factorial\src>javac -d ../classes/ com/example/model/TestCases.java
rem F:\project\WebApps\Factorial\src>cd..

rem F:\project\WebApps\Factorial>cd classes

rem F:\project\WebApps\Factorial\classes>java com/example/model/TestCases
