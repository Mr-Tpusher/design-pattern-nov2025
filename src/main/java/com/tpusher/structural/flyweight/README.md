Flyweight is a structural design pattern which helps with reducing memory usage
by reusing the objects.

A class can have 2 types of properties:
1. Intrinsic -> The properties which do not change across the objects
2. Extrinsic -> The properties which can be different for each and every object

In Flyweight design pattern, we create the objects of the Intrinsic properties
once and use them across the system without recreating.

e.g.
consider a Grass class in a game.
for the grass class, the image is going to be the same, so we can reuse that.

```java
class Grass {
    int x;
    int y;
    GrassImage image;
}
```

```java
class GrassImage {
    Image i;
}
```