- Command to compile test:

`javac -cp ".;../lib/junit-platform-console-standalone-6.1.3.jar" GradeAnalyzerTest.java`

- Commond to run test from terminal:

`java -jar ..\lib\junit-platform-console-standalone-6.1.3.jar execute --class-path . --select-class GradeAnalyzerTest`

- Authoritative check of compiled test class from the terminal:

`javap -p GradeAnalyzerTest`

- Test-Driven Development (TDD)
Using the TDD approach to develop a getLetterGrade method for GradeAnalyzer: 
1. Write tests for getLetterGrade first (it will not compile yet).
2. Create a stub: public static String getLetterGrade(int score) { return ""; }
3. Run the tests. They fail. Good, that is the red phase.
4. Implement the method to make them pass.
5. Add tests for the boundary values: 89, 90, 79, 80, 69, 70, 59, 60. 