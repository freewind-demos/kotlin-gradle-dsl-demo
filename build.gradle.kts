plugins {
    kotlin("jvm") version "1.2.51"
}

dependencies {
    compile(kotlin("stdlib"))
    compile("org.apache.commons:commons-lang3:3.7")
    compile("commons-io:commons-io:2.6")
    testCompile(kotlin("test-junit"))
    testCompile("junit:junit:4.11")
    testCompile("org.assertj:assertj-core:3.9.0")
}

repositories {
    mavenLocal()
    jcenter()
}
