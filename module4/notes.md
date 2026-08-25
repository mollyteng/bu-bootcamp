Git and version control

- Feature branch workflow

`git checkout -b feature/contact-manager`

- Commit message
Add, Fix, Remove, Update, Refactor
50-character rule

- Useful git commands

`git status`

Shows what has changed since the last commit

Before any add or commit

`git add <file>`

Stages a specific file for the next commit

After editing files you want to commit 

`git add .`

Stages all changed files in the current folder

When you want to commit everything

`git commit -m "msg"`

Saves a snapshot with a message

After staging the right files

`git push`

Sends local commits to GitHub

After committing, to back up and share 

`git pull`

Gets new commits from GitHub to your machine

Before starting new work; after others push 

`git log`

Shows the commit history

To review what changed and when

`git log --oneline`

Compact one line view of history

Quick overview of recent commits

`git diff`

Shows unstaged changes line by line

Before staging, to review your edits

`git branch`

Lists all branches

To see what branches exist

`git checkout -b name`

Creates and switches to a new branch

When starting a new feature or fix

`git checkout main`

Switches back to the main branch

After finishing work on a branch

`git merge <branch>`

Merges a branch into the current branch

After completing work on a feature branch

`git clone <url>`

Copies a GitHub repository to your machine

Once, when first setting up a project


