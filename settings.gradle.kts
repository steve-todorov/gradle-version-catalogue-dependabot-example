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
            val junitVersion = "5.6.0"
            val assertjDb = "1.1.0"
            version("junit", junitVersion)
            library("org.assertj.assertj-db", "org.assertj:assertj-db:${assertjDb}")
            library("org.assertj.assertj-vavr", "org.assertj", "assertj-db").version("0.4.0") // this does not work in github yet.
        }
        create("fileLibs") {
            from(files("./gradle/libs.versions.toml"))
        }
    }
}
