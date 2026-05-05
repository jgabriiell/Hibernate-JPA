# Hibernate and JPA
## What are these?
JPA (Java Persistence API) is a specification provided by Java to handle data management, while Hibernate is the actual implementation of that specification. 

## JPA
It is the set of rules needed to map Java objects into data for the database. JPA uses annotation to do that, but requires and implementation to be able to
perform the operations.

## Hibernate
It acts as the "engine" behind the scenes to perform the operation in the database. Hibernate implements JPA specification to easily write database operation and 
map Java object into DB tables.

## Annotations
JPA annotations help us to make a Java class to a table in the database. Here are some commonly used JPA annotation:
- @Entity: used to mark a Java object as an entity in the database. It correspendos the class to a table.
- @Table: It specifies the name of the table that is mapped with entity. Also allows us to add aditional attributes
- @Id: Indicates which field inside the Java class will be used as the primary key of the table.
- @GeneragedValue: Speficies the strategy for generating the ID value.
- @Column: Allows us to map a field and set its attrubites as a column. Ex.: name, lenght, nullable, etc.
