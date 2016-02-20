# Installation Steps
Make sure you have the following set up in order to be able to build and test the source code.

 * Java Development Kit (JDK) >= 1.6
 * SBT or an IDE with Scala plugin (Eclipse, IntelliJ, Netbeans). To setup SBT you can either:
    * (preferred method) On UNIX systems run `get_sbt.sh` once which will download an SBT launcher shell script.
     Afterwards run `./sbt` script which in turn will download SBT launcher JAR and start SBT. The JAR is
     downloaded only once.
    * Install [SBT](http://www.scala-sbt.org/0.12.4/docs/Getting-Started/Setup.html) according to instructions.
    * Import the project into an IDE with Scala support.

# Running
You can build the project and run tests with either SBT or an IDE of your choice.

## Build with SBT
SBT is a build tool similar to Maven that downloads source code dependencies, compiles code, runs tests,
generates scaladocs, and produces executables.

Start up SBT from OS shell:

    > sbt

or if it's not on PATH:

    > ./sbt

In SBT shell type (note semicolons):

    ;clean; test

You can also run it as a single command from OS shell:

    > sbt clean test doc

This will run all tests and generate documentation.
    
Look at the output in SBT console to find where docs go and to see if tests pass.

## Build with an IDE
IntelliJ IDEA has Scala plugin that understands SBT projects natively. Use "Import Project" from the
Menu with "Use auto-import" option selected.
You can afterwards run tests in a regular way (right click, run).
