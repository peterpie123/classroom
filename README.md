[![Join the chat at https://gitter.im/pg-classroom/Lobby](https://badges.gitter.im/pg-classroom/Lobby.svg)](https://gitter.im/pg-classroom/Lobby?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

This is **NOT** like a class you would have in school. There are no grades, no credits, nothing. I assume you're here because you want to learn something cool. Before you look at languages though, take a look at the [introduction] section. You can check out all of the programming languages I have to offer down below. If you need help with some `code`, join our gitter channel! Just click the button above and create an account!

| Language  | Difficulty | Uses                                     |
| :-------- | :--------- | :--------------------------------------- |
| [Java]    | `moderate` | Android, Desktop, Serverside, Government |

[Java]: #Java

## Introduction
This part of the readme is to get you set up with [git], the namesake of this website and the primary way of tracking changes to source code _and_ how this class is distributed. 


Learning git is an absolutely essential skill for any programmer. If you like, you can take a break from this exhausting block of text and look around GitHub for some cool projects (all built with git, of course). The first step is to install git, which is outlined in the section below.
### Installing git
...but first, check to make sure it isn't installed already. Fire up your shell of choice (Windows' `cmd.exe` is convenient) and type in `git --version` and hit enter. If it says something like `git version 2.15`, you're in luck and can skip to the next section! If not, head to https://git-scm.com/downloads and download it for your OS. Make sure you download `Git Bash`, don't bother with `Git GUI`. More on this later. After it is finished, type `git --version` in a fresh shell and hope it works. If it doesn't, post a message on gitter or check out your system's `Path` variable.
### Create a GitHub account
If you haven't already, you need a GitHub account so you can fork this repository and clone (download) it onto your machine. The process is super easy, but I recommend picking a username that isn't too stupid, as this account will likely serve as your programming 'portfolio' and is very painful to change the username of. Once you have an account, we continue our journey!
### Getting this repository onto your machine
Once your logged into your GitHub account, click the fork button on the top right of this page to essentially create a copy of everything in this. Once that's done, head to the new repository you just created and click the `Clone or download` button and copy the text field. Now, navigate to an empty folder wherever you want on your system (Documents works) and do the same thing in your shell of choice (Now that git is installed, I recommend right clicking in the folder and selecting `Git Bash Here`). 
___
In shell, type `git init` which should tell you that a new git repo has been created. Now type `git remote add origin <REPO_URL_HERE>` where _<REPO_URL_HERE>_ is the text you copied earlier. Now type `git pull origin master` and it will download everything in your forked repo onto your machine.
### I'm lost. What the heck is git again?
If you're confused, _DON'T PANIC!_, git is actually really simple. We'll start at the beginning, with the name
> The name "git" was given by Linus Torvalds when he wrote the very first version. He described the tool as "the stupid content tracker" and the name as (depending on your mood):

> - random three-letter combination that is pronounceable, and not actually used by any common UNIX command. The fact that it is a mispronunciation of "get" may or may not be relevant.
> - stupid. contemptible and despicable. simple. Take your pick from the dictionary of slang.
> - "global information tracker": you're in a good mood, and it actually works for you. Angels sing, and a light suddenly fills the room.
> - "goddamn idiotic truckload of sh*t": when it breaks

## Java
### The complicated introduction
According to Wikipedia, [Java][j-w] is a general-purpose computer-programming language that is concurrent, class-based, object-oriented, and specifically designed to have as few implementation dependencies as possible. 
### The simple introduction
Like this [1999 Toyota Corolla], Java isn't the most exciting thing in the world. While it may not be as flashy as Swift or Go, it is very reliable and is not going away any time soon. 
### Onward!
Please head to the [Java Wiki Page] for information that is actually helpful!


[j-w]: https://en.wikipedia.org/wiki/Java_(programming_language)
[1999 Toyota Corolla]: https://www.craigslist.org/about/best/hou/6565526716.html
[Java Wiki Page]: https://github.com/peterpie123/classroom/wiki/Java
[introduction]: #introduction
[git]: https://git-scm.com/
