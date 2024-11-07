pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { setUrl("https://jitpack.io")  }
        maven {
            name = "Legion"
            setUrl(settings.extensions.extraProperties.get("legion_repository") as String)
            credentials {
                username = settings.extensions.extraProperties.get("legion_username") as String
                password = settings.extensions.extraProperties.get("legion_password") as String
            }
            authentication {
                create("Basic", BasicAuthentication::class.java)
            }
        }
        maven {
            name = "Gitlab"
            setUrl(settings.extensions.extraProperties.get("coal_repository") as String)
            credentials(HttpHeaderCredentials::class) {
                name = settings.extensions.extraProperties.get("coal_username") as String
                value = settings.extensions.extraProperties.get("coal_password") as String
            }
            authentication {
                create<HttpHeaderAuthentication>("header")
            }
        }
    }
}

rootProject.name = "Coal Demo"
include(":app")
 