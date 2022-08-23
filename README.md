Pre-requisites
  1) This program is compatible with JDK version 8 so you are required to install JDK 8 or higher version to execute this program

Steps to Execute(On Windows Machine) 
  1) Clone or download the abc-wordcount-test program to a <TEMP> folder on machine where you want to run the program
  2) Open Command Promt(Administrator mode) and move <JAVA_HOME>/bin folder. <JAVA_HOME> is the location of the JDK/JRE installation folder
  3) Run the following command
      java -jar <TEMP>\lib\WordCountProject-1.0.jar <<INPUT>>
      <TEMP> - Location of the folder where the project is downloaded to
      <<INPUT>> - The input to be validated.
      
   Sample command tested 
   
   >> java -jar WordCountProject-1.0.jar "This is the test   for THE interview.    for the successful, interview this program has to be successful"
   
   Outpu
      3 the
      2 this
      2 for
      2 interview
      2 successful
      1 be
      1 test
      1 is
      1 program
      1 has
      1 to

