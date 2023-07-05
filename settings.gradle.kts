rootProject.name = "gradle-version-catalogue-dependabot-example"

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)

    repositories {
        mavenLocal()
        google()
        maven { url = uri("https://maven.google.com") }
        mavenCentral()
    }

    versionCatalogs {
        create("appLibs") {
            version("junit", "5.7.0")
        }
    }
}
