- Command to compile test:

`javac -cp ".;../lib/junit-platform-console-standalone-6.1.3.jar" GradeAnalyzerTest.java`

- Commond to run test from terminal:

`java -jar ..\lib\junit-platform-console-standalone-6.1.3.jar execute --class-path . --select-class GradeAnalyzerTest`

- Authoritative check of compiled test class from the terminal:

`javap -p GradeAnalyzerTest`