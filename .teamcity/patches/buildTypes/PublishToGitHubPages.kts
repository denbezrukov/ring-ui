package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with id = 'PublishToGitHubPages'
accordingly, and delete the patch script.
*/
changeBuildType(RelativeId("PublishToGitHubPages")) {
    params {
        expect {
            param("vcs.branch.spec", """
                +:refs/heads/(master)
                +:refs/heads/(release-1.0)
                +:refs/heads/(storybook-5.2)
            """.trimIndent())
        }
        update {
            param("vcs.branch.spec", """
                +:refs/heads/(master)
                +:refs/heads/(release-4.2)
            """.trimIndent())
        }
    }
}