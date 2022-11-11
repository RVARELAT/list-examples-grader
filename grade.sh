# Create your grading script here

CPATH = ".:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar"
#set -e (stop running when ecounters errors)

rm -rf student-submission
#step 1
git clone $1 student-submission

#step 2
if [[-e "ListExamples.java"]]
    then 
        echo "File Found"
    else
        echo "Wrong file submitted"
        exit 0
fi 

#step 3
cp TestListExamples.java /student-submission

#step 4
javac -cp $CPATH *.java
java -cp org.junit.runner.JUNITCORE TestListExamples

$command 2 > file.txt
if [[$? -eq 0]]
    then 
        echo "Compile Succesful"
    else 
        echo "Compilation Failed" 
        exit 0
fi 

#step 5
java -cp org.junit.runner.JUNITCORE TestListExamples > file2.txt
if [[grep "passed" file2.txt]]
    then
        "Grade A"
    else 
        "Tests have failed"
fi