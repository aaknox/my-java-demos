# Git

Git is a distributed source control management (SCM) system and is one of the most frequently used in the world. Developers use SCM tools to manage the revisions to their code, including a history of all the changes to files, merged changes made by multiple developers, and a built-in system for recovering files. All files are managed in something called as a "repository." What is meant by "distributed" is that a remote server (like the oh-so-popular GitHub) will maintain all the files for a repository. Developers then perform a `clone` of that repository and have their own copy of the repository on their machines. They can then perform any changes needed to the code without tampering the remote copies.

Contrast this to a centralized SCM like Subversion (SVN). In a centralized SCM like SVN, all the code is maintained on a remote server.. no files are stored on the developers' machines.

## Making Changes:

Git automatically tracks changes to any files in the repository. When a developer is ready to push these changes to the remote server they must:

1. Add the files to the index in the working tree `git add <file-name or directory>`
2. Commit the changes to their local repository `git commit -m "message"`
3. Push the changes to the remote repository `git push`

## Branches:

Git allows developers to create branches; an isolated version of the files. Branching is useful when you want to prototype code, write hotfixes, work on new stories, etc. without committing to a stable branch--potentially ruining the integrity of good code. We typically have a `master` branch for production-ready code, a `staging` branch to integrate code before moving it into production, and then various feature branches that developers are tinkering with their own code.

* To create a branch `git branch <name>`
* To switch branches `git checkout <branch-name>`
* To create and switch quickly `git checkout -b <new-branch>`
* To list branches `git branch --list`
* To delete a local branch `git branch -D <branch-name>`

When you create a branch locally, that branch does not exist in the remote server (much like every other kind of local change!). When you first push to a new branch, you must tell Git to assign your local branch to a new upstream branch on the remote server:

`git push -u origin master` (origin is resolved as http://github.com/you/your-repo.. Origin variable is created when you clone a remote repo)

## Pulling Code:

Sometimes other people have pushed code into the same branch as you (especially if you are doing pair programming). You need to get those files onto your local machine by pulling from the remote server.

If you're on the master branch for instance: `git pull origin master`

Or simply `git pull` which pulls from your local branch's upstream branch

## Merging Code:

Let's say you're done with your feature and are ready to move your code into the `staging` branch. Typically in a real workplace, we perform what's called a Pull Request. We got through a manual code review process, then accept the changes into the `staging` branch as a team. However, sometimes code in your feature branch can conflict with existing code in `staging` branch. So, you must always pull changes from the branch you want to merge into first.

`git checkout feature-branch`

`git pull origin staging`

This is where **merge conflicts** can occur. Your branch says (feature|MERGING) and your code isn't merged yet. Don't panic.. Git will place markers within the code to designate where the conflicts are. I like to check exactly what files are causing the merge conflicts with:

`git status`

Next, look into the files listed. You will see something like this:

**Example.java**

```java
public class Example {

<<<<<<<<<<<<<<<<<<<<<<<<<<<<< HEAD

private boolean thereIs;

=================================

private String noConflict;

>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>ajlksdyg287o3gybog1bo8gyu2eogy

}
```

In this example, you made a variable called there Is. You know it's yours because HEAD is the pointer to your current commit (google "git head" if you want to know more about HEAD). Another developer made a variable called as no Conflict. You know it's another commit because ajlksdyg287o3gybog1bo8gyu2eogy is the commit SHA (a unique identifier is created for each and every commit).

What to do? Luckily, you have four choices.. 1 keep only yours, 2 keep only theirs, 3 keep both, 4 remove both. You simply need to fix up the code(s) how you want it, then delete the junk Git made <<HEAD, ===, and >>>SHA. The above example is very primitive and merge conflicts can get more complex.. Luckily Git handles auto-merging simple things like this example. You can also download a tool like TortoiseGit which can perform this automatically using a GUI (https://tortoisegit.org/)

## Preventing Merge Conflicts:

Break up complex applications into multiple files.
Rarely have more than a pair of people working on one file
Have formatting guidelines or use auto-format in your IDE (white space can cause conflicts…)

### Resources:

Learn: https://git-scm.com/about

Practice: https://learngitbranching.js.org/
