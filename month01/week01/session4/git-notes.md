# Session 4 - Git Basic Workflow

## What problem Git solves
- Tracks code history
- Allows safe experimentation
- Enables team collaboration

## Core Git idea
- Repository    = project with history
- Commit        = snapshot in time
- Branch        = isolated workspace
- Merge         = combine changes

## Basic workflow
1. git status
2. git add .
3. git commit -m "message"
4. git push

## Essential commands
- git init          -> start repository
- git status        -> check state
- git add .         -> stage changes
- git commit        -> save snapshot
- git log           -> history
- git branch        -> list branches
- git checkout -b   -> create & switch branch
- git merge         -> combine branches

## Branch rules
- main / master     = stable code
- Never commit experiments directly to main
- One task          = one branch

## Pull Request (PR)
- Used to review code before merging
- Enables discussions & approval
- Protects main branch

## Editor not (Nano / Vim)
- Git may open editor during commit
- Save & exit correctly:
    - Nano: Ctrl + 0 -> Enter -> Ctrl + X
    - Vim: Esc -> :wq -> Enter

## Common mistakes
- Forgetting git add
- Committing to main
- Bad commit messages

## My notes
- Git is a safety net - I can experiment freely knowing I can always go back.
- Commits are checkpoints, so clear commit messages really matter.
- Branching keeps work organized & safe, especially before touching main.