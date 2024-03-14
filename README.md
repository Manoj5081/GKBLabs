# GKBLabs
Web Application that allows user to input data,store it in database,retrive it,and display it in a table format
Prerequisites:-
1.Spring Tool suite/eclipse/vs code/any editor
2.MySQL Workbench
3.Any Browser
* Set up and run:-
    1.If you use different database then you need to configure the database in Application.properties  file which is present in src/main/resources/templates
    and configure the database,if we use mySQL please cross check the configurations whether the username and password are correct or not.
    2.Next you can run the Application.java file which is present in the src/main/java then you need to enter localhost:portnumber,port number is present in
    Application.Properties file then  you will get a form in the browser next you can fill the details and submit,then the data will be stored in the database.
    You need to enter localhost:portnumber/user to get the database data in a table format.
*Explanation
   1.As soon as you run the program,the Application.java file will run,after that we need to enter the values in form,then it will goes to the controller class,
    then it will communicate with the repository class and then data will be stored into the database.we can also retrive the data into html table.
    
   
