OWASP ZAP Zest
============

Zest is a specialized scripting language (initially) developed by the Mozilla security team and is intended to be used in 
web orientated security tools.

first
second
third
fourth
fifth

It is completely free, open source and can be included in any tool whether open or closed, free or commercial.

Version 1 of Zest:
* Is aimed at creating scripts for reproducing basic security vulnerabilities
* Includes a java reference implementation
* Has been included in a proof-of-concept OWASP ZAP add-on

For more details see the wiki: https://github.com/zaproxy/zest/wiki

## How to Obtain

If using a dependency management tool, for example [Maven](https://maven.apache.org/) or [Gradle](https://gradle.org/), the
`zest` library can be obtained from [Maven Central](https://search.maven.org/) with following coordinates:

 * GroupId: `org.zaproxy`
 * ArtifactId: `zest`

## Building

The project uses Gradle to build, for example, running:

    ./gradlew build

in the main directory of the project will build the library, located under `build/libs`, and create a standalone command line
application (library + dependencies), located under `build/distributions/`.
