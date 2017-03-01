#codeguide

##Useful references:

*Clean Code*: A Handbook of Agile Software Craftsmanship Robert C. Martin
[Link](http://ricardogeek.com/docs/clean_code.pdf)

###1.Getting Clean via Emergent Design
Beck’s rules of simple code. In priority order, simple code: 
<br>*Runs all the tests* 
<br>*Contains no duplication* 
<br>*Expresses all the design ideas that are in the system* 
<br>*Minimizes the number of entities such as classes, methods, functions, and the like.*

###2.Meaningful Names

<br>*Use Intention-Revealing Names*
<br>*Avoid Disinformation* For example, hp, aix, and sco would be poor variable names because they are the names of Unix platforms or variants. 
<br>*A class name should not be a verb.*
<br>``` names like Customer, WikiPage, Account ``` 
<br>*Methods should have verb or verb phrase names*
```
names like postPayment, deletePage 
string name = employee.getName(); 
customer.setName("Kanchanok");
``` 


###3.Methods

<br>*Do One Thing*  Functions should do one thing. They should do it well. They should do it only.
```
public void play() { 
for (Family p : persons) 
  playBall(e); 
} 

private void playBall(Family p) { 
  if (p.isChild()) 
     keepPerson(p); 
}  
```
<br>*Don’t Repeat Yourself*
<br>*Return results, don't print them*

###4.Comments

<br>*Informative Comments* It is sometimes useful to provide basic information with a comment. 
<br>*TODO Comments* TODOs are jobs that the programmer thinks should be done.
<br>``` //TODO  these are not needed  ```
<br>*Must have a javadoc.*
