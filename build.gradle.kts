plugins {
    id("java")
}

group = "org.carlspring.hello.world.gradle"
version = "1.0-SNAPSHOT"

dependencies {
    testImplementation(platform("org.junit:junit-bom:${settingsLibs.versions.junit.get()}")) {
        because("This does not work yet in dependabot.")
    }
    testImplementation(settingsLibs.org.assertj.assertj.db) {
        because("Testing if settingsLib works with dependabot.")
    }
    testImplementation(settingsLibs.org.assertj.assertj.vavr) {
        because("Testing if settingsLib works with dependabot.")
    }
    testImplementation(fileLibs.assertj.core)

    // this does not work:
    //implementation("org.apache.maven.plugins:maven-gpg-plugin:${fileLibs.versions.gpgPlugin.get()}")
}

tasks.test {
    useJUnitPlatform()
}
