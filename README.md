# Names-Sorter

This is a simple program written in Java 17, includes 5 java classes: Main, NameSorter, ReadFile, WriteFile and a NameSorterTest class.
This program takes a file with a list of unsorted names, order them by them by last name, then by the given names.
The program creates a text file with the sorted names in the path: src/resources/sorted-names-list.txt. 
If the file is already exists, it will overwrite it. 

The program can take a file name from the command-line, and sort it. The file must be located in src/resources/filename.txt.
The file must be structured in the form of one full name per line. A full name should include one last name and up to three given names. 
If a file name will not be provided in the command-line as an argument, a default file will be read. 
