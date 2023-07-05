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
        create("settingsLibs") {
            version("junit", "5.7.0")
        }
        create("fileLibs") {
            from(files("./gradle/libs.versions.toml"))
        }
    }
}
