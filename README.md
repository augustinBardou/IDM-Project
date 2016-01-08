# IDM-Project [![Build Status](https://travis-ci.org/StephaneMangin/IDM-Project.svg)](https://travis-ci.org/StephaneMangin/IDM-Project)

##Project requirement
*The whole project has been developped with the operating system Ubuntu 14.04 so every installation will be in a command line interface.*

###Installation
To be sure that the project will perfectly run on your computer, we will make you install some tools.

####Npm and Node.js
Npm is the package manager for Node.js.

**Installation command**

*sudo apt-get install npm nodejs*

####Grunt
Grunt will allow us to be more efficiant by preventing us from repeating tasks.

**Installation command**

*npm install -g grunt-cli*

####Bower
Bower is a package manager for website. It will help us to manage our packages and make sure they are all up to date.

**Installation command**

*npm install bower -g*

####Avconv
Avconv is a video and audio converter. It reads an arbitrary number of input "files" and writes to an arbitrary number of output "files".

**Installation command**

*sudo apt-get install libav-tools*

###Execution
Before launching the project "Application.java" you have to run some commands

*You need to go in the repository 'VideoGen.WebService'*

*grunt build*

*bower -f update*

Once you have executed them, you should able to run the application.

##Sources
[https://www.npmjs.com/](https://www.npmjs.com/)

[http://bower.io/](http://bower.io/)

[http://gruntjs.com/](http://gruntjs.com/)

[https://doc.ubuntu-fr.org/avconv](https://doc.ubuntu-fr.org/avconv)
