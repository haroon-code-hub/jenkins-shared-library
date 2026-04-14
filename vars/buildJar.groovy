#!/usr/bin/env groovy

def call() {
    def branchName = env.BRANCH_NAME ?: env.GIT_BRANCH?.replaceFirst('^origin/', '') ?: 'unknown'
    echo "building the application for branch ${branchName}"
    sh 'mvn package'
}
