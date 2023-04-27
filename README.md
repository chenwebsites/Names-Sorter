# Names-Sorter

This is a simple program written in Java 17, includes 5 java classes: Main, NameSorter, ReadFile, WriteFile and a NameSorterTest class.
This program takes a file with a list of unsorted names, order them by them by last name, then by the given names.
The program creates a text file with the sorted names in the path: src/resources/sorted-names-list.txt. 
If the file is already exists, it will overwrite it. 

The program can take a file name from the command-line, and sort it. The file must be located in src/resources/filename.txt.
The file must be structured in the form of one full name per line. A full name should include one last name and up to three given names. 
If a file name will not be provided in the command-line as an argument, a default file will be read. 

---
## How to run the program 
1. Clone the repository to your local machine and extract it. 
2. Create a file with unsorted names -> one full name per line. (ex. testFile.txt)
3. Store the file in src/resources/testFile.txt
4. Open terminal/bash/etc.. and nevigate to the root directory of the project. 
5. In order to keep the folder clean, the next command will compile the .java file and create the .class files in the bin/main directory. 
6. Execute the following command:    " javac -d bin src/main/*java " 
7. then execute:     " java -cp bin main/Main testFile.txt "
8. Optional: execute:  " java -cp bin main/Main " and a default unsorted-names-list.txt will be executed. 
9. The program will print the sorted names on the console and will create a file name: src/resources/sorted-names-list.txt  
