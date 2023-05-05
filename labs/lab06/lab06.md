## lab06.md

#### Why distinguish between Conceptual and Implementation models at all?
Conceptual level models help to communicate an abstract structure of a complex systems, allowing stakeholders to understand the system.
Can be helpful during design stage.

Implementation level Models are a low-level detailed view of the system. They help to specify structure to developers, allowing fast communication regarding complex systems.

#### To what extent could you translate between a conceptual-level and an implementation-level model? What additional information might be needed for each translation direction?
Implementation level models include;
- visibility (public or private)
- data types
- stereotypes (extra information to help clarify the model)
- Multiplicity is only defined on navigable associations.

Conceptual level models;
- can have many to many relationships
- can define multiplicity on any association
- are more likely to have association names
- include associative classes

### Definitions

1. Relation : A relation (or relation value) is a value that exists in the system at a specific time.
eg. String city = "Athens";

2. Relation Variable : A relation variable is a variable that can hold different values at different times.
eg. String city;

3. Attribute : A data-field or a method of an object.

4. Domain : The problem domain - the part of the system in which the problem resides. No external system operations.

5. Primary Key : The value which defines an instance of an object (eg. studentID)

6. Candidate Key : Are any unique and non-null keys that identify a database entry.

7. Alternate key : A candidate key that is not the primary key - also known as the secondary key.

8. Foreign Key : Attributes that are primary keys in their parent table.
Foreign keys generate relationships between parents and the host.

9. Composite Key : Either; A candidate, or primary key that consists of more than 1 attribute.

10. Surrogate Key : A unique identifier for an entity or object that is not used by the business.

11. Relational Algebra : A procedural query language which takes object relations as input and returns relations as output.
Specifies how to obtain a result.

12. Relational Calculus : A non-procedural query language that targets a result but does not specify how it got the result.

13. Normal Form : Used to eliminate redundancy in a database. Databases can be split up into tidy, efficient tables, to remove redundant data, and/or redundant relations.

### Questions
1. Discuss the relationship between the various types of key, i.e., Candidate, Primary, Alternate, Foreign, Composite, and Surrogate. Would a surrogate alternate key make sense? What about a composite surrogate key?

- Primary Keys are always candidate keys but not vice versa. Candidate keys are unique but do not necessarily define an object.
Alternate keys are candidate keys that are not primary keys (they could be used as 'pseudo-primary' keys)
Foreign Keys are Primary Keys of a parent table that have been inherited as attributes of a child table (not necessarily inherited as PK's).
Composite keys are unique keys (candidate or primary keys) that are defined using more than 1 attribute.
Surrogate Keys are also primary or candidate keys but are not used by the business. They are merely used to define an instance of an object.
A "surrogate alternate key" would be a unique identifier for an object that is neither used by the business, nor is a primary key. It's possible but I don't see why it would be needed.
A "Composite surrogate key" would be a non-used, unique key made up of multiple attributes.

2. Primary keys (and indeed candidate keys in general) are supposed to be irreducible. Explain what this means, and why it would be important.

- Irreducibility means that if you remove any attributes from the key, it stops being unique.
There should only be as many attributes as required to make a key unique. Reduces redundancy and emphasizes simplicity.

3. Is there a limit to how many attributes should make up a composite key? What would be the pros and cons of using a surrogate key when a suitable composite candidate key already exists?

- There's no limit but it needs to be irreducible. 
A surrogate key can be used by developers to simplify identification of database entries.
eg. A table may have entries uniquley identified by name, D.O.B, and Place Of Birth. Using a surrogate key, a developer could retrieve an entry without needing these 3 values, they would only need the surrogate key they had created.
This could complicate things later, as surrogate keys are usually a number or an arbitrary value that only makes sense to the developer. 

4. How do you know on which side of a relationship the foreign key should be placed?

- Inheritance is represented using an arrow. The child table is at the tail of the arrow and the parent is at the head.
Therefore the Foreign Key should be at the 'tail' of the relation.

5. What is a lookup table, and how might you implement one in a relational database?

- A look-up table is a table that is used to find specific data-entries. Each individual entry should be identified with a unique value. For example, you may have a look-up table of employees. Each employee can only be a single person and is therefore defined by a single value (usually an ID). Though, you can query the database to filter and search any information you wish.
eg. all employees who earn a certain amount, All employees who live on a certain street, the employee with ID 123456, all this information would be provided by an "Employee" look-up table.

6. How would you implement a many-to-many relationship (as might appear on a conceptual ERD) in a relational database?

- Create an associative class (Also known as a "join" or "junction" table).

### Normalization Excersizes

1. Discuss these dependencies and their inverse.

StudentID->TermAddress 
Student ID is not dependent on the TermAddress as there could be multiple students at 1 address.
TermAddress is (at least can be) dependent on StudentID.

BirthDate->StudentName
BirthDate could be dependent on student name but there could also be 2 students with the same name but different birthdays.
Far more likely to make birthDate depent on the studentID.
StudentName could depend on the BirthDate but again, 2 students with the same birthday but different names would return multiple students.

{SubjectCode, PaperNumber}->EFTS
SubjectCode and PaperNumber is not dependent on a full time student. A student studying any subject may or may not be full time.
Full Time study only depends on the total papers for a current semester.

EFTS->Points
You could define a full time student by the number of EFTS points they are currently studying. Full time does depend on the total points for a given semester.
Points do not depend on full time study, full-time study only represents students who are studying a certain number of points for a given semester. The exact points value does not depend on whether or not a student is full-time.

Qualification->Salary
Qualification does not depend on the salary, there could be multiple employees on the same salary but with different qualifications.
Salary often depends on qualification though exceptions exist.

BirthDate->Age
BirthDate does not depend on age. BirthYear depends on age, but not month or day.
Age depends on BirthDate.

2. Create an FDD of the instrument hire process. Use normalisation techniques to check your model.

Attached in iHire.puml

