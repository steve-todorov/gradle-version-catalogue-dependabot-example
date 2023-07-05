plugins {
    id("java")
}

group = "org.carlspring.hello.world.gradle"
version = "1.0-SNAPSHOT"

dependencies {
    testImplementation(platform("org.junit:junit-bom:${settingsLibs.versions.junit.get()}")) {
        because("This is an example which uses the settings.gradle.kts versions defined directly into the settings.gradle.kts")
    }
    testImplementation("org.assertj:assertj-core:${fileLibs.versions.assertj.get()}")
    //implementation("org.apache.maven.plugins:maven-gpg-plugin:${fileLibs.versions.gpgPlugin.get()}")
}

tasks.test {
    useJUnitPlatform()
}
