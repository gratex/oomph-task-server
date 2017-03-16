#!/bin/bash

set -o errexit

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

NEXT_VERSION=$(git tag -l 1.*.* | sort -t'.' -k3rn -k2rn | head -1 | gawk -F"." '{$NF+=1}{print $0RT}' OFS="." ORS="")

read -p "Release version: " -e -i $NEXT_VERSION VERSION

#if [[ -z $1 ]]; then
#    >&2 echo "Provide release version argument"
#    exit 1
#fi
#VERSION=$1

if [[ -n $(git status --porcelain) ]]; then 
    >&2 echo "Repo is dirty, commit your changes before release"
    exit 1
fi

# build
$DIR/run

git tag $VERSION
git push --tags

pushd $DIR/../oomph-task-server-gh-pages
{
    git reset HEAD --hard
    git clean -dfx
    git pull
    rm -rf repository/*
    cp -r $DIR/com.gratex.oomph.task.server.site/target/repository/* repository/
    git add -A
    git commit -m "release $VERSION"
    git push
} && {
    popd
}

