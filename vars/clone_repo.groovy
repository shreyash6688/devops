def call(String branch, String repoUrl, String credentialsId) {
    echo "Cloning repo: ${repoUrl} (branch: ${branch})"

    git(
        branch: branch,
        url: repoUrl,
        credentialsId: credentialsId
    )
}
