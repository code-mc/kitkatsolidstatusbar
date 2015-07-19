# Solid Status bar on Android KitKat

Yeah that's right ladies and gentlemen, it is in fact possible to achieve this effect! Arguably not as good looking as on >=Lollipop but it is a whole lot better than the ugly gradient.

### How I achieved this

First lets have a look at before and after:

![](http://i.imgur.com/CGpsZQU.png)

Looks a whole lot better right? It is actually not that hard to achieve and yes I used a gradient to "cancel" the effect.

The idea is that we use a black to transparent gradient that is opposite to the one applied by the OS. This proved to be a lot harder than I initially thought. Without going into any specifics lets go ahead and apply this effect:

### How to do it yourself

#### Preparation

You're going to need 4 things:

 - A custom drawable that contains the gradient (see inside "files").
 - A static helper method that takes care of setting the drawable and window flags (also inside "files").
 - The library located __[here](https://github.com/jgilfelt/SystemBarTint)__ to easily set all the status bar colors.
 - A bit of knowledge about colors.
 
You should go ahead and download the 2 required files before doing anything else and put them in their appropriate places inside your android project.

Next you're going to open up your favorite image editor (I used Paint.net) and grab your primary and primary\_dark color values.

Paste both of these in adjecent rectangles, on seperate layers (see below).

![](http://i.imgur.com/9zCrp49.png)

Now overlay the lighter color (again on a new layer) with 54% transparent black (with 0% being transparent) or in other words 138 alpha.

![](http://i.imgur.com/eTS7kPM.png)

It's going to look a lot darker than your primary\_dark color, this is where the color knowledge comes in. Grab your primary color and slide the 'V' value (of HSV color representation, found in a better image editor, sorry MSPaint users!) all the way up until your primary color looks like your primary\_dark color. 

![](http://i.imgur.com/gUSJ3Uy.png)

HINT this is rarely going to happen, you'd need a very dark color for this to work. The green I used didn't make it completely as you can see below:

![](http://i.imgur.com/sJOrzvw.png)

Now all there is left to do is use this super flashy color inside the custom drawable file where it says "YOUR COLOR HERE"

#### In the application

To set the color in your app, import the AppUtils file and make sure you included the library inside your gradle build file! Now all you have to do is call the `AppUtils.setTitleBarTint(Activity activity)` method inside the `onCreate` method of your activity and voila!

### Was this useful to you? Did you enjoy reading it? 

Let me know by starring this project or hit me up on twitter :) [http://twitter.com/@codecrafted](http://twitter.com/@codecrafted)