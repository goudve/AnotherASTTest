/**
 * Created by vgoud on 11/14/14.
 */
class ASTTest {
    @WithLogging
    static def greeting(){
        println "greeting is called"
    }

    static void main(String[] args){
        ASTTest.greeting()
    }
}
