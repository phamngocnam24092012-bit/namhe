plugins {
    alias(libs.plugins.fabric.loom)
}

base {
    archivesName = providers.gradleProperty("archives_base_name")
}

group = providers.gradleProperty("maven_group").get()
version = providers.gradleProperty("mod_version").get()

repositories {
    maven("https://maven.meteordev.org/releases") { name = "meteor-maven" }
    maven("https://maven.meteordev.org/snapshots") { name = "meteor-maven-snapshots" }
}

dependencies {
    minecraft(libs.minecraft)
    implementation(libs.fabric.loader)
    implementation(libs.meteor.client)
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(25)
    }
}

tasks {
    processResources {
        val modVersion = project.version.toString()
        inputs.property("version", modVersion)
        filesMatching("fabric.mod.json") {
            expand("version" to modVersion)
        }
    }

    withType<JavaCompile> {
        options.encoding = "UTF-8"
        options.release = 25
    }
}
