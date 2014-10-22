##Sample Java EE 7 Project with asynchronous mail on transaction success

Read the blog post:
- pending

The application comes with its own embedded H2 database, which is started up and shutdown
automatically. Each time you run the app, the database is initialized from scratch.

To get this running you need:
- JDK 7 or above.
- JBoss WildFly 8.1.0
- An IDE of your choice (or none)
- If you intend to use a server different than JBoss 8.1 (WildFly), 
  please remember you probably you'll need to register the H2 Database JDBC Driver.
- Remember to use **UTF-8 encoding**!
- Deploy the app, run http://localhost:8080/async-mail.



