Generally, the Observer Design Pattern is used when there is a relationship of one-to-many between objects.
So this pattern keeps your objects in know when something they might care about happens.Objects ca decide at runtime whether they want to be kept informed.
Also, The Observer Pattern is one of the most common patterns in the JDK, and it’s incredibly useful.
In this case there is a relationship one to many between a newsletter and more subscribers.
Our subscribers can decide whether they want to receive emails from a newsletter by subscribing/ unsubscribing.
It solves the problem of the subscribers being notified when a new article is being published, those interested receive an email if the article is in
a category pf interest.