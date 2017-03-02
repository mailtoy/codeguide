#Codeguide
##By Kanchanok Kannee (5910545639)

##Useful references:

*Clean Code*: A Handbook of Agile Software Craftsmanship Robert C. Martin
[Link](http://ricardogeek.com/docs/clean_code.pdf)
<br>*Replace Magic Number with Symbolic Constant* By Martin Fowler
[Link](https://refactoring.com/catalog/replaceMagicNumberWithSymbolicConstant.html)
<br>*How to Write Doc Comments for the Javadoc Tool* [Link](http://www.oracle.com/technetwork/articles/java/index-137868.html)

##What Is Clean Code? 

###Getting Clean via Emergent Design
Beck’s rules of simple code. In priority order, simple code: 
- [x] Runs all the tests 
- [x] Contains no duplication 
- [x] Expresses all the design ideas that are in the system 
- [x] Minimizes the number of entities such as classes, methods, functions, and the like.

###1.Meaningful Names
<br>*Use Intention-Revealing Names*
<br>*Avoid Disinformation* For example, hp, aix, and sco would be poor variable names because they are the names of Unix platforms or variants. 
<br>*A class name should not be a verb.*
```
Example :
names like Person, Student, Game
 ``` 
<br>*Methods should have verb or verb phrase names*
```
Example :
names like addDevice, deletePage  
person.setName("Kanchanok");
``` 


###2.Methods
<br>*Do One Thing*  Functions should do one thing. They should do it well. They should do it only.
```
Example :

public void play() { 
for (Family p : persons) 
  playBall(e); 
} 

private void playBall(Family p) { 
  if (p.isChild()) 
     keepPerson(p); 
}  
```
<br>*Don’t Repeat Yourself(DRY)*
	Removing duplication ensures that every concept in the system has a single authoritative representation in the code. A change to a single business concept results in a single change to the code. DRY increases maintainability by isolating change (risk) to only those parts of the system that must change.
<br>

```
public class Device {
 
	public void payMoney() {
 
		System.out.println(“Poor!”);
		sentenceAnswers();
	}
 
	public void withdraw() {
 
		System.out.println(“Don’t have money.”);
		sentenceAnswers();
	}
 
	public void sentenceAnswers() {

		System.out.println(“Umm, Do you have any money ?”);		
	}
}
```

###3.Comments
<br>*Informative Comments* It is sometimes useful to provide basic information with a comment. 
<br>*TODO Comments* TODOs are jobs that the programmer thinks should be done.
```
Example :
 //TODO  these are not needed 
 ```
<br>*Must have a javadoc.*
```
Example :
/**
 * Returns an Image object that can then be painted on the screen. 
 * The url argument must specify an absolute {@link URL}. The name
 * argument is a specifier that is relative to the url argument. 
 * <p>
 * This method always returns immediately, whether or not the 
 * image exists. When this applet attempts to draw the image on
 * the screen, the data will be loaded. The graphics primitives 
 * that draw the image will incrementally paint on the screen. 
 *
 * @param  url  an absolute URL giving the base location of the image
 * @param  name the location of the image, relative to the url argument
 * @return      the image at the specified URL
 * @see         Image
 */
 public Image getImage(URL url, String name) {
        try {
            return getImage(new URL(url, name));
        } catch (MalformedURLException e) {
            return null;
        }
 }
```

###4.Magic Numbers 

*Replace Magic Numbers with Symbolic Constant*
<br>	Magic Number refers to the bad programming practice of using numbers directly in source code without explanation. 
```
Bad :
double potentialEnergy(double mass, double height) {
  return mass * height * 9.81;
}

Good :
double potentialEnergy(double mass, double height) {
  return mass * GRAVITATIONAL_CONSTANT * height;
}
static final double GRAVITATIONAL_CONSTANT = 9.81;
```


##Exersice
<br>To improvement exercise for other students to do. Following TODO.
<br>[Exersice1](https://github.com/mailtoy/codeguide/blob/master/src/codeguide/ConsoleGoods.java)
<br>[Exersice2](https://github.com/mailtoy/codeguide/blob/master/src/codeguide/Goods.java)
