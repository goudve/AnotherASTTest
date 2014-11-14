AnotherASTTest
==============

Quick project for Groovy mailing list to demonstrate a AST behavior.

Doing "gradle run", prints "greeting is called"

But the following Groovy script prints this: 

Starting greeting
greeting is called
Ending greeting

@WithLogging
static def greeting(){
    println "greeting is called"
}

greeting()

