@set jp=c:\OpenJDK\bin\

@del *.class 2>nul

@%jp%javac.exe Worker.java
@%jp%javac.exe Programmer.java
@%jp%javac.exe Admin.java
@%jp%javac.exe Devops.java
@%jp%javac.exe Work.java

@%jp%java.exe  Work

@pause