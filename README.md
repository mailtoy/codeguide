#codeguide

##Useful references:

*Clean Code*: A Handbook of Agile Software Craftsmanship Robert C. Martin
[Link](http://ricardogeek.com/docs/clean_code.pdf)

###Beck’s rules of simple code. In priority order, simple code: 
- Runs all the tests 
- Contains no duplication 
- Expresses all the design ideas that are in the system 
- Minimizes the number of entities such as classes, methods, functions, and the like.

###1.Clean code is focused.

- [x] *Without hesitation or unnecessary detail.* 
- [x] *Well-written process.*
- [x] *Can be read, and enhanced by a developer other.*
  
	Each function, each class, each module exposes a single-minded attitude that remains entirely undistracted, and unpolluted, by the surrounding details.

###2.Meaningful Names
*Use Intention-Revealing Names*
*Avoid Disinformation* For example, hp, aix, and sco would be poor variable names because they are the names of Unix platforms or variants. 
*A class name should not be a verb.*
*Methods should have verb or verb phrase names*
``` string name = employee.getName(); 
customer.setName("mike"); 
if (paycheck.isPosted())... ``` 


###3.Functions

*Do One Thing*  Functions should do one thing. They should do it well. They should do it only.
*Don’t Repeat Yourself*

###4.Comments

*Informative Comments* It is sometimes useful to provide basic information with a comment. 
*TODO Comments* TODOs are jobs that the programmer thinks should be done.
*Must have a javadoc.*
